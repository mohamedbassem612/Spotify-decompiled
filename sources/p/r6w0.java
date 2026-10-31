package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r6w0 {
    public final String a;
    public final ArrayList b;

    public r6w0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6w0)) {
            return false;
        }
        r6w0 r6w0Var = (r6w0) obj;
        return this.a.equals(r6w0Var.a) && this.b.equals(r6w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
