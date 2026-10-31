package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a7u {
    public final String a;

    public a7u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7u) && this.a.equals(((a7u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + kaa0.f(2131954989, Integer.hashCode(2131954993) * 31, 31);
    }
}
