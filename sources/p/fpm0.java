package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fpm0 {
    public static final fpm0 a;
    public static final fpm0 b;
    public static final fpm0 c;
    public static final /* synthetic */ fpm0[] d;

    static {
        fpm0 fpm0Var = new fpm0("EVERYTHING_IN_SYNC", 0);
        a = fpm0Var;
        fpm0 fpm0Var2 = new fpm0("SOMETHING_SYNCED", 1);
        b = fpm0Var2;
        fpm0 fpm0Var3 = new fpm0("AN_ERROR_WHILE_SYNCING", 2);
        c = fpm0Var3;
        d = new fpm0[]{fpm0Var, fpm0Var2, fpm0Var3};
    }

    public static fpm0 valueOf(String str) {
        return (fpm0) Enum.valueOf(fpm0.class, str);
    }

    public static fpm0[] values() {
        return (fpm0[]) d.clone();
    }
}
