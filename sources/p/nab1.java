package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nab1 {
    public final int a;
    public final vt1 b;
    public final lb50 c;
    public final Set d;
    public final iu30 e;
    public final sw9 f;
    public final sw9 g;
    public Integer h;
    public boolean i;
    public boolean j;
    public boolean k;

    public nab1(int i, vt1 vt1Var, lb50 lb50Var, Set set) {
        v3b1 v3b1Var = v3b1.S0;
        this.a = i;
        this.b = vt1Var;
        this.c = lb50Var;
        this.d = set;
        this.e = v3b1Var;
        this.f = new sw9((byte) 27);
        this.g = new sw9((byte) 27);
    }

    public final Boolean a(int i) {
        String str = (String) this.c.invoke(Integer.valueOf(i));
        if (str != null) {
            int iV0 = ihc1.v0(str, '(', 0, 6);
            int iA0 = ihc1.A0(str, ')', 0, 6);
            int i2 = iA0 + 2;
            oge1 oge1Var = (iV0 == -1 || iA0 <= iV0 || i2 >= str.length()) ? null : new oge1(str.substring(iV0 + 1, iA0), str.charAt(i2));
            if (oge1Var != null) {
                return Boolean.valueOf(oge1Var.b == 'D');
            }
        }
        return null;
    }
}
