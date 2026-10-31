package com.google.android.gms.internal.meet_coactivities;

import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import p.dm5;
import p.fug;
import p.n8d0;
import p.o02;
import p.pvg;
import p.q02;
import p.r02;
import p.txg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzfs implements r02 {
    private final zzie zza;
    private final o02 zzb;
    private final Optional zzc;
    private final Optional zzd;
    private final zzip zze;
    private final AtomicBoolean zzf = new AtomicBoolean(true);

    public zzfs(zzie zzieVar, o02 o02Var, Optional optional, Optional optional2, zzip zzipVar) {
        zzieVar.getClass();
        this.zza = zzieVar;
        o02Var.getClass();
        this.zzb = o02Var;
        optional.getClass();
        this.zzc = optional;
        optional2.getClass();
        this.zzd = optional2;
        zzipVar.getClass();
        this.zze = zzipVar;
    }

    private final void zzd() {
        dm5.z(this.zzf.get(), "Cannot call this method after the AddonSession has ended.");
    }

    public final n8d0 endSession() {
        zzc();
        return this.zza.zzd();
    }

    public final void endSuspension() {
        zzd();
        this.zze.zza();
    }

    public final fug getCoDoing() {
        zzd();
        return (fug) this.zzd.orElseThrow(new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzfp
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Must call withCoDoing() while building the session for co-doing to be present.");
            }
        });
    }

    public final pvg getCoWatching() {
        zzd();
        return (pvg) this.zzc.orElseThrow(new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Must call withCoWatching() while building the session for co-watching to be present.");
            }
        });
    }

    public final o02 getMeetingInfo() {
        zzd();
        return this.zzb;
    }

    public final boolean isSessionEnded() {
        return !this.zzf.get();
    }

    public final boolean isSuspended() {
        zzd();
        return this.zze.zzd();
    }

    public final void resetCollaborationStartingState() {
        zzd();
        final zzie zzieVar = this.zza;
        Objects.requireNonNull(zzieVar);
        zzia.zzd(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzfr
            @Override // java.lang.Runnable
            public final void run() {
                zzieVar.zzR();
            }
        }, "Unexpected error occurred while resetting collaboration starting state.");
    }

    public final void suspend() {
        zzd();
        this.zze.zzc();
    }

    public final void updateCollaborationStartingState(final txg txgVar) {
        zzd();
        dm5.s(txgVar, "Parameter 'startingState' cannot be null.");
        zzia.zzd(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzfn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(txgVar);
            }
        }, "Unexpected error occurred while setting collaboration starting state.");
    }

    public final void updateParticipantMetadata(final byte[] bArr) {
        zzd();
        dm5.s(bArr, "Parameter 'metadata' cannot be null.");
        dm5.l("Participant metadata size cannot exceed %s bytes.", CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, bArr.length <= 200);
        zzia.zzd(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzfo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(bArr);
            }
        }, "Unexpected error occurred while setting metadata.");
    }

    public final /* synthetic */ void zza(txg txgVar) {
        this.zza.zzS(txgVar);
    }

    public final /* synthetic */ void zzb(byte[] bArr) {
        zzrr zzrrVar = zzrr.zzb;
        this.zza.zzT(zzrr.zzk(bArr, 0, bArr.length));
    }

    public final void zzc() {
        this.zzf.set(false);
    }

    @Override // p.r02
    public final n8d0 endSession(q02 q02Var) {
        zzc();
        return this.zza.zzn(q02Var);
    }
}
