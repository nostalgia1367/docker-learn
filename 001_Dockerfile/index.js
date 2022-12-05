// server.js 파일
const express = require('express');

const PORT = 3100;

// APP
const app = express();
app.get('/', (req, res) => {
	res.send('Hello~ root');
});

app.listen(PORT);
console.log('Hello World', PORT);
