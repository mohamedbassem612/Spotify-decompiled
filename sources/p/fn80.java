package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fn80 extends vln0 {
    public static final Parcelable.Creator<fn80> CREATOR = new xl80((byte) 1);

    @Override // p.vln0
    public final oe B() {
        return oe.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.t1f0
    public final String j() {
        return "instagram_login";
    }

    @Override // p.t1f0
    public final int t(rye0 rye0Var) {
        boolean z;
        int i;
        Object obj;
        String strM = mod.m();
        Context contextJ = h().j();
        if (contextJ == null) {
            contextJ = wf10.a();
        }
        String str = rye0Var.d;
        Set set = rye0Var.b;
        Set set2 = set;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String str2 = (String) it.next();
            lfb lfbVar = s1f0.b;
            if (lfb.g(str2)) {
                z = true;
                break;
            }
        }
        int i2 = rye0Var.c;
        if (i2 == 0) {
            i2 = 1;
        }
        String strG = g(rye0Var.g);
        String str3 = rye0Var.t;
        String str4 = rye0Var.Y;
        boolean z2 = rye0Var.Z;
        boolean z3 = rye0Var.O0;
        boolean z4 = rye0Var.P0;
        omn0 omn0Var = omn0.a;
        Set set3 = dhn.a;
        Intent intent = null;
        if (set3.contains(omn0.class)) {
            i = 1;
        } else {
            try {
                Context context = contextJ;
                i = 1;
                try {
                    Intent intentC = omn0.a.c(new lmn0((byte) 1), str, set2, strM, z, i2, strG, str3, false, str4, z2, 2, z3, z4, "", (String) null, (String) null);
                    obj = omn0.class;
                    try {
                        if (!set3.contains(obj) && intentC != null) {
                            try {
                                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intentC, 0);
                                if (resolveInfoResolveActivity != null && ag10.a(context, resolveInfoResolveActivity.activityInfo.packageName)) {
                                    intent = intentC;
                                }
                            } catch (Throwable th) {
                                dhn.a(obj, th);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dhn.a(obj, th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = omn0.class;
                }
            } catch (Throwable th4) {
                th = th4;
                i = 1;
                obj = omn0.class;
            }
        }
        Intent intent2 = intent;
        a("e2e", strM);
        z5c.c(i);
        return K(intent2) ? 1 : 0;
    }
}
