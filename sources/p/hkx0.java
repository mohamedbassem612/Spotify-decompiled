package p;

import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hkx0 extends j1o implements b031 {
    public final bt6 N0;
    public final LinkedHashSet O0;
    public cdr0 P0;
    public final bpb1 Q0;
    public final llm R0;
    public xab1 S0;
    public xab1 T0;
    public xab1 U0;
    public final bpb1 V0;
    public final bpb1 W0;
    public final xev0 X;
    public final bpb1 X0;
    public final gev0 Y;
    public final bpb1 Y0;
    public final d0r Z;
    public final pvc Z0;
    public final ckx0 a1;
    public final xrc0 d;
    public final String e;
    public final mr20 f;
    public final l1o g;
    public final bdr0 h;
    public final Set i;
    public final f8b t;

    public hkx0(xrc0 xrc0Var, String str, mr20 mr20Var, l1o l1oVar, bdr0 bdr0Var, t380 t380Var, f8b f8bVar, q8n q8nVar, xev0 xev0Var, gev0 gev0Var, d0r d0rVar, bt6 bt6Var, LinkedHashSet linkedHashSet) {
        this.d = xrc0Var;
        this.e = str;
        this.f = mr20Var;
        this.g = l1oVar;
        this.h = bdr0Var;
        this.i = t380Var;
        this.t = f8bVar;
        this.X = xev0Var;
        this.Y = gev0Var;
        this.Z = d0rVar;
        this.N0 = bt6Var;
        this.O0 = linkedHashSet;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.Q0 = bpb1VarB;
        this.R0 = smo1.e(q8nVar);
        bpb1 bpb1VarB2 = gio1.b(new bkx0(this, (byte) 0));
        this.V0 = bpb1VarB2;
        this.W0 = gio1.b(new ioj0());
        this.X0 = bpb1VarB2;
        this.Y0 = bpb1VarB;
        this.Z0 = new pvc((byte) 5);
        this.a1 = new ckx0(this, (byte) 0);
        j();
    }

    public final void a(Bundle bundle) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((b031) it.next()).a(bundle);
        }
    }

    public final void e() {
        j();
        this.Z.a(this.a1);
        this.X.b();
        this.Y.b();
        this.N0.a();
        this.S0 = fn31.T(this.R0, (o8n) null, 0, new glu0(this, (lnm) null, (byte) 15), 3);
    }

    public final void f() {
        xab1 xab1Var = this.S0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        xab1 xab1Var2 = this.T0;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        xab1 xab1Var3 = this.U0;
        if (xab1Var3 != null) {
            xab1Var3.d((CancellationException) null);
        }
        cdr0 cdr0Var = this.P0;
        if (cdr0Var != null) {
            cdr0Var.stop();
        }
        this.X.c();
        this.Y.c();
        this.N0.e();
        this.Z.h(this.a1);
    }

    public final bpb1 k() {
        return this.Y0;
    }

    public final zob1 l() {
        return this.W0;
    }

    public final bpb1 m() {
        return this.X0;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0157 A[EDGE_INSN: B:48:0x0157->B:49:0x015a BREAK  A[LOOP:3: B:43:0x0136->B:103:?]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object n(c9n c9nVar, y2r0 y2r0Var, onm onmVar) {
        dkx0 dkx0Var;
        c0r c0rVarC;
        y2r0 y2r0Var2;
        c0r c0rVar;
        List listSingletonList;
        Iterator it;
        Object next;
        e331 e331Var;
        hkx0 hkx0Var = this;
        if (onmVar instanceof dkx0) {
            dkx0Var = (dkx0) onmVar;
            int i = dkx0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dkx0Var.f = i - Integer.MIN_VALUE;
            } else {
                dkx0Var = new dkx0(hkx0Var, onmVar);
            }
        } else {
            dkx0Var = new dkx0(hkx0Var, onmVar);
        }
        dkx0 dkx0Var2 = dkx0Var;
        Object objV = dkx0Var2.d;
        int i2 = dkx0Var2.f;
        bdr0 bdr0Var = hkx0Var.h;
        bt6 bt6Var = hkx0Var.N0;
        try {
            if (i2 == 0) {
                hm5.M(objV);
                Set setD = bdr0Var.d(y2r0Var);
                List list = y2r0Var.b;
                LinkedHashSet linkedHashSetY0 = dm61.y0(setD, hkx0Var.O0);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetY0) {
                    if (((aq21) obj) instanceof zp21) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (u890.j(((aq21) obj2).getKey(), kbf1.class)) {
                        arrayList3.add(obj2);
                    } else {
                        arrayList4.add(obj2);
                    }
                }
                mch mchVarQ = i6p1.q(j9k1.F(arrayList), j9k1.F(arrayList3));
                l1o l1oVar = hkx0Var.g;
                lch lchVarS = g6p1.s(mchVarQ.a(l1oVar), w3p1.o(new l4r(new xv00(rc11.a.b(jo70.class)), 1, kex0.R0, new j4r(kex0.P0), kex0.S0), kex0.Q0).a(l1oVar));
                d0r d0rVar = hkx0Var.Z;
                c0r c0rVarC2 = d0rVar.c(lchVarS);
                c0rVarC = d0rVar.c(j9k1.F(arrayList4).a(l1oVar));
                bt6Var.j();
                bt6Var.h();
                if (l1oVar.b != 1 || list.isEmpty()) {
                    bt6Var.k();
                    break;
                }
                List list2 = ((x2r0) o7h.q0(list)).b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            bt6Var.k();
                            break;
                        }
                        if (((v2r0) it2.next()).a == w2r0.Z) {
                            hkx0Var.T0 = fn31.T(hkx0Var.R0, (o8n) null, 0, new fkx0(hkx0Var, null), 3);
                            break;
                        }
                    }
                } else {
                    bt6Var.k();
                    break;
                }
                l2t l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new pew0(c0rVarC2, hkx0Var, false, (lnm) null, (byte) 17), 3);
                hkx0Var = this;
                y2r0Var2 = y2r0Var;
                try {
                    l2t[] l2tVarArr = {l2tVarQ, fn31.q(c9nVar, (o8n) null, 0, new pew0(hkx0Var, y2r0Var2, false, (lnm) null, (byte) 16), 3)};
                    dkx0Var2.a = y2r0Var2;
                    dkx0Var2.b = c0rVarC2;
                    dkx0Var2.c = c0rVarC;
                    dkx0Var2.f = 1;
                    objV = o1p1.v(l2tVarArr, dkx0Var2);
                    d9n d9nVar = d9n.a;
                    if (objV == d9nVar) {
                        return d9nVar;
                    }
                    c0rVar = c0rVarC2;
                    listSingletonList = (List) objV;
                } catch (Exception e) {
                    e = e;
                    c0rVar = c0rVarC2;
                    listSingletonList = Collections.singletonList(new e331(new m231(new IOException("Exception during data load", e))));
                    it = listSingletonList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((e331) next).a instanceof m231));
                    e331Var = (e331) next;
                    if (e331Var != null) {
                        bt6Var.d(false);
                        hkx0Var.X.a();
                        hkx0Var.Y.a();
                        Throwable thA = e331.a(e331Var.a);
                        thA.getClass();
                        hkx0Var.h(thA);
                    } else {
                        bt6Var.d(true);
                        bt6Var.g();
                        cdr0 cdr0VarC = bdr0Var.c(hkx0Var.W0, y2r0Var2);
                        cdr0VarC.start();
                        hkx0Var.P0 = cdr0VarC;
                        bkx0 bkx0Var = new bkx0(hkx0Var, (byte) 1);
                        bpb1 bpb1Var = hkx0Var.V0;
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, bkx0Var);
                        bt6Var.c();
                        hkx0Var.i();
                    }
                    return p7h.M(new c0r[]{c0rVar, c0rVarC});
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0r c0rVar2 = dkx0Var2.c;
                c0rVar = dkx0Var2.b;
                y2r0 y2r0Var3 = dkx0Var2.a;
                try {
                    hm5.M(objV);
                    c0rVarC = c0rVar2;
                    y2r0Var2 = y2r0Var3;
                    try {
                        listSingletonList = (List) objV;
                    } catch (Exception e2) {
                        e = e2;
                        listSingletonList = Collections.singletonList(new e331(new m231(new IOException("Exception during data load", e))));
                    }
                } catch (Exception e3) {
                    e = e3;
                    c0rVarC = c0rVar2;
                    y2r0Var2 = y2r0Var3;
                    listSingletonList = Collections.singletonList(new e331(new m231(new IOException("Exception during data load", e))));
                    it = listSingletonList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((e331) next).a instanceof m231));
                    e331Var = (e331) next;
                    if (e331Var != null) {
                        bt6Var.d(false);
                        hkx0Var.X.a();
                        hkx0Var.Y.a();
                        Throwable thA2 = e331.a(e331Var.a);
                        thA2.getClass();
                        hkx0Var.h(thA2);
                    } else {
                        bt6Var.d(true);
                        bt6Var.g();
                        cdr0 cdr0VarC2 = bdr0Var.c(hkx0Var.W0, y2r0Var2);
                        cdr0VarC2.start();
                        hkx0Var.P0 = cdr0VarC2;
                        bkx0 bkx0Var2 = new bkx0(hkx0Var, (byte) 1);
                        bpb1 bpb1Var2 = hkx0Var.V0;
                        bpb1Var2.getClass();
                        bpb1Var2.m((Object) null, bkx0Var2);
                        bt6Var.c();
                        hkx0Var.i();
                    }
                    return p7h.M(new c0r[]{c0rVar, c0rVarC});
                }
            }
            it = listSingletonList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((e331) next).a instanceof m231));
            e331Var = (e331) next;
            if (e331Var != null) {
                bt6Var.d(false);
                hkx0Var.X.a();
                hkx0Var.Y.a();
                Throwable thA3 = e331.a(e331Var.a);
                thA3.getClass();
                hkx0Var.h(thA3);
            } else {
                bt6Var.d(true);
                bt6Var.g();
                cdr0 cdr0VarC3 = bdr0Var.c(hkx0Var.W0, y2r0Var2);
                cdr0VarC3.start();
                hkx0Var.P0 = cdr0VarC3;
                bkx0 bkx0Var3 = new bkx0(hkx0Var, (byte) 1);
                bpb1 bpb1Var3 = hkx0Var.V0;
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, bkx0Var3);
                bt6Var.c();
                hkx0Var.i();
            }
            return p7h.M(new c0r[]{c0rVar, c0rVarC});
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            bundle.putAll(((b031) it.next()).serialize());
        }
        return bundle;
    }
}
