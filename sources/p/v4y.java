package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v4y implements x4y {
    public final String a;

    public v4y(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4y) && this.a.equals(((v4y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
