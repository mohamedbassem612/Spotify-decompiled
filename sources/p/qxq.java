package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qxq implements uxq {
    public final String a;

    public qxq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxq) && u890.j(this.a, ((qxq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
