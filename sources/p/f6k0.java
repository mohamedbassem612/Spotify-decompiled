package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f6k0 {
    public final ArrayList a;
    public final float b;
    public final Integer c;

    public f6k0(ArrayList arrayList, float f, Integer num) {
        this.a = arrayList;
        this.b = f;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6k0)) {
            return false;
        }
        f6k0 f6k0Var = (f6k0) obj;
        return this.a.equals(f6k0Var.a) && Float.compare(this.b, f6k0Var.b) == 0 && u890.j(this.c, f6k0Var.c);
    }

    public final int hashCode() {
        int iF = x0d.f(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iF + (num == null ? 0 : num.hashCode());
    }
}
