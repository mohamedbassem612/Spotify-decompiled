package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s2i0 extends njm1 {
    public final /* synthetic */ w6e0 Y;
    public final /* synthetic */ m0u0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2i0(akx0 akx0Var, w6e0 w6e0Var, m0u0 m0u0Var) {
        super(akx0Var);
        this.Y = w6e0Var;
        this.Z = m0u0Var;
    }

    @Override // p.h2k, p.qba
    public final void w() {
        super.w();
        iz10 iz10Var = (iz10) ((yqu0) this.Y.b).c;
        m0u0 m0u0Var = this.Z;
        f520 f520Var = (f520) iz10Var.b.remove(m0u0Var.d);
        if (f520Var != null) {
            String str = m0u0Var.a.a;
            f520Var.a();
        }
    }
}
