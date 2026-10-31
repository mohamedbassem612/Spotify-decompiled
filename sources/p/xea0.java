package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum xea0 {
    SCANNING(0, "qr"),
    DEEPLINKING(1, "share-link"),
    LOCKSCREEN_INVITATION(2, "lockscreen_invitation"),
    DISCOVERED_DEVICE(3, "discovered_device"),
    /* JADX INFO: Fake field, exist only in values array */
    NEARBY_WIFI(4, "nearby_wifi"),
    GOOGLE_MEET(5, "google_meet"),
    TAKE_OVER_DIALOG(6, "take_over_dialog"),
    NEARBY_DIALOG(7, "nearby_dialog"),
    /* JADX INFO: Fake field, exist only in values array */
    NEARBY_PUSH(8, "nearby_push"),
    /* JADX INFO: Fake field, exist only in values array */
    IPL_HOST_DIALOG(9, "ipl_host_dialog"),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_RADAR_TAP(10, "social_radar_tap"),
    SOCIAL_RADAR_INVITE(11, "social_radar_invite"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SPECIFIED(12, "not_specified"),
    LISTENING_ACTIVITY(13, "listening_activity");

    public final String a;
    public final String b;

    xea0(int i, String str) {
        this.a = str;
        this.b = str;
    }
}
