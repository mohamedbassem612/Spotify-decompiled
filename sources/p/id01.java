package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.id01[], still in use, count: 1, list:
  (r0v1 p.id01[]) from 0x0078: CONSTRUCTOR (r0v1 p.id01[]) A[WRAPPED] (LINE:121) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class id01 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Yellow"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Green"),
    b("Blue"),
    /* JADX INFO: Fake field, exist only in values array */
    EF109("Pink");

    public static final /* synthetic */ t0z d;
    public final long a;

    static {
        d = new t0z(id01VarArr);
    }

    public id01(String str) {
        super(str, i);
        this.a = j;
    }

    public static t0z a() {
        return d;
    }

    public static id01 valueOf(String str) {
        return (id01) Enum.valueOf(id01.class, str);
    }

    public static id01[] values() {
        return (id01[]) c.clone();
    }
}
