package p;

import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j351 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j351(SearchFragment searchFragment, byte b) {
        super(1);
        this.a = b;
        this.b = searchFragment;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        SearchFragment searchFragment = this.b;
        switch (b) {
            case 0:
                searchFragment.b1().f = (String) obj;
                break;
            default:
                searchFragment.b1().g = (List) obj;
                break;
        }
        return rih1Var;
    }
}
