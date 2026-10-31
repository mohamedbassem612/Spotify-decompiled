package p;

import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vzq {
    public final HashMap a = new HashMap();

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (!(obj instanceof vzq)) {
            return false;
        }
        HashMap map = ((vzq) obj).a;
        HashMap map2 = this.a;
        if (map2.size() != map.size()) {
            return false;
        }
        for (String str : map2.keySet()) {
            Object obj2 = map2.get(str);
            Object obj3 = map.get(str);
            if (obj2 instanceof Asset) {
                if (!(obj3 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) obj2;
                Asset asset2 = (Asset) obj3;
                if (TextUtils.isEmpty(asset.j())) {
                    zEquals = Arrays.equals(asset.F(), asset2.F());
                } else {
                    String strJ = asset.j();
                    strJ.getClass();
                    zEquals = strJ.equals(asset2.j());
                }
                if (!zEquals) {
                    return false;
                }
            } else if (obj2 instanceof String[]) {
                if (!(obj3 instanceof String[]) || !Arrays.equals((String[]) obj2, (String[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof long[]) {
                if (!(obj3 instanceof long[]) || !Arrays.equals((long[]) obj2, (long[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof float[]) {
                if (!(obj3 instanceof float[]) || !Arrays.equals((float[]) obj2, (float[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof byte[]) {
                if (!(obj3 instanceof byte[]) || !Arrays.equals((byte[]) obj2, (byte[]) obj3)) {
                    return false;
                }
            } else if (!k8p1.h(obj2, obj3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 29;
    }

    public final String toString() {
        return this.a.toString();
    }
}
