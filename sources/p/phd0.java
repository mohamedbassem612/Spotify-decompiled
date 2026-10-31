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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class phd0 {
    public static final phd0 b;
    public static final phd0 c;
    public static final /* synthetic */ phd0[] d;
    public final hsi1 a;

    static {
        ilv.a.getClass();
        ceo ceoVar = flv.b;
        pxg1 pxg1VarO0 = irn1.o0(833, 0, ceoVar, 2);
        p3v p3vVar = new p3v(30.0f);
        p3v p3vVar2 = new p3v(0.0f);
        tzg1 tzg1Var = rno1.c;
        phd0 phd0Var = new phd0("TitleTranslationY", 0, new hsi1("reveal-title-translation-y-in", p3vVar, p3vVar2, pxg1VarO0, tzg1Var));
        b = phd0Var;
        phd0 phd0Var2 = new phd0("SubtitleTranslationY", 1, new hsi1("reveal-subtitle-translation-y-in", new p3v(10.0f), new p3v(0.0f), new pxg1(666, 1000, ceoVar), tzg1Var));
        c = phd0Var2;
        d = new phd0[]{phd0Var, phd0Var2};
    }

    public phd0(String str, int i, hsi1 hsi1Var) {
        super(str, i);
        this.a = hsi1Var;
    }

    public static phd0 valueOf(String str) {
        return (phd0) Enum.valueOf(phd0.class, str);
    }

    public static phd0[] values() {
        return (phd0[]) d.clone();
    }
}
