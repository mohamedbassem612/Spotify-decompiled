package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wj7 extends xj7 {
    public final String a;

    public wj7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj7) && this.a.equals(((wj7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
