package p;

import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.mobius.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bl00 extends hab0 implements iu30 {
    public final /* synthetic */ el00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl00(el00 el00Var) {
        super(1);
        this.a = el00Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        String pageToken;
        tj00 tj00Var = this.a.c;
        State state = (State) tj00Var.Q0.e();
        if (state != null) {
            State.Content content = state instanceof State.Content ? (State.Content) state : null;
            if (content != null && (pageToken = content.getPageToken()) != null && (!ihc1.y0(pageToken))) {
                tj00Var.l(Event.LoadMore.INSTANCE);
            }
        }
        return rih1.a;
    }
}
