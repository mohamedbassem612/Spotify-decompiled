package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hxg {
    public final String a;
    public final /* synthetic */ ufg1 b;

    public hxg(ufg1 ufg1Var) {
        this.b = ufg1Var;
        this.a = ufg1Var.b();
    }

    public final Bitmap a(Bitmap bitmap, k291 k291Var) {
        w4u w4uVar = k291Var.a;
        Integer num = new Integer(w4uVar instanceof w4u ? w4uVar.a : new Integer(bitmap.getWidth()).intValue());
        w4u w4uVar2 = k291Var.b;
        return this.b.a(bitmap, num, new Integer(w4uVar2 instanceof w4u ? w4uVar2.a : bitmap.getHeight()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hxg) {
            return u890.j(this.a, ((hxg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rc11.a.b(hxg.class).r());
        sb.append("(cacheKey=");
        return gvg.k(sb, this.a, ')');
    }
}
