package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hhh1 {
    public ptf1 a;
    public ptf1 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    public final void a(c8e1 c8e1Var) {
        ptf1 ptf1Var;
        c8e1 c8e1Var2;
        this.e = false;
        ptf1 ptf1Var2 = this.a;
        if (u890.j(c8e1Var, ptf1Var2 != null ? (c8e1) ptf1Var2.c : null)) {
            return;
        }
        String str = c8e1Var.a.b;
        ptf1 ptf1Var3 = this.a;
        boolean zJ = u890.j(str, (ptf1Var3 == null || (c8e1Var2 = (c8e1) ptf1Var3.c) == null) ? null : c8e1Var2.a.b);
        ptf1 ptf1Var4 = this.a;
        if (zJ) {
            if (ptf1Var4 != null) {
                ptf1Var4.c = c8e1Var;
                return;
            }
            return;
        }
        this.a = new ptf1(ptf1Var4, c8e1Var, (byte) 17);
        this.b = null;
        int length = c8e1Var.a.b.length() + this.c;
        this.c = length;
        if (length > 100000) {
            ptf1 ptf1Var5 = this.a;
            if ((ptf1Var5 != null ? (ptf1) ptf1Var5.b : null) == null) {
                return;
            }
            while (true) {
                if (ptf1Var5 == null) {
                    ptf1Var = null;
                } else {
                    ptf1 ptf1Var6 = (ptf1) ptf1Var5.b;
                    if (ptf1Var6 != null) {
                        ptf1Var = (ptf1) ptf1Var6.b;
                    } else {
                        ptf1Var = null;
                    }
                }
                if (ptf1Var == null) {
                    break;
                } else {
                    ptf1Var5 = (ptf1) ptf1Var5.b;
                }
            }
            if (ptf1Var5 != null) {
                ptf1Var5.b = null;
            }
        }
    }
}
