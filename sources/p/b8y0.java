package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b8y0 implements c8y0 {
    public final String a;

    public b8y0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8y0) && u890.j(this.a, ((b8y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
