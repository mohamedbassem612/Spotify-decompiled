package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum fi9 {
    UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(1),
    ANDROID(2),
    /* JADX INFO: Fake field, exist only in values array */
    TV_OS(3),
    /* JADX INFO: Fake field, exist only in values array */
    APPLE_WATCH(4),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_WEAR(5),
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP_WINDOWS(6),
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP_MACOS(7),
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP_LINUX(8),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_AUTOMOTIVE(9),
    ANDROID_TV(10),
    /* JADX INFO: Fake field, exist only in values array */
    SPEAKER(11),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER_TV(12),
    /* JADX INFO: Fake field, exist only in values array */
    AVR(13),
    /* JADX INFO: Fake field, exist only in values array */
    STB(14),
    /* JADX INFO: Fake field, exist only in values array */
    GAME_CONSOLE(15),
    /* JADX INFO: Fake field, exist only in values array */
    AUTOMOBILE(16);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    fi9(int i) {
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String a() throws NoWhenBranchMatchedException {
        switch (this) {
            case UNKNOWN:
                return "unknown";
            case IOS:
                return "ios";
            case ANDROID:
                return "android";
            case TV_OS:
                return "tvos";
            case APPLE_WATCH:
                return "apple_watch";
            case ANDROID_WEAR:
                return "android_wear";
            case DESKTOP_WINDOWS:
                return "desktop_windows";
            case DESKTOP_MACOS:
                return "desktop_macos";
            case DESKTOP_LINUX:
                return "desktop_linux";
            case ANDROID_AUTOMOTIVE:
                return "android_automotive";
            case ANDROID_TV:
                return "android_tv";
            case SPEAKER:
                return "speaker";
            case OTHER_TV:
                return "other_tv";
            case AVR:
                return "avr";
            case STB:
                return "stb";
            case GAME_CONSOLE:
                return "game_console";
            case AUTOMOBILE:
                return "automobile";
            default:
                eg.o();
                return null;
        }
    }
}
