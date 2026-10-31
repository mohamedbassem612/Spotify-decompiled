package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cvg1 {
    public final f0u a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final iyk0 f;
    public final String g;
    public final Long h;

    public cvg1(f0u f0uVar, boolean z, String str, String str2, String str3, iyk0 iyk0Var, String str4, Long l) {
        this.a = f0uVar;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = iyk0Var;
        this.g = str4;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvg1)) {
            return false;
        }
        cvg1 cvg1Var = (cvg1) obj;
        return this.a == cvg1Var.a && this.b == cvg1Var.b && u890.j(this.c, cvg1Var.c) && u890.j(this.d, cvg1Var.d) && u890.j(this.e, cvg1Var.e) && this.f == cvg1Var.f && u890.j(this.g, cvg1Var.g) && u890.j(this.h, cvg1Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d((this.f.hashCode() + cy30.d(cy30.d(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
        Long l = this.h;
        return iD + (l == null ? 0 : l.hashCode());
    }

    public /* synthetic */ cvg1(f0u f0uVar, boolean z, String str, String str2, String str3, iyk0 iyk0Var) {
        this(f0uVar, z, str, str2, str3, iyk0Var, "", null);
    }
}
