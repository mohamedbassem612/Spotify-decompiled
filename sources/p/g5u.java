package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g5u {
    public final boolean a;
    public final String b;

    public g5u(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5u)) {
            return false;
        }
        g5u g5uVar = (g5u) obj;
        return this.a == g5uVar.a && this.b.equals(g5uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
