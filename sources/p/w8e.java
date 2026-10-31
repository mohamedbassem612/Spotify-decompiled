package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w8e {
    public final String a;
    public final String b;
    public final ArrayList c;

    public w8e(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8e)) {
            return false;
        }
        w8e w8eVar = (w8e) obj;
        return u890.j(this.a, w8eVar.a) && u890.j(this.b, w8eVar.b) && this.c.equals(w8eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
