package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ubd0 {
    public static final ubd0 a;
    public static final /* synthetic */ ubd0[] b;
    public static final /* synthetic */ t0z c;

    static {
        ubd0 ubd0Var = new ubd0("DM", 0);
        a = ubd0Var;
        ubd0[] ubd0VarArr = {ubd0Var, new ubd0("Following", 1), new ubd0("Group", 2)};
        b = ubd0VarArr;
        c = new t0z(ubd0VarArr);
    }

    public static ubd0 valueOf(String str) {
        return (ubd0) Enum.valueOf(ubd0.class, str);
    }

    public static ubd0[] values() {
        return (ubd0[]) b.clone();
    }
}
