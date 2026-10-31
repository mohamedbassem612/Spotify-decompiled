package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum yn11 implements v190 {
    RELATION_TYPE_UNDEFINED(0),
    RELATION_TYPE_IS_FOLLOWING(1),
    RELATION_TYPE_IS_FOLLOWED_BY(2),
    RELATION_TYPE_IS_BLOCKING(3),
    RELATION_TYPE_IS_BLOCKED_BY(4),
    RELATION_TYPE_FRIEND_REQUEST_SENT(5),
    RELATION_TYPE_FRIEND_REQUEST_RECEIVED(6),
    RELATION_TYPE_IS_FRIEND(7),
    UNRECOGNIZED(-1);

    public final int a;

    yn11(int i) {
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
