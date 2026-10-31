package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vha extends v5c {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vha(Context context, dwl1 dwl1Var, byte b) {
        super(context, dwl1Var);
        this.g = b;
    }

    public final Object a() {
        byte b = this.g;
        Context context = ((til) this).b;
        boolean z = true;
        switch (b) {
            case 0:
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    qs10 qs10VarA = qs10.a();
                    int i = wha.a;
                    qs10VarA.getClass();
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver2 = context.registerReceiver(null, e());
                if (intentRegisterReceiver2 != null && intentRegisterReceiver2.getAction() != null) {
                    String action = intentRegisterReceiver2.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // p.v5c
    public final IntentFilter e() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p.v5c
    public final void f(Intent intent) {
        switch (this.g) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    qs10 qs10VarA = qs10.a();
                    int i = wha.a;
                    qs10VarA.getClass();
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                b(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                b(Boolean.TRUE);
                                break;
                            }
                            break;
                    }
                }
                break;
            default:
                if (intent.getAction() != null) {
                    qs10 qs10VarA2 = qs10.a();
                    int i2 = u1c1.a;
                    intent.getAction();
                    qs10VarA2.getClass();
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int iHashCode = action2.hashCode();
                        if (iHashCode != -1181163412) {
                            if (iHashCode == -730838620 && action2.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                b(Boolean.TRUE);
                            }
                            break;
                        } else if (action2.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            b(Boolean.FALSE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
