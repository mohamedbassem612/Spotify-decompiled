package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.google.android.play.core.splitinstall.internal.zzah;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzao;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzr;
import com.google.android.play.core.splitinstall.zzs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p.cik1;
import p.g2o1;
import p.lpn1;
import p.mqh1;
import p.mxo1;
import p.seg1;
import p.vgo1;
import p.w0p1;
import p.y7p1;
import p.zan1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class SplitCompat {
    public static final /* synthetic */ int zza = 0;
    private static final AtomicReference zzb = new AtomicReference(null);
    private final g2o1 zzc;
    private final zzbe zzd;
    private final Set zze = new HashSet();
    private final zan1 zzf;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.play.core.splitinstall.internal.zzbh */
    private SplitCompat(Context context) throws zzbh {
        try {
            g2o1 g2o1Var = new g2o1(context);
            this.zzc = g2o1Var;
            this.zzf = new zan1(g2o1Var);
            this.zzd = new zzbe(context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new zzbh("Failed to initialize FileStorage", e);
        }
    }

    public static boolean install(Context context) {
        return zzi(context, false);
    }

    public static boolean installActivity(Context context) {
        StrictMode.ThreadPolicy threadPolicy;
        if (zzj()) {
            return false;
        }
        SplitCompat splitCompat = (SplitCompat) zzb.get();
        if (splitCompat == null) {
            if (context.getApplicationContext() != null) {
                install(context.getApplicationContext());
            }
            return install(context);
        }
        zan1 zan1Var = splitCompat.zzf;
        Set<String> setZzf = splitCompat.zzf();
        synchronized (zan1Var) {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                threadPolicy = null;
            }
            try {
                HashSet hashSet = new HashSet();
                for (String str : setZzf) {
                    g2o1 g2o1Var = zan1Var.a;
                    g2o1Var.getClass();
                    File file = new File(g2o1Var.g(), "verified-splits");
                    g2o1.e(file);
                    hashSet.add(g2o1.d(file, String.valueOf(str).concat(".apk")));
                }
                zan1Var.a(context, hashSet);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception unused3) {
                if (threadPolicy == null) {
                    return false;
                }
                StrictMode.setThreadPolicy(threadPolicy);
                return false;
            } catch (Throwable th) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th;
            }
        }
        return true;
    }

    public static boolean zzd(Context context) {
        return zzi(context, true);
    }

    public static boolean zze() {
        return zzb.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set zzf() {
        HashSet hashSet;
        synchronized (this.zze) {
            hashSet = new HashSet(this.zze);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            g2o1 g2o1Var = this.zzc;
            g2o1Var.getClass();
            File file = new File(g2o1Var.g(), "verified-splits");
            g2o1.e(file);
            g2o1.c(g2o1.d(file, String.valueOf(str).concat(".apk")));
        }
        this.zzd.zzb();
    }

    private final synchronized void zzh(Context context, boolean z) {
        try {
            if (z) {
                this.zzc.b();
            } else {
                vgo1.y().execute(new seg1(this, (byte) 24));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet<lpn1> hashSetA = this.zzc.a();
                Set setZza = this.zzd.zza();
                HashSet hashSet = new HashSet();
                Iterator it = hashSetA.iterator();
                while (it.hasNext()) {
                    String strB = ((lpn1) it.next()).b();
                    if (arrayList.contains(strB) || setZza.contains(zzs.zzb(strB))) {
                        hashSet.add(strB);
                        it.remove();
                    }
                }
                if (z) {
                    zzg(hashSet);
                } else if (!hashSet.isEmpty()) {
                    vgo1.y().execute(new mqh1(this, hashSet, false, (byte) 18));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSetA.iterator();
                while (it2.hasNext()) {
                    String strB2 = ((lpn1) it2.next()).b();
                    if (!zzs.zze(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!zzs.zze(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<lpn1> hashSet3 = new HashSet(hashSetA.size());
                for (lpn1 lpn1Var : hashSetA) {
                    String strB3 = lpn1Var.b();
                    int i = zzs.zza;
                    if (strB3.startsWith("config.") || hashSet2.contains(zzs.zzb(lpn1Var.b()))) {
                        hashSet3.add(lpn1Var);
                    }
                }
                mxo1 mxo1Var = new mxo1(this.zzc);
                zzan zzanVarZza = zzao.zza();
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile = null;
                if (z) {
                    zzanVarZza.zza(classLoader, mxo1Var.a());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        lpn1 lpn1Var2 = (lpn1) it3.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        mxo1.b(lpn1Var2, new cik1(mxo1Var, lpn1Var2, hashSet4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it3.remove();
                        } else {
                            zzanVarZza.zza(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                for (lpn1 lpn1Var3 : hashSet3) {
                    try {
                        ZipFile zipFile2 = new ZipFile(lpn1Var3.a());
                        try {
                            ZipEntry entry = zipFile2.getEntry("classes.dex");
                            zipFile2.close();
                            if (entry != null) {
                                g2o1 g2o1Var = this.zzc;
                                String strB4 = lpn1Var3.b();
                                g2o1Var.getClass();
                                File file = new File(g2o1Var.g(), "dex");
                                g2o1.e(file);
                                File fileD = g2o1.d(file, strB4);
                                g2o1.e(fileD);
                                if (!zzanVarZza.zzb(classLoader, fileD, lpn1Var3.a(), z)) {
                                    "split was not installed ".concat(lpn1Var3.a().toString());
                                }
                            }
                            hashSet5.add(lpn1Var3.a());
                        } catch (IOException e) {
                            e = e;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                this.zzf.a(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                for (lpn1 lpn1Var4 : hashSet3) {
                    if (hashSet5.contains(lpn1Var4.a())) {
                        hashSet6.add(lpn1Var4.b());
                    }
                }
                synchronized (this.zze) {
                    this.zze.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e4) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static boolean zzi(Context context, boolean z) {
        boolean z2;
        Context context2;
        if (zzj()) {
            return false;
        }
        AtomicReference atomicReference = zzb;
        SplitCompat splitCompat = new SplitCompat(context);
        while (true) {
            if (!atomicReference.compareAndSet(null, splitCompat)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        SplitCompat splitCompat2 = (SplitCompat) zzb.get();
        if (z2) {
            context2 = context;
            zzo.INSTANCE.zzb(new zzak(context2, vgo1.y(), new zzam(context, splitCompat2.zzc, new zzah()), splitCompat2.zzc, new y7p1()));
            zzr.zzb(new w0p1(splitCompat2));
            vgo1.y().execute(new seg1(context2, (byte) 23));
        } else {
            context2 = context;
        }
        try {
            splitCompat2.zzh(context2, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean zzj() {
        return false;
    }
}
