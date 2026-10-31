package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lp10 implements tyq {
    public final d0r a;
    public final yqg b;
    public final ihd0 c;
    public final f4r d;
    public final js20 e;
    public final psw f;
    public final ia00 g;

    public lp10(d0r d0rVar, yqg yqgVar, ihd0 ihd0Var, q8n q8nVar) {
        this.a = d0rVar;
        this.b = yqgVar;
        this.c = ihd0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i4r(xc10.Z0, kzd.a));
        arrayList.add(new i4r(xc10.a1, kzd.b));
        this.d = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        sty styVar = new sty(1, this, lp10.class, "externalStateFlow", "externalStateFlow(Lcom/spotify/listeningactivity/elements/feedactivitylistrow/api/FeedActivityListRowElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 24);
        jp10 jp10Var = jp10.a;
        kp10 kp10Var = kp10.a;
        qtr qtrVar = new qtr();
        qtrVar.b(new skv(5, (lnm) null));
        this.e = new js20(styVar, jp10Var, kp10Var, qtrVar, true, q8nVar, false);
        j2i j2iVar = zni.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(jq00.T0, jq00.U0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.f;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.e;
    }

    public final f4r getData() {
        return this.d;
    }
}
