package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qeh0 implements teh0 {
    public final String a;
    public final z7u b;

    public qeh0(String str, z7u z7uVar) {
        this.a = str;
        this.b = z7uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeh0)) {
            return false;
        }
        qeh0 qeh0Var = (qeh0) obj;
        return this.a.equals(qeh0Var.a) && this.b.equals(qeh0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
