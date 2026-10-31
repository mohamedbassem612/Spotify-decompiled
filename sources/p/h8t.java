package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h8t {
    public final String a;

    public h8t(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8t) && this.a.equals(((h8t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
