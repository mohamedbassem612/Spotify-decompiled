package p;

import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nqk0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;

    public nqk0(nqk0 nqk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 4:
                x6h1 x6h1VarC = nqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("skip_next", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 5:
                x6h1 x6h1VarC2 = nqk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("skip_prev", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            default:
                x6h1 x6h1VarC3 = nqk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("play_pause", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
        }
    }

    public w7h1 a(String str) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 1:
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
                r6h1 r6h1Var11 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                return c13.m(arrayList, z6xVar, y6h1Var, arrayList, (u8h1) null);
            case 10:
                r6h1 r6h1Var12 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 11:
                r6h1 r6h1Var13 = r6h1.c;
                r6h1 r6h1Var14 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                return c13.m(arrayList2, z6xVar, y6h1Var, arrayList2, (u8h1) null);
            case 12:
                r6h1 r6h1Var15 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 13:
                r6h1 r6h1Var16 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 14:
                r6h1 r6h1Var17 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 15:
                r6h1 r6h1Var18 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 16:
                r6h1 r6h1Var19 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 17:
                r6h1 r6h1Var20 = r6h1.c;
                r6h1 r6h1Var21 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                return c13.m(arrayList3, z6xVar, y6h1Var, arrayList3, (u8h1) null);
            case 18:
                r6h1 r6h1Var22 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 19:
                r6h1 r6h1Var23 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 20:
                r6h1 r6h1Var24 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 21:
                r6h1 r6h1Var25 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 22:
                r6h1 r6h1Var26 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 23:
                r6h1 r6h1Var27 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 24:
                r6h1 r6h1Var28 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 25:
                r6h1 r6h1Var29 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 26:
                r6h1 r6h1Var30 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                r6h1 r6h1Var31 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 28:
                r6h1 r6h1Var32 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            default:
                r6h1 r6h1Var33 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
        }
    }

    public nqk0 e(String str) {
        return new nqk0(this, str);
    }

    public nqk0 h() {
        return new nqk0(this, false, (char) 0);
    }

    public w7h1 i() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 j(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str)), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 k(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", "")), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 l(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", "")), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 m() {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("skip_to_next", 1, Collections.singletonMap("item_to_be_skipped", "")), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 n() {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("skip_to_previous", 1, Collections.singletonMap("item_to_be_skipped", "")), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 o() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
    }

    public nqk0 p() {
        return new nqk0(this, (byte) 3);
    }

    public nqk0 q() {
        return new nqk0(this, (short) 0);
    }

    public nqk0 r() {
        return new nqk0(this, (byte) 4);
    }

    public nqk0 s() {
        return new nqk0(this, (byte) 5);
    }

    public nqk0(txk0 txk0Var, Integer num) {
        this.a = (byte) 20;
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("sections", (String) null, num, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(txk0 txk0Var) {
        this.a = (byte) 24;
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("commentary_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(h7l0 h7l0Var, byte b) {
        this.a = (byte) 27;
        x6h1 x6h1VarC = h7l0Var.b.c();
        x6h1VarC.i.add(new a7h1("managed_accounts_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(yok0 yok0Var) {
        this.a = (byte) 9;
        x6h1 x6h1VarC = yok0Var.b.c();
        x6h1VarC.i.add(new a7h1("plans", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(bqk0 bqk0Var, short s) {
        this.a = (byte) 19;
        x6h1 x6h1VarC = bqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(xok0 xok0Var) {
        this.a = (byte) 2;
        x6h1 x6h1VarC = xok0Var.b.c();
        x6h1VarC.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(bqk0 bqk0Var, int i) {
        this.a = (byte) 14;
        x6h1 x6h1VarC = bqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(xok0 xok0Var, byte b) {
        this.a = (byte) 8;
        x6h1 x6h1VarC = xok0Var.b.c();
        x6h1VarC.i.add(new a7h1("vertical_container", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(gwk0 gwk0Var) {
        this.a = (byte) 16;
        x6h1 x6h1VarC = gwk0Var.a.c();
        x6h1VarC.i.add(new a7h1("chats", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(iuk0 iuk0Var) {
        this.a = (byte) 10;
        x6h1 x6h1VarC = iuk0Var.a.c();
        x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(nqk0 nqk0Var, int i) {
        String str;
        this.a = (byte) 23;
        x6h1 x6h1VarC = nqk0Var.b.c();
        if (i == 1) {
            str = "default";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "sometimes";
        }
        x6h1VarC.i.add(new a7h1("commentary_option_row", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(bqk0 bqk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                x6h1 x6h1VarC = bqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("disclaimer_text", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = bqk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public nqk0(yvk0 yvk0Var) {
        this.a = (byte) 15;
        x6h1 x6h1VarC = yvk0Var.b.c();
        x6h1VarC.i.add(new a7h1("chats", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(h7l0 h7l0Var) {
        this.a = (byte) 26;
        x6h1 x6h1VarC = h7l0Var.b.c();
        x6h1VarC.i.add(new a7h1("explicit_content_requests", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(n3l0 n3l0Var, int i) {
        String str;
        this.a = (byte) 21;
        x6h1 x6h1VarC = n3l0Var.a.c();
        if (i == 1) {
            str = "jam_active_as_host";
        } else if (i == 2) {
            str = "jam_active_as_member";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "personalized_recommendations_disabled";
        }
        x6h1VarC.i.add(new a7h1("dialog", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(nqk0 nqk0Var, boolean z, char c) {
        this.a = (byte) 7;
        x6h1 x6h1VarC = nqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("controls_container", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(v8l0 v8l0Var) {
        this.a = (byte) 25;
        x6h1 x6h1VarC = v8l0Var.a.c();
        x6h1VarC.i.add(new a7h1("items", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(yok0 yok0Var, byte b) {
        this.a = (byte) 17;
        x6h1 x6h1VarC = yok0Var.b.c();
        x6h1VarC.i.add(new a7h1("shared_by_sheet", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(wuk0 wuk0Var) {
        this.a = (byte) 11;
        x6h1 x6h1VarC = wuk0Var.a.c();
        x6h1VarC.i.add(new a7h1("existing_groups", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(nqk0 nqk0Var, short s) {
        this.a = (byte) 6;
        x6h1 x6h1VarC = nqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(xok0 xok0Var, char c) {
        this.a = (byte) 22;
        x6h1 x6h1VarC = xok0Var.b.c();
        x6h1VarC.i.add(new a7h1("last_visited_page_shortcut", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(bqk0 bqk0Var, char c) {
        this.a = (byte) 12;
        x6h1 x6h1VarC = bqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("group_chat_header", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(bal0 bal0Var) {
        this.a = (byte) 29;
        x6h1 x6h1VarC = bal0Var.b.c();
        x6h1VarC.i.add(new a7h1("filters", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(nqk0 nqk0Var, String str) {
        this.a = (byte) 28;
        x6h1 x6h1VarC = nqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("chip", str, 0, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(ttk0 ttk0Var) {
        this.a = (byte) 18;
        x6h1 x6h1VarC = ttk0Var.b.c();
        x6h1VarC.i.add(new a7h1("learn_even_more", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public nqk0(uvk0 uvk0Var) {
        this.a = (byte) 13;
        x6h1 x6h1VarC = uvk0Var.a.c();
        x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }
}
