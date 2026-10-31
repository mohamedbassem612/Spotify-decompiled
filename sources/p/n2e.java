package p;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n2e implements mh5 {
    public final CastDevice a;
    public final zdp1 b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ n2e(cab cabVar) {
        this.a = (CastDevice) cabVar.b;
        this.b = (zdp1) cabVar.c;
        this.c = (Bundle) cabVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[RETURN] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n2e)) {
            return false;
        }
        n2e n2eVar = (n2e) obj;
        if (k8p1.h(this.a, n2eVar.a)) {
            Bundle bundle = n2eVar.c;
            Bundle bundle2 = this.c;
            if (bundle2 == null || bundle == null) {
                if (bundle2 == bundle) {
                    if (k8p1.h(this.d, n2eVar.d)) {
                        return true;
                    }
                }
            } else if (bundle2.size() == bundle.size()) {
                Set<String> setKeySet = bundle2.keySet();
                if (setKeySet.containsAll(bundle.keySet())) {
                    for (String str : setKeySet) {
                        if (!k8p1.h(bundle2.get(str), bundle.get(str))) {
                        }
                    }
                    if (k8p1.h(this.d, n2eVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, 0, this.d});
    }
}
