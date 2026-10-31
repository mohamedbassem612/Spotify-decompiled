package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzve extends RuntimeException {
    public zzve(zzuf zzufVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zztj zza() {
        return new zztj(getMessage());
    }
}
