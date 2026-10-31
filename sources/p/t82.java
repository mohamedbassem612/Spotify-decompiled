package p;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class t82 {
    static {
        Class<s82> cls = s82.class;
        ypa0[] ypa0VarArr = {new b92(cls, (byte) 1)};
        HashMap map = new HashMap();
        ypa0 ypa0Var = ypa0VarArr[0];
        boolean zContainsKey = map.containsKey(ypa0Var.a);
        Class cls2 = ypa0Var.a;
        if (zContainsKey) {
            hhg1.n(cy30.k(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls2, ypa0Var);
        Class cls3 = ypa0VarArr[0].a;
        Collections.unmodifiableMap(map);
        ypa0[] ypa0VarArr2 = {new b92(cls, (byte) 4)};
        HashMap map2 = new HashMap();
        ypa0 ypa0Var2 = ypa0VarArr2[0];
        boolean zContainsKey2 = map2.containsKey(ypa0Var2.a);
        Class cls4 = ypa0Var2.a;
        if (zContainsKey2) {
            hhg1.n(cy30.k(cls4, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map2.put(cls4, ypa0Var2);
        Class cls5 = ypa0VarArr2[0].a;
        Collections.unmodifiableMap(map2);
        ypa0[] ypa0VarArr3 = {new b92(cls, (byte) 5)};
        HashMap map3 = new HashMap();
        ypa0 ypa0Var3 = ypa0VarArr3[0];
        boolean zContainsKey3 = map3.containsKey(ypa0Var3.a);
        Class cls6 = ypa0Var3.a;
        if (zContainsKey3) {
            hhg1.n(cy30.k(cls6, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map3.put(cls6, ypa0Var3);
        Class cls7 = ypa0VarArr3[0].a;
        Collections.unmodifiableMap(map3);
        ypa0[] ypa0VarArr4 = {new b92(cls, (byte) 3)};
        HashMap map4 = new HashMap();
        ypa0 ypa0Var4 = ypa0VarArr4[0];
        boolean zContainsKey4 = map4.containsKey(ypa0Var4.a);
        Class cls8 = ypa0Var4.a;
        if (zContainsKey4) {
            hhg1.n(cy30.k(cls8, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map4.put(cls8, ypa0Var4);
        Class cls9 = ypa0VarArr4[0].a;
        Collections.unmodifiableMap(map4);
        ypa0[] ypa0VarArr5 = {new b92(cls, (byte) 8)};
        HashMap map5 = new HashMap();
        ypa0 ypa0Var5 = ypa0VarArr5[0];
        boolean zContainsKey5 = map5.containsKey(ypa0Var5.a);
        Class cls10 = ypa0Var5.a;
        if (zContainsKey5) {
            hhg1.n(cy30.k(cls10, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map5.put(cls10, ypa0Var5);
        Class cls11 = ypa0VarArr5[0].a;
        Collections.unmodifiableMap(map5);
        ypa0[] ypa0VarArr6 = {new b92(cls, (byte) 9)};
        HashMap map6 = new HashMap();
        ypa0 ypa0Var6 = ypa0VarArr6[0];
        boolean zContainsKey6 = map6.containsKey(ypa0Var6.a);
        Class cls12 = ypa0Var6.a;
        if (zContainsKey6) {
            hhg1.n(cy30.k(cls12, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map6.put(cls12, ypa0Var6);
        Class cls13 = ypa0VarArr6[0].a;
        Collections.unmodifiableMap(map6);
        ypa0[] ypa0VarArr7 = {new b92(cls, (byte) 7)};
        HashMap map7 = new HashMap();
        ypa0 ypa0Var7 = ypa0VarArr7[0];
        boolean zContainsKey7 = map7.containsKey(ypa0Var7.a);
        Class cls14 = ypa0Var7.a;
        if (zContainsKey7) {
            hhg1.n(cy30.k(cls14, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map7.put(cls14, ypa0Var7);
        Class cls15 = ypa0VarArr7[0].a;
        Collections.unmodifiableMap(map7);
        ypa0[] ypa0VarArr8 = {new b92(cls, (byte) 10)};
        HashMap map8 = new HashMap();
        ypa0 ypa0Var8 = ypa0VarArr8[0];
        boolean zContainsKey8 = map8.containsKey(ypa0Var8.a);
        Class cls16 = ypa0Var8.a;
        if (zContainsKey8) {
            hhg1.n(cy30.k(cls16, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map8.put(cls16, ypa0Var8);
        Class cls17 = ypa0VarArr8[0].a;
        Collections.unmodifiableMap(map8);
        int i = wf11.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        int i = juf0.a;
        vf11.f(new zl60(), true);
        d92.S();
        vf11.g(new luf0());
        d92.T();
        d92.U();
        d92.V();
        d92.W();
        d92.Y();
        d92.Z();
        d92.a0();
        d92.b0();
        vf11.g(new v82());
    }
}
