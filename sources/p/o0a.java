package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.o0a[], still in use, count: 1, list:
  (r0v1 p.o0a[]) from 0x0020: CONSTRUCTOR (r0v1 p.o0a[]) A[WRAPPED] (LINE:33) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o0a {
    PREV_TRACK("prev-track"),
    RESTART_TRACK("restart-track");

    public static final /* synthetic */ t0z e;
    public final String a;

    static {
        e = new t0z(o0aVarArr);
    }

    public o0a(String str) {
        super(str, i);
        this.a = str;
    }

    public static o0a valueOf(String str) {
        return (o0a) Enum.valueOf(o0a.class, str);
    }

    public static o0a[] values() {
        return (o0a[]) d.clone();
    }
}
