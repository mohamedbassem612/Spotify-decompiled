package p;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class smf implements h0r0 {
    public final ynb0 a;
    public final hvj b;
    public final umf c;
    public final add d;
    public final jed0 e;
    public final ynb0 f;
    public final ynb0 g;
    public final ynb0 h;
    public final ynb0 i;
    public final j5p j;
    public final xok0 k;
    public final cbr0 l;

    public smf(ynb0 ynb0Var, hvj hvjVar, umf umfVar, add addVar, jed0 jed0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, j5p j5pVar, xok0 xok0Var) {
        this.a = ynb0Var;
        this.b = hvjVar;
        this.c = umfVar;
        this.d = addVar;
        this.e = jed0Var;
        this.f = ynb0Var2;
        this.g = ynb0Var3;
        this.h = ynb0Var4;
        this.i = ynb0Var5;
        this.j = j5pVar;
        this.k = xok0Var;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.l = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.B0(), new lik1(umfVar.getPageUri()), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.l;
    }

    public final p2r0 b() {
        return hvj.b(this.b, f610.e(new p6e0[0], new dt0(this, (lnm) null, (byte) 28)), apo.j(1771479627, new dwd(this, (byte) 21), true));
    }

    public final void c(goe goeVar, b0k b0kVar, int i) {
        int i2;
        smf smfVar;
        Object next;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(704515306);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(goeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = goeVar.j() instanceof btf;
            boolean z2 = ((ibd0) xto.i(this.e.d(), fbd0.a, x340Var, 0).getValue()) instanceof ebd0;
            boolean zG = x340Var.g(goeVar);
            Object objT = x340Var.T();
            umf umfVar = this.c;
            if (zG || objT == m4cVar) {
                Iterator it = goeVar.g().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (u890.j(((jwm) next).getUsername(), umfVar.b()));
                objT = (jwm) next;
                x340Var.s0(objT);
            }
            jwm jwmVar = (jwm) objT;
            boolean zG2 = x340Var.g(goeVar) | x340Var.h(z2);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                String displayName = jwmVar != null ? jwmVar.getDisplayName() : null;
                String username = jwmVar != null ? jwmVar.getUsername() : null;
                smc0 smc0VarN = k4p1.n();
                if (!z && z2) {
                    smc0VarN.add(((ohd0) this.i.get()).a(displayName, username));
                }
                if (this.d.n()) {
                    smc0VarN.add(((cp51) this.f.get()).a(umfVar.a(), displayName, z));
                }
                smc0VarN.add(((k8u0) this.h.get()).a(umfVar.a(), displayName, z));
                smc0VarN.add(((wd41) this.g.get()).a(umfVar.a(), displayName, z));
                objT2 = k4p1.k(smc0VarN);
                x340Var.s0(objT2);
            }
            List list = (List) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = this.k.b();
                x340Var.s0(objT3);
            }
            r6h1 r6h1Var = (r6h1) objT3;
            boolean zI = x340Var.i(r6h1Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new cb1(r6h1Var, (byte) 12);
                x340Var.s0(objT4);
            }
            smfVar = this;
            dgo1.c("chatSettingsPage", (iu30) objT4, apo.r(1399943206, new pa0(z, smfVar, z2, list, (byte) 3), x340Var), x340Var, 390);
        } else {
            smfVar = this;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(smfVar, goeVar, i, (byte) 24);
        }
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1789711105);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131953748);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cjc0 cjc0Var = new cjc0(2);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF = u291.f(uyn1.x(nim0.a, 16.0f), 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = rmf.b;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarF, false, (iu30) objT), lee1Var, j, new a0e1(3), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1696);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qff(this, i, (byte) 3);
        }
    }
}
