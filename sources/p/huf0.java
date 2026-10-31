package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class huf0 implements f4h1, ihr0 {
    public final p4h1 a;
    public final o4h1 b;

    public huf0(p4h1 p4h1Var, o4h1 o4h1Var) {
        this.a = p4h1Var;
        this.b = o4h1Var;
    }

    public final boolean b(ehr0 ehr0Var) {
        ihr0 ihr0Var = this.a;
        ihr0 ihr0Var2 = ihr0Var instanceof ihr0 ? ihr0Var : null;
        if (ihr0Var2 != null) {
            return ihr0Var2.b(ehr0Var);
        }
        return false;
    }

    public final Object getView() {
        return this.a.a();
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        this.a.getClass();
        bundle.putBundle("view_bundle", null);
        this.b.getClass();
        bundle.putBundle("presenter_bundle", null);
        return bundle;
    }

    public final void start() {
        this.b.start();
    }

    public final void stop() {
        this.b.stop();
    }
}
