package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mz01 implements pz01 {
    public final String a;
    public final String b;

    public mz01(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz01)) {
            return false;
        }
        mz01 mz01Var = (mz01) obj;
        return u890.j(this.a, mz01Var.a) && u890.j(this.b, mz01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
