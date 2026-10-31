package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vjb0 extends cbp1 {
    public final pta c;
    public final String d;

    public vjb0(pta ptaVar, String str) {
        this.c = ptaVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjb0)) {
            return false;
        }
        vjb0 vjb0Var = (vjb0) obj;
        return this.c.equals(vjb0Var.c) && u890.j(this.d, vjb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
