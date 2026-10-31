package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import p.b380;
import p.kg11;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzer implements Runnable {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ zzn zzb;

    public /* synthetic */ zzer(zzez zzezVar, zzn zznVar) {
        this.zza = zzezVar;
        this.zzb = zznVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.h0s0] */
    @Override // java.lang.Runnable
    public final void run() {
        zzez zzezVar = this.zza;
        if (!zzfa.zzA(zzezVar.zza).isPresent()) {
            zzfa.zzl().zzc().zzh("com/google/android/meet/addons/internal/AddonClientImpl$LiveSharingIpcHandler", "lambda$handleParticipantMetadataSetUpdate$1", 1113, "AddonClientImpl.java").zzo("Delegate is missing on non-empty participant metadata set update.");
            return;
        }
        zzn zznVar = this.zzb;
        ?? r0 = zzfa.zzA(zzezVar.zza).get();
        t380.o((Iterable) zznVar.zzd().stream().map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzdh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = zzfa.zzc;
                byte[] bArrZzn = ((zzrr) obj).zzn();
                int length = bArrZzn.length;
                Byte[] bArr = new Byte[length];
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    bArr[i3] = Byte.valueOf(bArrZzn[i2]);
                    i2++;
                    i3++;
                }
                return bArr;
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzem
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        })));
        if (zznVar.zzd().equals(b380.t(zzfa.zzb))) {
            Object[] objArr = kg11.i;
        }
        r0.a();
    }
}
