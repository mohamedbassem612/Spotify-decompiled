package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mgz {
    public static final mgz a;
    public static final mgz b;
    public static final mgz c;
    public static final mgz d;
    public static final mgz e;
    public static final mgz f;
    public static final mgz g;
    public static final /* synthetic */ mgz[] h;

    static {
        mgz mgzVar = new mgz("UNKNOWN_ERROR", 0);
        a = mgzVar;
        mgz mgzVar2 = new mgz("APP_ERROR", 1);
        b = mgzVar2;
        mgz mgzVar3 = new mgz("NOT_SUPPORTED", 2);
        mgz mgzVar4 = new mgz("AUTHENTICATION_EXPIRED", 3);
        c = mgzVar4;
        mgz mgzVar5 = new mgz("PREMIUM_ACCOUNT_REQUIRED", 4);
        d = mgzVar5;
        mgz mgzVar6 = new mgz("CONCURRENT_STREAM_LIMIT", 5);
        mgz mgzVar7 = new mgz("PARENTAL_CONTROL_RESTRICTED", 6);
        e = mgzVar7;
        mgz mgzVar8 = new mgz("NOT_AVAILABLE_IN_REGION", 7);
        f = mgzVar8;
        mgz mgzVar9 = new mgz("CONTENT_ALREADY_PLAYING", 8);
        mgz mgzVar10 = new mgz("SKIP_LIMIT_REACHED", 9);
        g = mgzVar10;
        h = new mgz[]{mgzVar, mgzVar2, mgzVar3, mgzVar4, mgzVar5, mgzVar6, mgzVar7, mgzVar8, mgzVar9, mgzVar10, new mgz("ACTION_ABORTED", 10), new mgz("END_OF_QUEUE", 11)};
    }

    public static mgz valueOf(String str) {
        return (mgz) Enum.valueOf(mgz.class, str);
    }

    public static mgz[] values() {
        return (mgz[]) h.clone();
    }
}
