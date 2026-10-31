package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class os01 extends vs01 {
    public final lv01 a;

    public os01(lv01 lv01Var) {
        this.a = lv01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os01) && this.a.equals(((os01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
