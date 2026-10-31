package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class emo0 implements rqw {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i7h1 b;

    public emo0(n6r0 n6r0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new i7h1(new u430(n6r0Var, (byte) 2), vp51.a1);
                break;
            default:
                this.b = new i7h1(new u430(n6r0Var, (byte) 1), n3o0.R0);
                break;
        }
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        byte b = this.a;
        i7h1 i7h1Var = this.b;
        switch (b) {
            case 0:
                return i7h1Var.b((wlo0) obj, (bmo0) obj2, (ulo0) obj3, op80Var);
            default:
                return i7h1Var.b((cp11) obj, (ep61) obj2, (dp61) obj3, op80Var);
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        i7h1 i7h1Var = this.b;
        switch (b) {
            case 0:
                return i7h1Var.c((wlo0) obj, (bmo0) obj2, op80Var);
            default:
                return i7h1Var.c((cp11) obj, (ep61) obj2, op80Var);
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        i7h1 i7h1Var = this.b;
        switch (b) {
            case 0:
                return i7h1Var.d((wlo0) obj, (bmo0) obj2, op80Var);
            default:
                return i7h1Var.d((cp11) obj, (ep61) obj2, op80Var);
        }
    }
}
