package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t76 implements m86 {
    public final String a;

    public t76(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t76) && this.a.equals(((t76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
