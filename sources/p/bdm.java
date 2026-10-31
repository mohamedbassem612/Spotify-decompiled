package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bdm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bdm(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdm)) {
            return false;
        }
        bdm bdmVar = (bdm) obj;
        return this.a == bdmVar.a && this.b == bdmVar.b && this.c == bdmVar.c && this.d == bdmVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
