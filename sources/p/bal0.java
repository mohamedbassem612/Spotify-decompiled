package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bal0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;

    public bal0(tdl0 tdl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("email_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 4:
                x6h1 x6h1VarC2 = tdl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("facebook_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            case 5:
                x6h1 x6h1VarC3 = tdl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("google_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
            case 6:
                x6h1 x6h1VarC4 = tdl0Var.b.c();
                x6h1VarC4.i.add(new a7h1("naver_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                this.b = x6h1VarC4.a();
                break;
            case 7:
                x6h1 x6h1VarC5 = tdl0Var.b.c();
                x6h1VarC5.i.add(new a7h1("passkey_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                this.b = x6h1VarC5.a();
                break;
            case 8:
                x6h1 x6h1VarC6 = tdl0Var.b.c();
                x6h1VarC6.i.add(new a7h1("phone_number_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                this.b = x6h1VarC6.a();
                break;
            default:
                x6h1 x6h1VarC7 = tdl0Var.b.c();
                x6h1VarC7.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                this.b = x6h1VarC7.a();
                break;
        }
    }

    public w7h1 a(String str) {
        String str2 = str;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str2 == null) {
                    str2 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), this.b, r6h1.c, System.currentTimeMillis());
            case 1:
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), this.b, r6h1.c, System.currentTimeMillis());
            case 2:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), this.b, r6h1.c, System.currentTimeMillis());
            case 3:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), this.b, r6h1.c, System.currentTimeMillis());
            case 4:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), this.b, r6h1.c, System.currentTimeMillis());
            case 5:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), this.b, r6h1.c, System.currentTimeMillis());
            case 6:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), this.b, r6h1.c, System.currentTimeMillis());
            case 7:
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                if (str2 == null) {
                    str2 = "";
                }
                return new w7h1("", "", z7h1Var2, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 1:
                r6h1 r6h1Var2 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 2:
                r6h1 r6h1Var3 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 3:
                r6h1 r6h1Var4 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 4:
                r6h1 r6h1Var5 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 5:
                r6h1 r6h1Var6 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 6:
                r6h1 r6h1Var7 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 7:
                r6h1 r6h1Var8 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 8:
                r6h1 r6h1Var9 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 9:
                r6h1 r6h1Var10 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 10:
                r6h1 r6h1Var11 = r6h1.c;
                r6h1 r6h1Var12 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                return c13.m(arrayList, z6x.a, y6h1Var, arrayList, (u8h1) null);
            case 11:
                r6h1 r6h1Var13 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 12:
                r6h1 r6h1Var14 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 13:
                r6h1 r6h1Var15 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 14:
                r6h1 r6h1Var16 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 15:
                r6h1 r6h1Var17 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 16:
                r6h1 r6h1Var18 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 17:
                r6h1 r6h1Var19 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 18:
                r6h1 r6h1Var20 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 19:
                r6h1 r6h1Var21 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 20:
                r6h1 r6h1Var22 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 21:
                r6h1 r6h1Var23 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 22:
                r6h1 r6h1Var24 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 23:
                r6h1 r6h1Var25 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 24:
                r6h1 r6h1Var26 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 25:
                r6h1 r6h1Var27 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 26:
                r6h1 r6h1Var28 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 27:
                r6h1 r6h1Var29 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 28:
                r6h1 r6h1Var30 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            default:
                r6h1 r6h1Var31 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
        }
    }

    public bal0 e() {
        return new bal0(this, (byte) 11, false);
    }

    public bal0 h() {
        return new bal0(this, (byte) 14, (byte) 0);
    }

    public bal0 i() {
        return new bal0(this, (byte) 17, (char) 0);
    }

    public bal0 j() {
        return new bal0(this, (byte) 20, 0);
    }

    public bal0 k() {
        return new bal0(this, (byte) 23, (short) 0);
    }

    public nqk0 l() {
        return new nqk0(this);
    }

    public w7h1 m() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 11:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 12:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 13:
            case 16:
            case 19:
            case 22:
            case 25:
            case 27:
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 14:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 15:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 17:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 18:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 20:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 21:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 23:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 24:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 26:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 28:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public w7h1 n() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
    }

    public bal0 o() {
        return new bal0(this);
    }

    public bal0 p() {
        return new bal0(this, (byte) 12, false);
    }

    public bal0 q() {
        return new bal0(this, (byte) 15, (byte) 0);
    }

    public bal0 r() {
        return new bal0(this, (byte) 18, (char) 0);
    }

    public bal0 s() {
        return new bal0(this, (byte) 21, 0);
    }

    public bal0 t() {
        return new bal0(this, (byte) 24, (short) 0);
    }

    public bal0 u() {
        return new bal0(this, (char) 0, false);
    }

    public bal0(h7l0 h7l0Var) {
        this.a = (byte) 1;
        x6h1 x6h1VarC = h7l0Var.b.c();
        x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public bal0(rrk0 rrk0Var) {
        this.a = (byte) 10;
        x6h1 x6h1VarC = rrk0Var.b.c();
        x6h1VarC.i.add(new a7h1("notifications", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public bal0(bal0 bal0Var) {
        this.a = (byte) 0;
        x6h1 x6h1VarC = bal0Var.b.c();
        x6h1VarC.i.add(new a7h1("profile_icon", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public bal0(tdl0 tdl0Var, boolean z, int i) {
        this.a = (byte) 9;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public bal0(bal0 bal0Var, byte b, byte b2) {
        this.a = b;
        switch (b) {
            case 15:
                x6h1 x6h1VarC = bal0Var.b.c();
                x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = bal0Var.b.c();
                x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public bal0(bal0 bal0Var, byte b, short s) {
        this.a = b;
        switch (b) {
            case 24:
                x6h1 x6h1VarC = bal0Var.b.c();
                x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = bal0Var.b.c();
                x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public bal0(pgl0 pgl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 29:
                x6h1 x6h1VarC = pgl0Var.b.c();
                x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = pgl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public bal0(tdl0 tdl0Var, byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 16:
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("audiobooks_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 19:
                x6h1 x6h1VarC2 = tdl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("comments_reactions_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            case 22:
                x6h1 x6h1VarC3 = tdl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("comments_replies_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
            case 25:
                x6h1 x6h1VarC4 = tdl0Var.b.c();
                x6h1VarC4.i.add(new a7h1("in_person_concert_and_events_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                this.b = x6h1VarC4.a();
                break;
            case 27:
                x6h1 x6h1VarC5 = tdl0Var.b.c();
                x6h1VarC5.i.add(new a7h1("jam_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                this.b = x6h1VarC5.a();
                break;
            default:
                x6h1 x6h1VarC6 = tdl0Var.b.c();
                x6h1VarC6.i.add(new a7h1("artist_and_creator_merchandis_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                this.b = x6h1VarC6.a();
                break;
        }
    }

    public bal0(bal0 bal0Var, byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 12:
                x6h1 x6h1VarC = bal0Var.b.c();
                x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = bal0Var.b.c();
                x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public bal0(bal0 bal0Var, byte b, char c) {
        this.a = b;
        switch (b) {
            case 18:
                x6h1 x6h1VarC = bal0Var.b.c();
                x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = bal0Var.b.c();
                x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public bal0(bal0 bal0Var, byte b, int i) {
        this.a = b;
        switch (b) {
            case 21:
                x6h1 x6h1VarC = bal0Var.b.c();
                x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = bal0Var.b.c();
                x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public bal0(bal0 bal0Var, char c, boolean z) {
        this.a = (byte) 26;
        x6h1 x6h1VarC = bal0Var.b.c();
        x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }
}
