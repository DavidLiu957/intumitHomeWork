$( '#logInBtn' ).on( 'click', function ( e )
{
  e.preventDefault();
  logIn();
} );

$( '.goBtn' ).on( 'click', function ( e )
{
  var badge = $( e.target ).children()[0];
  if ( !badge ) {
    e.target.innerHTML = parseInt( e.target.innerHTML, 10 ) + 1;
    return;
  }
  badge.innerHTML = parseInt( badge.innerHTML, 10 ) + 1;
} );

function loadingOn ()
{
  $( '.loading' ).fadeIn();
}
function loadingOff ()
{
  $( '.loading' ).fadeOut();
}

function logIn ()
{
  var emailOK = 'ok@example.com';
  var pwOK = 'a1234';

  var email = $( '#email' ).val();
  var pw = $( '#password' ).val();

  if ( !email || !pw ) {
    $( '#popInfo' ).html( 'email or pw is empty!' );
    $( '#myModal' ).modal( 'show' );
    return;
  }

  loadingOn();

  // 模擬發 request 到 server 端驗證使用者資料
  setTimeout( function ()
  {
    loadingOff();

    if ( email !== emailOK || pw !== pwOK ) {
      $( '#popInfo' ).html( 'Email or PW is incorrect' );
      $( '#myModal' ).modal( 'show' );
      return;
    }

    $( '#popInfo' ).html( 'You are Login Successfully !' );
    $( '#myModal' ).modal( 'show' );
    logInSuccessHandler( email );
  }, 1000 );
}

function logInSuccessHandler ( email )
{
  $( '#username' ).html( email );
  $( '#signUpLink' ).fadeOut();
  $( '#logInLink' ).fadeOut();
  $( '#vip' ).removeClass( 'disabled' );
  setTimeout( () =>
  {
    $( '.toast' ).toast( 'show' );
  }, 4000 );
}
