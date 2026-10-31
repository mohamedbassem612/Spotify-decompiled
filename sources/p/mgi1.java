package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mgi1 implements ngi1 {
    public final qgi1 a;

    public mgi1(qgi1 qgi1Var) {
        this.a = qgi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgi1) && this.a.equals(((mgi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
