package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bv11 {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;
    public final u380 e;
    public final int f;
    public final boolean g;
    public final c380 h;
    public final h540 i;
    public final vno1 j;
    public final c380 k;
    public final boo1 l;
    public final boolean m;
    public final String n;
    public final Long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f16p;
    public final o5a1 q;
    public final wqo r;
    public final bul s;
    public final po11 t;
    public final msv0 u;
    public final ati1 v;
    public final c380 w;
    public final String x;
    public final ktl y;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bv11(String str, String str2, Long l, Long l2, u380 u380Var, int i, boolean z, c380 c380Var, h540 h540Var, vno1 vno1Var, c380 c380Var2, boo1 boo1Var, boolean z2, String str3, Long l3, long j, o5a1 o5a1Var, wqo wqoVar, bul bulVar, po11 po11Var, msv0 msv0Var, ati1 ati1Var, c380 c380Var3, String str4, ktl ktlVar, int i2) {
        String str5 = (i2 & 2) != 0 ? null : str2;
        Long l4 = (i2 & 4) != 0 ? null : l;
        Long l5 = (i2 & 8) != 0 ? null : l2;
        u380 u380VarV = (i2 & 16) != 0 ? mqo1.v() : u380Var;
        int i3 = (i2 & 32) != 0 ? 0 : i;
        boolean z3 = (i2 & 64) != 0 ? false : z;
        int i4 = i2 & 128;
        c380 c380Var4 = fg91.b;
        this(str, str5, l4, l5, u380VarV, i3, z3, i4 != 0 ? c380Var4 : c380Var, (i2 & 256) != 0 ? null : h540Var, (i2 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : vno1Var, (i2 & 1024) != 0 ? null : c380Var2, (i2 & 2048) != 0 ? q17.c : boo1Var, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? null : str3, (i2 & 16384) != 0 ? null : l3, (32768 & i2) != 0 ? 0L : j, (65536 & i2) != 0 ? null : o5a1Var, (131072 & i2) != 0 ? null : wqoVar, (262144 & i2) != 0 ? null : bulVar, (524288 & i2) != 0 ? null : po11Var, (1048576 & i2) != 0 ? null : msv0Var, (2097152 & i2) != 0 ? null : ati1Var, (4194304 & i2) != 0 ? c380Var4 : c380Var3, (8388608 & i2) != 0 ? null : str4, (i2 & 16777216) != 0 ? null : ktlVar);
    }

    public static bv11 b(bv11 bv11Var, po11 po11Var, c380 c380Var, int i) {
        String str = bv11Var.a;
        String str2 = bv11Var.b;
        Long l = bv11Var.c;
        Long l2 = bv11Var.d;
        u380 u380Var = bv11Var.e;
        int i2 = bv11Var.f;
        boolean z = bv11Var.g;
        c380 c380Var2 = bv11Var.h;
        h540 h540Var = bv11Var.i;
        vno1 vno1Var = bv11Var.j;
        c380 c380Var3 = bv11Var.k;
        boo1 boo1Var = bv11Var.l;
        boolean z2 = bv11Var.m;
        String str3 = bv11Var.n;
        Long l3 = bv11Var.o;
        long j = bv11Var.f16p;
        o5a1 o5a1Var = bv11Var.q;
        wqo wqoVar = bv11Var.r;
        bul bulVar = bv11Var.s;
        po11 po11Var2 = (i & 524288) != 0 ? bv11Var.t : po11Var;
        msv0 msv0Var = (i & 1048576) != 0 ? bv11Var.u : null;
        ati1 ati1Var = bv11Var.v;
        c380 c380Var4 = (i & 4194304) != 0 ? bv11Var.w : c380Var;
        String str4 = bv11Var.x;
        ktl ktlVar = bv11Var.y;
        bv11Var.getClass();
        bv11Var.getClass();
        return new bv11(str, str2, l, l2, u380Var, i2, z, c380Var2, h540Var, vno1Var, c380Var3, boo1Var, z2, str3, l3, j, o5a1Var, wqoVar, bulVar, po11Var2, msv0Var, ati1Var, c380Var4, str4, ktlVar);
    }

    public final n4m a() {
        Object obj;
        c380 c380Var = this.h;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            arrayList.add(k4p1.j((ell) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int i = k4p1.i((n4m) next);
                do {
                    Object next2 = it2.next();
                    int i2 = k4p1.i((n4m) next2);
                    if (i > i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        n4m n4mVar = (n4m) obj;
        return n4mVar == null ? n4m.c : n4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv11)) {
            return false;
        }
        bv11 bv11Var = (bv11) obj;
        return u890.j(this.a, bv11Var.a) && u890.j(this.b, bv11Var.b) && u890.j(this.c, bv11Var.c) && u890.j(this.d, bv11Var.d) && u890.j(this.e, bv11Var.e) && this.f == bv11Var.f && this.g == bv11Var.g && u890.j(this.h, bv11Var.h) && u890.j(this.i, bv11Var.i) && u890.j(this.j, bv11Var.j) && u890.j(this.k, bv11Var.k) && u890.j(this.l, bv11Var.l) && this.m == bv11Var.m && u890.j(this.n, bv11Var.n) && u890.j(this.o, bv11Var.o) && this.f16p == bv11Var.f16p && u890.j(this.q, bv11Var.q) && u890.j(this.r, bv11Var.r) && u890.j(this.s, bv11Var.s) && u890.j(this.t, bv11Var.t) && u890.j(this.u, bv11Var.u) && u890.j(this.v, bv11Var.v) && u890.j(this.w, bv11Var.w) && u890.j(this.x, bv11Var.x) && this.y == bv11Var.y;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        int i = this.f;
        int iF = kk0.f(this.h, xcg1.g((iHashCode4 + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.g), 31);
        h540 h540Var = this.i;
        int iHashCode5 = (iF + (h540Var == null ? 0 : h540Var.hashCode())) * 31;
        vno1 vno1Var = this.j;
        int iHashCode6 = (iHashCode5 + (vno1Var == null ? 0 : vno1Var.hashCode())) * 31;
        c380 c380Var = this.k;
        int iG = xcg1.g((this.l.hashCode() + ((iHashCode6 + (c380Var == null ? 0 : c380Var.hashCode())) * 31)) * 31, 31, this.m);
        String str2 = this.n;
        int iHashCode7 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.o;
        int iF2 = cy30.f((iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31, this.f16p, 31);
        o5a1 o5a1Var = this.q;
        int iHashCode8 = (iF2 + (o5a1Var == null ? 0 : o5a1Var.hashCode())) * 31;
        wqo wqoVar = this.r;
        int iHashCode9 = (iHashCode8 + (wqoVar == null ? 0 : wqoVar.hashCode())) * 31;
        bul bulVar = this.s;
        int iHashCode10 = (iHashCode9 + (bulVar == null ? 0 : bulVar.hashCode())) * 31;
        po11 po11Var = this.t;
        int iHashCode11 = (iHashCode10 + (po11Var == null ? 0 : po11Var.hashCode())) * 31;
        msv0 msv0Var = this.u;
        int iHashCode12 = (iHashCode11 + (msv0Var == null ? 0 : msv0Var.hashCode())) * 31;
        ati1 ati1Var = this.v;
        int iF3 = kk0.f(this.w, (iHashCode12 + (ati1Var == null ? 0 : ati1Var.hashCode())) * 31, 31);
        String str3 = this.x;
        int iHashCode13 = (iF3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ktl ktlVar = this.y;
        return (iHashCode13 + (ktlVar != null ? ktlVar.hashCode() : 0)) * 31;
    }

    public bv11(String str, String str2, Long l, Long l2, u380 u380Var, int i, boolean z, c380 c380Var, h540 h540Var, vno1 vno1Var, c380 c380Var2, boo1 boo1Var, boolean z2, String str3, Long l3, long j, o5a1 o5a1Var, wqo wqoVar, bul bulVar, po11 po11Var, msv0 msv0Var, ati1 ati1Var, c380 c380Var3, String str4, ktl ktlVar) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = u380Var;
        this.f = i;
        this.g = z;
        this.h = c380Var;
        this.i = h540Var;
        this.j = vno1Var;
        this.k = c380Var2;
        this.l = boo1Var;
        this.m = z2;
        this.n = str3;
        this.o = l3;
        this.f16p = j;
        this.q = o5a1Var;
        this.r = wqoVar;
        this.s = bulVar;
        this.t = po11Var;
        this.u = msv0Var;
        this.v = ati1Var;
        this.w = c380Var3;
        this.x = str4;
        this.y = ktlVar;
    }
}
