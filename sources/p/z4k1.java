package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z4k1 implements b5k1 {
    public final String a;

    public z4k1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4k1) && this.a.equals(((z4k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
