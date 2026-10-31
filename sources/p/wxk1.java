package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wxk1 implements ayk1 {
    public final int a;

    public wxk1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxk1) && this.a == ((wxk1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
