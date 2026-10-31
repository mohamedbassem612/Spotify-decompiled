package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.jz31[], still in use, count: 1, list:
  (r0v1 p.jz31[]) from 0x001c: CONSTRUCTOR (r0v1 p.jz31[]) A[WRAPPED] (LINE:29) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class jz31 {
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT_MAP("abstract-map"),
    /* JADX INFO: Fake field, exist only in values array */
    JOURNEY("journey");

    public static final /* synthetic */ t0z c;
    public final String a;

    static {
        c = new t0z(jz31VarArr);
    }

    public jz31(String str) {
        super(str, i);
        this.a = str;
    }

    public static jz31 valueOf(String str) {
        return (jz31) Enum.valueOf(jz31.class, str);
    }

    public static jz31[] values() {
        return (jz31[]) b.clone();
    }
}
