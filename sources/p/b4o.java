package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b4o {
    public final String a;

    public b4o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4o) && u890.j(this.a, ((b4o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
