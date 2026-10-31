package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kh81 {
    public final ih81 a;

    /* JADX WARN: Illegal instructions before constructor call */
    public kh81(hux huxVar, Integer num, String str, tm81 tm81Var, jh81 jh81Var, nh81 nh81Var, int i) {
        tm81 tm81Var2 = (i & 16) != 0 ? null : tm81Var;
        if ((i & 64) != 0) {
            nh81.a.getClass();
            nh81Var = mh81.b;
        }
        this(new hh81(huxVar, num, str, tm81Var2, jh81Var, nh81Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh81) && u890.j(this.a, ((kh81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public kh81(ih81 ih81Var) {
        this.a = ih81Var;
    }

    public kh81(ng81 ng81Var) {
        this(new gh81(ng81Var));
    }
}
