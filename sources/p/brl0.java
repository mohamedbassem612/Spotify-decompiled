package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class brl0 implements t9h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final List c;

    public brl0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-prompt-playlist-generation-mode-page";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                this.b = x6h1VarI.a();
                this.c = Collections.singletonList("magpie/generation-mode");
                break;
            case 2:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-prompt-playlist-page";
                x6h1VarI2.f = "3.0.0";
                x6h1VarI2.g = "22.0.0";
                this.b = x6h1VarI2.a();
                this.c = Collections.singletonList("magpie/prompt");
                break;
            case 3:
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-prompt-playlist-privacy-page";
                x6h1VarI3.f = "1.0.0";
                x6h1VarI3.g = "22.0.0";
                this.b = x6h1VarI3.a();
                this.c = Collections.singletonList("magpie/privacy");
                break;
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case 15:
            case 16:
            case 18:
            case 19:
            case 23:
            case 25:
            default:
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-prompt-playlist-cadence-page";
                x6h1VarI4.f = "2.0.0";
                x6h1VarI4.g = "22.0.0";
                this.b = x6h1VarI4.a();
                this.c = Collections.singletonList("magpie/cadence");
                break;
            case 5:
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-remote-downloads-onboarding-education";
                x6h1VarI5.f = "1.0.0";
                x6h1VarI5.g = "22.0.0";
                this.b = x6h1VarI5.a();
                this.c = Collections.singletonList("remotedownloads/onboarding/education");
                break;
            case 6:
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI6 = i3o1.i();
                x6h1VarI6.h = "music";
                x6h1VarI6.a = "mobile-remote-downloads-onboarding";
                x6h1VarI6.f = "1.1.0";
                x6h1VarI6.g = "22.0.0";
                this.b = x6h1VarI6.a();
                this.c = Collections.singletonList("remotedownloads/onboarding");
                break;
            case 7:
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI7 = i3o1.i();
                x6h1VarI7.h = "music";
                x6h1VarI7.a = "mobile-skip-forward-picker";
                x6h1VarI7.f = "1.0.0";
                x6h1VarI7.g = "22.0.0";
                this.b = x6h1VarI7.a();
                this.c = Collections.singletonList("bluejay/skip-forward");
                break;
            case 12:
                y6h1 y6h1Var8 = y6h1.i;
                x6h1 x6h1VarI8 = i3o1.i();
                x6h1VarI8.h = "music";
                x6h1VarI8.a = "mobile-tab-bar";
                x6h1VarI8.f = "11.1.0";
                x6h1VarI8.g = "22.0.0";
                this.b = x6h1VarI8.a();
                this.c = Collections.singletonList("any");
                break;
            case 13:
                y6h1 y6h1Var9 = y6h1.i;
                x6h1 x6h1VarI9 = i3o1.i();
                x6h1VarI9.h = "music";
                x6h1VarI9.a = "mobile-taste-profile";
                x6h1VarI9.f = "3.1.0";
                x6h1VarI9.g = "22.0.0";
                this.b = x6h1VarI9.a();
                this.c = Collections.singletonList("tasteprofile");
                break;
            case 14:
                y6h1 y6h1Var10 = y6h1.i;
                x6h1 x6h1VarI10 = i3o1.i();
                x6h1VarI10.h = "music";
                x6h1VarI10.a = "mobile-track-page-free";
                x6h1VarI10.f = "5.1.0";
                x6h1VarI10.g = "22.0.0";
                x6h1VarI10.e = "";
                this.b = x6h1VarI10.a();
                this.c = Collections.singletonList("free-tier-track");
                break;
            case 17:
                y6h1 y6h1Var11 = y6h1.i;
                x6h1 x6h1VarI11 = i3o1.i();
                x6h1VarI11.h = "music";
                x6h1VarI11.a = "mobile-trending-near-you";
                x6h1VarI11.f = "0.2.0";
                x6h1VarI11.g = "22.0.0";
                this.b = x6h1VarI11.a();
                this.c = Collections.singletonList("trending-near-you/entity");
                break;
            case 20:
                y6h1 y6h1Var12 = y6h1.i;
                x6h1 x6h1VarI12 = i3o1.i();
                x6h1VarI12.h = "music";
                x6h1VarI12.a = "mobile-voting-page";
                x6h1VarI12.f = "1.0.0";
                x6h1VarI12.g = "22.0.0";
                this.b = x6h1VarI12.a();
                this.c = Collections.singletonList("voting/root");
                break;
            case 21:
                y6h1 y6h1Var13 = y6h1.i;
                x6h1 x6h1VarI13 = i3o1.i();
                x6h1VarI13.h = "music";
                x6h1VarI13.a = "mobile-voting-results-page";
                x6h1VarI13.f = "1.0.0";
                x6h1VarI13.g = "22.0.0";
                this.b = x6h1VarI13.a();
                this.c = Collections.singletonList("voting/results");
                break;
            case 22:
                y6h1 y6h1Var14 = y6h1.i;
                x6h1 x6h1VarI14 = i3o1.i();
                x6h1VarI14.h = "music";
                x6h1VarI14.a = "mobile-voting-share-page";
                x6h1VarI14.f = "1.0.0";
                x6h1VarI14.g = "22.0.0";
                this.b = x6h1VarI14.a();
                this.c = Collections.singletonList("voting/share");
                break;
            case 24:
                y6h1 y6h1Var15 = y6h1.i;
                x6h1 x6h1VarI15 = i3o1.i();
                x6h1VarI15.h = "music";
                x6h1VarI15.a = "mobile-widget-deprecation-educational-message";
                x6h1VarI15.f = "1.0.0";
                x6h1VarI15.g = "22.0.0";
                this.b = x6h1VarI15.a();
                this.c = Collections.singletonList("any");
                break;
            case 26:
                y6h1 y6h1Var16 = y6h1.i;
                x6h1 x6h1VarI16 = i3o1.i();
                x6h1VarI16.h = "music";
                x6h1VarI16.a = "mobile-your-addons";
                x6h1VarI16.f = "1.1.0";
                x6h1VarI16.g = "22.0.0";
                this.b = x6h1VarI16.a();
                this.c = Collections.singletonList("your-addons");
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                y6h1 y6h1Var17 = y6h1.i;
                x6h1 x6h1VarI17 = i3o1.i();
                x6h1VarI17.h = "music";
                x6h1VarI17.a = "mobile-your-library-page";
                x6h1VarI17.f = "9.3.0";
                x6h1VarI17.g = "22.0.0";
                x6h1VarI17.b = null;
                this.b = x6h1VarI17.a();
                this.c = Collections.singletonList("yourlibrary");
                break;
            case 28:
                y6h1 y6h1Var18 = y6h1.i;
                x6h1 x6h1VarI18 = i3o1.i();
                x6h1VarI18.h = "music";
                x6h1VarI18.a = "mobile-your-library-search-page";
                x6h1VarI18.f = "4.0.0";
                x6h1VarI18.g = "22.0.0";
                this.b = x6h1VarI18.a();
                this.c = Collections.singletonList("yourlibrary/search");
                break;
            case 29:
                y6h1 y6h1Var19 = y6h1.i;
                x6h1 x6h1VarI19 = i3o1.i();
                x6h1VarI19.h = "music";
                x6h1VarI19.a = "mobile-your-listening-highlight-details";
                x6h1VarI19.f = "2.1.0";
                x6h1VarI19.g = "22.0.0";
                this.b = x6h1VarI19.a();
                this.c = Collections.singletonList("listeningstats/highlight-details");
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                break;
            case 1:
                r6h1 r6h1Var2 = r6h1.c;
                break;
            case 2:
                r6h1 r6h1Var3 = r6h1.c;
                break;
            case 3:
                r6h1 r6h1Var4 = r6h1.c;
                break;
            case 4:
                r6h1 r6h1Var5 = r6h1.c;
                break;
            case 5:
                r6h1 r6h1Var6 = r6h1.c;
                break;
            case 6:
                r6h1 r6h1Var7 = r6h1.c;
                break;
            case 7:
                r6h1 r6h1Var8 = r6h1.c;
                break;
            case 8:
                r6h1 r6h1Var9 = r6h1.c;
                break;
            case 9:
                r6h1 r6h1Var10 = r6h1.c;
                break;
            case 10:
                r6h1 r6h1Var11 = r6h1.c;
                break;
            case 11:
                r6h1 r6h1Var12 = r6h1.c;
                break;
            case 12:
                r6h1 r6h1Var13 = r6h1.c;
                break;
            case 13:
                r6h1 r6h1Var14 = r6h1.c;
                break;
            case 14:
                r6h1 r6h1Var15 = r6h1.c;
                break;
            case 15:
                r6h1 r6h1Var16 = r6h1.c;
                break;
            case 16:
                r6h1 r6h1Var17 = r6h1.c;
                break;
            case 17:
                r6h1 r6h1Var18 = r6h1.c;
                break;
            case 18:
                r6h1 r6h1Var19 = r6h1.c;
                break;
            case 19:
                r6h1 r6h1Var20 = r6h1.c;
                break;
            case 20:
                r6h1 r6h1Var21 = r6h1.c;
                break;
            case 21:
                r6h1 r6h1Var22 = r6h1.c;
                break;
            case 22:
                r6h1 r6h1Var23 = r6h1.c;
                break;
            case 23:
                r6h1 r6h1Var24 = r6h1.c;
                break;
            case 24:
                r6h1 r6h1Var25 = r6h1.c;
                break;
            case 25:
                r6h1 r6h1Var26 = r6h1.c;
                break;
            case 26:
                r6h1 r6h1Var27 = r6h1.c;
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                r6h1 r6h1Var28 = r6h1.c;
                break;
            case 28:
                r6h1 r6h1Var29 = r6h1.c;
                break;
            default:
                r6h1 r6h1Var30 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }

    public qgl0 h() {
        return new qgl0(this);
    }

    public q5m0 i() {
        return new q5m0(this);
    }

    public h2m0 j() {
        return new h2m0(this);
    }

    public q3m0 k(Integer num, String str) {
        return new q3m0(num, str, this);
    }

    public brl0(String str, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 9:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-song-dna-blend-page";
                x6h1VarI.f = "4.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                x6h1VarI.d = str2;
                this.b = x6h1VarI.a();
                this.c = Collections.singletonList("blend-dna");
                break;
            case 19:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-users-nearby-invite";
                x6h1VarI2.f = "1.2.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.b = str;
                x6h1VarI2.d = str2;
                this.b = x6h1VarI2.a();
                this.c = Collections.singletonList("users_nearby");
                break;
            default:
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-song-dna-artist-page";
                x6h1VarI3.f = "3.0.0";
                x6h1VarI3.g = "22.0.0";
                x6h1VarI3.b = str;
                x6h1VarI3.d = str2;
                this.b = x6h1VarI3.a();
                this.c = Collections.singletonList("artists-dna");
                break;
        }
    }

    public brl0(String str, byte b) {
        this.a = b;
        switch (b) {
            case 10:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-song-dna-contributor-sheet";
                x6h1VarI.f = "2.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str;
                this.b = x6h1VarI.a();
                this.c = Collections.singletonList("song-dna-contributor");
                break;
            case 11:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-song-dna-search-bottom-sheet";
                x6h1VarI2.f = "4.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = str;
                this.b = x6h1VarI2.a();
                this.c = Collections.singletonList("song-dna/search");
                break;
            case 15:
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-transcript-selection-sharing";
                x6h1VarI3.f = "1.0.0";
                x6h1VarI3.g = "22.0.0";
                x6h1VarI3.d = str;
                this.b = x6h1VarI3.a();
                this.c = Collections.singletonList("readalong/share");
                break;
            case 16:
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-transcript-translation-selector";
                x6h1VarI4.f = "1.0.0";
                x6h1VarI4.g = "22.0.0";
                x6h1VarI4.d = str;
                this.b = x6h1VarI4.a();
                this.c = Collections.singletonList("readalong/languagepicker");
                break;
            case 18:
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-users-nearby-check-in";
                x6h1VarI5.f = "1.1.0";
                x6h1VarI5.g = "22.0.0";
                x6h1VarI5.b = str;
                this.b = x6h1VarI5.a();
                this.c = Collections.singletonList("users_nearby_check_in");
                break;
            case 25:
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI6 = i3o1.i();
                x6h1VarI6.h = "music";
                x6h1VarI6.a = "mobile-widget-npv-recommendations";
                x6h1VarI6.f = "7.2.0";
                x6h1VarI6.g = "22.0.0";
                x6h1VarI6.b = str;
                this.b = x6h1VarI6.a();
                this.c = Collections.singletonList("any");
                break;
            default:
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI7 = i3o1.i();
                x6h1VarI7.h = "music";
                x6h1VarI7.a = "mobile-recents";
                x6h1VarI7.f = "3.4.0";
                x6h1VarI7.g = "22.0.0";
                x6h1VarI7.b = str;
                this.b = x6h1VarI7.a();
                this.c = Collections.singletonList("recents");
                break;
        }
    }

    public brl0(String str, String str2, Integer num, String str3) {
        this.a = (byte) 23;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-watch-feed";
        x6h1VarI.f = "21.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.c = num;
        x6h1VarI.e = str2;
        x6h1VarI.d = str3;
        this.b = x6h1VarI.a();
        this.c = p7h.M(new String[]{"watchfeed", "watchfeed-wrapped"});
    }
}
