package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.luq0[], still in use, count: 1, list:
  (r0v1 p.luq0[]) from 0x0044: CONSTRUCTOR (r0v1 p.luq0[]) A[WRAPPED] (LINE:69) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class luq0 {
    BUILT_IN_SPEAKER("Built-in"),
    WIRED("LineOut"),
    CAR_PROJECTED("CarProjected"),
    BLUETOOTH("Bluetooth"),
    UNKNOWN("Unknown");

    public static final /* synthetic */ t0z h;
    public final String a;

    static {
        h = new t0z(luq0VarArr);
    }

    public luq0(String str) {
        super(str, i);
        this.a = str;
    }

    public static luq0 valueOf(String str) {
        return (luq0) Enum.valueOf(luq0.class, str);
    }

    public static luq0[] values() {
        return (luq0[]) g.clone();
    }
}
