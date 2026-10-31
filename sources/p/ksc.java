package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ksc {
    public final ie30 a;
    public final boolean b;
    public final Set c;
    public final d061 d;

    public ksc(ie30 ie30Var, boolean z, Set set, d061 d061Var) {
        this.a = ie30Var;
        this.b = z;
        this.c = set;
        this.d = d061Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksc)) {
            return false;
        }
        ksc kscVar = (ksc) obj;
        return this.a.equals(kscVar.a) && this.b == kscVar.b && this.c.equals(kscVar.c) && this.d.equals(kscVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gvg.c(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
