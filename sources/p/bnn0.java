package p;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bnn0 {
    public final int a;
    public qon0 b = null;
    public Bundle c = null;

    public bnn0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bnn0)) {
            bnn0 bnn0Var = (bnn0) obj;
            if (this.a == bnn0Var.a && u890.j(this.b, bnn0Var.b)) {
                if (!u890.j(this.c, bnn0Var.c)) {
                    Bundle bundle = this.c;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        Set<String> set = setKeySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = bnn0Var.c;
                                if (!u890.j(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.a) * 31;
        qon0 qon0Var = this.b;
        int iHashCode2 = iHashCode + (qon0Var != null ? qon0Var.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i = iHashCode2 * 31;
                Bundle bundle2 = this.c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(bnn0.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
