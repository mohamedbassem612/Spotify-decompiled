package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class me90 {
    public static final me90 a;
    public static final me90 b;
    public static final me90 c;
    public static final me90 d;
    public static final me90 e;
    public static final /* synthetic */ me90[] f;

    static {
        me90 me90Var = new me90("Initial", 0);
        a = me90Var;
        me90 me90Var2 = new me90("Loading", 1);
        b = me90Var2;
        me90 me90Var3 = new me90("Invited", 2);
        c = me90Var3;
        me90 me90Var4 = new me90("TransientFailure", 3);
        d = me90Var4;
        me90 me90Var5 = new me90("PermanentFailure", 4);
        e = me90Var5;
        f = new me90[]{me90Var, me90Var2, me90Var3, me90Var4, me90Var5};
    }

    public static me90 valueOf(String str) {
        return (me90) Enum.valueOf(me90.class, str);
    }

    public static me90[] values() {
        return (me90[]) f.clone();
    }
}
