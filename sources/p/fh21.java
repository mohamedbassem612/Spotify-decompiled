package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fh21 extends lh21 {
    public final String a;

    public fh21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh21) && u890.j(this.a, ((fh21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
