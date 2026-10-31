package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o33 implements r33 {
    public final String a;

    public o33(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o33) && this.a.equals(((o33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
