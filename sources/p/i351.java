package p;

import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i351 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i351(SearchFragment searchFragment, byte b) {
        super(0);
        this.a = b;
        this.b = searchFragment;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        SearchFragment searchFragment = this.b;
        switch (b) {
            case 0:
                if (searchFragment.q0()) {
                    pap1.w(searchFragment).t();
                }
                return rih1Var;
            case 1:
                if (searchFragment.q0()) {
                    pap1.w(searchFragment).t();
                }
                return rih1Var;
            default:
                ld51 ld51Var = searchFragment.J1;
                if (ld51Var != null) {
                    return ld51Var;
                }
                u890.C("viewModelFactory");
                throw null;
        }
    }
}
