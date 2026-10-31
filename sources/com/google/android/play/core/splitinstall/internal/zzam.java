package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.g2o1;
import p.zan1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzam {
    private final g2o1 zza;
    private final zzah zzb;
    private final Context zzc;
    private final zzal zzd;
    private PackageInfo zze;

    public zzam(Context context, g2o1 g2o1Var, zzah zzahVar) {
        zzal zzalVar = new zzal(new zan1(g2o1Var));
        this.zza = g2o1Var;
        this.zzb = zzahVar;
        this.zzc = context;
        this.zzd = zzalVar;
    }

    private final PackageInfo zzd() {
        PackageInfo packageInfo = this.zze;
        if (packageInfo != null) {
            return packageInfo;
        }
        try {
            PackageInfo packageInfo2 = this.zzc.getPackageManager().getPackageInfo(this.zzc.getPackageName(), 64);
            this.zze = packageInfo2;
            return packageInfo2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static X509Certificate zze(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    public final boolean zza(File[] fileArr) {
        PackageInfo packageInfoZzd = zzd();
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoZzd.getLongVersionCode() : packageInfoZzd.versionCode;
        AssetManager assetManager = (AssetManager) zzbk.zzc(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.zzd.zzb(assetManager, fileArr[length]);
        } while (longVersionCode == this.zzd.zza());
        return false;
    }

    public final boolean zzb(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String stringExtra = ((Intent) it.next()).getStringExtra("split_id");
            g2o1 g2o1Var = this.zza;
            g2o1Var.getClass();
            File file = new File(g2o1Var.g(), "verified-splits");
            g2o1.e(file);
            if (!g2o1.d(file, String.valueOf(stringExtra).concat(".apk")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzc(File[] fileArr) {
        PackageInfo packageInfoZzd = zzd();
        ArrayList<X509Certificate> arrayList = null;
        if (packageInfoZzd != null && packageInfoZzd.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : packageInfoZzd.signatures) {
                X509Certificate x509CertificateZze = zze(signature);
                if (x509CertificateZze != null) {
                    arrayList.add(x509CertificateZze);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                X509Certificate[][] x509CertificateArrZza = zzi.zza(fileArr[length].getAbsolutePath());
                if (x509CertificateArrZza == null || x509CertificateArrZza.length == 0 || x509CertificateArrZza[0].length == 0 || arrayList.isEmpty()) {
                    break;
                    break;
                    break;
                    break;
                }
                for (X509Certificate x509Certificate : arrayList) {
                    for (X509Certificate[] x509CertificateArr : x509CertificateArrZza) {
                        if (!x509CertificateArr[0].equals(x509Certificate)) {
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
