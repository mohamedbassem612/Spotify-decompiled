package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class psb0 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nsb0 b;

    public /* synthetic */ psb0(nsb0 nsb0Var, byte b) {
        this.a = b;
        this.b = nsb0Var;
    }

    public final void dispose() {
        byte b = this.a;
        nsb0 nsb0Var = this.b;
        switch (b) {
            case 0:
                nsb0Var.f = true;
                nsb0Var.d = 0;
                nsb0Var.b.a.remove(nsb0Var);
                nsb0 nsb0Var2 = nsb0Var.e;
                if (nsb0Var2 != null) {
                    nsb0Var2.b();
                }
                nsb0Var.e = null;
                break;
            default:
                if (nsb0Var != null) {
                    nsb0Var.b();
                }
                break;
        }
    }
}
