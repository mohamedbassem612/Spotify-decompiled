package p;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bc11 extends qb11 implements m7a0 {
    public final zb11 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public bc11(zb11 zb11Var, Annotation[] annotationArr, String str, boolean z) {
        this.a = zb11Var;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // p.m7a0
    public final cb11 a(kf30 kf30Var) {
        return p1p1.z(this.b, kf30Var);
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        return p1p1.B(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(bc11.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str != null ? ajn0.d(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
