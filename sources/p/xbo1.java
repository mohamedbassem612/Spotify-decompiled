package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public interface xbo1 {
    Object zza(Object... objArr);

    default Object zzb(Object[] objArr) {
        int length = objArr.length;
        if (length == 1) {
            if (objArr[0] instanceof bco1) {
                return Boolean.TRUE;
            }
            length = 1;
        }
        return zza(Arrays.copyOf(objArr, length));
    }
}
