package p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class efo0 implements oq {
    public final Single a(String str) {
        System.out.println((Object) "AccountSwitching: removeUserInfo() NO-OP");
        return Single.just(Boolean.FALSE);
    }

    public final Single b(mlb1 mlb1Var) {
        System.out.println((Object) "AccountSwitching: saveCurrentUser() NO-OP");
        return Single.just(k941.a);
    }

    public final Single h(ArrayList arrayList) {
        System.out.println((Object) "AccountSwitching: saveUsers() NO-OP");
        return Single.just(Boolean.FALSE);
    }

    public final void l() {
        System.out.println((Object) "AccountSwitching: clearCredentials() NO-OP");
    }
}
