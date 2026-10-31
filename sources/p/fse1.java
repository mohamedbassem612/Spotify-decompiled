package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum fse1 implements v190 {
    TIMELINE_ICON_UNSPECIFIED(0),
    TIMELINE_ICON_EVENTS(1),
    TIMELINE_ICON_USER(2),
    TIMELINE_ICON_INFORMATION(3),
    TIMELINE_ICON_SPOTIFY(4),
    TIMELINE_ICON_PLAYLIST(5),
    TIMELINE_ICON_NOTIFICATIONS(6),
    TIMELINE_ICON_NOTIFICATIONS_ACTIVE(7),
    TIMELINE_ICON_EXTERNAL_LINK(8),
    UNRECOGNIZED(-1);

    public final int a;

    fse1(int i) {
        this.a = i;
    }

    public static fse1 a(int i) {
        switch (i) {
            case 0:
                return TIMELINE_ICON_UNSPECIFIED;
            case 1:
                return TIMELINE_ICON_EVENTS;
            case 2:
                return TIMELINE_ICON_USER;
            case 3:
                return TIMELINE_ICON_INFORMATION;
            case 4:
                return TIMELINE_ICON_SPOTIFY;
            case 5:
                return TIMELINE_ICON_PLAYLIST;
            case 6:
                return TIMELINE_ICON_NOTIFICATIONS;
            case 7:
                return TIMELINE_ICON_NOTIFICATIONS_ACTIVE;
            case 8:
                return TIMELINE_ICON_EXTERNAL_LINK;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
