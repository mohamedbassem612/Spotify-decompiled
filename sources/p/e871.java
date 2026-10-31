package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e871 {
    public final String a;
    public final boolean b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public e871(String str, boolean z, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.a = str;
        this.b = z;
        this.c = linkedHashSet;
        this.d = linkedHashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e871)) {
            return false;
        }
        e871 e871Var = (e871) obj;
        return this.a.equals(e871Var.a) && this.b == e871Var.b && this.c.equals(e871Var.c) && this.d.equals(e871Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
