goog.require('rerenderer.primitives');
goog.require('rerenderer_js.core');

export const Rectangle = rerenderer_js.core.wrap(rerenderer.primitives.Rectangle);
export const Text = rerenderer_js.core.wrap(rerenderer.primitives.Text);
export const Image = rerenderer_js.core.wrap(rerenderer.primitives.Image);
export const component = rerenderer_js.core.component;
export const init = rerenderer_js.core.init;
