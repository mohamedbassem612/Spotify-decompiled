package p;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class uot {
    public static final /* synthetic */ int a = 0;

    static {
        ypa0[] ypa0VarArr = {new b92(tot.class, (byte) 6)};
        HashMap map = new HashMap();
        ypa0 ypa0Var = ypa0VarArr[0];
        boolean zContainsKey = map.containsKey(ypa0Var.a);
        Class cls = ypa0Var.a;
        if (zContainsKey) {
            hhg1.n(cy30.k(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, ypa0Var);
        Class cls2 = ypa0VarArr[0].a;
        Collections.unmodifiableMap(map);
        int i = wf11.CONFIG_NAME_FIELD_NUMBER;
        try {
            d92.X();
            vf11.g(new wot());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
