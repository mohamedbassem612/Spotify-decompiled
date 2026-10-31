package p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.play.agesignals.AgeSignalsException;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b450 implements z1c1 {
    public final ezb1 a;
    public final ihv0 b;

    public b450(ezb1 ezb1Var, ihv0 ihv0Var) {
        this.a = ezb1Var;
        this.b = ihv0Var;
    }

    @Override // p.z1c1
    public final Object a(gj2 gj2Var) {
        hfp1 hfp1VarY;
        int i;
        ohd ohdVar = new ohd(1, aym.t(gj2Var));
        ohdVar.t();
        w1x0 w1x0Var = new w1x0((byte) 28);
        mbo1 mbo1Var = (mbo1) this.a.b;
        hzo1 hzo1Var = mbo1Var.b;
        if (hzo1Var != null) {
            Context context = mbo1Var.a;
            hdn1 hdn1Var = s5p1.a;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                i = (applicationInfo != null && applicationInfo.enabled && s5p1.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (i < 82380000) {
                hdn1 hdn1Var2 = mbo1.c;
                Object[] objArr = {-6};
                hdn1Var2.getClass();
                if (Log.isLoggable("PlayCore", 6)) {
                    hdn1.i(hdn1Var2.b, "onError(%d)", objArr);
                }
                hfp1VarY = o0c.y(new AgeSignalsException(-6));
            } else {
                bsd1 bsd1Var = new bsd1();
                hzo1Var.a().post(new f2o1(hzo1Var, bsd1Var, bsd1Var, new f2o1(mbo1Var, bsd1Var, bsd1Var, w1x0Var)));
                hfp1VarY = bsd1Var.a;
            }
        } else {
            hdn1 hdn1Var3 = mbo1.c;
            Object[] objArr2 = {-2};
            hdn1Var3.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                hdn1.i(hdn1Var3.b, "onError(%d)", objArr2);
            }
            hfp1VarY = o0c.y(new AgeSignalsException(-2));
        }
        vx40 vx40Var = new vx40(ohdVar, this, (byte) 3);
        hfp1VarY.getClass();
        hfp1VarY.d(dsd1.a, vx40Var);
        hfp1VarY.m(new ro30(this, ohdVar, (byte) 9));
        return ohdVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    public final c2c1 b(zlo1 zlo1Var) {
        int i;
        String strValueOf;
        String str;
        String strValueOf2;
        String str2;
        String strValueOf3;
        int i2;
        Integer num = zlo1Var.a;
        Integer num2 = zlo1Var.b;
        Integer num3 = zlo1Var.c;
        Date date = zlo1Var.d;
        String str3 = zlo1Var.e;
        if (num == null) {
            i = 0;
        } else {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                i = 1;
            } else if (iIntValue == 1 || iIntValue == 2 || iIntValue == 3) {
                i = 3;
            } else if (iIntValue == 4) {
                i = 4;
            } else if (iIntValue != 5) {
                i = 0;
            } else {
                i = 2;
            }
        }
        mmr0 mmr0Var = new mmr0("outcome", "success");
        if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
            strValueOf = "null";
            str = strValueOf;
        } else {
            str = "null";
        }
        mmr0 mmr0Var2 = new mmr0("user_status", strValueOf);
        mmr0 mmr0Var3 = new mmr0("mapped_status", i != 0 ? kk0.z(i) : "fallback_api_not_available");
        if (num2 == null || (strValueOf2 = String.valueOf(num2.intValue())) == null) {
            strValueOf2 = str;
            str2 = strValueOf2;
        } else {
            str2 = str;
        }
        mmr0 mmr0Var4 = new mmr0("age_lower", strValueOf2);
        if (num3 == null || (strValueOf3 = String.valueOf(num3.intValue())) == null) {
            strValueOf3 = str2;
        }
        this.b.a(1, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, new mmr0("age_upper", strValueOf3), new mmr0("has_most_recent_approval_date", String.valueOf(date != null)), new mmr0("has_install_id", String.valueOf(str3 != null))}));
        if (i == 0) {
            return new a2c1(1, 1, null);
        }
        uh2 uh2Var = num2 != null ? new uh2(num3, num2.intValue()) : null;
        int iIntValue2 = num.intValue();
        if (iIntValue2 == 0 || iIntValue2 == 1) {
            i2 = 3;
        } else if (iIntValue2 == 2) {
            i2 = 1;
        } else if (iIntValue2 == 3) {
            i2 = 2;
        } else if (iIntValue2 == 4 || iIntValue2 != 5) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        return new b2c1(new ci2(i, uh2Var, i2, 1));
    }
}
