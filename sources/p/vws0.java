package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vws0 {
    public static final vws0 e = new vws0(false, "", z6x.a, null);
    public final boolean a;
    public final String b;
    public final List c;
    public final Integer d;

    public vws0(boolean z, String str, List list, Integer num) {
        this.a = z;
        this.b = str;
        this.c = list;
        this.d = num;
    }

    public static vws0 a(vws0 vws0Var, Integer num) {
        boolean z = vws0Var.a;
        String str = vws0Var.b;
        List list = vws0Var.c;
        vws0Var.getClass();
        return new vws0(z, str, list, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vws0)) {
            return false;
        }
        vws0 vws0Var = (vws0) obj;
        return this.a == vws0Var.a && this.b.equals(vws0Var.b) && u890.j(this.c, vws0Var.c) && u890.j(this.d, vws0Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }
}
