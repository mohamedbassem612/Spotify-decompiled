package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qie {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;

    public qie(String str, String str2, boolean z, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
    }

    public static qie a(qie qieVar, ArrayList arrayList, boolean z, int i) {
        String str = qieVar.a;
        String str2 = qieVar.b;
        String str3 = qieVar.c;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = qieVar.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = qieVar.e;
        }
        qieVar.getClass();
        return new qie(str, str2, z, str3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qie)) {
            return false;
        }
        qie qieVar = (qie) obj;
        return u890.j(this.a, qieVar.a) && u890.j(this.b, qieVar.b) && u890.j(this.c, qieVar.c) && u890.j(this.d, qieVar.d) && this.e == qieVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Boolean.hashCode(this.e) + f4i1.b((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.d);
    }
}
