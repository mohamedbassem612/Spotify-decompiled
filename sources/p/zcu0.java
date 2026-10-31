package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class zcu0 {
    public static final qcu0 Companion = new qcu0();
    public static final znb0[] r = {null, null, null, null, null, null, null, null, dm5.S(2, tnt0.N0), null, null, null, null, null, null, null, null};
    public final long a;
    public final String b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final float f;
    public final boolean g;
    public final Integer h;
    public final List i;
    public final ucu0 j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f153p;
    public final Long q;

    public /* synthetic */ zcu0(int i, long j, String str, Long l, Long l2, boolean z, float f, boolean z2, Integer num, List list, ucu0 ucu0Var, String str2, String str3, String str4, String str5, boolean z3, boolean z4, Long l3) {
        if (57457 != (i & 57457)) {
            o6p1.t(i, 57457, pcu0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        this.e = z;
        this.f = f;
        this.g = z2;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
            this.j = null;
        } else {
            this.j = ucu0Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        this.n = str5;
        this.o = z3;
        this.f153p = z4;
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = l3;
        }
    }

    public static zcu0 a(zcu0 zcu0Var, long j, Long l, Long l2, ucu0 ucu0Var, Long l3, int i) {
        return new zcu0((i & 1) != 0 ? zcu0Var.a : j, zcu0Var.b, (i & 4) != 0 ? zcu0Var.c : l, (i & 8) != 0 ? zcu0Var.d : l2, zcu0Var.e, zcu0Var.f, zcu0Var.g, zcu0Var.h, zcu0Var.i, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? zcu0Var.j : ucu0Var, zcu0Var.k, zcu0Var.l, zcu0Var.m, zcu0Var.n, zcu0Var.o, zcu0Var.f153p, (i & 65536) != 0 ? zcu0Var.q : l3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcu0)) {
            return false;
        }
        zcu0 zcu0Var = (zcu0) obj;
        return this.a == zcu0Var.a && u890.j(this.b, zcu0Var.b) && u890.j(this.c, zcu0Var.c) && u890.j(this.d, zcu0Var.d) && this.e == zcu0Var.e && Float.compare(this.f, zcu0Var.f) == 0 && this.g == zcu0Var.g && u890.j(this.h, zcu0Var.h) && u890.j(this.i, zcu0Var.i) && u890.j(this.j, zcu0Var.j) && u890.j(this.k, zcu0Var.k) && u890.j(this.l, zcu0Var.l) && u890.j(this.m, zcu0Var.m) && u890.j(this.n, zcu0Var.n) && this.o == zcu0Var.o && this.f153p == zcu0Var.f153p && u890.j(this.q, zcu0Var.q);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iG = xcg1.g(x0d.f(xcg1.g((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Integer num = this.h;
        int iHashCode4 = (iG + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.i;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ucu0 ucu0Var = this.j;
        int iHashCode6 = (iHashCode5 + (ucu0Var == null ? 0 : ucu0Var.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int iG2 = xcg1.g(xcg1.g(cy30.d((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.f153p);
        Long l3 = this.q;
        return iG2 + (l3 != null ? l3.hashCode() : 0);
    }

    public zcu0(long j, String str, Long l, Long l2, boolean z, float f, boolean z2, Integer num, List list, ucu0 ucu0Var, String str2, String str3, String str4, String str5, boolean z3, boolean z4, Long l3) {
        this.a = j;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = f;
        this.g = z2;
        this.h = num;
        this.i = list;
        this.j = ucu0Var;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = z3;
        this.f153p = z4;
        this.q = l3;
    }
}
