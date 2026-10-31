package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b2 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(int i, int i2, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1) {
        super(3);
        this.b = i;
        this.c = i2;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = function0;
        this.g = function1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                pro1.g((String) obj7, (String) obj6, this.b, this.c, (tn30) obj5, (cyn) obj4, (b0k) obj2, 262144);
                break;
            case 1:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    r370 r370Var = (r370) obj7;
                    wgh1 wgh1Var = (wgh1) obj6;
                    mev mevVar = (mev) obj5;
                    boolean zEquals = r370Var.equals(o7h.A0((List) obj4));
                    qim0 qim0VarB = nim0.a;
                    if (zEquals) {
                        qim0VarB = uyn1.B(qim0VarB, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    }
                    suo1.j(r370Var, this.b, this.c, wgh1Var, mevVar, qim0VarB, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj3).intValue();
                zro1.i(this.b, this.c, (iu30) obj7, (iu30) obj6, (Function0) obj5, (Function0) obj4, null, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(String str, String str2, int i, int i2, tn30 tn30Var, cyn cynVar) {
        super(3);
        this.d = str;
        this.e = str2;
        this.b = i;
        this.c = i2;
        this.f = tn30Var;
        this.g = cynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(r370 r370Var, int i, int i2, wgh1 wgh1Var, mev mevVar, List list) {
        super(3);
        this.d = r370Var;
        this.b = i;
        this.c = i2;
        this.e = wgh1Var;
        this.f = mevVar;
        this.g = list;
    }
}
