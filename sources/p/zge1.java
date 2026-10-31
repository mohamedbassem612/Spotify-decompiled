package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zge1 implements ez00 {
    public final int a;
    public final int b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public zge1(int i, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = i;
        this.b = i2;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zge1)) {
            return false;
        }
        zge1 zge1Var = (zge1) obj;
        return this.a == zge1Var.a && this.b == zge1Var.b && this.c.equals(zge1Var.c) && this.d.equals(zge1Var.d) && this.e.equals(zge1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p3d1.f(this.d, p3d1.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }
}
