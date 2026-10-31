package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ep71 implements fp71 {
    public final List a;
    public final boolean b;
    public final boolean c;

    public ep71(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override // p.fp71
    public final boolean a() {
        return this.c;
    }

    @Override // p.fp71
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep71)) {
            return false;
        }
        ep71 ep71Var = (ep71) obj;
        return u890.j(this.a, ep71Var.a) && this.b == ep71Var.b && this.c == ep71Var.c;
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((list == null ? 0 : list.hashCode()) * 31, 31, this.b);
    }
}
