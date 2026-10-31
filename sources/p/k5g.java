package p;

import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k5g implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k5g(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onResume(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                f5g f5gVar = ChoiceScreenUcActivity.y1;
                ((ChoiceScreenUcActivity) obj).m0().U(l7g.a);
                break;
            case 1:
                ((jvn0) obj).c();
                break;
            case 2:
                p68 p68Var = (p68) obj;
                if (p68Var.a) {
                    ((n2s0) p68Var.g).b.l(rih1.a);
                }
                break;
            case 3:
                vl61 vl61Var = (vl61) obj;
                Disposable disposable = vl61Var.e;
                if (disposable != null) {
                    disposable.dispose();
                }
                q7b1 q7b1Var = vl61Var.a;
                q7b1Var.getClass();
                vl61Var.e = Single.fromCallable(new sra(q7b1Var, (byte) 24)).flatMapCompletable(new zb91(q7b1Var, (byte) 4)).subscribe();
                break;
            default:
                int i = SpotifyCheckoutActivity.D1;
                ((SpotifyCheckoutActivity) obj).m0().U(p400.a);
                break;
        }
    }
}
