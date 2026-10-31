package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ils {
    public final String a;

    public ils(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ils) && u890.j(this.a, ((ils) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
