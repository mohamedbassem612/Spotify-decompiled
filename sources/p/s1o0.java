package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s1o0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t1o0 b;

    public /* synthetic */ s1o0(t1o0 t1o0Var, byte b) {
        this.a = b;
        this.b = t1o0Var;
    }

    public final void run() {
        byte b = this.a;
        g4o0 g4o0Var = g4o0.c;
        t1o0 t1o0Var = this.b;
        switch (b) {
            case 0:
                l1o0 l1o0Var = t1o0Var.f;
                if (l1o0Var != null) {
                    l1o0Var.b1(g4o0.a);
                    return;
                } else {
                    u890.C("view");
                    throw null;
                }
            case 1:
                l1o0 l1o0Var2 = t1o0Var.f;
                if (l1o0Var2 != null) {
                    l1o0Var2.b1(g4o0Var);
                    return;
                } else {
                    u890.C("view");
                    throw null;
                }
            case 2:
                l1o0 l1o0Var3 = t1o0Var.f;
                if (l1o0Var3 != null) {
                    l1o0Var3.b1(g4o0Var);
                    return;
                } else {
                    u890.C("view");
                    throw null;
                }
            case 3:
                t1o0Var.a(false);
                return;
            case 4:
                l1o0 l1o0Var4 = t1o0Var.f;
                if (l1o0Var4 != null) {
                    l1o0Var4.b1(g4o0Var);
                    return;
                } else {
                    u890.C("view");
                    throw null;
                }
            case 5:
                l1o0 l1o0Var5 = t1o0Var.f;
                if (l1o0Var5 != null) {
                    l1o0Var5.b1(g4o0.b);
                    return;
                } else {
                    u890.C("view");
                    throw null;
                }
            default:
                t1o0Var.h = w1o0.c;
                l1o0 l1o0Var6 = t1o0Var.f;
                if (l1o0Var6 != null) {
                    l1o0Var6.c1();
                    return;
                } else {
                    u890.C("view");
                    throw null;
                }
        }
    }
}
