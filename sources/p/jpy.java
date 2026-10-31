package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jpy extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpy(String str, iu30 iu30Var) {
        super(3);
        this.a = (byte) 0;
        this.c = iu30Var;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new v2y(iu30Var, (byte) 12);
                        x340Var2.s0(objT);
                    }
                    qro1.d(false, (iu30) objT, this.b, (qim0) null, false, (idn0) null, (max) null, x340Var2, 6, 120);
                }
                break;
            case 1:
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                boolean zG2 = x340Var3.g(iu30Var);
                Object objT2 = x340Var3.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new bb30(iu30Var, (byte) 26);
                    x340Var3.s0(objT2);
                }
                op71.b(0, str, (Function0) objT2, x340Var3);
                break;
            case 2:
                ((Number) obj3).intValue();
                x340 x340Var4 = (b0k) obj2;
                x340Var4.i0(959761522);
                ye5 ye5Var = new ye5();
                ye5Var.g(cwl1.o0(x340Var4, 2131956145));
                ye5Var.g(" ");
                boolean zG3 = x340Var4.g(iu30Var);
                Object objT3 = x340Var4.T();
                if (zG3 || objT3 == fkj0.X) {
                    objT3 = new ceg1(iu30Var, (byte) 20);
                    x340Var4.s0(objT3);
                }
                vhg.d(ye5Var, str, "spotify:genre:0JQ5DAqbMKFImHYGo3eTSg", (iu30) objT3);
                af5 af5VarP = ye5Var.p();
                x340Var4.r(false);
                uwr uwrVar = cbx.a;
                uwo1.d(af5VarP, cbx.a(x340Var4).b.b, (qim0) null, cbx.d(x340Var4).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var4, 0, 0, 4084);
                break;
            default:
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                x340Var5.i0(2045067566);
                ye5 ye5Var2 = new ye5();
                ye5Var2.g(cwl1.o0(x340Var5, 2131963726));
                ye5Var2.g(" ");
                boolean zG4 = x340Var5.g(iu30Var);
                Object objT4 = x340Var5.T();
                if (zG4 || objT4 == fkj0.X) {
                    objT4 = new ceg1(iu30Var, (byte) 21);
                    x340Var5.s0(objT4);
                }
                vhg.d(ye5Var2, str, "https://support.spotify.com/article/verified-by-spotify/", (iu30) objT4);
                af5 af5VarP2 = ye5Var2.p();
                x340Var5.r(false);
                uwr uwrVar2 = cbx.a;
                uwo1.d(af5VarP2, cbx.a(x340Var5).b.b, (qim0) null, cbx.d(x340Var5).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var5, 0, 0, 4084);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpy(String str, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = iu30Var;
    }
}
