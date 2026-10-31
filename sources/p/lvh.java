package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lvh implements mvh {
    public final String a;

    public lvh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvh) && u890.j(this.a, ((lvh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
