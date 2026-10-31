package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vrp0 {
    public static final vrp0 a;
    public static final vrp0 b;
    public static final vrp0 c;
    public static final vrp0 d;
    public static final /* synthetic */ vrp0[] e;

    static {
        vrp0 vrp0Var = new vrp0("GoToYourLibraryClicked", 0);
        a = vrp0Var;
        vrp0 vrp0Var2 = new vrp0("GoToOfflineBackupClicked", 1);
        b = vrp0Var2;
        vrp0 vrp0Var3 = new vrp0("GoToAutoDownloadsClicked", 2);
        c = vrp0Var3;
        vrp0 vrp0Var4 = new vrp0("RetryLoadClicked", 3);
        d = vrp0Var4;
        e = new vrp0[]{vrp0Var, vrp0Var2, vrp0Var3, vrp0Var4};
    }

    public static vrp0 valueOf(String str) {
        return (vrp0) Enum.valueOf(vrp0.class, str);
    }

    public static vrp0[] values() {
        return (vrp0[]) e.clone();
    }
}
