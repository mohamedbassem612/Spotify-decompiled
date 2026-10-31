package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzanh {
    final boolean zza;
    final List zzb;
    final Collection zzc;
    final Collection zzd;
    final int zze;
    final zzanq zzf;
    final boolean zzg;
    final boolean zzh;

    public zzanh(List list, Collection collection, Collection collection2, zzanq zzanqVar, boolean z, boolean z2, boolean z3, int i) {
        this.zzb = list;
        dm5.s(collection, "drainedSubstreams");
        this.zzc = collection;
        this.zzf = zzanqVar;
        this.zzd = collection2;
        this.zzg = z;
        this.zza = z2;
        this.zzh = z3;
        this.zze = i;
        dm5.z(!z2 || list == null, "passThrough should imply buffer is null");
        dm5.z((z2 && zzanqVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        dm5.z(!z2 || (collection.size() == 1 && collection.contains(zzanqVar)) || (collection.size() == 0 && zzanqVar.zzb), "passThrough should imply winningSubstream is drained");
        dm5.z((z && zzanqVar == null) ? false : true, "cancelled should imply committed");
    }

    public final zzanh zza(zzanq zzanqVar) {
        Collection collectionUnmodifiableCollection;
        dm5.z(!this.zzh, "hedging frozen");
        dm5.z(this.zzf == null, "already committed");
        Collection collection = this.zzd;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(zzanqVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(zzanqVar);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new zzanh(this.zzb, this.zzc, collectionUnmodifiableCollection, this.zzf, this.zzg, this.zza, this.zzh, this.zze + 1);
    }

    public final zzanh zzb() {
        return this.zzh ? this : new zzanh(this.zzb, this.zzc, this.zzd, this.zzf, this.zzg, this.zza, true, this.zze);
    }

    public final zzanh zzc(zzanq zzanqVar) {
        dm5.z(!this.zza, "Already passThrough");
        boolean z = zzanqVar.zzb;
        Collection collectionUnmodifiableCollection = this.zzc;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(zzanqVar);
            } else {
                ArrayList arrayList = new ArrayList(this.zzc);
                arrayList.add(zzanqVar);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        zzanq zzanqVar2 = this.zzf;
        boolean z2 = zzanqVar2 != null;
        List list = this.zzb;
        if (z2) {
            dm5.z(zzanqVar2 == zzanqVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new zzanh(list, collection, this.zzd, this.zzf, this.zzg, z2, this.zzh, this.zze);
    }
}
