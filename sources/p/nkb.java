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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nkb {
    public static final nkb b;
    public static final nkb c;
    public static final /* synthetic */ nkb[] d;
    public final mic0 a;

    static {
        uwr uwrVar = cbx.a;
        zsc zscVar = zex.a;
        u7h u7hVar = new u7h(u7h.b(((vex) zscVar.b).c, 0.9f, 0.0f, 0.0f, 0.0f, 14));
        vex vexVar = (vex) zscVar.b;
        nkb nkbVar = new nkb("START_TO_END", 0, v9c.h(p7h.M(new u7h[]{u7hVar, new u7h(u7h.b(vexVar.c, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14));
        b = nkbVar;
        nkb nkbVar2 = new nkb("END_TO_START", 1, v9c.h(p7h.M(new u7h[]{new u7h(u7h.b(vexVar.c, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(vexVar.c, 0.9f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14));
        c = nkbVar2;
        d = new nkb[]{nkbVar, nkbVar2};
    }

    public nkb(String str, int i, mic0 mic0Var) {
        super(str, i);
        this.a = mic0Var;
    }

    public static nkb valueOf(String str) {
        return (nkb) Enum.valueOf(nkb.class, str);
    }

    public static nkb[] values() {
        return (nkb[]) d.clone();
    }
}
