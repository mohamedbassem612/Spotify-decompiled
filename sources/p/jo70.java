package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jo70 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final io70 e;

    public /* synthetic */ jo70(String str, String str2, String str3, List list, io70 io70Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? z6x.a : list, (i & 16) != 0 ? null : io70Var);
    }

    public static jo70 a(String str, jo70 jo70Var) {
        String str2 = jo70Var.b;
        String str3 = jo70Var.c;
        List list = jo70Var.d;
        io70 io70Var = jo70Var.e;
        jo70Var.getClass();
        return new jo70(str, str2, str3, list, io70Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo70)) {
            return false;
        }
        jo70 jo70Var = (jo70) obj;
        return u890.j(this.a, jo70Var.a) && u890.j(this.b, jo70Var.b) && u890.j(this.c, jo70Var.c) && u890.j(this.d, jo70Var.d) && u890.j(this.e, jo70Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        io70 io70Var = this.e;
        return iB + (io70Var == null ? 0 : io70Var.hashCode());
    }

    public jo70(String str, String str2, String str3, List list, io70 io70Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = io70Var;
    }
}
