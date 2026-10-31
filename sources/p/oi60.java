package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oi60 implements qi60 {
    public final yzm a;
    public final String b;

    public oi60(yzm yzmVar) {
        String strC;
        this.a = yzmVar;
        if (yzmVar instanceof uzm) {
            strC = f4i1.c(((uzm) yzmVar).a, "DaysAgo-");
        } else if (yzmVar instanceof vzm) {
            strC = f4i1.c(((vzm) yzmVar).a, "MonthsAgo-");
        } else if (yzmVar instanceof wzm) {
            strC = f4i1.c(((wzm) yzmVar).a, "WeeksAgo-");
        } else {
            if (!(yzmVar instanceof xzm)) {
                eg.o();
                throw null;
            }
            strC = f4i1.c(((xzm) yzmVar).a, "YearsAgo-");
        }
        this.b = strC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi60) && u890.j(this.a, ((oi60) obj).a);
    }

    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
