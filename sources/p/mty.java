package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mty {
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;

    public mty(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mty)) {
            return false;
        }
        mty mtyVar = (mty) obj;
        return u890.j(this.a, mtyVar.a) && this.b.equals(mtyVar.b) && u890.j(this.c, mtyVar.c) && this.d == mtyVar.d;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
