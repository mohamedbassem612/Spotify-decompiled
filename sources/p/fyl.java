package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fyl {
    public final String a;

    public fyl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyl) && this.a.equals(((fyl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
