package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v5c extends til {
    public final jlb f;

    public v5c(Context context, dwl1 dwl1Var) {
        super(context, dwl1Var);
        this.f = new jlb(this, (byte) 5);
    }

    public final void c() {
        qs10 qs10VarA = qs10.a();
        int i = w5c.a;
        qs10VarA.getClass();
        ((til) this).b.registerReceiver(this.f, e());
    }

    public final void d() {
        qs10 qs10VarA = qs10.a();
        int i = w5c.a;
        qs10VarA.getClass();
        ((til) this).b.unregisterReceiver(this.f);
    }

    public IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        qs10 qs10VarA = qs10.a();
        int i = zha.a;
        intent.getAction();
        qs10VarA.getClass();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    b(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                b(Boolean.FALSE);
            }
        }
    }
}
