package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uia implements ez00 {
    public final int a;
    public final ArrayList b;
    public final String c;

    public uia(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uia)) {
            return false;
        }
        uia uiaVar = (uia) obj;
        return this.a == uiaVar.a && this.b.equals(uiaVar.b) && this.c.equals(uiaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
