package p;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vj5 extends yf {
    public final /* synthetic */ byte c = 0;
    public final /* synthetic */ yj5 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj5(yj5 yj5Var, Context context) {
        super(yj5Var);
        this.d = yj5Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // p.yf
    public final IntentFilter e() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // p.yf
    public final void q() {
        byte b = this.c;
        yj5 yj5Var = this.d;
        switch (b) {
            case 0:
                yj5Var.m(true, true);
                break;
            default:
                yj5Var.m(true, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    public final int v() {
        Location lastKnownLocation;
        boolean z;
        long j;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((PowerManager) obj).isPowerSaveMode() ? 2 : 1;
            default:
                dlg1 dlg1Var = (dlg1) obj;
                rxg1 rxg1Var = (rxg1) dlg1Var.c;
                LocationManager locationManager = (LocationManager) dlg1Var.b;
                if (rxg1Var.b > System.currentTimeMillis()) {
                    z = rxg1Var.a;
                } else {
                    Context context = (Context) dlg1Var.a;
                    Location lastKnownLocation2 = null;
                    if (pro1.k(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("network");
                            } else {
                                lastKnownLocation = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        lastKnownLocation = null;
                    }
                    if (pro1.k(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                        lastKnownLocation = lastKnownLocation2;
                    }
                    z = false;
                    if (lastKnownLocation != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        qxg1 qxg1Var = qxg1.e;
                        if (qxg1Var == null) {
                            qxg1Var = new qxg1((byte) 0);
                            qxg1.e = qxg1Var;
                        }
                        qxg1 qxg1Var2 = qxg1Var;
                        qxg1Var2.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                        qxg1Var2.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                        z = qxg1Var2.b;
                        long j2 = qxg1Var2.d;
                        long j3 = qxg1Var2.c;
                        qxg1Var2.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = qxg1Var2.d;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        rxg1Var.a = z;
                        rxg1Var.b = j;
                    } else {
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj5(yj5 yj5Var, dlg1 dlg1Var) {
        super(yj5Var);
        this.d = yj5Var;
        this.e = dlg1Var;
    }
}
