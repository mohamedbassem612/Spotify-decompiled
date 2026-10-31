package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q7a1 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7a1(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                q7a1 q7a1Var = new q7a1((s7a1) obj6, (lnm) obj5, (byte) 0);
                q7a1Var.b = (l7a1) obj;
                q7a1Var.c = (a8a1) obj2;
                q7a1Var.d = (z7a1) obj3;
                q7a1Var.e = (tqw) obj4;
                q7a1Var.invokeSuspend(rih1Var);
                break;
            case 1:
                q7a1 q7a1Var2 = new q7a1((v7a1) obj6, (lnm) obj5, (byte) 1);
                q7a1Var2.b = (l7a1) obj;
                q7a1Var2.c = (a8a1) obj2;
                q7a1Var2.d = (z7a1) obj3;
                q7a1Var2.e = (tqw) obj4;
                q7a1Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                q7a1 q7a1Var3 = new q7a1((iu30) obj6, (lnm) obj5, (byte) 2);
                q7a1Var3.b = (plf1) obj;
                q7a1Var3.c = (qlf1) obj2;
                q7a1Var3.d = (olf1) obj3;
                q7a1Var3.e = (tqw) obj4;
                q7a1Var3.invokeSuspend(rih1Var);
                break;
            case 3:
                q7a1 q7a1Var4 = new q7a1((zu30) obj6, (lnm) obj5, (byte) 3);
                q7a1Var4.b = (gyf1) obj;
                q7a1Var4.c = (lyf1) obj2;
                q7a1Var4.d = (zxf1) obj3;
                q7a1Var4.e = (tqw) obj4;
                q7a1Var4.invokeSuspend(rih1Var);
                break;
            default:
                q7a1 q7a1Var5 = new q7a1((iu30) obj6, (lnm) obj5, (byte) 4);
                q7a1Var5.b = (iyf1) obj;
                q7a1Var5.c = (nyf1) obj2;
                q7a1Var5.d = (ayf1) obj3;
                q7a1Var5.e = (tqw) obj4;
                q7a1Var5.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        w951 w951Var;
        w951 w951Var2;
        byte b = this.a;
        t951 t951Var = t951.a;
        xpl xplVar = xpl.a;
        v951 v951Var = v951.a;
        zpl zplVar = zpl.a;
        u951 u951Var = u951.a;
        ypl yplVar = ypl.a;
        gql gqlVar = gql.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                l7a1 l7a1Var = (l7a1) this.b;
                a8a1 a8a1Var = (a8a1) this.c;
                z7a1 z7a1Var = (z7a1) this.d;
                tqw tqwVar = this.e;
                hm5.M(obj);
                if (!(z7a1Var instanceof z7a1)) {
                    eg.o();
                    return null;
                }
                ojm ojmVar = ((s7a1) obj2).c;
                String str = l7a1Var.a;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                u7h u7hVar = a8a1Var.d;
                i1o1.z(ojmVar, str, tv80VarY, u7hVar != null ? new Long(w361.v(u7hVar.a)) : null);
                return rih1Var;
            case 1:
                l7a1 l7a1Var2 = (l7a1) this.b;
                a8a1 a8a1Var2 = (a8a1) this.c;
                z7a1 z7a1Var2 = (z7a1) this.d;
                tqw tqwVar2 = this.e;
                hm5.M(obj);
                if (!(z7a1Var2 instanceof z7a1)) {
                    eg.o();
                    return null;
                }
                ojm ojmVar2 = ((v7a1) obj2).b;
                String str2 = l7a1Var2.a;
                tv80 tv80VarY2 = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                u7h u7hVar2 = a8a1Var2.d;
                i1o1.z(ojmVar2, str2, tv80VarY2, u7hVar2 != null ? new Long(w361.v(u7hVar2.a)) : null);
                return rih1Var;
            case 2:
                iu30 iu30Var = (iu30) obj2;
                plf1 plf1Var = (plf1) this.b;
                qlf1 qlf1Var = (qlf1) this.c;
                olf1 olf1Var = (olf1) this.d;
                tqw tqwVar3 = this.e;
                hm5.M(obj);
                if (olf1Var instanceof mlf1) {
                    boolean z = qlf1Var.A;
                    j9k1 j9k1Var = qlf1Var.i;
                    String str3 = z ? plf1Var.a : plf1Var.b;
                    int i = j9k1Var.equals(gqlVar) ? 3 : plf1Var.G;
                    boolean z2 = j9k1Var instanceof dql;
                    boolean z3 = qlf1Var.j;
                    boolean z4 = qlf1Var.f34p;
                    aql aqlVar = plf1Var.q;
                    if (aqlVar.equals(yplVar)) {
                        w951Var = u951Var;
                    } else if (aqlVar.equals(zplVar)) {
                        w951Var = v951Var;
                    } else if (aqlVar.equals(xplVar)) {
                        w951Var = t951Var;
                    } else {
                        eg.o();
                    }
                    iu30Var.invoke(new v051(new z951(str3, i, z2, plf1Var.l, qlf1Var.o, z4, qlf1Var.t, qlf1Var.u, plf1Var.w, w951Var, plf1Var.A, plf1Var.f, plf1Var.g, plf1Var.o, (plf1Var.v && sgy.c(plf1Var.a)) ? 2 : 1, plf1Var.E, qlf1Var.A, z3), tqwVar3 != null ? n3o1.y(tqwVar3) : null, ((mlf1) olf1Var).a));
                    return rih1Var;
                }
                if (u890.j(olf1Var, nlf1.a)) {
                    iu30Var.invoke(new mz41(plf1Var.a, tqwVar3 != null ? n3o1.y(tqwVar3) : null, qlf1Var.t, qlf1Var.f34p));
                    return rih1Var;
                }
                if (u890.j(olf1Var, llf1.a)) {
                    iu30Var.invoke(new mz41(plf1Var.a, tqwVar3 != null ? n3o1.y(tqwVar3) : null, qlf1Var.t, qlf1Var.f34p));
                    return rih1Var;
                }
                if (u890.j(olf1Var, ilf1.a) || u890.j(olf1Var, jlf1.a)) {
                    iu30Var.invoke(new cz41(Collections.singletonList(plf1Var.b), plf1Var.a, qlf1Var.q, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    return rih1Var;
                }
                if (u890.j(olf1Var, klf1.a)) {
                    iu30Var.invoke(new m151(plf1Var.b, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                gyf1 gyf1Var = (gyf1) this.b;
                lyf1 lyf1Var = (lyf1) this.c;
                zxf1 zxf1Var = (zxf1) this.d;
                tqw tqwVar4 = this.e;
                hm5.M(obj);
                ((zu30) obj2).J(gyf1Var, lyf1Var, zxf1Var, tqwVar4 != null ? n3o1.y(tqwVar4) : null);
                return rih1Var;
            default:
                iu30 iu30Var2 = (iu30) obj2;
                iyf1 iyf1Var = (iyf1) this.b;
                nyf1 nyf1Var = (nyf1) this.c;
                ayf1 ayf1Var = (ayf1) this.d;
                tqw tqwVar5 = this.e;
                hm5.M(obj);
                if (ayf1Var instanceof wxf1) {
                    String str4 = iyf1Var.a;
                    int i2 = nyf1Var.h.equals(gqlVar) ? 3 : nyf1Var.g;
                    boolean z5 = nyf1Var.h instanceof dql;
                    boolean z6 = nyf1Var.i;
                    boolean z7 = nyf1Var.n;
                    aql aqlVar2 = iyf1Var.f11p;
                    if (aqlVar2.equals(yplVar)) {
                        w951Var2 = u951Var;
                    } else if (aqlVar2.equals(zplVar)) {
                        w951Var2 = v951Var;
                    } else if (aqlVar2.equals(xplVar)) {
                        w951Var2 = t951Var;
                    } else {
                        eg.o();
                    }
                    iu30Var2.invoke(new v051(new z951(str4, i2, z5, iyf1Var.k, z7, nyf1Var.u, nyf1Var.v, iyf1Var.t, w951Var2, iyf1Var.x, iyf1Var.d, iyf1Var.e, iyf1Var.n, (iyf1Var.s && sgy.c(iyf1Var.a)) ? 2 : 1, iyf1Var.A, nyf1Var.z, z6, 16), tqwVar5 != null ? n3o1.y(tqwVar5) : null, ((wxf1) ayf1Var).a));
                    return rih1Var;
                }
                if (u890.j(ayf1Var, xxf1.a)) {
                    iu30Var2.invoke(new mz41(iyf1Var.a, tqwVar5 != null ? n3o1.y(tqwVar5) : null, nyf1Var.u, nyf1Var.n));
                    return rih1Var;
                }
                if (u890.j(ayf1Var, txf1.a)) {
                    iu30Var2.invoke(new mz41(iyf1Var.a, tqwVar5 != null ? n3o1.y(tqwVar5) : null, nyf1Var.u, nyf1Var.n));
                    return rih1Var;
                }
                if (u890.j(ayf1Var, rxf1.a)) {
                    iu30Var2.invoke(new m151(iyf1Var.a, tqwVar5 != null ? n3o1.y(tqwVar5) : null));
                    return rih1Var;
                }
                if (u890.j(ayf1Var, pxf1.a) || u890.j(ayf1Var, qxf1.a)) {
                    iu30Var2.invoke(new cz41(Collections.singletonList(iyf1Var.a), iyf1Var.a, nyf1Var.p, tqwVar5 != null ? n3o1.y(tqwVar5) : null));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
