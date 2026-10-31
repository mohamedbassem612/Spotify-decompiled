package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class wgl {
    public static final Map a;
    public static final LinkedHashMap b;
    public static final LinkedHashMap c;
    public static final Map d;

    static {
        Map mapJ = sqg0.J(new mmr0[]{oqn1.n(6, "REASON_ANR"), oqn1.n(4, "REASON_CRASH"), oqn1.n(5, "REASON_CRASH_NATIVE"), oqn1.n(12, "REASON_DEPENDENCY_DIED"), oqn1.n(9, "REASON_EXCESSIVE_RESOURCE_USAGE"), oqn1.n(1, "REASON_EXIT_SELF"), oqn1.n(7, "REASON_INITIALIZATION_FAILURE"), oqn1.n(3, "REASON_LOW_MEMORY"), oqn1.n(13, "REASON_OTHER"), oqn1.n(8, "REASON_PERMISSION_CHANGE"), oqn1.n(2, "REASON_SIGNALED"), oqn1.n(10, "REASON_USER_REQUESTED"), oqn1.n(11, "REASON_USER_STOPPED"), oqn1.n(0, "REASON_UNKNOWN")});
        a = mapJ;
        LinkedHashMap linkedHashMapO = sqg0.O(mapJ, zno1.t(oqn1.n(14, "REASON_FREEZER")));
        b = linkedHashMapO;
        c = sqg0.O(linkedHashMapO, sqg0.J(new mmr0[]{oqn1.n(15, "REASON_PACKAGE_STATE_CHANGE"), oqn1.n(16, "REASON_PACKAGE_UPDATED")}));
        d = sqg0.J(new mmr0[]{oqn1.n(400, "IMPORTANCE_CACHED"), oqn1.n(100, "IMPORTANCE_FOREGROUND"), oqn1.n(125, "IMPORTANCE_FOREGROUND_SERVICE"), oqn1.n(1000, "IMPORTANCE_GONE"), oqn1.n(230, "IMPORTANCE_PERCEPTIBLE"), oqn1.n(130, "IMPORTANCE_PERCEPTIBLE_PRE_26"), oqn1.n(300, "IMPORTANCE_SERVICE"), oqn1.n(325, "IMPORTANCE_TOP_SLEEPING"), oqn1.n(200, "IMPORTANCE_VISIBLE"), oqn1.n(350, "IMPORTANCE_CANT_SAVE_STATE"), oqn1.n(150, "IMPORTANCE_TOP_SLEEPING_PRE_28")});
    }
}
