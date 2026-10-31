package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.Paragraph;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jh6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh6(zzz0 zzz0Var, qim0 qim0Var, float f, int i) {
        super(2);
        this.a = (byte) 3;
        this.d = zzz0Var;
        this.e = qim0Var;
        this.b = f;
        this.c = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.e;
        float f = this.b;
        Object obj4 = this.d;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tho1.a(f, (iu30) obj4, (xu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                yoo1.b((k37) obj4, f, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                d9y0.h(f, (Float) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                o4p1.e((zzz0) obj4, (qim0) obj3, f, b0kVar, czo1.p(i | 1));
                break;
            case 4:
                z6p1.f((Paragraph) obj4, f, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 5:
                g2p1.y((km71) obj3, f, (iu30) obj4, b0kVar, czo1.p(i | 1));
                break;
            case 6:
                kto1.n(f, (jxc1) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            default:
                pok1.c((Function0) obj4, f, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh6(Object obj, float f, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = f;
        this.e = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh6(Object obj, float f, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh6(km71 km71Var, float f, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.e = km71Var;
        this.b = f;
        this.d = iu30Var;
        this.c = i;
    }
}
