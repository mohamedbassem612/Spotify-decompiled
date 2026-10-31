package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kdn {
    public final boolean a;
    public final String b;

    public kdn(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdn)) {
            return false;
        }
        kdn kdnVar = (kdn) obj;
        return this.a == kdnVar.a && this.b.equals(kdnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
