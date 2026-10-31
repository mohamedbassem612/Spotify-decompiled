package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eve implements h0r0 {
    public final bfd a;
    public final gve b;
    public final add c;
    public final yuj d;
    public final ave e;
    public final cp31 f;
    public final sve g;
    public final cbr0 h;

    public eve(bfd bfdVar, gve gveVar, add addVar, yuj yujVar, ave aveVar, cp31 cp31Var, sve sveVar) {
        this.a = bfdVar;
        this.b = gveVar;
        this.c = addVar;
        this.d = yujVar;
        this.e = aveVar;
        this.f = cp31Var;
        this.g = sveVar;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.s0(), nik1.a5.b(gveVar.a()), (nar0) null), new kce0()}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return yuj.b(this.d, f610.e(new p6e0[0], new dt0(this, (lnm) null, (byte) 22)), apo.j(-238924300, new zee(this, (byte) 5), true), this.e.a());
    }

    public final void c(bve bveVar, iu30 iu30Var, b0k b0kVar, int i) {
        eve eveVar = this;
        bve bveVar2 = bveVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1345517053);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(bveVar2) : x340Var.i(bveVar2) ? 4 : 2) | i : i;
        iu30 iu30Var2 = iu30Var;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(eveVar) ? 256 : 128;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qte qteVarB = bveVar2.b();
            boolean zG = x340Var.g(qteVarB.g());
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = qteVarB.g();
                x340Var.s0(objT);
            }
            c380 c380VarA = mqo1.A((Iterable) objT);
            boolean zG2 = x340Var.g(c380VarA);
            Object objT2 = x340Var.T();
            gve gveVar = eveVar.b;
            Object obj = objT2;
            if (zG2 || objT2 == m4cVar) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c380VarA) {
                    if (!u890.j(((jwm) obj2).getUsername(), gveVar.g())) {
                        arrayList.add(obj2);
                    }
                }
                x340Var.s0(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            boolean zG3 = x340Var.g(c380VarA);
            Object objT3 = x340Var.T();
            Object obj3 = objT3;
            if (zG3 || objT3 == m4cVar) {
                Iterator it = c380VarA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bhn0.t("Collection contains no element matching the predicate.");
                        return;
                    }
                    jwm jwmVar = (jwm) it.next();
                    if (u890.j(jwmVar.getUsername(), gveVar.g())) {
                        x340Var.s0(jwmVar);
                        obj3 = jwmVar;
                        break;
                    } else {
                        bveVar2 = bveVar;
                        iu30Var2 = iu30Var;
                        eveVar = this;
                    }
                }
            }
            jwm jwmVar2 = (jwm) obj3;
            ctf ctfVarB = qteVarB.b();
            if (eveVar.c.b() && (!(ctfVarB instanceof atf) ? (ctfVarB instanceof btf) : !list.isEmpty())) {
                z = true;
            }
            irn1.u((qim0) null, apo.r(1829798326, new cve(z, eveVar, (byte) 1), x340Var), (vu30) null, (erl1) null, apo.r(1458526844, new dve(qteVarB, eveVar, list, jwmVar2, c380VarA, bveVar2, iu30Var2), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(this, bveVar, iu30Var, i, (byte) 17);
        }
    }
}
