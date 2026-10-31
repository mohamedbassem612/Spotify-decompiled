package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ycm1 {
    public final qem1 a;
    public final vu30 b;
    public final ArrayList c;
    public aof1 d;
    public final adm1 e;
    public final LinkedHashSet f;
    public final bpb1 g;
    public final LinkedHashSet h;
    public final LinkedHashSet i;
    public m3c j;
    public float k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xe01 f83p;
    public boolean q;

    public ycm1(Context context, qem1 qem1Var, List list, boolean z) {
        yd2 yd2Var = new yd2(context.getApplicationContext(), (byte) 9);
        this.a = qem1Var;
        this.b = yd2Var;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((cdm1) obj).a)) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        cdm1 cdm1Var = (cdm1) o7h.s0(arrayList);
        this.d = cdm1Var != null ? cdm1Var.a : null;
        this.e = new adm1();
        this.f = new LinkedHashSet();
        bpb1 bpb1VarB = gio1.b(w7x.a);
        this.g = bpb1VarB;
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        this.o = true;
        this.f83p = d5p1.h(bpb1VarB);
        this.q = z;
    }

    public final hth0 a(cdm1 cdm1Var) {
        ycm1 ycm1Var;
        cdm1 cdm1Var2;
        l811 l811Var = new l811();
        l811 l811Var2 = new l811();
        try {
            ycm1Var = this;
            cdm1Var2 = cdm1Var;
            try {
                hth0 hth0Var = (hth0) this.b.invoke(cdm1Var2, new m9i1(l811Var2, l811Var, ycm1Var, cdm1Var2, (byte) 9));
                l811Var2.a = true;
                if (!l811Var.a) {
                    return hth0Var;
                }
                hth0Var.release();
                return null;
            } catch (Exception e) {
                e = e;
                Logger.e(e, "Places track preview creation failed", new Object[0]);
                ycm1Var.c(cdm1Var2, wtf1.b);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            ycm1Var = this;
            cdm1Var2 = cdm1Var;
        }
    }

    public final ww7 b() {
        Object next;
        zcm1 zcm1Var;
        boolean z = this.q;
        Object obj = null;
        LinkedHashSet linkedHashSet = this.f;
        if (z) {
            for (Object obj2 : e()) {
                if (linkedHashSet.contains((cdm1) obj2)) {
                    obj = obj2;
                    break;
                }
            }
            cdm1 cdm1Var = (cdm1) obj;
            return cdm1Var != null ? new ww7(Collections.singletonMap(new xcm1(cdm1Var), Float.valueOf(1.0f))) : new ww7(b7x.a);
        }
        float f = this.k;
        mf20 mf20Var = new mf20(z561.T(new waf1((byte) 13, f), new sgg1(new yvf1(this.e, (byte) 21), new i46(linkedHashSet, (byte) 1))));
        if (mf20Var.hasNext()) {
            next = mf20Var.next();
            if (mf20Var.hasNext()) {
                float fAbs = Math.abs(f - ((Number) ((mmr0) next).b).floatValue());
                do {
                    Object next2 = mf20Var.next();
                    float fAbs2 = Math.abs(f - ((Number) ((mmr0) next2).b).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (mf20Var.hasNext());
            }
        } else {
            next = null;
        }
        mmr0 mmr0Var = (mmr0) next;
        if (mmr0Var != null) {
            mmr0 mmr0Var2 = ((Number) mmr0Var.b).floatValue() != 0.0f ? mmr0Var : null;
            if (mmr0Var2 != null) {
                float fMin = Math.min(1.0f, Math.abs(f) / Math.abs(((Number) mmr0Var2.b).floatValue()));
                if (fMin <= 0.16666667f) {
                    zcm1Var = new zcm1(1.0f, 0.0f);
                } else if (fMin >= 0.6666667f) {
                    zcm1Var = new zcm1(0.0f, 1.0f);
                } else {
                    double d = (((fMin - 0.16666667f) / 0.5f) * 3.1415927f) / 2.0f;
                    zcm1Var = new zcm1((float) Math.cos(d), (float) Math.sin(d));
                }
                return new ww7(sqg0.J(new mmr0[]{new mmr0(wcm1.a, Float.valueOf(zcm1Var.a)), new mmr0(new xcm1((cdm1) mmr0Var2.a), Float.valueOf(zcm1Var.b))}));
            }
        }
        return bdm1.a;
    }

    public final void c(cdm1 cdm1Var, wtf1 wtf1Var) {
        int iOrdinal = wtf1Var.ordinal();
        LinkedHashSet linkedHashSet = this.f;
        LinkedHashSet linkedHashSet2 = this.i;
        if (iOrdinal == 0) {
            linkedHashSet.add(cdm1Var);
            linkedHashSet2.remove(cdm1Var);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            linkedHashSet2.add(cdm1Var);
            linkedHashSet.remove(cdm1Var);
            this.h.remove(cdm1Var);
            m3c m3cVar = this.j;
            if (m3cVar != null) {
                m3cVar.i(new xcm1(cdm1Var));
            }
            if (this.q) {
                g();
            }
        }
        f();
        h();
    }

    public final void d() {
        this.l = false;
        m3c m3cVar = this.j;
        if (m3cVar == null || m3cVar.b) {
            return;
        }
        Iterator it = ((LinkedHashMap) m3cVar.d).values().iterator();
        while (it.hasNext()) {
            ((hth0) it.next()).a();
        }
    }

    public final List e() {
        Object next;
        boolean z = this.q;
        ArrayList arrayList = this.c;
        if (!z) {
            return arrayList;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((cdm1) next).a == this.d) {
                return p7h.N(next);
            }
        }
        next = null;
        return p7h.N(next);
    }

    public final void f() {
        List listE = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (this.f.contains((cdm1) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((cdm1) it.next()).a);
        }
        this.g.m((Object) null, linkedHashSet);
    }

    public final void g() {
        hth0 hth0VarA;
        Object obj;
        Object next;
        boolean z = this.q;
        LinkedHashSet linkedHashSet = this.i;
        if (z) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((cdm1) next).a != this.d);
            if (o7h.i0(linkedHashSet, next)) {
                for (Object obj2 : arrayList) {
                    if (!linkedHashSet.contains((cdm1) obj2)) {
                        obj = obj2;
                        break;
                    }
                }
                cdm1 cdm1Var = (cdm1) obj;
                this.d = cdm1Var != null ? cdm1Var.a : this.d;
            }
        }
        m3c m3cVar = this.j;
        if (m3cVar == null) {
            return;
        }
        Set setP1 = o7h.p1(e());
        ArrayList<cdm1> arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet2 = this.h;
        for (Object obj3 : linkedHashSet2) {
            if (!setP1.contains((cdm1) obj3)) {
                arrayList2.add(obj3);
            }
        }
        for (cdm1 cdm1Var2 : arrayList2) {
            linkedHashSet2.remove(cdm1Var2);
            this.f.remove(cdm1Var2);
            m3cVar.i(new xcm1(cdm1Var2));
        }
        ArrayList<cdm1> arrayList3 = new ArrayList();
        for (Object obj4 : setP1) {
            cdm1 cdm1Var3 = (cdm1) obj4;
            if (!linkedHashSet2.contains(cdm1Var3) && !linkedHashSet.contains(cdm1Var3)) {
                arrayList3.add(obj4);
            }
        }
        for (cdm1 cdm1Var4 : arrayList3) {
            m3c m3cVar2 = this.j;
            if (m3cVar2 != null && (hth0VarA = a(cdm1Var4)) != null) {
                linkedHashSet2.add(cdm1Var4);
                m3cVar2.a(new xcm1(cdm1Var4), hth0VarA);
                if (this.l) {
                    hth0VarA.j();
                }
            }
        }
    }

    public final void h() {
        m3c m3cVar = this.j;
        if (m3cVar != null) {
            ww7 ww7VarB = b();
            if (m3cVar.b || ww7VarB.equals((ww7) m3cVar.e)) {
                return;
            }
            m3cVar.e = ww7VarB;
            m3cVar.b();
        }
    }
}
