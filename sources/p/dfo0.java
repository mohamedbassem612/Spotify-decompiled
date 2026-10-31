package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dfo0 implements jq {
    public final Single c(String str, String str2, boolean z) {
        System.out.println((Object) "AccountSwitching: switchToAccount() NO-OP");
        return Single.just(Boolean.TRUE);
    }

    public final Single d(String str) {
        System.out.println((Object) "AccountSwitching: addAccountSwitchingAccount() NO-OP");
        return Single.just(Boolean.TRUE);
    }

    public final mr20 e() {
        System.out.println((Object) "AccountSwitching: getAvailableUsersFlow() NO-OP");
        return new huz(z6x.a, (byte) 10);
    }

    public final ev f() {
        return null;
    }

    public final Single g(String str) {
        System.out.println((Object) "AccountSwitching: logInToAccountSwitchingAccount() NO-OP");
        return Single.just(Boolean.TRUE);
    }

    public final Object i(e3o0 e3o0Var) {
        return z6x.a;
    }

    public final boolean j() {
        return false;
    }

    public final Single k() {
        System.out.println((Object) "AccountSwitching: getAvailableUsers() NO-OP");
        return Single.just(z6x.a);
    }
}
