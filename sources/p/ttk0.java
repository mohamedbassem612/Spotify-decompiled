package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ttk0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;

    public ttk0(xok0 xok0Var, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                x6h1 x6h1VarC = xok0Var.b.c();
                x6h1VarC.i.add(new a7h1("played_receipts_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            case 4:
                x6h1 x6h1VarC2 = xok0Var.b.c();
                x6h1VarC2.i.add(new a7h1("saved_receipts_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
            case 5:
                x6h1 x6h1VarC3 = xok0Var.b.c();
                x6h1VarC3.i.add(new a7h1("seen_receipts_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                this.b = x6h1VarC3.a();
                break;
            case 6:
                x6h1 x6h1VarC4 = xok0Var.b.c();
                x6h1VarC4.i.add(new a7h1("setting_disabled_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                this.b = x6h1VarC4.a();
                break;
            default:
                x6h1 x6h1VarC5 = xok0Var.b.c();
                x6h1VarC5.i.add(new a7h1("listening_activity_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                this.b = x6h1VarC5.a();
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
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 11:
                r6h1 r6h1Var12 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 12:
                r6h1 r6h1Var13 = r6h1.c;
                r6h1 r6h1Var14 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                return c13.m(arrayList, z6xVar, y6h1Var, arrayList, (u8h1) null);
            case 13:
                r6h1 r6h1Var15 = r6h1.c;
                r6h1 r6h1Var16 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                return c13.m(arrayList2, z6xVar, y6h1Var, arrayList2, (u8h1) null);
            case 14:
                r6h1 r6h1Var17 = r6h1.c;
                r6h1 r6h1Var18 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                return c13.m(arrayList3, z6xVar, y6h1Var, arrayList3, (u8h1) null);
            case 15:
                r6h1 r6h1Var19 = r6h1.c;
                r6h1 r6h1Var20 = r6h1.c;
                ArrayList arrayList4 = new ArrayList();
                return c13.m(arrayList4, z6xVar, y6h1Var, arrayList4, (u8h1) null);
            case 16:
                r6h1 r6h1Var21 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            case 17:
                r6h1 r6h1Var22 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
            default:
                r6h1 r6h1Var23 = r6h1.c;
                return new r6h1(kk0.l(y6h1Var), (u8h1) null);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 2:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
            case 3:
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1Var;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 4:
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1Var;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var5.a();
            case 5:
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1Var;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var6.a();
            case 6:
                k7h1 k7h1Var7 = new k7h1();
                ((xjn) k7h1Var7).a = y6h1Var;
                ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var7.a();
            case 7:
                k7h1 k7h1Var8 = new k7h1();
                ((xjn) k7h1Var8).a = y6h1Var;
                ((xjn) k7h1Var8).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var8.a();
            case 8:
                k7h1 k7h1Var9 = new k7h1();
                ((xjn) k7h1Var9).a = y6h1Var;
                ((xjn) k7h1Var9).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var9.a();
            case 9:
                k7h1 k7h1Var10 = new k7h1();
                ((xjn) k7h1Var10).a = y6h1Var;
                ((xjn) k7h1Var10).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var10.a();
            case 10:
                k7h1 k7h1Var11 = new k7h1();
                ((xjn) k7h1Var11).a = y6h1Var;
                ((xjn) k7h1Var11).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var11.a();
            case 11:
                k7h1 k7h1Var12 = new k7h1();
                ((xjn) k7h1Var12).a = y6h1Var;
                ((xjn) k7h1Var12).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var12.a();
            case 12:
                k7h1 k7h1Var13 = new k7h1();
                ((xjn) k7h1Var13).a = y6h1Var;
                ((xjn) k7h1Var13).b = r6h1.c;
                ((xjn) k7h1Var13).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var13.a();
            case 13:
                k7h1 k7h1Var14 = new k7h1();
                ((xjn) k7h1Var14).a = y6h1Var;
                ((xjn) k7h1Var14).b = r6h1.c;
                ((xjn) k7h1Var14).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var14.a();
            case 14:
                k7h1 k7h1Var15 = new k7h1();
                ((xjn) k7h1Var15).a = y6h1Var;
                ((xjn) k7h1Var15).b = r6h1.c;
                ((xjn) k7h1Var15).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var15.a();
            case 15:
                k7h1 k7h1Var16 = new k7h1();
                ((xjn) k7h1Var16).a = y6h1Var;
                ((xjn) k7h1Var16).b = r6h1.c;
                ((xjn) k7h1Var16).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var16.a();
            case 16:
                k7h1 k7h1Var17 = new k7h1();
                ((xjn) k7h1Var17).a = y6h1Var;
                ((xjn) k7h1Var17).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var17.a();
            case 17:
                k7h1 k7h1Var18 = new k7h1();
                ((xjn) k7h1Var18).a = y6h1Var;
                ((xjn) k7h1Var18).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var18.a();
            default:
                k7h1 k7h1Var19 = new k7h1();
                ((xjn) k7h1Var19).a = y6h1Var;
                ((xjn) k7h1Var19).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var19.a();
        }
    }

    public w7h1 h(int i, int i2) {
        Object obj;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = "disabled";
        if (i == 1) {
            obj = "disabled";
        } else {
            if (i != 2) {
                throw null;
            }
            obj = "enabled";
        }
        mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
        if (i2 != 1) {
            if (i2 != 2) {
                throw null;
            }
            str = "enabled";
        }
        return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 i(int i, int i2) {
        Object obj;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = "disabled";
        if (i == 1) {
            obj = "disabled";
        } else {
            if (i != 2) {
                throw null;
            }
            obj = "enabled";
        }
        mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
        if (i2 != 1) {
            if (i2 != 2) {
                throw null;
            }
            str = "enabled";
        }
        return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 j(int i, int i2) {
        Object obj;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = "disabled";
        if (i == 1) {
            obj = "disabled";
        } else {
            if (i != 2) {
                throw null;
            }
            obj = "enabled";
        }
        mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
        if (i2 != 1) {
            if (i2 != 2) {
                throw null;
            }
            str = "enabled";
        }
        return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 k(int i, int i2) {
        Object obj;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = "disabled";
        if (i == 1) {
            obj = "disabled";
        } else {
            if (i != 2) {
                throw null;
            }
            obj = "enabled";
        }
        mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
        if (i2 != 1) {
            if (i2 != 2) {
                throw null;
            }
            str = "enabled";
        }
        return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), this.b, r6h1.c, System.currentTimeMillis());
    }

    public nqk0 l() {
        return new nqk0(this);
    }

    public ttk0(lgl0 lgl0Var) {
        this.a = (byte) 13;
        x6h1 x6h1VarC = lgl0Var.a.c();
        x6h1VarC.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public ttk0(utk0 utk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                x6h1 x6h1VarC = utk0Var.a.c();
                x6h1VarC.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = utk0Var.a.c();
                x6h1VarC2.i.add(new a7h1("allow_access_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public ttk0(ttk0 ttk0Var) {
        this.a = (byte) 12;
        x6h1 x6h1VarC = ttk0Var.b.c();
        x6h1VarC.i.add(new a7h1("context_menu_sheet", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public ttk0(xok0 xok0Var, byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 10:
                x6h1 x6h1VarC = xok0Var.b.c();
                x6h1VarC.i.add(new a7h1("switch_country_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = xok0Var.b.c();
                x6h1VarC2.i.add(new a7h1("country_mismatch_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public ttk0(ngl0 ngl0Var, String str, Integer num) {
        this.a = (byte) 15;
        x6h1 x6h1VarC = ngl0Var.a.c();
        x6h1VarC.i.add(new a7h1("context_menu_button", str, num, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public ttk0(dsk0 dsk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 8:
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("learn_more_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            default:
                x6h1 x6h1VarC2 = dsk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public ttk0(ttk0 ttk0Var, String str, Integer num) {
        this.a = (byte) 14;
        x6h1 x6h1VarC = ttk0Var.b.c();
        x6h1VarC.i.add(new a7h1("context_menu_sheet", str, num, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public ttk0(dsk0 dsk0Var, char c) {
        this.a = (byte) 11;
        x6h1 x6h1VarC = dsk0Var.b.c();
        x6h1VarC.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public ttk0(r6m0 r6m0Var, String str, byte b) {
        this.a = b;
        switch (b) {
            case 17:
                x6h1 x6h1VarC = r6m0Var.a.c();
                x6h1VarC.i.add(new a7h1("no_stats_available_no_music_listened_current_period", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            case 18:
                x6h1 x6h1VarC2 = r6m0Var.a.c();
                x6h1VarC2.i.add(new a7h1("no_stats_available_no_music_listened_prior_period", str, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
            default:
                x6h1 x6h1VarC3 = r6m0Var.a.c();
                x6h1VarC3.i.add(new a7h1("no_stats_available_no_data_generated", str, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                this.b = x6h1VarC3.a();
                break;
        }
    }
}
