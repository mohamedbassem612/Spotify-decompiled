package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kv8 {
    public static final kv8 a;
    public static final /* synthetic */ kv8[] b;

    static {
        kv8 kv8Var = new kv8("Toggle", 0);
        a = kv8Var;
        b = new kv8[]{kv8Var};
    }

    public static kv8 valueOf(String str) {
        return (kv8) Enum.valueOf(kv8.class, str);
    }

    public static kv8[] values() {
        return (kv8[]) b.clone();
    }
}
