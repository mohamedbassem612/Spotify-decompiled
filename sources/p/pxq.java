package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pxq implements uxq {
    public final String a;

    public pxq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxq) && u890.j(this.a, ((pxq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
