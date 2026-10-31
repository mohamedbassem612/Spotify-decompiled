package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.time.LocalDate;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jrf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jrf(xu30 xu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = xu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xu30 xu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                elb0 elb0Var = (elb0) obj;
                n511 n511VarM = nho1.v(elb0Var).M(elb0Var, true);
                xu30Var.invoke(Float.valueOf(n511VarM.a), Float.valueOf(n511VarM.b), Float.valueOf(n511VarM.c));
                return rih1Var;
            case 1:
                List list = (List) obj;
                return xu30Var.invoke(list.get(0), list.get(1), list.get(2));
            case 2:
                dm20 dm20Var = (dm20) obj;
                ol20 ol20Var = new ol20(dm20Var.a, "", 0, "", "", 3, false, false, gql.b, false, false, z6x.a, 3, nl20.e, new bm20(), dm20Var.g.a((t351) null), (Integer) null);
                vdj1 vdj1Var = dm20Var.f;
                um20 um20VarA = vdj1Var != null ? vdj1Var.a("", false) : null;
                kl20 kl20Var = dm20Var.c;
                em20 em20Var = new em20(false, false);
                if (!kl20Var.c) {
                    em20Var = null;
                }
                return xu30Var.invoke(dm20Var, l2p1.g(dm20Var, ol20Var, false, um20VarA, em20Var), (Object) null);
            default:
                LocalDate localDate = (LocalDate) obj;
                xu30Var.invoke(Integer.valueOf(localDate.getYear()), Integer.valueOf(localDate.getMonthValue() - 1), Integer.valueOf(localDate.getDayOfMonth()));
                return rih1Var;
        }
    }
}
