package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x1z {
    public final String a;
    public final boolean b;

    public x1z(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1z)) {
            return false;
        }
        x1z x1zVar = (x1z) obj;
        return this.a.equals(x1zVar.a) && this.b == x1zVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
