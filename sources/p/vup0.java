package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vup0 extends xup0 {
    public final hvl1 a;
    public final ArrayList b;

    public vup0(hvl1 hvl1Var, ArrayList arrayList) {
        this.a = hvl1Var;
        this.b = arrayList;
    }

    public final x360 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vup0)) {
            return false;
        }
        vup0 vup0Var = (vup0) obj;
        return this.a.equals(vup0Var.a) && this.b.equals(vup0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() - 1150326230) * 31);
    }
}
