package p;

import android.app.Application;
import com.google.android.recaptcha.internal.zzhm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ieo1 extends cwn1 {
    public final Application b;
    public final ghk1 c;
    public final brk1 d;
    public svh0 e;
    public List g;
    public s2t h;
    public yln1 i;
    public final i25 j;
    public boolean l;
    public final aje0 m;
    public final utw0 n;
    public final vfo1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qeh1 f13p;
    public final HashMap f = new HashMap();
    public final xgn0 k = ygn0.a();

    public ieo1(Application application, qeh1 qeh1Var, qdn1 qdn1Var, vfo1 vfo1Var, ghk1 ghk1Var, aje0 aje0Var, utw0 utw0Var, brk1 brk1Var) {
        this.b = application;
        this.f13p = qeh1Var;
        this.o = vfo1Var;
        this.c = ghk1Var;
        this.m = aje0Var;
        this.n = utw0Var;
        this.d = brk1Var;
        this.j = new i25(application, qeh1Var.a(), new utw0());
    }

    public static final pmn1 j(String str, inn1 inn1Var) {
        kmn1 kmn1VarX = pmn1.x();
        kmn1VarX.h(str);
        gmn1 gmn1VarX = hmn1.x();
        gmn1VarX.d();
        ((hmn1) gmn1VarX.b).y(inn1Var);
        kmn1VarX.d();
        ((pmn1) kmn1VarX.b).D((hmn1) gmn1VarX.e());
        return (pmn1) kmn1VarX.e();
    }

    public static final void k(ieo1 ieo1Var, cnn1 cnn1Var) throws zzhm {
        try {
            svh0 svh0Var = (svh0) ieo1Var.c.b;
            ieo1Var.e = svh0Var;
            byte[] bArrZ = cnn1Var.x().z();
            ((ejn1) svh0Var.c).c.c = tdp1.e(bArrZ);
            svh0 svh0Var2 = ieo1Var.e;
            if (svh0Var2 == null) {
                svh0Var2 = null;
            }
            svh0Var2.w();
        } catch (Exception e) {
            throw new zzhm(tgo1.c, ij81.J1, e.getMessage(), e);
        }
    }

    public final qwo1 a(yln1 yln1Var) {
        return new qwo1(new l3g1(this, yln1Var, (lnm) null, (byte) 20));
    }

    public final qwo1 b(String str, sln1 sln1Var) {
        return new qwo1(new l3g1(this, str, (lnm) null, (byte) 19));
    }

    public final Object c(String str) {
        hnn1 hnn1VarA = inn1.A();
        hnn1VarA.h(str);
        return j(str, (inn1) hnn1VarA.e());
    }

    public final int d() {
        return 43;
    }

    public final int e() {
        return 44;
    }

    public final s2t f(Long l, Optional optional) {
        return fn31.q(((pjo1) this.f13p.b).e.a, (o8n) null, 0, new mxj1(l, this, optional, (lnm) null, (byte) 14), 3);
    }

    public final void g(swo1 swo1Var) throws zzhm {
        HashMap map = this.f;
        Application application = this.b;
        map.put(120, application);
        map.put(416, "18.9.3");
        map.put(518, swo1Var.d);
        map.put(620, ghk1.n());
        map.put(722, swo1Var.c);
        aje0 aje0Var = this.m;
        map.put(824, Integer.valueOf(aje0Var.m() - 2));
        map.put(926, application.getPackageName());
        map.put(1028, Boolean.valueOf(aje0Var.j()));
        map.put(1130, Boolean.valueOf(aje0Var.k()));
        map.put(1232, aje0Var.l());
        map.put(2044, xbo1.class.getMethod("zzb", new Object[0].getClass()));
        i25 i25Var = this.j;
        bbo1 bbo1Var = new bbo1(i25Var);
        gbo1 gbo1Var = new gbo1(i25Var);
        xao1 xao1Var = new xao1(i25Var);
        Iterator it = p7h.M(new xbo1[]{bbo1Var, gbo1Var, xao1Var}).iterator();
        while (it.hasNext()) {
            Object objZzb = ((xbo1) it.next()).zzb(new Object[]{new bco1()});
            if (!(objZzb instanceof Boolean) || !((Boolean) objZzb).booleanValue()) {
                throw new zzhm(tgo1.c, ij81.c2, null, null);
            }
        }
        map.put(3335, bbo1Var);
        map.put(3576, gbo1Var);
        map.put(3809, xao1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(onm onmVar) throws zzhm {
        lco1 lco1Var;
        ij81 ij81Var = ij81.K1;
        if (onmVar instanceof lco1) {
            lco1Var = (lco1) onmVar;
            int i = lco1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lco1Var.c = i - Integer.MIN_VALUE;
            } else {
                lco1Var = new lco1(this, onmVar);
            }
        } else {
            lco1Var = new lco1(this, onmVar);
        }
        Object objQ = lco1Var.a;
        int i2 = lco1Var.c;
        tgo1 tgo1Var = tgo1.c;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                s2t s2tVarF = f(null, Optional.empty());
                lco1Var.c = 1;
                objQ = s2tVarF.Q(lco1Var);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objQ);
            }
            Object obj = ((e331) objQ).a;
            hm5.M(obj);
            List list = obj instanceof List ? (List) obj : null;
            if (list == null || list.size() < 2) {
                throw new zzhm(tgo1Var, ij81Var, null, null);
            }
            return list;
        } catch (Exception e) {
            throw new zzhm(tgo1Var, ij81Var, e.getMessage(), e);
        }
    }

    public final void i(zwo1 zwo1Var) {
        ArrayList arrayList;
        Object next;
        Object next2;
        Object obj = this.f.get(314);
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(dnn1.A((byte[]) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Long lValueOf = Long.valueOf(((dnn1) obj2).x());
                Object arrayList2 = linkedHashMap.get(lValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(lValueOf, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            for (List list3 : linkedHashMap.values()) {
                Iterator it2 = list3.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((dnn1) next).B() != 3);
                dnn1 dnn1Var = (dnn1) next;
                Iterator it3 = list3.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((dnn1) next2).B() != 4);
                dnn1 dnn1Var2 = (dnn1) next2;
                if (dnn1Var != null && dnn1Var2 != null) {
                    int iC = dnn1Var.C() - 2;
                    int i = iC != 1 ? iC != 2 ? 2 : 46 : 47;
                    zkn1 zkn1VarD = aln1.D();
                    long jZ = dnn1Var2.z() - dnn1Var.z();
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).y(i);
                    String str = yuo1.d;
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).F(str);
                    String str2 = zwo1Var.d;
                    swo1 swo1Var = zwo1Var.c;
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).H(str2);
                    String str3 = swo1Var.d;
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).G(str3);
                    int i2 = swo1Var.e;
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).z(i2);
                    int iY = dnn1Var.y();
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).N(iY);
                    int iD = dnn1Var2.D() - 2;
                    int i3 = iD != 1 ? iD != 2 ? 2 : 4 : 3;
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).A(i3);
                    long jZ2 = dnn1Var.z();
                    akn1 akn1VarB = hkn1.b((int) (jZ2 % 1000000000), jZ2 / 1000000000);
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).L(akn1VarB);
                    gin1 gin1VarB = gkn1.b((int) (jZ % 1000000000), jZ / 1000000000);
                    zkn1VarD.d();
                    ((aln1) zkn1VarD.b).I(gin1VarB);
                    zwo1Var.c(zkn1VarD, null);
                }
            }
        }
    }
}
