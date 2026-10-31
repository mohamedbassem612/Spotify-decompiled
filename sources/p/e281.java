package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e281 {
    public static final e281 a;
    public static final e281 b;
    public static final e281 c;
    public static final e281 d;
    public static final /* synthetic */ e281[] e;

    static {
        e281 e281Var = new e281("UNKNOWN", 0);
        a = e281Var;
        e281 e281Var2 = new e281("NOT_STARTED", 1);
        b = e281Var2;
        e281 e281Var3 = new e281("IN_PROGRESS", 2);
        c = e281Var3;
        e281 e281Var4 = new e281("COMPLETED", 3);
        d = e281Var4;
        e = new e281[]{e281Var, e281Var2, e281Var3, e281Var4};
        values();
    }

    public static e281 valueOf(String str) {
        return (e281) Enum.valueOf(e281.class, str);
    }

    public static e281[] values() {
        return (e281[]) e.clone();
    }
}
