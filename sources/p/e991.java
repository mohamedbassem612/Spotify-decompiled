package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e991 {
    public static final e991 a;
    public static final /* synthetic */ e991[] b;

    /* JADX INFO: Fake field, exist only in values array */
    e991 EF0;

    static {
        e991 e991Var = new e991("RequestFailed", 0);
        e991 e991Var2 = new e991("UnsupportedDevice", 1);
        a = e991Var2;
        b = new e991[]{e991Var, e991Var2};
    }

    public static e991 valueOf(String str) {
        return (e991) Enum.valueOf(e991.class, str);
    }

    public static e991[] values() {
        return (e991[]) b.clone();
    }
}
