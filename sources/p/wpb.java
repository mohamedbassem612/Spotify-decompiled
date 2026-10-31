package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wpb implements ypb {
    public final int a;
    public final Map b;

    public wpb(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpb)) {
            return false;
        }
        wpb wpbVar = (wpb) obj;
        return this.a == wpbVar.a && u890.j(this.b, wpbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
