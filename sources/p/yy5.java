package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yy5 implements dz5 {
    public final hxb a;

    public yy5(hxb hxbVar) {
        this.a = hxbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yy5) && this.a.equals(((yy5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
