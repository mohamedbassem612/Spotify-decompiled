package p;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.engage.service.AppEngageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ndn1 {
    public static final jm f = new jm("AppEngageService");
    public static final Intent g = new Intent("com.google.android.engage.BIND_APP_ENGAGE_SERVICE").setPackage("com.android.vending");
    public static final Intent h = new Intent("com.google.android.engage.BIND_APP_ENGAGE_SERVICE").setPackage("com.google.android.engage.verifyapp");
    public static ndn1 i;
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final rzo1 e;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r8.equals("DEBUG") != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ndn1(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ndn1.<init>(android.content.Context):void");
    }

    public final hfp1 a(ssk1 ssk1Var) {
        Bundle bundle = new Bundle();
        bundle.putString("engage_sdk_version", this.d);
        bundle.putString("calling_package_name", this.c);
        bundle.putBundle("clusters_v2", ssk1Var.h());
        if (this.e == null) {
            return o0c.y(new AppEngageException(1));
        }
        if (this.b) {
            return b(new zxl1(this, bundle, (byte) 25));
        }
        f.a("Publish clusters skipped. Please upgrade your play store version to 40.8 or above.", new Object[0]);
        return o0c.z(new Bundle());
    }

    public final hfp1 b(tcn1 tcn1Var) {
        bsd1 bsd1Var = new bsd1();
        rzo1 rzo1Var = this.e;
        if (rzo1Var == null) {
            return o0c.y(new AppEngageException(1));
        }
        rzo1Var.d(new gfo1(this, bsd1Var, tcn1Var, bsd1Var), bsd1Var);
        return bsd1Var.a.e(l5u.a, new qen1());
    }
}
