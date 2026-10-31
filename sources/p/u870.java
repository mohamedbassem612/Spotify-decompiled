package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class u870 implements w570, e670 {
    public static final /* synthetic */ u870[] c;
    public final String a;
    public final String b;

    /* JADX INFO: Fake field, exist only in values array */
    u870 EF9;

    static {
        s570 s570Var = s570.SECTION_HEADER;
        c = new u870[]{new j870("SECTION_HEADER", 0, "glue2:solarSectionHeader", s570Var), new k870("SECTION_HEADER_LARGE", 1, "glue2:solarSectionHeaderLarge", s570Var), new l870("SECTION_HEADER_SMALL", 2, "glue2:solarSectionHeaderSmall", s570Var), new m870("SECTION_HEADER_WITH_DESCRIPTION", 3, "glue2:solarSectionHeaderWithDescription", s570Var), new n870("SECTION_HEADER_WITH_RECOMMENDATION", 4, "glue2:solarSectionHeaderWithRecommendation", s570Var)};
    }

    public u870(String str, int i, String str2, s570 s570Var) {
        super(str, i);
        this.a = str2;
        s570Var.getClass();
        this.b = s570Var.a;
    }

    public static u870 valueOf(String str) {
        return (u870) Enum.valueOf(u870.class, str);
    }

    public static u870[] values() {
        return (u870[]) c.clone();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
