package p;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v27 p.co0[], still in use, count: 1, list:
  (r1v27 p.co0[]) from 0x0257: CONSTRUCTOR (r2v27 p.t0z) = (r1v27 p.co0[]) (LINE:600) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class co0 {
    BACKGROUNDED("backgrounded"),
    CLICKED("clicked"),
    COLLAPSED("collapsed"),
    CONTINUOUS_VIEWABILITY("viewability"),
    DISMISSED("dismissed"),
    ENDED("ended"),
    ERROR("errored"),
    EXPANDED("expanded"),
    FIRST_QUARTILE("first_quartile"),
    FOREGROUNDED("foregrounded"),
    IMPRESSION("viewed"),
    ITEM_CLICKED("item_clicked"),
    ITEM_IMPRESSION("item_impression"),
    MIDPOINT("midpoint"),
    MINIMIZED("minimized"),
    MUTED("muted"),
    NONCONTINUOUS_VIEWABILITY("video_viewed"),
    OBSCURED("obscured"),
    PAUSED("paused"),
    PROGRESS("progress"),
    REPLAYED("replayed"),
    RESUMED("resumed"),
    SKIPPED("skipped"),
    STARTED("started"),
    SURVEY_SUBMITTED("survey_submitted"),
    TERMINATED("terminated"),
    THIRD_QUARTILE("third_quartile"),
    UNMUTED("unmuted"),
    LOADED("loaded"),
    UNLOADED("unloaded"),
    UNOBSCURED("unobscured"),
    VIEWABILITY_0("visible_0"),
    VIEWABILITY_GREATER_THAN_0("visible_gt_0"),
    VIEWABILITY_50("visible_50"),
    VIEWABILITY_50_LESS("visible_50_less"),
    VIEWABILITY_100("visible_100"),
    VOLUME_CHANGE("volume_change"),
    UNKNOWN("unknown");

    public static final LinkedHashMap b;
    public final String a;

    static {
        t0z t0zVar = new t0z(co0VarArr);
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
                linkedHashMap.put(((co0) next).a, next);
            }
        }
    }

    public co0(String str) {
        super(str, i);
        this.a = str;
    }

    public static co0 valueOf(String str) {
        return (co0) Enum.valueOf(co0.class, str);
    }

    public static co0[] values() {
        return (co0[]) o1.clone();
    }
}
