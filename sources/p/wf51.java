package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wf51 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;

    public wf51(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf51)) {
            return false;
        }
        wf51 wf51Var = (wf51) obj;
        return this.a.equals(wf51Var.a) && this.b.equals(wf51Var.b) && this.c.equals(wf51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
