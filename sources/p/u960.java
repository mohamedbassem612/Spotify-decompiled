package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u960 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u960(long j, long j2, long j3, String str, qim0 qim0Var, int i) {
        super(2);
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP = czo1.p(1);
                v960.a(this.b, this.c, this.d, (String) obj4, qim0Var, (b0k) obj, iP);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fr21 fr21Var = (fr21) obj4;
                    gje1 gje1Var = new gje1(new rte1(new pte1(bnx.c), (String) null, (Long) null, cwl1.o0(x340Var2, 2131961298), cwl1.n0(2131961297, new Object[]{"{{COUNTDOWN}}"}, x340Var2), 1, Long.valueOf(this.b), new lte1(cwl1.o0(x340Var2, 2131961296), (uqe1) null, (jte1) null, (kte1) null, false, false, false, 254), (nte1) null, (String) null, new u7h(this.c), new u7h(this.d), true, true, true, (pje1) null), Collections.singletonList(new uue1(new sue1(grx.c), cwl1.o0(x340Var2, 2131961299), fr21Var != null ? fr21Var.b.atOffset(fr21Var.c).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT)) : null, 1, (Long) null, (String) null, (uqe1) null, true, false, false, false, (pje1) null, 1)), (String) null);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = pl21.X0;
                        x340Var2.s0(objT);
                    }
                    rje1.e(gje1Var, (iu30) objT, (yqg) obj3, (qim0) null, (hje1) null, true, x340Var2, 196664, 24);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u960(long j, long j2, long j3, fr21 fr21Var, yqg yqgVar) {
        super(2);
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = fr21Var;
        this.f = yqgVar;
    }
}
