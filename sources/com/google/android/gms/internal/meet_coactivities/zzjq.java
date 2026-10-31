package com.google.android.gms.internal.meet_coactivities;

import j$.time.Duration;
import java.util.Map;
import java.util.function.UnaryOperator;
import p.gg11;
import p.h380;
import p.j380;
import p.mjh1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzjq extends zzjs {
    private final zzgg zzf;
    private zzji zzg;

    private zzjq(String str, long j, zzgg zzggVar) {
        super(str, j, zzqk.zze(), new zzjf(gg11.g));
        this.zzf = zzggVar;
    }

    public static zzjq zza(String str, long j, zzpr zzprVar, zzgg zzggVar) {
        zzjq zzjqVar = new zzjq(str, j, zzggVar);
        synchronized (zzjqVar.zza) {
            zzjqVar.zzg = new zzji(zzprVar);
        }
        return zzjqVar;
    }

    private final zzpy zzl() {
        h380 h380VarA = j380.a();
        mjh1 mjh1VarK = ((zzjp) this.zze).zza().g().k();
        while (mjh1VarK.hasNext()) {
            Map.Entry entry = (Map.Entry) mjh1VarK.next();
            h380VarA.e(Integer.valueOf(((zzqm) entry.getKey()).zza()), (zzqp) entry.getValue());
        }
        String str = this.zzb;
        zzpx zzpxVarZzc = zzpy.zzc();
        zzpxVarZzc.zzb(str);
        zzpxVarZzc.zzd(this.zzc);
        zzql zzqlVarZzb = zzqq.zzb();
        zzqlVarZzb.zzd((zzqk) this.zzd);
        zzqlVarZzb.zza(h380VarA.b(true));
        zzpxVarZzc.zzf(zzqlVarZzb);
        zzpxVarZzc.zzc(zzi());
        return (zzpy) zzpxVarZzc.zzk();
    }

    public final zzju zzb(UnaryOperator unaryOperator, zzqm zzqmVar) {
        int iZzk;
        zzpy zzpyVarZzl;
        synchronized (this.zza) {
            iZzk = zzk((zzqk) unaryOperator.apply((zzqk) this.zzd), 1);
            zzpyVarZzl = zzl();
        }
        zzql zzqlVarZzb = zzqq.zzb();
        zzqlVarZzb.zzb(zzqmVar);
        zzqq zzqqVar = (zzqq) zzqlVarZzb.zzl();
        zzpx zzpxVar = (zzpx) zzpyVarZzl.zzB();
        zzpxVar.zza(zzqqVar);
        return new zzjh(iZzk, (zzpy) zzpxVar.zzk());
    }

    public final zzpy zzc(Duration duration) {
        zzpy zzpyVarZzl;
        zzsh zzshVarZza;
        synchronized (this.zza) {
            zzpyVarZzl = zzl();
            zzshVarZza = zzvu.zza(this.zzg.zza((zzqk) zzg().zzb()));
        }
        zzsh zzshVarZza2 = zzvu.zza(duration);
        zzql zzqlVarZzb = zzqq.zzb();
        zzqj zzqjVarZzc = zzqk.zzc();
        zzqjVarZzc.zze(zzshVarZza);
        zzqjVarZzc.zzb(zzshVarZza2);
        zzqlVarZzb.zzc(zzqjVarZzc);
        zzqq zzqqVar = (zzqq) zzqlVarZzb.zzl();
        zzpx zzpxVar = (zzpx) zzpyVarZzl.zzB();
        zzpxVar.zzg(true);
        zzpxVar.zza(zzqqVar);
        return (zzpy) zzpxVar.zzk();
    }

    public final zzsh zzd() {
        zzsh zzshVarZza;
        synchronized (this.zza) {
            zzshVarZza = zzvu.zza(this.zzg.zza((zzqk) zzg().zzb()));
        }
        return zzshVarZza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjs
    public final /* bridge */ /* synthetic */ void zze(Object obj) {
        this.zzg.zzb(zzvu.zzb(((zzqk) obj).zzf()));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjs
    public final /* bridge */ /* synthetic */ int zzf(Object obj, Object obj2) {
        zzqk zzqkVar = (zzqk) obj;
        zzqk zzqkVar2 = (zzqk) obj2;
        if (zzqkVar != null) {
            zzqj zzqjVar = (zzqj) zzqkVar.zzB();
            zzqjVar.zza();
            zzqk zzqkVar3 = (zzqk) zzqjVar.zzk();
            zzqj zzqjVar2 = (zzqj) zzqkVar2.zzB();
            zzqjVar2.zza();
            return (zzqkVar3.equals(zzqjVar2.zzk()) && zzvu.zzb(zzqkVar.zzf()).minus(zzvu.zzb(zzqkVar2.zzf())).abs().compareTo(this.zzf.zzb()) <= 0) ? 1 : 2;
        }
        return 2;
    }
}
