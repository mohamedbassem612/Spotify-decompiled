package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class enf {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public enf(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enf)) {
            return false;
        }
        enf enfVar = (enf) obj;
        return this.a == enfVar.a && this.b == enfVar.b && this.c == enfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
