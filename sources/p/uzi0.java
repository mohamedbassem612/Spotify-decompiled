package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uzi0 {
    public static final uzi0 a;
    public static final uzi0 b;
    public static final uzi0 c;
    public static final uzi0 d;
    public static final /* synthetic */ uzi0[] e;

    static {
        uzi0 uzi0Var = new uzi0("NONE", 0);
        a = uzi0Var;
        uzi0 uzi0Var2 = new uzi0("SEND", 1);
        b = uzi0Var2;
        uzi0 uzi0Var3 = new uzi0("SAVE_PLAYLIST", 2);
        c = uzi0Var3;
        uzi0 uzi0Var4 = new uzi0("CREATE_PLAYLIST", 3);
        d = uzi0Var4;
        e = new uzi0[]{uzi0Var, uzi0Var2, uzi0Var3, uzi0Var4};
    }

    public static uzi0 valueOf(String str) {
        return (uzi0) Enum.valueOf(uzi0.class, str);
    }

    public static uzi0[] values() {
        return (uzi0[]) e.clone();
    }
}
