package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.bsd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaz extends zzbb {
    public zzaz(zzbc zzbcVar, bsd1 bsd1Var) {
        super(zzbcVar, bsd1Var);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzh(List list) {
        super.zzh(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SplitInstallSessionState.zzd((Bundle) it.next()));
        }
        this.zza.d(arrayList);
    }
}
