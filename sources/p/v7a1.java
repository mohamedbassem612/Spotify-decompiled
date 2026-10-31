package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v7a1 implements xpw {
    public static final Map g = sqg0.J(new mmr0[]{new mmr0(t7a1.a, f46.S0(new zp21[]{new zp21(jo70.class), new zp21(xkk1.class), new zp21(f7a1.class)})), new mmr0(t7a1.b, f46.S0(new yp21[]{new yp21(xkk1.class), new yp21(jo70.class)})), new mmr0(t7a1.c, f46.S0(new zp21[]{new zp21(jo70.class), new zp21(xkk1.class)}))});
    public final gw70 a;
    public final ojm b;
    public final epb1 c;
    public final poy0 d = f2p1.p(new u7a1(this, 0), new d061(1, this, v7a1.class, "defaultState", "defaultState(Lcom/spotify/songdna/elements/songdnaentrypointelement/SongDNAEntrypoint$Props;)Lcom/spotify/songdna/elements/songdnaentrypointelement/impl/SongDNAEntrypointState;", 0, 19), new nsm0(2, this, v7a1.class, "stateMapper", "stateMapper(Lcom/spotify/songdna/elements/songdnaentrypointelement/SongDNAEntrypoint$Props;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Lcom/spotify/songdna/elements/songdnaentrypointelement/impl/SongDNAEntrypointState;", 0, (byte) 29), new u7a1(this, 1), 8);
    public final ia00 e = n3o1.q(this).a(v691.b1, v691.c1);
    public final psw f;

    public v7a1(gw70 gw70Var, ojm ojmVar, epb1 epb1Var) {
        this.a = gw70Var;
        this.b = ojmVar;
        this.c = epb1Var;
        j2i j2iVar = new j2i(1139351371, new u491(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public static ez00 e(hoj0 hoj0Var) {
        goj0 goj0VarA;
        if (hoj0Var == null || (goj0VarA = hoj0Var.a()) == null) {
            return null;
        }
        return (ez00) goj0VarA.a;
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
