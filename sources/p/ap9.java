package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ap9 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap9(tm tmVar, byte b) {
        super(4);
        this.a = b;
        this.b = tmVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        char c;
        char c2;
        Object obj5;
        w7h1 w7h1Var;
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new euk0(((rm9) tmVar.c).a.h);
            default:
                yo9 yo9Var = (yo9) obj4;
                rm9 rm9Var = (rm9) tmVar.c;
                y6h1 y6h1Var = ((euk0) obj).a;
                boolean zEquals = yo9Var.equals(xo9.a);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:byom-npv")), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                if (yo9Var.equals(wo9.a)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str = rm9Var.a.h;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else if (yo9Var.equals(vo9.a)) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    String str2 = rm9Var.a.h;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!yo9Var.equals(to9.a)) {
                        if (!(yo9Var instanceof uo9)) {
                            eg.o();
                            return null;
                        }
                        uo9 uo9Var = (uo9) yo9Var;
                        int iOrdinal = uo9Var.a.ordinal();
                        if (iOrdinal == 0) {
                            c = 3;
                        } else if (iOrdinal == 1) {
                            c = 4;
                        } else {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    c = 2;
                                } else {
                                    eg.o();
                                }
                                return null;
                            }
                            c = 1;
                        }
                        int iOrdinal2 = uo9Var.b.ordinal();
                        if (iOrdinal2 == 0) {
                            c2 = 3;
                        } else if (iOrdinal2 == 1) {
                            c2 = 4;
                        } else if (iOrdinal2 == 2) {
                            c2 = 1;
                        } else {
                            if (iOrdinal2 != 3) {
                                eg.o();
                                return null;
                            }
                            c2 = 2;
                        }
                        z7h1 z7h1Var = new z7h1("drag", 1, b7xVar);
                        String str3 = "bottom_left";
                        if (c == 1) {
                            obj5 = "bottom_left";
                        } else if (c == 2) {
                            obj5 = "bottom_right";
                        } else if (c == 3) {
                            obj5 = "top_left";
                        } else {
                            if (c != 4) {
                                throw null;
                            }
                            obj5 = "top_right";
                        }
                        mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                        if (c2 != 1) {
                            if (c2 == 2) {
                                str3 = "bottom_right";
                            } else if (c2 == 3) {
                                str3 = "top_left";
                            } else {
                                if (c2 != 4) {
                                    throw null;
                                }
                                str3 = "top_right";
                            }
                        }
                        return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str3)})), y6h1Var, r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    String str4 = rm9Var.a.h;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop", 1, Collections.singletonMap("item_to_be_stopped", str4 != null ? str4 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
