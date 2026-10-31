package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dj00 extends xfo1 {
    public final String b;
    public final int c;

    public dj00(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj00)) {
            return false;
        }
        dj00 dj00Var = (dj00) obj;
        return this.b.equals(dj00Var.b) && this.c == dj00Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + (this.b.hashCode() * 31);
    }
}
