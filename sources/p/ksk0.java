package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ksk0 implements t9h1, v8h1 {
    public final /* synthetic */ byte a;
    public final r6h1 b;
    public final y6h1 c;
    public final List d;
    public static final u8h1 e = new u8h1(new v9r0("assisted-curation"));
    public static final u8h1 f = new u8h1(new v9r0("chat/members"));
    public static final u8h1 g = new u8h1(new v9r0("cover-art/snake"));
    public static final u8h1 h = new u8h1(new v9r0("playlist/create"));
    public static final u8h1 i = new u8h1(new v9r0("playlist/edit-coverart"));
    public static final u8h1 j = new u8h1(new v9r0("kids/graduation/education"));
    public static final u8h1 k = new u8h1(new v9r0("kids/graduation/postponed"));
    public static final u8h1 l = new u8h1(new v9r0("kids/graduation/supervision"));
    public static final u8h1 m = new u8h1(new v9r0("kids/graduation/terms"));
    public static final u8h1 n = new u8h1(new v9r0("kids/transition/consent"));
    public static final u8h1 o = new u8h1(new v9r0("parental-control/login-current-device"));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u8h1 f17p = new u8h1(new v9r0("parental-control/login-different-device"));
    public static final u8h1 q = new u8h1(new v9r0("parental-control/update-birthday"));
    public static final u8h1 r = new u8h1(new v9r0("parental-control/update-name"));
    public static final u8h1 s = new u8h1(new v9r0("playlist/image-picker"));
    public static final u8h1 t = new u8h1(new v9r0("concerts/gallery"));
    public static final u8h1 u = new u8h1(new v9r0("concerts"));
    public static final u8h1 v = new u8h1(new v9r0("concerts/search"));
    public static final u8h1 w = new u8h1(new v9r0("now-playing/playback-timeout"));
    public static final u8h1 x = new u8h1(new v9r0("profile/privacy-settings"));
    public static final u8h1 y = new u8h1(new v9r0("settings/search"));
    public static final u8h1 z = new u8h1(new v9r0("upcoming-releases"));
    public static final u8h1 A = new u8h1(new v9r0("settings/account"));
    public static final u8h1 B = new u8h1(new v9r0("concerts/venue"));
    public static final u8h1 C = new u8h1(new v9r0("premium/overview"));

    public ksk0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                r6h1 r6h1Var = r6h1.c;
                this.b = new r6h1(new ArrayList(), f);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-chat-members";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                this.c = x6h1VarI.a();
                this.d = Collections.singletonList("chat/members");
                break;
            case 2:
            case 3:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 22:
            case 23:
            default:
                r6h1 r6h1Var2 = r6h1.c;
                this.b = new r6h1(new ArrayList(), e);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-assisted-curation";
                x6h1VarI2.f = "10.4.0";
                x6h1VarI2.g = "22.0.0";
                this.c = x6h1VarI2.a();
                this.d = Collections.singletonList("assisted-curation");
                break;
            case 4:
                r6h1 r6h1Var3 = r6h1.c;
                this.b = new r6h1(new ArrayList(), i);
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-edit-playlist-cover-art";
                x6h1VarI3.f = "2.2.0";
                x6h1VarI3.g = "22.0.0";
                this.c = x6h1VarI3.a();
                this.d = Collections.singletonList("playlist/edit-coverart");
                break;
            case 5:
                r6h1 r6h1Var4 = r6h1.c;
                this.b = new r6h1(new ArrayList(), j);
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-gen-alpha-graduation-education";
                x6h1VarI4.f = "2.0.0";
                x6h1VarI4.g = "22.0.0";
                this.c = x6h1VarI4.a();
                this.d = Collections.singletonList("graduation/education");
                break;
            case 6:
                r6h1 r6h1Var5 = r6h1.c;
                this.b = new r6h1(new ArrayList(), k);
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-gen-alpha-graduation-postponed";
                x6h1VarI5.f = "2.0.0";
                x6h1VarI5.g = "22.0.0";
                this.c = x6h1VarI5.a();
                this.d = Collections.singletonList("graduation/postponed");
                break;
            case 7:
                r6h1 r6h1Var6 = r6h1.c;
                this.b = new r6h1(new ArrayList(), l);
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI6 = i3o1.i();
                x6h1VarI6.h = "music";
                x6h1VarI6.a = "mobile-gen-alpha-graduation-supervision";
                x6h1VarI6.f = "2.1.0";
                x6h1VarI6.g = "22.0.0";
                this.c = x6h1VarI6.a();
                this.d = Collections.singletonList("graduation/supervision");
                break;
            case 8:
                r6h1 r6h1Var7 = r6h1.c;
                this.b = new r6h1(new ArrayList(), m);
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI7 = i3o1.i();
                x6h1VarI7.h = "music";
                x6h1VarI7.a = "mobile-gen-alpha-graduation-terms";
                x6h1VarI7.f = "2.0.0";
                x6h1VarI7.g = "22.0.0";
                this.c = x6h1VarI7.a();
                this.d = Collections.singletonList("graduation/terms");
                break;
            case 9:
                r6h1 r6h1Var8 = r6h1.c;
                this.b = new r6h1(new ArrayList(), n);
                y6h1 y6h1Var8 = y6h1.i;
                x6h1 x6h1VarI8 = i3o1.i();
                x6h1VarI8.h = "music";
                x6h1VarI8.a = "mobile-gen-alpha-kid-account-transition-consent";
                x6h1VarI8.f = "3.2.0";
                x6h1VarI8.g = "22.0.0";
                this.c = x6h1VarI8.a();
                this.d = Collections.singletonList("kid-account-transition/consent");
                break;
            case 10:
                r6h1 r6h1Var9 = r6h1.c;
                this.b = new r6h1(new ArrayList(), o);
                y6h1 y6h1Var9 = y6h1.i;
                x6h1 x6h1VarI9 = i3o1.i();
                x6h1VarI9.h = "music";
                x6h1VarI9.a = "mobile-gen-alpha-parental-control-login-current-device";
                x6h1VarI9.f = "2.0.0";
                x6h1VarI9.g = "22.0.0";
                this.c = x6h1VarI9.a();
                this.d = Collections.singletonList("parental-control/login-current-device");
                break;
            case 11:
                r6h1 r6h1Var10 = r6h1.c;
                this.b = new r6h1(new ArrayList(), f17p);
                y6h1 y6h1Var10 = y6h1.i;
                x6h1 x6h1VarI10 = i3o1.i();
                x6h1VarI10.h = "music";
                x6h1VarI10.a = "mobile-gen-alpha-parental-control-login-different-device";
                x6h1VarI10.f = "2.0.0";
                x6h1VarI10.g = "22.0.0";
                this.c = x6h1VarI10.a();
                this.d = Collections.singletonList("parental-control/login-different-device");
                break;
            case 12:
                r6h1 r6h1Var11 = r6h1.c;
                this.b = new r6h1(new ArrayList(), q);
                y6h1 y6h1Var11 = y6h1.i;
                x6h1 x6h1VarI11 = i3o1.i();
                x6h1VarI11.h = "music";
                x6h1VarI11.a = "mobile-gen-alpha-parental-control-update-birthday";
                x6h1VarI11.f = "2.1.0";
                x6h1VarI11.g = "22.0.0";
                this.c = x6h1VarI11.a();
                this.d = Collections.singletonList("parental-control/update-birthday");
                break;
            case 13:
                r6h1 r6h1Var12 = r6h1.c;
                this.b = new r6h1(new ArrayList(), r);
                y6h1 y6h1Var12 = y6h1.i;
                x6h1 x6h1VarI12 = i3o1.i();
                x6h1VarI12.h = "music";
                x6h1VarI12.a = "mobile-gen-alpha-parental-control-update-name";
                x6h1VarI12.f = "2.1.0";
                x6h1VarI12.g = "22.0.0";
                this.c = x6h1VarI12.a();
                this.d = Collections.singletonList("parental-control/update-name");
                break;
            case 19:
                r6h1 r6h1Var13 = r6h1.c;
                this.b = new r6h1(new ArrayList(), x);
                y6h1 y6h1Var13 = y6h1.i;
                x6h1 x6h1VarI13 = i3o1.i();
                x6h1VarI13.h = "music";
                x6h1VarI13.a = "mobile-profile-privacy-settings";
                x6h1VarI13.f = "2.1.0";
                x6h1VarI13.g = "22.0.0";
                this.c = x6h1VarI13.a();
                this.d = Collections.singletonList("profile/privacy-settings");
                break;
            case 20:
                r6h1 r6h1Var14 = r6h1.c;
                this.b = new r6h1(new ArrayList(), y);
                y6h1 y6h1Var14 = y6h1.i;
                x6h1 x6h1VarI14 = i3o1.i();
                x6h1VarI14.h = "music";
                x6h1VarI14.a = "mobile-settings-search";
                x6h1VarI14.f = "2.1.0";
                x6h1VarI14.g = "22.0.0";
                this.c = x6h1VarI14.a();
                this.d = Collections.singletonList("settings/search");
                break;
            case 21:
                r6h1 r6h1Var15 = r6h1.c;
                this.b = new r6h1(new ArrayList(), z);
                y6h1 y6h1Var15 = y6h1.i;
                x6h1 x6h1VarI15 = i3o1.i();
                x6h1VarI15.h = "music";
                x6h1VarI15.a = "mobile-upcoming-hub";
                x6h1VarI15.f = "2.1.0";
                x6h1VarI15.g = "22.0.0";
                this.c = x6h1VarI15.a();
                this.d = Collections.singletonList("upcoming-releases");
                break;
            case 24:
                r6h1 r6h1Var16 = r6h1.c;
                this.b = new r6h1(new ArrayList(), C);
                y6h1 y6h1Var16 = y6h1.i;
                x6h1 x6h1VarI16 = i3o1.i();
                x6h1VarI16.h = "music";
                x6h1VarI16.a = "mobile-your-premium-page";
                x6h1VarI16.f = "3.3.1";
                x6h1VarI16.g = "22.0.0";
                this.c = x6h1VarI16.a();
                this.d = Collections.singletonList("your-premium");
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
            default:
                r6h1 r6h1Var26 = r6h1.c;
                ArrayList arrayList25 = new ArrayList();
                arrayList25.addAll(r6h1Var.a);
                arrayList25.add(y6h1Var);
                return new r6h1(arrayList25, r6h1Var.b);
        }
    }

    public z2m0 e() {
        return new z2m0(this, (byte) 0);
    }

    public z2m0 h(String str) {
        return new z2m0(this, str);
    }

    public sqk0 i(String str) {
        return new sqk0(this, str);
    }

    public z2m0 j() {
        return new z2m0(this, (byte) 2);
    }

    public z2m0 k() {
        return new z2m0(this, (byte) 3);
    }

    public ksk0(String str, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 16:
                r6h1 r6h1Var = r6h1.c;
                this.b = new r6h1(new ArrayList(), u);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-liveevents-hub";
                x6h1VarI.f = "7.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                x6h1VarI.d = str2;
                this.c = x6h1VarI.a();
                this.d = Collections.singletonList("concerts");
                break;
            case 17:
                r6h1 r6h1Var2 = r6h1.c;
                this.b = new r6h1(new ArrayList(), v);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-liveevents-locationsearch";
                x6h1VarI2.f = "5.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.b = str;
                x6h1VarI2.d = str2;
                this.c = x6h1VarI2.a();
                this.d = Collections.singletonList("concerts/search");
                break;
            case 22:
                r6h1 r6h1Var3 = r6h1.c;
                this.b = new r6h1(new ArrayList(), A);
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-user-account-page";
                x6h1VarI3.f = "3.0.0";
                x6h1VarI3.g = "22.0.0";
                x6h1VarI3.b = str;
                x6h1VarI3.d = str2;
                this.c = x6h1VarI3.a();
                this.d = Collections.singletonList("settings/account");
                break;
            case 23:
                r6h1 r6h1Var4 = r6h1.c;
                this.b = new r6h1(new ArrayList(), B);
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-venue-entity";
                x6h1VarI4.f = "1.3.0";
                x6h1VarI4.g = "22.0.0";
                x6h1VarI4.b = str;
                x6h1VarI4.d = str2;
                this.c = x6h1VarI4.a();
                this.d = Collections.singletonList("venue");
                break;
            default:
                r6h1 r6h1Var5 = r6h1.c;
                this.b = new r6h1(new ArrayList(), g);
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-cover-art-snake";
                x6h1VarI5.f = "2.1.0";
                x6h1VarI5.g = "22.0.0";
                x6h1VarI5.b = str;
                x6h1VarI5.d = str2;
                this.c = x6h1VarI5.a();
                this.d = Collections.singletonList("playlist/cover-art-snake");
                break;
        }
    }

    public ksk0(String str, byte b) {
        this.a = b;
        switch (b) {
            case 14:
                r6h1 r6h1Var = r6h1.c;
                this.b = new r6h1(new ArrayList(), s);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-image-picker";
                x6h1VarI.f = "2.2.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                this.c = x6h1VarI.a();
                this.d = Collections.singletonList("image-picker");
                break;
            case 15:
                r6h1 r6h1Var2 = r6h1.c;
                this.b = new r6h1(new ArrayList(), t);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-liveevents-concertgallery";
                x6h1VarI2.f = "2.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = str;
                this.c = x6h1VarI2.a();
                this.d = Collections.singletonList("concert-gallery");
                break;
            default:
                r6h1 r6h1Var3 = r6h1.c;
                this.b = new r6h1(new ArrayList(), h);
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-create-playlist";
                x6h1VarI3.f = "6.2.0";
                x6h1VarI3.g = "22.0.0";
                x6h1VarI3.b = str;
                this.c = x6h1VarI3.a();
                this.d = Collections.singletonList("playlist/create");
                break;
        }
    }

    public ksk0(int i2) {
        String str;
        this.a = (byte) 18;
        r6h1 r6h1Var = r6h1.c;
        this.b = new r6h1(new ArrayList(), w);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-offline-playback-timeout-dead-ends";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        if (i2 == 1) {
            str = "playback_start_slow";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "playback_stuck";
        }
        x6h1VarI.e = str;
        this.c = x6h1VarI.a();
        this.d = Collections.singletonList("now-playing/playback-timeout");
    }
}
