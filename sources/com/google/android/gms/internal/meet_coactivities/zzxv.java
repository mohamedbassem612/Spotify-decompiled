package com.google.android.gms.internal.meet_coactivities;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import p.cwl1;
import p.dm5;
import p.rl1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzxv extends zzaat {
    private final SocketAddress zza;
    private final InetSocketAddress zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzxv(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2, zzxu zzxuVar) {
        dm5.s(socketAddress, "proxyAddress");
        dm5.s(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            dm5.A(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.zza = socketAddress;
        this.zzb = inetSocketAddress;
        this.zzc = str;
        this.zzd = str2;
    }

    public static zzxt zza() {
        return new zzxt(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxv)) {
            return false;
        }
        zzxv zzxvVar = (zzxv) obj;
        return zno1.k(this.zza, zzxvVar.zza) && zno1.k(this.zzb, zzxvVar.zzb) && zno1.k(this.zzc, zzxvVar.zzc) && zno1.k(this.zzd, zzxvVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "proxyAddr");
        rl1VarR0.m(this.zzb, "targetAddr");
        rl1VarR0.m(this.zzc, "username");
        rl1VarR0.l("hasPassword", this.zzd != null);
        return rl1VarR0.toString();
    }

    public final InetSocketAddress zzb() {
        return this.zzb;
    }
}
