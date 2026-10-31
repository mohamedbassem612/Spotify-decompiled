package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzbr;
import com.google.android.play.core.splitinstall.internal.zzbu;
import com.google.android.play.core.splitinstall.internal.zzu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p.bsd1;
import p.o0c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzbc {
    private static final zzu zzb = new zzu("SplitInstallService");
    private static final Intent zzc = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    zzaf zza;
    private final String zzd;

    public zzbc(Context context, String str) {
        this.zzd = str;
        if (zzbu.zza(context)) {
            this.zza = new zzaf(zzbr.zza(context), zzb, "SplitInstallService", zzc, zzak.zza, null);
        }
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(com.google.android.play.core.splitinstall.internal.zzn zznVar) {
        Bundle bundleZzo = zzo();
        bundleZzo.putParcelableArrayList("event_timestamps", new ArrayList<>(zznVar.zza()));
        return bundleZzo;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzm(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzn(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle zzo() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    private static Task zzp() {
        zzb.zzb("onError(%d)", new Object[]{-14});
        return o0c.y(new SplitInstallException(-14));
    }

    public final Task zzc(int i) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("cancelInstall(%d)", new Object[]{Integer.valueOf(i)});
        bsd1 bsd1Var = new bsd1();
        this.zza.zzs(new zzas(this, bsd1Var, i, bsd1Var), bsd1Var);
        return bsd1Var.a;
    }

    public final Task zzd(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredInstall(%s)", new Object[]{list});
        bsd1 bsd1Var = new bsd1();
        this.zza.zzs(new zzan(this, bsd1Var, list, bsd1Var), bsd1Var);
        return bsd1Var.a;
    }

    public final Task zze(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredLanguageInstall(%s)", new Object[]{list});
        bsd1 bsd1Var = new bsd1();
        this.zza.zzs(new zzao(this, bsd1Var, list, bsd1Var), bsd1Var);
        return bsd1Var.a;
    }

    public final Task zzf(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredLanguageUninstall(%s)", new Object[]{list});
        bsd1 bsd1Var = new bsd1();
        this.zza.zzs(new zzap(this, bsd1Var, list, bsd1Var), bsd1Var);
        return bsd1Var.a;
    }

    public final Task zzg(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredUninstall(%s)", new Object[]{list});
        bsd1 bsd1Var = new bsd1();
        this.zza.zzs(new zzam(this, bsd1Var, list, bsd1Var), bsd1Var);
        return bsd1Var.a;
    }

    public final Task zzh(int i) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("getSessionState(%d)", new Object[]{Integer.valueOf(i)});
        bsd1 bsd1Var = new bsd1();
        this.zza.zzs(new zzaq(this, bsd1Var, i, bsd1Var), bsd1Var);
        return bsd1Var.a;
    }

    public final Task zzi() {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("getSessionStates", new Object[0]);
        bsd1 bsd1Var = new bsd1();
        this.zza.zzs(new zzar(this, bsd1Var, bsd1Var), bsd1Var);
        return bsd1Var.a;
    }

    public final Task zzj(Collection collection, Collection collection2, com.google.android.play.core.splitinstall.internal.zzn zznVar) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("startInstall(%s,%s)", new Object[]{collection, collection2});
        bsd1 bsd1Var = new bsd1();
        this.zza.zzs(new zzal(this, bsd1Var, collection, collection2, zznVar, bsd1Var), bsd1Var);
        return bsd1Var.a;
    }
}
