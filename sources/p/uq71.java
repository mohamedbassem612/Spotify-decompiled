package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uq71 implements k260 {
    public static final uq71 a;
    public static final uq71 b;
    public static final /* synthetic */ uq71[] c;

    static {
        uq71 uq71Var = new uq71("Curation", 0);
        a = uq71Var;
        uq71 uq71Var2 = new uq71("ContextMenu", 1);
        b = uq71Var2;
        c = new uq71[]{uq71Var, uq71Var2};
    }

    public static uq71 valueOf(String str) {
        return (uq71) Enum.valueOf(uq71.class, str);
    }

    public static uq71[] values() {
        return (uq71[]) c.clone();
    }
}
