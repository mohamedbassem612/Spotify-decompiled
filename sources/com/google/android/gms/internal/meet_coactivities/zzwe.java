package com.google.android.gms.internal.meet_coactivities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p.cwl1;
import p.dm5;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzwe {
    public static final zzwe zza;
    private final zzxj zzb;
    private final Executor zzc;
    private final Object[][] zzd;
    private final List zze;
    private final Boolean zzf;
    private final Integer zzg;
    private final Integer zzh;

    static {
        zzwb zzwbVar = new zzwb();
        zzwbVar.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        zzwbVar.zzd = Collections.EMPTY_LIST;
        zza = new zzwe(zzwbVar, null);
    }

    public /* synthetic */ zzwe(zzwb zzwbVar, zzwd zzwdVar) {
        this.zzb = zzwbVar.zza;
        this.zzc = zzwbVar.zzb;
        this.zzd = zzwbVar.zzc;
        this.zze = zzwbVar.zzd;
        this.zzf = zzwbVar.zze;
        this.zzg = zzwbVar.zzf;
        this.zzh = zzwbVar.zzg;
    }

    private static zzwb zzp(zzwe zzweVar) {
        zzwb zzwbVar = new zzwb();
        zzwbVar.zza = zzweVar.zzb;
        zzwbVar.zzb = zzweVar.zzc;
        zzwbVar.zzc = zzweVar.zzd;
        zzwbVar.zzd = zzweVar.zze;
        zzwbVar.zze = zzweVar.zzf;
        zzwbVar.zzf = zzweVar.zzg;
        zzwbVar.zzg = zzweVar.zzh;
        return zzwbVar;
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zzb, "deadline");
        rl1VarR0.m((Object) null, "authority");
        rl1VarR0.m((Object) null, "callCredentials");
        Executor executor = this.zzc;
        rl1VarR0.m(executor != null ? executor.getClass() : null, "executor");
        rl1VarR0.m((Object) null, "compressorName");
        rl1VarR0.m(Arrays.deepToString(this.zzd), "customOptions");
        rl1VarR0.l("waitForReady", zzo());
        rl1VarR0.m(this.zzg, "maxInboundMessageSize");
        rl1VarR0.m(this.zzh, "maxOutboundMessageSize");
        rl1VarR0.m(this.zze, "streamTracerFactories");
        return rl1VarR0.toString();
    }

    public final zzwe zza(zzxj zzxjVar) {
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zza = zzxjVar;
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzb(Executor executor) {
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zzb = executor;
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzc(int i) {
        dm5.l("invalid maxsize %s", i, i >= 0);
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zzf = Integer.valueOf(i);
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzd(int i) {
        dm5.l("invalid maxsize %s", i, i >= 0);
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zzg = Integer.valueOf(i);
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zze(zzwc zzwcVar, Object obj) {
        Object[][] objArr;
        dm5.s(zzwcVar, "key");
        dm5.s(obj, "value");
        zzwb zzwbVarZzp = zzp(this);
        int i = 0;
        while (true) {
            objArr = this.zzd;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (zzwcVar == objArr[i][0]) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i == -1 ? 1 : 0), 2);
        zzwbVarZzp.zzc = objArr2;
        Object[][] objArr3 = this.zzd;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        Object[][] objArr4 = zzwbVarZzp.zzc;
        if (i == -1) {
            objArr4[this.zzd.length] = new Object[]{zzwcVar, obj};
        } else {
            objArr4[i] = new Object[]{zzwcVar, obj};
        }
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzf(zzwo zzwoVar) {
        ArrayList arrayList = new ArrayList(this.zze.size() + 1);
        arrayList.addAll(this.zze);
        arrayList.add(zzwoVar);
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zzd = Collections.unmodifiableList(arrayList);
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzg() {
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zze = Boolean.TRUE;
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzwe zzh() {
        zzwb zzwbVarZzp = zzp(this);
        zzwbVarZzp.zze = Boolean.FALSE;
        return new zzwe(zzwbVarZzp, null);
    }

    public final zzxj zzi() {
        return this.zzb;
    }

    public final Integer zzj() {
        return this.zzg;
    }

    public final Integer zzk() {
        return this.zzh;
    }

    public final Object zzl(zzwc zzwcVar) {
        dm5.s(zzwcVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                zzwc.zzb(zzwcVar);
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (zzwcVar == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    public final List zzm() {
        return this.zze;
    }

    public final Executor zzn() {
        return this.zzc;
    }

    public final boolean zzo() {
        return Boolean.TRUE.equals(this.zzf);
    }
}
