package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xdc1 implements dec1 {
    public final zdc1 a;

    public xdc1(zdc1 zdc1Var) {
        this.a = zdc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdc1) && this.a == ((xdc1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
