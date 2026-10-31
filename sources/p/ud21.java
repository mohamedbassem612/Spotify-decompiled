package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ud21 {
    public static final td21 a;
    public static final sd21 b;
    public static final /* synthetic */ ud21[] c;

    static {
        td21 td21Var = new td21();
        a = td21Var;
        sd21 sd21Var = new sd21();
        b = sd21Var;
        c = new ud21[]{td21Var, sd21Var};
    }

    public static ud21 valueOf(String str) {
        return (ud21) Enum.valueOf(ud21.class, str);
    }

    public static ud21[] values() {
        return (ud21[]) c.clone();
    }

    public String a(String str) {
        return nhc1.W(nhc1.W(str, "<", "&lt;"), ">", "&gt;");
    }
}
