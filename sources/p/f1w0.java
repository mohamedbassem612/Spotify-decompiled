package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f1w0 {
    public final kh51 a;
    public final ArrayList b;

    public f1w0(kh51 kh51Var, ArrayList arrayList) {
        this.a = kh51Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1w0)) {
            return false;
        }
        f1w0 f1w0Var = (f1w0) obj;
        return this.a.equals(f1w0Var.a) && this.b.equals(f1w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
