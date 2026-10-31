package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qwv {
    public final boolean a;
    public final Set b;
    public final boolean c;

    public qwv(boolean z, Set set, boolean z2) {
        this.a = z;
        this.b = set;
        this.c = z2;
    }

    public static qwv a(qwv qwvVar, boolean z, Set set, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = qwvVar.a;
        }
        if ((i & 2) != 0) {
            set = qwvVar.b;
        }
        if ((i & 4) != 0) {
            z2 = qwvVar.c;
        }
        return new qwv(z, set, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwv)) {
            return false;
        }
        qwv qwvVar = (qwv) obj;
        return this.a == qwvVar.a && u890.j(this.b, qwvVar.b) && this.c == qwvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gvg.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
