package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fio {
    public final Map a;
    public final Map b;

    public fio(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fio)) {
            return false;
        }
        fio fioVar = (fio) obj;
        return u890.j(this.a, fioVar.a) && u890.j(this.b, fioVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ fio(Map map) {
        this(map, b7x.a);
    }
}
