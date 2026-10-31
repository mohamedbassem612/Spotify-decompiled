package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qnf1 {
    public static final qnf1 d = new qnf1(new pnf1[0]);
    public static final String e;
    public final int a;
    public final bg11 b;
    public int c;

    static {
        String str = zoi1.a;
        e = Integer.toString(0, 36);
    }

    public qnf1(pnf1... pnf1VarArr) {
        bg11 bg11VarQ = b380.q(pnf1VarArr);
        this.b = bg11VarQ;
        this.a = pnf1VarArr.length;
        int i = 0;
        while (i < bg11VarQ.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < bg11VarQ.d; i3++) {
                if (((pnf1) bg11VarQ.get(i)).equals(bg11VarQ.get(i3))) {
                    oon1.w("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final pnf1 a(int i) {
        return (pnf1) this.b.get(i);
    }

    public final int b(pnf1 pnf1Var) {
        int iIndexOf = this.b.indexOf(pnf1Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qnf1.class != obj.getClass()) {
            return false;
        }
        qnf1 qnf1Var = (qnf1) obj;
        if (this.a != qnf1Var.a) {
            return false;
        }
        bg11 bg11Var = qnf1Var.b;
        bg11 bg11Var2 = this.b;
        bg11Var2.getClass();
        return z1p1.j(bg11Var2, bg11Var);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
