package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pcv implements vcv {
    public final String a;

    public pcv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcv) && u890.j(this.a, ((pcv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
