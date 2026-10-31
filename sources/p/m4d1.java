package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m4d1 implements n4d1 {
    public final int a;

    public m4d1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4d1) && this.a == ((m4d1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
