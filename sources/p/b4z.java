package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b4z {
    public final String a;

    public b4z(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4z) && u890.j(this.a, ((b4z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
