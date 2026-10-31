package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ta30 implements tj0 {
    public final int a;

    public ta30(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta30) && this.a == ((ta30) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
