package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class g870 implements w570, e670 {
    public static final /* synthetic */ g870[] b = {new y770(s570.SECTION_HEADER)};
    public final String a;

    /* JADX INFO: Fake field, exist only in values array */
    g870 EF4;

    public g870(s570 s570Var) {
        super("SECTION_HEADER", 0);
        s570Var.getClass();
        this.a = s570Var.a;
    }

    public static g870 valueOf(String str) {
        return (g870) Enum.valueOf(g870.class, str);
    }

    public static g870[] values() {
        return (g870[]) b.clone();
    }

    public final String a() {
        return "glue2:sectionHeader";
    }

    public final String b() {
        return this.a;
    }
}
