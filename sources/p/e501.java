package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e501 implements f501 {
    public final String a;

    public e501(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e501) && this.a.equals(((e501) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
