package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum p4l implements v190 {
    PROTOCOL_CHOICE_REASON_DEFAULT(0),
    PROTOCOL_CHOICE_REASON_USER_SELECTED(1),
    PROTOCOL_CHOICE_REASON_STREAM_EXPANSION(2),
    PROTOCOL_CHOICE_REASON_ANDROID_TV(3),
    PROTOCOL_CHOICE_REASON_TAP_DEVICE(4),
    UNRECOGNIZED(-1);

    public final int a;

    p4l(int i) {
        this.a = i;
    }

    public static p4l a(int i) {
        if (i == 0) {
            return PROTOCOL_CHOICE_REASON_DEFAULT;
        }
        if (i == 1) {
            return PROTOCOL_CHOICE_REASON_USER_SELECTED;
        }
        if (i == 2) {
            return PROTOCOL_CHOICE_REASON_STREAM_EXPANSION;
        }
        if (i == 3) {
            return PROTOCOL_CHOICE_REASON_ANDROID_TV;
        }
        if (i != 4) {
            return null;
        }
        return PROTOCOL_CHOICE_REASON_TAP_DEVICE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
