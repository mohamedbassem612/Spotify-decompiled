package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ke01 implements ne01 {
    public final int a;

    public ke01(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke01) && this.a == ((ke01) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
