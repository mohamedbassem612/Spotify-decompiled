package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hwm {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final List d;

    public hwm(String str, ArrayList arrayList, String str2, List list) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwm)) {
            return false;
        }
        hwm hwmVar = (hwm) obj;
        return u890.j(this.a, hwmVar.a) && this.b.equals(hwmVar.b) && u890.j(this.c, hwmVar.c) && u890.j(this.d, hwmVar.d);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
