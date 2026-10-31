package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fk51 {
    public static final fk51 a;
    public static final /* synthetic */ fk51[] b;

    static {
        fk51 fk51Var = new fk51("Clicked", 0);
        a = fk51Var;
        b = new fk51[]{fk51Var};
    }

    public static fk51 valueOf(String str) {
        return (fk51) Enum.valueOf(fk51.class, str);
    }

    public static fk51[] values() {
        return (fk51[]) b.clone();
    }
}
