package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x1b implements hk90 {
    public final /* synthetic */ byte a;
    public final String b;
    public final yd91 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final m381 h;

    public x1b(yqg yqgVar, bpb1 bpb1Var, String str, jxp jxpVar, iyc0 iyc0Var, koc0 koc0Var, jxp jxpVar2) {
        this.a = (byte) 1;
        this.d = yqgVar;
        this.b = str;
        this.e = jxpVar;
        this.f = new ypg0(kch1.a, bpb1Var);
        this.g = new rwj(str, iyc0Var, koc0Var, jxpVar2);
        this.c = new yd91(3, new dch1(this, (byte) 1));
        this.h = new ptf1(this);
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.h;
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public x1b(String str, koc0 koc0Var, me30 me30Var, v2p v2pVar, nfa0 nfa0Var) {
        this.a = (byte) 0;
        this.b = str;
        this.d = koc0Var;
        this.e = me30Var;
        this.f = v2pVar;
        this.g = nfa0Var;
        this.c = new yd91(3, new vv8(this, (byte) 17));
        t1b t1bVar = new t1b(this, (byte) 0);
        n381 n381Var = p381.a;
        this.h = new n381(t1bVar);
    }
}
