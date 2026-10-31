package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uow0 implements vow0 {
    public final String a;
    public final boolean b;

    public uow0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uow0)) {
            return false;
        }
        uow0 uow0Var = (uow0) obj;
        return u890.j(this.a, uow0Var.a) && this.b == uow0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
