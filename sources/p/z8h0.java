package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class z8h0 {
    public static final y8h0 Companion = new y8h0();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final double d;
    public final String e;
    public final long f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;

    public /* synthetic */ z8h0(int i, boolean z, boolean z2, String str, double d, String str2, long j, String str3, boolean z3, String str4, String str5) {
        if (170 != (i & 170)) {
            o6p1.t(i, 170, x8h0.a.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? true : z;
        this.b = z2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        this.d = d;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        this.f = j;
        if ((i & 64) == 0) {
            this.g = "ANDROID";
        } else {
            this.g = str3;
        }
        this.h = z3;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
        if ((i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8h0)) {
            return false;
        }
        z8h0 z8h0Var = (z8h0) obj;
        return this.a == z8h0Var.a && this.b == z8h0Var.b && u890.j(this.c, z8h0Var.c) && Double.compare(this.d, z8h0Var.d) == 0 && u890.j(this.e, z8h0Var.e) && this.f == z8h0Var.f && u890.j(this.g, z8h0Var.g) && this.h == z8h0Var.h && u890.j(this.i, z8h0Var.i) && u890.j(this.j, z8h0Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iE = xcg1.e(this.d, (iG + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int iG2 = xcg1.g(cy30.d(cy30.f((iE + (str2 == null ? 0 : str2.hashCode())) * 31, this.f, 31), 31, this.g), 31, this.h);
        String str3 = this.i;
        int iHashCode = (iG2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return iHashCode + (str4 != null ? str4.hashCode() : 0);
    }

    public z8h0(boolean z, String str, double d, String str2, long j, boolean z2, String str3, String str4, int i) {
        boolean z3 = (i & 1) != 0;
        str3 = (i & 256) != 0 ? null : str3;
        str4 = (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : str4;
        this.a = z3;
        this.b = z;
        this.c = str;
        this.d = d;
        this.e = str2;
        this.f = j;
        this.g = "ANDROID";
        this.h = z2;
        this.i = str3;
        this.j = str4;
    }
}
