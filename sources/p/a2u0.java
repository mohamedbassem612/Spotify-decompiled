package p;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.a2u0[], still in use, count: 1, list:
  (r0v1 p.a2u0[]) from 0x0028: CONSTRUCTOR (r1v2 p.t0z) = (r0v1 p.a2u0[]) (LINE:41) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a2u0 {
    /* JADX INFO: Fake field, exist only in values array */
    WAYPOINT_REACHED(0),
    /* JADX INFO: Fake field, exist only in values array */
    RENDERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    FAILED(2),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED(3);

    public static final LinkedHashMap b;
    public final byte a;

    static {
        t0z t0zVar = new t0z(a2u0VarArr);
        int iS = zno1.s(q7h.U(t0zVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        d7 it = t0zVar.iterator();
        while (true) {
            d7 d7Var = it;
            if (!d7Var.hasNext()) {
                b = linkedHashMap;
                return;
            } else {
                Object next = d7Var.next();
                linkedHashMap.put(Integer.valueOf(((a2u0) next).a), next);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a2u0(int i) {
        super(str, i);
        this.a = i;
    }

    public static a2u0 valueOf(String str) {
        return (a2u0) Enum.valueOf(a2u0.class, str);
    }

    public static a2u0[] values() {
        return (a2u0[]) c.clone();
    }
}
