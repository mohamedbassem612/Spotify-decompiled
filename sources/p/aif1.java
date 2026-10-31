package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aif1 implements cif1 {
    public final int a;

    public aif1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aif1) && this.a == ((aif1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
