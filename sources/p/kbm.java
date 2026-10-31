package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kbm implements h661 {
    public final j661 a;
    public final tka0 b;
    public final String c;

    public kbm(j661 j661Var, tka0 tka0Var) {
        this.a = j661Var;
        this.b = tka0Var;
        this.c = j661Var.a + '<' + tka0Var.r() + '>';
    }

    @Override // p.h661
    public final boolean b() {
        return false;
    }

    @Override // p.h661
    public final int c(String str) {
        return this.a.c(str);
    }

    @Override // p.h661
    public final int d() {
        return this.a.c;
    }

    @Override // p.h661
    public final String e(int i) {
        return this.a.f[i];
    }

    public final boolean equals(Object obj) {
        kbm kbmVar = obj instanceof kbm ? (kbm) obj : null;
        return kbmVar != null && this.a.equals(kbmVar.a) && u890.j(kbmVar.b, this.b);
    }

    @Override // p.h661
    public final List f(int i) {
        return this.a.h[i];
    }

    @Override // p.h661
    public final h661 g(int i) {
        return this.a.g[i];
    }

    @Override // p.h661
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // p.h661
    public final yoi1 getKind() {
        return this.a.b;
    }

    @Override // p.h661
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // p.h661
    public final boolean i(int i) {
        return this.a.i[i];
    }

    @Override // p.h661
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
