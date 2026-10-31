package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i02 {
    public static final /* synthetic */ i02[] a = {new i02("FAILURE_EVENT_UNSPECIFIED", 0), new i02("FAILURE_USER_INSUFFICIENT_TIER", 1), new i02("FAILURE_USER_UNKNOWN", 2), new i02("FAILURE_USER_CANCELLED", 3), new i02("FAILURE_USER_UNAUTHORIZED", 4), new i02("FAILURE_APP_GENERIC_ERROR", 5), new i02("FAILURE_APP_NETWORK_CONNECTIVITY", 6), new i02("FAILURE_APP_STARTUP", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    i02 EF5;

    public static i02 valueOf(String str) {
        return (i02) Enum.valueOf(i02.class, str);
    }

    public static i02[] values() {
        return (i02[]) a.clone();
    }
}
