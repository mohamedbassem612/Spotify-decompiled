package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wuk1 implements yuk1 {
    public final String a;

    public wuk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuk1) && this.a.equals(((wuk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
