package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.vur0[], still in use, count: 1, list:
  (r0v1 p.vur0[]) from 0x0038: CONSTRUCTOR (r0v1 p.vur0[]) A[WRAPPED] (LINE:57) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vur0 {
    ChildInitiatedAgeAssurance("child-initiated-age-assurance"),
    ChildInitiatedAgeAssuranceWeb("child-initiated-age-assurance-web"),
    ChildInitiatedSignup("child-initiated-signup"),
    ParentalControls("parental-controls");

    public static final /* synthetic */ t0z g;
    public final String a;

    static {
        g = new t0z(vur0VarArr);
    }

    public vur0(String str) {
        super(str, i);
        this.a = str;
    }

    public static vur0 valueOf(String str) {
        return (vur0) Enum.valueOf(vur0.class, str);
    }

    public static vur0[] values() {
        return (vur0[]) f.clone();
    }

    public final String a() {
        return this.a;
    }
}
