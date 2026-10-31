package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cjc0 implements djc0 {
    public final int a;

    public cjc0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjc0) && this.a == ((cjc0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
