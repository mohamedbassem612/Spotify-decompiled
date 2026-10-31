package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bx5 implements p3r, SingleOnSubscribe {
    public final Context a;

    public o3r a(wa71 wa71Var) {
        jd11 jd11Var = rc11.a;
        l4r l4rVar = new l4r(new wlu(jd11Var.b(eid.class)), 2, udf1.e1, new j4r(smf1.c), smf1.b);
        e9f1 e9f1Var = new e9f1(this, (byte) 3);
        return w3p1.m(new l4r(new wlu(jd11Var.b(xkk1.class)), 1, m830.S0, new j4r(m830.X0), m830.T0), new l4r(new wlu(jd11Var.b(jo70.class)), 1, m830.U0, new j4r(m830.Y0), m830.V0), l4rVar, e9f1Var);
    }

    public void b(String str) {
        y520.E(new File(this.a.getCacheDir(), "campfire_media_upload/".concat(str)));
    }

    public Object c(String str, onm onmVar) {
        fns fnsVar = igu.a;
        return fn31.Y(b3s.c, new az80((Object) str, (Object) this, (lnm) null, (byte) 23), onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    public String d(int i, zuc0 zuc0Var) {
        br01 br01VarK = g6p1.k(zuc0Var);
        List listI = g6p1.i(zuc0Var.g);
        int size = listI.size();
        Context context = this.a;
        int i2 = 2131820716;
        if (size != 1) {
            if (listI.size() <= 1) {
                return "";
            }
            int iOrdinal = br01VarK.ordinal();
            if (iOrdinal == 0) {
                i2 = 2131820715;
            } else if (iOrdinal == 1) {
                i2 = 2131820895;
            } else if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                eg.o();
                return null;
            }
            return context.getResources().getQuantityString(i2, i, Integer.valueOf(i));
        }
        int iOrdinal2 = ((m9m) o7h.q0(listI)).ordinal();
        if (iOrdinal2 == 0) {
            int iOrdinal3 = br01VarK.ordinal();
            if (iOrdinal3 == 0) {
                i2 = 2131820926;
            } else if (iOrdinal3 == 1) {
                i2 = 2131820895;
            } else if (iOrdinal3 == 2) {
                i2 = 2131820927;
            } else if (iOrdinal3 != 3) {
                if (iOrdinal3 != 4) {
                    eg.o();
                    return null;
                }
                i2 = 2131820927;
            }
        } else if (iOrdinal2 == 1) {
            int iOrdinal4 = br01VarK.ordinal();
            if (iOrdinal4 == 0) {
                i2 = 2131820679;
            } else if (iOrdinal4 == 1) {
                i2 = 2131820895;
            } else if (iOrdinal4 == 2) {
                i2 = 2131820680;
            } else if (iOrdinal4 != 3) {
                if (iOrdinal4 != 4) {
                    eg.o();
                    return null;
                }
                i2 = 2131820680;
            }
        } else {
            if (iOrdinal2 != 2) {
                eg.o();
                return null;
            }
            int iOrdinal5 = br01VarK.ordinal();
            if (iOrdinal5 == 0) {
                i2 = 2131820584;
            } else if (iOrdinal5 == 1) {
                i2 = 2131820895;
            } else if (iOrdinal5 == 2) {
                i2 = 2131820585;
            } else if (iOrdinal5 != 3) {
                if (iOrdinal5 != 4) {
                    eg.o();
                    return null;
                }
                i2 = 2131820585;
            }
        }
        return context.getResources().getQuantityString(i2, i, Integer.valueOf(i));
    }

    public void subscribe(SingleEmitter singleEmitter) {
        ssk1 ssk1Var = new ssk1(singleEmitter);
        ComponentName componentName = ffl1.l;
        Context context = this.a;
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo("com.waze", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i < 1021549) {
            ((SingleEmitter) ssk1Var.a).onSuccess(Boolean.FALSE);
        } else {
            Intent intent = new Intent();
            intent.setComponent(ffl1.l);
            context.bindService(intent, (ServiceConnection) new dn7(ssk1Var, context, (byte) 2), 1);
        }
    }
}
