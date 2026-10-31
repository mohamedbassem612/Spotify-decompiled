package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class urk0 implements t9h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final List c;

    public urk0(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-search";
                x6h1VarI.f = "40.4.0";
                x6h1VarI.g = "22.0.0";
                this.b = x6h1VarI.a();
                this.c = p7h.M("search", "search/albums", "search/artists", "search/audiobooks", "search/genres", "search/music", "search/playlists", "search/podcasts_and_episodes", "search/profiles", "search/recent", "search/songs", "search/videos", "search/last_24_hours", "search/last_week", "search/loading_instant_mix");
                break;
            default:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-gen-alpha-kid-account-creation-education";
                x6h1VarI2.f = "3.1.0";
                x6h1VarI2.g = "22.0.0";
                this.b = x6h1VarI2.a();
                this.c = p7h.M("kid-account-creation/education", "kid-account-transition/education");
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                dlg1 dlg1VarS = b3o1.s();
                dlg1VarS.s(y6h1Var);
                return dlg1VarS.f();
            case 1:
                r6h1 r6h1Var2 = r6h1.c;
                dlg1 dlg1VarS2 = b3o1.s();
                dlg1VarS2.s(y6h1Var);
                return dlg1VarS2.f();
            case 2:
                r6h1 r6h1Var3 = r6h1.c;
                dlg1 dlg1VarS3 = b3o1.s();
                dlg1VarS3.s(y6h1Var);
                return dlg1VarS3.f();
            case 3:
                r6h1 r6h1Var4 = r6h1.c;
                dlg1 dlg1VarS4 = b3o1.s();
                dlg1VarS4.s(y6h1Var);
                return dlg1VarS4.f();
            default:
                r6h1 r6h1Var5 = r6h1.c;
                dlg1 dlg1VarS5 = b3o1.s();
                dlg1VarS5.s(y6h1Var);
                return dlg1VarS5.f();
        }
    }

    public urk0(String str, String str2, String str3) {
        this.a = (byte) 3;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-home-evo";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.e = str2;
        x6h1VarI.d = str3;
        this.b = x6h1VarI.a();
        this.c = k4p1.x("home-funkis");
    }

    public urk0(String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-feedback-page";
                x6h1VarI.f = "4.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                this.b = x6h1VarI.a();
                this.c = k4p1.x("martini/feedback");
                break;
            default:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-artist-about";
                x6h1VarI2.f = "5.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = str;
                this.b = x6h1VarI2.a();
                this.c = k4p1.x("artist/about");
                break;
        }
    }
}
