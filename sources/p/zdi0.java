package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zdi0 implements jn60 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final aei0 e;

    public zdi0(String str, String str2, x360 x360Var, yz21 yz21Var, aei0 aei0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = aei0Var;
    }

    public final List d(op80 op80Var) {
        hvl1 hvl1VarC = this.c;
        if (hvl1VarC == null) {
            hvl1VarC = null;
        } else if (hvl1VarC instanceof hvl1) {
            hvl1VarC = hvl1.c(hvl1VarC, 239);
        }
        hvl1 hvl1Var = hvl1VarC;
        aei0 aei0Var = this.e;
        String str = aei0Var.a;
        String str2 = aei0Var.b;
        String str3 = aei0Var.c;
        String str4 = aei0Var.d;
        String str5 = aei0Var.e;
        String str6 = aei0Var.f;
        String str7 = aei0Var.g;
        String str8 = aei0Var.h;
        String str9 = aei0Var.i;
        String str10 = this.b;
        String str11 = this.a;
        return Collections.singletonList(new fdi0(str11, op80Var, new ndi0(str10, hvl1Var, str, str11, str2, str3, str4, str5, str6, str7, str8, str9)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdi0)) {
            return false;
        }
        zdi0 zdi0Var = (zdi0) obj;
        return this.a.equals(zdi0Var.a) && this.b.equals(zdi0Var.b) && u890.j(this.c, zdi0Var.c) && this.d.equals(zdi0Var.d) && this.e.equals(zdi0Var.e);
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.e.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
