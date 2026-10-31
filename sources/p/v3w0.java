package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v3w0 extends f4w0 {
    public final String a;

    public v3w0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3w0) && u890.j(this.a, ((v3w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
