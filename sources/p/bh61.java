package p;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bh61 {
    public final win a;
    public final zin b;
    public final w4r c;
    public final rm5 d;
    public final mxa1 e;
    public final dm70 f;
    public final uo5 g;

    public bh61(win winVar, zin zinVar, w4r w4rVar, rm5 rm5Var, mxa1 mxa1Var, dm70 dm70Var, uo5 uo5Var) {
        this.a = winVar;
        this.b = zinVar;
        this.c = w4rVar;
        this.d = rm5Var;
        this.e = mxa1Var;
        this.f = dm70Var;
        this.g = uo5Var;
    }

    public static mz8 a(mz8 mz8Var, rm5 rm5Var, mxa1 mxa1Var) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        lz8 lz8Var = new lz8(mz8Var);
        String strD = ((n420) rm5Var.b).d();
        if (strD != null) {
            lz8Var.e = new e09(strD);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        ava0 ava0Var = (ava0) ((AtomicMarkableReference) ((wh41) mxa1Var.e).c).getReference();
        synchronized (ava0Var) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(ava0Var.a));
        }
        List listF = f(mapUnmodifiableMap);
        ava0 ava0Var2 = (ava0) ((AtomicMarkableReference) ((wh41) mxa1Var.f).c).getReference();
        synchronized (ava0Var2) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(ava0Var2.a));
        }
        List listF2 = f(mapUnmodifiableMap2);
        if (!listF.isEmpty() || !listF2.isEmpty()) {
            oz8 oz8Var = mz8Var.c;
            oz8Var.getClass();
            jin jinVar = oz8Var.a;
            Boolean bool = oz8Var.d;
            kin kinVar = oz8Var.e;
            List list = oz8Var.f;
            int i = oz8Var.g;
            if (jinVar == null) {
                StringBuilder sb = new StringBuilder();
                if (jinVar == null) {
                    sb.append(" execution");
                }
                eg.m(l1d.p(sb, "Missing required properties:"));
                return null;
            }
            lz8Var.c = new oz8(jinVar, listF, listF2, bool, kinVar, list, i);
        }
        return lz8Var.a();
    }

    public static rin b(mz8 mz8Var, mxa1 mxa1Var) {
        List listUnmodifiableList;
        xaz0 xaz0Var = (xaz0) mxa1Var.g;
        synchronized (xaz0Var) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) xaz0Var.b));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            xm31 xm31Var = (xm31) listUnmodifiableList.get(i);
            xm31Var.getClass();
            f09 f09Var = new f09();
            x19 x19Var = (x19) xm31Var;
            String str = x19Var.e;
            if (str == null) {
                bhn0.i("Null variantId");
                return null;
            }
            String str2 = x19Var.b;
            if (str2 == null) {
                bhn0.i("Null rolloutId");
                return null;
            }
            f09Var.a = new h09(str2, str);
            f09Var.b(x19Var.c);
            f09Var.c = x19Var.d;
            f09Var.c(x19Var.f);
            arrayList.add(f09Var.a());
        }
        if (arrayList.isEmpty()) {
            return mz8Var;
        }
        lz8 lz8Var = new lz8(mz8Var);
        lz8Var.f = new j09(arrayList);
        return lz8Var.a();
    }

    public static bh61 c(Context context, dm70 dm70Var, d520 d520Var, wl5 wl5Var, rm5 rm5Var, mxa1 mxa1Var, bnj0 bnj0Var, s880 s880Var, rok0 rok0Var, ghn ghnVar, uo5 uo5Var) {
        win winVar = new win(context, dm70Var, wl5Var, bnj0Var, s880Var);
        zin zinVar = new zin(d520Var, s880Var, ghnVar);
        xin xinVar = w4r.b;
        jog1.b(context);
        return new bh61(winVar, zinVar, new w4r(new tl21(jog1.a().c(new xhc(w4r.c, w4r.d)).a("FIREBASE_CRASHLYTICS_REPORT", new bbx("json"), w4r.e), s880Var.l(), rok0Var)), rm5Var, mxa1Var, dm70Var, uo5Var);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                bhn0.i("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                bhn0.i("Null value");
                return null;
            }
            arrayList.add(new bz8(str, str2));
        }
        Collections.sort(arrayList, new m((byte) 26));
        return Collections.unmodifiableList(arrayList);
    }

    public final void d(String str, ArrayList arrayList, xhn xhnVar) {
        byte[] byteArray;
        byte[] byteArray2;
        Log.isLoggable("FirebaseCrashlytics", 3);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            ez8 ez8Var = null;
            if (!it.hasNext()) {
                List listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                if (listUnmodifiableList == null) {
                    bhn0.i("Null files");
                    return;
                }
                dz8 dz8Var = new dz8(listUnmodifiableList, (String) null);
                zin zinVar = this.b;
                d520 d520Var = zinVar.b;
                File fileK = d520Var.K(str, "report");
                fileK.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                String strA = zinVar.d.a(str);
                try {
                    xin xinVar = zin.g;
                    String strD = zin.d(fileK);
                    xinVar.getClass();
                    ty8 ty8VarA = xin.i(strD).a();
                    ty8VarA.j = null;
                    ty8VarA.k = dz8Var;
                    uy8 uy8VarA = ty8VarA.a();
                    if (xhnVar != null) {
                        ty8 ty8VarA2 = uy8VarA.a();
                        ty8VarA2.l = xhnVar;
                        uy8VarA = ty8VarA2.a();
                    }
                    ty8 ty8VarA3 = uy8VarA.a();
                    ty8VarA3.g = strA;
                    uin uinVar = uy8VarA.k;
                    if (uinVar != null) {
                        fz8 fz8VarA = uinVar.a();
                        fz8VarA.c = strA;
                        ty8VarA3.j = fz8VarA.a();
                    }
                    zin.e(new File((File) d520Var.h, str), xin.a.e(ty8VarA3.a()));
                    return;
                } catch (IOException unused) {
                    fileK.toString();
                    return;
                }
            }
            thc thcVar = (thc) it.next();
            switch (thcVar.a) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    byte[] bArr = (byte[]) thcVar.d;
                    if (bArr == null || bArr.length == 0) {
                        byteArray = null;
                    } else {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                try {
                                    gZIPOutputStream.write(bArr);
                                    gZIPOutputStream.finish();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        gZIPOutputStream.close();
                                        break;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream.close();
                                    break;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (IOException unused2) {
                        }
                    }
                    if (byteArray != null) {
                        ez8Var = new ez8(thcVar.b, byteArray);
                    }
                    break;
                default:
                    byte[] bArr2 = new byte[8192];
                    try {
                        InputStream inputStreamA = thcVar.a();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream2);
                                if (inputStreamA == null) {
                                    gZIPOutputStream2.close();
                                    byteArrayOutputStream2.close();
                                    if (inputStreamA != null) {
                                        inputStreamA.close();
                                    }
                                    byteArray2 = null;
                                } else {
                                    while (true) {
                                        try {
                                            int i = inputStreamA.read(bArr2);
                                            if (i > 0) {
                                                gZIPOutputStream2.write(bArr2, 0, i);
                                            } else {
                                                gZIPOutputStream2.finish();
                                                byteArray2 = byteArrayOutputStream2.toByteArray();
                                                gZIPOutputStream2.close();
                                                byteArrayOutputStream2.close();
                                                inputStreamA.close();
                                            }
                                        } catch (Throwable th5) {
                                            try {
                                                gZIPOutputStream2.close();
                                                break;
                                            } catch (Throwable th6) {
                                                th5.addSuppressed(th6);
                                            }
                                            throw th5;
                                        }
                                    }
                                }
                            } catch (Throwable th7) {
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        } catch (Throwable th9) {
                            if (inputStreamA != null) {
                                try {
                                    inputStreamA.close();
                                } catch (Throwable th10) {
                                    th9.addSuppressed(th10);
                                }
                            }
                            throw th9;
                        }
                    } catch (IOException unused3) {
                    }
                    if (byteArray2 != null) {
                        ez8Var = new ez8(thcVar.b, byteArray2);
                    }
                    break;
            }
            if (ez8Var != null) {
                arrayList2.add(ez8Var);
            }
        }
    }

    public final void e(long j, String str) {
        String[] list;
        zin zinVar = this.b;
        d520 d520Var = zinVar.b;
        d520Var.l(".com.google.firebase.crashlytics");
        d520Var.l(".com.google.firebase.crashlytics-ndk");
        if (!((String) d520Var.b).isEmpty()) {
            d520Var.l(".com.google.firebase.crashlytics.files.v1");
            final String str2 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) d520Var.c;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: p.c520
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str3) {
                    return str3.startsWith(str2);
                }
            })) != null) {
                for (String str3 : list) {
                    d520Var.l(str3);
                }
            }
        }
        NavigableSet<String> navigableSetDescendingSet = new TreeSet(d520Var.w()).descendingSet();
        if (str != null) {
            navigableSetDescendingSet.remove(str);
        }
        if (navigableSetDescendingSet.size() > 8) {
            while (navigableSetDescendingSet.size() > 8) {
                String str4 = (String) navigableSetDescendingSet.last();
                Log.isLoggable("FirebaseCrashlytics", 3);
                d520Var.r(str4);
                navigableSetDescendingSet.remove(str4);
            }
        }
        for (String str5 : navigableSetDescendingSet) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            xin xinVar = zin.g;
            List<File> listL = d520Var.L(str5, zin.i);
            if (listL.isEmpty()) {
                Log.isLoggable("FirebaseCrashlytics", 2);
            } else {
                Collections.sort(listL);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    boolean z = false;
                    for (File file2 : listL) {
                        try {
                            String strD = zin.d(file2);
                            xinVar.getClass();
                            try {
                                JsonReader jsonReader = new JsonReader(new StringReader(strD));
                                try {
                                    mz8 mz8VarD = xin.d(jsonReader);
                                    jsonReader.close();
                                    arrayList.add(mz8VarD);
                                    if (!z) {
                                        String name = file2.getName();
                                        if (!name.startsWith("event") || !name.endsWith("_")) {
                                        }
                                    }
                                    z = true;
                                } catch (Throwable th) {
                                    try {
                                        jsonReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IllegalStateException e) {
                                throw new IOException(e);
                            }
                        } catch (IOException unused) {
                            Objects.toString(file2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        String strD2 = new dij0(d520Var).d(str5);
                        String strA = zinVar.d.a(str5);
                        File fileK = d520Var.K(str5, "report");
                        try {
                            String strD3 = zin.d(fileK);
                            xinVar.getClass();
                            try {
                                uy8 uy8VarB = xin.i(strD3).b(j, strD2, z);
                                ty8 ty8VarA = uy8VarB.a();
                                ty8VarA.g = strA;
                                uin uinVar = uy8VarB.k;
                                if (uinVar != null) {
                                    fz8 fz8VarA = uinVar.a();
                                    fz8VarA.c = strA;
                                    ty8VarA.j = fz8VarA.a();
                                }
                                uy8 uy8VarA = ty8VarA.a();
                                uin uinVar2 = uy8VarA.k;
                                if (uinVar2 == null) {
                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                }
                                ty8 ty8VarA2 = uy8VarA.a();
                                fz8 fz8VarA2 = uinVar2.a();
                                fz8VarA2.k = arrayList;
                                ty8VarA2.j = fz8VarA2.a();
                                uy8 uy8VarA2 = ty8VarA2.a();
                                gz8 gz8Var = uy8VarA2.k;
                                if (gz8Var != null) {
                                    Log.isLoggable("FirebaseCrashlytics", 3);
                                    zin.e(z ? new File((File) d520Var.g, gz8Var.b) : new File((File) d520Var.f, gz8Var.b), xin.a.e(uy8VarA2));
                                    break;
                                }
                                break;
                            } catch (IOException unused2) {
                                fileK.toString();
                                break;
                            }
                        } catch (IOException unused3) {
                        }
                    }
                }
                d520Var.r(str5);
            }
            d520Var.r(str5);
        }
        ho41 ho41Var = zinVar.c.l().a;
        ArrayList arrayListB = zinVar.b();
        int size = arrayListB.size();
        if (size <= 4) {
            return;
        }
        Iterator it = arrayListB.subList(4, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final boolean g() {
        d520 d520Var = this.b.b;
        return (d520Var.J().isEmpty() && d520Var.I().isEmpty() && d520Var.G().isEmpty()) ? false : true;
    }

    public final NavigableSet h() {
        return new TreeSet(this.b.b.w()).descendingSet();
    }

    public final void i(long j, String str) {
        Integer num;
        Charset charset = vin.a;
        ty8 ty8Var = new ty8();
        ty8Var.a = "19.3.0";
        win winVar = this.a;
        wl5 wl5Var = winVar.c;
        String str2 = wl5Var.a;
        if (str2 == null) {
            bhn0.i("Null gmpAppId");
            return;
        }
        ty8Var.b = str2;
        dm70 dm70Var = winVar.b;
        String str3 = dm70Var.c().a;
        if (str3 == null) {
            bhn0.i("Null installationUuid");
            return;
        }
        ty8Var.d = str3;
        ty8Var.e = dm70Var.c().b;
        ty8Var.f = dm70Var.c().c;
        String str4 = wl5Var.f;
        if (str4 == null) {
            bhn0.i("Null buildVersion");
            return;
        }
        ty8Var.h = str4;
        String str5 = wl5Var.g;
        if (str5 == null) {
            bhn0.i("Null displayVersion");
            return;
        }
        ty8Var.i = str5;
        ty8Var.c = 4;
        ty8Var.m = (byte) (ty8Var.m | 1);
        fz8 fz8Var = new fz8();
        fz8Var.f = false;
        byte b = (byte) (fz8Var.m | 2);
        fz8Var.d = j;
        fz8Var.m = (byte) (b | 1);
        if (str == null) {
            bhn0.i("Null identifier");
            return;
        }
        fz8Var.b = str;
        String str6 = win.g;
        if (str6 == null) {
            bhn0.i("Null generator");
            return;
        }
        fz8Var.a = str6;
        String str7 = dm70Var.c;
        if (str7 == null) {
            bhn0.i("Null identifier");
            return;
        }
        String str8 = dm70Var.c().a;
        rm5 rm5Var = wl5Var.h;
        xot xotVar = (xot) rm5Var.b;
        if (xotVar == null) {
            xotVar = new xot(rm5Var);
            rm5Var.b = xotVar;
        }
        String str9 = xotVar.b;
        xot xotVar2 = (xot) rm5Var.b;
        if (xotVar2 == null) {
            xotVar2 = new xot(rm5Var);
            rm5Var.b = xotVar2;
        }
        fz8Var.g = new hz8(str7, str4, str5, str8, str9, xotVar2.c);
        k09 k09Var = new k09();
        k09Var.a = 3;
        k09Var.e = (byte) (k09Var.e | 1);
        String str10 = Build.VERSION.RELEASE;
        if (str10 == null) {
            bhn0.i("Null version");
            return;
        }
        k09Var.b = str10;
        String str11 = Build.VERSION.CODENAME;
        if (str11 == null) {
            bhn0.i("Null buildVersion");
            return;
        }
        k09Var.c = str11;
        k09Var.d = eth.F();
        k09Var.e = (byte) (k09Var.e | 2);
        fz8Var.i = k09Var.a();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str12 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str12) && (num = (Integer) win.f.get(str12.toLowerCase(Locale.US))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jG = eth.g(winVar.a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zB = eth.B();
        int iV = eth.v();
        String str13 = Build.MANUFACTURER;
        String str14 = Build.PRODUCT;
        jz8 jz8Var = new jz8();
        jz8Var.a = iIntValue;
        byte b2 = (byte) (jz8Var.j | 1);
        jz8Var.j = b2;
        String str15 = Build.MODEL;
        if (str15 == null) {
            bhn0.i("Null model");
            return;
        }
        jz8Var.b = str15;
        jz8Var.c = iAvailableProcessors;
        jz8Var.d = jG;
        jz8Var.e = blockCount;
        jz8Var.f = zB;
        jz8Var.g = iV;
        jz8Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str13 == null) {
            bhn0.i("Null manufacturer");
            return;
        }
        jz8Var.h = str13;
        if (str14 == null) {
            bhn0.i("Null modelClass");
            return;
        }
        jz8Var.i = str14;
        fz8Var.j = jz8Var.a();
        fz8Var.l = 3;
        fz8Var.m = (byte) (fz8Var.m | 4);
        ty8Var.j = fz8Var.a();
        uy8 uy8VarA = ty8Var.a();
        d520 d520Var = this.b.b;
        gz8 gz8Var = uy8VarA.k;
        if (gz8Var == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        String str16 = gz8Var.b;
        try {
            zin.g.getClass();
            zin.e(d520Var.K(str16, "report"), xin.a.e(uy8VarA));
            File fileK = d520Var.K(str16, "start-time");
            long j2 = gz8Var.d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileK), zin.e);
            try {
                outputStreamWriter.write("");
                fileK.setLastModified(j2 * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException unused) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public final void j(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        boolean zEquals = str2.equals("crash");
        win winVar = this.a;
        Context context = winVar.a;
        int i = context.getResources().getConfiguration().orientation;
        bnj0 bnj0Var = winVar.d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        hce1 hce1Var = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            hce1Var = new hce1(th2.getLocalizedMessage(), th2.getClass().getName(), bnj0Var.h(th2.getStackTrace()), hce1Var, (byte) 14);
        }
        hce1 hce1Var2 = hce1Var;
        lz8 lz8Var = new lz8();
        lz8Var.b = str2;
        lz8Var.f(j);
        b09 b09VarB = hrw0.a.b(context);
        int i2 = b09VarB.c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListA = hrw0.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hce1Var2.d;
        wz8 wz8Var = new wz8();
        wz8Var.d(thread.getName());
        wz8Var.c(4);
        wz8Var.b(win.d(stackTraceElementArr, 4));
        arrayList.add(wz8Var.a());
        if (z) {
            for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrH = bnj0Var.h(next.getValue());
                    wz8 wz8Var2 = new wz8();
                    wz8Var2.d(key.getName());
                    wz8Var2.c(0);
                    wz8Var2.b(win.d(stackTraceElementArrH, 0));
                    arrayList.add(wz8Var2.a());
                }
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        tz8 tz8VarC = win.c(hce1Var2, 0);
        uz8 uz8Var = new uz8();
        uz8Var.d("0");
        uz8Var.c("0");
        uz8Var.b(0L);
        vz8 vz8VarA = uz8Var.a();
        List listA = winVar.a();
        if (listA == null) {
            bhn0.i("Null binaries");
            return;
        }
        lz8Var.c = new oz8(new pz8(listUnmodifiableList, tz8VarC, (xhn) null, vz8VarA, listA), (List) null, (List) null, boolValueOf, b09VarB, arrayListA, i);
        lz8Var.d = winVar.b(i);
        mz8 mz8VarA = lz8Var.a();
        rm5 rm5Var = this.d;
        mxa1 mxa1Var = this.e;
        rin rinVarB = b(a(mz8VarA, rm5Var, mxa1Var), mxa1Var);
        if (z) {
            this.b.c(rinVarB, str, zEquals);
        } else {
            ((djn) this.g.c).a(new qo00(this, rinVarB, str, zEquals));
        }
    }

    public final void k(String str, List list, rm5 rm5Var, mxa1 mxa1Var) {
        List listUnmodifiableList;
        ApplicationExitInfo applicationExitInfoB;
        String string;
        zin zinVar = this.b;
        long jLastModified = zinVar.b.K(str, "start-time").lastModified();
        Iterator it = list.iterator();
        do {
            listUnmodifiableList = null;
            if (it.hasNext()) {
                applicationExitInfoB = k220.b(it.next());
                if (applicationExitInfoB.getTimestamp() < jLastModified) {
                }
            }
            applicationExitInfoB = null;
            break;
        } while (applicationExitInfoB.getReason() != 6);
        char c = 2;
        if (applicationExitInfoB == null) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        try {
            InputStream traceInputStream = applicationExitInfoB.getTraceInputStream();
            if (traceInputStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = traceInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    string = null;
                }
                string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            } else {
                string = null;
            }
        } catch (IOException e) {
            applicationExitInfoB.toString();
            e.toString();
        }
        wy8 wy8Var = new wy8();
        wy8Var.c(applicationExitInfoB.getImportance());
        wy8Var.e(applicationExitInfoB.getProcessName());
        wy8Var.g(applicationExitInfoB.getReason());
        wy8Var.i(applicationExitInfoB.getTimestamp());
        wy8Var.d(applicationExitInfoB.getPid());
        wy8Var.f(applicationExitInfoB.getPss());
        wy8Var.h(applicationExitInfoB.getRss());
        wy8Var.h = string;
        xy8 xy8VarA = wy8Var.a();
        win winVar = this.a;
        int i2 = winVar.a.getResources().getConfiguration().orientation;
        lz8 lz8Var = new lz8();
        lz8Var.b = "anr";
        long j = xy8VarA.g;
        lz8Var.f(j);
        ArrayList<mbc> arrayList = winVar.c.c;
        if (winVar.e.l().b.c && arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (mbc mbcVar : arrayList) {
                yy8 yy8Var = new yy8();
                yy8Var.i(mbcVar.a);
                yy8Var.e(mbcVar.b);
                yy8Var.f(mbcVar.c);
                arrayList2.add(yy8Var.c());
                c = c;
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        wy8 wy8Var2 = new wy8();
        wy8Var2.c(xy8VarA.d);
        wy8Var2.e(xy8VarA.b);
        wy8Var2.g(xy8VarA.c);
        wy8Var2.i(j);
        wy8Var2.d(xy8VarA.a);
        wy8Var2.f(xy8VarA.e);
        wy8Var2.h(xy8VarA.f);
        wy8Var2.h = xy8VarA.h;
        wy8Var2.i = listUnmodifiableList;
        xy8 xy8VarA2 = wy8Var2.a();
        int i3 = xy8VarA2.d;
        Boolean boolValueOf = Boolean.valueOf(i3 != 100);
        String str2 = xy8VarA2.b;
        int i4 = xy8VarA2.a;
        a09 a09Var = new a09();
        a09Var.a = str2;
        a09Var.b = i4;
        byte b = (byte) (a09Var.e | 1);
        a09Var.c = i3;
        a09Var.d = false;
        a09Var.e = (byte) (((byte) (b | 2)) | 4);
        b09 b09VarA = a09Var.a();
        uz8 uz8Var = new uz8();
        uz8Var.d("0");
        uz8Var.c("0");
        uz8Var.b(0L);
        vz8 vz8VarA = uz8Var.a();
        List listA = winVar.a();
        if (listA == null) {
            bhn0.i("Null binaries");
            return;
        }
        lz8Var.c = new oz8(new pz8((List) null, (tz8) null, xy8VarA2, vz8VarA, listA), (List) null, (List) null, boolValueOf, b09VarA, (List) null, i2);
        lz8Var.d = winVar.b(i2);
        mz8 mz8VarA = lz8Var.a();
        Log.isLoggable("FirebaseCrashlytics", 3);
        zinVar.c(b(a(mz8VarA, rm5Var, mxa1Var), mxa1Var), str, true);
    }

    public final hfp1 l(String str, Executor executor) {
        bsd1 bsd1Var;
        ArrayList<File> arrayListB = this.b.b();
        ArrayList<vy8> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                xin xinVar = zin.g;
                String strD = zin.d(file);
                xinVar.getClass();
                arrayList.add(new vy8(xin.i(strD), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (vy8 vy8Var : arrayList) {
            if (str == null || str.equals(vy8Var.b)) {
                w4r w4rVar = this.c;
                uy8 uy8Var = vy8Var.a;
                if (uy8Var.f == null || uy8Var.g == null) {
                    ij20 ij20VarB = this.f.b(true);
                    uy8 uy8Var2 = vy8Var.a;
                    String str2 = ij20VarB.a;
                    ty8 ty8VarA = uy8Var2.a();
                    ty8VarA.e = str2;
                    uy8 uy8VarA = ty8VarA.a();
                    String str3 = ij20VarB.b;
                    ty8 ty8VarA2 = uy8VarA.a();
                    ty8VarA2.f = str3;
                    vy8Var = new vy8(ty8VarA2.a(), vy8Var.b, vy8Var.c);
                }
                boolean z = str != null;
                tl21 tl21Var = w4rVar.a;
                synchronized (tl21Var.f) {
                    try {
                        bsd1Var = new bsd1();
                        if (z) {
                            ((AtomicInteger) tl21Var.i.b).getAndIncrement();
                            if (tl21Var.f.size() < tl21Var.e) {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                tl21Var.f.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                tl21Var.g.execute(new sl21(tl21Var, vy8Var, bsd1Var));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                bsd1Var.d(vy8Var);
                            } else {
                                tl21Var.a();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                ((AtomicInteger) tl21Var.i.c).getAndIncrement();
                                bsd1Var.d(vy8Var);
                            }
                        } else {
                            tl21Var.b(vy8Var, bsd1Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(bsd1Var.a.o(executor, new f341(this)));
            }
        }
        return o0c.S(arrayList2);
    }
}
