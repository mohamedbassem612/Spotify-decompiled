package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF37' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jfx {
    public static final jma c;
    public static final jfx d;
    public static final /* synthetic */ jfx[] e;
    public static final /* synthetic */ t0z f;
    public final String a;
    public final long b;

    /* JADX INFO: Fake field, exist only in values array */
    jfx EF37;

    static {
        jfx jfxVar = new jfx(0, "Unknown", "Unknown", u7h.k);
        d = jfxVar;
        uwr uwrVar = cbx.a;
        gmt gmtVar = (gmt) zex.a.c;
        xex xexVar = (xex) gmtVar.b;
        jfx[] jfxVarArr = {jfxVar, new jfx(1, "BlueViolet25", "BlueViolet25", xexVar.w), new jfx(2, "Green25", "Green25", xexVar.j), new jfx(3, "BlueVioletDesat25", "BlueVioletDesat25", ((wex) gmtVar.c).g), new jfx(4, "BrownYellow25", "BrownYellow25", xexVar.e), new jfx(5, "VioletPink25", "VioletPink25", xexVar.F)};
        e = jfxVarArr;
        f = new t0z(jfxVarArr);
        c = new jma((byte) 9);
    }

    public jfx(int i, String str, String str2, long j) {
        super(str, i);
        this.a = str2;
        this.b = j;
    }

    public static jfx valueOf(String str) {
        return (jfx) Enum.valueOf(jfx.class, str);
    }

    public static jfx[] values() {
        return (jfx[]) e.clone();
    }
}
