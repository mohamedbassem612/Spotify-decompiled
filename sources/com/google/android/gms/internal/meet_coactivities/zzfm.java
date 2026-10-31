package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import p.b380;
import p.bg11;
import p.bhn0;
import p.bi7;
import p.dm5;
import p.fc11;
import p.fug;
import p.gug;
import p.h0s0;
import p.hug;
import p.ia;
import p.n8d0;
import p.nx30;
import p.o02;
import p.p02;
import p.pvg;
import p.qch;
import p.qvg;
import p.r02;
import p.rch;
import p.su30;
import p.svg;
import p.txg;
import p.u02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzfm implements p02 {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/AddonSessionBuilderImpl");
    private final u02 zzb;
    private final zzie zzc;
    private final zzip zzd;
    private txg zzi;
    private Optional zze = Optional.empty();
    private Optional zzf = Optional.empty();
    private Optional zzg = Optional.empty();
    private zzrr zzh = zzrr.zzb;
    private boolean zzj = false;
    private Optional zzk = Optional.empty();
    private Optional zzl = Optional.empty();

    public zzfm(u02 u02Var, zzie zzieVar, zzip zzipVar) {
        this.zzb = u02Var;
        this.zzc = zzieVar;
        this.zzd = zzipVar;
    }

    @Override // p.p02
    public final n8d0 begin(Context context) {
        dm5.z(!this.zzc.zzW(), "Cannot call begin() while a meeting connection already exists.");
        boolean z = this.zzj;
        zzie zzieVar = this.zzc;
        u02 u02Var = this.zzb;
        return ia.z(z ? zzieVar.zzm(context, u02Var) : zzieVar.zzc(context, u02Var), new bi7() { // from class: com.google.android.gms.internal.meet_coactivities.zzfh
            @Override // p.bi7
            public final n8d0 apply(Object obj) {
                return this.zza.zze((o02) obj);
            }
        }, zzir.zza);
    }

    @Override // p.p02
    public final p02 verifyRecordingInfo() {
        this.zzj = true;
        return this;
    }

    public final p02 withCoDoing(gug gugVar) {
        Optional optionalEmpty = Optional.empty();
        dm5.s(gugVar, "Parameter 'coDoingHandler' cannot be null.");
        dm5.s(optionalEmpty, "Parameter 'initiatorInitialCoDoingState' cannot be null.");
        this.zzf = Optional.of(gugVar);
        this.zzl = optionalEmpty;
        return this;
    }

    public final p02 withCoWatching(qvg qvgVar) {
        Optional optionalEmpty = Optional.empty();
        dm5.s(qvgVar, "Parameter 'coWatchingHandler' cannot be null.");
        dm5.s(optionalEmpty, "Parameter 'initiatorInitialCoWatchingState' cannot be null.");
        this.zze = Optional.of(qvgVar);
        this.zzk = optionalEmpty;
        return this;
    }

    public final p02 withCollaborationStartingState(txg txgVar) {
        dm5.s(txgVar, "Parameter 'startingState' cannot be null.");
        this.zzi = txgVar;
        return this;
    }

    public final p02 withParticipantMetadata(h0s0 h0s0Var, byte[] bArr) {
        dm5.s(bArr, "Parameter 'metadata' cannot be null.");
        dm5.s(h0s0Var, "Parameter 'handler' cannot be null.");
        int length = bArr.length;
        dm5.l("Participant metadata size cannot exceed %s bytes.", CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, length <= 200);
        this.zzg = Optional.of(h0s0Var);
        this.zzh = zzrr.zzk(bArr, 0, length);
        return this;
    }

    public final /* synthetic */ r02 zza(o02 o02Var, n8d0 n8d0Var, n8d0 n8d0Var2) {
        return new zzfs(this.zzc, o02Var, (Optional) fc11.C(n8d0Var), (Optional) fc11.C(n8d0Var2), this.zzd);
    }

    public final n8d0 zze(final o02 o02Var) {
        final n8d0 n8d0Var = (n8d0) this.zze.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzfg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzfm zzfmVar = this.zza;
                if (obj == null) {
                    return zzfmVar.zzg(null);
                }
                bhn0.d();
                return null;
            }
        }).orElse(fc11.J(Optional.empty()));
        final n8d0 n8d0Var2 = (n8d0) this.zzf.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzfb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.zza.zzf((gug) obj);
            }
        }).orElse(fc11.J(Optional.empty()));
        bg11 bg11VarQ = b380.q(new n8d0[]{n8d0Var, n8d0Var2});
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.meet_coactivities.zzfe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(o02Var, n8d0Var, n8d0Var2);
            }
        };
        Executor executor = zzir.zza;
        final rch rchVar = new rch(bg11VarQ, true);
        rchVar.i = new qch(rchVar, callable, executor, (byte) 1);
        rchVar.F();
        rchVar.b(new nx30(rchVar, new zzfl(this), (byte) 24), executor);
        this.zzg.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzfd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fc11.h(rchVar, new zzfi(this.zza, (h0s0) obj), zzir.zza);
            }
        });
        if (this.zzi == null) {
            zza.zzc().zzh("com/google/android/meet/addons/internal/AddonSessionBuilderImpl", "maybeConfigureCollaborationStartingState", 234, "AddonSessionBuilderImpl.java").zzo("Collaboration starting state is null.");
            return rchVar;
        }
        rchVar.b(new nx30(rchVar, new zzfj(this), (byte) 24), executor);
        return rchVar;
    }

    public final n8d0 zzf(gug gugVar) {
        return ia.y(this.zzc.zza(gugVar, this.zzl), new su30() { // from class: com.google.android.gms.internal.meet_coactivities.zzfc
            public final Object apply(Object obj) {
                return Optional.of((fug) obj);
            }
        }, zzir.zza);
    }

    public final n8d0 zzg(qvg qvgVar) {
        return ia.y(this.zzc.zzb(qvgVar, this.zzk), new su30() { // from class: com.google.android.gms.internal.meet_coactivities.zzff
            public final Object apply(Object obj) {
                return Optional.of((pvg) obj);
            }
        }, zzir.zza);
    }

    @Override // p.p02
    public final p02 withCoDoing(gug gugVar, Optional<hug> optional) {
        dm5.s(gugVar, "Parameter 'coDoingHandler' cannot be null.");
        dm5.s(optional, "Parameter 'initiatorInitialCoDoingState' cannot be null.");
        this.zzf = Optional.of(gugVar);
        this.zzl = optional;
        return this;
    }

    public final p02 withCoWatching(qvg qvgVar, Optional<svg> optional) {
        dm5.s(qvgVar, "Parameter 'coWatchingHandler' cannot be null.");
        dm5.s(optional, "Parameter 'initiatorInitialCoWatchingState' cannot be null.");
        this.zze = Optional.of(qvgVar);
        this.zzk = optional;
        return this;
    }

    public final p02 withParticipantMetadata(h0s0 h0s0Var) {
        dm5.s(h0s0Var, "Parameter 'handler' cannot be null.");
        this.zzg = Optional.of(h0s0Var);
        return this;
    }
}
