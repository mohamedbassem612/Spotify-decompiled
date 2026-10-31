package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zmx0 implements s7c, tzg, sfu, niv0 {
    public final String a;
    public final String b;
    public final x360 c;
    public final fpx0 d;

    public zmx0(String str, String str2, x360 x360Var, fpx0 fpx0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = fpx0Var;
    }

    @Override // p.tzg
    public final Set a() {
        return Collections.singleton(this.d.b);
    }

    @Override // p.niv0
    public final Set b() {
        String str = this.d.a;
        if (!bbp1.k(str)) {
            str = null;
        }
        return str != null ? Collections.singleton(str) : w7x.a;
    }

    @Override // p.sfu
    public final String c() {
        return this.d.b;
    }

    @Override // p.s7c
    public final List d(int i, int i2) {
        int i3;
        k3h1 k3h1Var = new k3h1(i);
        fpx0 fpx0Var = this.d;
        String str = fpx0Var.a;
        n1x n1xVarV = fho1.v(fpx0Var.c);
        int iC = l1d.C(fpx0Var.d);
        int i4 = 2;
        if (iC == 1) {
            i3 = i4;
        } else if (iC != 2) {
            i3 = 1;
        } else {
            i4 = 3;
            i3 = i4;
        }
        return Collections.singletonList(new pmx0(this.a, k3h1Var, new tmx0(this.c, this.b, str, n1xVarV, i3, false)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmx0)) {
            return false;
        }
        zmx0 zmx0Var = (zmx0) obj;
        return this.a.equals(zmx0Var.a) && this.b.equals(zmx0Var.b) && u890.j(this.c, zmx0Var.c) && this.d.equals(zmx0Var.d);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.d.hashCode() + ((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
