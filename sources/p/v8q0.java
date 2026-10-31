package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v8q0 implements z8q0 {
    public final ArrayList a;
    public final String b;

    public v8q0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8q0)) {
            return false;
        }
        v8q0 v8q0Var = (v8q0) obj;
        return this.a.equals(v8q0Var.a) && this.b.equals(v8q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
