package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.iw21[], still in use, count: 1, list:
  (r0v1 p.iw21[]) from 0x003a: CONSTRUCTOR (r0v1 p.iw21[]) A[WRAPPED] (LINE:59) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iw21 {
    UNKNOWN_DISCOVERY_METHOD("UNKNOWN_DISCOVERY_METHOD"),
    /* JADX INFO: Fake field, exist only in values array */
    MDNS("MDNS"),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT("CONNECT"),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_RADAR_NEARBY("SOCIAL_RADAR_NEARBY"),
    /* JADX INFO: Fake field, exist only in values array */
    LISTENING_ACTIVITY("LISTENING_ACTIVITY"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK("LINK");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(iw21VarArr);
    }

    public iw21(String str) {
        super(str, i);
        this.a = str;
    }

    public static iw21 valueOf(String str) {
        return (iw21) Enum.valueOf(iw21.class, str);
    }

    public static iw21[] values() {
        return (iw21[]) c.clone();
    }
}
