package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class kb {
    public static final jb Companion = new jb();
    public final np21 a;
    public final String b;

    public /* synthetic */ kb(int i, String str, np21 np21Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = np21Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        return u890.j(this.a, kbVar.a) && u890.j(this.b, kbVar.b);
    }

    public final int hashCode() {
        np21 np21Var = this.a;
        int iHashCode = (np21Var == null ? 0 : np21Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
