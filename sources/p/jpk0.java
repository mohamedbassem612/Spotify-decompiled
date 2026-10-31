package p;

import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jpk0 implements n8h1 {
    public final /* synthetic */ byte a = 16;
    public final y6h1 b;
    public final /* synthetic */ n8h1 c;

    public jpk0(py9 py9Var, int i, Integer num, int i2) {
        String str;
        String str2;
        this.c = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        if (i == 1) {
            str = "general_sale";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "reserved";
        }
        String str3 = str;
        switch (i2) {
            case 1:
                str2 = "active";
                break;
            case 2:
                str2 = "cancelled";
                break;
            case 3:
                str2 = "ended";
                break;
            case 4:
                str2 = "purchased";
                break;
            case 5:
                str2 = "sold_out";
                break;
            case 6:
                str2 = "unspecified";
                break;
            case 7:
                str2 = "upcoming";
                break;
            default:
                throw null;
        }
        x6h1VarC.i.add(new a7h1("timeline_entry", str3, num, (String) null, str2));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public tgl0 A() {
        return new tgl0(this, (byte) 3);
    }

    public ugl0 B() {
        return new ugl0(this, (byte) 2);
    }

    public rgl0 C() {
        return new rgl0(this, (byte) 3);
    }

    public sgl0 D() {
        return new sgl0(this, (byte) 4);
    }

    public tgl0 E() {
        return new tgl0(this, (byte) 4);
    }

    public ugl0 F() {
        return new ugl0(this, (byte) 3);
    }

    public w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.b, this.c.a, System.currentTimeMillis());
    }

    public final r6h1 b() {
        byte b = this.a;
        n8h1 n8h1Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = ((kpk0) n8h1Var).a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = ((spk0) n8h1Var).a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = ((py9) n8h1Var).b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var6.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var6.b);
            case 3:
                r6h1 r6h1Var7 = r6h1.c;
                r6h1 r6h1Var8 = ((py9) n8h1Var).b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var8.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var8.b);
            case 4:
                r6h1 r6h1Var9 = r6h1.c;
                r6h1 r6h1Var10 = ((py9) n8h1Var).b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var10.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var10.b);
            case 5:
                r6h1 r6h1Var11 = r6h1.c;
                r6h1 r6h1Var12 = ((py9) n8h1Var).b;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(r6h1Var12.a);
                arrayList6.add(y6h1Var);
                return new r6h1(arrayList6, r6h1Var12.b);
            case 6:
                r6h1 r6h1Var13 = r6h1.c;
                r6h1 r6h1Var14 = ((py9) n8h1Var).b;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(r6h1Var14.a);
                arrayList7.add(y6h1Var);
                return new r6h1(arrayList7, r6h1Var14.b);
            case 7:
                r6h1 r6h1Var15 = r6h1.c;
                r6h1 r6h1Var16 = ((jvk0) n8h1Var).a;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.addAll(r6h1Var16.a);
                arrayList8.add(y6h1Var);
                return new r6h1(arrayList8, r6h1Var16.b);
            case 8:
                r6h1 r6h1Var17 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 9:
                r6h1 r6h1Var18 = r6h1.c;
                r6h1 r6h1Var19 = ((ksk0) n8h1Var).b;
                ArrayList arrayList9 = new ArrayList();
                arrayList9.addAll(r6h1Var19.a);
                arrayList9.add(y6h1Var);
                return new r6h1(arrayList9, r6h1Var19.b);
            case 10:
                r6h1 r6h1Var20 = r6h1.c;
                r6h1 r6h1Var21 = ((wqk0) n8h1Var).b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(r6h1Var21.a);
                arrayList10.add(y6h1Var);
                return new r6h1(arrayList10, r6h1Var21.b);
            case 11:
                r6h1 r6h1Var22 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 12:
                r6h1 r6h1Var23 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 13:
                r6h1 r6h1Var24 = r6h1.c;
                r6h1 r6h1Var25 = ((py9) n8h1Var).b;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(r6h1Var25.a);
                arrayList11.add(y6h1Var);
                return new r6h1(arrayList11, r6h1Var25.b);
            case 14:
                r6h1 r6h1Var26 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 15:
                r6h1 r6h1Var27 = r6h1.c;
                r6h1 r6h1Var28 = ((k4l0) n8h1Var).a;
                ArrayList arrayList12 = new ArrayList();
                arrayList12.addAll(r6h1Var28.a);
                arrayList12.add(y6h1Var);
                return new r6h1(arrayList12, r6h1Var28.b);
            case 16:
                r6h1 r6h1Var29 = r6h1.c;
                r6h1 r6h1Var30 = ((jpk0) n8h1Var).c.b;
                ArrayList arrayList13 = new ArrayList();
                arrayList13.addAll(r6h1Var30.a);
                arrayList13.add(y6h1Var);
                return new r6h1(arrayList13, r6h1Var30.b);
            case 17:
                r6h1 r6h1Var31 = r6h1.c;
                r6h1 r6h1Var32 = ((py9) n8h1Var).b;
                ArrayList arrayList14 = new ArrayList();
                arrayList14.addAll(r6h1Var32.a);
                arrayList14.add(y6h1Var);
                return new r6h1(arrayList14, r6h1Var32.b);
            case 18:
                r6h1 r6h1Var33 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 19:
                r6h1 r6h1Var34 = r6h1.c;
                r6h1 r6h1Var35 = ((wqk0) n8h1Var).b;
                ArrayList arrayList15 = new ArrayList();
                arrayList15.addAll(r6h1Var35.a);
                arrayList15.add(y6h1Var);
                return new r6h1(arrayList15, r6h1Var35.b);
            case 20:
                r6h1 r6h1Var36 = r6h1.c;
                r6h1 r6h1Var37 = ((u6l0) n8h1Var).c.b;
                ArrayList arrayList16 = new ArrayList();
                arrayList16.addAll(r6h1Var37.a);
                arrayList16.add(y6h1Var);
                return new r6h1(arrayList16, r6h1Var37.b);
            case 21:
                r6h1 r6h1Var38 = r6h1.c;
                r6h1 r6h1Var39 = ((u6l0) n8h1Var).c.b;
                ArrayList arrayList17 = new ArrayList();
                arrayList17.addAll(r6h1Var39.a);
                arrayList17.add(y6h1Var);
                return new r6h1(arrayList17, r6h1Var39.b);
            case 22:
                r6h1 r6h1Var40 = r6h1.c;
                r6h1 r6h1Var41 = ((u6l0) n8h1Var).c.b;
                ArrayList arrayList18 = new ArrayList();
                arrayList18.addAll(r6h1Var41.a);
                arrayList18.add(y6h1Var);
                return new r6h1(arrayList18, r6h1Var41.b);
            case 23:
                r6h1 r6h1Var42 = r6h1.c;
                r6h1 r6h1Var43 = ((bcl0) n8h1Var).a;
                ArrayList arrayList19 = new ArrayList();
                arrayList19.addAll(r6h1Var43.a);
                arrayList19.add(y6h1Var);
                return new r6h1(arrayList19, r6h1Var43.b);
            case 24:
                r6h1 r6h1Var44 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 25:
                r6h1 r6h1Var45 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 26:
                r6h1 r6h1Var46 = r6h1.c;
                r6h1 r6h1Var47 = ((g5l0) n8h1Var).b;
                ArrayList arrayList20 = new ArrayList();
                arrayList20.addAll(r6h1Var47.a);
                arrayList20.add(y6h1Var);
                return new r6h1(arrayList20, r6h1Var47.b);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                r6h1 r6h1Var48 = r6h1.c;
                r6h1 r6h1Var49 = ((g5l0) n8h1Var).b;
                ArrayList arrayList21 = new ArrayList();
                arrayList21.addAll(r6h1Var49.a);
                arrayList21.add(y6h1Var);
                return new r6h1(arrayList21, r6h1Var49.b);
            case 28:
                r6h1 r6h1Var50 = r6h1.c;
                r6h1 r6h1Var51 = ((g5l0) n8h1Var).b;
                ArrayList arrayList22 = new ArrayList();
                arrayList22.addAll(r6h1Var51.a);
                arrayList22.add(y6h1Var);
                return new r6h1(arrayList22, r6h1Var51.b);
            default:
                r6h1 r6h1Var52 = r6h1.c;
                r6h1 r6h1Var53 = ((g5l0) n8h1Var).b;
                ArrayList arrayList23 = new ArrayList();
                arrayList23.addAll(r6h1Var53.a);
                arrayList23.add(y6h1Var);
                return new r6h1(arrayList23, r6h1Var53.b);
        }
    }

    public tgl0 e() {
        return new tgl0(this, (byte) 0);
    }

    public rpk0 h() {
        return new rpk0(this, (byte) 0);
    }

    public rpk0 i() {
        return new rpk0(this, (byte) 1);
    }

    public rpk0 j() {
        return new rpk0(this, (byte) 2);
    }

    public rgl0 k() {
        return new rgl0(this, (byte) 0);
    }

    public sgl0 l() {
        return new sgl0(this, (byte) 0);
    }

    public tgl0 m() {
        return new tgl0(this, (byte) 1);
    }

    public w7h1 n(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str)), this.b, this.c.a, System.currentTimeMillis());
    }

    public w7h1 o(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), this.b, this.c.a, System.currentTimeMillis());
    }

    public w7h1 p(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str)), this.b, this.c.a, System.currentTimeMillis());
    }

    public w7h1 q() {
        byte b = this.a;
        n8h1 n8h1Var = this.c;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 1:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, ((spk0) n8h1Var).a, System.currentTimeMillis());
            case 19:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, ((wqk0) n8h1Var).b, System.currentTimeMillis());
            case 20:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, ((u6l0) n8h1Var).c.b, System.currentTimeMillis());
            case 21:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, ((u6l0) n8h1Var).c.b, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, ((u6l0) n8h1Var).c.b, System.currentTimeMillis());
        }
    }

    public rgl0 r() {
        return new rgl0(this, (byte) 1);
    }

    public sgl0 s() {
        return new sgl0(this, (byte) 1);
    }

    public tgl0 t() {
        return new tgl0(this, (byte) 2);
    }

    public ugl0 u() {
        return new ugl0(this, (byte) 0);
    }

    public rpk0 v() {
        return new rpk0(this, (byte) 3);
    }

    public sgl0 w() {
        return new sgl0(this, (byte) 2);
    }

    public ugl0 x() {
        return new ugl0(this, (byte) 1);
    }

    public rgl0 y() {
        return new rgl0(this, (byte) 2);
    }

    public sgl0 z() {
        return new sgl0(this, (byte) 3);
    }

    public jpk0(py9 py9Var) {
        this.c = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("merch_carousel", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(py9 py9Var, char c) {
        this.c = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("recommeded_carousel", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(Integer num, String str, py9 py9Var) {
        this.c = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("language_section", str, num, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(txk0 txk0Var) {
        this.c = txk0Var;
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("onboarding_carousel", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(g5l0 g5l0Var, String str) {
        this.c = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(g5l0 g5l0Var, String str, char c) {
        this.c = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(g5l0 g5l0Var, String str, int i) {
        this.c = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(g5l0 g5l0Var, String str, byte b) {
        this.c = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(k4l0 k4l0Var, String str) {
        this.c = k4l0Var;
        x6h1 x6h1VarC = k4l0Var.b.c();
        x6h1VarC.i.add(new a7h1("save_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(wqk0 wqk0Var, Integer num) {
        this.c = wqk0Var;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("section", (String) null, num, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(wqk0 wqk0Var) {
        this.c = wqk0Var;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(spk0 spk0Var) {
        this.c = spk0Var;
        x6h1 x6h1VarC = spk0Var.b.c();
        x6h1VarC.i.add(new a7h1("card", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(Integer num, String str, jpk0 jpk0Var) {
        this.c = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("persona_row", str, num, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(bcl0 bcl0Var) {
        this.c = bcl0Var;
        x6h1 x6h1VarC = bcl0Var.b.c();
        x6h1VarC.i.add(new a7h1("link_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(py9 py9Var, byte b) {
        this.c = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("popular_releases_carousel", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(py9 py9Var, int i) {
        this.c = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("series_carousel", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(fyk0 fyk0Var) {
        this.c = fyk0Var;
        x6h1 x6h1VarC = fyk0Var.a.c();
        x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(u6l0 u6l0Var, String str, char c) {
        this.c = u6l0Var;
        x6h1 x6h1VarC = u6l0Var.b.c();
        x6h1VarC.i.add(new a7h1("download_row_context", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(ksk0 ksk0Var) {
        this.c = ksk0Var;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("members_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(tdl0 tdl0Var, Integer num) {
        this.c = tdl0Var;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("card_group", (String) null, num, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(kpk0 kpk0Var) {
        this.c = kpk0Var;
        x6h1 x6h1VarC = kpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(jvk0 jvk0Var) {
        this.c = jvk0Var;
        x6h1 x6h1VarC = jvk0Var.b.c();
        x6h1VarC.i.add(new a7h1("entity_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(bqk0 bqk0Var) {
        this.c = bqk0Var;
        x6h1 x6h1VarC = bqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("media_grid", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(txk0 txk0Var, byte b) {
        this.c = txk0Var;
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("items_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(u6l0 u6l0Var, String str) {
        this.c = u6l0Var;
        x6h1 x6h1VarC = u6l0Var.b.c();
        x6h1VarC.i.add(new a7h1("download_row_context", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(py9 py9Var, int i, String str) {
        String str2;
        this.c = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        if (i == 1) {
            str2 = "no_shuffle";
        } else if (i == 2) {
            str2 = "shuffle";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "smart_shuffle";
        }
        x6h1VarC.i.add(new a7h1("play_button", str2, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(sqk0 sqk0Var) {
        this.c = sqk0Var;
        x6h1 x6h1VarC = sqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("shows", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(u6l0 u6l0Var, String str, byte b) {
        this.c = u6l0Var;
        x6h1 x6h1VarC = u6l0Var.b.c();
        x6h1VarC.i.add(new a7h1("download_row_context", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public jpk0(h7l0 h7l0Var) {
        this.c = h7l0Var;
        x6h1 x6h1VarC = h7l0Var.b.c();
        x6h1VarC.i.add(new a7h1("upcoming_parties_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }
}
