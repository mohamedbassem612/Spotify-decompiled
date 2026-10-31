package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m7x0 implements p7x0 {
    public final int a;

    public m7x0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7x0) && this.a == ((m7x0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
