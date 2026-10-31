package com.google.android.play.core.splitinstall.internal;

import p.bsd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zzv implements Runnable {
    private final bsd1 zza;

    public zzv() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzc();
        } catch (Exception e) {
            zzb(e);
        }
    }

    public final bsd1 zza() {
        return this.zza;
    }

    public final void zzb(Exception exc) {
        bsd1 bsd1Var = this.zza;
        if (bsd1Var != null) {
            bsd1Var.c(exc);
        }
    }

    public abstract void zzc();

    public zzv(bsd1 bsd1Var) {
        this.zza = bsd1Var;
    }
}
