package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class am80 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am80(yxb0 yxb0Var, byte b) {
        super(4);
        this.a = b;
        this.b = yxb0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                l6m0 l6m0Var = (l6m0) yxb0Var.g;
                int iOrdinal = ((yl80) obj).a.ordinal();
                if (iOrdinal == 0) {
                    return new z5m0(l6m0Var, (byte) 1);
                }
                if (iOrdinal == 1) {
                    return new z5m0(l6m0Var, (byte) 0);
                }
                eg.o();
                return null;
            default:
                tl80 tl80Var = (tl80) obj4;
                zl80 zl80Var = ((yl80) obj2).a;
                l6m0 l6m0Var2 = (l6m0) yxb0Var.g;
                r6h1 r6h1Var = l6m0Var2.a;
                y6h1 y6h1Var = l6m0Var2.b;
                boolean z = tl80Var instanceof rl80;
                b7x b7xVar = b7x.a;
                if (z) {
                    int iOrdinal2 = zl80Var.ordinal();
                    if (iOrdinal2 == 0) {
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("tracks_tempo_graph", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        x6h1 x6h1VarC2 = x6h1VarC.a().c();
                        x6h1VarC2.i.add(new a7h1("help_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_tooltip", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("artists_popularity_graph", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = true;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("help_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_tooltip", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    }
                } else {
                    if (!(tl80Var instanceof sl80)) {
                        eg.o();
                        return null;
                    }
                    sl80 sl80Var = (sl80) tl80Var;
                    String str = sl80Var.a;
                    int i = sl80Var.b;
                    zl80 zl80Var2 = zl80.b;
                    if (i == 1 && zl80Var == zl80Var2) {
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("artists_popularity_graph", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = true;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("highlighted_artists", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        y6h1 y6h1VarA = x6h1VarC6.a();
                        String str2 = sl80Var.a;
                        x6h1 x6h1VarC7 = y6h1VarA.c();
                        x6h1VarC7.i.add(new a7h1("least_popular_artist", (String) null, (Integer) null, str2, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), x6h1VarC7.a(), r6h1Var, System.currentTimeMillis());
                    } else if (i == 2 && zl80Var == zl80Var2) {
                        x6h1 x6h1VarC8 = y6h1Var.c();
                        x6h1VarC8.i.add(new a7h1("artists_popularity_graph", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = true;
                        x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                        x6h1VarC9.i.add(new a7h1("highlighted_artists", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC9.a();
                        String str3 = sl80Var.a;
                        x6h1 x6h1VarC10 = y6h1VarA2.c();
                        x6h1VarC10.i.add(new a7h1("most_popular_artist", (String) null, (Integer) null, str3, (String) null));
                        x6h1VarC10.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        zl80 zl80Var3 = zl80.a;
                        if (i == 1 && zl80Var == zl80Var3) {
                            x6h1 x6h1VarC11 = y6h1Var.c();
                            x6h1VarC11.i.add(new a7h1("tracks_tempo_graph", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC11.j = true;
                            x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                            x6h1VarC12.i.add(new a7h1("highlighted_tracks", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC12.j = false;
                            y6h1 y6h1VarA3 = x6h1VarC12.a();
                            String str4 = sl80Var.a;
                            x6h1 x6h1VarC13 = y6h1VarA3.c();
                            x6h1VarC13.i.add(new a7h1("lowest_tempo_track", (String) null, (Integer) null, str4, (String) null));
                            x6h1VarC13.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str != null ? str : "")), x6h1VarC13.a(), r6h1Var, System.currentTimeMillis());
                        } else {
                            if (i != 2 || zl80Var != zl80Var3) {
                                return null;
                            }
                            x6h1 x6h1VarC14 = y6h1Var.c();
                            x6h1VarC14.i.add(new a7h1("tracks_tempo_graph", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC14.j = true;
                            x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                            x6h1VarC15.i.add(new a7h1("highlighted_tracks", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC15.j = false;
                            y6h1 y6h1VarA4 = x6h1VarC15.a();
                            String str5 = sl80Var.a;
                            x6h1 x6h1VarC16 = y6h1VarA4.c();
                            x6h1VarC16.i.add(new a7h1("highest_tempo_track", (String) null, (Integer) null, str5, (String) null));
                            x6h1VarC16.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str != null ? str : "")), x6h1VarC16.a(), r6h1Var, System.currentTimeMillis());
                        }
                    }
                }
                return w7h1Var;
        }
    }
}
