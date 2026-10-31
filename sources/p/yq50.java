package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yq50 extends tn21 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yq50(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return -1L;
            default:
                return ((rhc) this.b).d();
        }
    }

    public final r8i0 b() {
        switch (this.a) {
            case 0:
                return ((tn21) this.b).b();
            default:
                return null;
        }
    }

    public final void d(fbc fbcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                df01 df01VarF = sj1.f(new ar50(fbcVar));
                ((tn21) obj).d(df01VarF);
                df01VarF.close();
                break;
            default:
                fbcVar.T0((rhc) obj);
                break;
        }
    }
}
