package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oje implements z0i {
    public final String a;
    public final ArrayList b;
    public final String c;

    public oje(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oje)) {
            return false;
        }
        oje ojeVar = (oje) obj;
        return this.a.equals(ojeVar.a) && this.b.equals(ojeVar.b) && this.c.equals(ojeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
