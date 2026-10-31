package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u991 {
    public static final u991 a;
    public static final /* synthetic */ u991[] b;

    /* JADX INFO: Fake field, exist only in values array */
    u991 EF0;

    static {
        u991 u991Var = new u991("CONNECT_ACTIVATED", 0);
        u991 u991Var2 = new u991("SLEEP_TIMER_ACTIVATED", 1);
        u991 u991Var3 = new u991("UBIQUITY_SlEEP_TIMER_UNAVAILABLE", 2);
        a = u991Var3;
        b = new u991[]{u991Var, u991Var2, u991Var3};
    }

    public static u991 valueOf(String str) {
        return (u991) Enum.valueOf(u991.class, str);
    }

    public static u991[] values() {
        return (u991[]) b.clone();
    }
}
