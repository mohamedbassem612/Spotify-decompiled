package com.google.android.gms.internal.meet_coactivities;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import p.dm5;
import p.i0c1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzahe extends zzaao {
    public static final /* synthetic */ int a = 0;
    private static final boolean zza = zzym.zza(zzahe.class.getClassLoader());

    @Override // com.google.android.gms.internal.meet_coactivities.zzaai
    public final zzaan zza(URI uri, zzaag zzaagVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        dm5.s(path, "targetPath");
        dm5.p(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        return new zzahd(uri.getAuthority(), path.substring(1), zzaagVar, zzahx.zzi, new i0c1(), zza);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaai
    public final String zzb() {
        return "dns";
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final int zzc() {
        return 5;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final Collection zzd() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final boolean zze() {
        return true;
    }
}
