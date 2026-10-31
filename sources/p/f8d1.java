package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class f8d1 {
    public static final bav0 a = new bav0(z6x.a, null);

    public static final j8d1 a(PointerInputEventHandler pointerInputEventHandler) {
        return new j8d1(null, null, null, pointerInputEventHandler);
    }

    public static final qim0 b(qim0 qim0Var, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return qim0Var.then(new b8d1(obj, null, null, pointerInputEventHandler, 6));
    }

    public static final qim0 c(qim0 qim0Var, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return qim0Var.then(new b8d1(obj, obj2, null, pointerInputEventHandler, 4));
    }
}
