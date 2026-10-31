package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fu1 {
    public final String a;
    public final fo1 b;
    public final boolean c;
    public final long d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final ma61 h;
    public final pia1 i;
    public final boolean j;
    public final c380 k;
    public final c380 l;
    public final gy1 m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f40p;
    public final boolean q;
    public final wka1 r;
    public final Set s;

    public fu1(String str, fo1 fo1Var, boolean z, long j, int i, boolean z2, boolean z3, ma61 ma61Var, pia1 pia1Var, boolean z4, c380 c380Var, c380 c380Var2, gy1 gy1Var, boolean z5, boolean z6, Set set, boolean z7, wka1 wka1Var, Set set2) {
        this.a = str;
        this.b = fo1Var;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = z2;
        this.g = z3;
        this.h = ma61Var;
        this.i = pia1Var;
        this.j = z4;
        this.k = c380Var;
        this.l = c380Var2;
        this.m = gy1Var;
        this.n = z5;
        this.o = z6;
        this.f40p = set;
        this.q = z7;
        this.r = wka1Var;
        this.s = set2;
    }

    public static cq1 a(fu1 fu1Var, boolean z, gv1 gv1Var, int i) {
        if ((i & 2) != 0) {
            gv1Var = fv1.a;
        }
        return fu1Var.g ? new up1(gv1Var) : new bp1(z);
    }

    public static fu1 b(fu1 fu1Var, String str, fo1 fo1Var, boolean z, long j, int i, boolean z2, ma61 ma61Var, pia1 pia1Var, c380 c380Var, c380 c380Var2, boolean z3, Set set, boolean z4, wka1 wka1Var, Set set2, int i2) {
        String str2 = (i2 & 1) != 0 ? fu1Var.a : str;
        fo1 fo1Var2 = (i2 & 2) != 0 ? fu1Var.b : fo1Var;
        boolean z5 = (i2 & 4) != 0 ? fu1Var.c : z;
        long j2 = (i2 & 8) != 0 ? fu1Var.d : j;
        int i3 = (i2 & 16) != 0 ? fu1Var.e : i;
        boolean z6 = (i2 & 32) != 0 ? fu1Var.f : z2;
        boolean z7 = fu1Var.g;
        ma61 ma61Var2 = (i2 & 128) != 0 ? fu1Var.h : ma61Var;
        pia1 pia1Var2 = (i2 & 256) != 0 ? fu1Var.i : pia1Var;
        boolean z8 = (i2 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? fu1Var.j : true;
        c380 c380Var3 = (i2 & 1024) != 0 ? fu1Var.k : c380Var;
        c380 c380Var4 = (i2 & 2048) != 0 ? fu1Var.l : c380Var2;
        fu1Var.getClass();
        gy1 gy1Var = fu1Var.m;
        boolean z9 = fu1Var.n;
        boolean z10 = (i2 & 32768) != 0 ? fu1Var.o : z3;
        Set set3 = (i2 & 65536) != 0 ? fu1Var.f40p : set;
        fu1Var.getClass();
        boolean z11 = (i2 & 262144) != 0 ? fu1Var.q : z4;
        wka1 wka1Var2 = (i2 & 524288) != 0 ? fu1Var.r : wka1Var;
        Set set4 = (i2 & 1048576) != 0 ? fu1Var.s : set2;
        fu1Var.getClass();
        return new fu1(str2, fo1Var2, z5, j2, i3, z6, z7, ma61Var2, pia1Var2, z8, c380Var3, c380Var4, gy1Var, z9, z10, set3, z11, wka1Var2, set4);
    }

    public static int i(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            nt1 nt1Var = (pt1) it.next();
            int iC = 1;
            if (nt1Var instanceof nt1) {
                nt1 nt1Var2 = nt1Var;
                iC = 1 + nt1Var2.c() + nt1Var2.d();
            }
            i += iC;
        }
        return i;
    }

    public final fu1 c(iu30 iu30Var, iu30 iu30Var2) {
        ma61 ma61Var = this.h;
        Set setO1 = o7h.o1(ma61Var.j().j());
        c380<ot1> c380Var = this.k;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        for (ot1 ot1VarG : c380Var) {
            if ((ot1VarG instanceof ot1) && ((Boolean) iu30Var.invoke(ot1VarG)).booleanValue()) {
                ot1 ot1Var = ot1VarG;
                boolean zBooleanValue = ((Boolean) iu30Var2.invoke(Boolean.valueOf(ot1Var.b()))).booleanValue();
                if (zBooleanValue) {
                    setO1.remove(ot1Var.getUri());
                } else {
                    setO1.add(ot1Var.getUri());
                }
                ot1VarG = ot1.g(ot1Var, zBooleanValue, 32751);
            }
            arrayList.add(ot1VarG);
        }
        Set setO2 = o7h.o1(ma61Var.b().j());
        c380<ot1> c380Var2 = this.l;
        ArrayList arrayList2 = new ArrayList(q7h.U(c380Var2, 10));
        for (ot1 ot1VarG2 : c380Var2) {
            if ((ot1VarG2 instanceof ot1) && ((Boolean) iu30Var.invoke(ot1VarG2)).booleanValue()) {
                ot1 ot1Var2 = ot1VarG2;
                boolean zBooleanValue2 = ((Boolean) iu30Var2.invoke(Boolean.valueOf(ot1Var2.b()))).booleanValue();
                if (zBooleanValue2) {
                    setO2.add(ot1Var2.getUri());
                } else {
                    setO2.remove(ot1Var2.getUri());
                }
                ot1VarG2 = ot1.g(ot1Var2, zBooleanValue2, 32751);
            }
            arrayList2.add(ot1VarG2);
        }
        return b(this, null, null, false, 0L, 0, false, ma61.a(ma61Var, new stu0(setO2), new ttu0(setO1), (hlg1) null, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 124), null, mqo1.A(arrayList), mqo1.A(arrayList2), false, null, false, null, null, 2093951);
    }

    public final Set d() {
        xj61 xj61Var = new xj61();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.k) {
            if (obj instanceof ot1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ot1) obj2).b()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ot1) it.next()).getUri());
        }
        xj61Var.addAll(arrayList3);
        ma61 ma61Var = this.h;
        xj61Var.addAll(ma61Var.b().j());
        return b9p1.u(this.m, cwl1.j(xj61Var), ma61Var.g());
    }

    public final eu1 e() {
        if (this.k.size() + this.l.size() > 0) {
            return zt1.a;
        }
        if (this.a.length() > 0) {
            return new xt1(bu1.c);
        }
        if (fo1.a(this.b) != null) {
            return new xt1(au1.c);
        }
        return this.c ? yt1.a : new xt1(cu1.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu1)) {
            return false;
        }
        fu1 fu1Var = (fu1) obj;
        return u890.j(this.a, fu1Var.a) && this.b.equals(fu1Var.b) && this.c == fu1Var.c && this.d == fu1Var.d && this.e == fu1Var.e && this.f == fu1Var.f && this.g == fu1Var.g && this.h.equals(fu1Var.h) && this.i == fu1Var.i && this.j == fu1Var.j && u890.j(this.k, fu1Var.k) && u890.j(this.l, fu1Var.l) && u890.j(this.m, fu1Var.m) && this.n == fu1Var.n && this.o == fu1Var.o && u890.j(this.f40p, fu1Var.f40p) && this.q == fu1Var.q && u890.j(this.r, fu1Var.r) && u890.j(this.s, fu1Var.s);
    }

    public final boolean f() {
        if (this.c) {
            return this.k.size() + this.l.size() == 0 && this.a.length() == 0;
        }
        return false;
    }

    public final boolean g(String str) {
        Object next;
        Iterator it = o7h.p1(o7h.N0(this.l, this.k)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((pt1) next).getUri(), str));
        pt1 pt1Var = (pt1) next;
        if (pt1Var != null) {
            return pt1Var.b();
        }
        return false;
    }

    public final boolean h(boolean z) {
        if (!z) {
            return false;
        }
        if (fo1.a(this.b) == null) {
            if (i(this.k) + i(this.l) >= 6) {
                return true;
            }
        }
        return this.a.length() > 0;
    }

    public final int hashCode() {
        return this.s.hashCode() + ((this.r.hashCode() + xcg1.g(xcg1.g(gvg.c(xcg1.g(xcg1.g((this.m.hashCode() + kaa0.f(6, kk0.f(this.l, kk0.f(this.k, xcg1.g((this.i.hashCode() + ((this.h.hashCode() + xcg1.g(xcg1.g(ab80.k(this.e, cy30.f(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31), 31), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j), 31), 31), 31)) * 31, 31, this.n), 31, this.o), 31, this.f40p), 31, false), 31, this.q)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[SYNTHETIC] */
    public final fu1 j(go1 go1Var) {
        ot1 ot1Var;
        if (go1Var == null) {
            return this;
        }
        List list = go1Var.d;
        List list2 = go1Var.c;
        if (this.m instanceof by1) {
            return b(this, null, null, false, 0L, 0, go1Var.e, null, go1Var.a, mqo1.A(list2), mqo1.A(list), false, go1Var.f, false, null, null, 2028251);
        }
        ma61 ma61Var = this.h;
        Set setJ = ma61Var.b().j();
        List<ot1> list3 = list2;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        for (ot1 ot1VarG : list3) {
            boolean z = ot1VarG instanceof ot1;
            if (z) {
                ot1 ot1Var2 = ot1VarG;
                if (ma61Var.j().j().contains(ot1Var2.getUri())) {
                    ot1VarG = ot1.g(ot1Var2, false, 32751);
                } else if (z) {
                    ot1Var = ot1VarG;
                    if (setJ.contains(ot1Var.getUri())) {
                        ot1VarG = ot1.g(ot1Var, true, 32751);
                    }
                }
            } else if (z) {
                ot1Var = ot1VarG;
                if (setJ.contains(ot1Var.getUri())) {
                    ot1VarG = ot1.g(ot1Var, true, 32751);
                }
            }
            arrayList.add(ot1VarG);
        }
        List<ot1> list4 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
        for (ot1 ot1VarG2 : list4) {
            if (ot1VarG2 instanceof ot1) {
                ot1 ot1Var3 = ot1VarG2;
                if (setJ.contains(ot1Var3.getUri())) {
                    ot1VarG2 = ot1.g(ot1Var3, true, 32751);
                }
            }
            arrayList2.add(ot1VarG2);
        }
        return b(this, null, null, false, go1Var.b, 0, go1Var.e, null, go1Var.a, mqo1.A(arrayList), mqo1.A(arrayList2), false, go1Var.f, false, null, null, 2028243);
    }
}
