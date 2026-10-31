package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oiu implements s7c, sfu {
    public final String a;
    public final String b;
    public final ji0 c;

    public oiu(String str, String str2, ji0 ji0Var) {
        this.a = str;
        this.b = str2;
        this.c = ji0Var;
    }

    @Override // p.sfu
    public final String c() {
        return this.c.a;
    }

    @Override // p.s7c
    public final List d(int i, int i2) {
        return Collections.singletonList(new mgu(this.a, new k3h1(i), this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oiu)) {
            return false;
        }
        oiu oiuVar = (oiu) obj;
        return this.a.equals(oiuVar.a) && this.b.equals(oiuVar.b) && this.c.equals(oiuVar.c);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
