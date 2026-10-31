package p;

import com.spotify.accountswitching.v1.Account;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum ksm1 implements v190 {
    ALBUM(0),
    ARTIST(1),
    PLAYLIST(2),
    SHOW(3),
    BOOK(4),
    EVENT(5),
    AUTHOR(7),
    DOWNLOADED(100),
    WRITABLE(101),
    BY_YOU(102),
    BY_SPOTIFY(Account.MANAGED_ACCOUNT_FIELD_NUMBER),
    UNPLAYED(Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER),
    IN_PROGRESS(105),
    FINISHED(106),
    IS_MIXED(107),
    UPCOMING(108),
    VENUE(109),
    PAST(110),
    FOLDER(111),
    PUBLISHED(112),
    PUBLISHABLE(113),
    BY_OTHERS(114),
    EXCLUDE_WORKOUT(115),
    UNRECOGNIZED(-1);

    public final int a;

    ksm1(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
