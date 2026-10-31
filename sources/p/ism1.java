package p;

import com.spotify.accountswitching.v1.Account;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ism1 implements c290, agp1, vcp1, jgg1 {
    public static final /* synthetic */ ism1 a = new ism1();
    public static final /* synthetic */ ism1 b = new ism1();

    public /* synthetic */ pno1 a(kap1 kap1Var, a2x0 a2x0Var) {
        return wfn1.b(kap1Var);
    }

    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    public Object convert(int i) {
        ksm1 ksm1Var;
        if (i == 0) {
            ksm1Var = ksm1.ALBUM;
        } else if (i == 1) {
            ksm1Var = ksm1.ARTIST;
        } else if (i == 2) {
            ksm1Var = ksm1.PLAYLIST;
        } else if (i == 3) {
            ksm1Var = ksm1.SHOW;
        } else if (i == 4) {
            ksm1Var = ksm1.BOOK;
        } else if (i == 5) {
            ksm1Var = ksm1.EVENT;
        } else if (i != 7) {
            switch (i) {
                case 100:
                    ksm1Var = ksm1.DOWNLOADED;
                    break;
                case 101:
                    ksm1Var = ksm1.WRITABLE;
                    break;
                case 102:
                    ksm1Var = ksm1.BY_YOU;
                    break;
                case Account.MANAGED_ACCOUNT_FIELD_NUMBER /* 103 */:
                    ksm1Var = ksm1.BY_SPOTIFY;
                    break;
                case Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER /* 104 */:
                    ksm1Var = ksm1.UNPLAYED;
                    break;
                case 105:
                    ksm1Var = ksm1.IN_PROGRESS;
                    break;
                case 106:
                    ksm1Var = ksm1.FINISHED;
                    break;
                case 107:
                    ksm1Var = ksm1.IS_MIXED;
                    break;
                case 108:
                    ksm1Var = ksm1.UPCOMING;
                    break;
                case 109:
                    ksm1Var = ksm1.VENUE;
                    break;
                case 110:
                    ksm1Var = ksm1.PAST;
                    break;
                case 111:
                    ksm1Var = ksm1.FOLDER;
                    break;
                case 112:
                    ksm1Var = ksm1.PUBLISHED;
                    break;
                case 113:
                    ksm1Var = ksm1.PUBLISHABLE;
                    break;
                case 114:
                    ksm1Var = ksm1.BY_OTHERS;
                    break;
                case 115:
                    ksm1Var = ksm1.EXCLUDE_WORKOUT;
                    break;
                default:
                    ksm1Var = null;
                    break;
            }
        } else {
            ksm1Var = ksm1.AUTHOR;
        }
        return ksm1Var == null ? ksm1.UNRECOGNIZED : ksm1Var;
    }
}
