package p;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j690 implements kly0 {
    public static final j690 b = new j690(0);
    public static final j690 c = new j690(1);
    public static final j690 d = new j690(2);
    public static final j690 e = new j690(3);
    public static final j690 f = new j690(4);
    public static final j690 g = new j690(5);
    public static final j690 h = new j690(6);
    public final /* synthetic */ byte a;

    public /* synthetic */ j690(byte b2) {
        this.a = b2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                throw new IllegalStateException("Footnote element cannot be presented in main settings item");
            case 2:
                return Boolean.FALSE;
            case 3:
                throw new IllegalStateException("Footnote element cannot be presented in search");
            case 4:
                throw new IllegalStateException("Footnote element cannot be presented in visibility check");
            case 5:
                return u961.g;
            case 6:
                return Boolean.FALSE;
            case 7:
                return Integer.valueOf(vm41.d);
            case 8:
                twb twbVar = new twb((byte) 29);
                HashMap map = new HashMap();
                ix7 ix7Var = new ix7((byte) 14);
                Set set = Collections.EMPTY_SET;
                ix7Var.v(set);
                ix7Var.t(30000L);
                ix7Var.w();
                map.put(xnw0.a, ix7Var.i());
                ix7 ix7Var2 = new ix7((byte) 14);
                ix7Var2.v(set);
                ix7Var2.t(1000L);
                ix7Var2.w();
                map.put(xnw0.c, ix7Var2.i());
                ix7 ix7Var3 = new ix7((byte) 14);
                ix7Var3.v(set);
                ix7Var3.t(86400000L);
                ix7Var3.w();
                ix7Var3.v(Collections.unmodifiableSet(new HashSet(Arrays.asList(jm41.b))));
                map.put(xnw0.b, ix7Var3.i());
                if (map.keySet().size() >= xnw0.values().length) {
                    new HashMap();
                    return new y19(twbVar, map);
                }
                eg.m("Not all priorities have been configured");
                return null;
            case 9:
                return new twb((byte) 29);
            default:
                return new khc((byte) 28);
        }
    }
}
