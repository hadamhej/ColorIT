(window.webpackJsonp=window.webpackJsonp||[]).push([[6],{335:function(t,r,e){"use strict";Object.defineProperty(r,"__esModule",{value:!0});var n=e(336);r.generateFromString=n.generateFromString},336:function(t,r,e){"use strict";var n=this&&this.__spreadArrays||function(){for(var s=0,i=0,t=arguments.length;i<t;i++)s+=arguments[i].length;var r=Array(s),e=0;for(i=0;i<t;i++)for(var a=arguments[i],n=0,o=a.length;n<o;n++,e++)r[e]=a[n];return r};Object.defineProperty(r,"__esModule",{value:!0});var o=e(337);function c(t){var r=parseInt(t,16);return(r>>16&255)+","+(r>>8&255)+","+(255&r)}function l(t){return(16777215^Number("0x1"+t)).toString(16).substr(1).toUpperCase()}function f(t,r,e){var n=300-t;return"m 150 "+(100+r+200*e)+" Q "+n+" "+t+" "+(200-r-200*e)+" 150 Q "+n+" "+n+" 150 "+(200-r-200*e)+" Q "+t+" "+n+" "+(100+r+200*e)+" 150 Q "+t+" "+t+" 150 "+(100+r+200*e)+" z"}r.invertHex=l,r.generatePath=f,r.generateFromString=function(t){var r=o.md5(t).split("").filter((function(t){return"-"!==t})),e=r.splice(0,6).join(""),v=r.splice(r.length-6,r.length).join(""),h=n(Array(10)).map((function(){return parseInt(r.splice(0,2).join(""),16)}));return function(data){return'<svg width="300" height="300" viewBox="0 0 300 300" xmlns="http://www.w3.org/2000/svg"><rect id="bg" width="300" height="300" fill="rgb('+c(data.background)+')" /><path d="'+data.paths[0]+'" fill="rgb('+c(data.colors[0])+')" /><path d="'+data.paths[1]+'" fill="rgb('+c(data.colors[1])+')" /><path d="'+data.paths[2]+'" fill="rgb('+c(data.colors[2])+')" /></svg>'}({paths:[f(h[0],h[1],2),f(h[2],h[3],1),f(h[4],h[5],0)],colors:[v,l(v),l(e)],background:e})}},337:function(t,r,e){"use strict";function n(t,r){var a=t[0],b=t[1],e=t[2],n=t[3];a=c(a,b,e,n,r[0],7,-680876936),n=c(n,a,b,e,r[1],12,-389564586),e=c(e,n,a,b,r[2],17,606105819),b=c(b,e,n,a,r[3],22,-1044525330),a=c(a,b,e,n,r[4],7,-176418897),n=c(n,a,b,e,r[5],12,1200080426),e=c(e,n,a,b,r[6],17,-1473231341),b=c(b,e,n,a,r[7],22,-45705983),a=c(a,b,e,n,r[8],7,1770035416),n=c(n,a,b,e,r[9],12,-1958414417),e=c(e,n,a,b,r[10],17,-42063),b=c(b,e,n,a,r[11],22,-1990404162),a=c(a,b,e,n,r[12],7,1804603682),n=c(n,a,b,e,r[13],12,-40341101),e=c(e,n,a,b,r[14],17,-1502002290),a=l(a,b=c(b,e,n,a,r[15],22,1236535329),e,n,r[1],5,-165796510),n=l(n,a,b,e,r[6],9,-1069501632),e=l(e,n,a,b,r[11],14,643717713),b=l(b,e,n,a,r[0],20,-373897302),a=l(a,b,e,n,r[5],5,-701558691),n=l(n,a,b,e,r[10],9,38016083),e=l(e,n,a,b,r[15],14,-660478335),b=l(b,e,n,a,r[4],20,-405537848),a=l(a,b,e,n,r[9],5,568446438),n=l(n,a,b,e,r[14],9,-1019803690),e=l(e,n,a,b,r[3],14,-187363961),b=l(b,e,n,a,r[8],20,1163531501),a=l(a,b,e,n,r[13],5,-1444681467),n=l(n,a,b,e,r[2],9,-51403784),e=l(e,n,a,b,r[7],14,1735328473),a=f(a,b=l(b,e,n,a,r[12],20,-1926607734),e,n,r[5],4,-378558),n=f(n,a,b,e,r[8],11,-2022574463),e=f(e,n,a,b,r[11],16,1839030562),b=f(b,e,n,a,r[14],23,-35309556),a=f(a,b,e,n,r[1],4,-1530992060),n=f(n,a,b,e,r[4],11,1272893353),e=f(e,n,a,b,r[7],16,-155497632),b=f(b,e,n,a,r[10],23,-1094730640),a=f(a,b,e,n,r[13],4,681279174),n=f(n,a,b,e,r[0],11,-358537222),e=f(e,n,a,b,r[3],16,-722521979),b=f(b,e,n,a,r[6],23,76029189),a=f(a,b,e,n,r[9],4,-640364487),n=f(n,a,b,e,r[12],11,-421815835),e=f(e,n,a,b,r[15],16,530742520),a=v(a,b=f(b,e,n,a,r[2],23,-995338651),e,n,r[0],6,-198630844),n=v(n,a,b,e,r[7],10,1126891415),e=v(e,n,a,b,r[14],15,-1416354905),b=v(b,e,n,a,r[5],21,-57434055),a=v(a,b,e,n,r[12],6,1700485571),n=v(n,a,b,e,r[3],10,-1894986606),e=v(e,n,a,b,r[10],15,-1051523),b=v(b,e,n,a,r[1],21,-2054922799),a=v(a,b,e,n,r[8],6,1873313359),n=v(n,a,b,e,r[15],10,-30611744),e=v(e,n,a,b,r[6],15,-1560198380),b=v(b,e,n,a,r[13],21,1309151649),a=v(a,b,e,n,r[4],6,-145523070),n=v(n,a,b,e,r[11],10,-1120210379),e=v(e,n,a,b,r[2],15,718787259),b=v(b,e,n,a,r[9],21,-343485551),t[0]=_(a,t[0]),t[1]=_(b,t[1]),t[2]=_(e,t[2]),t[3]=_(n,t[3])}function o(q,a,b,t,s,r){return a=_(_(a,q),_(t,r)),_(a<<s|a>>>32-s,b)}function c(a,b,t,r,e,s,n){return o(b&t|~b&r,a,b,e,s,n)}function l(a,b,t,r,e,s,n){return o(b&r|t&~r,a,b,e,s,n)}function f(a,b,t,r,e,s,n){return o(b^t^r,a,b,e,s,n)}function v(a,b,t,r,e,s,n){return o(t^(b|~r),a,b,e,s,n)}function h(s){for(var t=[],i=0;i<64;i+=4)t[i>>2]=s.charCodeAt(i)+(s.charCodeAt(i+1)<<8)+(s.charCodeAt(i+2)<<16)+(s.charCodeAt(i+3)<<24);return t}Object.defineProperty(r,"__esModule",{value:!0});var m="0123456789abcdef".split("");function d(t){for(var s="",r=0;r<4;r++)s+=m[t>>8*r+4&15]+m[t>>8*r&15];return s}function _(a,b){return a+b&4294967295}r.md5=function(s){return function(t){for(var r=[],i=0;i<t.length;i++)r[i]=d(t[i]);return r.join("")}(function(s){var i,t=s.length,r=[1732584193,-271733879,-1732584194,271733878];for(i=64;i<=s.length;i+=64)n(r,h(s.substring(i-64,i)));s=s.substring(i-64);var e=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];for(i=0;i<s.length;i++)e[i>>2]|=s.charCodeAt(i)<<(i%4<<3);if(e[i>>2]|=128<<(i%4<<3),i>55)for(n(r,e),i=0;i<16;i++)e[i]=0;return e[14]=8*t,n(r,e),r}(s))}},342:function(t,r,e){"use strict";e.r(r);var n=e(335),o={computed:{team:function(){return this.$store.getters["projects/getTeam"]}},methods:{generateAvatar:function(t){return t?Object(n.generateFromString)(t):null}}},c=e(8),component=Object(c.a)(o,(function(){var t=this,r=t.$createElement,e=t._self._c||r;return e("main",{staticClass:"teamPage"},[e("div",{staticClass:"container"},[e("h1",[t._v("Team")]),t._v(" "),e("div",{staticClass:"teamList"},t._l(t.team,(function(r){return e("div",{key:r.email,staticClass:"teamMember"},[e("img",{attrs:{src:"data:image/svg+xml;utf8,"+t.generateAvatar(r.email),alt:r.name}}),t._v(" "),e("div",{staticClass:"name"},[t._v(t._s(r.name))]),t._v(" "),e("a",{staticClass:"email",attrs:{href:"mailto:"+r.email}},[t._v(t._s(r.email))])])})),0)])])}),[],!1,null,null,null);r.default=component.exports}}]);