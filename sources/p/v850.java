package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v850 {
    public static final v850 a;
    public static final v850 b;
    public static final /* synthetic */ v850[] c;
    public static final /* synthetic */ t0z d;

    static {
        v850 v850Var = new v850("KIDS_TO_SELF_MANAGED", 0);
        a = v850Var;
        v850 v850Var2 = new v850("KIDS_TO_TEEN", 1);
        b = v850Var2;
        v850[] v850VarArr = {v850Var, v850Var2};
        c = v850VarArr;
        d = new t0z(v850VarArr);
    }

    public static v850 valueOf(String str) {
        return (v850) Enum.valueOf(v850.class, str);
    }

    public static v850[] values() {
        return (v850[]) c.clone();
    }
}
