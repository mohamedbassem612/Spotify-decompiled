package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v9r {
    public final String a;

    public v9r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9r) && this.a.equals(((v9r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
