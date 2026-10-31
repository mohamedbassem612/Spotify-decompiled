package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 p.prm1, still in use, count: 1, list:
  (r0v0 p.prm1) from 0x009f: SPUT (r0v0 p.prm1) (LINE:160) p.prm1.i p.prm1
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class prm1 {
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(0, "never", new pr61(2131964001, null, "never")),
    AFTER_PLAYING(1, "afterplaying", new pr61(2131963999, null, "after-playing")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_24_HOURS(2, "after24hours", new pr61(2131963994, null, "after-24h")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_2_DAYS(3, "after2days", new pr61(2131963995, null, "after-2d")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_1_WEEK(4, "after1week", new pr61(2131963993, null, "after-1w"));

    public static final idd1 d = new idd1(w0n0.c1);
    public static final idd1 e = new idd1(wam1.Z);
    public static final idd1 f = new idd1(wam1.O0);
    public static final idd1 g = new idd1(wam1.P0);
    public static final idd1 h = new idd1(wam1.N0);
    public static final prm1 i = new prm1(0, "never", new pr61(2131964001, null, "never"));
    public final byte a;
    public final String b;
    public final pr61 c;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public prm1(int i2, String str, pr61 pr61Var) {
        super(str, i);
        this.a = i2;
        this.b = str;
        this.c = pr61Var;
    }

    public static prm1 valueOf(String str) {
        return (prm1) Enum.valueOf(prm1.class, str);
    }

    public static prm1[] values() {
        return (prm1[]) X.clone();
    }
}
