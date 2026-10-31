package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.io90[], still in use, count: 1, list:
  (r0v1 p.io90[]) from 0x0063: CONSTRUCTOR (r0v1 p.io90[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:100) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class io90 {
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_2("Elite 2"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_3("Elite 3"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_3_ACTIVE("Elite 3 Active"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_4("Elite 4"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_4_ACTIVE("Elite 4 Active"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_5("Elite 5"),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_5T("Connect 5t"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_8("Elite 8"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_10("Elite 10");

    public static final /* synthetic */ t0z c;
    public final String a;

    static {
        c = new t0z(io90VarArr);
    }

    public io90(String str) {
        super(str, i);
        this.a = str;
    }

    public static io90 valueOf(String str) {
        return (io90) Enum.valueOf(io90.class, str);
    }

    public static io90[] values() {
        return (io90[]) b.clone();
    }
}
