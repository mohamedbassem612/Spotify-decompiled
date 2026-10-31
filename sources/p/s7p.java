package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s7p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ s7p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final wet a(zob1 zob1Var, boolean z) {
        byte b = this.a;
        d7p d7pVar = this.b;
        switch (b) {
            case 0:
                a4v0 a4v0Var = ((htk) ((t7p) d7pVar.c).b).j;
                c8o.l(a4v0Var);
                return new wet(a4v0Var, zob1Var, z);
            case 1:
                a4v0 a4v0Var2 = ((eto) ((f0a) d7pVar.c).b).e;
                c8o.l(a4v0Var2);
                return new wet(a4v0Var2, zob1Var, z);
            default:
                return new wet(((nap) d7pVar.c).c0, zob1Var, z);
        }
    }
}
