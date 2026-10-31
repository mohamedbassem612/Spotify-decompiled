package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xdn implements ydn {
    public final String a;

    public xdn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdn) && u890.j(this.a, ((xdn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
