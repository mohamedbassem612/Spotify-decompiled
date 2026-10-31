package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.hbq0[], still in use, count: 1, list:
  (r0v1 p.hbq0[]) from 0x0050: CONSTRUCTOR (r0v1 p.hbq0[]) A[WRAPPED] (LINE:81) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hbq0 {
    /* JADX INFO: Fake field, exist only in values array */
    YELLOW_184("yellow184"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE_VIOLET_61("blueViolet61"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE_VIOLET_25("blueViolet25"),
    /* JADX INFO: Fake field, exist only in values array */
    SOLID_BLACK_0("solidBlack0"),
    /* JADX INFO: Fake field, exist only in values array */
    SOLID_WHITE_200("solidWhite200"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE_DESAT_180("blueDesat180"),
    UNKNOWN("");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(hbq0VarArr);
    }

    public hbq0(String str) {
        super(str, i);
        this.a = str;
    }

    public static hbq0 valueOf(String str) {
        return (hbq0) Enum.valueOf(hbq0.class, str);
    }

    public static hbq0[] values() {
        return (hbq0[]) c.clone();
    }

    public final long a() {
        switch (ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uwr uwrVar = cbx.a;
                return ((xex) ((gmt) zex.a.c).b).g;
            case 1:
                uwr uwrVar2 = cbx.a;
                return ((xex) ((gmt) zex.a.c).b).x;
            case 2:
                uwr uwrVar3 = cbx.a;
                return ((xex) ((gmt) zex.a.c).b).w;
            case 3:
                uwr uwrVar4 = cbx.a;
                return ((vex) zex.a.b).a;
            case 4:
                uwr uwrVar5 = cbx.a;
                return ((vex) zex.a.b).b;
            case 5:
                uwr uwrVar6 = cbx.a;
                return ((wex) ((gmt) zex.a.c).c).f;
            case 6:
                return u7h.b;
            default:
                eg.o();
                return 0L;
        }
    }
}
