package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z54 implements x310 {
    public final /* synthetic */ byte a;
    public final Object b;

    public z54(uw0 uw0Var, ynb0 ynb0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new idd1(new y54(uw0Var, ynb0Var, (byte) 1));
                break;
            default:
                this.b = new idd1(new y54(uw0Var, ynb0Var, (byte) 0));
                break;
        }
    }

    public final boolean a(r9c r9cVar) {
        String str;
        switch (this.a) {
            case 0:
                if (u890.j(r9cVar.b, "com.spotify.browse")) {
                    String str2 = r9cVar.c;
                    if (u890.j(str2, "com.google.android.projection.gearhead") || u890.j(str2, "com.spotify.auto.mediatest") || r9cVar.l == 4) {
                        return true;
                    }
                }
                return false;
            case 1:
                if (u890.j(r9cVar.b, "com.spotify.recently-played")) {
                    String str3 = r9cVar.c;
                    if (u890.j(str3, "com.google.android.projection.gearhead") || u890.j(str3, "com.spotify.auto.mediatest") || r9cVar.l == 4) {
                        return true;
                    }
                }
                return false;
            case 2:
                String str4 = r9cVar.b;
                if (u890.j(str4, "com.spotify.your-library") || u890.j(str4, "spotify:android-auto:offline-library")) {
                    String str5 = r9cVar.c;
                    if (u890.j(str5, "com.google.android.projection.gearhead") || u890.j(str5, "com.spotify.auto.mediatest") || r9cVar.l == 4) {
                        return true;
                    }
                }
                return false;
            default:
                if (nhc1.Y(r9cVar.b, "spotify_media_browser_root_samsung", false) && r9cVar.f) {
                    t380 t380Var = j841.a;
                    m210 m210Var = r9cVar.e;
                    if (m210Var == null || (str = m210Var.k) == null) {
                        str = "";
                    }
                    if (t380Var.contains(str) && !r9cVar.h) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final w310 b(r9c r9cVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (w6o0) ((idd1) obj).getValue();
            case 1:
                return (w6o0) ((idd1) obj).getValue();
            case 2:
                return (w6o0) ((idd1) obj).getValue();
            default:
                return (w310) ((kly0) obj).get();
        }
    }

    public z54(chp chpVar) {
        this.a = (byte) 3;
        this.b = chpVar;
    }

    public z54(uw0 uw0Var, ynb0 ynb0Var) {
        this.a = (byte) 2;
        this.b = new idd1(new y54(uw0Var, ynb0Var, (byte) 2));
    }
}
