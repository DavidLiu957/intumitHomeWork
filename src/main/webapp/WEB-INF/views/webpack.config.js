module.exports = {
    entry: './index.js',
    devServer: {
        port: 8080,
        host: '0.0.0.0',
        open: true,
        inline: true,
        hot: true,
        disableHostCheck: true,
        proxy: {
            '/intumit/hello/initQuery': {
                target: 'http://localhost:7921',
                ws: false,
                changeOrigin: true,
                pathRewrite: { '^/intumit/hello/initQuery': '' }
            }
        }
    }
}