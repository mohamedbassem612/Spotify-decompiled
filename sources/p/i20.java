package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i20 implements k20 {
    public final String a;

    public i20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i20) && this.a.equals(((i20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
