package p;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jhn {
    public static final ehn s = new ehn((byte) 1);
    public final Context a;
    public final p68 b;
    public final ham c;
    public final mxa1 d;
    public final uo5 e;
    public final dm70 f;
    public final d520 g;
    public final wl5 h;
    public final rm5 i;
    public final vhn j;
    public final pz3 k;
    public final ghn l;
    public final bh61 m;
    public cjn n;
    public final bsd1 o = new bsd1();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bsd1 f54p = new bsd1();
    public final bsd1 q = new bsd1();
    public final AtomicBoolean r = new AtomicBoolean(false);

    public jhn(Context context, dm70 dm70Var, p68 p68Var, d520 d520Var, ham hamVar, wl5 wl5Var, mxa1 mxa1Var, rm5 rm5Var, bh61 bh61Var, vhn vhnVar, pz3 pz3Var, ghn ghnVar, uo5 uo5Var) {
        this.a = context;
        this.f = dm70Var;
        this.b = p68Var;
        this.g = d520Var;
        this.c = hamVar;
        this.h = wl5Var;
        this.d = mxa1Var;
        this.i = rm5Var;
        this.j = vhnVar;
        this.k = pz3Var;
        this.l = ghnVar;
        this.m = bh61Var;
        this.e = uo5Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[LOOP:0: B:12:0x002b->B:14:0x0033, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[SYNTHETIC] */
    public static String f() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        ws10 ws10Var = ws10.Z;
        ClassLoader classLoader = jhn.class.getClassLoader();
        if (classLoader == null) {
            ws10Var.j();
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                ws10Var.f();
            }
            if (resourceAsStream == null) {
                return null;
            }
            ws10Var.c();
            byteArrayOutputStream = new ByteArrayOutputStream();
            bArr = new byte[1024];
            while (true) {
                i = resourceAsStream.read(bArr);
                if (i != -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream == null) {
            return null;
        }
        ws10Var.c();
        byteArrayOutputStream = new ByteArrayOutputStream();
        bArr = new byte[1024];
        while (true) {
            i = resourceAsStream.read(bArr);
            if (i != -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [byte[], java.io.Serializable] */
    public final void a(boolean z, s880 s880Var, boolean z2) {
        String str;
        h9z0 h9z0Var = rm5.X;
        ws10 ws10Var = ws10.Z;
        uo5.t();
        bh61 bh61Var = this.m;
        ArrayList arrayList = new ArrayList(bh61Var.h());
        if (arrayList.size() <= z) {
            ws10Var.g();
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        d520 d520Var = this.g;
        if (z2 && s880Var.l().b.b && Build.VERSION.SDK_INT >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                rm5 rm5Var = new rm5(d520Var);
                sua suaVar = rm5.X;
                suaVar.a();
                rm5Var.b = suaVar;
                if (str2 != null) {
                    rm5Var.b = new h9z0(d520Var.K(str2, "userlog"));
                }
                bh61Var.k(str2, historicalProcessExitReasons, rm5Var, mxa1.f(str2, d520Var, this.e));
            } else {
                ws10Var.g();
            }
        } else {
            ws10Var.g();
        }
        if (z2) {
            vhn vhnVar = this.j;
            if (vhnVar.d(str2)) {
                ws10Var.g();
                tmn0 tmn0VarA = vhnVar.a(str2);
                File fileE = tmn0VarA.e();
                xhn xhnVarD = tmn0VarA.d();
                if (fileE == null || !fileE.exists()) {
                    ws10Var.j();
                }
                if (xhnVarD == null) {
                    ws10Var.f();
                }
                if ((fileE == null || !fileE.exists()) && xhnVarD == null) {
                    ws10Var.j();
                } else {
                    long jLastModified = fileE.lastModified();
                    if (str2 != null) {
                        h9z0Var = new h9z0(d520Var.K(str2, "userlog"));
                    }
                    File fileH = d520Var.H(str2);
                    if (fileH.isDirectory()) {
                        c(jLastModified);
                        ?? E = h9z0Var.e();
                        File fileK = d520Var.K(str2, "user-data");
                        File fileK2 = d520Var.K(str2, "keys");
                        File fileK3 = d520Var.K(str2, "rollouts-state");
                        ArrayList arrayList2 = new ArrayList();
                        h9z0 h9z0Var2 = h9z0Var;
                        arrayList2.add(new thc("logs_file", "logs", (Serializable) E, (byte) 0));
                        arrayList2.add(new thc("crash_meta_file", "metadata", tmn0VarA.h(), (byte) 1));
                        arrayList2.add(new thc("session_meta_file", "session", tmn0VarA.p(), (byte) 1));
                        arrayList2.add(new thc("app_meta_file", "app", tmn0VarA.i(), (byte) 1));
                        arrayList2.add(new thc("device_meta_file", "device", tmn0VarA.a(), (byte) 1));
                        arrayList2.add(new thc("os_meta_file", "os", tmn0VarA.j(), (byte) 1));
                        File fileE2 = tmn0VarA.e();
                        arrayList2.add((fileE2 == null || !fileE2.exists()) ? new thc("minidump_file", "minidump", new byte[]{0}, (byte) 0) : new thc("minidump_file", "minidump", fileE2, (byte) 1));
                        arrayList2.add(new thc("user_meta_file", "user", fileK, (byte) 1));
                        arrayList2.add(new thc("keys_file", "keys", fileK2, (byte) 1));
                        arrayList2.add(new thc("rollouts_file", "rollouts", fileK3, (byte) 1));
                        lnn1.o(fileH, arrayList2);
                        ws10Var.c();
                        bh61Var.d(str2, arrayList2, xhnVarD);
                        h9z0Var2.f();
                    } else {
                        ws10Var.j();
                    }
                }
            }
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.l.b(null);
            str = null;
        }
        bh61Var.e(System.currentTimeMillis() / 1000, str);
    }

    public final void b(String str, Boolean bool) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ws10 ws10Var = ws10.Z;
        ws10Var.c();
        Locale locale = Locale.US;
        dm70 dm70Var = this.f;
        String str2 = dm70Var.c;
        wl5 wl5Var = this.h;
        f29 f29Var = new f29(str2, wl5Var.f, wl5Var.g, dm70Var.c().a, eqq.b(eqq.a(wl5Var.d)), wl5Var.h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        h29 h29Var = new h29(eth.F());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        cth cthVar = cth.a;
        String str5 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str5)) {
            ws10Var.g();
        } else {
            cth cthVar2 = (cth) cth.b.get(str5.toLowerCase(locale));
            if (cthVar2 != null) {
                cthVar = cthVar2;
            }
        }
        int iOrdinal = cthVar.ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jG = eth.g(this.a);
        boolean zB = eth.B();
        int iV = eth.v();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        this.j.c(str, jCurrentTimeMillis, new e29(f29Var, h29Var, new g29(iOrdinal, iAvailableProcessors, jG, blockCount, zB, iV)));
        if (bool.booleanValue() && str != null) {
            this.d.i(str);
        }
        rm5 rm5Var = this.i;
        ((n420) rm5Var.b).a();
        rm5Var.b = rm5.X;
        if (str != null) {
            rm5Var.b = new h9z0(((d520) rm5Var.a).K(str, "userlog"));
        }
        this.l.b(str);
        this.m.i(jCurrentTimeMillis, str);
    }

    public final void c(long j) {
        try {
            if (this.g.B(".ae" + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
            ws10.Z.h();
        }
    }

    public final boolean d(s880 s880Var) {
        ws10 ws10Var = ws10.Z;
        uo5.t();
        cjn cjnVar = this.n;
        if (cjnVar != null && cjnVar.e.get()) {
            ws10Var.j();
            return false;
        }
        ws10Var.g();
        try {
            a(true, s880Var, true);
            ws10Var.g();
            return true;
        } catch (Exception unused) {
            ws10Var.d();
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetH = this.m.h();
        if (navigableSetH.isEmpty()) {
            return null;
        }
        return (String) navigableSetH.first();
    }

    public final hfp1 g() {
        hfp1 hfp1VarI;
        ws10 ws10Var = ws10.Z;
        ArrayList arrayList = new ArrayList();
        for (File file : this.g.C()) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    ws10Var.j();
                    hfp1VarI = o0c.z((Object) null);
                } catch (ClassNotFoundException unused) {
                    ws10Var.c();
                    hfp1VarI = o0c.i(new ScheduledThreadPoolExecutor(1), new ihn(this, j));
                }
                arrayList.add(hfp1VarI);
            } catch (NumberFormatException unused2) {
                file.getName();
                ws10Var.j();
            }
            file.delete();
        }
        return o0c.S(arrayList);
    }

    public final void h() {
        ws10 ws10Var = ws10.Z;
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.d.h(strF);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    ws10Var.e();
                }
                ws10Var.f();
            }
        } catch (IOException unused) {
            ws10Var.h();
        }
    }

    public final void i(hfp1 hfp1Var) {
        hfp1 hfp1VarZ;
        ws10 ws10Var = ws10.Z;
        boolean zG = this.m.g();
        bsd1 bsd1Var = this.o;
        if (!zG) {
            ws10Var.g();
            bsd1Var.d(Boolean.FALSE);
            return;
        }
        ws10Var.g();
        p68 p68Var = this.b;
        if (p68Var.f()) {
            ws10Var.c();
            bsd1Var.d(Boolean.FALSE);
            hfp1VarZ = o0c.z(Boolean.TRUE);
        } else {
            ws10Var.c();
            ws10Var.g();
            bsd1Var.d(Boolean.TRUE);
            hfp1 hfp1VarP = p68Var.n().p(new twb((byte) 3));
            ws10Var.c();
            hfp1VarZ = fc11.Z(hfp1VarP, this.f54p.a);
        }
        hfp1VarZ.k((djn) this.e.b, new gal(this, hfp1Var, false, (byte) 11));
    }
}
