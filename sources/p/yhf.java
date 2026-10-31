package p;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yhf implements h0r0 {
    public final ynb0 a;
    public final hvj b;
    public final aif c;
    public final add d;
    public final ynb0 e;
    public final ynb0 f;
    public final ynb0 g;
    public final xok0 h;
    public final cbr0 i;

    public yhf(ynb0 ynb0Var, hvj hvjVar, aif aifVar, add addVar, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, xok0 xok0Var) {
        this.a = ynb0Var;
        this.b = hvjVar;
        this.c = aifVar;
        this.d = addVar;
        this.e = ynb0Var2;
        this.f = ynb0Var3;
        this.g = ynb0Var4;
        this.h = xok0Var;
        String str = aifVar.b;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.i = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.G1("CHAT_RECEIPTS", "chat/receipts", 329, "chat"), new lik1(str), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.i;
    }

    public final p2r0 b() {
        return hvj.b(this.b, new o6e0(new dt0(this, null, (byte) 26), f46.I(new p6e0[0])), new j2i(-1846715877, new dwd(this, (byte) 18), true));
    }

    public final void c(goe goeVar, b0k b0kVar, int i) {
        int i2;
        Object next;
        aif aifVar = this.c;
        String str = aifVar.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-911430494);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(goeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = goeVar.b instanceof btf;
            boolean zG = x340Var.g(goeVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                Iterator it = goeVar.e.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (u890.j(((jwm) next).a.a, aifVar.c));
                objT = (jwm) next;
                x340Var.s0(objT);
            }
            jwm jwmVar = (jwm) objT;
            boolean zG2 = x340Var.g(goeVar);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                String str2 = jwmVar != null ? jwmVar.a.b : null;
                if (jwmVar != null) {
                    String str3 = jwmVar.a.a;
                }
                smc0 smc0VarN = k4p1.n();
                if (this.d.n()) {
                    smc0VarN.add(((cp51) this.e.get()).a(str, str2, z));
                }
                smc0VarN.add(((k8u0) this.g.get()).a(str, str2, z));
                smc0VarN.add(((wd41) this.f.get()).a(str, str2, z));
                objT2 = k4p1.k(smc0VarN);
                x340Var.s0(objT2);
            }
            List list = (List) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = this.h.b();
                x340Var.s0(objT3);
            }
            r6h1 r6h1Var = (r6h1) objT3;
            boolean zI = x340Var.i(r6h1Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new cb1(r6h1Var, (byte) 10);
                x340Var.s0(objT4);
            }
            dgo1.c("chatReceiptsPage", (iu30) objT4, apo.r(-216002594, new qm0(list, (byte) 2), x340Var), x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(this, goeVar, i, (byte) 22);
        }
    }
}
