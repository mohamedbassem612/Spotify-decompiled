package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hkf0 {
    public static final hkf0 a;
    public static final hkf0 b;
    public static final hkf0 c;
    public static final hkf0 d;
    public static final /* synthetic */ hkf0[] e;

    static {
        hkf0 hkf0Var = new hkf0("ALL_LYRICS_INCORRECT", 0);
        a = hkf0Var;
        hkf0 hkf0Var2 = new hkf0("SOME_LYRICS_INCORRECT", 1);
        b = hkf0Var2;
        hkf0 hkf0Var3 = new hkf0("SOME_TRANSLATIONS_INCORRECT", 2);
        c = hkf0Var3;
        hkf0 hkf0Var4 = new hkf0("SYNC_INCORRECT", 3);
        d = hkf0Var4;
        e = new hkf0[]{hkf0Var, hkf0Var2, hkf0Var3, hkf0Var4};
    }

    public static hkf0 valueOf(String str) {
        return (hkf0) Enum.valueOf(hkf0.class, str);
    }

    public static hkf0[] values() {
        return (hkf0[]) e.clone();
    }
}
