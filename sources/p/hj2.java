package p;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hj2 {
    public final Context a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final mbo0 e;
    public final ihv0 f;

    public hj2(Context context, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, mbo0 mbo0Var, ihv0 ihv0Var) {
        this.a = context;
        this.b = jly0Var;
        this.c = jly0Var2;
        this.d = jly0Var3;
        this.e = mbo0Var;
        this.f = ihv0Var;
    }

    public static ej2 b(String str) {
        if (str == null) {
            return null;
        }
        if (nhc1.Y(str, "com.android.vending", false)) {
            return ej2.a;
        }
        if (nhc1.Y(str, "com.sec.android.app.samsungapps", false)) {
            return ej2.b;
        }
        if (nhc1.Y(str, "com.amazon.venezia", false)) {
            return ej2.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) throws PackageManager.NameNotFoundException {
        gj2 gj2Var;
        fj2 fj2Var;
        z1c1 z1c1Var;
        aj2 wi2Var;
        if (onmVar instanceof gj2) {
            gj2Var = (gj2) onmVar;
            int i = gj2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gj2Var.c = i - Integer.MIN_VALUE;
            } else {
                gj2Var = new gj2(this, onmVar);
            }
        } else {
            gj2Var = new gj2(this, onmVar);
        }
        Object objA = gj2Var.a;
        int i2 = gj2Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            int i3 = Build.VERSION.SDK_INT;
            Context context = this.a;
            if (i3 >= 30) {
                InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                fj2Var = new fj2(installSourceInfo.getInstallingPackageName(), installSourceInfo.getInitiatingPackageName());
            } else {
                fj2Var = new fj2(context.getPackageManager().getInstallerPackageName(context.getPackageName()), null);
            }
            String str = fj2Var.a;
            ej2 ej2VarB = b(str);
            String str2 = fj2Var.b;
            if (ej2VarB == null && (ej2VarB = b(str2)) == null) {
                ej2VarB = ej2.d;
            }
            String strName = ej2VarB.name();
            ohv0 ohv0Var = this.f.a;
            mmr0 mmr0Var = new mmr0("install_source", strName);
            if (str == null) {
                str = "";
            }
            mmr0 mmr0Var2 = new mmr0("installing_package", str);
            if (str2 == null) {
                str2 = "";
            }
            ohv0Var.a(new khv0((String) null, 1, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("initiating_package", str2)}), "age_signal_install_source_detected"));
            this.e.getClass();
            int iOrdinal = ej2VarB.ordinal();
            if (iOrdinal == 0) {
                z1c1Var = (z1c1) this.b.get();
            } else if (iOrdinal == 1) {
                z1c1Var = (z1c1) this.d.get();
            } else if (iOrdinal == 2) {
                z1c1Var = (z1c1) this.c.get();
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                z1c1Var = null;
            }
            if (z1c1Var == null) {
                return new ij2(new wi2(5));
            }
            gj2Var.c = 1;
            objA = z1c1Var.a(gj2Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        c2c1 c2c1Var = (c2c1) objA;
        if (c2c1Var instanceof b2c1) {
            return new jj2(((b2c1) c2c1Var).a);
        }
        if (!(c2c1Var instanceof a2c1)) {
            eg.o();
            return null;
        }
        a2c1 a2c1Var = (a2c1) c2c1Var;
        int i4 = a2c1Var.a;
        int i5 = a2c1Var.b;
        int iC = l1d.C(i4);
        if (iC == 0 || iC == 1) {
            wi2Var = new wi2(i5);
        } else if (iC == 2) {
            wi2Var = new yi2(i5);
        } else if (iC == 3) {
            wi2Var = new xi2(i5);
        } else {
            if (iC != 4 && iC != 5) {
                eg.o();
                return null;
            }
            wi2Var = new zi2(i5);
        }
        return new ij2(wi2Var);
    }
}
