package p;

import com.spotify.concertcampaignview.v1.CtaType;

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
public final class qhd0 {
    public static final qhd0 b;
    public static final qhd0 c;
    public static final /* synthetic */ qhd0[] d;
    public final hsi1 a;

    static {
        Float fValueOf = Float.valueOf(1.1f);
        pxg1 pxg1VarO0 = irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, new ceo(0.21f, 0.35f, 0.58f, 1.0f), 2);
        Float fValueOf2 = Float.valueOf(0.0f);
        tzg1 tzg1Var = rno1.a;
        qhd0 qhd0Var = new qhd0("HeroScaleUp", 0, new hsi1("reveal-hero-scale-up", fValueOf2, fValueOf, pxg1VarO0, tzg1Var));
        b = qhd0Var;
        qhd0 qhd0Var2 = new qhd0("HeroScaleDown", 1, new hsi1("reveal-hero-scale-down", fValueOf, Float.valueOf(1.0f), irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, new ceo(0.42f, 0.0f, 0.85f, 0.76f), 2), tzg1Var));
        c = qhd0Var2;
        d = new qhd0[]{qhd0Var, qhd0Var2};
    }

    public qhd0(String str, int i, hsi1 hsi1Var) {
        super(str, i);
        this.a = hsi1Var;
    }

    public static qhd0 valueOf(String str) {
        return (qhd0) Enum.valueOf(qhd0.class, str);
    }

    public static qhd0[] values() {
        return (qhd0[]) d.clone();
    }
}
