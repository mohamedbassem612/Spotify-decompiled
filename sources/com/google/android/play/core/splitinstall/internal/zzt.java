package com.google.android.play.core.splitinstall.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p.sqb1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzt {
    protected final Set zza = new HashSet();

    public final synchronized void zza(sqb1 sqb1Var) {
        this.zza.add(sqb1Var);
    }

    public final synchronized void zzb(sqb1 sqb1Var) {
        this.zza.remove(sqb1Var);
    }

    public final synchronized void zzc(Object obj) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((sqb1) it.next()).onStateUpdate(obj);
        }
    }
}
