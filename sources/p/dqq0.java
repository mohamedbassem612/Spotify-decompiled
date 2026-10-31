package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dqq0 {
    public final Context a;
    public final k291 b;
    public final dg41 c;
    public final int d;
    public final String e;
    public final i520 f;
    public final jsc g;
    public final jsc h;
    public final jsc i;
    public final kc10 j;

    public dqq0(Context context, k291 k291Var, dg41 dg41Var, int i, String str, i520 i520Var, jsc jscVar, jsc jscVar2, jsc jscVar3, kc10 kc10Var) {
        this.a = context;
        this.b = k291Var;
        this.c = dg41Var;
        this.d = i;
        this.e = str;
        this.f = i520Var;
        this.g = jscVar;
        this.h = jscVar2;
        this.i = jscVar3;
        this.j = kc10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqq0)) {
            return false;
        }
        dqq0 dqq0Var = (dqq0) obj;
        return u890.j(this.a, dqq0Var.a) && u890.j(this.b, dqq0Var.b) && this.c == dqq0Var.c && this.d == dqq0Var.d && u890.j(this.e, dqq0Var.e) && u890.j(this.f, dqq0Var.f) && this.g == dqq0Var.g && this.h == dqq0Var.h && this.i == dqq0Var.i && u890.j(this.j, dqq0Var.j);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iK + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + lzu0.k(this.d) + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ')';
    }
}
