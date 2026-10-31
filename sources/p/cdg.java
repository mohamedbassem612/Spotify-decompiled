package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cdg extends edg {
    public final String a;

    public cdg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdg) && u890.j(this.a, ((cdg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
