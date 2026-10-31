package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mym1 {
    public final byte a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public mym1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mym1)) {
            return false;
        }
        mym1 mym1Var = (mym1) obj;
        return this.a == mym1Var.a && u890.j(this.b, mym1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
