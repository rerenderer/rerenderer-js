# rerenderer-js [WIP]

JS binding for rerenderer.

## Example

```javascript
import {init, Rectangle} from "rerenderer";

function root(state) {
    return <Rectangle width="500"
                      height="500"
                      color={[255, 255, 0, 0]}>
        <Rectangle width="100"
                   height="100"
                   x="250"
                   y="250"
                   color={[255, 0, 255, 0]}/>
        <Rectangle width="150"
                   height="150"
                   x="50"
                   y="300"
                   color={[255, 0, 0, 255]}/>
    </Rectangle>;
}

init({
    rootView: root,
    canvas: document.getElementById("canvas"),
    state: {}
});
```
