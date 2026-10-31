package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oix extends pix {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public oix(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oix)) {
            return false;
        }
        oix oixVar = (oix) obj;
        return u890.j(this.a, oixVar.a) && u890.j(this.b, oixVar.b) && u890.j(this.c, oixVar.c) && u890.j(this.d, oixVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ oix(String str, String str2, int i, String str3) {
        this(str, (List) z6x.a, str2, (i & 4) != 0 ? null : str3);
    }
}
