package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jgn0 {
    public static final /* synthetic */ jgn0[] b;
    public static final /* synthetic */ t0z c;
    public final jfv a;

    /* JADX INFO: Fake field, exist only in values array */
    jgn0 EF0;

    static {
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.g;
        jgn0 jgn0Var = new jgn0("ONE_HOUR", 0, new jfv(fdg1.k0(1, ngvVar)));
        jgn0 jgn0Var2 = new jgn0("EIGHT_HOURS", 1, new jfv(fdg1.k0(8, ngvVar)));
        ngv ngvVar2 = ngv.h;
        jgn0[] jgn0VarArr = {jgn0Var, jgn0Var2, new jgn0("ONE_DAY", 2, new jfv(fdg1.k0(1, ngvVar2))), new jgn0("ONE_WEEK", 3, new jfv(fdg1.k0(7, ngvVar2))), new jgn0("ALWAYS", 4, null)};
        b = jgn0VarArr;
        c = new t0z(jgn0VarArr);
    }

    public jgn0(String str, int i, jfv jfvVar) {
        super(str, i);
        this.a = jfvVar;
    }

    public static jgn0 valueOf(String str) {
        return (jgn0) Enum.valueOf(jgn0.class, str);
    }

    public static jgn0[] values() {
        return (jgn0[]) b.clone();
    }
}
