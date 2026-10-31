package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class as3 {
    public static final zr3 b;
    public static final yr3 c;
    public static final /* synthetic */ as3[] d;
    public final String a;

    static {
        zr3 zr3Var = new zr3("LIST", 0, "list");
        b = zr3Var;
        yr3 yr3Var = new yr3("GRID", 1, "grid");
        c = yr3Var;
        d = new as3[]{zr3Var, yr3Var};
    }

    public as3(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static as3 valueOf(String str) {
        return (as3) Enum.valueOf(as3.class, str);
    }

    public static as3[] values() {
        return (as3[]) d.clone();
    }

    public as3 a() {
        return b;
    }
}
