package p;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.mo6[], still in use, count: 1, list:
  (r0v1 p.mo6[]) from 0x007e: CONSTRUCTOR (r1v2 p.t0z) = (r0v1 p.mo6[]) (LINE:127) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mo6 {
    AI_PERSONA("ai_persona"),
    RELEASES("releases"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLISTED("playlisted"),
    EDITORIAL_PLAYLIST("editorial_playlist"),
    REGISTERED_IN_SPOTIFY("registered_in_spotify"),
    VERIFIED_BY_SPOTIFY("verified_by_spotify"),
    /* JADX INFO: Fake field, exist only in values array */
    CONCERTS("concerts"),
    TOURS("tours"),
    FRESH_FINDS_FORWARD("fresh_finds_forward"),
    UNKNOWN("unknown");

    public static final LinkedHashMap b;
    public final String a;

    static {
        t0z t0zVar = new t0z(mo6VarArr);
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
                linkedHashMap.put(((mo6) next).a, next);
            }
        }
    }

    public mo6(String str) {
        super(str, i);
        this.a = str;
    }

    public static mo6 valueOf(String str) {
        return (mo6) Enum.valueOf(mo6.class, str);
    }

    public static mo6[] values() {
        return (mo6[]) X.clone();
    }
}
