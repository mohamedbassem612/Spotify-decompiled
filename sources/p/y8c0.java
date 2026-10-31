package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y8c0 implements v89, yt90 {
    public final tjq a;
    public final llm b;
    public final bpb1 c = gio1.b(z6x.a);

    public y8c0(q8n q8nVar, tjq tjqVar) {
        this.a = tjqVar;
        this.b = i3a.k(q8nVar);
    }

    @Override // p.v89
    public final zob1 available() {
        return d5p1.h(this.c);
    }

    public final void start() {
        tjq tjqVar = this.a;
        iir iirVar = (iir) tjqVar.d;
        List list = (List) tjqVar.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((z0a0) it.next()).a());
        }
        r4s r4sVar = (r4s) tjqVar.c;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ht20((mr20) it2.next(), new qjr(2, (lnm) null, (byte) 8)));
        }
        mr20 mr20VarR = o4p1.r(new i0h(new wa3((mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]), (byte) 9), (byte) 17), r4sVar.c);
        ytw0 ytw0Var = jfv.b;
        qer qerVar = new qer(((so21) tjqVar.e).a(new qer(fbp1.r(mr20VarR, fdg1.l0(((no4) r4sVar.a.a.get()).b0(), ngv.d)), r4sVar.b, (byte) 19)), tjqVar, (byte) 3);
        st60 st60Var = (st60) iirVar.b;
        jge jgeVarE = hu20.e(rqt0.u(new wa3((mr20[]) o7h.l1(f46.Q0(new mr20[]{((zwz0) st60Var.b).c(), new hs6(((y4s) st60Var.d).b, (byte) 5), ((jir) st60Var.c).a})).toArray(new mr20[0]), (byte) 1)), new qt((lnm) null, qerVar, (byte) 20));
        vx40 vx40Var = (vx40) iirVar.c;
        l4p1.u(this.b, new fu20(h5p1.s(jgeVarE, (mr20) vx40Var.c, (mr20) vx40Var.b, new w63(vx40Var, (lnm) null, (byte) 11)), new y160(this, (lnm) null, (byte) 27), (byte) 1));
    }

    public final void stop() {
        op71.q(this.b.a, (CancellationException) null);
    }
}
