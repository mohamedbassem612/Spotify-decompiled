package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.mw71[], still in use, count: 1, list:
  (r0v1 p.mw71[]) from 0x002a: CONSTRUCTOR (r0v1 p.mw71[]) A[WRAPPED] (LINE:43) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mw71 {
    RECENTS(2131962397, 2131962399, cqf.a),
    /* JADX INFO: Fake field, exist only in values array */
    OLDEST(2131962396, 2131962398, cqf.b);

    public static final /* synthetic */ t0z f;
    public final int a;
    public final int b;
    public final cqf c;

    static {
        f = new t0z(mw71VarArr);
    }

    public mw71(int i, int i2, cqf cqfVar) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = cqfVar;
    }

    public static mw71 valueOf(String str) {
        return (mw71) Enum.valueOf(mw71.class, str);
    }

    public static mw71[] values() {
        return (mw71[]) e.clone();
    }
}
