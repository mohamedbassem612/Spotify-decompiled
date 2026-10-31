package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class se60 {
    public static final o3r a;

    static {
        jd11 jd11Var = rc11.a;
        a = w3p1.n(new l4r(new xv00(jd11Var.b(gw81.class)), 1, z860.Y0, new j4r(z860.U0), z860.Z0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, z860.W0, new j4r(z860.V0), z860.X0), re60.a);
    }

    public static final bu70 a(qe60 qe60Var) {
        int i;
        gw81 gw81Var = qe60Var.a;
        boolean zY0 = ihc1.y0(gw81Var.b);
        boolean zY1 = ihc1.y0(gw81Var.c);
        int i2 = 2;
        if (zY0 || zY1) {
            i = !zY0 ? 2 : 0;
        } else {
            i = 1;
        }
        if (!zY0 && !zY1) {
            i2 = 1;
        } else if (zY1) {
            i2 = 0;
        }
        return new bu70(0, i, i2);
    }
}
