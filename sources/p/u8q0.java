package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u8q0 implements z8q0 {
    public final ArrayList a;
    public final String b;

    public u8q0(ArrayList arrayList, String str) {
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
        if (!(obj instanceof u8q0)) {
            return false;
        }
        u8q0 u8q0Var = (u8q0) obj;
        return this.a.equals(u8q0Var.a) && this.b.equals(u8q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
