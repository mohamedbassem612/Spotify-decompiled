package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g5y {
    public final String a;

    public g5y(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5y) && u890.j(this.a, ((g5y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
