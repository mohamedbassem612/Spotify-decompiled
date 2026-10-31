package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v0j0 implements w0j0 {
    public final String a;

    public v0j0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0j0) && u890.j(this.a, ((v0j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
