package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.mpg0[], still in use, count: 1, list:
  (r0v1 p.mpg0[]) from 0x0099: CONSTRUCTOR (r0v1 p.mpg0[]) A[WRAPPED] (LINE:154) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mpg0 {
    /* JADX INFO: Fake field, exist only in values array */
    FIRST(new lit(24.0f, 230.0f, 31.66f, 31.66f), new lit(35.0f, 271.0f, 9.99f, 3.75f)),
    /* JADX INFO: Fake field, exist only in values array */
    SECOND(new lit(39.0f, 177.19f, 31.66f, 31.66f), new lit(49.59f, 215.28f, 9.99f, 3.75f)),
    /* JADX INFO: Fake field, exist only in values array */
    THIRD(new lit(99.0f, 228.0f, 31.66f, 31.66f), new lit(109.19f, 271.36f, 9.99f, 3.75f)),
    /* JADX INFO: Fake field, exist only in values array */
    FOURTH(new lit(140.0f, 170.0f, 31.66f, 31.66f), new lit(151.0f, 213.0f, 9.99f, 3.75f)),
    /* JADX INFO: Fake field, exist only in values array */
    FIFTH(new lit(154.0f, 282.0f, 31.66f, 31.66f), new lit(165.0f, 325.0f, 9.99f, 3.75f));

    public static final /* synthetic */ t0z d;
    public final lit a;
    public final lit b;

    static {
        d = new t0z(mpg0VarArr);
    }

    public mpg0(lit litVar, lit litVar2) {
        super(str, i);
        this.a = litVar;
        this.b = litVar2;
    }

    public static mpg0 valueOf(String str) {
        return (mpg0) Enum.valueOf(mpg0.class, str);
    }

    public static mpg0[] values() {
        return (mpg0[]) c.clone();
    }
}
