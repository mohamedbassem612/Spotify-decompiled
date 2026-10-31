package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class axo0 implements eyo0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final boolean d;

    public axo0(String str, String str2, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = z;
    }

    public final List a() {
        return z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axo0)) {
            return false;
        }
        axo0 axo0Var = (axo0) obj;
        if (!this.a.equals(axo0Var.a) || !u890.j(this.b, axo0Var.b) || !this.c.equals(axo0Var.c) || this.d != axo0Var.d) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((Boolean.hashCode(this.d) + p3d1.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31) + 1;
    }
}
