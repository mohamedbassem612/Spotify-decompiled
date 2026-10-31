package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mh6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh6(int i, o17 o17Var, float f, boolean z, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.e = i;
        this.f = o17Var;
        this.d = f;
        this.b = z;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                float f = this.d;
                tho1.b(z, f, (qim0) obj4, (j2i) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z2 = this.b;
                a6o1.d((s370) obj3, z2, (qim0) obj4, this.d, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                int i2 = this.e;
                float f2 = this.d;
                boolean z3 = this.b;
                rrn1.c(i2, (o17) obj3, f2, z3, (qim0) obj4, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                boolean z4 = this.b;
                float f3 = this.d;
                pok1.b(z4, f3, (Function0) obj4, (Function0) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh6(s370 s370Var, boolean z, qim0 qim0Var, float f, int i) {
        super(2);
        this.a = (byte) 1;
        this.f = s370Var;
        this.b = z;
        this.c = qim0Var;
        this.d = f;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh6(boolean z, float f, Object obj, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.d = f;
        this.c = obj;
        this.f = cv30Var;
        this.e = i;
    }
}
