package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class est {
    public static final est a;
    public static final est b;
    public static final est c;
    public static final /* synthetic */ est[] d;

    static {
        est estVar = new est("USER_CONSENTED", 0);
        a = estVar;
        est estVar2 = new est("USER_ACCEPTED_PERMISSION_DENIED", 1);
        b = estVar2;
        est estVar3 = new est("USER_DISMISSED", 2);
        c = estVar3;
        d = new est[]{estVar, estVar2, estVar3};
    }

    public static est valueOf(String str) {
        return (est) Enum.valueOf(est.class, str);
    }

    public static est[] values() {
        return (est[]) d.clone();
    }
}
