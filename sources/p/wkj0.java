package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wkj0 {
    public static final wkj0 a;
    public static final wkj0 b;
    public static final /* synthetic */ wkj0[] c;

    static {
        wkj0 wkj0Var = new wkj0("RequiredMetadataLoaded", 0);
        a = wkj0Var;
        wkj0 wkj0Var2 = new wkj0("Error", 1);
        b = wkj0Var2;
        c = new wkj0[]{wkj0Var, wkj0Var2};
    }

    public static wkj0 valueOf(String str) {
        return (wkj0) Enum.valueOf(wkj0.class, str);
    }

    public static wkj0[] values() {
        return (wkj0[]) c.clone();
    }
}
