package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class co30 {
    public static final co30 a;
    public static final /* synthetic */ co30[] b;

    static {
        co30 co30Var = new co30("SendFriendRequestTapped", 0);
        a = co30Var;
        b = new co30[]{co30Var};
    }

    public static co30 valueOf(String str) {
        return (co30) Enum.valueOf(co30.class, str);
    }

    public static co30[] values() {
        return (co30[]) b.clone();
    }
}
