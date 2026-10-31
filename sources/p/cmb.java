package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cmb {
    public final String a;

    public cmb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmb) && u890.j(this.a, ((cmb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
