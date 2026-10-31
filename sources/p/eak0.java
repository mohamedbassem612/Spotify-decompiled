package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eak0 {
    public final int a;
    public final uia b;

    public eak0(int i, uia uiaVar) {
        this.a = i;
        this.b = uiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eak0)) {
            return false;
        }
        eak0 eak0Var = (eak0) obj;
        return this.a == eak0Var.a && u890.j(this.b, eak0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        uia uiaVar = this.b;
        return iHashCode + (uiaVar == null ? 0 : uiaVar.hashCode());
    }
}
