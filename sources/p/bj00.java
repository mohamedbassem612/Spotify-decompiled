package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bj00 extends l6o1 {
    public final List b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public bj00(List list, String str, Integer num, Integer num2) {
        this.b = list;
        this.c = str;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj00)) {
            return false;
        }
        bj00 bj00Var = (bj00) obj;
        return this.b.equals(bj00Var.b) && u890.j(this.c, bj00Var.c) && this.d.equals(bj00Var.d) && this.e.equals(bj00Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return this.e.hashCode() + pze0.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
