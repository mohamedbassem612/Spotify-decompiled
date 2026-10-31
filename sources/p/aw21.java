package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aw21 implements ez00 {
    public final String a;

    public aw21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw21) && this.a.equals(((aw21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
