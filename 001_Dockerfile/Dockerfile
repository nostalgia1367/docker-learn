FROM node:16.17.0

WORKDIR /usr/src/app

COPY package.json ./

RUN npm install
RUN npm install express

COPY ./ ./

EXPOSE 3100 3000

CMD ["node", "index.js"]