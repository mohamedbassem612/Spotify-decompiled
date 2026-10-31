package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class trt implements bh0 {
    public final /* synthetic */ urt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wrt c;

    public trt(urt urtVar, int i, wrt wrtVar) {
        this.a = urtVar;
        this.b = i;
        this.c = wrtVar;
    }

    public final void a(Object obj) {
        urt urtVar = this.a;
        dg30 dg30Var = urtVar.a;
        int iJ = x74.j(dg30Var, "android.permission.ACCESS_FINE_LOCATION");
        wrt wrtVar = this.c;
        if (iJ != 0 && x74.j(dg30Var, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            urtVar.f(wrtVar);
        } else {
            urtVar.c.d(urtVar.c(), this.b, urtVar.a());
            wrtVar.invoke(Boolean.TRUE);
        }
    }
}
