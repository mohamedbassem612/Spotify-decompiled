package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h9h implements x310 {
    public final /* synthetic */ byte a;
    public final uw0 b;

    public /* synthetic */ h9h(uw0 uw0Var, byte b) {
        this.a = b;
        this.b = uw0Var;
    }

    public final boolean a(r9c r9cVar) {
        switch (this.a) {
            case 0:
                return r9cVar.h && o7h.i0(g9h.a, r9cVar.c);
            case 1:
                return r9cVar.f && !r9cVar.h && o7h.i0(g9h.a, r9cVar.c);
            case 2:
                String str = r9cVar.a;
                if (!r9cVar.h) {
                    return false;
                }
                boolean z = "gadm-default".equals(str) || "gadm-1-dimensional".equals(str);
                boolean z2 = "smart-space-default".equals(str) || "smart-space-1-dimensional".equals(str);
                if (r9cVar.f) {
                    return z || z2;
                }
                return false;
            case 3:
                return r9cVar.h && "com.google.android.apps.maps".equals(r9cVar.c) && r9cVar.f;
            case 4:
                if (!u890.j(r9cVar.b, "com.spotify.inter-app.home")) {
                    return false;
                }
                n57.s("InterAppHomeConfigurator is being used");
                return true;
            case 5:
                return r9cVar.h && u890.j(r9cVar.c, "com.motorola.partner.music");
            case 6:
                return r9cVar.f && !r9cVar.h && u890.j(r9cVar.c, "com.motorola.partner.music");
            case 7:
                return r9cVar.h && u890.j(r9cVar.c, "com.oplus.ambient.livealert");
            case 8:
                return r9cVar.h && o7h.i0(yhq0.a, r9cVar.c);
            case 9:
                return r9cVar.h && u890.j(r9cVar.c, "com.skmusic");
            case 10:
                return r9cVar.h && o7h.i0(bv91.a, r9cVar.c);
            case 11:
                return r9cVar.h && u890.j(r9cVar.c, "com.android.deskclock");
            case 12:
                return r9cVar.h && u890.j(r9cVar.c, "com.vivo.globalsearch");
            case 13:
                return r9cVar.f && !r9cVar.h && u890.j(r9cVar.c, "com.vivo.globalsearch");
            case 14:
                return r9cVar.f && u890.j(r9cVar.c, "com.waze");
            default:
                return r9cVar.f && !r9cVar.h && o7h.i0(zgl.a, r9cVar.c);
        }
    }

    public final w310 b(r9c r9cVar) {
        byte b = this.a;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                return uw0Var.n(5);
            case 1:
                return uw0Var.n(6);
            case 2:
                String str = r9cVar.a;
                return ("gadm-1-dimensional".equals(str) || "smart-space-1-dimensional".equals(str)) ? uw0Var.n(3) : uw0Var.n(5);
            case 3:
                return uw0Var.n(2);
            case 4:
                return uw0Var.n(2);
            case 5:
                return uw0Var.n(5);
            case 6:
                return uw0Var.n(6);
            case 7:
                return uw0Var.n(4);
            case 8:
                return uw0Var.n(5);
            case 9:
                return uw0Var.n(5);
            case 10:
                return uw0Var.n(5);
            case 11:
                return uw0Var.n(5);
            case 12:
                return uw0Var.n(4);
            case 13:
                return uw0Var.n(6);
            case 14:
                return uw0Var.n(2);
            default:
                return uw0Var.n(6);
        }
    }
}
