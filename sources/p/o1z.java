package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o1z implements ez00 {
    public final int a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public o1z(int i, String str, String str2, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1z)) {
            return false;
        }
        o1z o1zVar = (o1z) obj;
        return this.a == o1zVar.a && this.b.equals(o1zVar.b) && u890.j(this.c, o1zVar.c) && this.d.equals(o1zVar.d);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
