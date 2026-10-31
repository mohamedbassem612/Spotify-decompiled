package p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ucn0 implements tka0, rma0, i0h1 {
    public final tka0 a;
    public final String b;
    public final List c;
    public final List d;

    public ucn0(tka0 tka0Var, String str, iu30 iu30Var, iu30 iu30Var2) {
        this.a = tka0Var;
        this.b = str;
        this.c = (List) iu30Var.invoke(this);
        this.d = (List) iu30Var2.invoke(this);
    }

    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ucn0) {
            return u890.j(this.a, ((ucn0) obj).a);
        }
        return false;
    }

    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    public final List getTypeParameters() {
        return this.c;
    }

    public final Collection h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean j() {
        return this.a.j();
    }

    public final boolean m(Object obj) {
        return this.a.m(obj);
    }

    public final String o() {
        return this.b;
    }

    public final boolean p() {
        return this.a.p();
    }

    public final String r() {
        return ihc1.X0(this.b, ".");
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.a + ')';
    }
}
