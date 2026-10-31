package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xd90 {
    public static final xd90 a;
    public static final xd90 b;
    public static final /* synthetic */ xd90[] c;

    static {
        xd90 xd90Var = new xd90("QrCode", 0);
        a = xd90Var;
        xd90 xd90Var2 = new xd90("ShareLink", 1);
        b = xd90Var2;
        c = new xd90[]{xd90Var, xd90Var2};
    }

    public static xd90 valueOf(String str) {
        return (xd90) Enum.valueOf(xd90.class, str);
    }

    public static xd90[] values() {
        return (xd90[]) c.clone();
    }
}
