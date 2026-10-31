package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v9n {
    public final String a;

    public v9n(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9n) && u890.j(this.a, ((v9n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
