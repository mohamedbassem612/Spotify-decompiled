package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v0z implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w0z b;

    public /* synthetic */ v0z(w0z w0zVar, byte b) {
        this.a = b;
        this.b = w0zVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        w0z w0zVar = this.b;
        switch (b) {
            case 0:
                ajn0 ajn0Var = (ajn0) obj;
                if (ajn0Var != null) {
                    return w0zVar.j(ajn0Var, w0zVar.i().c(ajn0Var, 16));
                }
                w0z.h(8);
                throw null;
            default:
                ajn0 ajn0Var2 = (ajn0) obj;
                if (ajn0Var2 != null) {
                    return w0zVar.j(ajn0Var2, w0zVar.i().a(ajn0Var2, 16));
                }
                w0z.h(4);
                throw null;
        }
    }
}
