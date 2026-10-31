package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fv80 extends lm5 {
    public final String d;

    public fv80(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv80) && this.d.equals(((fv80) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
