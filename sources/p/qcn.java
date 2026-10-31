package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qcn implements tcn {
    public final int a;
    public final int b;

    public qcn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcn)) {
            return false;
        }
        qcn qcnVar = (qcn) obj;
        return this.a == qcnVar.a && this.b == qcnVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
