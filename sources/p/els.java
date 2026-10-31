package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class els extends gls {
    public final String a;

    public els(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof els) && u890.j(this.a, ((els) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
