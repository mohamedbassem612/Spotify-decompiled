package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p.cwl1;
import p.dm5;
import p.i0c1;
import p.rl1;
import p.v0d1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaiu implements zzyi, zzaoy {
    private final zzyj zza;
    private final String zzb;
    private final zzain zzc;
    private final zzaez zzd;
    private final ScheduledExecutorService zze;
    private final zzya zzf;
    private final zzaek zzg;
    private final zzwh zzh;
    private final List zzi;
    private final zzabm zzj;
    private final zzaio zzk;
    private volatile List zzl;
    private final i0c1 zzm;
    private zzabl zzn;
    private zzabl zzo;
    private zzald zzp;
    private zzafa zzs;
    private volatile zzald zzt;
    private zzabe zzv;
    private zzahg zzw;
    private final Collection zzq = new ArrayList();
    private final zzahz zzr = new zzaib(this);
    private volatile zzxb zzu = zzxb.zzb(zzxa.IDLE);

    public zzaiu(List list, String str, String str2, zzahf zzahfVar, zzaez zzaezVar, ScheduledExecutorService scheduledExecutorService, v0d1 v0d1Var, zzabm zzabmVar, zzain zzainVar, zzya zzyaVar, zzaek zzaekVar, zzaem zzaemVar, zzyj zzyjVar, zzwh zzwhVar, List list2) {
        dm5.s(list, "addressGroups");
        dm5.n(!list.isEmpty(), "addressGroups is empty");
        zzI(list, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zzl = listUnmodifiableList;
        this.zzk = new zzaio(listUnmodifiableList);
        this.zzb = str;
        this.zzd = zzaezVar;
        this.zze = scheduledExecutorService;
        this.zzm = (i0c1) v0d1Var.get();
        this.zzj = zzabmVar;
        this.zzc = zzainVar;
        this.zzf = zzyaVar;
        this.zzg = zzaekVar;
        dm5.s(zzaemVar, "channelTracer");
        dm5.s(zzyjVar, "logId");
        this.zza = zzyjVar;
        dm5.s(zzwhVar, "channelLogger");
        this.zzh = zzwhVar;
        this.zzi = list2;
    }

    public static /* bridge */ /* synthetic */ void zzA(zzaiu zzaiuVar, zzxa zzxaVar) {
        zzaiuVar.zzj.zzd();
        zzaiuVar.zzJ(zzxb.zzb(zzxaVar));
    }

    public static /* bridge */ /* synthetic */ void zzB(zzaiu zzaiuVar) {
        zzaih zzaihVar = new zzaih(zzaiuVar);
        zzabm zzabmVar = zzaiuVar.zzj;
        zzabmVar.zzc(zzaihVar);
        zzabmVar.zzb();
    }

    public static /* bridge */ /* synthetic */ void zzC(zzaiu zzaiuVar, zzafa zzafaVar, boolean z) {
        zzaii zzaiiVar = new zzaii(zzaiuVar, zzafaVar, z);
        zzabm zzabmVar = zzaiuVar.zzj;
        zzabmVar.zzc(zzaiiVar);
        zzabmVar.zzb();
    }

    public static void zzD(zzaiu zzaiuVar, zzabe zzabeVar) {
        zzaiuVar.zzj.zzd();
        zzaiuVar.zzJ(zzxb.zzc(zzabeVar));
        zzahg zzahgVar = zzaiuVar.zzw;
        if (zzahgVar == null) {
            zzahgVar = new zzahg();
            zzaiuVar.zzw = zzahgVar;
        }
        long jZza = zzahgVar.zza();
        i0c1 i0c1Var = zzaiuVar.zzm;
        long jNanoTime = jZza - (i0c1Var.a ? System.nanoTime() - i0c1Var.b : 0L);
        zzaiuVar.zzh.zzb(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", zzK(zzabeVar), Long.valueOf(jNanoTime));
        dm5.z(zzaiuVar.zzn == null, "previous reconnectTask is not done");
        zzaiuVar.zzn = zzaiuVar.zzj.zza(new zzaic(zzaiuVar), jNanoTime, TimeUnit.NANOSECONDS, zzaiuVar.zze);
    }

    public static void zzE(zzaiu zzaiuVar) {
        zzxv zzxvVar;
        zzaiuVar.zzj.zzd();
        dm5.z(zzaiuVar.zzn == null, "Should have no reconnectTask scheduled");
        if (zzaiuVar.zzk.zzf()) {
            i0c1 i0c1Var = zzaiuVar.zzm;
            i0c1Var.a = false;
            i0c1Var.a();
        }
        SocketAddress socketAddressZzb = zzaiuVar.zzk.zzb();
        zzail zzailVar = null;
        if (socketAddressZzb instanceof zzxv) {
            zzxv zzxvVar2 = (zzxv) socketAddressZzb;
            zzxvVar = zzxvVar2;
            socketAddressZzb = zzxvVar2.zzb();
        } else {
            zzxvVar = null;
        }
        zzvz zzvzVarZza = zzaiuVar.zzk.zza();
        String str = (String) zzvzVarZza.zzc(zzxn.zza);
        zzaey zzaeyVar = new zzaey();
        if (str == null) {
            str = zzaiuVar.zzb;
        }
        zzaeyVar.zzb(str);
        zzaeyVar.zzc(zzvzVarZza);
        zzaeyVar.zze(null);
        zzaeyVar.zzd(zzxvVar);
        zzait zzaitVar = new zzait();
        zzaitVar.zza = zzaiuVar.zza;
        zzaim zzaimVar = new zzaim(zzaiuVar.zzd.zza(socketAddressZzb, zzaeyVar, zzaitVar), zzaiuVar.zzg, zzailVar);
        zzaitVar.zza = zzaimVar.zzc();
        zzaiuVar.zzf.zzb(zzaimVar);
        zzaiuVar.zzs = zzaimVar;
        zzaiuVar.zzq.add(zzaimVar);
        zzaiuVar.zzj.zzc(zzaimVar.zze(new zzais(zzaiuVar, zzaimVar)));
        zzaiuVar.zzh.zzb(2, "Started transport {0}", zzaitVar.zza);
    }

    private static void zzI(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dm5.s(it.next(), str);
        }
    }

    private final void zzJ(zzxb zzxbVar) {
        this.zzj.zzd();
        if (this.zzu.zza() != zzxbVar.zza()) {
            dm5.z(this.zzu.zza() != zzxa.SHUTDOWN, "Cannot transition out of SHUTDOWN to ".concat(zzxbVar.toString()));
            this.zzu = zzxbVar;
            ((zzakk) this.zzc).zza.zza(zzxbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzK(zzabe zzabeVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(zzabeVar.zza());
        if (zzabeVar.zzg() != null) {
            sb.append("(");
            sb.append(zzabeVar.zzg());
            sb.append(")");
        }
        if (zzabeVar.zzh() != null) {
            sb.append("[");
            sb.append(zzabeVar.zzh());
            sb.append("]");
        }
        return sb.toString();
    }

    public static /* bridge */ /* synthetic */ void zzz(zzaiu zzaiuVar) {
        zzaiuVar.zzj.zzd();
        zzabl zzablVar = zzaiuVar.zzn;
        if (zzablVar != null) {
            zzablVar.zza();
            zzaiuVar.zzn = null;
            zzaiuVar.zzw = null;
        }
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.k(this.zza.zza(), "logId");
        rl1VarR0.m(this.zzl, "addressGroups");
        return rl1VarR0.toString();
    }

    public final void zzF(zzabe zzabeVar) {
        zzaig zzaigVar = new zzaig(this, zzabeVar);
        zzabm zzabmVar = this.zzj;
        zzabmVar.zzc(zzaigVar);
        zzabmVar.zzb();
    }

    public final void zzG(List list) {
        dm5.s(list, "newAddressGroups");
        zzI(list, "newAddressGroups contains null entry");
        dm5.n(!list.isEmpty(), "newAddressGroups is empty");
        zzaif zzaifVar = new zzaif(this, Collections.unmodifiableList(new ArrayList(list)));
        zzabm zzabmVar = this.zzj;
        zzabmVar.zzc(zzaifVar);
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyn
    public final zzyj zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaoy
    public final zzaex zzh() {
        zzald zzaldVar = this.zzt;
        if (zzaldVar != null) {
            return zzaldVar;
        }
        zzabm zzabmVar = this.zzj;
        zzabmVar.zzc(new zzaid(this));
        zzabmVar.zzb();
        return null;
    }
}
