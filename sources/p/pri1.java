package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pri1 extends dxo1 {
    public final String b;

    public pri1(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pri1) && this.b.equals(((pri1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
