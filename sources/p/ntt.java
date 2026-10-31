package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ntt extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sun b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ntt(sun sunVar, byte b) {
        super(0);
        this.a = b;
        this.b = sunVar;
    }

    public final Object invoke() {
        double dMax;
        switch (this.a) {
            case 0:
                yjq yjqVar = (yjq) this.b.b;
                synchronized (yjqVar.f) {
                    try {
                        long jLongValue = ((Number) ((opg) yjqVar.c).invoke()).longValue();
                        fen fenVar = (fen) ((Function0) yjqVar.b).invoke();
                        dMax = 0.0d;
                        if (fenVar != null) {
                            double d = fenVar.a;
                            ott ottVar = (ott) yjqVar.e;
                            if (ottVar == null) {
                                yjqVar.e = new ott(d, jLongValue);
                            } else {
                                dMax = Math.max(0.0d, d - ottVar.a);
                                yjqVar.e = new ott(d, jLongValue);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Double.valueOf(dMax);
            default:
                rp5 rp5Var = (rp5) ((yjq) this.b.b).d;
                IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                Context context = rp5Var.a;
                Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
                if (intentRegisterReceiver == null) {
                    intentRegisterReceiver = new Intent();
                }
                if (intentRegisterReceiver.getIntExtra("plugged", 0) != 0) {
                    return null;
                }
                Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    intentRegisterReceiver2 = new Intent();
                }
                int iS = jch0.S((((double) intentRegisterReceiver2.getIntExtra("level", -1)) * 100.0d) / ((double) intentRegisterReceiver2.getIntExtra("scale", -1)));
                if (iS < 0) {
                    return null;
                }
                return Double.valueOf(((double) iS) / 100.0d);
        }
    }
}
