package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zlb extends amb {
    public final String a;

    public zlb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlb) && u890.j(this.a, ((zlb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
