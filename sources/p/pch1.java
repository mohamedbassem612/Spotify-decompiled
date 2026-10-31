package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pch1 implements f961 {
    public final ffe1 a;
    public final dlg1 b;
    public final zb91 c;
    public final ezb1 d;

    public pch1(nfa0 nfa0Var, iyc0 iyc0Var, q940 q940Var, RetrofitMaker retrofitMaker) {
        zb91 zb91Var = new zb91(nfa0Var, (byte) 20);
        this.a = new ffe1(iyc0Var);
        zbh1 zbh1Var = zbh1.d;
        zbh1 zbh1Var2 = zbh1.c;
        zbh1 zbh1Var3 = zbh1.b;
        en10 en10VarA = q940Var.a(new ced0("Spotify.Feature.UcpPromptable", p7h.M(new m9d0[]{zbh1Var, zbh1Var2, zbh1Var3}), sqg0.J(new mmr0[]{new mmr0(zbh1Var, new n60("Spotify.Feature.UcpPromptable", "view", (omd) null, (m60) null, 114)), new mmr0(zbh1Var2, new n60("Spotify.Feature.UcpPromptable", "edit", (omd) null, (m60) null, 114)), new mmr0(zbh1Var3, new n60("Spotify.Feature.UcpPromptable", "add", (omd) null, (m60) null, 114))})));
        dlg1 dlg1Var = new dlg1();
        dlg1Var.a = zb91Var;
        dlg1Var.b = en10VarA;
        dlg1Var.c = new idd1(new dch1(dlg1Var, (byte) 2));
        this.b = dlg1Var;
        this.c = zb91Var;
        this.d = new ezb1((sch1) retrofitMaker.createWebgateService(sch1.class, "android-promptedplaylists-ucpapiimpl"), (byte) 13);
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
