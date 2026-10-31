package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ks9 implements t2k1 {
    public final String a = "byom";

    @Override // p.t2k1
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks9) && this.a.equals(((ks9) obj).a);
    }

    @Override // p.t2k1
    public final String getIdentifier() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
