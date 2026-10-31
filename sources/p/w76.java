package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w76 implements m86 {
    public final boolean a;

    public w76(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w76) && this.a == ((w76) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
