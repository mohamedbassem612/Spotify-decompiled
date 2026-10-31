package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i100 implements b600 {
    public final String a;

    public i100(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i100) && this.a.equals(((i100) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
