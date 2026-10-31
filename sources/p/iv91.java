package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class iv91 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cv30 b;

    public /* synthetic */ iv91(cv30 cv30Var, byte b) {
        this.a = b;
        this.b = cv30Var;
    }

    public final void a() {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) iu30Var;
                synchronized (pv91.c) {
                    pv91.h = o7h.J0(pv91.h, vu30Var);
                }
                return;
            default:
                iu30 iu30Var2 = iu30Var;
                synchronized (pv91.c) {
                    pv91.i = o7h.J0(pv91.i, iu30Var2);
                }
                pv91.c();
                return;
        }
    }
}
