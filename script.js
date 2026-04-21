// Fix mobile 100vh issue
function setVH() {
    let vh = window.innerHeight * 0.01;
    document.documentElement.style.setProperty('--vh', `${vh}px`);
}

setVH();
window.addEventListener('resize', setVH);

// Dummy chatbot function
function openChat() {
    alert("Chatbot coming soon!");
}