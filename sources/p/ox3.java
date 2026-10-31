package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ox3 {
    public static final ox3 a;
    public static final ox3 b;
    public static final ox3 c;
    public static final /* synthetic */ ox3[] d;

    static {
        ox3 ox3Var = new ox3("PENDING", 0);
        a = ox3Var;
        ox3 ox3Var2 = new ox3("APPROVED", 1);
        b = ox3Var2;
        ox3 ox3Var3 = new ox3("DECLINED", 2);
        c = ox3Var3;
        d = new ox3[]{ox3Var, ox3Var2, ox3Var3};
    }

    public static ox3 valueOf(String str) {
        return (ox3) Enum.valueOf(ox3.class, str);
    }

    public static ox3[] values() {
        return (ox3[]) d.clone();
    }
}
