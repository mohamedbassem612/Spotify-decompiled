package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class myz extends v600 {
    public final String a;
    public final kw9 b;
    public final cqs0 c;
    public final int d;
    public final chf0 e;
    public final int f;
    public final boolean g;
    public final String h;
    public final ArrayList i;

    public myz(String str, kw9 kw9Var, cqs0 cqs0Var, int i, chf0 chf0Var, int i2, boolean z, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = kw9Var;
        this.c = cqs0Var;
        this.d = i;
        this.e = chf0Var;
        this.f = i2;
        this.g = z;
        this.h = str2;
        this.i = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myz)) {
            return false;
        }
        myz myzVar = (myz) obj;
        return u890.j(this.a, myzVar.a) && this.b.equals(myzVar.b) && u890.j(this.c, myzVar.c) && this.d == myzVar.d && this.e == myzVar.e && this.f == myzVar.f && this.g == myzVar.g && u890.j(this.h, myzVar.h) && this.i.equals(myzVar.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(ab80.k(this.f, (this.e.hashCode() + kaa0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31), 31, this.g);
        String str = this.h;
        return this.i.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
