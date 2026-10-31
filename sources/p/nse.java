package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nse implements h0r0 {
    public final sse a;
    public final qyj b;
    public final xid c;
    public final mr20 d;
    public final dg0 e;
    public final o7r0 f;
    public final q4p g;
    public final cfd h;
    public final hz5 i;
    public final mwn0 j;
    public final kly0 k;
    public final ien0 l;
    public final cbr0 m;

    public nse(sse sseVar, qyj qyjVar, xid xidVar, mr20 mr20Var, dg0 dg0Var, o7r0 o7r0Var, q4p q4pVar, cfd cfdVar, hz5 hz5Var, mwn0 mwn0Var, b2p b2pVar) {
        this.a = sseVar;
        this.b = qyjVar;
        this.c = xidVar;
        this.d = mr20Var;
        this.e = dg0Var;
        this.f = o7r0Var;
        this.g = q4pVar;
        this.h = cfdVar;
        this.i = hz5Var;
        this.j = mwn0Var;
        this.k = b2pVar;
        ien0 ien0Var = new ien0((Object) null);
        this.l = ien0Var;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.m = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.q0(), new lik1(sseVar.b()), (nar0) null), new a6o0(ien0Var)}, false);
    }

    public final cbr0 a() {
        return this.m;
    }

    public final p2r0 b() {
        return this.b.a(apo.j(-390106796, new lse(this, (byte) 2), true));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    public final void c(b0k b0kVar, int i) {
        xse xseVar;
        j2i j2iVar;
        int i2;
        c380 c380Var;
        ven0 ven0Var;
        boolean z;
        j2i j2iVar2;
        Object next;
        nse nseVar = this;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1337910028);
        int i3 = (x340Var.i(nseVar) ? 4 : 2) | i;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            ven0 ven0VarJ = f4p1.j(nseVar.d, (Object) null, (iac0) null, x340Var, 48, 14);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = xto.t((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = nseVar.g.a(c9nVar, new bp9(ven0Var2, (byte) 21));
                x340Var.s0(objT3);
            }
            qse qseVar = (qse) objT3;
            kiv kivVar = k2r0.a;
            tbr0 tbr0VarC = ((cir0) x340Var.k(kivVar)).c();
            q7r0 q7r0VarG = ((cir0) x340Var.k(kivVar)).g();
            Object objT4 = x340Var.T();
            sse sseVar = nseVar.a;
            if (objT4 == m4cVar) {
                objT4 = nseVar.h.m(sseVar.a(), sseVar.h());
                x340Var.s0(objT4);
            }
            c380 c380Var2 = (c380) objT4;
            String strG = sseVar.g();
            if (strG != null) {
                Iterator it = c380Var2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!ktd.t(((xse) next).a()).equals(strG));
                xseVar = (xse) next;
                if (xseVar == null) {
                    xseVar = (xse) o7h.q0(c380Var2);
                }
            } else {
                xseVar = (xse) o7h.q0(c380Var2);
            }
            uhd1 uhd1VarM = nyo1.m(xseVar, c380Var2, x340Var);
            x340Var.i0(-1536287794);
            ArrayList arrayList = new ArrayList(q7h.U(c380Var2, 10));
            Iterator it2 = c380Var2.iterator();
            while (it2.hasNext()) {
                arrayList.add(prn1.r(new rse(((xse) it2.next()).getUri()), x340Var, 0));
            }
            x340Var.r(false);
            c380 c380VarA = mqo1.A(arrayList);
            bab1 bab1Var = (bab1) c380VarA.get(((Number) uhd1VarM.a().getValue()).intValue());
            boolean zI = x340Var.i(ven0Var2) | x340Var.i(bab1Var);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new ja2(bab1Var, ven0Var2, (lnm) null, (byte) 1);
                x340Var.s0(objT5);
            }
            qxd0.t(bab1Var, x340Var, (vu30) objT5);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = xto.t(Boolean.TRUE);
                x340Var.s0(objT6);
            }
            ven0 ven0Var3 = (ven0) objT6;
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                j2iVar = null;
                objT7 = xto.t((Object) null);
                x340Var.s0(objT7);
            } else {
                j2iVar = null;
            }
            ven0 ven0Var4 = (ven0) objT7;
            if (((th61) ven0VarJ.getValue()) == null || !((Boolean) ven0Var3.getValue()).booleanValue()) {
                x340Var = x340Var;
                x340Var.i0(-376789330);
                x340Var.r(false);
            } else {
                x340Var.i0(-379581996);
                boolean zI2 = x340Var.i(ven0Var3) | x340Var.i(q7r0VarG);
                Object objT8 = x340Var.T();
                if (zI2 || objT8 == m4cVar) {
                    i2 = 1;
                    objT8 = new ame(q7r0VarG, ven0Var3, (byte) 1);
                    x340Var.s0(objT8);
                } else {
                    i2 = 1;
                }
                Function0 function0 = (Function0) objT8;
                Boolean bool = Boolean.TRUE;
                if (c380Var2.size() > i2) {
                    x340Var.i0(-379395779);
                    c380Var = c380Var2;
                    hwd hwdVar = new hwd(nseVar, c380Var, uhd1VarM, ven0Var4, (byte) 5);
                    ven0Var = ven0Var4;
                    j2i j2iVarR = apo.r(1813116308, hwdVar, x340Var);
                    z = false;
                    x340Var.r(false);
                    j2iVar2 = j2iVarR;
                } else {
                    c380Var = c380Var2;
                    ven0Var = ven0Var4;
                    z = false;
                    x340Var.i0(-378911280);
                    x340Var.r(false);
                    j2iVar2 = j2iVar;
                }
                ri1 ri1Var = new ri1(ven0Var, this, uhd1VarM, c380Var, c380VarA, qseVar, tbr0VarC, ven0VarJ);
                nseVar = this;
                j2i j2iVarR2 = apo.r(-1110965362, ri1Var, x340Var);
                x340Var = x340Var;
                x74.f(function0, (scx) null, (mfx) null, false, false, 0.0f, false, bool, false, false, j2iVar2, j2iVarR2, x340Var, 12607488, 48, 878);
                x340Var.r(z);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lse(nseVar, i);
        }
    }
}
