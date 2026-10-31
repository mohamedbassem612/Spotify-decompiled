package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r8z extends upn1 {
    public final q8z c;
    public final int d;

    public r8z(q8z q8zVar, int i) {
        this.c = q8zVar;
        this.d = i;
    }

    public final int E() {
        return this.d;
    }

    public final qpn1 F() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8z)) {
            return false;
        }
        r8z r8zVar = (r8z) obj;
        return this.c.equals(r8zVar.c) && this.d == r8zVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.c.hashCode() * 31);
    }
}
