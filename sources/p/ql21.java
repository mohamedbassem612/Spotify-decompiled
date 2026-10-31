package p;

import android.os.Bundle;
import android.view.View;
import com.spotify.messages.ConcertPageFlagIssueEvent;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ql21 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ k811 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql21(String str, k811 k811Var) {
        super(1);
        this.c = str;
        this.b = k811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        k811 k811Var = this.b;
        switch (b) {
            case 0:
                cqk cqkVarN = ConcertPageFlagIssueEvent.n();
                Set set = s4b1.f;
                cqkVarN.n(uic.x(str).h());
                cqkVarN.q(((el21) obj).a);
                ConcertPageFlagIssueEvent concertPageFlagIssueEventBuild = cqkVarN.build();
                t2j0 t2j0Var = (t2j0) k811Var.d;
                concertPageFlagIssueEventBuild.getClass();
                t2j0Var.a(concertPageFlagIssueEventBuild);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961273});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                ((kt91) k811Var.c).k(new er91((fs91) null, "", 2131961273, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                vi11 vi11Var = (vi11) k811Var.b;
                ql21 ql21Var = new ql21(str, k811Var);
                if (!((xrk) vi11Var.d).n) {
                    kk21 kk21VarA = ((lk21) vi11Var.c).a();
                    th30 th30Var = (th30) vi11Var.b;
                    kk21VarA.Z1 = ql21Var;
                    kk21VarA.g1(th30Var, (String) null);
                } else {
                    ul21 ul21Var = (ul21) vi11Var.f;
                    ul21Var.a = ql21Var;
                    ul21Var.b = null;
                    ((lzn0) vi11Var.e).f(new dwn0("spotify:internal:report-concert-issue", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql21(k811 k811Var, String str) {
        super(1);
        this.b = k811Var;
        this.c = str;
    }
}
