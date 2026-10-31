package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kxe implements nye {
    public final String a;
    public final String b;
    public final ArrayList c;

    public kxe(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxe)) {
            return false;
        }
        kxe kxeVar = (kxe) obj;
        return u890.j(this.a, kxeVar.a) && u890.j(this.b, kxeVar.b) && this.c.equals(kxeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
