package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s7a1 implements tyq {
    public final psw X;
    public final gw70 a;
    public final d0r b;
    public final ojm c;
    public final o3r d;
    public final o3r e;
    public final o3r f;
    public final o3r g;
    public final f4r h;
    public final js20 i;
    public final ia00 t;

    public s7a1(gw70 gw70Var, d0r d0rVar, ojm ojmVar) {
        this.a = gw70Var;
        this.b = d0rVar;
        this.c = ojmVar;
        jd11 jd11Var = rc11.a;
        o3r o3rVarM = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 1, r7a1.b, new j4r(r7a1.h), r7a1.c), new l4r(new wlu(jd11Var.b(xkk1.class)), 1, r7a1.d, new j4r(r7a1.i), r7a1.e), new l4r(new xv00(jd11Var.b(f7a1.class)), 1, r7a1.f, new j4r(r7a1.t), r7a1.g), xi81.f);
        this.d = o3rVarM;
        o3r o3rVarO = w3p1.o(new l4r(hvm.c, 2, y5a1.Z0, new j4r(y5a1.X0), y5a1.a1), y5a1.Y0);
        this.e = o3rVarO;
        o3r o3rVarO2 = w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 2, y5a1.b1, new j4r(y5a1.T0), y5a1.c1), y5a1.U0);
        this.f = o3rVarO2;
        o3r o3rVarO3 = w3p1.o(new l4r(new wlu(jd11Var.b(xkk1.class)), 2, y5a1.d1, new j4r(y5a1.V0), y5a1.e1), y5a1.W0);
        this.g = o3rVarO3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o3rVarM);
        arrayList.add(o3rVarO);
        arrayList.add(new h4r((iu30) y5a1.R0, (f4r) o3rVarO2));
        arrayList.add(new h4r((iu30) y5a1.S0, (f4r) o3rVarO3));
        this.h = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.i = x3p1.n(new d061(1, this, s7a1.class, "externalState", "externalState(Lcom/spotify/songdna/elements/songdnaentrypointelement/SongDNAEntrypoint$Props;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 18), y5a1.Q0, new nsm0(2, this, s7a1.class, "mapToState", "mapToState(Lcom/spotify/songdna/elements/songdnaentrypointelement/SongDNAEntrypoint$Props;Lcom/spotify/songdna/elements/songdnaentrypointelement/impl/SongDNAEntrypointDataElement$ExternalState;)Lcom/spotify/songdna/elements/songdnaentrypointelement/impl/SongDNAEntrypointState;", 0, (byte) 28), (o8n) null, new dr91((Object) this, (byte) 12), 8);
        this.t = n3o1.q(this).a(v691.Z0, v691.a1);
        j2i j2iVar = new j2i(1059541387, new u491(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    public final d0r e() {
        return this.b;
    }

    public final mqw getBehavior() {
        return this.i;
    }

    public final f4r getData() {
        return this.h;
    }
}
