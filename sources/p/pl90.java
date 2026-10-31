package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pl90 {
    public final String a;

    public pl90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl90) && u890.j(this.a, ((pl90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
