package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fp30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp30(String str, String str2, Function0 function0, long j, long j2, int i) {
        super(2);
        this.d = str;
        this.e = str2;
        this.f = function0;
        this.b = j;
        this.c = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                long j = this.c;
                int iP = czo1.p(1);
                wm5.k((String) obj4, (String) obj5, (Function0) obj3, this.b, j, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                long j2 = this.b;
                long j3 = this.c;
                kno1.g((ga60) obj4, (List) obj5, j2, j3, (fb60) obj3, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                long j4 = this.c;
                int iP3 = czo1.p(1);
                long j5 = this.b;
                ((hym1) obj5).e(iP3, j5, j4, (String) obj4, (b0k) obj, (qim0) obj3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp30(ga60 ga60Var, List list, long j, long j2, fb60 fb60Var, int i) {
        super(2);
        this.d = ga60Var;
        this.e = list;
        this.b = j;
        this.c = j2;
        this.f = fb60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp30(hym1 hym1Var, String str, qim0 qim0Var, long j, long j2, int i) {
        super(2);
        this.e = hym1Var;
        this.d = str;
        this.f = qim0Var;
        this.b = j;
        this.c = j2;
    }
}
