package p;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class win {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final dm70 b;
    public final wl5 c;
    public final bnj0 d;
    public final s880 e;

    static {
        HashMap map = new HashMap();
        f = map;
        cy30.v(5, map, "armeabi", 6, "armeabi-v7a");
        cy30.v(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/19.3.0";
    }

    public win(Context context, dm70 dm70Var, wl5 wl5Var, bnj0 bnj0Var, s880 s880Var) {
        this.a = context;
        this.b = dm70Var;
        this.c = wl5Var;
        this.d = bnj0Var;
        this.e = s880Var;
    }

    public static tz8 c(hce1 hce1Var, int i) {
        String str = (String) hce1Var.c;
        String str2 = (String) hce1Var.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hce1Var.d;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        hce1 hce1Var2 = (hce1) hce1Var.e;
        if (i >= 8) {
            hce1 hce1Var3 = hce1Var2;
            while (hce1Var3 != null) {
                hce1Var3 = (hce1) hce1Var3.e;
                i2++;
            }
        }
        sz8 sz8Var = new sz8();
        sz8Var.f(str);
        sz8Var.e(str2);
        sz8Var.c(d(stackTraceElementArr, 4));
        sz8Var.d(i2);
        if (hce1Var2 != null && i2 == 0) {
            sz8Var.b(c(hce1Var2, i + 1));
        }
        return sz8Var.a();
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            yz8 yz8Var = new yz8();
            yz8Var.c(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            yz8Var.e(jMax);
            yz8Var.f(str);
            yz8Var.b(fileName);
            yz8Var.d(lineNumber);
            arrayList.add(yz8Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        qz8 qz8Var = new qz8();
        qz8Var.b(0L);
        qz8Var.d(0L);
        wl5 wl5Var = this.c;
        qz8Var.c(wl5Var.e);
        qz8Var.e(wl5Var.b);
        return Collections.singletonList(qz8Var.a());
    }

    public final d09 b(int i) {
        Context context = this.a;
        lls0 lls0VarO = lls0.o(context);
        Float fP = lls0VarO.p();
        Double dValueOf = fP != null ? Double.valueOf(fP.doubleValue()) : null;
        int iQ = lls0VarO.q();
        boolean z = false;
        if (!eth.B() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        long jG = eth.g(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jG - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        c09 c09Var = new c09();
        c09Var.b(dValueOf);
        c09Var.c(iQ);
        c09Var.f(z);
        c09Var.e(i);
        c09Var.g(j);
        c09Var.d(blockCount);
        return c09Var.a();
    }
}
