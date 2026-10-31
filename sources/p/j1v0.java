package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j1v0 {
    public final idd1 A;
    public final idd1 B;
    public final idd1 C;
    public final q8n a;
    public final wen0 b;
    public final wmy c;
    public final boolean d;
    public final any e;
    public final ArrayList f;
    public final ve01 g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final int k;
    public final int l;
    public final boolean m;
    public LinkedHashMap n;
    public LinkedHashMap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedHashMap f17p;
    public LinkedHashMap q;
    public LinkedHashMap r;
    public final idd1 s;
    public final idd1 t;
    public final idd1 u;
    public final idd1 v;
    public final idd1 w;
    public final idd1 x;
    public final idd1 y;
    public final idd1 z;

    public j1v0(v9q v9qVar, q8n q8nVar, oq4 oq4Var, wen0 wen0Var, wmy wmyVar, boolean z, any anyVar, ArrayList arrayList, ve01 ve01Var, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = q8nVar;
        this.b = wen0Var;
        this.c = wmyVar;
        this.d = z;
        this.e = anyVar;
        this.f = arrayList;
        this.g = ve01Var;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = arrayList4;
        int iB = oq4Var.b();
        this.k = iB;
        this.l = (int) (((double) iB) * 0.4d);
        this.m = oq4Var.a();
        this.s = new idd1(new r0v0(this, (byte) 3));
        this.t = new idd1(new r0v0(this, (byte) 0));
        this.u = new idd1(new r0v0(this, (byte) 1));
        this.v = new idd1(new r0v0(v9qVar, this));
        this.w = new idd1(new r0v0(this, (byte) 7));
        this.x = new idd1(new r0v0(this, (byte) 5));
        this.y = new idd1(new r0v0(this, (byte) 10));
        this.z = new idd1(new r0v0(this, (byte) 8));
        this.A = new idd1(new r0v0(this, (byte) 9));
        this.B = new idd1(new r0v0(this, (byte) 6));
        this.C = new idd1(new r0v0(this, (byte) 4));
    }

    public final boolean a(xe91 xe91Var) {
        l381 l381VarC = xe91Var.c();
        i1r i1rVarB = ((rzq) this.c.d).b(l381VarC.b().a(rih1.a));
        return (i1rVarB instanceof i1r) && l381VarC.t(i1rVarB.a);
    }

    public final String b(hwq hwqVar) {
        Object next;
        if (this.d) {
            return c(i2p1.u(hwqVar));
        }
        Iterator it = this.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((zqw) ((s1v0) next).b).d(hwqVar));
        if (next != null) {
            return ((s1v0) next).a;
        }
        hhg1.n("There is no row that can handle, this is impossible.");
        return null;
    }

    public final String c(vhc1 vhc1Var) {
        Object next;
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            m381 m381VarC = ((zqw) ((s1v0) next).b).c();
            i1r i1rVarB = ((rzq) this.c.d).b(m381VarC.b().a(vhc1Var));
            if ((i1rVarB instanceof i1r) && m381VarC.r(vhc1Var, i1rVarB.a)) {
                break;
            }
        }
        if (next != null) {
            return ((s1v0) next).a;
        }
        hhg1.n("There is no row that can handle, this is impossible.");
        return null;
    }

    public final String d(hwq hwqVar, x340 x340Var) {
        Object obj = fkj0.X;
        x340Var.i0(-700200824);
        if (!this.d) {
            x340Var.i0(973491040);
            boolean zG = x340Var.g(hwqVar);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = b(hwqVar);
                x340Var.s0(objT);
            }
            String str = (String) objT;
            x340Var.r(false);
            x340Var.r(false);
            return str;
        }
        x340Var.i0(973546778);
        x340Var.r(false);
        boolean zG2 = x340Var.g(hwqVar);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == obj) {
            objT2 = i2p1.u(hwqVar);
            x340Var.s0(objT2);
        }
        vhc1 vhc1Var = (vhc1) objT2;
        boolean zG3 = x340Var.g(vhc1Var);
        Object objT3 = x340Var.T();
        if (zG3 || objT3 == obj) {
            objT3 = v8r.q(c(vhc1Var));
            x340Var.s0(objT3);
        }
        ven0 ven0Var = (ven0) objT3;
        boolean zI = x340Var.i(this) | x340Var.i(vhc1Var) | x340Var.g(ven0Var);
        Object objT4 = x340Var.T();
        if (zI || objT4 == obj) {
            ary aryVar = new ary(this, vhc1Var, ven0Var, (lnm) null, (byte) 28);
            x340Var.s0(aryVar);
            objT4 = aryVar;
        }
        qxd0.t(vhc1Var, x340Var, (vu30) objT4);
        String str2 = (String) ven0Var.getValue();
        x340Var.r(false);
        return str2;
    }

    public final mr20 e(String str, tf51 tf51Var) {
        lnm lnmVar = null;
        if (this.m && (tf51Var instanceof xe91)) {
            return h4p1.g(new k1e0((Object) this, tf51Var, lnmVar, (byte) 27));
        }
        LinkedHashMap linkedHashMap = this.r;
        if (linkedHashMap == null) {
            u890.C("allSectionElementsAndCompanions");
            throw null;
        }
        Object obj = linkedHashMap.get(str);
        obj.getClass();
        return ((wtw) obj).a;
    }
}
