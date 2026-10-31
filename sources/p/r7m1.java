package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r7m1 implements t7m1 {
    public final String a;

    public r7m1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7m1) && this.a.equals(((r7m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
