package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y3m0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ opl0 c;

    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    public y3m0(opl0 opl0Var, int i, Integer num, int i2, String str, byte b) {
        String str2;
        String str3;
        this.a = b;
        String str4 = "back";
        String str5 = "bonus";
        switch (b) {
            case 1:
                this.c = opl0Var;
                x6h1 x6h1VarC = opl0Var.c.c();
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        str5 = "rank_1_artist";
                        break;
                    case 3:
                        str5 = "rank_2_artist";
                        break;
                    case 4:
                        str5 = "rank_3_artist";
                        break;
                    case 5:
                        str5 = "rank_4_artist";
                        break;
                    case 6:
                        str5 = "rank_5_artist";
                        break;
                    default:
                        throw null;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw null;
                    }
                    str4 = "front";
                }
                x6h1VarC.i.add(new a7h1("reveal_trading_card", str5, num, str, str4));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                return;
            default:
                this.c = opl0Var;
                x6h1 x6h1VarC2 = opl0Var.c.c();
                switch (i) {
                    case 2:
                        str5 = "overview";
                    case 1:
                        str2 = str5;
                        if (i2 != 1) {
                            str3 = "back";
                        } else {
                            if (i2 == 2) {
                                throw null;
                            }
                            str3 = "front";
                        }
                        x6h1VarC2.i.add(new a7h1("list_trading_card", str2, num, str, str3));
                        x6h1VarC2.j = true;
                        this.b = x6h1VarC2.a();
                        return;
                    case 3:
                        str2 = "rank_1_artist";
                        if (i2 != 1) {
                            str3 = "back";
                        } else {
                            if (i2 == 2) {
                                throw null;
                            }
                            str3 = "front";
                        }
                        x6h1VarC2.i.add(new a7h1("list_trading_card", str2, num, str, str3));
                        x6h1VarC2.j = true;
                        this.b = x6h1VarC2.a();
                        return;
                    case 4:
                        str2 = "rank_2_artist";
                        if (i2 != 1) {
                            str3 = "back";
                        } else {
                            if (i2 == 2) {
                                throw null;
                            }
                            str3 = "front";
                        }
                        x6h1VarC2.i.add(new a7h1("list_trading_card", str2, num, str, str3));
                        x6h1VarC2.j = true;
                        this.b = x6h1VarC2.a();
                        return;
                    case 5:
                        str2 = "rank_3_artist";
                        if (i2 != 1) {
                            str3 = "back";
                        } else {
                            if (i2 == 2) {
                                throw null;
                            }
                            str3 = "front";
                        }
                        x6h1VarC2.i.add(new a7h1("list_trading_card", str2, num, str, str3));
                        x6h1VarC2.j = true;
                        this.b = x6h1VarC2.a();
                        return;
                    case 6:
                        str2 = "rank_4_artist";
                        if (i2 != 1) {
                            str3 = "back";
                        } else {
                            if (i2 == 2) {
                                throw null;
                            }
                            str3 = "front";
                        }
                        x6h1VarC2.i.add(new a7h1("list_trading_card", str2, num, str, str3));
                        x6h1VarC2.j = true;
                        this.b = x6h1VarC2.a();
                        return;
                    case 7:
                        str2 = "rank_5_artist";
                        if (i2 != 1) {
                            str3 = "back";
                        } else {
                            if (i2 == 2) {
                                throw null;
                            }
                            str3 = "front";
                        }
                        x6h1VarC2.i.add(new a7h1("list_trading_card", str2, num, str, str3));
                        x6h1VarC2.j = true;
                        this.b = x6h1VarC2.a();
                        return;
                    default:
                        throw null;
                }
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        opl0 opl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = opl0Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, (u8h1) null);
            default:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = opl0Var.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, (u8h1) null);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        opl0 opl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = opl0Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            default:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = opl0Var.b;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
        }
    }
}
