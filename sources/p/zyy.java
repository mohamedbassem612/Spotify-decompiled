package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zyy extends dem1 {
    public final String b;

    public zyy(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyy) && this.b.equals(((zyy) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
