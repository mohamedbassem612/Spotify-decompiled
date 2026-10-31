package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fz80 {
    public final String a;

    public fz80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz80) && this.a.equals(((fz80) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(this.a.hashCode() * 31, 31, false);
    }
}
