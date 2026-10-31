package com.google.android.gms.internal.meet_coactivities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.google.android.meet.addons.AddonException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p.b291;
import p.b380;
import p.bg11;
import p.c280;
import p.cfo1;
import p.dm5;
import p.dmd0;
import p.e661;
import p.eg;
import p.f280;
import p.fc11;
import p.fug;
import p.ghk1;
import p.gkm0;
import p.gug;
import p.h0s0;
import p.ha;
import p.hhg1;
import p.hug;
import p.i02;
import p.ia;
import p.ikj1;
import p.j0o1;
import p.ldn1;
import p.lf8;
import p.lls0;
import p.m5n1;
import p.n02;
import p.n8d0;
import p.nx30;
import p.o02;
import p.p02;
import p.pvg;
import p.q02;
import p.qvg;
import p.svg;
import p.t380;
import p.txg;
import p.u02;
import p.u311;
import p.v280;
import p.w280;
import p.yii0;
import p.zii0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzfa implements zzie {
    static final o02 zza;
    static final zzrr zzb;
    public static final /* synthetic */ int zzc = 0;
    private static final zzkz zzd;
    private static final Object zze;
    private List zzC;
    private final zziv zzD;
    private final zzin zzi;
    private final long zzj;
    private final zzig zzk;
    private final Function zzn;
    private final Optional zzo;
    private final Executor zzp;
    private zzip zzr;
    private Optional zzf = Optional.empty();
    private Optional zzg = Optional.empty();
    private final zzez zzh = new zzez(this, null);
    private final zzkl zzl = zzkl.zzb();
    private final zzki zzm = zzki.zzc();
    private final ArrayList zzq = new ArrayList(1);
    private Optional zzs = Optional.empty();
    private Optional zzt = Optional.empty();
    private Optional zzu = Optional.empty();
    private Optional zzv = Optional.empty();
    private Optional zzw = Optional.empty();
    private Optional zzx = Optional.empty();
    private Optional zzy = Optional.empty();
    private Optional zzz = Optional.empty();
    private o02 zzA = zza;
    private zzgg zzB = zzgg.zza;

    static {
        ikj1 ikj1Var = new ikj1();
        ikj1Var.d("");
        ikj1Var.f("");
        ghk1 ghk1Var = new ghk1();
        ghk1Var.j(u311.a);
        ikj1Var.g(ghk1Var.a());
        ikj1Var.e(n02.a);
        zza = ikj1Var.a();
        zzb = zzrr.zzl("{}");
        zzd = zzkz.zzj("com/google/android/meet/addons/internal/AddonClientImpl");
        zze = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzfa(long j, Optional optional, Optional optional2, zzig zzigVar) {
        gkm0 gkm0Var;
        dmd0 dmd0Var;
        w280 w280Var = b380.b;
        this.zzC = bg11.e;
        this.zzj = j;
        this.zzk = zzigVar;
        this.zzo = Optional.empty();
        this.zzD = zziv.zza();
        this.zzr = new zzip();
        zzgc zzgcVar = new zzgc();
        zzgcVar.zze(zzir.zza(optional));
        if (optional2.isPresent()) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) optional2.get();
            if (scheduledExecutorService instanceof dmd0) {
                dmd0Var = (dmd0) scheduledExecutorService;
            } else {
                gkm0Var = new gkm0(scheduledExecutorService);
                dmd0Var = gkm0Var;
            }
        } else {
            lf8 lf8Var = new lf8();
            lf8Var.d();
            lf8Var.c();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1, lf8Var.b());
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            if (scheduledThreadPoolExecutor instanceof dmd0) {
                dmd0Var = (dmd0) scheduledThreadPoolExecutor;
            } else {
                gkm0Var = new gkm0(scheduledThreadPoolExecutor);
                dmd0Var = gkm0Var;
            }
        }
        zzgcVar.zzc(dmd0Var);
        zzgcVar.zzb(zzir.zza(optional));
        zzgcVar.zza(zzir.zza(optional));
        zzgcVar.zzd(zzir.zza(optional));
        zzgcVar.zzf(zzir.zza(optional));
        zzin zzinVarZzg = zzgcVar.zzg();
        this.zzi = zzinVarZzg;
        this.zzn = new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzdv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.zza.zzf((Context) obj);
            }
        };
        this.zzp = new e661(zzinVarZzg.zzd());
    }

    private final o02 zzab(o02 o02Var, zzpy zzpyVar) {
        try {
            cfo1 cfo1Var = (cfo1) o02Var;
            cfo1Var.getClass();
            ikj1 ikj1Var = new ikj1(cfo1Var);
            ikj1Var.c(this.zzm.zza(zzpyVar.zzg().zza()));
            return ikj1Var.a();
        } catch (AssertionError e) {
            ((zzkv) ((zzkv) zzd.zzd().zzg(e)).zzh("com/google/android/meet/addons/internal/AddonClientImpl", "updateInitialCoWatchingState", 407, "AddonClientImpl.java")).zzo("Invalid update proto.");
            return o02Var;
        }
    }

    private final zzhs zzac() {
        this.zzo.isPresent();
        return new zzhs(((zzil) this.zzs.get()).zzc(), ((zzil) this.zzs.get()).zze(), this.zzB, zzpq.zza(), this.zzi, this.zzr, this.zzj);
    }

    private final n8d0 zzad(Context context, u02 u02Var, boolean z) {
        dm5.s(context, "Expected 'appContext' to be provided.");
        dm5.s(u02Var, "Expected 'handler' to be provided.");
        return fc11.j0(new zzeg(this, context, this.zzk.zza(this.zzj), z, u02Var), this.zzp);
    }

    private final void zzae(String str) {
        dm5.A(zzak(), "Expected meeting to be connected before calling %s.", str);
    }

    private final void zzaf(String str) {
        dm5.A(this.zzu.isPresent(), "Expected meeting to be connected before calling %s.", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzag() {
        ((zzhu) this.zzf.get()).zzc();
        this.zzf = Optional.empty();
        this.zzw = Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.meet_coactivities.zzhe, java.lang.Object] */
    public final void zzah() {
        this.zzg.get().zzc();
        this.zzg = Optional.empty();
        this.zzv = Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai() {
        ((zzkv) zzd.zzb().zzh("com/google/android/meet/addons/internal/AddonClientImpl", "resetDisconnectState", 984, "AddonClientImpl.java")).zzo("Resetting client to disconnected state.");
        this.zzs.ifPresent(new zzea());
        this.zzs = Optional.empty();
        this.zzA = zza;
        this.zzB = zzgg.zza;
        this.zzu = Optional.empty();
        this.zzv = Optional.empty();
        this.zzw = Optional.empty();
        this.zzx = Optional.empty();
        this.zzy = Optional.empty();
        this.zzq.clear();
        this.zzr = new zzip();
    }

    private final void zzaj(zzrr zzrrVar, Runnable runnable) {
        if (!(((long) zzrrVar.zzd()) <= 200)) {
            eg.m(m5n1.L("Participant metadata size cannot exceed %s.", 200L));
            return;
        }
        if (zzrrVar.zzm()) {
            zzrrVar = zzb;
        }
        zzia.zza(fc11.i0(new zzeo(this, zzrrVar, runnable), this.zzp), "Failed to setParticipantMetadata or setParticipantMetadataDelegateOptional in MeetIpcManager.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzak() {
        return ((cfo1) this.zzA).c == n02.b && this.zzs.isPresent();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.meet.addons.AddonException */
    private static final zzp zzal(zzgi zzgiVar) throws AddonException {
        zzp zzpVarZza = zzgiVar.zza();
        boolean zZzb = zzgiVar.zzb();
        zzj zzjVarZzb = zzpVarZza.zzb();
        if (zzjVarZzb.equals(zzj.zza)) {
            throw j0o1.E("No apps are available for live sharing.", "com.google.android.gm");
        }
        String str = (String) zzde.zzb.get(zzjVarZzb);
        if (!zZzb) {
            return zzpVarZza;
        }
        String str2 = "Package " + str + " is too old. Please update.";
        str.getClass();
        throw j0o1.E(str2, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.n8d0] */
    private final n8d0 zzam(int i) {
        dm5.z(this.zzu.isPresent(), "Unexpected call to disconnectMeeting before calling connectMeeting");
        return ia.z((n8d0) this.zzu.get(), new zzdu(this, i), this.zzp);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie, p.j02
    public final p02 newSessionBuilder(u02 u02Var) {
        return new zzfm(u02Var, this, this.zzr);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void notifyAddonFailureEvent(Context context, i02 i02Var) {
        dm5.s(context, "Expected 'appContext' to be provided.");
        dm5.s(i02Var, "Expected 'failureEventType' to be provided.");
        zzia.zza(fc11.i0(new zzeb(this, context, i02Var), this.zzp), "Failed to get start info or to broadcast failure event in MeetIpcManager.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie, p.j02
    public final void registerMeetingStatusListener(Context context, zii0 zii0Var, Optional<Handler> optional) {
        synchronized (zze) {
            try {
                dm5.s(context, "Expected 'appContext' to be provided.");
                dm5.s(context.getApplicationContext(), "Expected 'appContext#getApplicationContext()' to resolve to a non-null value.");
                dm5.s(context.getApplicationContext().getPackageName(), "Expected 'appContext#getPackageName()' to be provided.");
                dm5.s(optional, "Expected 'handler' to be non-null, even if Optional#empty().");
                dm5.s(zii0Var, "Expected 'listener' to be provided.");
                dm5.z(!this.zzz.isPresent(), "Unexpected call to registerMeetingStatusListener before calling unRegisterMeetingStatusListener.");
                Optional optionalOf = Optional.of(new zziy(new zziz(t380.t(zii0Var, new zii0() { // from class: com.google.android.gms.internal.meet_coactivities.zzdw
                    @Override // p.zii0
                    public final void onMeetingStatusChange(yii0 yii0Var) {
                        this.zza.zzs.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzdo
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                zzil zzilVar = (zzil) obj;
                                int i = zzfa.zzc;
                                if (zzilVar.zzb().zzk()) {
                                    zzilVar.zzc().zzh(((ldn1) yii0Var).b);
                                }
                            }
                        });
                    }
                })), context.getApplicationContext().getPackageName(), this.zzj));
                this.zzz = optionalOf;
                zzjb.zza(context, optional, (BroadcastReceiver) optionalOf.get(), Optional.empty(), this.zzj);
                Object obj = this.zzz.get();
                if (Build.VERSION.SDK_INT >= 33) {
                    context.getApplicationContext().registerReceiver((BroadcastReceiver) obj, new IntentFilter("ACTION_S11Y_EVENT_BUS"), null, optional.orElse(null), 2);
                } else {
                    context.getApplicationContext().registerReceiver((BroadcastReceiver) obj, new IntentFilter("ACTION_S11Y_EVENT_BUS"), null, optional.orElse(null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie, p.j02
    public final void unregisterMeetingStatusListener(Context context) {
        synchronized (zze) {
            dm5.s(context, "Expected 'appContext' to be provided.");
            dm5.s(context.getApplicationContext(), "Expected 'appContext#getApplicationContext()' to resolve to a non-null value.");
            dm5.z(this.zzz.isPresent(), "Unexpected call to `unRegisterMeetingStatusListener` before calling `registerStatusListener`");
            this.zzs.ifPresent(new zzef());
            context.unregisterReceiver((BroadcastReceiver) this.zzz.get());
            this.zzz = Optional.empty();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.meet.addons.AddonException */
    public final /* synthetic */ void zzL(Context context, i02 i02Var) throws AddonException {
        int i;
        zzp zzpVarZzal = zzal(zzgj.zza(context, "", this.zzj, this.zzD, false));
        zzcf zzcfVar = (zzcf) this.zzn.apply(context);
        switch (i02Var.ordinal()) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            default:
                hhg1.c();
                return;
        }
        zzcfVar.zzm(context, i, zzpVarZzal.zzb());
    }

    public final /* synthetic */ void zzM() {
        ((zzil) this.zzs.get()).zzc().zzi();
    }

    public final /* synthetic */ void zzN(txg txgVar) {
        ((zzil) this.zzs.get()).zzc().zzj(txgVar);
    }

    public final /* synthetic */ void zzO(h0s0 h0s0Var) {
        this.zzt = Optional.of(h0s0Var);
    }

    public final /* synthetic */ void zzP(zzrr zzrrVar, Runnable runnable) {
        ((zzil) this.zzs.get()).zzc().zzk(zzrrVar);
        runnable.run();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzQ(Runnable runnable) {
        this.zzq.add(runnable);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzR() {
        zzia.zza(fc11.i0(new zzed(this), this.zzp), "Failed to resetCollaborationStartingState in MeetIpcManager.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzS(txg txgVar) {
        dm5.s(txgVar, "Expected parameter 'startingState' to be provided.");
        zzia.zza(fc11.i0(new zzdx(this, txgVar), this.zzp), "Failed to setCollaborationStartingState in MeetIpcManager.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzT(zzrr zzrrVar) {
        zzaj(zzrrVar, new zzdr());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzU(zzrr zzrrVar, h0s0 h0s0Var) {
        dm5.s(h0s0Var, "Expected 'handler' to be provided.");
        zzaj(zzrrVar, new zzel(this, h0s0Var));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final boolean zzW() {
        return this.zzs.isPresent();
    }

    public final /* synthetic */ zzgm zzX(gug gugVar, Optional optional) {
        Optional optionalOf = Optional.of(zzac().zzg(gugVar));
        this.zzf = optionalOf;
        Object obj = optionalOf.get();
        if (optional.isPresent()) {
            ((zzkv) zzd.zzc().zzh("com/google/android/meet/addons/internal/AddonClientImpl", "handleInitialCoDoingStates", 644, "AddonClientImpl.java")).zzo("CoDoing initial state present");
            hug hugVar = (hug) optional.get();
            dm5.s(hugVar, "Expected 'newGlobalState' to be provided.");
            dm5.x("Blob size cannot be greater than %s bytes.", 16384, zzjz.zzd(hugVar).zzd().zzd() <= 16384);
            ((zzhu) obj).zze(new zzgl((zzgm) obj, hugVar));
        } else {
            Stream streamFilter = this.zzC.stream().filter(new zzen());
            Objects.requireNonNull(obj);
            streamFilter.forEach(new zzee((zzgm) obj));
        }
        return (zzgm) this.zzf.get();
    }

    public final /* synthetic */ n8d0 zzY(int i) {
        return ((zzil) this.zzs.get()).zzc().zzl(i);
    }

    public final /* synthetic */ n8d0 zzZ(int i) {
        return fc11.j0(new zzdq(this, i), this.zzp);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final n8d0 zza(gug gugVar, Optional optional) {
        dm5.s(gugVar, "Expected 'handler' to be provided.");
        dm5.s(optional, "Expected 'initiatorInitialCoDoingState' to be provided.");
        return fc11.j0(new zzdn(this, gugVar, optional), this.zzp);
    }

    public final n8d0 zzaa(int i, o02 o02Var) {
        dm5.z(this.zzs.isPresent(), "Unexpected call to disconnectMeeting before calling connectMeeting");
        v280 v280VarM = b380.m();
        v280VarM.c(zzia.zza(this.zzw.isPresent() ? (n8d0) this.zzy.orElseGet(new zzdj(this)) : f280.b, "Failed to end co-doing.", new Object[0]));
        v280VarM.c(zzia.zza(this.zzv.isPresent() ? (n8d0) this.zzx.orElseGet(new zzdk(this)) : f280.b, "Failed to end co-watching.", new Object[0]));
        lls0 lls0Var = new lls0(false, b380.o(v280VarM.g()), (byte) 25);
        zzdl zzdlVar = new zzdl(this, i);
        Executor executor = zzir.zza;
        return zzia.zzb(ia.z(lls0Var.m(zzdlVar, executor), new zzdm(this), executor), "Unexpected error when trying to disconnect from meeting.");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final n8d0 zzb(qvg qvgVar, Optional optional) {
        dm5.s(qvgVar, "Expected 'handler' to be provided.");
        dm5.s(optional, "Expected 'initiatorInitialCoWatchingState' to be provided.");
        return fc11.j0(new zzdg(this, qvgVar, optional), this.zzp);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final n8d0 zzc(Context context, u02 u02Var) {
        return zzad(context, u02Var, false);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final n8d0 zzd() {
        return fc11.j0(new zzep(this), this.zzp);
    }

    public final /* synthetic */ zzce zze() {
        return this.zzh;
    }

    public final /* synthetic */ zzcf zzf(Context context) {
        Context applicationContext = context.getApplicationContext();
        zzdf zzdfVar = new zzdf(this);
        zzin zzinVar = this.zzi;
        zzbx zzbxVarZzc = zzby.zzc();
        zzbxVarZzc.zza(zzinVar.zzc());
        zzbxVarZzc.zzb(this.zzi.zze());
        return zzcf.zze(applicationContext, zzdfVar, zzbxVarZzc.zzc());
    }

    public final o02 zzg(zzx zzxVar) {
        this.zzA = zzjw.zzb(zzxVar.zzb());
        ((zzkv) zzd.zzb().zzh("com/google/android/meet/addons/internal/AddonClientImpl", "lambda$handleConnectMeeting$4", 335, "AddonClientImpl.java")).zzp("Received meetingInfo with status : %s", zzxVar.zzb().zzd());
        this.zzB = zzgg.zzf(((zzil) this.zzs.get()).zzc().zzd());
        List listZzg = zzxVar.zzg();
        this.zzC = listZzg;
        o02 o02VarA = this.zzA;
        List list = (List) listZzg.stream().filter(new zzej()).collect(Collectors.toCollection(new zzem()));
        if (list.size() > 1) {
            eg.m("More than one CoWatching initial state received.");
            return null;
        }
        if (!list.isEmpty()) {
            o02VarA = zzab(o02VarA, (zzpy) list.get(0));
        }
        List list2 = (List) this.zzC.stream().filter(new zzen()).collect(Collectors.toCollection(new zzem()));
        if (list2.size() > 1) {
            eg.m("More than one CoDoing initial state received.");
            return null;
        }
        if (!list2.isEmpty()) {
            zzpy zzpyVar = (zzpy) list2.get(0);
            cfo1 cfo1Var = (cfo1) o02VarA;
            cfo1Var.getClass();
            ikj1 ikj1Var = new ikj1(cfo1Var);
            ikj1Var.b(zzjz.zzc(zzpyVar.zzf().zza()));
            o02VarA = ikj1Var.a();
        }
        this.zzA = o02VarA;
        return o02VarA;
    }

    public final /* synthetic */ fug zzh(gug gugVar, Optional optional, o02 o02Var) {
        zzae("beginCoDoing");
        dm5.z(!this.zzf.isPresent(), "Unexpected call to beginCoDoing during an existing co-doing activity.");
        return (fug) zzia.zzc(new zzdi(this, gugVar, optional), "Unexpected error when trying to begin co-doing.");
    }

    public final /* synthetic */ pvg zzi(qvg qvgVar, Optional optional, o02 o02Var) {
        zzae("beginCoWatching");
        dm5.z(!this.zzg.isPresent(), "Unexpected call to beginCoWatching during an existing co-watching activity.");
        return (pvg) zzia.zzc(new zzds(this, qvgVar, optional), "Unexpected error when trying to begin co-watching.");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.meet_coactivities.zzif, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.meet_coactivities.zzif, java.lang.Object, p.pvg] */
    public final /* synthetic */ zzif zzj(qvg qvgVar, Optional optional) {
        Optional optionalOf = Optional.of(zzac().zzb(qvgVar));
        this.zzg = optionalOf;
        ?? r6 = optionalOf.get();
        if (optional.isPresent()) {
            ((zzkv) zzd.zzc().zzh("com/google/android/meet/addons/internal/AddonClientImpl", "handleInitialCoWatchingStates", 763, "AddonClientImpl.java")).zzo("CoWatching initial state present");
            svg svgVar = (svg) optional.get();
            r6.notifySwitchedToMedia("", svgVar.c(), svgVar.d(), svgVar.b());
        } else {
            Stream streamFilter = this.zzC.stream().filter(new zzej());
            Objects.requireNonNull(r6);
            streamFilter.forEach(new zzec((zzif) r6));
        }
        return this.zzg.get();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final n8d0 zzm(Context context, u02 u02Var) {
        return zzad(context, u02Var, true);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final n8d0 zzn(q02 q02Var) {
        return fc11.j0(new zzek(this, q02Var), this.zzp);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.n8d0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p.n8d0] */
    public final n8d0 zzo(gug gugVar, Optional optional) {
        this.zzy = Optional.empty();
        zzaf("beginCoDoing");
        Optional optionalOf = Optional.of(ia.y((n8d0) this.zzu.get(), new zzeh(this, gugVar, optional), this.zzp));
        this.zzw = optionalOf;
        return optionalOf.get();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.n8d0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p.n8d0] */
    public final n8d0 zzp(qvg qvgVar, Optional optional) {
        this.zzx = Optional.empty();
        zzaf("beginCoWatching");
        Optional optionalOf = Optional.of(ia.y((n8d0) this.zzu.get(), new zzdy(this, qvgVar, optional), this.zzp));
        this.zzv = optionalOf;
        return optionalOf.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.meet.addons.AddonException */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, p.n8d0] */
    public final n8d0 zzq(Context context, String str, boolean z, u02 u02Var) throws AddonException {
        dm5.z(!this.zzs.isPresent(), "Unexpected call to connectMeeting before calling disconnectMeeting");
        zzp zzpVarZzal = zzal(zzgj.zza(context, str, this.zzj, this.zzD, z));
        zzfz zzfzVar = new zzfz();
        zzfzVar.zzc(context);
        zzfzVar.zzd((zzcf) this.zzn.apply(context));
        zzfzVar.zzb(u02Var);
        zzfzVar.zza(str);
        zzfzVar.zze(zzpVarZzal);
        this.zzs = Optional.of(zzfzVar.zzf());
        if (z && !this.zzz.isPresent()) {
            zzai();
            return new c280(new IllegalStateException("Meeting status listener is not registered before tracking recording info."));
        }
        zzcf zzcfVarZzc = ((zzil) this.zzs.get()).zzc();
        zzp zzpVarZzb = ((zzil) this.zzs.get()).zzb();
        zzt zztVar = zzt.zzb;
        int i = t380.c;
        n8d0 n8d0VarZzf = zzcfVarZzc.zzf(zzpVarZzb, new b291(zztVar));
        zzdp zzdpVar = new zzdp(this);
        Executor executor = zzir.zza;
        ha haVarY = ia.y(n8d0VarZzf, zzdpVar, executor);
        haVarY.b(new nx30(haVarY, new zzeq(this), (byte) 24), executor);
        Optional optionalOf = Optional.of(haVarY);
        this.zzu = optionalOf;
        return zzia.zzb((n8d0) optionalOf.get(), "Unexpected error when trying to connect to meeting.");
    }

    public final /* synthetic */ n8d0 zzr() {
        return zzam(2);
    }

    public final /* synthetic */ n8d0 zzs(q02 q02Var) {
        return zzam(q02Var.ordinal() != 1 ? 2 : 3);
    }

    public final n8d0 zzt() {
        zzae("endCoDoing");
        dm5.z(this.zzf.isPresent(), "Expected co-doing activity to exist before calling endCoDoing.");
        zzia.zzd(new zzei(this), "Unexpected error when trying to end co-doing.");
        return f280.b;
    }

    public final n8d0 zzu() {
        zzae("endCoWatching");
        dm5.z(this.zzg.isPresent(), "Expected co-watching activity to exist before calling endCoWatching.");
        zzia.zzd(new zzdt(this), "Unexpected error when trying to end co-watching.");
        return f280.b;
    }

    public final /* synthetic */ n8d0 zzv(Void r1) {
        return fc11.i0(new zzdz(this), this.zzp);
    }
}
