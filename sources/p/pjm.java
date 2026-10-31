package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pjm {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public pjm(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjm)) {
            return false;
        }
        pjm pjmVar = (pjm) obj;
        return this.a == pjmVar.a && this.b == pjmVar.b && this.c == pjmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
