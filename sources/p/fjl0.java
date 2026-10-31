package p;

import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fjl0 implements w6h1 {
    public final /* synthetic */ byte a;
    public final r6h1 b;
    public final y6h1 c;

    public fjl0(r6h1 r6h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-playlist-added-by-user-attribution";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                this.c = x6h1VarI.a();
                break;
            case 2:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-playlist-change-artwork-element";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                this.c = x6h1VarI2.a();
                break;
            case 3:
                this.b = r6h1Var;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-playlist-entity-before-track-list";
                x6h1VarI3.f = "11.0.0";
                x6h1VarI3.g = "22.0.0";
                this.c = x6h1VarI3.a();
                break;
            case 4:
                this.b = r6h1Var;
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-playlist-entity-concert-near-you";
                x6h1VarI4.f = "7.0.1";
                x6h1VarI4.g = "22.0.0";
                this.c = x6h1VarI4.a();
                break;
            case 5:
                this.b = r6h1Var;
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-playlist-entity-curation-actions";
                x6h1VarI5.f = "4.3.0";
                x6h1VarI5.g = "22.0.0";
                this.c = x6h1VarI5.a();
                break;
            case 6:
                this.b = r6h1Var;
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI6 = i3o1.i();
                x6h1VarI6.h = "music";
                x6h1VarI6.a = "mobile-playlist-entity-deeplinking";
                x6h1VarI6.f = "1.0.0";
                x6h1VarI6.g = "22.0.0";
                this.c = x6h1VarI6.a();
                break;
            case 7:
                this.b = r6h1Var;
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI7 = i3o1.i();
                x6h1VarI7.h = "music";
                x6h1VarI7.a = "mobile-playlist-entity-dialogs-confirm-deletion";
                x6h1VarI7.f = "3.0.0";
                x6h1VarI7.g = "22.0.0";
                this.c = x6h1VarI7.a();
                break;
            case 8:
                this.b = r6h1Var;
                y6h1 y6h1Var8 = y6h1.i;
                x6h1 x6h1VarI8 = i3o1.i();
                x6h1VarI8.h = "music";
                x6h1VarI8.a = "mobile-playlist-entity-header-actions";
                x6h1VarI8.f = "8.1.0";
                x6h1VarI8.g = "22.0.0";
                this.c = x6h1VarI8.a();
                break;
            case 9:
                this.b = r6h1Var;
                y6h1 y6h1Var9 = y6h1.i;
                x6h1 x6h1VarI9 = i3o1.i();
                x6h1VarI9.h = "music";
                x6h1VarI9.a = "mobile-playlist-entity-header-artwork";
                x6h1VarI9.f = "2.0.0";
                x6h1VarI9.g = "22.0.0";
                this.c = x6h1VarI9.a();
                break;
            case 10:
                this.b = r6h1Var;
                y6h1 y6h1Var10 = y6h1.i;
                x6h1 x6h1VarI10 = i3o1.i();
                x6h1VarI10.h = "music";
                x6h1VarI10.a = "mobile-playlist-entity-header-description-field";
                x6h1VarI10.f = "3.1.0";
                x6h1VarI10.g = "22.0.0";
                this.c = x6h1VarI10.a();
                break;
            case 11:
                this.b = r6h1Var;
                y6h1 y6h1Var11 = y6h1.i;
                x6h1 x6h1VarI11 = i3o1.i();
                x6h1VarI11.h = "music";
                x6h1VarI11.a = "mobile-playlist-entity-localfiles-openwith";
                x6h1VarI11.f = "3.0.0";
                x6h1VarI11.g = "22.0.0";
                this.c = x6h1VarI11.a();
                break;
            case 12:
                this.b = r6h1Var;
                y6h1 y6h1Var12 = y6h1.i;
                x6h1 x6h1VarI12 = i3o1.i();
                x6h1VarI12.h = "music";
                x6h1VarI12.a = "mobile-playlist-entity-mixing-context-menu-items";
                x6h1VarI12.f = "2.1.0";
                x6h1VarI12.g = "22.0.0";
                this.c = x6h1VarI12.a();
                break;
            case 13:
                this.b = r6h1Var;
                y6h1 y6h1Var13 = y6h1.i;
                x6h1 x6h1VarI13 = i3o1.i();
                x6h1VarI13.h = "music";
                x6h1VarI13.a = "mobile-playlist-entity-music-videos-see-all";
                x6h1VarI13.f = "2.0.0";
                x6h1VarI13.g = "22.0.0";
                this.c = x6h1VarI13.a();
                break;
            case 14:
                this.b = r6h1Var;
                y6h1 y6h1Var14 = y6h1.i;
                x6h1 x6h1VarI14 = i3o1.i();
                x6h1VarI14.h = "music";
                x6h1VarI14.a = "mobile-playlist-entity-reactions-button";
                x6h1VarI14.f = "1.0.0";
                x6h1VarI14.g = "22.0.0";
                this.c = x6h1VarI14.a();
                break;
            case 15:
                this.b = r6h1Var;
                y6h1 y6h1Var15 = y6h1.i;
                x6h1 x6h1VarI15 = i3o1.i();
                x6h1VarI15.h = "music";
                x6h1VarI15.a = "mobile-playlist-entity-sort-items";
                x6h1VarI15.f = "2.0.0";
                x6h1VarI15.g = "22.0.0";
                this.c = x6h1VarI15.a();
                break;
            case 16:
                this.b = r6h1Var;
                y6h1 y6h1Var16 = y6h1.i;
                x6h1 x6h1VarI16 = i3o1.i();
                x6h1VarI16.h = "music";
                x6h1VarI16.a = "mobile-playlist-entity-speed-control-context-menu-items";
                x6h1VarI16.f = "1.1.0";
                x6h1VarI16.g = "22.0.0";
                this.c = x6h1VarI16.a();
                break;
            case 17:
                this.b = r6h1Var;
                y6h1 y6h1Var17 = y6h1.i;
                x6h1 x6h1VarI17 = i3o1.i();
                x6h1VarI17.h = "music";
                x6h1VarI17.a = "mobile-playlist-entity-story-header";
                x6h1VarI17.f = "2.2.0";
                x6h1VarI17.g = "22.0.0";
                this.c = x6h1VarI17.a();
                break;
            case 18:
                this.b = r6h1Var;
                y6h1 y6h1Var18 = y6h1.i;
                x6h1 x6h1VarI18 = i3o1.i();
                x6h1VarI18.h = "music";
                x6h1VarI18.a = "mobile-playlist-join-playlist-button";
                x6h1VarI18.f = "1.0.0";
                x6h1VarI18.g = "22.0.0";
                this.c = x6h1VarI18.a();
                break;
            case 19:
                this.b = r6h1Var;
                y6h1 y6h1Var19 = y6h1.i;
                x6h1 x6h1VarI19 = i3o1.i();
                x6h1VarI19.h = "music";
                x6h1VarI19.a = "mobile-playlist-messaging";
                x6h1VarI19.f = "1.0.0";
                x6h1VarI19.g = "22.0.0";
                this.c = x6h1VarI19.a();
                break;
            case 20:
                this.b = r6h1Var;
                y6h1 y6h1Var20 = y6h1.i;
                x6h1 x6h1VarI20 = i3o1.i();
                x6h1VarI20.h = "music";
                x6h1VarI20.a = "mobile-playlist-mixing-education";
                x6h1VarI20.f = "1.0.0";
                x6h1VarI20.g = "22.0.0";
                this.c = x6h1VarI20.a();
                break;
            case 21:
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var21 = y6h1.i;
                x6h1 x6h1VarI21 = i3o1.i();
                x6h1VarI21.h = "music";
                x6h1VarI21.a = "mobile-nowplaying-upsell-smart-shuffle-button";
                x6h1VarI21.f = "1.0.0";
                x6h1VarI21.g = "22.0.0";
                this.c = x6h1VarI21.a();
                break;
            case 22:
                this.b = r6h1Var;
                y6h1 y6h1Var22 = y6h1.i;
                x6h1 x6h1VarI22 = i3o1.i();
                x6h1VarI22.h = "music";
                x6h1VarI22.a = "mobile-playlist-select-bottom-actions";
                x6h1VarI22.f = "1.0.0";
                x6h1VarI22.g = "22.0.0";
                this.c = x6h1VarI22.a();
                break;
            case 23:
                this.b = r6h1Var;
                y6h1 y6h1Var23 = y6h1.i;
                x6h1 x6h1VarI23 = i3o1.i();
                x6h1VarI23.h = "music";
                x6h1VarI23.a = "mobile-playlist-this-is-artist-artist-row";
                x6h1VarI23.f = "1.0.0";
                x6h1VarI23.g = "22.0.0";
                this.c = x6h1VarI23.a();
                break;
            case 24:
                this.b = r6h1Var;
                y6h1 y6h1Var24 = y6h1.i;
                x6h1 x6h1VarI24 = i3o1.i();
                x6h1VarI24.h = "music";
                x6h1VarI24.a = "mobile-podcast-about";
                x6h1VarI24.f = "1.0.0";
                x6h1VarI24.g = "22.0.0";
                this.c = x6h1VarI24.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var.b);
            case 2:
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var.b);
            case 3:
                r6h1 r6h1Var5 = r6h1.c;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var.b);
            case 4:
                r6h1 r6h1Var6 = r6h1.c;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var.b);
            case 5:
                r6h1 r6h1Var7 = r6h1.c;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(r6h1Var.a);
                arrayList6.add(y6h1Var);
                return new r6h1(arrayList6, r6h1Var.b);
            case 6:
                r6h1 r6h1Var8 = r6h1.c;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(r6h1Var.a);
                arrayList7.add(y6h1Var);
                return new r6h1(arrayList7, r6h1Var.b);
            case 7:
                r6h1 r6h1Var9 = r6h1.c;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.addAll(r6h1Var.a);
                arrayList8.add(y6h1Var);
                return new r6h1(arrayList8, r6h1Var.b);
            case 8:
                r6h1 r6h1Var10 = r6h1.c;
                ArrayList arrayList9 = new ArrayList();
                arrayList9.addAll(r6h1Var.a);
                arrayList9.add(y6h1Var);
                return new r6h1(arrayList9, r6h1Var.b);
            case 9:
                r6h1 r6h1Var11 = r6h1.c;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(r6h1Var.a);
                arrayList10.add(y6h1Var);
                return new r6h1(arrayList10, r6h1Var.b);
            case 10:
                r6h1 r6h1Var12 = r6h1.c;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(r6h1Var.a);
                arrayList11.add(y6h1Var);
                return new r6h1(arrayList11, r6h1Var.b);
            case 11:
                r6h1 r6h1Var13 = r6h1.c;
                ArrayList arrayList12 = new ArrayList();
                arrayList12.addAll(r6h1Var.a);
                arrayList12.add(y6h1Var);
                return new r6h1(arrayList12, r6h1Var.b);
            case 12:
                r6h1 r6h1Var14 = r6h1.c;
                ArrayList arrayList13 = new ArrayList();
                arrayList13.addAll(r6h1Var.a);
                arrayList13.add(y6h1Var);
                return new r6h1(arrayList13, r6h1Var.b);
            case 13:
                r6h1 r6h1Var15 = r6h1.c;
                ArrayList arrayList14 = new ArrayList();
                arrayList14.addAll(r6h1Var.a);
                arrayList14.add(y6h1Var);
                return new r6h1(arrayList14, r6h1Var.b);
            case 14:
                r6h1 r6h1Var16 = r6h1.c;
                ArrayList arrayList15 = new ArrayList();
                arrayList15.addAll(r6h1Var.a);
                arrayList15.add(y6h1Var);
                return new r6h1(arrayList15, r6h1Var.b);
            case 15:
                r6h1 r6h1Var17 = r6h1.c;
                ArrayList arrayList16 = new ArrayList();
                arrayList16.addAll(r6h1Var.a);
                arrayList16.add(y6h1Var);
                return new r6h1(arrayList16, r6h1Var.b);
            case 16:
                r6h1 r6h1Var18 = r6h1.c;
                ArrayList arrayList17 = new ArrayList();
                arrayList17.addAll(r6h1Var.a);
                arrayList17.add(y6h1Var);
                return new r6h1(arrayList17, r6h1Var.b);
            case 17:
                r6h1 r6h1Var19 = r6h1.c;
                ArrayList arrayList18 = new ArrayList();
                arrayList18.addAll(r6h1Var.a);
                arrayList18.add(y6h1Var);
                return new r6h1(arrayList18, r6h1Var.b);
            case 18:
                r6h1 r6h1Var20 = r6h1.c;
                ArrayList arrayList19 = new ArrayList();
                arrayList19.addAll(r6h1Var.a);
                arrayList19.add(y6h1Var);
                return new r6h1(arrayList19, r6h1Var.b);
            case 19:
                r6h1 r6h1Var21 = r6h1.c;
                ArrayList arrayList20 = new ArrayList();
                arrayList20.addAll(r6h1Var.a);
                arrayList20.add(y6h1Var);
                return new r6h1(arrayList20, r6h1Var.b);
            case 20:
                r6h1 r6h1Var22 = r6h1.c;
                ArrayList arrayList21 = new ArrayList();
                arrayList21.addAll(r6h1Var.a);
                arrayList21.add(y6h1Var);
                return new r6h1(arrayList21, r6h1Var.b);
            case 21:
                r6h1 r6h1Var23 = r6h1.c;
                ArrayList arrayList22 = new ArrayList();
                arrayList22.addAll(r6h1Var.a);
                arrayList22.add(y6h1Var);
                return new r6h1(arrayList22, r6h1Var.b);
            case 22:
                r6h1 r6h1Var24 = r6h1.c;
                ArrayList arrayList23 = new ArrayList();
                arrayList23.addAll(r6h1Var.a);
                arrayList23.add(y6h1Var);
                return new r6h1(arrayList23, r6h1Var.b);
            case 23:
                r6h1 r6h1Var25 = r6h1.c;
                ArrayList arrayList24 = new ArrayList();
                arrayList24.addAll(r6h1Var.a);
                arrayList24.add(y6h1Var);
                return new r6h1(arrayList24, r6h1Var.b);
            case 24:
                r6h1 r6h1Var26 = r6h1.c;
                ArrayList arrayList25 = new ArrayList();
                arrayList25.addAll(r6h1Var.a);
                arrayList25.add(y6h1Var);
                return new r6h1(arrayList25, r6h1Var.b);
            case 25:
                r6h1 r6h1Var27 = r6h1.c;
                ArrayList arrayList26 = new ArrayList();
                arrayList26.addAll(r6h1Var.a);
                arrayList26.add(y6h1Var);
                return new r6h1(arrayList26, r6h1Var.b);
            case 26:
                r6h1 r6h1Var28 = r6h1.c;
                ArrayList arrayList27 = new ArrayList();
                arrayList27.addAll(r6h1Var.a);
                arrayList27.add(y6h1Var);
                return new r6h1(arrayList27, r6h1Var.b);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                r6h1 r6h1Var29 = r6h1.c;
                ArrayList arrayList28 = new ArrayList();
                arrayList28.addAll(r6h1Var.a);
                arrayList28.add(y6h1Var);
                return new r6h1(arrayList28, r6h1Var.b);
            case 28:
                r6h1 r6h1Var30 = r6h1.c;
                ArrayList arrayList29 = new ArrayList();
                arrayList29.addAll(r6h1Var.a);
                arrayList29.add(y6h1Var);
                return new r6h1(arrayList29, r6h1Var.b);
            default:
                r6h1 r6h1Var31 = r6h1.c;
                ArrayList arrayList30 = new ArrayList();
                arrayList30.addAll(r6h1Var.a);
                arrayList30.add(y6h1Var);
                return new r6h1(arrayList30, r6h1Var.b);
        }
    }

    public w7h1 e(String str) {
        return new w7h1("", "", new z7h1("auto", 1, b7x.a), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), this.c, this.b, System.currentTimeMillis());
    }

    public fjl0(String str, String str2, r6h1 r6h1Var) {
        this.a = (byte) 29;
        this.b = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-podcastepisode-guest-chips";
        x6h1VarI.f = "4.0.1";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.d = str2;
        this.c = x6h1VarI.a();
    }

    public fjl0(String str) {
        this.a = (byte) 25;
        this.b = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-podcast-findinshow";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        this.c = x6h1VarI.a();
    }

    public fjl0(String str, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 26:
                this.b = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-podcast-new-episode-notifications-settings";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                x6h1VarI.d = str2;
                this.c = x6h1VarI.a();
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                this.b = r6h1.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-podcast-receiver-snackbar";
                x6h1VarI2.f = "0.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.b = str;
                x6h1VarI2.d = str2;
                this.c = x6h1VarI2.a();
                break;
            case 28:
                this.b = r6h1.c;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-podcast-share-card";
                x6h1VarI3.f = "1.0.0";
                x6h1VarI3.g = "22.0.0";
                x6h1VarI3.b = str;
                x6h1VarI3.d = str2;
                this.c = x6h1VarI3.a();
                break;
            default:
                this.b = r6h1.c;
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-playlist-permissions-claim-dialog";
                x6h1VarI4.f = "1.1.1";
                x6h1VarI4.g = "22.0.0";
                x6h1VarI4.b = str;
                x6h1VarI4.d = str2;
                this.c = x6h1VarI4.a();
                break;
        }
    }
}
