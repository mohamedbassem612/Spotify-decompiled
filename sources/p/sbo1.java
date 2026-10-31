package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sbo1 extends san1 {
    public final /* synthetic */ xaa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbo1(xaa xaaVar, int i, Bundle bundle) {
        super(xaaVar, i, bundle);
        this.g = xaaVar;
    }

    @Override // p.san1
    public final boolean a() {
        this.g.j.g(lal.f);
        return true;
    }

    @Override // p.san1
    public final void b(lal lalVar) {
        xaa xaaVar = this.g;
        xaaVar.j.g(lalVar);
        xaaVar.w(lalVar);
    }
}
