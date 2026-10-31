package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class yjh1 {
    public static final xjh1 Companion;
    public static final znb0 a;
    public static final yjh1 b;
    public static final yjh1 c;
    public static final /* synthetic */ yjh1[] d;

    static {
        yjh1 yjh1Var = new yjh1("NOT_AVAILABLE", 0);
        b = yjh1Var;
        yjh1 yjh1Var2 = new yjh1("NOT_AVAILABLE_OFFLINE", 1);
        yjh1 yjh1Var3 = new yjh1("NOT_AVAILABLE_IN_CURRENT_REGION", 2);
        yjh1 yjh1Var4 = new yjh1("NOT_AVAILABLE_IN_NON_PREMIUM", 3);
        yjh1 yjh1Var5 = new yjh1("NOT_AVAILABLE_BY_ARTIST_BAN", 4);
        yjh1 yjh1Var6 = new yjh1("LOCAL_FILE_NOT_FOUND", 5);
        yjh1 yjh1Var7 = new yjh1("LOCAL_FILE_BAD_FORMAT", 6);
        yjh1 yjh1Var8 = new yjh1("LOCAL_FILE_DRM_PROTECTED", 7);
        yjh1 yjh1Var9 = new yjh1("USER_STREAMING_DISALLOWED", 8);
        yjh1 yjh1Var10 = new yjh1("USER_CAPPING_REACHED", 9);
        yjh1 yjh1Var11 = new yjh1("APP_IN_BACKGROUND", 10);
        c = yjh1Var11;
        d = new yjh1[]{yjh1Var, yjh1Var2, yjh1Var3, yjh1Var4, yjh1Var5, yjh1Var6, yjh1Var7, yjh1Var8, yjh1Var9, yjh1Var10, yjh1Var11, new yjh1("DRIVER_DISTRACTED", 11), new yjh1("MISSING_MANIFEST_ID", 12)};
        Companion = new xjh1();
        a = dm5.S(2, vbh1.i);
    }

    public static yjh1 valueOf(String str) {
        return (yjh1) Enum.valueOf(yjh1.class, str);
    }

    public static yjh1[] values() {
        return (yjh1[]) d.clone();
    }
}
