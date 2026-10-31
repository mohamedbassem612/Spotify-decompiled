package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nga0 extends aha0 {
    public final boolean a;
    public final h661 b;
    public final String c;

    public nga0(Object obj, boolean z, h661 h661Var) {
        this.a = z;
        this.b = h661Var;
        this.c = obj.toString();
        if (h661Var == null || h661Var.isInline()) {
            return;
        }
        hhg1.n("Failed requirement.");
        throw null;
    }

    @Override // p.aha0
    public final String b() {
        return this.c;
    }

    @Override // p.aha0
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nga0.class != obj.getClass()) {
            return false;
        }
        nga0 nga0Var = (nga0) obj;
        return this.a == nga0Var.a && u890.j(this.c, nga0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // p.aha0
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        ahc1.a(sb, str);
        return sb.toString();
    }

    public /* synthetic */ nga0(Serializable serializable, boolean z) {
        this(serializable, z, null);
    }
}
