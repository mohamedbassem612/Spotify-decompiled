package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xq50 extends tn21 {
    public final /* synthetic */ byte a;
    public final tn21 b;
    public final Object c;

    public /* synthetic */ xq50(tn21 tn21Var, Object obj, byte b) {
        this.a = b;
        this.b = tn21Var;
        this.c = obj;
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return ((nac) this.c).b;
            default:
                return this.b.a();
        }
    }

    public final r8i0 b() {
        switch (this.a) {
            case 0:
                return ((tn21) ((yq50) this.b).b).b();
            default:
                return (r8i0) this.c;
        }
    }

    public final void d(fbc fbcVar) {
        switch (this.a) {
            case 0:
                fbcVar.T0(((nac) this.c).J());
                break;
            default:
                this.b.d(fbcVar);
                break;
        }
    }
}
