package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pan0 {
    public static final pan0 a;
    public static final pan0 b;
    public static final pan0 c;
    public static final /* synthetic */ pan0[] d;

    static {
        pan0 pan0Var = new pan0("MV_RELATED_ASSOCIATION_RELATION_TYPE_UNKNOWN", 0);
        a = pan0Var;
        pan0 pan0Var2 = new pan0("MV_RELATED_ASSOCIATION_RELATION_TYPE_UNSPECIFIED", 1);
        b = pan0Var2;
        pan0 pan0Var3 = new pan0("MV_RELATED_ASSOCIATION_RELATION_TYPE_OFFICIAL_MIX", 2);
        c = pan0Var3;
        d = new pan0[]{pan0Var, pan0Var2, pan0Var3};
    }

    public static pan0 valueOf(String str) {
        return (pan0) Enum.valueOf(pan0.class, str);
    }

    public static pan0[] values() {
        return (pan0[]) d.clone();
    }
}
