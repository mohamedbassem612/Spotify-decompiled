package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v9i0 {
    public final zle1 a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public t45 j;
    public String k;

    public v9i0(zle1 zle1Var, int i, boolean z) {
        String str;
        this.a = zle1Var;
        this.b = i;
        if (i == 1) {
            str = "image";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "video";
        }
        this.c = str;
        this.d = f4i1.f(z ? "chat_optimistic_" : "chat_", str, "_upload");
        this.e = str.concat("_transcode");
        this.f = str.concat("_initiate_upload");
        this.g = str.concat("_file_upload");
        this.h = str.concat("_submit");
        this.i = str.concat("_count");
    }

    public final void a() {
        t45 t45Var = this.j;
        if (t45Var != null) {
            t45Var.g(this.g);
        }
        this.k = null;
    }

    public final void b() {
        t45 t45Var = this.j;
        String str = this.g;
        if (t45Var != null) {
            t45.m(t45Var, str, 4);
        }
        this.k = str;
    }

    public final void c() {
        t45 t45Var = this.j;
        if (t45Var != null) {
            t45Var.g(this.f);
        }
        this.k = null;
    }

    public final void d() {
        t45 t45Var = this.j;
        String str = this.f;
        if (t45Var != null) {
            t45.m(t45Var, str, 4);
        }
        this.k = str;
    }

    public final void e() {
        t45 t45Var = this.j;
        if (t45Var != null) {
            t45Var.g(this.h);
        }
        this.k = null;
    }

    public final void f(Long l) {
        t45 t45Var;
        t45 t45Var2 = this.j;
        if (t45Var2 != null) {
            t45Var2.g(this.e);
        }
        if (this.b == 2 && l != null && (t45Var = this.j) != null) {
            t45Var.b("file_size_after_transcode_bytes", String.valueOf(l.longValue()));
        }
        this.k = null;
    }

    public final void g() {
        int i;
        String str = this.k;
        if (u890.j(str, this.e)) {
            i = 2;
        } else if (u890.j(str, this.f)) {
            i = 3;
        } else if (u890.j(str, this.g)) {
            i = 4;
        } else if (!u890.j(str, this.h)) {
            return;
        } else {
            i = 5;
        }
        h(i);
    }

    public final void h(int i) {
        String strConcat;
        t45 t45Var = this.j;
        if (t45Var != null) {
            String str = this.k;
            if (str != null) {
                t45Var.g(str);
            }
            int iC = l1d.C(i);
            String str2 = this.c;
            if (iC == 0) {
                strConcat = str2.concat("_upload_success");
            } else if (iC == 1) {
                strConcat = str2.concat("_transcode_failed");
            } else if (iC == 2) {
                strConcat = str2.concat("_initiate_upload_failed");
            } else if (iC == 3) {
                strConcat = str2.concat("_file_upload_failed");
            } else if (iC == 4) {
                strConcat = str2.concat("_submit_failed");
            } else {
                if (iC != 5) {
                    eg.o();
                    return;
                }
                strConcat = str2.concat("_upload_cancelled");
            }
            t45Var.a("outcome", strConcat);
            this.a.b(t45Var.e());
        }
        this.j = null;
        this.k = null;
    }

    public final void i(int i, Long l) {
        t45 t45VarA = this.a.a(this.d);
        t45VarA.h = "android-campfire-media-upload";
        t45VarA.a(this.i, String.valueOf(i));
        if (this.b == 2 && l != null) {
            t45VarA.b("file_size_before_transcode_bytes", String.valueOf(l.longValue()));
        }
        t45.m(t45VarA, this.e, 4);
        this.j = t45VarA;
        this.k = this.e;
    }
}
