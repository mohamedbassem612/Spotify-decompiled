package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v16 p.t5g[], still in use, count: 1, list:
  (r0v16 p.t5g[]) from 0x00c0: CONSTRUCTOR (r0v16 p.t5g[]) A[WRAPPED] (LINE:193) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class t5g {
    b("REAL_ENDPOINT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("TST1_ENDPOINT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("CHOICE_SCREEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("CHOICE_SCREEN_CHANGE_PLAN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49("CHOICE_SCREEN_SPOTIFY_NATIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF59("SKIP_TO_SPOTIFY_URL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("SKIP_TO_SPOTIFY_NATIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF79("SKIP_TO_GPB"),
    /* JADX INFO: Fake field, exist only in values array */
    EF90("ITEM_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF101("CHECKOUT_STATUS_GO_BACK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF112("REDIRECT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF123("COUNTRY_MISMATCH"),
    /* JADX INFO: Fake field, exist only in values array */
    EF134("FOR_ANOTHER_USER_OK_AVATAR_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF147("FOR_ANOTHER_USER_NO_AVATAR_NO_DATA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF160("BACKEND_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF173("NETWORK_ERROR");

    public static final /* synthetic */ t0z d;
    public final vu30 a;

    static {
        d = new t0z(t5gVarArr);
    }

    public t5g(String str) {
        super(str, i);
        this.a = vu30Var;
    }

    public static t5g valueOf(String str) {
        return (t5g) Enum.valueOf(t5g.class, str);
    }

    public static t5g[] values() {
        return (t5g[]) c.clone();
    }
}
