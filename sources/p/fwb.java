package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.fwb[], still in use, count: 1, list:
  (r0v1 p.fwb[]) from 0x003e: CONSTRUCTOR (r0v1 p.fwb[]) A[WRAPPED] (LINE:63) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class fwb {
    /* JADX INFO: Fake field, exist only in values array */
    Music(unx.c, 2131955626),
    Chapters(qrx.c, 2131955625),
    /* JADX INFO: Fake field, exist only in values array */
    Theme(htx.c, 2131955627),
    /* JADX INFO: Fake field, exist only in values array */
    Annotations(ylx.c, 2131955624);

    public static final /* synthetic */ t0z e;
    public final hux a;
    public final int b;

    static {
        e = new t0z(fwbVarArr);
    }

    public fwb(hux huxVar, int i) {
        super(str, i);
        this.a = huxVar;
        this.b = i;
    }

    public static fwb valueOf(String str) {
        return (fwb) Enum.valueOf(fwb.class, str);
    }

    public static fwb[] values() {
        return (fwb[]) d.clone();
    }
}
