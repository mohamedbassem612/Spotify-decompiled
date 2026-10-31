package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i661 implements h661, mtc {
    public final h661 a;
    public final String b;
    public final Set c;

    public i661(h661 h661Var) {
        this.a = h661Var;
        this.b = h661Var.h() + '?';
        this.c = j0o1.p(h661Var);
    }

    @Override // p.mtc
    public final Set a() {
        return this.c;
    }

    @Override // p.h661
    public final boolean b() {
        return true;
    }

    @Override // p.h661
    public final int c(String str) {
        return this.a.c(str);
    }

    @Override // p.h661
    public final int d() {
        return this.a.d();
    }

    @Override // p.h661
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i661) {
            return u890.j(this.a, ((i661) obj).a);
        }
        return false;
    }

    @Override // p.h661
    public final List f(int i) {
        return this.a.f(i);
    }

    @Override // p.h661
    public final h661 g(int i) {
        return this.a.g(i);
    }

    @Override // p.h661
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // p.h661
    public final yoi1 getKind() {
        return this.a.getKind();
    }

    @Override // p.h661
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // p.h661
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // p.h661
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
