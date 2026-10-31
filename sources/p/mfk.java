package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mfk {
    public final String a;
    public final yj60 b;

    public mfk(String str, yj60 yj60Var) {
        this.a = str;
        this.b = yj60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfk)) {
            return false;
        }
        mfk mfkVar = (mfk) obj;
        return u890.j(this.a, mfkVar.a) && u890.j(this.b, mfkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yj60 yj60Var = this.b;
        return iHashCode + (yj60Var == null ? 0 : yj60Var.hashCode());
    }

    public /* synthetic */ mfk() {
        this("", null);
    }
}
