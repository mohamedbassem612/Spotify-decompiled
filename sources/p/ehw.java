package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ehw implements eiw {
    public final rz21 a;
    public final String b;

    public /* synthetic */ ehw(String str, int i) {
        this((i & 2) != 0 ? null : str, (rz21) null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehw)) {
            return false;
        }
        ehw ehwVar = (ehw) obj;
        if (!u890.j(this.a, ehwVar.a)) {
            return false;
        }
        String str = ehwVar.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        return zEquals;
    }

    public final int hashCode() {
        rz21 rz21Var = this.a;
        int iHashCode = (rz21Var == null ? 0 : rz21Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public ehw(String str, rz21 rz21Var) {
        this.a = rz21Var;
        this.b = str;
    }
}
