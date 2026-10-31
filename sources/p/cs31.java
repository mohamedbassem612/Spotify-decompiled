package p;

import android.content.ComponentName;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cs31 {
    public final List a;
    public final ComponentName b;
    public final ComponentName c;

    public cs31(List list, ComponentName componentName, ComponentName componentName2, int i) {
        list = (i & 1) != 0 ? z6x.a : list;
        componentName = (i & 2) != 0 ? null : componentName;
        componentName2 = (i & 4) != 0 ? null : componentName2;
        this.a = list;
        this.b = componentName;
        this.c = componentName2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs31)) {
            return false;
        }
        cs31 cs31Var = (cs31) obj;
        return this.a.equals(cs31Var.a) && u890.j(this.b, cs31Var.b) && u890.j(this.c, cs31Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ComponentName componentName = this.b;
        int iHashCode2 = (iHashCode + (componentName == null ? 0 : componentName.hashCode())) * 31;
        ComponentName componentName2 = this.c;
        return Boolean.hashCode(false) + ((iHashCode2 + (componentName2 == null ? 0 : componentName2.hashCode())) * 31);
    }
}
