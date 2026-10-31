package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pwd0 {
    public final String a;
    public final k3s0 b;
    public final List c;
    public final vkf d;

    public pwd0(String str, k3s0 k3s0Var, List list, vkf vkfVar) {
        this.a = str;
        this.b = k3s0Var;
        this.c = list;
        this.d = vkfVar;
    }

    public static pwd0 a(pwd0 pwd0Var, k3s0 k3s0Var, vkf vkfVar, int i) {
        String str = pwd0Var.a;
        if ((i & 2) != 0) {
            k3s0Var = pwd0Var.b;
        }
        List list = pwd0Var.c;
        if ((i & 8) != 0) {
            vkfVar = pwd0Var.d;
        }
        pwd0Var.getClass();
        return new pwd0(str, k3s0Var, list, vkfVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwd0)) {
            return false;
        }
        pwd0 pwd0Var = (pwd0) obj;
        return u890.j(this.a, pwd0Var.a) && this.b.equals(pwd0Var.b) && this.c.equals(pwd0Var.c) && u890.j(this.d, pwd0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
        vkf vkfVar = this.d;
        return iB + (vkfVar != null ? vkfVar.hashCode() : 0);
    }
}
