package p;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ixd1 implements mh5 {
    public static final ixd1 b = new ixd1(null);
    public final String a;

    public /* synthetic */ ixd1(String str) {
        this.a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ixd1) {
            return k8p1.h(this.a, ((ixd1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
