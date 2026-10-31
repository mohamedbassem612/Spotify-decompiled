package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class imt {
    public final List a;
    public final blc0 b;
    public final boolean c;

    public imt(List list, blc0 blc0Var, boolean z) {
        this.a = list;
        this.b = blc0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imt)) {
            return false;
        }
        imt imtVar = (imt) obj;
        return u890.j(this.a, imtVar.a) && this.b == imtVar.b && this.c == imtVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
