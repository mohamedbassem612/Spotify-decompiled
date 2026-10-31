package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.tjb0[], still in use, count: 1, list:
  (r0v1 p.tjb0[]) from 0x0032: CONSTRUCTOR (r0v1 p.tjb0[]) A[WRAPPED] (LINE:51) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class tjb0 {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    JAM("jam"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE_SEND("share_send"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAPPED("wrapped");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(tjb0VarArr);
    }

    public tjb0(String str) {
        super(str, i);
        this.a = str;
    }

    public static tjb0 valueOf(String str) {
        return (tjb0) Enum.valueOf(tjb0.class, str);
    }

    public static tjb0[] values() {
        return (tjb0[]) c.clone();
    }
}
