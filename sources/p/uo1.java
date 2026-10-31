package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uo1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ cv30 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo1(long j, Object obj, Object obj2, Object obj3, Function0 function0, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = function0;
        this.h = cv30Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.h;
        iu30 iu30Var = this.c;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                long j = this.b;
                t8p1.a(j, (rms) obj6, (n2) obj5, (vzq0) obj4, (Function0) iu30Var, (Function0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                long j2 = this.b;
                r6p1.i(j2, (u201) obj6, (List) obj5, (String) obj4, (Function0) iu30Var, (iu30) obj3, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                ftg0.h((cdo0) obj6, (ctg0) obj5, (iu30) obj4, iu30Var, (lee1) obj3, this.b, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo1(cdo0 cdo0Var, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, lee1 lee1Var, long j, int i) {
        super(2);
        this.a = (byte) 2;
        this.e = cdo0Var;
        this.f = ctg0Var;
        this.g = iu30Var;
        this.c = iu30Var2;
        this.h = lee1Var;
        this.b = j;
        this.d = i;
    }
}
