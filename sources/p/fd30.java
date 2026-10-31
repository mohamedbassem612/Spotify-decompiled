package p;

import com.spotify.devicelocation.locationrefresh.events.proto.PeriodicLocationPermissionsCheck;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fd30 implements o5s {
    public final qrt a;
    public final t2j0 b;
    public final vfb0 c;
    public final yqg d;
    public final cc00 e;

    public fd30(qrt qrtVar, t2j0 t2j0Var, vfb0 vfb0Var, yqg yqgVar, cc00 cc00Var) {
        this.a = qrtVar;
        this.b = t2j0Var;
        this.c = vfb0Var;
        this.d = yqgVar;
        this.e = cc00Var;
    }

    public final void onStart(iac0 iac0Var) {
        String str;
        ud30 ud30Var = (ud30) this.e.invoke();
        if (ud30Var == null) {
            return;
        }
        long jB = this.d.b();
        vfb0 vfb0Var = this.c;
        dma1 dma1Var = vfb0Var.a;
        bma1 bma1Var = vfb0.b;
        if (jB - dma1Var.g(bma1Var, 0L) < ud30Var.a) {
            return;
        }
        hma1 hma1VarEdit = vfb0Var.a.edit();
        hma1VarEdit.c(bma1Var, jB);
        hma1VarEdit.g();
        qrt qrtVar = this.a;
        int iC = qrtVar.c();
        rks0 rks0VarN = PeriodicLocationPermissionsCheck.n();
        int iC2 = l1d.C(iC);
        if (iC2 == 0 || iC2 == 1) {
            str = "GRANTED";
        } else {
            if (iC2 != 2 && iC2 != 3 && iC2 != 4) {
                eg.o();
                return;
            }
            str = "NOT_GRANTED";
        }
        rks0VarN.q(str);
        rks0VarN.n(qrtVar.a());
        rks0VarN.r(iC == 1);
        PeriodicLocationPermissionsCheck periodicLocationPermissionsCheck = (PeriodicLocationPermissionsCheck) rks0VarN.build();
        periodicLocationPermissionsCheck.getClass();
        this.b.a(periodicLocationPermissionsCheck);
    }
}
