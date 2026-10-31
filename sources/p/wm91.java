package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wm91 implements l381, m381 {
    public final /* synthetic */ byte a = 0;
    public final o3r b;

    public wm91(zwa1 zwa1Var) {
        this.b = w3p1.n(new l4r(pwc0.b, 1, qva1.V0, new j4r(new dr91(zwa1Var, (byte) 26)), qva1.W0), new l4r(hvm.d, 2, qva1.T0, new j4r(qva1.S0), qva1.U0), nva1.d);
    }

    public final o3r b() {
        byte b = this.a;
        return this.b;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        ywa1 ywa1Var = (ywa1) obj;
        if (u890.j(ywa1Var.b, "premium") && (vhc1Var instanceof thc1)) {
            String str = (String) ((thc1) vhc1Var).j.get("item.speed");
            Float fB0 = str != null ? nhc1.b0(str) : null;
            if (fB0 != null) {
                if ((!(fB0.floatValue() == 1.0f)) && !z6k0.b(ywa1Var.a.X)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean t(Object obj) {
        qxc0 qxc0Var = (qxc0) obj;
        return qxc0Var.S0 > 0 && gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h});
    }

    public wm91(ym91 ym91Var) {
        this.b = ym91Var.e;
    }
}
