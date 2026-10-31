package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bk10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ short f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bk10(nhe0 nhe0Var, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = nhe0Var;
        this.d = z;
        this.e = function0;
        this.c = function1;
        this.g = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.f;
        Object obj3 = this.e;
        Object obj4 = this.g;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                boolean z = this.d;
                guo1.x((String) obj6, (String) obj5, z, (String) obj4, (Function0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                boolean z2 = this.d;
                lcc.o((String) obj6, (String) obj5, z2, (afx) obj4, (Function0) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(s | 1);
                boolean z3 = this.d;
                s9p1.p((nhe0) obj6, z3, (Function0) obj3, (Function0) obj5, (qim0) obj4, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(s | 1);
                boolean z4 = this.d;
                g0p1.f(z4, (Double) obj6, (Long) obj5, (Long) obj4, (Long) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bk10(String str, String str2, boolean z, Object obj, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.g = obj;
        this.e = function0;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bk10(boolean z, Double d, Long l, Long l2, Long l3, int i) {
        super(2);
        this.a = (byte) 3;
        this.d = z;
        this.b = d;
        this.c = l;
        this.g = l2;
        this.e = l3;
        this.f = i;
    }
}
