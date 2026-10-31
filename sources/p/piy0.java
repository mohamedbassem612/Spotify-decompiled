package p;

import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.j;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class piy0 {
    public static final piy0 c = new piy0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final l7m0 a = new l7m0((byte) 1);

    public final tm41 a(Class cls) {
        h hVarT;
        Class cls2;
        n290.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        tm41 tm41Var = (tm41) concurrentHashMap.get(cls);
        if (tm41Var != null) {
            return tm41Var;
        }
        Class cls3 = i.a;
        if (!e.class.isAssignableFrom(cls) && (cls2 = i.a) != null && !cls2.isAssignableFrom(cls)) {
            hhg1.n("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        yvz0 yvz0VarA = ((kig0) this.a.b).a(cls);
        if ((yvz0VarA.d & 2) == 2) {
            if (e.class.isAssignableFrom(cls)) {
                hVarT = h.j(i.d, f010.a, yvz0VarA.a);
            } else {
                j jVar = i.b;
                b010 b010Var = f010.b;
                if (b010Var == null) {
                    eg.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                hVarT = h.j(jVar, b010Var, yvz0VarA.a);
            }
        } else if (e.class.isAssignableFrom(cls)) {
            hVarT = (yvz0VarA.d & 1) == 1 ? g.t(yvz0VarA, y9o0.b, ptc0.b, i.d, f010.a, bog0.b) : g.t(yvz0VarA, y9o0.b, ptc0.b, i.d, null, bog0.b);
        } else if ((yvz0VarA.d & 1) == 1) {
            u9o0 u9o0Var = y9o0.a;
            ktc0 ktc0Var = ptc0.a;
            j jVar2 = i.b;
            b010 b010Var2 = f010.b;
            if (b010Var2 == null) {
                eg.m("Protobuf runtime is not correctly loaded.");
                return null;
            }
            hVarT = g.t(yvz0VarA, u9o0Var, ktc0Var, jVar2, b010Var2, bog0.a);
        } else {
            hVarT = g.t(yvz0VarA, y9o0.a, ptc0.a, i.c, null, bog0.a);
        }
        tm41 tm41Var2 = (tm41) concurrentHashMap.putIfAbsent(cls, hVarT);
        return tm41Var2 != null ? tm41Var2 : hVarT;
    }
}
