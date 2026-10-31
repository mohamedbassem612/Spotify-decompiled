package p;

import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qgl0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;

    public qgl0(tdl0 tdl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("spotify_offers_and_bundles_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 6:
                x6h1 x6h1VarC2 = tdl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("surveys_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            default:
                x6h1 x6h1VarC3 = tdl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("spotify_features_and_tips_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
        }
    }

    public w7h1 a(String str) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.b, r6h1.c, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        z6x z6xVar = z6x.a;
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
                return c13.m(arrayList, z6xVar, y6h1Var, arrayList, (u8h1) null);
            case 11:
                r6h1 r6h1Var13 = r6h1.c;
                r6h1 r6h1Var14 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                return c13.m(arrayList2, z6xVar, y6h1Var, arrayList2, (u8h1) null);
            case 12:
                r6h1 r6h1Var15 = r6h1.c;
                r6h1 r6h1Var16 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                return c13.m(arrayList3, z6xVar, y6h1Var, arrayList3, (u8h1) null);
            case 13:
                r6h1 r6h1Var17 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 14:
                r6h1 r6h1Var18 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 15:
                r6h1 r6h1Var19 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 16:
                r6h1 r6h1Var20 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 17:
                r6h1 r6h1Var21 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 18:
                r6h1 r6h1Var22 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 19:
                r6h1 r6h1Var23 = r6h1.c;
                r6h1 r6h1Var24 = r6h1.c;
                ArrayList arrayList4 = new ArrayList();
                return c13.m(arrayList4, z6xVar, y6h1Var, arrayList4, (u8h1) null);
            case 20:
                r6h1 r6h1Var25 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 21:
                r6h1 r6h1Var26 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 22:
                r6h1 r6h1Var27 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 23:
                r6h1 r6h1Var28 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 24:
                r6h1 r6h1Var29 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 25:
                r6h1 r6h1Var30 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 26:
                r6h1 r6h1Var31 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                r6h1 r6h1Var32 = r6h1.c;
                r6h1 r6h1Var33 = r6h1.c;
                ArrayList arrayList5 = new ArrayList();
                return c13.m(arrayList5, z6xVar, y6h1Var, arrayList5, (u8h1) null);
            case 28:
                r6h1 r6h1Var34 = r6h1.c;
                r6h1 r6h1Var35 = r6h1.c;
                ArrayList arrayList6 = new ArrayList();
                return c13.m(arrayList6, z6xVar, y6h1Var, arrayList6, (u8h1) null);
            default:
                r6h1 r6h1Var36 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
        }
    }

    public qgl0 e() {
        return new qgl0(this, 0);
    }

    public qgl0 h() {
        return new qgl0(this, (byte) 15, (byte) 0);
    }

    public pgl0 i() {
        return new pgl0(this, (byte) 28);
    }

    public qgl0 j() {
        return new qgl0(this, (byte) 1);
    }

    public qgl0 k() {
        return new qgl0(this, (byte) 4, false);
    }

    public w7h1 l(String str) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 21:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str != null ? str : "")), this.b, r6h1.c, System.currentTimeMillis());
            case 22:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str != null ? str : "")), this.b, r6h1.c, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str != null ? str : "")), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public w7h1 m(String str) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 21:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str != null ? str : "")), this.b, r6h1.c, System.currentTimeMillis());
            case 22:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str != null ? str : "")), this.b, r6h1.c, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str != null ? str : "")), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public w7h1 n() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 1:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 2:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 3:
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 4:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public w7h1 o(Integer num, String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        mmr0 mmr0Var = new mmr0("entity_uri", str);
        String strValueOf = String.valueOf(num.intValue());
        return new w7h1("", "", z7h1Var, new x7h1("submit_rating", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("rating", strValueOf != null ? strValueOf : "")})), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 p() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 8:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 9:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 10:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public w7h1 q() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 15:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public w7h1 r() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 21:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            case 22:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
        }
    }

    public qgl0 s() {
        return new qgl0(this, (byte) 16, (byte) 0);
    }

    public pgl0 t() {
        return new pgl0(this, (byte) 29);
    }

    public qgl0 u() {
        return new qgl0(this, (byte) 2);
    }

    public qgl0 v() {
        return new qgl0(this, (byte) 5, false);
    }

    public qgl0 w() {
        return new qgl0(this, (byte) 17, (byte) 0);
    }

    public w7h1 x(Integer num, String str, Integer num2) {
        z7h1 z7h1Var = new z7h1("swipe", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 y(Integer num, String str, Integer num2) {
        z7h1 z7h1Var = new z7h1("swipe", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new w7h1("", "", z7h1Var, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), this.b, r6h1.c, System.currentTimeMillis());
    }

    public qgl0(tdl0 tdl0Var, int i) {
        this.a = (byte) 8;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(tdl0 tdl0Var, short s) {
        this.a = (byte) 9;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(yok0 yok0Var) {
        this.a = (byte) 12;
        x6h1 x6h1VarC = yok0Var.b.c();
        x6h1VarC.i.add(new a7h1("remove_download_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(qrl0 qrl0Var) {
        this.a = (byte) 19;
        x6h1 x6h1VarC = qrl0Var.b.c();
        x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(pdl0 pdl0Var) {
        this.a = (byte) 7;
        x6h1 x6h1VarC = pdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(tdl0 tdl0Var, String str) {
        this.a = (byte) 18;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("page", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(mjl0 mjl0Var) {
        this.a = (byte) 24;
        x6h1 x6h1VarC = mjl0Var.b.c();
        x6h1VarC.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(h4l0 h4l0Var, byte b) {
        this.a = b;
        switch (b) {
            case 28:
                x6h1 x6h1VarC = h4l0Var.b.c();
                x6h1VarC.i.add(new a7h1("sign_up_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = h4l0Var.b.c();
                x6h1VarC2.i.add(new a7h1("login_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public qgl0(qgl0 qgl0Var, byte b, byte b2) {
        this.a = b;
        switch (b) {
            case 16:
                x6h1 x6h1VarC = qgl0Var.b.c();
                x6h1VarC.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 17:
                x6h1 x6h1VarC2 = qgl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("submit_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            default:
                x6h1 x6h1VarC3 = qgl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
        }
    }

    public qgl0(qgl0 qgl0Var, int i) {
        this.a = (byte) 11;
        x6h1 x6h1VarC = qgl0Var.b.c();
        x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(Integer num, String str, tdl0 tdl0Var) {
        this.a = (byte) 14;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("participant", (String) null, num, str, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(brl0 brl0Var) {
        this.a = (byte) 29;
        x6h1 x6h1VarC = brl0Var.b.c();
        x6h1VarC.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(l0m0 l0m0Var) {
        this.a = (byte) 26;
        x6h1 x6h1VarC = l0m0Var.a.c();
        x6h1VarC.i.add(new a7h1("auto_invite_nearby_row", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(qgl0 qgl0Var, short s) {
        this.a = (byte) 13;
        x6h1 x6h1VarC = qgl0Var.b.c();
        x6h1VarC.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(xkl0 xkl0Var) {
        this.a = (byte) 10;
        x6h1 x6h1VarC = xkl0Var.a.c();
        x6h1VarC.i.add(new a7h1("keep_previous_quality_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(pdl0 pdl0Var, byte b) {
        this.a = (byte) 25;
        x6h1 x6h1VarC = pdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(qgl0 qgl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                x6h1 x6h1VarC = qgl0Var.b.c();
                x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = qgl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public qgl0(jvl0 jvl0Var) {
        this.a = (byte) 21;
        x6h1 x6h1VarC = jvl0Var.a.c();
        x6h1VarC.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(wvl0 wvl0Var) {
        this.a = (byte) 22;
        x6h1 x6h1VarC = wvl0Var.a.c();
        x6h1VarC.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(qgl0 qgl0Var, byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 5:
                x6h1 x6h1VarC = qgl0Var.b.c();
                x6h1VarC.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = qgl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public qgl0(bwl0 bwl0Var) {
        this.a = (byte) 23;
        x6h1 x6h1VarC = bwl0Var.a.c();
        x6h1VarC.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public qgl0(urk0 urk0Var, String str) {
        this.a = (byte) 20;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("instant_mix_loading_page", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }
}
