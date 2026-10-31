package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y2c0 {
    public final String a;

    public y2c0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2c0) && this.a.equals(((y2c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
