package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rta0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rta0(int i, int i2, Function0 function0, boolean z) {
        super(2);
        this.a = (byte) 0;
        this.c = function0;
        this.b = z;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.e;
        int i = this.d;
        Object obj3 = this.c;
        boolean z = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ltn1.i(czo1.p(i | 1), b2, (Function0) obj3, b0kVar, z);
                break;
            case 1:
                poz0.c(czo1.p(i | 1), b2, (Function0) obj3, b0kVar, z);
                break;
            default:
                o6p1.j(czo1.p(i | 1), b2, b0kVar, (qim0) obj3, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rta0(byte b, int i, int i2, Object obj, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = i;
        this.e = i2;
    }
}
