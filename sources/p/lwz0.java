package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lwz0 {
    public final ArrayList a;
    public final boolean b;

    public lwz0(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwz0)) {
            return false;
        }
        lwz0 lwz0Var = (lwz0) obj;
        return this.a.equals(lwz0Var.a) && this.b == lwz0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
