package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ene1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ene1(z5q0 z5q0Var, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 4;
        this.c = z5q0Var;
        this.b = z;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        boolean z = this.b;
        Object obj4 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                vnr0 vnr0VarA = (vnr0) obj4;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (!z) {
                        vnr0VarA = vnr0.a((vnr0) obj3, vnr0VarA.a, null, null, 0L, 30);
                    }
                    qgo1.f(vnr0VarA, null, null, 0, false, null, x340Var2, 8, 62);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    otw.c((evt0) ((uef1) obj4).X.getValue(), cvt0.a(((pef1) obj3).c, z), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                ((sog1) obj4).h((WidgetState) obj3, z, (b0k) obj, czo1.p(1));
                break;
            case 3:
                ((Number) obj2).intValue();
                fqo1.e((y7e1) obj4, (y7e1) obj3, z, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                qro1.l((z5q0) obj4, z, (qim0) obj3, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ene1(Object obj, Object obj2, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ene1(uef1 uef1Var, pef1 pef1Var, boolean z) {
        super(2);
        this.a = (byte) 1;
        this.c = uef1Var;
        this.d = pef1Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ene1(boolean z, vnr0 vnr0Var, vnr0 vnr0Var2) {
        super(2);
        this.a = (byte) 0;
        this.b = z;
        this.c = vnr0Var;
        this.d = vnr0Var2;
    }
}
