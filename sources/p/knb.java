package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class knb extends lnb {
    public final String a;

    public knb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knb) && u890.j(this.a, ((knb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
