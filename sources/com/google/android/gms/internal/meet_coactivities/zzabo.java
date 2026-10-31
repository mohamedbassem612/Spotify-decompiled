package com.google.android.gms.internal.meet_coactivities;

import android.content.ComponentName;
import android.content.Intent;
import java.net.SocketAddress;
import p.dm5;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzabo extends SocketAddress {
    private final Intent zza;

    public zzabo(Intent intent) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        dm5.n(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.zza = intent;
    }

    public static zzabo zzb(ComponentName componentName) {
        return new zzabo(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzabo) {
            return this.zza.filterEquals(((zzabo) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.zza;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        return f4i1.f("AndroidComponentAddress[", String.valueOf(this.zza), "]");
    }

    public final Intent zza() {
        return this.zza.cloneFilter();
    }

    public final String zzc() {
        String str = this.zza.getPackage();
        Intent intent = this.zza;
        return str != null ? intent.getPackage() : intent.getComponent().getPackageName();
    }
}
