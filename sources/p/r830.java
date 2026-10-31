package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.r830[], still in use, count: 1, list:
  (r0v1 p.r830[]) from 0x0024: CONSTRUCTOR (r0v1 p.r830[]) A[WRAPPED] (LINE:37) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class r830 {
    PROFILES(jbx0.a, 2131960541),
    /* JADX INFO: Fake field, exist only in values array */
    ARTISTS(dbx0.a, 2131960540);

    public static final /* synthetic */ t0z e;
    public final nbx0 a;
    public final int b;

    static {
        e = new t0z(r830VarArr);
    }

    public r830(nbx0 nbx0Var, int i) {
        super(str, i);
        this.a = nbx0Var;
        this.b = i;
    }

    public static r830 valueOf(String str) {
        return (r830) Enum.valueOf(r830.class, str);
    }

    public static r830[] values() {
        return (r830[]) d.clone();
    }
}
