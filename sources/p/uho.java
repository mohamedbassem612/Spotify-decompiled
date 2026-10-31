package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uho {
    public final String a;
    public final String b;
    public final tho c;
    public final nho d;
    public final String e;
    public final String f;
    public final Function0 g;
    public final boolean h;

    public /* synthetic */ uho(String str, String str2, tho thoVar, nho nhoVar, String str3, Function0 function0, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? oho.a : thoVar, (i & 8) != 0 ? kho.a : nhoVar, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : "", (i & 64) != 0 ? null : function0, (i & 128) == 0);
    }

    public static uho a(uho uhoVar, Function0 function0) {
        String str = uhoVar.a;
        String str2 = uhoVar.b;
        tho thoVar = uhoVar.c;
        nho nhoVar = uhoVar.d;
        String str3 = uhoVar.e;
        String str4 = uhoVar.f;
        boolean z = uhoVar.h;
        uhoVar.getClass();
        return new uho(str, str2, thoVar, nhoVar, str3, str4, function0, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uho)) {
            return false;
        }
        uho uhoVar = (uho) obj;
        return u890.j(this.a, uhoVar.a) && u890.j(this.b, uhoVar.b) && u890.j(this.c, uhoVar.c) && u890.j(this.d, uhoVar.d) && u890.j(this.e, uhoVar.e) && u890.j(this.f, uhoVar.f) && u890.j(this.g, uhoVar.g) && this.h == uhoVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0 function0 = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode3 + (function0 != null ? function0.hashCode() : 0)) * 31);
    }

    public uho(String str, String str2, tho thoVar, nho nhoVar, String str3, String str4, Function0 function0, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = thoVar;
        this.d = nhoVar;
        this.e = str3;
        this.f = str4;
        this.g = function0;
        this.h = z;
    }
}
