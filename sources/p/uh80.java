package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uh80 implements wh80 {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final kl3 l;

    public uh80(boolean z, String str, String str2, boolean z2, String str3, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = str3;
        this.f = z3;
        this.g = z4;
        this.h = str4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = new kl3(str, str3, str, z2, z, z3, z7);
    }

    public final boolean a() {
        return this.d;
    }

    public final String c() {
        return this.h;
    }

    public final boolean d() {
        return this.g;
    }

    public final boolean e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh80)) {
            return false;
        }
        uh80 uh80Var = (uh80) obj;
        return this.a == uh80Var.a && u890.j(this.b, uh80Var.b) && u890.j(this.c, uh80Var.c) && this.d == uh80Var.d && u890.j(this.e, uh80Var.e) && this.f == uh80Var.f && this.g == uh80Var.g && u890.j(this.h, uh80Var.h) && this.i == uh80Var.i && this.j == uh80Var.j && this.k == uh80Var.k;
    }

    public final boolean f() {
        return this.i;
    }

    public final boolean g() {
        return this.f;
    }

    public final String getContextUri() {
        return this.e;
    }

    public final String getUid() {
        return this.c;
    }

    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(xcg1.g(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return Boolean.hashCode(this.k) + xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j);
    }

    public /* synthetic */ uh80(boolean z, String str, String str2, boolean z2, String str3, boolean z3, boolean z4, String str4, boolean z5, boolean z6, int i) {
        this(z, str, str2, z2, str3, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? false : z5, (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? false : z6, true);
    }
}
