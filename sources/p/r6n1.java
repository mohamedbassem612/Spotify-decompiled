package p;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import com.ravelin.core.util.security.RootCheckerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r6n1 implements mvg {
    public static final String c;
    public final Application a;
    public final ynb0 b;

    static {
        String canonicalName = r6n1.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = r6n1.class.getSimpleName();
        }
        c = canonicalName;
    }

    public r6n1(Application application, ynb0 ynb0Var) {
        this.a = application;
        this.b = ynb0Var;
    }

    public static boolean a(String str) {
        boolean z = false;
        for (String str2 : aep0.a()) {
            String strE = f4i1.e(str2, str);
            boolean zExists = new File(str2, str).exists();
            Boolean boolValueOf = Boolean.valueOf(zExists);
            if (!zExists) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                String strF = f4i1.f("file ", strE, " detected in PATH");
                utw0 utw0Var = ike1.a;
                utw0Var.y(c);
                utw0Var.o(strF, new Object[0]);
                z = true;
            }
        }
        return z;
    }

    public final boolean b(String str, List list, String str2, String str3) {
        String str4 = c;
        PackageManager packageManager = this.a.getApplicationContext().getPackageManager();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            try {
                utw0 utw0Var = ike1.a;
                utw0Var.y(str4);
                utw0Var.o(str + " " + str5, new Object[0]);
                if (Build.VERSION.SDK_INT >= 33) {
                    packageManager.getPackageInfo(str5, PackageManager.PackageInfoFlags.of(0L));
                } else {
                    packageManager.getPackageInfo(str5, 0);
                }
                utw0Var.y(str4);
                utw0Var.o(str2 + ": " + str5, new Object[0]);
                z = true;
            } catch (PackageManager.NameNotFoundException e) {
                String strP = cy30.p(str3, ": ", str5, ", more information: ", e.getMessage());
                utw0 utw0Var2 = ike1.a;
                utw0Var2.y(str4);
                utw0Var2.o(strP, new Object[0]);
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0261  */
    /* JADX WARN: Code duplicated, block: B:104:0x0264  */
    /* JADX WARN: Code duplicated, block: B:106:0x0268  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:110:0x027e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0294 A[Catch: all -> 0x0299, Exception -> 0x029d, TryCatch #2 {Exception -> 0x029d, blocks: (B:112:0x028e, B:114:0x0294, B:120:0x02a1), top: B:179:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:119:0x029f  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:144:0x030d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0320 A[LOOP:6: B:145:0x031a->B:147:0x0320, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x037a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0385  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b5 A[Catch: RuntimeException -> 0x03c2, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x03c2, blocks: (B:157:0x038b, B:159:0x039f, B:161:0x03a5, B:163:0x03b5), top: B:181:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x03de  */
    /* JADX WARN: Code duplicated, block: B:205:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x039e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183 A[Catch: Exception -> 0x0199, TRY_LEAVE, TryCatch #4 {Exception -> 0x0199, blocks: (B:67:0x0175, B:69:0x0183), top: B:183:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x0205  */
    /* JADX WARN: Code duplicated, block: B:87:0x0212  */
    /* JADX WARN: Code duplicated, block: B:89:0x0216  */
    /* JADX WARN: Code duplicated, block: B:92:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x0320, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.InputStream] */
    public final boolean c(boolean z) throws Throwable {
        Throwable th;
        ?? r14;
        boolean z2;
        ?? r0;
        boolean z3;
        String str;
        Object objValueOf;
        ?? r12;
        ?? Exec;
        boolean z4;
        boolean z5;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        RootCheckerNative rootCheckerNative;
        boolean z6;
        Boolean boolValueOf;
        Object obj;
        ArrayList arrayList;
        Iterator it;
        boolean zB;
        ?? inputStream;
        List listQ0;
        String str2;
        String strW;
        boolean zContains;
        Object objValueOf2;
        boolean z7;
        Iterator it2;
        boolean zS;
        Object objValueOf3;
        InputStream inputStream2;
        List listQ1;
        Set<Map.Entry> setEntrySet;
        mmr0 mmr0Var;
        String str3 = c;
        if (b("checking ROOT management application existence", aep0.a, "ROOT management application detected", "ROOT management application not found") || b("checking ROOT dangerous application existence", aep0.b, "ROOT dangerous application detected", "ROOT dangerous application not found") || a("su")) {
            return true;
        }
        List<mmr0> list = aep0.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (mmr0 mmr0Var2 : list) {
            linkedHashMap.put(mmr0Var2.a, mmr0Var2.b);
        }
        try {
            InputStream inputStream3 = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream3 != null) {
                List listQ2 = ihc1.Q0(new Scanner(inputStream3).useDelimiter("\\A").next(), new String[]{"\n"}, 0, 6);
                int iS = zno1.s(q7h.U(listQ2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                Iterator it3 = listQ2.iterator();
                while (it3.hasNext()) {
                    List listQ3 = ihc1.Q0((String) it3.next(), new String[]{":"}, 0, 6);
                    int size = listQ3.size();
                    Integer numValueOf = Integer.valueOf(size);
                    if (size != 2) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        th = null;
                        try {
                            mmr0Var = new mmr0(listQ3.get(0), listQ3.get(1));
                        } catch (Exception e) {
                            e = e;
                            String strM = l1d.m("Failed to read system properties: ", e.getMessage());
                            utw0 utw0Var = ike1.a;
                            utw0Var.y(str3);
                            utw0Var.o(strM, new Object[0]);
                            r14 = th;
                            z2 = false;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (r14 == 0) {
                                }
                            }
                            if (!z2) {
                                try {
                                    inputStream2 = Runtime.getRuntime().exec("mount").getInputStream();
                                    if (inputStream2 != null) {
                                        listQ1 = ihc1.Q0(new Scanner(inputStream2).useDelimiter("\\A").next(), new String[]{"\n"}, 0, 6);
                                    } else {
                                        r0 = th;
                                    }
                                } catch (Exception e2) {
                                    String strM2 = l1d.m("Failed to read mount directories: ", e2.getMessage());
                                    utw0 utw0Var2 = ike1.a;
                                    utw0Var2.y(str3);
                                    utw0Var2.o(strM2, new Object[0]);
                                }
                                if (r0 != 0) {
                                    r0 = listQ1;
                                    z3 = false;
                                    for (String str4 : r0) {
                                        listQ0 = ihc1.Q0(str4, new String[]{" "}, 0, 6);
                                        if (listQ0.size() < 6) {
                                            String strF = f4i1.f("mount directory ", str4, " wrong format");
                                            utw0 utw0Var3 = ike1.a;
                                            utw0Var3.y(str3);
                                            utw0Var3.o(strF, new Object[0]);
                                        } else {
                                            str2 = (String) listQ0.get(2);
                                            strW = nhc1.W(nhc1.W((String) listQ0.get(5), "(", ""), ")", "");
                                            if (str2 != null) {
                                                u890.C("mountPoint");
                                                throw th;
                                            }
                                            zContains = aep0.e.contains(str2);
                                            objValueOf2 = Boolean.valueOf(zContains);
                                            if (!zContains) {
                                                objValueOf2 = th;
                                            }
                                            if (objValueOf2 != null) {
                                                it2 = ihc1.Q0(strW, new String[]{","}, 0, 6).iterator();
                                                z7 = false;
                                                while (it2.hasNext()) {
                                                    zS = nhc1.S((String) it2.next(), "rw", true);
                                                    objValueOf3 = Boolean.valueOf(zS);
                                                    if (!zS) {
                                                        objValueOf3 = th;
                                                    }
                                                    if (objValueOf3 != null) {
                                                        String strF2 = f4i1.f("path ", str2, " with rw permissions");
                                                        utw0 utw0Var4 = ike1.a;
                                                        utw0Var4.y(str3);
                                                        utw0Var4.o(strF2, new Object[0]);
                                                        z7 = true;
                                                    }
                                                }
                                            } else {
                                                z7 = false;
                                            }
                                            z3 = z7;
                                        }
                                    }
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    r0 = listQ1;
                                    str = Build.TAGS;
                                    if (str != null) {
                                        objValueOf = Boolean.valueOf(ihc1.h0(str, "test-keys", true));
                                    } else {
                                        objValueOf = th;
                                    }
                                    if (!u890.j(objValueOf, Boolean.TRUE)) {
                                        try {
                                            Exec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                                            try {
                                                try {
                                                    if (Exec != 0) {
                                                        inputStream = Exec.getInputStream();
                                                    } else {
                                                        inputStream = th;
                                                    }
                                                    if (new BufferedReader(new InputStreamReader(inputStream)).readLine().length() > 0) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    if (Exec != 0) {
                                                        Exec.destroy();
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    Exec = Exec;
                                                    String str5 = "Error checking for su binary: " + e.getMessage();
                                                    utw0 utw0Var5 = ike1.a;
                                                    utw0Var5.y(str3);
                                                    utw0Var5.o(str5, new Object[0]);
                                                    if (Exec != 0) {
                                                        Exec.destroy();
                                                    }
                                                    z4 = false;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r12 = Exec;
                                                if (r12 != 0) {
                                                    r12.destroy();
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            Exec = th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r12 = th;
                                            if (r12 != 0) {
                                                r12.destroy();
                                            }
                                            throw th;
                                        }
                                        if (!z4) {
                                            if (z) {
                                                rootCheckerNative = (RootCheckerNative) this.b.get();
                                                z6 = rootCheckerNative.a;
                                                boolValueOf = Boolean.valueOf(z6);
                                                if (z6) {
                                                    obj = th;
                                                } else {
                                                    obj = boolValueOf;
                                                }
                                                if (obj != null) {
                                                    utw0 utw0Var6 = ike1.a;
                                                    utw0Var6.y(str3);
                                                    utw0Var6.o("Native library failed to load, diagnosis of rooting Natively is not possible", new Object[0]);
                                                } else {
                                                    arrayList = new ArrayList();
                                                    it = aep0.a().iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(((String) it.next()) + "su");
                                                    }
                                                    try {
                                                        rootCheckerNative.a();
                                                        zB = rootCheckerNative.b(arrayList.toArray(new Object[0]));
                                                        utw0 utw0Var7 = ike1.a;
                                                        utw0Var7.y(str3);
                                                        utw0Var7.o("native rooting check = " + zB, new Object[0]);
                                                    } catch (UnsatisfiedLinkError e5) {
                                                        String strM3 = l1d.m("Failed to link native lib with message: ", e5.getMessage());
                                                        utw0 utw0Var8 = ike1.a;
                                                        utw0Var8.y(str3);
                                                        utw0Var8.o(strM3, new Object[0]);
                                                        zB = false;
                                                    }
                                                    if (!zB) {
                                                        try {
                                                            runningAppProcesses = ((ActivityManager) this.a.getApplicationContext().getSystemService("activity")).getRunningAppProcesses();
                                                            runningAppProcesses.getClass();
                                                            loop7: while (true) {
                                                                z5 = true;
                                                                while (true) {
                                                                    if (ihc1.h0(runningAppProcessInfo.processName, "superuser", false)) {
                                                                        break;
                                                                    }
                                                                    z5 = false;
                                                                }
                                                            }
                                                        } catch (RuntimeException e6) {
                                                            String strM4 = l1d.m("Error checking for root in running services: ", e6.getMessage());
                                                            utw0 utw0Var9 = ike1.a;
                                                            utw0Var9.y(str3);
                                                            utw0Var9.o(strM4, new Object[0]);
                                                            z5 = false;
                                                        }
                                                        if (z5) {
                                                            return false;
                                                        }
                                                    }
                                                }
                                                zB = false;
                                                if (!zB) {
                                                    runningAppProcesses = ((ActivityManager) this.a.getApplicationContext().getSystemService("activity")).getRunningAppProcesses();
                                                    runningAppProcesses.getClass();
                                                    loop7: while (true) {
                                                        z5 = true;
                                                        while (true) {
                                                            if (ihc1.h0(runningAppProcessInfo.processName, "superuser", false)) {
                                                                break;
                                                                break;
                                                            }
                                                            z5 = false;
                                                        }
                                                    }
                                                    if (z5) {
                                                        return false;
                                                    }
                                                }
                                            } else {
                                                runningAppProcesses = ((ActivityManager) this.a.getApplicationContext().getSystemService("activity")).getRunningAppProcesses();
                                                runningAppProcesses.getClass();
                                                loop7: while (true) {
                                                    z5 = true;
                                                    while (true) {
                                                        if (ihc1.h0(runningAppProcessInfo.processName, "superuser", false)) {
                                                            break;
                                                            break;
                                                        }
                                                        z5 = false;
                                                    }
                                                }
                                                if (z5) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            r0 = listQ1;
                            return true;
                        }
                    } else {
                        mmr0Var = new mmr0(listQ3.get(0), "");
                    }
                    linkedHashMap2.put(mmr0Var.a, mmr0Var.b);
                }
                th = null;
                r14 = linkedHashMap2;
            } else {
                th = null;
                r14 = th;
            }
        } catch (Exception e7) {
            e = e7;
            th = null;
        }
        z2 = false;
        while (r0.hasNext()) {
            if (r14 == 0 && (setEntrySet = r14.entrySet()) != null) {
                for (Map.Entry entry2 : setEntrySet) {
                    boolean z8 = u890.j(entry2.getKey(), entry.getKey()) && u890.j(entry2.getValue(), entry.getValue());
                    Object objValueOf4 = Boolean.valueOf(z8);
                    if (!z8) {
                        objValueOf4 = th;
                    }
                    if (objValueOf4 != null) {
                        utw0 utw0Var10 = ike1.a;
                        utw0Var10.y(str3);
                        utw0Var10.o("Dangerous property found: " + entry, new Object[0]);
                        z2 = true;
                    }
                }
            }
        }
        if (!z2) {
            inputStream2 = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream2 != null) {
                listQ1 = ihc1.Q0(new Scanner(inputStream2).useDelimiter("\\A").next(), new String[]{"\n"}, 0, 6);
            } else {
                r0 = th;
            }
            if (r0 != 0) {
                r0 = listQ1;
                z3 = false;
                while (r0.hasNext()) {
                    listQ0 = ihc1.Q0(str4, new String[]{" "}, 0, 6);
                    if (listQ0.size() < 6) {
                        String strF3 = f4i1.f("mount directory ", str4, " wrong format");
                        utw0 utw0Var11 = ike1.a;
                        utw0Var11.y(str3);
                        utw0Var11.o(strF3, new Object[0]);
                    } else {
                        str2 = (String) listQ0.get(2);
                        strW = nhc1.W(nhc1.W((String) listQ0.get(5), "(", ""), ")", "");
                        if (str2 != null) {
                            u890.C("mountPoint");
                            throw th;
                        }
                        zContains = aep0.e.contains(str2);
                        objValueOf2 = Boolean.valueOf(zContains);
                        if (!zContains) {
                            objValueOf2 = th;
                        }
                        if (objValueOf2 != null) {
                            it2 = ihc1.Q0(strW, new String[]{","}, 0, 6).iterator();
                            z7 = false;
                            while (it2.hasNext()) {
                                zS = nhc1.S((String) it2.next(), "rw", true);
                                objValueOf3 = Boolean.valueOf(zS);
                                if (!zS) {
                                    objValueOf3 = th;
                                }
                                if (objValueOf3 != null) {
                                    String strF4 = f4i1.f("path ", str2, " with rw permissions");
                                    utw0 utw0Var12 = ike1.a;
                                    utw0Var12.y(str3);
                                    utw0Var12.o(strF4, new Object[0]);
                                    z7 = true;
                                }
                            }
                        } else {
                            z7 = false;
                        }
                        z3 = z7;
                    }
                }
            } else {
                z3 = false;
            }
            if (!z3) {
                r0 = listQ1;
                str = Build.TAGS;
                if (str != null) {
                    objValueOf = Boolean.valueOf(ihc1.h0(str, "test-keys", true));
                } else {
                    objValueOf = th;
                }
                if (!u890.j(objValueOf, Boolean.TRUE)) {
                    Exec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                    if (Exec != 0) {
                        inputStream = Exec.getInputStream();
                    } else {
                        inputStream = th;
                    }
                    if (new BufferedReader(new InputStreamReader(inputStream)).readLine().length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (Exec != 0) {
                        Exec.destroy();
                    }
                    if (!z4) {
                        if (z) {
                            rootCheckerNative = (RootCheckerNative) this.b.get();
                            z6 = rootCheckerNative.a;
                            boolValueOf = Boolean.valueOf(z6);
                            if (z6) {
                                obj = boolValueOf;
                            } else {
                                obj = th;
                            }
                            if (obj != null) {
                                utw0 utw0Var13 = ike1.a;
                                utw0Var13.y(str3);
                                utw0Var13.o("Native library failed to load, diagnosis of rooting Natively is not possible", new Object[0]);
                            } else {
                                arrayList = new ArrayList();
                                it = aep0.a().iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((String) it.next()) + "su");
                                }
                                rootCheckerNative.a();
                                zB = rootCheckerNative.b(arrayList.toArray(new Object[0]));
                                utw0 utw0Var14 = ike1.a;
                                utw0Var14.y(str3);
                                utw0Var14.o("native rooting check = " + zB, new Object[0]);
                                if (!zB && !a("magisk")) {
                                    runningAppProcesses = ((ActivityManager) this.a.getApplicationContext().getSystemService("activity")).getRunningAppProcesses();
                                    runningAppProcesses.getClass();
                                    loop7: while (true) {
                                        z5 = true;
                                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                            if (!ihc1.h0(runningAppProcessInfo.processName, "superuser", false) || ihc1.h0(runningAppProcessInfo.processName, "supersu", false)) {
                                                break;
                                            }
                                            z5 = false;
                                        }
                                        break loop7;
                                    }
                                    if (z5) {
                                        return false;
                                    }
                                }
                            }
                            zB = false;
                            if (!zB) {
                                runningAppProcesses = ((ActivityManager) this.a.getApplicationContext().getSystemService("activity")).getRunningAppProcesses();
                                runningAppProcesses.getClass();
                                loop7: while (true) {
                                    z5 = true;
                                    while (true) {
                                        if (ihc1.h0(runningAppProcessInfo.processName, "superuser", false)) {
                                            break;
                                            break;
                                        }
                                        z5 = false;
                                    }
                                }
                                if (z5) {
                                    return false;
                                }
                            }
                        } else {
                            runningAppProcesses = ((ActivityManager) this.a.getApplicationContext().getSystemService("activity")).getRunningAppProcesses();
                            runningAppProcesses.getClass();
                            loop7: while (true) {
                                z5 = true;
                                while (true) {
                                    if (ihc1.h0(runningAppProcessInfo.processName, "superuser", false)) {
                                        break;
                                        break;
                                    }
                                    z5 = false;
                                }
                            }
                            if (z5) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        r0 = listQ1;
        return true;
    }
}
