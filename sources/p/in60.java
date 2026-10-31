package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class in60 implements it80 {
    public static final Uri d = Uri.parse(nik1.z0.a);
    public final Context a;
    public final bi0 b;
    public final String c;

    public in60(Context context, bi0 bi0Var, String str) {
        this.a = context;
        this.b = bi0Var;
        this.c = str;
    }

    @Override // p.it80
    public final void a(ajq0 ajq0Var) {
        xgc xgcVar = new xgc(this, (byte) 12);
        ajq0Var.K(blc0.HOME_ROOT, "Client Home Page", xgcVar);
        ajq0Var.K(blc0.ACTIVATE, "Default routing for activate", xgcVar);
        ajq0Var.K(blc0.HOME_DRILLDOWN, "Home drill down destinations", xgcVar);
        ajq0Var.F(new pu9(this, (byte) 1));
    }

    public final Intent b(Intent intent) {
        if (intent.getBooleanExtra("is_ui_fragments_loaded", false)) {
            return null;
        }
        return new Intent(intent).setAction("android.intent.action.VIEW").setComponent(new ComponentName(this.a, this.c)).setData(d).setFlags(67108864);
    }
}
