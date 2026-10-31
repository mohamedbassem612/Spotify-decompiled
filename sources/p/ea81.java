package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ea81 {
    public static final ea81 a;
    public static final /* synthetic */ ea81[] b;

    static {
        ea81 ea81Var = new ea81("RowClicked", 0);
        a = ea81Var;
        b = new ea81[]{ea81Var};
    }

    public static ea81 valueOf(String str) {
        return (ea81) Enum.valueOf(ea81.class, str);
    }

    public static ea81[] values() {
        return (ea81[]) b.clone();
    }
}
