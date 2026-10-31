package p;

import com.spotify.allboarding.allboardingimpl.search.SearchFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g351 extends m1q0 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ SearchFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g351(SearchFragment searchFragment, byte b) {
        super(true);
        this.d = b;
        this.e = searchFragment;
    }

    public final void b() {
        byte b = this.d;
        SearchFragment searchFragment = this.e;
        switch (b) {
            case 0:
                searchFragment.Z0().k();
                pap1.w(searchFragment).t();
                break;
            default:
                searchFragment.b1().b.k();
                pap1.w(searchFragment).t();
                break;
        }
    }
}
