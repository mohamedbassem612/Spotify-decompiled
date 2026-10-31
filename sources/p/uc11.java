package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.musicappplatform.bottomsheet.compose.ReflectionBasedDragHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uc11 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ReflectionBasedDragHandler b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc11(ReflectionBasedDragHandler reflectionBasedDragHandler, byte b) {
        super(0);
        this.a = b;
        this.b = reflectionBasedDragHandler;
    }

    public final Object invoke() {
        mmr0 mmr0Var;
        byte b = this.a;
        ReflectionBasedDragHandler reflectionBasedDragHandler = this.b;
        switch (b) {
            case 0:
                try {
                    kma0 anchoredDraggableStateField = reflectionBasedDragHandler.getAnchoredDraggableStateField();
                    if (anchoredDraggableStateField != null) {
                        return anchoredDraggableStateField.get(reflectionBasedDragHandler.sheetState);
                    }
                    return null;
                } catch (Exception e) {
                    Logger.e(e, "Error accessing anchoredDraggableState via reflection", new Object[0]);
                    return null;
                }
            case 1:
                Object cachedAnchoredDraggableState = reflectionBasedDragHandler.getCachedAnchoredDraggableState();
                nla0 nla0VarP = cachedAnchoredDraggableState != null ? c2p1.p(cachedAnchoredDraggableState, "dispatchRawDelta") : null;
                if (nla0VarP == null) {
                    return null;
                }
                if (reflectionBasedDragHandler.getCachedAnchoredDraggableState() == null) {
                    Logger.d("Could not access dispatchRawDelta via reflection", new Object[0]);
                    mmr0Var = null;
                } else {
                    Object cachedAnchoredDraggableState2 = reflectionBasedDragHandler.getCachedAnchoredDraggableState();
                    cachedAnchoredDraggableState2.getClass();
                    mmr0Var = new mmr0(cachedAnchoredDraggableState2, nla0VarP);
                }
                if (mmr0Var == null) {
                    return null;
                }
                return mmr0Var;
            case 2:
                Object cachedAnchoredDraggableState3 = reflectionBasedDragHandler.getCachedAnchoredDraggableState();
                if (cachedAnchoredDraggableState3 == null) {
                    return null;
                }
                kma0 kma0VarQ = c2p1.q(cachedAnchoredDraggableState3, "anchors");
                Object obj = kma0VarQ != null ? kma0VarQ.get(cachedAnchoredDraggableState3) : null;
                nla0 nla0VarP2 = obj != null ? c2p1.p(obj, "minAnchor") : null;
                if (obj != null && nla0VarP2 != null) {
                    return new mmr0(obj, nla0VarP2);
                }
                Logger.d("Could not access anchors or minAnchor via reflection", new Object[0]);
                return null;
            default:
                return c2p1.p(reflectionBasedDragHandler.sheetState, "settle");
        }
    }
}
