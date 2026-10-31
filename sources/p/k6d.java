package p;

import android.view.View;
import com.spotify.messages.ConcertCampaignFlagIssueEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k6d extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ l6d b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6d(String str, l6d l6dVar) {
        super(1);
        this.c = str;
        this.b = l6dVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        l6d l6dVar = this.b;
        switch (b) {
            case 0:
                ebk ebkVarN = ConcertCampaignFlagIssueEvent.n();
                ebkVarN.n(ihc1.X0(str, ":"));
                ebkVarN.q((String) obj);
                ConcertCampaignFlagIssueEvent concertCampaignFlagIssueEventBuild = ebkVarN.build();
                t2j0 t2j0Var = l6dVar.b;
                concertCampaignFlagIssueEventBuild.getClass();
                t2j0Var.a(concertCampaignFlagIssueEventBuild);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961273});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                l6dVar.c.k(new er91((fs91) null, "", 2131961273, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                j6d j6dVar = l6dVar.a;
                j6dVar.a.setValue(new k6d(str, l6dVar));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6d(l6d l6dVar, String str) {
        super(1);
        this.b = l6dVar;
        this.c = str;
    }
}
