package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ars0[], still in use, count: 1, list:
  (r0v1 p.ars0[]) from 0x002c: CONSTRUCTOR (r0v1 p.ars0[]) A[WRAPPED] (LINE:45) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ars0 {
    INSTALLED("installed"),
    APP_OPENED("app_opened"),
    SIGNED_IN("signed_in");

    public static final /* synthetic */ t0z f;
    public final String a;

    static {
        f = new t0z(ars0VarArr);
    }

    public ars0(String str) {
        super(str, i);
        this.a = str;
    }

    public static ars0 valueOf(String str) {
        return (ars0) Enum.valueOf(ars0.class, str);
    }

    public static ars0[] values() {
        return (ars0[]) e.clone();
    }
}
