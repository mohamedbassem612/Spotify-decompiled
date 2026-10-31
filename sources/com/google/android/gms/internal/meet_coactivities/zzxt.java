package com.google.android.gms.internal.meet_coactivities;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzxt {
    private SocketAddress zza;
    private InetSocketAddress zzb;
    private String zzc;
    private String zzd;

    public /* synthetic */ zzxt(zzxs zzxsVar) {
    }

    public final zzxt zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzxt zzb(SocketAddress socketAddress) {
        dm5.s(socketAddress, "proxyAddress");
        this.zza = socketAddress;
        return this;
    }

    public final zzxt zzc(InetSocketAddress inetSocketAddress) {
        dm5.s(inetSocketAddress, "targetAddress");
        this.zzb = inetSocketAddress;
        return this;
    }

    public final zzxt zzd(String str) {
        this.zzc = str;
        return this;
    }

    public final zzxv zze() {
        return new zzxv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    private zzxt() {
        throw null;
    }
}
