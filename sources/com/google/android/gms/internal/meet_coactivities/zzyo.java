package com.google.android.gms.internal.meet_coactivities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzyo {
    private List zza;
    private final zzvz zzb = zzvz.zza;
    private Object[][] zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

    public final zzyo zza(zzyp zzypVar, Object obj) {
        Object[][] objArr;
        dm5.s(zzypVar, "key");
        dm5.s(obj, "value");
        int length = 0;
        while (true) {
            objArr = this.zzc;
            if (length >= objArr.length) {
                length = -1;
                break;
            }
            if (zzypVar == objArr[length][0]) {
                break;
            }
            length++;
        }
        if (length == -1) {
            int length2 = objArr.length;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.zzc = objArr2;
            length = objArr2.length - 1;
            objArr = objArr2;
        }
        objArr[length] = new Object[]{zzypVar, obj};
        return this;
    }

    public final zzyo zzb(List list) {
        dm5.n(!list.isEmpty(), "addrs is empty");
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        return this;
    }

    public final zzyr zzc() {
        return new zzyr(this.zza, this.zzb, this.zzc, null);
    }
}
