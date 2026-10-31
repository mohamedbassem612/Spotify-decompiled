package p;

import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.cih1[], still in use, count: 1, list:
  (r0v1 p.cih1[]) from 0x0036: CONSTRUCTOR (r0v1 p.cih1[]) A[WRAPPED] (LINE:55) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cih1 {
    JAM_CLOSE("jam_close"),
    JAM_FAR("jam_far"),
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    KPLADBG("kpladbg");

    public static final /* synthetic */ t0z f;
    public final String a;

    static {
        f = new t0z(cih1VarArr);
    }

    public cih1(String str) {
        super(str, i);
        this.a = str;
    }

    public static cih1 valueOf(String str) {
        return (cih1) Enum.valueOf(cih1.class, str);
    }

    public static cih1[] values() {
        return (cih1[]) e.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final UUID a() throws NoWhenBranchMatchedException {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            UUID uuid = pe9.a;
            return pe9.d;
        }
        if (iOrdinal == 1) {
            UUID uuid2 = pe9.a;
            return pe9.e;
        }
        if (iOrdinal != 2 && iOrdinal != 3) {
            eg.o();
        }
        return null;
    }
}
