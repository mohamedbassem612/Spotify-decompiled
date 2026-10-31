package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oug extends bmq0 {
    public final /* synthetic */ byte b;

    @Override // p.bmq0
    public final void h(d441 d441Var, Object obj) {
        switch (this.b) {
            case 0:
                nvg nvgVar = (nvg) obj;
                Integer numB = nvgVar.b();
                if (numB == null) {
                    d441Var.t(1);
                } else {
                    d441Var.r(1, numB.intValue());
                }
                String strA = nvgVar.a();
                if (strA == null) {
                    d441Var.t(2);
                } else {
                    d441Var.K(2, strA);
                }
                String strC = nvgVar.c();
                if (strC == null) {
                    d441Var.t(3);
                } else {
                    d441Var.K(3, strC);
                }
                Long lD = nvgVar.d();
                if (lD != null) {
                    d441Var.r(4, lD.longValue());
                } else {
                    d441Var.t(4);
                }
                break;
            default:
                exl1 exl1Var = (exl1) obj;
                d441Var.K(1, exl1Var.a);
                d441Var.K(2, exl1Var.b);
                break;
        }
    }

    @Override // p.bmq0
    public final String p() {
        switch (this.b) {
            case 0:
                return "INSERT OR REPLACE INTO `device_broadcasts` (`id`,`from`,`deviceId`,`createdAt`) VALUES (?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
