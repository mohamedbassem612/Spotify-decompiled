package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sdf implements bef {
    public final String a;

    public sdf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdf) && u890.j(this.a, ((sdf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
