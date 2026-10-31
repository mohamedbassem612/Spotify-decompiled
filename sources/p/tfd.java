package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tfd {
    public final String a;

    public tfd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfd) && u890.j(this.a, ((tfd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
