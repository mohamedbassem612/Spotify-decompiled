package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ydc1 implements eec1 {
    public final zdc1 a;

    public ydc1(zdc1 zdc1Var) {
        this.a = zdc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydc1) && this.a == ((ydc1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
