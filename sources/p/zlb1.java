package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zlb1 extends j2h1 {
    public final sfh0 d;
    public final List e;

    public zlb1(sfh0 sfh0Var) {
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.d = sfh0Var;
        this.e = listSynchronizedList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlb1)) {
            return false;
        }
        zlb1 zlb1Var = (zlb1) obj;
        return this.d.equals(zlb1Var.d) && this.e.equals(zlb1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
