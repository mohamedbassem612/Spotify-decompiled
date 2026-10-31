package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.wgo0[], still in use, count: 1, list:
  (r0v1 p.wgo0[]) from 0x002a: CONSTRUCTOR (r0v1 p.wgo0[]) A[WRAPPED] (LINE:43) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wgo0 {
    /* JADX INFO: Fake field, exist only in values array */
    Free("free"),
    OptOut("opt-out"),
    EntityKind("entity-kind");

    public static final /* synthetic */ t0z e;
    public final String a;

    static {
        e = new t0z(wgo0VarArr);
    }

    public wgo0(String str) {
        super(str, i);
        this.a = str;
    }

    public static wgo0 valueOf(String str) {
        return (wgo0) Enum.valueOf(wgo0.class, str);
    }

    public static wgo0[] values() {
        return (wgo0[]) d.clone();
    }
}
