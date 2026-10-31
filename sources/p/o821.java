package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o821 {
    public final String a;

    public o821(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o821) && u890.j(this.a, ((o821) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
