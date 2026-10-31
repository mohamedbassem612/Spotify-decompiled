package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kub1 {
    public static final kub1 N0;
    public static final /* synthetic */ kub1[] O0;
    public static final kub1 X;
    public static final kub1 Y;
    public static final kub1 Z;
    public static final kub1 c;
    public static final kub1 d;
    public static final kub1 e;
    public static final kub1 f;
    public static final kub1 g;
    public static final kub1 h;
    public static final kub1 i;
    public static final kub1 t;
    public final String a;
    public final bh91[] b;

    static {
        bh91 bh91Var = bh91.d;
        kub1 kub1Var = new kub1("CALLER_CANCELLED", 0, "caller_cancelled", bh91Var);
        c = kub1Var;
        kub1 kub1Var2 = new kub1("MESSAGE_ORCHESTRATOR_REJECTED", 1, "message_orchestrator_rejected", bh91Var);
        d = kub1Var2;
        kub1 kub1Var3 = new kub1("NO_ATTACHED_CONTAINER", 2, "no_attached_container", bh91Var);
        e = kub1Var3;
        bh91 bh91Var2 = bh91.c;
        kub1 kub1Var4 = new kub1("KEYBOARD_VISIBLE", 3, "keyboard_visible", bh91Var, bh91Var2);
        f = kub1Var4;
        kub1 kub1Var5 = new kub1("NAVIGATION_OVERLAY_VISIBLE", 4, "navigation_overlay_visible", bh91Var, bh91Var2);
        g = kub1Var5;
        kub1 kub1Var6 = new kub1("CALLER_DISMISSED", 5, "caller_dismissed", bh91Var2);
        h = kub1Var6;
        kub1 kub1Var7 = new kub1("TIMEOUT", 6, "timeout", bh91Var2);
        i = kub1Var7;
        kub1 kub1Var8 = new kub1("USER_SWIPE", 7, "user_swipe", bh91Var2);
        t = kub1Var8;
        kub1 kub1Var9 = new kub1("MESSAGE_ORCHESTRATOR_PREEMPTED", 8, "message_orchestrator_preempted", bh91Var2);
        X = kub1Var9;
        kub1 kub1Var10 = new kub1("REPLACED_BY_NEW_CONTROL", 9, "replaced_by_new_control", bh91Var, bh91Var2);
        Y = kub1Var10;
        kub1 kub1Var11 = new kub1("CONTAINER_DETACHED", 10, "container_detached", bh91Var2);
        Z = kub1Var11;
        kub1 kub1Var12 = new kub1("UNKNOWN", 11, "unknown", bh91Var, bh91Var2);
        N0 = kub1Var12;
        O0 = new kub1[]{kub1Var, kub1Var2, kub1Var3, kub1Var4, kub1Var5, kub1Var6, kub1Var7, kub1Var8, kub1Var9, kub1Var10, kub1Var11, kub1Var12};
    }

    public kub1(String str, int i2, String str2, bh91... bh91VarArr) {
        super(str, i2);
        this.a = str2;
        this.b = bh91VarArr;
    }

    public static kub1 valueOf(String str) {
        return (kub1) Enum.valueOf(kub1.class, str);
    }

    public static kub1[] values() {
        return (kub1[]) O0.clone();
    }
}
