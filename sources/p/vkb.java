package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vkb implements xkb {
    public final int a;
    public final ArrayList b;

    public vkb(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkb)) {
            return false;
        }
        vkb vkbVar = (vkb) obj;
        return this.a == vkbVar.a && this.b.equals(vkbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
