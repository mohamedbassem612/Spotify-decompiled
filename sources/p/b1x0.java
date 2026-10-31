package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b1x0 {
    public final String a;

    public b1x0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1x0) && u890.j(this.a, ((b1x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
