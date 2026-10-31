package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ily0 {
    public final ArrayList a;
    public final kwh0 b;
    public final boolean c;

    public ily0(ArrayList arrayList, kwh0 kwh0Var, boolean z) {
        this.a = arrayList;
        this.b = kwh0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ily0)) {
            return false;
        }
        ily0 ily0Var = (ily0) obj;
        return this.a.equals(ily0Var.a) && u890.j(this.b, ily0Var.b) && this.c == ily0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kwh0 kwh0Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (kwh0Var == null ? 0 : kwh0Var.hashCode())) * 31);
    }
}
