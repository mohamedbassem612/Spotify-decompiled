package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aof1 {
    public static final aof1 a;
    public static final aof1 b;
    public static final /* synthetic */ aof1[] c;

    static {
        aof1 aof1Var = new aof1("LEFT", 0);
        a = aof1Var;
        aof1 aof1Var2 = new aof1("RIGHT", 1);
        b = aof1Var2;
        c = new aof1[]{aof1Var, aof1Var2};
    }

    public static aof1 valueOf(String str) {
        return (aof1) Enum.valueOf(aof1.class, str);
    }

    public static aof1[] values() {
        return (aof1[]) c.clone();
    }
}
