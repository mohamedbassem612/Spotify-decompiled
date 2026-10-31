package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.List;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzwn {
    public static zzwf zza(zzwf zzwfVar, List list) {
        dm5.s(zzwfVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzwfVar = new zzwm(zzwfVar, (zzwk) it.next(), null);
        }
        return zzwfVar;
    }
}
