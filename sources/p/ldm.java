package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ldm {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public ldm(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldm)) {
            return false;
        }
        ldm ldmVar = (ldm) obj;
        return this.a.equals(ldmVar.a) && this.b.equals(ldmVar.b) && this.c == ldmVar.c && this.d == ldmVar.d && this.e == ldmVar.e && this.f == ldmVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(kaa0.f(this.d, xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }
}
