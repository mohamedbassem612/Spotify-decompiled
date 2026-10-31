package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum rl10 implements v190 {
    UNKNOWN_FEATURE(0),
    CHAT(1),
    SPEAK(2),
    MODERATION_CONTROLS(3),
    HOST_CONTROLS(4),
    VIEW_CHAT_MESSAGES(10),
    UNRECOGNIZED(-1);

    public final int a;

    rl10(int i2) {
        this.a = i2;
    }

    public static rl10 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_FEATURE;
        }
        if (i2 == 1) {
            return CHAT;
        }
        if (i2 == 2) {
            return SPEAK;
        }
        if (i2 == 3) {
            return MODERATION_CONTROLS;
        }
        if (i2 == 4) {
            return HOST_CONTROLS;
        }
        if (i2 != 10) {
            return null;
        }
        return VIEW_CHAT_MESSAGES;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
