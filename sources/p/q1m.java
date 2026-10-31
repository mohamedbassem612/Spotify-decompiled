package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q1m {
    public final zle1 a;
    public t45 b;

    public q1m(zle1 zle1Var, byte b) {
        switch (b) {
            case 1:
                this.a = zle1Var;
                t45 t45VarA = ((s45) zle1Var).a("mbs_search");
                t45VarA.h = "android-system-media-browser-service";
                this.b = t45VarA;
                break;
            default:
                this.a = zle1Var;
                break;
        }
    }

    public void a(int i) {
        t45 t45Var = this.b;
        t45Var.g("mbs_play_from_search");
        t45Var.a("outcome", fd21.d(i));
        this.a.b(t45Var.e());
    }

    public void b(int i) {
        t45 t45Var = this.b;
        t45Var.g("mbs_search");
        t45Var.a("outcome", fd21.d(i));
        this.a.b(t45Var.e());
    }

    public void c(int i) {
        String str;
        t45 t45Var = this.b;
        if (t45Var != null) {
            if (i == 1) {
                str = "success";
            } else {
                if (i != 2) {
                    throw null;
                }
                str = "failure";
            }
            t45Var.g.put("outcome", str);
            t45Var.g("load_recommendations");
            this.a.b(t45Var.e());
        }
        this.b = null;
    }

    public void d(int i, String str) {
        String str2;
        t45 t45Var = this.b;
        if (str == null) {
            str = "unknown";
        }
        t45Var.b("package_name", str);
        t45.m(t45Var, "mbs_search", 4);
        int iC = l1d.C(i);
        if (iC == 0) {
            str2 = "media1";
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            str2 = "media3";
        }
        t45Var.a("media_session_version", str2);
        t45Var.a("playback_outcome", "unknown");
    }
}
