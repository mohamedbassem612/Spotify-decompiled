package p;

import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sqk0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a = 0;
    public final y6h1 b;
    public final /* synthetic */ n8h1 c;

    public sqk0(brl0 brl0Var, Integer num, int i, String str) {
        String str2;
        this.c = brl0Var;
        x6h1 x6h1VarC = brl0Var.b.c();
        if (i == 1) {
            str2 = "available";
        } else if (i == 2) {
            str2 = "failed_permanent";
        } else if (i == 3) {
            str2 = "failed_temporary";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "invited";
        }
        x6h1VarC.i.add(new a7h1("nearby_user", (String) null, num, str, str2));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public w7h1 a(String str) {
        byte b = this.a;
        n8h1 n8h1Var = this.c;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), this.b, ((jpk0) n8h1Var).c.b, System.currentTimeMillis());
            case 3:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:collection")), this.b, ((py9) n8h1Var).b, System.currentTimeMillis());
            case 4:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), this.b, r6h1.c, System.currentTimeMillis());
            case 25:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), this.b, ((ksk0) n8h1Var).b, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), this.b, ((z2m0) n8h1Var).c.b, System.currentTimeMillis());
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        c4m0 c4m0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = ((jpk0) c4m0Var).c.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = ((jpk0) c4m0Var).c.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 3:
                r6h1 r6h1Var6 = r6h1.c;
                r6h1 r6h1Var7 = ((py9) c4m0Var).b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var7.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var7.b);
            case 4:
                r6h1 r6h1Var8 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 5:
                r6h1 r6h1Var9 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 6:
                r6h1 r6h1Var10 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 7:
                r6h1 r6h1Var11 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 8:
                r6h1 r6h1Var12 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 9:
                r6h1 r6h1Var13 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 10:
                r6h1 r6h1Var14 = r6h1.c;
                r6h1 r6h1Var15 = ((u6l0) c4m0Var).c.b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var15.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var15.b);
            case 11:
                r6h1 r6h1Var16 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 12:
                r6h1 r6h1Var17 = r6h1.c;
                r6h1 r6h1Var18 = ((g5l0) c4m0Var).b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var18.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var18.b);
            case 13:
                r6h1 r6h1Var19 = r6h1.c;
                r6h1 r6h1Var20 = ((zcl0) c4m0Var).a;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(r6h1Var20.a);
                arrayList6.add(y6h1Var);
                return new r6h1(arrayList6, r6h1Var20.b);
            case 14:
                r6h1 r6h1Var21 = r6h1.c;
                r6h1 r6h1Var22 = ((g5l0) c4m0Var).b;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(r6h1Var22.a);
                arrayList7.add(y6h1Var);
                return new r6h1(arrayList7, r6h1Var22.b);
            case 15:
                r6h1 r6h1Var23 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 16:
                r6h1 r6h1Var24 = r6h1.c;
                r6h1 r6h1Var25 = ((lfl0) c4m0Var).a;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.addAll(r6h1Var25.a);
                arrayList8.add(y6h1Var);
                return new r6h1(arrayList8, r6h1Var25.b);
            case 17:
                r6h1 r6h1Var26 = r6h1.c;
                r6h1 r6h1Var27 = ((g5l0) c4m0Var).b;
                ArrayList arrayList9 = new ArrayList();
                arrayList9.addAll(r6h1Var27.a);
                arrayList9.add(y6h1Var);
                return new r6h1(arrayList9, r6h1Var27.b);
            case 18:
                r6h1 r6h1Var28 = r6h1.c;
                r6h1 r6h1Var29 = ((fjl0) c4m0Var).b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(r6h1Var29.a);
                arrayList10.add(y6h1Var);
                return new r6h1(arrayList10, r6h1Var29.b);
            case 19:
                r6h1 r6h1Var30 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 20:
                r6h1 r6h1Var31 = r6h1.c;
                r6h1 r6h1Var32 = ((yol0) c4m0Var).a;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(r6h1Var32.a);
                arrayList11.add(y6h1Var);
                return new r6h1(arrayList11, r6h1Var32.b);
            case 21:
                r6h1 r6h1Var33 = r6h1.c;
                r6h1 r6h1Var34 = ((rpl0) c4m0Var).c.b;
                ArrayList arrayList12 = new ArrayList();
                arrayList12.addAll(r6h1Var34.a);
                arrayList12.add(y6h1Var);
                return new r6h1(arrayList12, r6h1Var34.b);
            case 22:
                r6h1 r6h1Var35 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 23:
                r6h1 r6h1Var36 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 24:
                r6h1 r6h1Var37 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 25:
                r6h1 r6h1Var38 = r6h1.c;
                r6h1 r6h1Var39 = ((ksk0) c4m0Var).b;
                ArrayList arrayList13 = new ArrayList();
                arrayList13.addAll(r6h1Var39.a);
                arrayList13.add(y6h1Var);
                return new r6h1(arrayList13, r6h1Var39.b);
            case 26:
                r6h1 r6h1Var40 = r6h1.c;
                r6h1 r6h1Var41 = ((z2m0) c4m0Var).c.b;
                ArrayList arrayList14 = new ArrayList();
                arrayList14.addAll(r6h1Var41.a);
                arrayList14.add(y6h1Var);
                return new r6h1(arrayList14, r6h1Var41.b);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                r6h1 r6h1Var42 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 28:
                r6h1 r6h1Var43 = r6h1.c;
                r6h1 r6h1Var44 = c4m0Var.b;
                ArrayList arrayList15 = new ArrayList();
                arrayList15.addAll(r6h1Var44.a);
                arrayList15.add(y6h1Var);
                return new r6h1(arrayList15, r6h1Var44.b);
            default:
                r6h1 r6h1Var45 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        p6m0 p6m0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = ((jpk0) p6m0Var).c.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = ((jpk0) p6m0Var).c.b;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 2:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = ((jrk0) p6m0Var).b.c;
                return k7h1Var3.a();
            case 3:
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1Var;
                ((xjn) k7h1Var4).b = ((py9) p6m0Var).b;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 4:
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1Var;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var5.e = ((uvk0) p6m0Var).b;
                return k7h1Var5.a();
            case 5:
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1Var;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var6.e = ((qxk0) p6m0Var).b.c;
                return k7h1Var6.a();
            case 6:
                k7h1 k7h1Var7 = new k7h1();
                ((xjn) k7h1Var7).a = y6h1Var;
                ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var7.e = ((jpk0) ((sqk0) ((jpk0) p6m0Var).c).c).c.c;
                return k7h1Var7.a();
            case 7:
                k7h1 k7h1Var8 = new k7h1();
                ((xjn) k7h1Var8).a = y6h1Var;
                ((xjn) k7h1Var8).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var8.e = ((jpk0) p6m0Var).c.c;
                return k7h1Var8.a();
            case 8:
                k7h1 k7h1Var9 = new k7h1();
                ((xjn) k7h1Var9).a = y6h1Var;
                ((xjn) k7h1Var9).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var9.e = ((k3l0) p6m0Var).b;
                return k7h1Var9.a();
            case 9:
                k7h1 k7h1Var10 = new k7h1();
                ((xjn) k7h1Var10).a = y6h1Var;
                ((xjn) k7h1Var10).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var10.e = ((w3l0) p6m0Var).b;
                return k7h1Var10.a();
            case 10:
                k7h1 k7h1Var11 = new k7h1();
                ((xjn) k7h1Var11).a = y6h1Var;
                ((xjn) k7h1Var11).b = ((u6l0) p6m0Var).c.b;
                ((xjn) k7h1Var11).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var11.a();
            case 11:
                k7h1 k7h1Var12 = new k7h1();
                ((xjn) k7h1Var12).a = y6h1Var;
                ((xjn) k7h1Var12).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var12.e = ((v8l0) p6m0Var).b;
                return k7h1Var12.a();
            case 12:
                k7h1 k7h1Var13 = new k7h1();
                ((xjn) k7h1Var13).a = y6h1Var;
                ((xjn) k7h1Var13).b = ((g5l0) p6m0Var).b;
                ((xjn) k7h1Var13).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var13.a();
            case 13:
                k7h1 k7h1Var14 = new k7h1();
                ((xjn) k7h1Var14).a = y6h1Var;
                ((xjn) k7h1Var14).b = ((zcl0) p6m0Var).a;
                ((xjn) k7h1Var14).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var14.a();
            case 14:
                k7h1 k7h1Var15 = new k7h1();
                ((xjn) k7h1Var15).a = y6h1Var;
                ((xjn) k7h1Var15).b = ((g5l0) p6m0Var).b;
                ((xjn) k7h1Var15).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var15.a();
            case 15:
                k7h1 k7h1Var16 = new k7h1();
                ((xjn) k7h1Var16).a = y6h1Var;
                ((xjn) k7h1Var16).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var16.e = ((tdl0) p6m0Var).c;
                return k7h1Var16.a();
            case 16:
                k7h1 k7h1Var17 = new k7h1();
                ((xjn) k7h1Var17).a = y6h1Var;
                ((xjn) k7h1Var17).b = ((lfl0) p6m0Var).a;
                ((xjn) k7h1Var17).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var17.a();
            case 17:
                k7h1 k7h1Var18 = new k7h1();
                ((xjn) k7h1Var18).a = y6h1Var;
                ((xjn) k7h1Var18).b = ((g5l0) p6m0Var).b;
                ((xjn) k7h1Var18).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var18.a();
            case 18:
                k7h1 k7h1Var19 = new k7h1();
                ((xjn) k7h1Var19).a = y6h1Var;
                ((xjn) k7h1Var19).b = ((fjl0) p6m0Var).b;
                ((xjn) k7h1Var19).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var19.a();
            case 19:
                k7h1 k7h1Var20 = new k7h1();
                ((xjn) k7h1Var20).a = y6h1Var;
                ((xjn) k7h1Var20).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var20.e = ((tdl0) p6m0Var).c;
                return k7h1Var20.a();
            case 20:
                k7h1 k7h1Var21 = new k7h1();
                ((xjn) k7h1Var21).a = y6h1Var;
                ((xjn) k7h1Var21).b = ((yol0) p6m0Var).a;
                ((xjn) k7h1Var21).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var21.a();
            case 21:
                k7h1 k7h1Var22 = new k7h1();
                ((xjn) k7h1Var22).a = y6h1Var;
                yxk0 yxk0Var = ((rpl0) p6m0Var).c;
                ((xjn) k7h1Var22).b = yxk0Var.b;
                ((xjn) k7h1Var22).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var22.e = yxk0Var.d;
                return k7h1Var22.a();
            case 22:
                k7h1 k7h1Var23 = new k7h1();
                ((xjn) k7h1Var23).a = y6h1Var;
                ((xjn) k7h1Var23).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var23.e = ((mjl0) ((lvl0) p6m0Var).c.c).c.c;
                return k7h1Var23.a();
            case 23:
                k7h1 k7h1Var24 = new k7h1();
                ((xjn) k7h1Var24).a = y6h1Var;
                ((xjn) k7h1Var24).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var24.e = ((mjl0) ((lvl0) p6m0Var).c.c).c.c;
                return k7h1Var24.a();
            case 24:
                k7h1 k7h1Var25 = new k7h1();
                ((xjn) k7h1Var25).a = y6h1Var;
                ((xjn) k7h1Var25).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var25.e = ((brl0) p6m0Var).c;
                return k7h1Var25.a();
            case 25:
                k7h1 k7h1Var26 = new k7h1();
                ((xjn) k7h1Var26).a = y6h1Var;
                ksk0 ksk0Var = (ksk0) p6m0Var;
                ((xjn) k7h1Var26).b = ksk0Var.b;
                ((xjn) k7h1Var26).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var26.e = ksk0Var.d;
                return k7h1Var26.a();
            case 26:
                k7h1 k7h1Var27 = new k7h1();
                ((xjn) k7h1Var27).a = y6h1Var;
                ksk0 ksk0Var2 = ((z2m0) p6m0Var).c;
                ((xjn) k7h1Var27).b = ksk0Var2.b;
                ((xjn) k7h1Var27).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var27.e = ksk0Var2.d;
                return k7h1Var27.a();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                k7h1 k7h1Var28 = new k7h1();
                ((xjn) k7h1Var28).a = y6h1Var;
                ((xjn) k7h1Var28).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var28.e = ((mjl0) p6m0Var).c.c;
                return k7h1Var28.a();
            case 28:
                k7h1 k7h1Var29 = new k7h1();
                ((xjn) k7h1Var29).a = y6h1Var;
                ((xjn) k7h1Var29).b = ((c4m0) p6m0Var).b;
                ((xjn) k7h1Var29).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var29.a();
            default:
                k7h1 k7h1Var30 = new k7h1();
                ((xjn) k7h1Var30).a = y6h1Var;
                ((xjn) k7h1Var30).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var30.e = p6m0Var.c;
                return k7h1Var30.a();
        }
    }

    public w7h1 g() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 h(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), this.b, ((rpl0) this.c).c.b, System.currentTimeMillis());
    }

    public w7h1 i() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), this.b, ((rpl0) this.c).c.b, System.currentTimeMillis());
    }

    public w7h1 j(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str)), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 k(Integer num) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("stop_preview", 1, Collections.singletonMap("duration_ms", strValueOf)), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 l() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, ((rpl0) this.c).c.b, System.currentTimeMillis());
    }

    public w7h1 m() {
        byte b = this.a;
        n8h1 n8h1Var = this.c;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 10:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, ((u6l0) n8h1Var).c.b, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, ((rpl0) n8h1Var).c.b, System.currentTimeMillis());
        }
    }

    public sqk0(g5l0 g5l0Var, String str) {
        this.c = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("header_view", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(fjl0 fjl0Var, String str, String str2) {
        this.c = fjl0Var;
        x6h1 x6h1VarC = fjl0Var.c.c();
        x6h1VarC.i.add(new a7h1("header_view_story", str, (Integer) null, str2, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(c4m0 c4m0Var) {
        this.c = c4m0Var;
        x6h1 x6h1VarC = c4m0Var.c.c();
        x6h1VarC.i.add(new a7h1("confirm_action_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(g5l0 g5l0Var, String str, byte b) {
        this.c = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("share_lyrics_selection_view", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(zcl0 zcl0Var, Integer num, String str) {
        this.c = zcl0Var;
        x6h1 x6h1VarC = zcl0Var.b.c();
        x6h1VarC.i.add(new a7h1("nominee_row", (String) null, num, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(Integer num, String str, jpk0 jpk0Var) {
        this.c = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("playlist_item", (String) null, num, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(qxk0 qxk0Var) {
        this.c = qxk0Var;
        x6h1 x6h1VarC = qxk0Var.a.c();
        x6h1VarC.i.add(new a7h1("reserved_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(jpk0 jpk0Var, sxk0 sxk0Var, Integer num) {
        this.c = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("step", sxk0Var.a, num, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(lfl0 lfl0Var) {
        this.c = lfl0Var;
        x6h1 x6h1VarC = lfl0Var.b.c();
        x6h1VarC.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(w3l0 w3l0Var) {
        this.c = w3l0Var;
        x6h1 x6h1VarC = w3l0Var.a.c();
        x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(py9 py9Var) {
        this.c = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("offline_status_item", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(int i, Integer num, String str, jpk0 jpk0Var) {
        this.c = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("release_card", v8i0.d(i), num, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(p6m0 p6m0Var) {
        this.c = p6m0Var;
        x6h1 x6h1VarC = p6m0Var.b.c();
        x6h1VarC.i.add(new a7h1("highlights_carousel", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(yol0 yol0Var) {
        this.c = yol0Var;
        x6h1 x6h1VarC = yol0Var.b.c();
        x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(k3l0 k3l0Var, String str) {
        this.c = k3l0Var;
        x6h1 x6h1VarC = k3l0Var.a.c();
        x6h1VarC.i.add(new a7h1("snackbar", "edit_note", (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(Integer num, String str, tdl0 tdl0Var) {
        this.c = tdl0Var;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("candidate_track_row", (String) null, num, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(jrk0 jrk0Var) {
        this.c = jrk0Var;
        x6h1 x6h1VarC = jrk0Var.a.c();
        x6h1VarC.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(u6l0 u6l0Var, String str) {
        this.c = u6l0Var;
        x6h1 x6h1VarC = u6l0Var.b.c();
        x6h1VarC.i.add(new a7h1("download_toggle", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(rpl0 rpl0Var, String str, Integer num, String str2, String str3) {
        this.c = rpl0Var;
        x6h1 x6h1VarC = rpl0Var.b.c();
        x6h1VarC.i.add(new a7h1("hubs_component", str, num, str3, str2));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(tdl0 tdl0Var, Integer num) {
        this.c = tdl0Var;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("grid", (String) null, num, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(v8l0 v8l0Var, int i, String str) {
        String str2;
        this.c = v8l0Var;
        x6h1 x6h1VarC = v8l0Var.a.c();
        if (i == 1) {
            str2 = "approve_artist";
        } else if (i == 2) {
            str2 = "approve_request";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "decline_request";
        }
        x6h1VarC.i.add(new a7h1("allowlisting_action_succeeded_snackbar", str2, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(jpk0 jpk0Var, Integer num, String str, byte b) {
        this.c = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("show_row", (String) null, num, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(ksk0 ksk0Var, String str) {
        this.c = ksk0Var;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("event_row", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(uvk0 uvk0Var, String str) {
        this.c = uvk0Var;
        x6h1 x6h1VarC = uvk0Var.a.c();
        x6h1VarC.i.add(new a7h1("shareable_card", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(z2m0 z2m0Var, String str) {
        this.c = z2m0Var;
        x6h1 x6h1VarC = z2m0Var.b.c();
        x6h1VarC.i.add(new a7h1("tab", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(Integer num, String str, String str2, mjl0 mjl0Var) {
        this.c = mjl0Var;
        x6h1 x6h1VarC = mjl0Var.b.c();
        x6h1VarC.i.add(new a7h1("recommendation_item", (String) null, num, str2, str));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(g5l0 g5l0Var, String str, String str2, String str3) {
        this.c = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("context_menu", str, (Integer) null, str3, str2));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(lvl0 lvl0Var, byte b) {
        this.c = lvl0Var;
        x6h1 x6h1VarC = lvl0Var.b.c();
        x6h1VarC.i.add(new a7h1("no_results_message", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public sqk0(lvl0 lvl0Var) {
        this.c = lvl0Var;
        x6h1 x6h1VarC = lvl0Var.b.c();
        x6h1VarC.i.add(new a7h1("no_results_message", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }
}
