package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class awu extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ i1z b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awu(boolean z, i1z i1zVar) {
        super(1);
        this.a = z;
        this.b = i1zVar;
    }

    public final Object invoke(Object obj) {
        q2l0 q2l0Var = (q2l0) obj;
        boolean z = this.a;
        String strG = this.b.g();
        return z ? q2l0Var.h(strG) : q2l0Var.e(strG);
    }
}
