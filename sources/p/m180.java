package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m180 implements n180 {
    public final int a;

    public m180(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m180) && this.a == ((m180) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
