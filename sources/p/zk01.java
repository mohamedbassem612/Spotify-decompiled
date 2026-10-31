package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zk01 implements cl01 {
    public final hux a;

    public zk01(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk01) && u890.j(this.a, ((zk01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
