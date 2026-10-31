package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bx51 {
    public static final bx51 a;
    public static final bx51 b;
    public static final bx51 c;
    public static final /* synthetic */ bx51[] d;

    static {
        bx51 bx51Var = new bx51("MoveToFolder", 0);
        a = bx51Var;
        bx51 bx51Var2 = new bx51("Unpin", 1);
        b = bx51Var2;
        bx51 bx51Var3 = new bx51("Remove", 2);
        c = bx51Var3;
        d = new bx51[]{bx51Var, bx51Var2, bx51Var3};
    }

    public static bx51 valueOf(String str) {
        return (bx51) Enum.valueOf(bx51.class, str);
    }

    public static bx51[] values() {
        return (bx51[]) d.clone();
    }
}
