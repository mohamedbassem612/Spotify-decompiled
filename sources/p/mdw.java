package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mdw {
    public final String a;

    public mdw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdw) && u890.j(this.a, ((mdw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
