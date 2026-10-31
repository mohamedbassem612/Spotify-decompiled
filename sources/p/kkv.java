package p;

import com.spotify.accountswitching.v1.Account;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kkv implements mkv {
    public static final kkv b = new kkv(0);
    public static final kkv c = new kkv(1);
    public static final kkv d = new kkv(2);
    public static final kkv e = new kkv(3);
    public static final kkv f = new kkv(4);
    public static final kkv g = new kkv(5);
    public static final kkv h = new kkv(6);
    public static final kkv i = new kkv(7);
    public static final kkv j = new kkv(8);
    public static final kkv k = new kkv(9);
    public final /* synthetic */ byte a;

    public /* synthetic */ kkv(byte b2) {
        this.a = b2;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131955862;
            case 1:
                return 2131955863;
            case 2:
                return 2131955864;
            case 3:
                return 2131955866;
            case 4:
                return 2131955865;
            case 5:
                return 2131955869;
            case 6:
                return 2131955870;
            case 7:
                return 2131955871;
            case 8:
                return 2131955867;
            default:
                return 2131955872;
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 108;
            case 1:
                return 107;
            case 2:
                return Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER;
            case 3:
                return 110;
            case 4:
                return 102;
            case 5:
                return 100;
            case 6:
                return 106;
            case 7:
                return 105;
            case 8:
                return Account.MANAGED_ACCOUNT_FIELD_NUMBER;
            default:
                return 101;
        }
    }

    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return true;
            case 8:
                return false;
            default:
                return false;
        }
    }
}
