package p;

import android.adservices.measurement.MeasurementManager;
import android.media.UnsupportedSchemeException;
import android.os.Bundle;
import android.os.VibratorManager;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.SerializationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tw20 implements hc10, yn00, mnm, v570, e670, vd70, de70, xl70, jn10 {
    public final /* synthetic */ byte a;

    public /* synthetic */ tw20(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager k(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ VibratorManager m(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void p() {
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ void q(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void s(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + '\'').toString());
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static /* synthetic */ void w(Object obj, String str) throws SerializationException {
        throw new SerializationException(str + obj);
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new i9n(str + obj);
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new i9n(str + obj);
    }

    public void a(u570 u570Var) {
    }

    public y570 b(y570 y570Var) {
        return y570Var;
    }

    public Object d(Task task) {
        Bundle bundle = (Bundle) task.h(IOException.class);
        if (bundle == null) {
            k220.i("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            k220.i("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            k220.i(string3);
            return null;
        }
        bundle.toString();
        new Throwable();
        k220.i("SERVICE_NOT_AVAILABLE");
        return null;
    }

    @Override // p.xl70
    public boolean e(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 17:
                return false;
            default:
                return i != 2 ? !(i2 == 65 && i3 == 80 && i4 == 73 && i5 == 67) : !(i2 == 80 && i3 == 73 && i4 == 67);
        }
    }

    public void f(me70 me70Var) {
    }

    @Override // p.hc10
    public ec10[] g() {
        return new ec10[]{new uw20()};
    }

    public int h(y570 y570Var) {
        return d670.c(y570Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(boolean z) {
        File[] fileArrListFiles;
        Object[] objArr = 0;
        byte b = 1;
        switch (this.a) {
            case 21:
                if (z) {
                    synchronized (len.c) {
                        try {
                            wf10 wf10Var = wf10.a;
                            if (wgi1.c()) {
                                hwb.C();
                            }
                            if (len.d == null) {
                                len lenVar = new len(Thread.getDefaultUncaughtExceptionHandler(), objArr == true ? 1 : 0);
                                len.d = lenVar;
                                Thread.setDefaultUncaughtExceptionHandler(lenVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (mn10.b(kn10.e1)) {
                        dgo1.b = true;
                        if (wgi1.c() && !fpi1.v()) {
                            File fileI = fap1.i();
                            if (fileI == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileI.listFiles((FilenameFilter) new yin((byte) 4));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                ep80 ep80VarK = v9p1.K(file);
                                if (ep80VarK.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", ep80VarK.toString());
                                        String str = md50.j;
                                        arrayList.add(cwl1.R((xd) null, String.format("%s/instruments", Arrays.copyOf(new Object[]{wf10.b()}, 1)), jSONObject, new he(ep80VarK, (byte) 2)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                od50 od50Var = new od50(arrayList);
                                String str2 = md50.j;
                                w0h1.C(od50Var);
                                new nd50(od50Var).executeOnExecutor(wf10.c(), new Void[0]);
                            }
                        }
                        dhn.b = true;
                    }
                    mn10.b(kn10.f1);
                    return;
                }
                return;
            case 22:
                if (z) {
                    wf10 wf10Var2 = wf10.a;
                    if (!wgi1.c() || fpi1.v()) {
                        return;
                    }
                    File fileI2 = fap1.i();
                    File[] fileArrListFiles2 = fileI2 == null ? new File[0] : fileI2.listFiles((FilenameFilter) new yin((byte) 1));
                    ArrayList arrayList2 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        riz rizVar = new riz();
                        String name = file2.getName();
                        rizVar.a = name;
                        JSONObject jSONObjectN = fap1.n(name);
                        if (jSONObjectN != null) {
                            rizVar.c = Long.valueOf(jSONObjectN.optLong("timestamp", 0L));
                            rizVar.b = jSONObjectN.optString("error_message", null);
                        }
                        if (rizVar.b != null && rizVar.c != null) {
                            arrayList2.add(rizVar);
                        }
                    }
                    r7h.f0(arrayList2, new m((byte) 15));
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < arrayList2.size() && i < 1000; i++) {
                        jSONArray.put(arrayList2.get(i));
                    }
                    fap1.o("error_reports", jSONArray, new he(arrayList2, b));
                    return;
                }
                return;
            default:
                if (z) {
                    AtomicBoolean atomicBoolean = o.a;
                    synchronized (o.class) {
                        Set set = dhn.a;
                        if (set.contains(o.class)) {
                            return;
                        }
                        try {
                            if (o.a.getAndSet(true)) {
                                return;
                            }
                            wf10 wf10Var3 = wf10.a;
                            if (wgi1.c()) {
                                o.a();
                            }
                            int i2 = l.a;
                            if (!set.contains(l.class)) {
                                try {
                                    l.b.scheduleWithFixedDelay(l.d, 0L, 500L, TimeUnit.MILLISECONDS);
                                } catch (Throwable th2) {
                                    dhn.a(l.class, th2);
                                }
                            }
                            break;
                        } catch (Throwable th3) {
                            dhn.a(o.class, th3);
                        }
                        return;
                    }
                }
                return;
        }
    }

    public Object j(Object obj, Object obj2) {
        ((sq21) obj).getClass();
        ((jq21) obj2).getClass();
        return new je90();
    }

    public ao00 r(UUID uuid) {
        try {
            try {
                return new ok30(uuid);
            } catch (UnsupportedDrmException unused) {
                oon1.v("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new hwb((byte) 8);
            }
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(e2);
        }
    }
}
