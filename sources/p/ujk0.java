package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ujk0 {
    public final ArrayList a;
    public final ArrayList b;
    public final Integer c;

    public ujk0(ArrayList arrayList, ArrayList arrayList2, Integer num) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujk0)) {
            return false;
        }
        ujk0 ujk0Var = (ujk0) obj;
        return this.a.equals(ujk0Var.a) && this.b.equals(ujk0Var.b) && u890.j(this.c, ujk0Var.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return iF + (num == null ? 0 : num.hashCode());
    }
}
