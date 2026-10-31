package p;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h9i1 extends g5 {
    public final bpb1 a;
    public final xe01 b;

    public h9i1() {
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, new WeakReference(activity)));
    }
}
