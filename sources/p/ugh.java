package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ugh implements vgh {
    public final String a;

    public ugh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugh) && u890.j(this.a, ((ugh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
