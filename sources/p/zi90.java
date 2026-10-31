package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zi90 {
    public final lik1 a;
    public final c8c0 b;
    public final n6r0 c;
    public final k781 d;
    public final ssf1 e;
    public final a6z f;
    public final mp8 g;
    public final vgm h;
    public final xi90 i;
    public final waz0 j;
    public final idd1 k;

    public zi90(lik1 lik1Var, c8c0 c8c0Var, n6r0 n6r0Var, k781 k781Var, ssf1 ssf1Var, a6z a6zVar, zma0 zma0Var, mp8 mp8Var, vgm vgmVar, i4q i4qVar, xi90 xi90Var, waz0 waz0Var) {
        this.a = lik1Var;
        this.b = c8c0Var;
        this.c = n6r0Var;
        this.d = k781Var;
        this.e = ssf1Var;
        this.f = a6zVar;
        this.g = mp8Var;
        this.h = vgmVar;
        this.i = xi90Var;
        this.j = waz0Var;
        this.k = new idd1(new x680(i4qVar, this, (byte) 11));
    }

    public final boolean a(kby kbyVar) {
        wls0 wls0Var;
        Boolean bool = this.i.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = kbyVar != null ? kbyVar.p : null;
        if (kbyVar == null || (wls0Var = kbyVar.v) == null) {
            wls0Var = wls0.b;
        }
        return this.g.d(str, wls0Var);
    }
}
