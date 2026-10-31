package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 p.qrm1, still in use, count: 1, list:
  (r0v0 p.qrm1) from 0x00b7: SPUT (r0v0 p.qrm1) (LINE:184) p.qrm1.i p.qrm1
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qrm1 {
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(0, "never", new pr61(2131964001, (sl11) null, "never")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_24_HOURS(1, "after24hours", new pr61(2131963994, (sl11) null, "after-24h")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_1_WEEK(2, "after1week", new pr61(2131963993, (sl11) null, "after-1w")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_2_WEEKS(3, "after2weeks", new pr61(2131963996, (sl11) null, "after-2w")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_30_DAYS(4, "after30days", new pr61(2131963997, (sl11) null, "after-30d")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_3_MONTHS(5, "after3months", new pr61(2131963998, (sl11) null, "after-3mo"));

    public static final idd1 d = new idd1(wam1.Q0);
    public static final idd1 e = new idd1(wam1.R0);
    public static final idd1 f = new idd1(wam1.T0);
    public static final idd1 g = new idd1(wam1.U0);
    public static final idd1 h = new idd1(wam1.S0);
    public static final qrm1 i = new qrm1(0, "never", new pr61(2131964001, (sl11) null, "never"));
    public final byte a;
    public final String b;
    public final pr61 c;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qrm1(int i2, String str, pr61 pr61Var) {
        super(str, i);
        this.a = i2;
        this.b = str;
        this.c = pr61Var;
    }

    public static qrm1 valueOf(String str) {
        return (qrm1) Enum.valueOf(qrm1.class, str);
    }

    public static qrm1[] values() {
        return (qrm1[]) t.clone();
    }
}
