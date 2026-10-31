package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ond1 extends czo1 {
    public final int c;
    public final String d;

    public ond1(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ond1)) {
            return false;
        }
        ond1 ond1Var = (ond1) obj;
        return this.c == ond1Var.c && u890.j(this.d, ond1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }
}
