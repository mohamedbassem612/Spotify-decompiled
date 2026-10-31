package p;

import java.util.Collections;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fzy {
    public static final fzy N0;
    public static final fzy O0;
    public static final fzy P0;
    public static final /* synthetic */ fzy[] Q0;
    public static final fzy X;
    public static final fzy Y;
    public static final fzy Z;
    public static final fzy b;
    public static final fzy c;
    public static final fzy d;
    public static final fzy e;
    public static final fzy f;
    public static final fzy g;
    public static final fzy h;
    public static final fzy i;
    public static final fzy t;
    public final nyy a;

    static {
        nyy nyyVar = nyy.d;
        fzy fzyVar = new fzy("CARD_CIRCULAR_PLACEHOLDER", 0, nyyVar);
        b = fzyVar;
        fzy fzyVar2 = new fzy("CARD_ENTITY", 1, nyyVar);
        c = fzyVar2;
        nyy nyyVar2 = nyy.e;
        fzy fzyVar3 = new fzy("CARD_HINT", 2, nyyVar2);
        d = fzyVar3;
        fzy fzyVar4 = new fzy("CARD_MESSAGE_HINT", 3, nyyVar2);
        e = fzyVar4;
        fzy fzyVar5 = new fzy("CARD_ONBOARDING", 4, nyyVar);
        f = fzyVar5;
        fzy fzyVar6 = new fzy("CARD_PLACEHOLDER", 5, nyyVar);
        g = fzyVar6;
        nyy nyyVar3 = nyy.f;
        fzy fzyVar7 = new fzy("ROW_CIRCULAR_PLACEHOLDER", 6, nyyVar3);
        h = fzyVar7;
        nyy nyyVar4 = nyy.g;
        fzy fzyVar8 = new fzy("ROW_DSA_BANNER", 7, nyyVar4);
        i = fzyVar8;
        fzy fzyVar9 = new fzy("ROW_ENTITY", 8, nyyVar3);
        t = fzyVar9;
        fzy fzyVar10 = new fzy("ROW_LIBRARY_IMPORT_MATCH_RESULT_BANNER", 9, nyyVar4);
        X = fzyVar10;
        fzy fzyVar11 = new fzy("ROW_ONBOARDING", 10, nyyVar3);
        Y = fzyVar11;
        nyy nyyVar5 = nyy.c;
        fzy fzyVar12 = new fzy("ROW_PINS_SECTION", 11, nyyVar5);
        Z = fzyVar12;
        fzy fzyVar13 = new fzy("ROW_PLACEHOLDER", 12, nyyVar3);
        N0 = fzyVar13;
        fzy fzyVar14 = new fzy("ROW_SECTION_HEADER", 13, nyyVar5);
        O0 = fzyVar14;
        fzy fzyVar15 = new fzy("ROW_SORT_OPTIONS", 14, nyy.b);
        P0 = fzyVar15;
        fzy[] fzyVarArr = {fzyVar, fzyVar2, fzyVar3, fzyVar4, fzyVar5, fzyVar6, fzyVar7, fzyVar8, fzyVar9, fzyVar10, fzyVar11, fzyVar12, fzyVar13, fzyVar14, fzyVar15};
        Q0 = fzyVarArr;
    }

    public fzy(String str, int i2, nyy nyyVar) {
        super(str, i2);
        this.a = nyyVar;
        Collections.singleton(nyyVar);
    }

    public static fzy valueOf(String str) {
        return (fzy) Enum.valueOf(fzy.class, str);
    }

    public static fzy[] values() {
        return (fzy[]) Q0.clone();
    }
}
