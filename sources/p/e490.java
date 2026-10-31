package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e490 {
    public static final e490 a;
    public static final e490 b;
    public static final /* synthetic */ e490[] c;
    public static final /* synthetic */ t0z d;

    /* JADX INFO: Fake field, exist only in values array */
    e490 EF0;

    static {
        e490 e490Var = new e490("Shake", 0);
        e490 e490Var2 = new e490("TestingTools", 1);
        a = e490Var2;
        e490 e490Var3 = new e490("Feature", 2);
        e490 e490Var4 = new e490("EmployeeTools", 3);
        b = e490Var4;
        e490[] e490VarArr = {e490Var, e490Var2, e490Var3, e490Var4, new e490("DebugDrawer", 4), new e490("PersistentNotification", 5)};
        c = e490VarArr;
        d = new t0z(e490VarArr);
    }

    public static e490 valueOf(String str) {
        return (e490) Enum.valueOf(e490.class, str);
    }

    public static e490[] values() {
        return (e490[]) c.clone();
    }
}
