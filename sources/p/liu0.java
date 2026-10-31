package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class liu0 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    public liu0(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liu0)) {
            return false;
        }
        liu0 liu0Var = (liu0) obj;
        return u890.j(this.a, liu0Var.a) && this.b.equals(liu0Var.b) && u890.j(this.c, liu0Var.c) && this.d.equals(liu0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
