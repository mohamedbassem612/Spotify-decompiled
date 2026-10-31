package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xjo {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public xjo(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjo)) {
            return false;
        }
        xjo xjoVar = (xjo) obj;
        return this.a == xjoVar.a && this.b == xjoVar.b && this.c == xjoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
