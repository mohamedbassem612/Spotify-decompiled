package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e811 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public e811(HashMap map, HashMap map2, HashMap map3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e811)) {
            return false;
        }
        e811 e811Var = (e811) obj;
        return this.a.equals(e811Var.a) && this.b.equals(e811Var.b) && this.c.equals(e811Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
