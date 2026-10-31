package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jy81 implements z0i {
    public final z0i a;
    public final ArrayList b;

    public jy81(z0i z0iVar, ArrayList arrayList) {
        this.a = z0iVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy81)) {
            return false;
        }
        jy81 jy81Var = (jy81) obj;
        return u890.j(this.a, jy81Var.a) && this.b.equals(jy81Var.b);
    }

    public final int hashCode() {
        z0i z0iVar = this.a;
        return this.b.hashCode() + ((z0iVar == null ? 0 : z0iVar.hashCode()) * 31);
    }
}
