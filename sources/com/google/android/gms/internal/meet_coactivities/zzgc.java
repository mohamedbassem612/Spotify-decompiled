package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.bid0;
import p.dmd0;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
final class zzgc extends zzim {
    private bid0 zza;
    private dmd0 zzb;
    private bid0 zzc;
    private bid0 zzd;
    private bid0 zze;
    private bid0 zzf;

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zza(bid0 bid0Var) {
        if (bid0Var != null) {
            this.zzd = bid0Var;
            return this;
        }
        bhn0.i("Null coDoingHandlerExecutor");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zzb(bid0 bid0Var) {
        if (bid0Var != null) {
            this.zzc = bid0Var;
            return this;
        }
        bhn0.i("Null coWatchingHandlerExecutor");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zzc(dmd0 dmd0Var) {
        if (dmd0Var != null) {
            this.zzb = dmd0Var;
            return this;
        }
        bhn0.i("Null heartbeatExecutor");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zzd(bid0 bid0Var) {
        if (bid0Var != null) {
            this.zzf = bid0Var;
            return this;
        }
        bhn0.i("Null incomingIpcExecutor");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zze(bid0 bid0Var) {
        if (bid0Var != null) {
            this.zza = bid0Var;
            return this;
        }
        bhn0.i("Null internalExecutor");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zzf(bid0 bid0Var) {
        if (bid0Var != null) {
            this.zze = bid0Var;
            return this;
        }
        bhn0.i("Null outgoingIpcExecutor");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzin zzg() {
        dmd0 dmd0Var;
        bid0 bid0Var;
        bid0 bid0Var2;
        bid0 bid0Var3;
        bid0 bid0Var4;
        bid0 bid0Var5 = this.zza;
        if (bid0Var5 != null && (dmd0Var = this.zzb) != null && (bid0Var = this.zzc) != null && (bid0Var2 = this.zzd) != null && (bid0Var3 = this.zze) != null && (bid0Var4 = this.zzf) != null) {
            return new zzge(bid0Var5, dmd0Var, bid0Var, bid0Var2, bid0Var3, bid0Var4, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" internalExecutor");
        }
        if (this.zzb == null) {
            sb.append(" heartbeatExecutor");
        }
        if (this.zzc == null) {
            sb.append(" coWatchingHandlerExecutor");
        }
        if (this.zzd == null) {
            sb.append(" coDoingHandlerExecutor");
        }
        if (this.zze == null) {
            sb.append(" outgoingIpcExecutor");
        }
        if (this.zzf == null) {
            sb.append(" incomingIpcExecutor");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
