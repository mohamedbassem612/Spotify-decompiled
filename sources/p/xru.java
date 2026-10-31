package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xru {
    public final ArrayList a;
    public final ArrayList b;
    public final Function0 c;

    public xru(ArrayList arrayList, ArrayList arrayList2, Function0 function0) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xru)) {
            return false;
        }
        xru xruVar = (xru) obj;
        return this.a.equals(xruVar.a) && this.b.equals(xruVar.b) && u890.j(this.c, xruVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
