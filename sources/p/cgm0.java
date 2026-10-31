package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cgm0 {
    public final b7z a;
    public final saz b;
    public final boolean c;
    public final List d;
    public final List e;
    public final boolean f;

    public cgm0(b7z b7zVar, saz sazVar, boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.a = b7zVar;
        this.b = sazVar;
        this.c = z;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgm0)) {
            return false;
        }
        cgm0 cgm0Var = (cgm0) obj;
        return this.a.equals(cgm0Var.a) && this.b.equals(cgm0Var.b) && this.c == cgm0Var.c && this.d.equals(cgm0Var.d) && this.e.equals(cgm0Var.e) && this.f == cgm0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(f4i1.b(f4i1.b(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false), 31, this.c), 31, this.d), 961, this.e), 31, false);
    }
}
