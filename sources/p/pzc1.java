package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pzc1 extends szc1 {
    public final String a;
    public final boolean b;

    public pzc1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzc1)) {
            return false;
        }
        pzc1 pzc1Var = (pzc1) obj;
        return u890.j(this.a, pzc1Var.a) && this.b == pzc1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public /* synthetic */ pzc1(String str) {
        this(str, false);
    }
}
