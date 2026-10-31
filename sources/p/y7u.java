package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class y7u {
    public static final x7u Companion = new x7u();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;
    public final String l;
    public final Integer m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f147p;
    public final String q;
    public final String r;
    public final String s;
    public final boolean t;

    public /* synthetic */ y7u(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8, int i3, String str9, String str10, Integer num, String str11, String str12, String str13, String str14, String str15, String str16, boolean z) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, w7u.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = "2.2.0";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        if ((i & 128) == 0) {
            this.h = "CASTVIDEO";
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = "FREE";
        } else {
            this.i = str8;
        }
        if ((i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
            this.j = 101;
        } else {
            this.j = i3;
        }
        if ((i & 1024) == 0) {
            this.k = "SU5WQUxJRA==";
        } else {
            this.k = str9;
        }
        if ((i & 2048) == 0) {
            this.l = "";
        } else {
            this.l = str10;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num;
        }
        if ((i & 8192) == 0) {
            this.n = "";
        } else {
            this.n = str11;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str12;
        }
        if ((32768 & i) == 0) {
            this.f147p = null;
        } else {
            this.f147p = str13;
        }
        this.q = (65536 & i) == 0 ? "cast-js" : str14;
        if ((131072 & i) == 0) {
            this.r = "";
        } else {
            this.r = str15;
        }
        if ((262144 & i) == 0) {
            this.s = "";
        } else {
            this.s = str16;
        }
        if ((i & 524288) == 0) {
            this.t = false;
        } else {
            this.t = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7u)) {
            return false;
        }
        y7u y7uVar = (y7u) obj;
        return u890.j(this.a, y7uVar.a) && u890.j(this.b, y7uVar.b) && u890.j(this.c, y7uVar.c) && u890.j(this.d, y7uVar.d) && u890.j(this.e, y7uVar.e) && u890.j(this.f, y7uVar.f) && this.g == y7uVar.g && u890.j(this.h, y7uVar.h) && u890.j(this.i, y7uVar.i) && this.j == y7uVar.j && u890.j(this.k, y7uVar.k) && u890.j(this.l, y7uVar.l) && u890.j(this.m, y7uVar.m) && u890.j(this.n, y7uVar.n) && u890.j(this.o, y7uVar.o) && u890.j(this.f147p, y7uVar.f147p) && u890.j(this.q, y7uVar.q) && u890.j(this.r, y7uVar.r) && u890.j(this.s, y7uVar.s) && this.t == y7uVar.t;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.j, cy30.d(cy30.d(kaa0.f(this.g, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l);
        Integer num = this.m;
        int iD2 = cy30.d((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.n);
        String str = this.o;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147p;
        return Boolean.hashCode(this.t) + cy30.d(cy30.d(cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.q), 31, this.r), 31, this.s);
    }

    public y7u(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = "google";
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = str6;
        this.i = str7;
        this.j = 101;
        this.k = "SU5WQUxJRA==";
        this.l = "";
        this.m = null;
        this.n = "";
        this.o = null;
        this.f147p = null;
        this.q = "cast-js";
        this.r = "";
        this.s = "";
        this.t = z;
    }
}
