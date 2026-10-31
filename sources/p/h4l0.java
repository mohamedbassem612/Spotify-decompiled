package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h4l0 implements w6h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final List c;

    public h4l0(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-gen-alpha-accountclosure";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                this.b = x6h1VarI.a();
                this.c = Collections.singletonList("childaccountclosure");
                break;
            case 3:
                r6h1 r6h1Var2 = r6h1.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-gen-alpha-age-assurance-request-parental-consent";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                this.b = x6h1VarI2.a();
                this.c = Collections.singletonList("age-assurance/request-parental-consent");
                break;
            case 4:
                r6h1 r6h1Var3 = r6h1.c;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-gen-alpha-child-led-signup-share-parental-consent";
                x6h1VarI3.f = "1.2.0";
                x6h1VarI3.g = "22.0.0";
                this.b = x6h1VarI3.a();
                this.c = p7h.M(new String[]{"child-led-signup/share-parental-consent", "age-assurance/share-parental-consent"});
                break;
            case 5:
                r6h1 r6h1Var4 = r6h1.c;
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-gen-alpha-graduation-rejected";
                x6h1VarI4.f = "1.0.0";
                x6h1VarI4.g = "22.0.0";
                this.b = x6h1VarI4.a();
                this.c = Collections.singletonList("graduation/rejected");
                break;
            case 6:
                r6h1 r6h1Var5 = r6h1.c;
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-gen-alpha-graduation-requested";
                x6h1VarI5.f = "1.0.0";
                x6h1VarI5.g = "22.0.0";
                this.b = x6h1VarI5.a();
                this.c = Collections.singletonList("graduation/requested");
                break;
            case 7:
                r6h1 r6h1Var6 = r6h1.c;
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI6 = i3o1.i();
                x6h1VarI6.h = "music";
                x6h1VarI6.a = "mobile-signup-birthday-confirmation-modal";
                x6h1VarI6.f = "2.0.0";
                x6h1VarI6.g = "22.0.0";
                this.b = x6h1VarI6.a();
                this.c = Collections.singletonList("signup/ageconfirmation");
                break;
            case 8:
                r6h1 r6h1Var7 = r6h1.c;
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI7 = i3o1.i();
                x6h1VarI7.h = "music";
                x6h1VarI7.a = "mobile-signup-country-picker-screen";
                x6h1VarI7.f = "0.1.0";
                x6h1VarI7.g = "22.0.0";
                this.b = x6h1VarI7.a();
                this.c = Collections.singletonList("phonenumber/callingcodepicker");
                break;
            case 9:
                r6h1 r6h1Var8 = r6h1.c;
                y6h1 y6h1Var8 = y6h1.i;
                x6h1 x6h1VarI8 = i3o1.i();
                x6h1VarI8.h = "music";
                x6h1VarI8.a = "mobile-signup-displayname-screen";
                x6h1VarI8.f = "2.0.0";
                x6h1VarI8.g = "22.0.0";
                this.b = x6h1VarI8.a();
                this.c = Collections.singletonList("signup/displayname");
                break;
            case 10:
                r6h1 r6h1Var9 = r6h1.c;
                y6h1 y6h1Var9 = y6h1.i;
                x6h1 x6h1VarI9 = i3o1.i();
                x6h1VarI9.h = "music";
                x6h1VarI9.a = "mobile-signup-email-dob-screen";
                x6h1VarI9.f = "2.0.0";
                x6h1VarI9.g = "22.0.0";
                this.b = x6h1VarI9.a();
                this.c = Collections.singletonList("signup/birthday");
                break;
            case 11:
                r6h1 r6h1Var10 = r6h1.c;
                y6h1 y6h1Var10 = y6h1.i;
                x6h1 x6h1VarI10 = i3o1.i();
                x6h1VarI10.h = "music";
                x6h1VarI10.a = "mobile-signup-email-password-screen";
                x6h1VarI10.f = "2.0.0";
                x6h1VarI10.g = "22.0.0";
                this.b = x6h1VarI10.a();
                this.c = Collections.singletonList("signup/password");
                break;
            case 12:
                r6h1 r6h1Var11 = r6h1.c;
                y6h1 y6h1Var11 = y6h1.i;
                x6h1 x6h1VarI11 = i3o1.i();
                x6h1VarI11.h = "music";
                x6h1VarI11.a = "mobile-signup-email-screen";
                x6h1VarI11.f = "2.0.0";
                x6h1VarI11.g = "22.0.0";
                this.b = x6h1VarI11.a();
                this.c = Collections.singletonList("signup/email");
                break;
            case 13:
            default:
                r6h1 r6h1Var12 = r6h1.c;
                y6h1 y6h1Var12 = y6h1.i;
                x6h1 x6h1VarI12 = i3o1.i();
                x6h1VarI12.h = "music";
                x6h1VarI12.a = "mobile-email-authentication-validate-otp";
                x6h1VarI12.f = "0.1.0";
                x6h1VarI12.g = "22.0.0";
                this.b = x6h1VarI12.a();
                this.c = Collections.singletonList("emailauthentication/validateotp");
                break;
            case 14:
                r6h1 r6h1Var13 = r6h1.c;
                y6h1 y6h1Var13 = y6h1.i;
                x6h1 x6h1VarI13 = i3o1.i();
                x6h1VarI13.h = "music";
                x6h1VarI13.a = "mobile-signup-gender-selection-screen";
                x6h1VarI13.f = "2.0.0";
                x6h1VarI13.g = "22.0.0";
                this.b = x6h1VarI13.a();
                this.c = Collections.singletonList("signup/gender");
                break;
            case 15:
                r6h1 r6h1Var14 = r6h1.c;
                y6h1 y6h1Var14 = y6h1.i;
                x6h1 x6h1VarI14 = i3o1.i();
                x6h1VarI14.h = "music";
                x6h1VarI14.a = "mobile-signup-phone-number-screen";
                x6h1VarI14.f = "0.1.0";
                x6h1VarI14.g = "22.0.0";
                this.b = x6h1VarI14.a();
                this.c = Collections.singletonList("phonenumber/phonenumberentry");
                break;
            case 16:
                r6h1 r6h1Var15 = r6h1.c;
                y6h1 y6h1Var15 = y6h1.i;
                x6h1 x6h1VarI15 = i3o1.i();
                x6h1VarI15.h = "music";
                x6h1VarI15.a = "mobile-signup-validate-otp-screen";
                x6h1VarI15.f = "0.1.0";
                x6h1VarI15.g = "22.0.0";
                this.b = x6h1VarI15.a();
                this.c = Collections.singletonList("phonenumber/validateotp");
                break;
            case 17:
                r6h1 r6h1Var16 = r6h1.c;
                y6h1 y6h1Var16 = y6h1.i;
                x6h1 x6h1VarI16 = i3o1.i();
                x6h1VarI16.h = "music";
                x6h1VarI16.a = "mobile-start-screen";
                x6h1VarI16.f = "0.1.0";
                x6h1VarI16.g = "22.0.0";
                this.b = x6h1VarI16.a();
                this.c = Collections.singletonList("start");
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                return c13.m(arrayList, z6xVar, y6h1Var, arrayList, (u8h1) null);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                return c13.m(arrayList2, z6xVar, y6h1Var, arrayList2, (u8h1) null);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                return c13.m(arrayList3, z6xVar, y6h1Var, arrayList3, (u8h1) null);
            case 3:
                r6h1 r6h1Var7 = r6h1.c;
                r6h1 r6h1Var8 = r6h1.c;
                ArrayList arrayList4 = new ArrayList();
                return c13.m(arrayList4, z6xVar, y6h1Var, arrayList4, (u8h1) null);
            case 4:
                r6h1 r6h1Var9 = r6h1.c;
                r6h1 r6h1Var10 = r6h1.c;
                ArrayList arrayList5 = new ArrayList();
                return c13.m(arrayList5, z6xVar, y6h1Var, arrayList5, (u8h1) null);
            case 5:
                r6h1 r6h1Var11 = r6h1.c;
                r6h1 r6h1Var12 = r6h1.c;
                ArrayList arrayList6 = new ArrayList();
                return c13.m(arrayList6, z6xVar, y6h1Var, arrayList6, (u8h1) null);
            case 6:
                r6h1 r6h1Var13 = r6h1.c;
                r6h1 r6h1Var14 = r6h1.c;
                ArrayList arrayList7 = new ArrayList();
                return c13.m(arrayList7, z6xVar, y6h1Var, arrayList7, (u8h1) null);
            case 7:
                r6h1 r6h1Var15 = r6h1.c;
                r6h1 r6h1Var16 = r6h1.c;
                ArrayList arrayList8 = new ArrayList();
                return c13.m(arrayList8, z6xVar, y6h1Var, arrayList8, (u8h1) null);
            case 8:
                r6h1 r6h1Var17 = r6h1.c;
                r6h1 r6h1Var18 = r6h1.c;
                ArrayList arrayList9 = new ArrayList();
                return c13.m(arrayList9, z6xVar, y6h1Var, arrayList9, (u8h1) null);
            case 9:
                r6h1 r6h1Var19 = r6h1.c;
                r6h1 r6h1Var20 = r6h1.c;
                ArrayList arrayList10 = new ArrayList();
                return c13.m(arrayList10, z6xVar, y6h1Var, arrayList10, (u8h1) null);
            case 10:
                r6h1 r6h1Var21 = r6h1.c;
                r6h1 r6h1Var22 = r6h1.c;
                ArrayList arrayList11 = new ArrayList();
                return c13.m(arrayList11, z6xVar, y6h1Var, arrayList11, (u8h1) null);
            case 11:
                r6h1 r6h1Var23 = r6h1.c;
                r6h1 r6h1Var24 = r6h1.c;
                ArrayList arrayList12 = new ArrayList();
                return c13.m(arrayList12, z6xVar, y6h1Var, arrayList12, (u8h1) null);
            case 12:
                r6h1 r6h1Var25 = r6h1.c;
                r6h1 r6h1Var26 = r6h1.c;
                ArrayList arrayList13 = new ArrayList();
                return c13.m(arrayList13, z6xVar, y6h1Var, arrayList13, (u8h1) null);
            case 13:
                r6h1 r6h1Var27 = r6h1.c;
                r6h1 r6h1Var28 = r6h1.c;
                ArrayList arrayList14 = new ArrayList();
                return c13.m(arrayList14, z6xVar, y6h1Var, arrayList14, (u8h1) null);
            case 14:
                r6h1 r6h1Var29 = r6h1.c;
                r6h1 r6h1Var30 = r6h1.c;
                ArrayList arrayList15 = new ArrayList();
                return c13.m(arrayList15, z6xVar, y6h1Var, arrayList15, (u8h1) null);
            case 15:
                r6h1 r6h1Var31 = r6h1.c;
                r6h1 r6h1Var32 = r6h1.c;
                ArrayList arrayList16 = new ArrayList();
                return c13.m(arrayList16, z6xVar, y6h1Var, arrayList16, (u8h1) null);
            case 16:
                r6h1 r6h1Var33 = r6h1.c;
                r6h1 r6h1Var34 = r6h1.c;
                ArrayList arrayList17 = new ArrayList();
                return c13.m(arrayList17, z6xVar, y6h1Var, arrayList17, (u8h1) null);
            case 17:
                r6h1 r6h1Var35 = r6h1.c;
                r6h1 r6h1Var36 = r6h1.c;
                ArrayList arrayList18 = new ArrayList();
                return c13.m(arrayList18, z6xVar, y6h1Var, arrayList18, (u8h1) null);
            default:
                r6h1 r6h1Var37 = r6h1.c;
                r6h1 r6h1Var38 = r6h1.c;
                ArrayList arrayList19 = new ArrayList();
                return c13.m(arrayList19, z6xVar, y6h1Var, arrayList19, (u8h1) null);
        }
    }

    public qgl0 e() {
        return new qgl0(this, (byte) 27);
    }

    public qgl0 h() {
        return new qgl0(this, (byte) 28);
    }

    public h4l0(String str) {
        this.a = (byte) 0;
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-credits-page";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        this.b = x6h1VarI.a();
        this.c = Collections.singletonList("track-credits/credits");
    }

    public h4l0(int i) {
        String str;
        this.a = (byte) 13;
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-signup-error-dialog";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str = "apple_signup";
        } else if (i == 2) {
            str = "facebook_signup";
        } else if (i == 3) {
            str = "google_signup";
        } else if (i == 4) {
            str = "naver_signup";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "phone_number_signup";
        }
        x6h1VarI.b = str;
        this.b = x6h1VarI.a();
        this.c = Collections.singletonList("signup/signupunavailable");
    }

    public h4l0(String str, String str2) {
        this.a = (byte) 18;
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-storytelling-container";
        x6h1VarI.f = "8.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.d = str2;
        this.b = x6h1VarI.a();
        this.c = p7h.M(new String[]{"wrapped/datastories", "blend/data-story", "playlist/ondemand", "culturalmoments/stories"});
    }
}
