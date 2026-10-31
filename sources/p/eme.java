package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eme implements h0r0 {
    public static final o3r x;
    public final hvj a;
    public final gme b;
    public final lik1 c;
    public final lzn0 d;
    public final a1r0 e;
    public final q7r0 f;
    public final ule g;
    public final hvp0 h;
    public final kba i;
    public final pp11 j;
    public final myq0 k;
    public final vgm l;
    public final d2q m;
    public final mje n;
    public final p4p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qix0 f30p;
    public final boolean q;
    public final boolean r;
    public final q8n s;
    public final bqk0 t;
    public final idd1 u = new idd1(new ptb(this, (byte) 24));
    public final mp8 v = new mp8(new bme(this), (byte) 15);
    public final cbr0 w;

    static {
        mle mleVar = mle.T0;
        x = w3p1.o(new l4r(hjx0.a, 2, mle.V0, new j4r(mleVar), mle.W0), mle.U0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eme(hvj hvjVar, gme gmeVar, lik1 lik1Var, lzn0 lzn0Var, a1r0 a1r0Var, los losVar, q7r0 q7r0Var, e5b0 e5b0Var, ule uleVar, hvp0 hvp0Var, kba kbaVar, pp11 pp11Var, myq0 myq0Var, vgm vgmVar, d2q d2qVar, mje mjeVar, p4p p4pVar, qix0 qix0Var, boolean z, boolean z2, q8n q8nVar) {
        this.a = hvjVar;
        this.b = gmeVar;
        this.c = lik1Var;
        this.d = lzn0Var;
        this.e = a1r0Var;
        this.f = q7r0Var;
        this.g = uleVar;
        this.h = hvp0Var;
        this.i = kbaVar;
        this.j = pp11Var;
        this.k = myq0Var;
        this.l = vgmVar;
        this.m = d2qVar;
        this.n = mjeVar;
        this.o = p4pVar;
        this.f30p = qix0Var;
        this.q = z;
        this.r = z2;
        this.s = q8nVar;
        this.t = b5p1.n(gmeVar.a());
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.w = new cbr0(new dbr0[]{new bn70(yon1.T(), lik1Var, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805), e5b0Var, new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.w;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new dt0(this, (lnm) null, (byte) 20)), apo.j(1424328048, new dwd(this, (byte) 9), true));
    }

    public final void c(yle yleVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        d0r d0rVar;
        yle yleVar2 = yleVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-723434601);
        int i2 = ((i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(yleVar2) : x340Var.i(yleVar2) ? 4 : 2) | i : i) | 48;
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            q7r0 q7r0Var = this.f;
            d0r d0rVarC = cwl1.C(q7r0Var);
            int i4 = i3 & 14;
            boolean z = i4 == 4 || ((i3 & 8) != 0 && x340Var.g(yleVar2));
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                d0r d0rVarC2 = cwl1.C(q7r0Var);
                c380 c380VarA = yleVar2.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380VarA) {
                    if (obj instanceof vle) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((vle) it.next()).a());
                }
                d0rVar = d0rVarC;
                n nVar = new n(this, new tgm(null, false, false, false, false, false, true, null, false, false, 2, true, false, false, false, false, null, false, false, null, null, false, null, null, null, null, false, false, -10373, 1), d0rVarC2, this.o.a(q7r0Var.d.c, this.k.get()), new dg8(arrayList2, (byte) 18), new lo9(d0rVarC2, (byte) 15), yleVar2, arrayList2, (byte) 6);
                yleVar2 = yleVar2;
                x340Var.s0(nVar);
                objT = nVar;
            } else {
                d0rVar = d0rVarC;
            }
            vu30 vu30Var = (vu30) objT;
            boolean zG = x340Var.g(d0rVar) | x340Var.g(vu30Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = obg1.s(d2q.b(this.m, d0rVar), new ztb(this, vu30Var, (byte) 26));
                x340Var.s0(objT2);
            }
            tyq tyqVar = (tyq) objT2;
            boolean z2 = i4 == 4 || ((i3 & 8) != 0 && x340Var.g(yleVar2));
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new ole((bq11) this.u.getValue(), this.v, this.b.a(), this.s, this.l, this.c.a, vu30Var);
                x340Var.s0(objT3);
            }
            ole oleVar = (ole) objT3;
            boolean zI = x340Var.i(this);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new zle(this, (byte) 1);
                x340Var.s0(objT4);
            }
            dgo1.c("ChaptersBottomSheetPage", (iu30) objT4, apo.r(915810267, new hwd(this, yleVar2, oleVar, tyqVar), x340Var), x340Var, 390);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(this, yleVar2, qim0Var2, i, (byte) 15);
        }
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1889770389);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            w460 w460Var = new w460(this.d, false, false, false, (a1r0) null, 56);
            s460 s460Var = new s460(2, 748, cwl1.o0(x340Var, 2131952587), (String) null, (String) null, (String) null, false);
            qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), null, 3);
            uwr uwrVar = cbx.a;
            otw.c(w460Var, s460Var, uyn1.z(cbx.b(x340Var).e.a(), 0.0f, 2, qim0VarZ), null, x340Var, 8, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bme(this, i);
        }
    }
}
