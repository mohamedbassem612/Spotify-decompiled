package p;

import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m8h1 {
    public final k690 a;

    public m8h1(k690 k690Var) {
        this.a = k690Var;
    }

    public final void a(q6h1 q6h1Var) {
        if (!((Boolean) this.a.invoke()).booleanValue() || u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        n57.s("UBI API is called from the background thread!!! " + q6h1Var);
    }
}
