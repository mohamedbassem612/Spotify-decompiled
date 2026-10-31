package p;

import com.spotify.encore.image.EncoreImageView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l04 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l04(int i, j2i j2iVar, iu30 iu30Var) {
        super(2);
        this.a = (byte) 6;
        this.c = iu30Var;
        this.b = j2iVar;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    i04 i04Var = (i04) obj4;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new ge3(iu30Var, (byte) 6);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zG2 = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new ge3(iu30Var, (byte) 7);
                        x340Var2.s0(objT2);
                    }
                    poz0.b(i04Var, function0, (qim0) null, (Function0) objT2, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                String str = (String) obj4;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zG3 = x340Var4.g(str);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new wk3(str, (byte) 8);
                        x340Var4.s0(objT3);
                    }
                    jto1.b(s161.a(nim0.a, (iu30) objT3), ago1.l(x340Var4), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, u6i.a, (xu30) null, (xu30) null, (xu30) null, apo.r(1602291388, new ub3((ed6) obj3, (byte) 10), x340Var4), x340Var4, 64, 196656, 30716);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                ((oyx) obj4).a(czo1.p(65), (j2i) obj3, (b0k) obj);
                break;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                EncoreImageView encoreImageView = (EncoreImageView) obj3;
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    cso1.d(((sux) obj4).a, EncoreImageView.y(encoreImageView), (qim0) encoreImageView.getModifierFactory().invoke(x340Var6, 0), encoreImageView.getContentScale(), (jmr0) encoreImageView.getPlaceholderFactory().invoke(x340Var6, 0), (jmr0) encoreImageView.getErrorFactory().invoke(x340Var6, 0), encoreImageView.getAlignment(), x340Var6, 294912, 128);
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                j2h1.e((ajv) obj4, (j2i) obj3, (b0k) obj, 49);
                break;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    m0n0 m0n0Var = (m0n0) obj4;
                    m0n0Var.a(new oyx[]{m0n0Var.b}, apo.r(-55417592, new ak10((j2i) obj3, (byte) 28), x340Var8), x340Var8, 56);
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                aon0.a((iu30) obj3, (j2i) obj4, (b0k) obj, czo1.p(49));
                break;
            case 7:
                ((Number) obj2).intValue();
                ((fv01) obj4).c((zu01) obj3, (b0k) obj, czo1.p(1));
                break;
            case 8:
                ((Number) obj2).intValue();
                u890.b((kc91) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                break;
            default:
                ((Number) obj2).intValue();
                ero1.e((qgi1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l04(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l04(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
