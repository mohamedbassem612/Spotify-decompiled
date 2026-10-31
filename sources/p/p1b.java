package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p1b extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1b(txj txjVar, String str, cxc0 cxc0Var, int i, int i2) {
        super(2);
        this.a = (byte) 29;
        this.c = txjVar;
        this.d = str;
        this.e = cxc0Var;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((ldo) obj5).q((o1b) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                vu30 vu30Var = (vu30) obj3;
                ic9 ic9Var = (ic9) obj4;
                ktc1 ktc1Var = (ktc1) obj5;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = ktc1Var.a;
                    boolean zI = x340Var2.i(ic9Var);
                    int i2 = this.b;
                    boolean zE = x340Var2.e(i2) | zI | x340Var2.i(ktc1Var) | x340Var2.g(vu30Var);
                    Object objT = x340Var2.T();
                    if (zE || objT == fkj0.X) {
                        ka0 ka0Var = new ka0(ic9Var, i2, ktc1Var, vu30Var, (byte) 3);
                        x340Var2.s0(ka0Var);
                        objT = ka0Var;
                    }
                    m3b.d(0, str, (Function0) objT, x340Var2, (qim0) null);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                ((cnb) obj5).f((c380) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                s110.c((otn0) obj5, (Float) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                fdg1.b((kat) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                xyn1.b((jgd) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                ggo1.d(obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                fho1.a((zxd) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                d1e.c((evl) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                d1e.d((dwl) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                d1e.e((jvl) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                dio1.c((List) obj5, (j6e) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                ajo1.b((w8e) obj5, (g9e) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                ejo1.b((e9e) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                rjo1.a((sb81) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                ((eme) obj5).c((yle) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 16:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                ioo1.b((xtb0) obj5, (String) obj4, this.b, (Function0) obj3, (b0k) obj, iP);
                break;
            case 17:
                ((Number) obj2).intValue();
                ((eve) obj5).c((bve) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                ((cp31) obj5).n((vzq0) obj4, (epo1) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                ((inf) obj5).f(czo1.p(i | 1), (Function0) obj4, (b0k) obj, (iu30) obj3);
                break;
            case 20:
                ((Number) obj2).intValue();
                ((rwj) obj5).i((wpf) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 21:
                ((Number) obj2).intValue();
                hxo1.j((String) obj5, (yf) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 22:
                ((Number) obj2).intValue();
                fyo1.b((qzf) obj5, (vzq0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 23:
                ((Number) obj2).intValue();
                j0p1.a((qat) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 24:
                ((Number) obj2).intValue();
                n1p1.j((y7e1) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 25:
                ((Number) obj2).intValue();
                ((f70) obj5).d((q6h) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 26:
                ((Number) obj2).intValue();
                ((oih) obj5).k((fih) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 27:
                ((Number) obj2).intValue();
                z6p1.d((ljh) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 28:
                ((Number) obj2).intValue();
                ((luj) obj5).b((lzn0) obj4, (hvl1) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                ((txj) obj5).e((String) obj4, (cxc0) obj3, this.b, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1b(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1b(byte b, int i, Object obj, iu30 iu30Var, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.c = obj;
        this.e = iu30Var;
        this.d = qim0Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1b(xtb0 xtb0Var, String str, int i, Function0 function0, int i2) {
        super(2);
        this.a = (byte) 16;
        this.c = xtb0Var;
        this.d = str;
        this.b = i;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1b(ktc1 ktc1Var, ic9 ic9Var, int i, vu30 vu30Var) {
        super(2);
        this.a = (byte) 1;
        this.c = ktc1Var;
        this.d = ic9Var;
        this.b = i;
        this.e = vu30Var;
    }
}
