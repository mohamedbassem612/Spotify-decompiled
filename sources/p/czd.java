package p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class czd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarouselFragment b;
    public final /* synthetic */ po41 c;
    public final /* synthetic */ xok0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czd(po41 po41Var, CarouselFragment carouselFragment, xok0 xok0Var) {
        super(2);
        this.a = (byte) 0;
        this.c = po41Var;
        this.b = carouselFragment;
        this.d = xok0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        byte b = this.a;
        xok0 xok0Var = this.d;
        rih1 rih1Var = rih1.a;
        po41 po41Var = this.c;
        CarouselFragment carouselFragment = this.b;
        boolean z = false;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c380 c380VarA = mqo1.A(po41Var.a);
                    String str = po41Var.b;
                    zau0 zau0Var = carouselFragment.R1;
                    boolean zI = x340Var2.i(carouselFragment);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        azd azdVar = new azd(carouselFragment, (byte) 0);
                        x340Var2.s0(azdVar);
                        obj3 = azdVar;
                    }
                    Function0 function0 = (Function0) obj3;
                    boolean zI2 = x340Var2.i(carouselFragment);
                    Object objT2 = x340Var2.T();
                    Object obj5 = objT2;
                    if (zI2 || objT2 == m4cVar) {
                        bzd bzdVar = new bzd(carouselFragment, z ? (byte) 1 : (byte) 0);
                        x340Var2.s0(bzdVar);
                        obj5 = bzdVar;
                    }
                    vu30 vu30Var = (vu30) obj5;
                    boolean zI3 = x340Var2.i(carouselFragment);
                    Object objT3 = x340Var2.T();
                    Object obj6 = objT3;
                    if (zI3 || objT3 == m4cVar) {
                        bzd bzdVar2 = new bzd(carouselFragment, b3);
                        x340Var2.s0(bzdVar2);
                        obj6 = bzdVar2;
                    }
                    wgo1.e(c380VarA, str, zau0Var, function0, vu30Var, (vu30) obj6, (qim0) null, true, this.d, x340Var2, 12582912, 64);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (carouselFragment.K1) {
                    x340Var4.i0(62106188);
                    qsw.a(apo.r(-2035917441, new czd(po41Var, carouselFragment, xok0Var), x340Var4), x340Var4);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(62855551);
                    c380 c380VarA2 = mqo1.A(po41Var.a);
                    String str2 = po41Var.b;
                    zau0 zau0Var2 = carouselFragment.R1;
                    boolean zI4 = x340Var4.i(carouselFragment);
                    Object objT4 = x340Var4.T();
                    if (zI4 || objT4 == m4cVar2) {
                        obj4 = objT4;
                        azd azdVar2 = new azd(carouselFragment, (byte) 1);
                        x340Var4.s0(azdVar2);
                        obj4 = azdVar2;
                    }
                    Function0 function1 = (Function0) obj4;
                    boolean zI5 = x340Var4.i(carouselFragment);
                    Object objT5 = x340Var4.T();
                    Object obj7 = objT5;
                    if (zI5 || objT5 == m4cVar2) {
                        bzd bzdVar3 = new bzd(carouselFragment, b2);
                        x340Var4.s0(bzdVar3);
                        obj7 = bzdVar3;
                    }
                    vu30 vu30Var2 = (vu30) obj7;
                    boolean zI6 = x340Var4.i(carouselFragment);
                    Object objT6 = x340Var4.T();
                    Object obj8 = objT6;
                    if (zI6 || objT6 == m4cVar2) {
                        bzd bzdVar4 = new bzd(carouselFragment, (byte) 3);
                        x340Var4.s0(bzdVar4);
                        obj8 = bzdVar4;
                    }
                    wgo1.e(c380VarA2, str2, zau0Var2, function1, vu30Var2, (vu30) obj8, (qim0) null, false, (xok0) null, x340Var4, 12582912, 320);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(1345972835, new czd(carouselFragment, po41Var, xok0Var, b3), x340Var6), x340Var6, 3078, 6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = carouselFragment.G1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(-989228906, new czd(carouselFragment, po41Var, xok0Var, b2), x340Var8), x340Var8, 56);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ czd(CarouselFragment carouselFragment, po41 po41Var, xok0 xok0Var, byte b) {
        super(2);
        this.a = b;
        this.b = carouselFragment;
        this.c = po41Var;
        this.d = xok0Var;
    }
}
