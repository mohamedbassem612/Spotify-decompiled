package p;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.RavelinError;
import com.ravelin.core.model.SharedPackages;
import com.ravelin.core.repository.db.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lvg implements ydp0, bep0 {
    public static final String f;
    public final AppDatabase a;
    public final o9b0 b;
    public final bep0 c;
    public final SharedPreferences d;
    public boolean e;

    static {
        String canonicalName = lvg.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = lvg.class.getSimpleName();
        }
        f = canonicalName;
    }

    public lvg(AppDatabase appDatabase, o9b0 o9b0Var, bep0 bep0Var, SharedPreferences sharedPreferences) {
        this.a = appDatabase;
        this.b = o9b0Var;
        this.c = bep0Var;
        this.d = sharedPreferences;
    }

    public static long c(Context context) {
        return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime : context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public final void a(Context context) {
        long jC = c(context);
        SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.putLong("last-update-for-apps-sharing", jC);
        editorEdit.apply();
    }

    @Override // p.bep0
    public final boolean b() {
        return this.c.b();
    }

    @Override // p.bep0
    public final Object d(Context context, List list, Long l, lnm lnmVar) {
        return this.c.d(context, list, l, lnmVar);
    }

    public final String e() {
        return DeviceId.Companion.Lpt5().LPT3();
    }

    public final DeviceId f(Context context, tug tugVar, sug sugVar, String str) {
        AppDatabase appDatabase = this.a;
        s6n1 s6n1VarA = appDatabase.u().a();
        DeviceId deviceIdLpt2 = DeviceId.Companion.lpt2(context, tugVar, sugVar, s6n1VarA == null ? new s6n1((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 1023) : s6n1VarA, str);
        try {
            f7n1 f7n1VarU = appDatabase.u();
            String strLPT3 = deviceIdLpt2.LPT3();
            String strCOM5 = deviceIdLpt2.COM5();
            if (strCOM5 == null) {
                strCOM5 = "";
            }
            String strCOM6 = deviceIdLpt2.COM6();
            if (strCOM6 == null) {
                strCOM6 = "";
            }
            String strCOM7 = deviceIdLpt2.COM7();
            if (strCOM7 == null) {
                strCOM7 = "";
            }
            String strCOM4 = deviceIdLpt2.cOM4();
            String strLpt5 = deviceIdLpt2.Lpt5();
            String strPrN = deviceIdLpt2.prN();
            String strCON = deviceIdLpt2.cON();
            if (strCON == null) {
                strCON = "";
            }
            Long lCom8 = deviceIdLpt2.Com8();
            qyo1.x(f7n1VarU.a, false, true, new vae1(f7n1VarU, new s6n1(strLPT3, strCOM5, strCOM6, strCOM7, strCOM4, strLpt5, strPrN, strCON, Long.valueOf(lCom8 != null ? lCom8.longValue() : 0L), 1), (byte) 18));
            return deviceIdLpt2;
        } catch (Exception e) {
            this.b.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(106, "Initialization", "An error occurred while updating the Room database", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
            return deviceIdLpt2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Object g(Application application, tug tugVar, sug sugVar, ArrayList arrayList, String str, Boolean bool, Long l, onm onmVar) {
        evg evgVar;
        Context context;
        long jCurrentTimeMillis;
        DeviceId deviceIdF;
        List list;
        DeviceId deviceId;
        long j;
        if (onmVar instanceof evg) {
            evgVar = (evg) onmVar;
            int i = evgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                evgVar.f = i - Integer.MIN_VALUE;
            } else {
                evgVar = new evg(this, onmVar);
            }
        } else {
            evgVar = new evg(this, onmVar);
        }
        evg evgVar2 = evgVar;
        Object obj = evgVar2.d;
        int i2 = evgVar2.f;
        DeviceId deviceId2 = null;
        if (i2 == 0) {
            hm5.M(obj);
            try {
                jCurrentTimeMillis = System.currentTimeMillis();
                deviceIdF = f(application, tugVar, sugVar, str);
                if (this.c.b()) {
                    if (arrayList == null) {
                        try {
                            list = z6x.a;
                        } catch (Exception e) {
                            e = e;
                            context = application;
                            j(context);
                            this.b.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(105, "Initialization", "An error occurred while generating the device ID", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                        }
                    } else {
                        list = arrayList;
                    }
                    Long l2 = new Long(5200L);
                    evgVar2.a = application;
                    evgVar2.b = deviceIdF;
                    evgVar2.c = jCurrentTimeMillis;
                    evgVar2.f = 1;
                    Object objH = h(application, str, list, bool, l2, evgVar2);
                    Object obj2 = d9n.a;
                    if (objH == obj2) {
                        return obj2;
                    }
                    context = application;
                    deviceId = deviceIdF;
                    obj = objH;
                    j = jCurrentTimeMillis;
                } else {
                    context = application;
                }
                String str2 = f;
                utw0 utw0Var = ike1.a;
                utw0Var.y(str2);
                utw0Var.o("***Debug fromApplication: " + deviceIdF, new Object[0]);
                utw0Var.y(str2);
                utw0Var.o("***Debug fromDevice: " + deviceId2, new Object[0]);
                if (deviceId2 != null && !nhc1.Y(deviceIdF.LPT3(), "extand", false)) {
                    deviceIdF = deviceId2;
                }
                DeviceId.Companion.lpt2(deviceIdF);
                String str3 = "***Debug Initialization Duration = " + (System.currentTimeMillis() - jCurrentTimeMillis);
                utw0Var.y(str2);
                utw0Var.o(str3, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                context = application;
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = evgVar2.c;
        deviceId = evgVar2.b;
        context = evgVar2.a;
        try {
            hm5.M(obj);
        } catch (Exception e3) {
            e = e3;
            j(context);
            this.b.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(105, "Initialization", "An error occurred while generating the device ID", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
        }
        DeviceId deviceId3 = deviceId;
        deviceId2 = (DeviceId) obj;
        deviceIdF = deviceId3;
        jCurrentTimeMillis = j;
        String str4 = f;
        utw0 utw0Var2 = ike1.a;
        utw0Var2.y(str4);
        utw0Var2.o("***Debug fromApplication: " + deviceIdF, new Object[0]);
        utw0Var2.y(str4);
        utw0Var2.o("***Debug fromDevice: " + deviceId2, new Object[0]);
        if (deviceId2 != null) {
            deviceIdF = deviceId2;
        }
        DeviceId.Companion.lpt2(deviceIdF);
        String str5 = "***Debug Initialization Duration = " + (System.currentTimeMillis() - jCurrentTimeMillis);
        utw0Var2.y(str4);
        utw0Var2.o(str5, new Object[0]);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Context context, String str, List list, Boolean bool, Long l, onm onmVar) {
        cvg cvgVar;
        if (onmVar instanceof cvg) {
            cvgVar = (cvg) onmVar;
            int i = cvgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvgVar.d = i - Integer.MIN_VALUE;
            } else {
                cvgVar = new cvg(this, onmVar);
            }
        } else {
            cvgVar = new cvg(this, onmVar);
        }
        Object objD = cvgVar.b;
        int i2 = cvgVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            if ((str != null && !ihc1.y0(str)) || !u890.j(bool, Boolean.TRUE) || list.isEmpty() || ((DeviceId.Companion.COM7() && Build.VERSION.SDK_INT < 28) || this.e)) {
                return null;
            }
            cvgVar.a = list;
            cvgVar.d = 1;
            objD = this.c.d(context, list, l, cvgVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = cvgVar.a;
            hm5.M(objD);
        }
        DeviceId deviceId = (DeviceId) objD;
        this.e = true;
        return deviceId;
    }

    public final ArrayList i(Application application, Boolean bool) {
        if (bool.equals(Boolean.TRUE)) {
            try {
                List<PackageInfo> installedPackages = application.getPackageManager().getInstalledPackages(4);
                ArrayList arrayList = new ArrayList();
                for (Object obj : installedPackages) {
                    ServiceInfo[] serviceInfoArr = ((PackageInfo) obj).services;
                    if (serviceInfoArr != null) {
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            if (nhc1.R(serviceInfo.name, "com.ravelin.core.repository.services.DeviceIdService", false)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new ComponentName(((PackageInfo) obj2).packageName, "com.ravelin.core.repository.services.DeviceIdService"));
                }
                return arrayList2;
            } catch (Exception e) {
                String strM = l1d.m("***Debug error getting installed packages: ", e.getMessage());
                utw0 utw0Var = ike1.a;
                utw0Var.y(f);
                utw0Var.o(strM, new Object[0]);
            }
        }
        return null;
    }

    public final void j(Context context) {
        DeviceId.Companion.lpt2(context);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final void k(Context context, List list, Boolean bool, String str, mvz0 mvz0Var) {
        boolean z;
        if (bool.equals(Boolean.TRUE) && list != null && (!list.isEmpty())) {
            long j = this.d.getLong("last-update-for-apps-sharing", 0L);
            if (c(context) != j || j == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            if (z) {
                eg.o();
                return;
            } else {
                mvz0Var.a(new RavelinError("No sharing apps to send", (String) null, 2, (DefaultConstructorMarker) null));
                return;
            }
        }
        if (list != null) {
            String packageName = context.getPackageName();
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ComponentName) it.next()).getPackageName());
            }
            SharedPackages sharedPackages = new SharedPackages("7.0.0", "android", packageName, str, o7h.Z0(arrayList));
            i6n1 i6n1Var = this.b.c;
            i6n1Var.d = null;
            i6n1Var.e = sharedPackages;
            i6n1Var.f = "clickstream";
            i6n1Var.b(mvz0Var);
        }
    }
}
