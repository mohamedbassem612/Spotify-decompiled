package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yeh implements afh {
    public final String a;
    public final sn51 b;
    public final int c;
    public final int d;

    public yeh(String str, sn51 sn51Var, int i, int i2) {
        this.a = str;
        this.b = sn51Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeh)) {
            return false;
        }
        yeh yehVar = (yeh) obj;
        return this.a.equals(yehVar.a) && this.b.equals(yehVar.b) && this.c == yehVar.c && this.d == yehVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
