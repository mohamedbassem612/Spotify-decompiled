package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ayg extends u2p1 {
    public final String c;
    public final ulg0 d;
    public final String e;

    public ayg(String str, ulg0 ulg0Var, String str2) {
        this.c = str;
        this.d = ulg0Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayg)) {
            return false;
        }
        ayg aygVar = (ayg) obj;
        return u890.j(this.c, aygVar.c) && this.d.equals(aygVar.d) && u890.j(this.e, aygVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
