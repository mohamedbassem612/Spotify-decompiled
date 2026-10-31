package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ul4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final luk h;
    public final idd1 i;

    public ul4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = lukVar;
        this.i = new idd1(new gk4(this, (byte) 15));
    }

    public final boolean a() {
        ul4 ul4VarD = d();
        return ul4VarD != null ? ul4VarD.a() : this.a;
    }

    public final boolean b() {
        ul4 ul4VarD = d();
        return ul4VarD != null ? ul4VarD.b() : this.b;
    }

    public final boolean c() {
        ul4 ul4VarD = d();
        return ul4VarD != null ? ul4VarD.c() : this.c;
    }

    public final ul4 d() {
        return (ul4) this.i.getValue();
    }

    public final boolean e() {
        ul4 ul4VarD = d();
        return ul4VarD != null ? ul4VarD.e() : this.d;
    }

    public final boolean f() {
        ul4 ul4VarD = d();
        return ul4VarD != null ? ul4VarD.f() : this.e;
    }

    public final boolean g() {
        ul4 ul4VarD = d();
        return ul4VarD != null ? ul4VarD.g() : this.f;
    }

    public final boolean h() {
        ul4 ul4VarD = d();
        return ul4VarD != null ? ul4VarD.h() : this.g;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("carousel_use_elements_ui", "android-libs-allboarding", a()), new fpb("contentpicker_use_element_ui", "android-libs-allboarding", b()), new fpb("contextualaudio_use_element_ui", "android-libs-allboarding", c()), new fpb("notification_permission_use_element_ui", "android-libs-allboarding", e()), new fpb("search_use_element_ui", "android-libs-allboarding", f()), new fpb("use_content_stack", "android-libs-allboarding", g()), new fpb("use_page_api_flow", "android-libs-allboarding", h()));
    }

    public ul4(luk lukVar) {
        this(false, false, false, false, false, false, false, lukVar);
    }
}
