package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cqu {
    public static final LinkedHashSet v;
    public static final Map w;
    public ala1 a;
    public boolean e;
    public boolean i;
    public final ArrayList j;
    public final qpp0 k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final HashSet o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5p;
    public final int q;
    public final ypu r;
    public final ArrayList t;
    public final ArrayList u;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public final p321 s = new p321((byte) 1);

    static {
        Object[] objArr = {t6b.class, y360.class, vy10.class, w070.class, ife1.class, lmc0.class, r980.class};
        byte b = 7;
        ArrayList arrayList = new ArrayList(7);
        byte b2 = 0;
        for (int i = 0; i < 7; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        v = new LinkedHashSet(Collections.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(t6b.class, new u6b(b2));
        map.put(y360.class, new u6b((byte) 2));
        map.put(vy10.class, new u6b((byte) 1));
        map.put(w070.class, new u6b((byte) 3));
        map.put(ife1.class, new u6b(b));
        map.put(lmc0.class, new u6b((byte) 5));
        map.put(r980.class, new u6b((byte) 4));
        w = Collections.unmodifiableMap(map);
    }

    public cqu(ArrayList arrayList, qpp0 qpp0Var, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet) {
        ArrayList arrayList5 = new ArrayList();
        this.t = arrayList5;
        this.u = new ArrayList();
        this.j = arrayList;
        this.k = qpp0Var;
        this.l = arrayList2;
        this.m = arrayList3;
        this.n = arrayList4;
        this.o = hashSet;
        this.f5p = 1;
        this.q = Integer.MAX_VALUE;
        ypu ypuVar = new ypu((byte) 0);
        this.r = ypuVar;
        arrayList5.add(new bqu(ypuVar, 0));
    }

    public final void a(bqu bquVar) {
        s5 s5Var = bquVar.a;
        while (!g().c(s5Var.f())) {
            e(1);
        }
        g().f().b(s5Var.f());
        this.t.add(bquVar);
    }

    public final void b() {
        CharSequence charSequenceSubSequence;
        int i;
        sla1 sla1Var;
        int i2;
        boolean z = this.e;
        int i3 = this.c;
        ala1 ala1Var = this.a;
        if (z) {
            CharSequence charSequence = ala1Var.a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i3 + 1, charSequence.length());
            int i4 = 4 - (this.d % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i4);
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else if (i3 == 0) {
            charSequenceSubSequence = ala1Var.a;
        } else {
            CharSequence charSequence2 = ala1Var.a;
            charSequenceSubSequence = charSequence2.subSequence(i3, charSequence2.length());
        }
        g().a(new ala1(charSequenceSubSequence, (this.f5p != 3 || (i = this.c) >= (i2 = (sla1Var = this.a.b).d)) ? null : sla1Var.a(i, i2)));
        c();
    }

    public final void c() {
        int i = 1;
        if (this.f5p == 1) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                return;
            }
            bqu bquVar = (bqu) arrayList.get(i);
            int iMin = Math.min(bquVar.b, this.c);
            if (this.a.a.length() - iMin != 0) {
                s5 s5Var = bquVar.a;
                sla1 sla1Var = this.a.b;
                s5Var.b(sla1Var.a(iMin, sla1Var.d));
            }
            i++;
        }
    }

    public final void d() {
        char cCharAt = this.a.a.charAt(this.c);
        this.c++;
        int i = this.d;
        if (cCharAt == '\t') {
            this.d = (4 - (i % 4)) + i;
        } else {
            this.d = i + 1;
        }
    }

    public final void e(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = this.t;
            s5 s5Var = ((bqu) arrayList.remove(arrayList.size() - 1)).a;
            for (i4t i4tVar : s5Var.g()) {
                p321 p321Var = this.s;
                p321Var.getClass();
                HashMap map = p321Var.a;
                i4tVar.getClass();
                i4t i4tVar2 = (i4t) map.get(lkc0.class);
                if (i4tVar2 == null) {
                    map.put(lkc0.class, i4tVar);
                } else {
                    for (Map.Entry entry : i4tVar.a.entrySet()) {
                        i4tVar2.a.putIfAbsent((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            s5Var.e();
            this.u.add(s5Var);
        }
    }

    public final void f() {
        int i = this.c;
        int i2 = this.d;
        this.i = true;
        int length = this.a.a.length();
        while (i < length) {
            char cCharAt = this.a.a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.i = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f = i;
        this.g = i2;
        this.h = i2 - this.d;
    }

    public final s5 g() {
        return ((bqu) l1d.i(1, this.t)).a;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    public final void h(int i, String str) {
        ArrayList arrayList;
        y6b y6bVarA;
        List listUnmodifiableList;
        String strReplace = str;
        this.b++;
        int i2 = 0;
        this.c = 0;
        this.d = 0;
        this.e = false;
        int i3 = -1;
        if (strReplace.indexOf(0) != -1) {
            strReplace = strReplace.replace((char) 0, (char) 65533);
        }
        this.a = new ala1(strReplace, this.f5p != 1 ? new sla1(this.b, 0, i, strReplace.length()) : null);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            arrayList = this.t;
            if (i4 >= arrayList.size()) {
                break;
            }
            bqu bquVar = (bqu) arrayList.get(i4);
            s5 s5Var = bquVar.a;
            f();
            jwg jwgVarJ = s5Var.j(this);
            if (jwgVarJ == null) {
                break;
            }
            bquVar.b = this.c;
            if (jwgVarJ.c) {
                c();
                e(arrayList.size() - i4);
                return;
            }
            int i6 = jwgVarJ.a;
            if (i6 != -1) {
                j(i6);
            } else {
                int i7 = jwgVarJ.b;
                if (i7 != -1) {
                    i(i7);
                }
            }
            i5++;
            i4++;
        }
        int size = arrayList.size() - i5;
        s5Var = ((bqu) arrayList.get(i5 - 1)).a;
        int i8 = this.c;
        boolean zH = (s5Var.f() instanceof oor0) || s5Var.h();
        boolean z = false;
        while (zH) {
            i8 = this.c;
            f();
            if (this.i || (this.h < 4 && Character.isLetter(Character.codePointAt(this.a.a, this.f)))) {
                j(this.f);
                break;
            }
            if (arrayList.size() > this.q) {
                y6bVarA = null;
                break;
            }
            lqr lqrVar = new lqr(s5Var, (byte) 17);
            Iterator it = this.j.iterator();
            do {
                if (!it.hasNext()) {
                    y6bVarA = null;
                    break;
                }
                y6bVarA = ((s6b) it.next()).a(this, lqrVar);
            } while (y6bVarA == null);
            if (y6bVarA == null) {
                j(this.f);
                break;
            }
            int i9 = this.c;
            if (size > 0) {
                e(size);
                size = i2;
            }
            int i10 = y6bVarA.a;
            if (i10 != i3) {
                j(i10);
            } else {
                int i11 = y6bVarA.b;
                if (i11 != i3) {
                    i(i11);
                }
            }
            if (y6bVarA.c < 1) {
                listUnmodifiableList = null;
            } else {
                s5 s5VarG = g();
                if (s5VarG instanceof zor0) {
                    int i12 = y6bVarA.c;
                    mkc0 mkc0Var = ((zor0) s5VarG).b;
                    ArrayList arrayList2 = mkc0Var.d;
                    listUnmodifiableList = Collections.unmodifiableList(new ArrayList(arrayList2.subList(Math.max(arrayList2.size() - i12, i2), arrayList2.size())));
                    ArrayList arrayList3 = mkc0Var.b;
                    if (i12 >= arrayList3.size()) {
                        arrayList3.clear();
                    } else {
                        for (int i13 = 0; i13 < i12; i13++) {
                            arrayList3.remove(arrayList3.size() - 1);
                        }
                    }
                    if (i12 >= arrayList2.size()) {
                        arrayList2.clear();
                    } else {
                        for (int i14 = 0; i14 < i12; i14++) {
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                    e(1);
                } else {
                    listUnmodifiableList = null;
                }
            }
            for (s5 s5Var2 : (s5[]) y6bVarA.d) {
                a(new bqu(s5Var2, i9));
                if (listUnmodifiableList != null) {
                    s5Var2.f().e(listUnmodifiableList);
                }
                zH = s5Var2.h();
            }
            z = true;
            i2 = 0;
            i3 = -1;
        }
        if (!z && !this.i && g().d()) {
            ((bqu) l1d.i(1, arrayList)).b = i8;
            b();
            return;
        }
        if (size > 0) {
            e(size);
        }
        if (!s5Var2.h()) {
            b();
        } else if (this.i) {
            c();
        } else {
            a(new bqu(new zor0(), i8));
            b();
        }
    }

    public final void i(int i) {
        int i2;
        int i3 = this.g;
        if (i >= i3) {
            this.c = this.f;
            this.d = i3;
        }
        int length = this.a.a.length();
        while (true) {
            i2 = this.d;
            if (i2 >= i || this.c == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.e = false;
            return;
        }
        this.c--;
        this.d = i;
        this.e = true;
    }

    public final void j(int i) {
        int i2 = this.f;
        if (i >= i2) {
            this.c = i2;
            this.d = this.g;
        }
        int length = this.a.a.length();
        while (true) {
            int i3 = this.c;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.e = false;
    }
}
