package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class idh1 {
    public static final idh1 a;
    public static final idh1 b;
    public static final idh1 c;
    public static final /* synthetic */ idh1[] d;

    static {
        idh1 idh1Var = new idh1("Unavailable", 0);
        a = idh1Var;
        idh1 idh1Var2 = new idh1("Inactive", 1);
        b = idh1Var2;
        idh1 idh1Var3 = new idh1("Active", 2);
        c = idh1Var3;
        d = new idh1[]{idh1Var, idh1Var2, idh1Var3};
    }

    public static idh1 valueOf(String str) {
        return (idh1) Enum.valueOf(idh1.class, str);
    }

    public static idh1[] values() {
        return (idh1[]) d.clone();
    }
}
