package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class am6 implements shh0 {
    public final ynb0 a;

    public am6(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    @Override // p.shh0
    public final boolean a(r9c r9cVar) {
        String strE = r9cVar.e();
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(strE).c;
        return blc0Var == blc0.ARTIST || blc0Var == blc0.COLLECTION_ARTIST;
    }

    @Override // p.shh0
    public final rhh0 b() {
        return (rhh0) this.a.get();
    }
}
