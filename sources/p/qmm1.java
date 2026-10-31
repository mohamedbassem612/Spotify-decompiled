package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qmm1 extends smm1 {
    public final String a;
    public final boolean b;

    public qmm1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmm1)) {
            return false;
        }
        qmm1 qmm1Var = (qmm1) obj;
        return this.a.equals(qmm1Var.a) && this.b == qmm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
