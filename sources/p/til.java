package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class til {
    public final dwl1 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    public til(Context context, dwl1 dwl1Var) {
        this.a = dwl1Var;
        this.b = context.getApplicationContext();
    }

    public Object a() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            qs10 qs10VarA = qs10.a();
            int i = zha.a;
            qs10VarA.getClass();
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.d.execute(new e0i(o7h.l1(this.d), this, (byte) 4));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
