package com.google.android.gms.internal.meet_coactivities;

import java.util.function.Function;
import p.bhn0;
import p.lxo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzka implements Function {
    public /* synthetic */ zzka(zzkf zzkfVar) {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zzqc zzqcVar = (zzqc) obj;
        String strZzd = zzqcVar.zzd();
        if (strZzd == null) {
            bhn0.i("Null mediaId");
            return null;
        }
        String strZzc = zzqcVar.zzc();
        if (strZzc != null) {
            return new lxo1(strZzd, strZzc);
        }
        bhn0.i("Null entryId");
        return null;
    }
}
