package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ze31 implements jn60 {
    public final String a;
    public final String b;
    public final yz21 c;
    public final byc d;
    public final boolean e;

    public ze31(String str, String str2, yz21 yz21Var, byc bycVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = bycVar;
        this.e = z;
    }

    public final List d(op80 op80Var) {
        byc bycVar = this.d;
        int iC = l1d.C(bycVar.a);
        int i = 1;
        if (iC != 1) {
            i = 2;
            if (iC != 2) {
                i = 3;
                if (iC != 3) {
                    i = 0;
                }
            }
        }
        int i2 = i;
        if (i2 == 0) {
            return z6x.a;
        }
        String str = bycVar.b;
        String str2 = bycVar.c;
        String str3 = bycVar.d;
        String str4 = bycVar.e;
        boolean z = this.e;
        String str5 = this.b;
        String str6 = this.a;
        return Collections.singletonList(new te31(new cf31(i2, str6, str, str2, str3, str4, str5, z), str6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze31)) {
            return false;
        }
        ze31 ze31Var = (ze31) obj;
        return this.a.equals(ze31Var.a) && this.b.equals(ze31Var.b) && this.c.equals(ze31Var.c) && this.d.equals(ze31Var.d) && this.e == ze31Var.e;
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31)) * 31);
    }
}
