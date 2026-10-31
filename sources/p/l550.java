package p;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l550 {
    public static final l550 a = new l550();
    public static boolean b;
    public static m550 c;
    public static String d;

    static {
        l550.class.toString();
    }

    public final boolean a() {
        if (dhn.a.contains(this)) {
            return false;
        }
        try {
            if (!b || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e) {
                m550 m550Var = c;
                if (m550Var == null) {
                    u890.C("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e.toString());
                m550Var.a(bundle, "gps_ara_failed");
                return false;
            } catch (Exception e2) {
                m550 m550Var2 = c;
                if (m550Var2 == null) {
                    u890.C("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e2.toString());
                m550Var2.a(bundle2, "gps_ara_failed");
                return false;
            }
        } catch (Throwable th) {
            dhn.a(this, th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    public final String b(bm5 bm5Var) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectA = bm5Var.a();
            if (jSONObjectA != null && jSONObjectA.length() != 0) {
                this = z561.d0(z561.f0(new u830(jSONObjectA, (byte) 22), z561.Q(jSONObjectA.keys())), "&");
                return this;
            }
            return "";
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final void c(String str, bm5 bm5Var) {
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                String string = bm5Var.a().getString("_eventName");
                if (!u890.j(string, "_removed_") && !ihc1.j0(string, "gps") && a()) {
                    Context contextA = wf10.a();
                    try {
                        MeasurementManager measurementManagerK = tw20.k(contextA.getSystemService(tw20.n()));
                        if (measurementManagerK == null) {
                            measurementManagerK = MeasurementManager.get(contextA.getApplicationContext());
                        }
                        if (measurementManagerK == null) {
                            m550 m550Var = c;
                            if (m550Var == null) {
                                u890.C("gpsDebugLogger");
                                throw null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                            m550Var.a(bundle, "gps_ara_failed");
                            return;
                        }
                        String strB = b(bm5Var);
                        StringBuilder sb = new StringBuilder();
                        String str2 = d;
                        if (str2 == null) {
                            u890.C("serverUri");
                            throw null;
                        }
                        sb.append(str2);
                        sb.append("?app_id=");
                        sb.append(str);
                        sb.append('&');
                        sb.append(strB);
                        measurementManagerK.registerTrigger(Uri.parse(sb.toString()), wf10.c(), new k550((byte) 0));
                    } catch (Error e) {
                        m550 m550Var2 = c;
                        if (m550Var2 == null) {
                            u890.C("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gps_ara_failed_reason", e.toString());
                        m550Var2.a(bundle2, "gps_ara_failed");
                    } catch (Exception e2) {
                        m550 m550Var3 = c;
                        if (m550Var3 == null) {
                            u890.C("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("gps_ara_failed_reason", e2.toString());
                        m550Var3.a(bundle3, "gps_ara_failed");
                    }
                }
            } catch (Throwable th) {
                dhn.a(this, th);
            }
        } catch (Throwable th2) {
            dhn.a(this, th2);
        }
    }

    public final void d(String str, bm5 bm5Var) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            wf10.c().execute(new j550(str, bm5Var, (byte) 0));
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
