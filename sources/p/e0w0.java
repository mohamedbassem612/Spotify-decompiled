package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e0w0 extends cxm {
    public final ArrayList d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public e0w0(String str, String str2, String str3, ArrayList arrayList, boolean z) {
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0w0)) {
            return false;
        }
        e0w0 e0w0Var = (e0w0) obj;
        return this.d.equals(e0w0Var.d) && u890.j(this.e, e0w0Var.e) && u890.j(this.f, e0w0Var.f) && u890.j(this.g, e0w0Var.g) && this.h == e0w0Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.h) + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }
}
