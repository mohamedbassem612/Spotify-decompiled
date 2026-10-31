package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class axh0 implements z0i, ymb0 {
    public final ArrayList a;
    public final xmb0 b;

    public axh0(ArrayList arrayList) {
        xmb0 xmb0Var = new xmb0(true);
        this.a = arrayList;
        this.b = xmb0Var;
    }

    public final xmb0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axh0)) {
            return false;
        }
        axh0 axh0Var = (axh0) obj;
        return this.a.equals(axh0Var.a) && this.b.equals(axh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
