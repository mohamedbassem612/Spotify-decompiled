package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r13 implements t13 {
    public final String a;

    public r13(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r13) && this.a.equals(((r13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
