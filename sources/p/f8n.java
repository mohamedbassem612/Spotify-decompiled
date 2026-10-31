package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.f8n[], still in use, count: 1, list:
  (r0v1 p.f8n[]) from 0x002c: CONSTRUCTOR (r0v1 p.f8n[]) A[WRAPPED] (LINE:45) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f8n {
    /* JADX INFO: Fake field, exist only in values array */
    TopLeft(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    TopRight(true, false),
    BottomLeft(false, true),
    BottomRight(false, false);

    public static final /* synthetic */ t0z f;
    public final boolean a;
    public final boolean b;

    static {
        f = new t0z(f8nVarArr);
    }

    public f8n(boolean z, boolean z2) {
        super(str, i);
        this.a = z;
        this.b = z2;
    }

    public static f8n valueOf(String str) {
        return (f8n) Enum.valueOf(f8n.class, str);
    }

    public static f8n[] values() {
        return (f8n[]) e.clone();
    }
}
