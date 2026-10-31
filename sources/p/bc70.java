package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class bc70 implements w570, e670 {
    public static final qb70 b;
    public static final /* synthetic */ bc70[] c;
    public final String a;

    static {
        qb70 qb70Var = new qb70("SECTION_HEADER", 0, "glue:sectionHeader");
        b = qb70Var;
        c = new bc70[]{qb70Var, new rb70("SECTION_HEADER_LARGE", 1, "glue:row:sectionHeaderLarge"), new sb70("SECTION_HEADER_LARGE_WITH_DESCRIPTION", 2, "glue:row:sectionHeaderLargeWithDescription"), new tb70("SECTION_HEADER_SMALL", 3, "glue:sectionHeaderSmall"), new ub70("SECTION_HEADER_SMALL_NO_DESCRIPTION", 4, "glue:row:sectionHeaderSmall"), new vb70("SECTION_HEADER_SMALL_WITH_DESCRIPTION", 5, "glue:row:sectionHeaderSmallWithDescription")};
    }

    public bc70(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static bc70 valueOf(String str) {
        return (bc70) Enum.valueOf(bc70.class, str);
    }

    public static bc70[] values() {
        return (bc70[]) c.clone();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return s570.SECTION_HEADER.a;
    }
}
