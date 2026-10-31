package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v33 p.a5u0[], still in use, count: 1, list:
  (r0v33 p.a5u0[]) from 0x01bf: CONSTRUCTOR (r0v33 p.a5u0[]) A[WRAPPED] (LINE:448) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a5u0 {
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_50(50),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_60(60),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_70(70),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_80(80),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_90(90),
    PLAYBACK_SPEED_100(100),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_110(110),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_120(120),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_125(125),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_130(130),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_140(140),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_150(150),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_160(160),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_170(170),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_175(175),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_180(180),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_190(190),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_200(200),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_210(210),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_220(220),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_230(230),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_240(240),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_250(250),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_260(260),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_270(270),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_280(280),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_290(290),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_300(300),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_310(310),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_320(320),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_330(330),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_340(340),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_350(350);

    public static final a5u0 b;
    public static final /* synthetic */ t0z e;
    public final short a;

    static {
        a5u0 a5u0Var = PLAYBACK_SPEED_100;
        e = new t0z(a5u0VarArr);
        b = a5u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a5u0(int i) {
        super(str, i);
        this.a = i;
    }

    public static a5u0 valueOf(String str) {
        return (a5u0) Enum.valueOf(a5u0.class, str);
    }

    public static a5u0[] values() {
        return (a5u0[]) d.clone();
    }

    public final int a() {
        return this.a;
    }
}
