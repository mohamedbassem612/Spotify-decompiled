package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class okb {
    public static final okb b;
    public static final okb c;
    public static final /* synthetic */ okb[] d;
    public final mic0 a;

    static {
        uwr uwrVar = cbx.a;
        zsc zscVar = zex.a;
        u7h u7hVar = new u7h(u7h.b(((vex) zscVar.b).c, 0.9f, 0.0f, 0.0f, 0.0f, 14));
        vex vexVar = (vex) zscVar.b;
        okb okbVar = new okb("TOP_TO_BOTTOM", 0, v9c.s(p7h.M(new u7h[]{u7hVar, new u7h(u7h.b(vexVar.c, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14));
        b = okbVar;
        okb okbVar2 = new okb("BOTTOM_TO_TOP", 1, v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(vexVar.c, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(vexVar.c, 0.9f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14));
        c = okbVar2;
        d = new okb[]{okbVar, okbVar2, new okb("START_TO_END", 2, v9c.h(p7h.M(new u7h[]{new u7h(u7h.b(vexVar.c, 0.9f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(vexVar.c, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14)), new okb("END_TO_START", 3, v9c.h(p7h.M(new u7h[]{new u7h(u7h.b(vexVar.c, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(vexVar.c, 0.9f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14))};
    }

    public okb(String str, int i, mic0 mic0Var) {
        super(str, i);
        this.a = mic0Var;
    }

    public static okb valueOf(String str) {
        return (okb) Enum.valueOf(okb.class, str);
    }

    public static okb[] values() {
        return (okb[]) d.clone();
    }
}
