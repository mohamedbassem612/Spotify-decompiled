package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.fi4[], still in use, count: 1, list:
  (r0v1 p.fi4[]) from 0x001e: CONSTRUCTOR (r0v1 p.fi4[]) A[WRAPPED] (LINE:31) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fi4 implements z0z {
    DISABLED("disabled"),
    /* JADX INFO: Fake field, exist only in values array */
    PROVIDED_SORTS_SUGGESTED("provided-sorts-suggested");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(fi4VarArr);
    }

    public fi4(String str) {
        super(str, i);
        this.a = str;
    }

    public static fi4 valueOf(String str) {
        return (fi4) Enum.valueOf(fi4.class, str);
    }

    public static fi4[] values() {
        return (fi4[]) c.clone();
    }

    public final String value() {
        return this.a;
    }
}
