package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u1u implements y1u {
    public final String a;

    public u1u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1u) && this.a.equals(((u1u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
