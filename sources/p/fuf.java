package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fuf {
    public final String a;

    public fuf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fuf) && u890.j(this.a, ((fuf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
