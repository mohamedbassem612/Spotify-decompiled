package p;

import com.google.protobuf.h;
import com.google.protobuf.j;
import com.google.protobuf.k;
import com.google.protobuf.l;
import com.google.protobuf.m;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oiy0 {
    public static final oiy0 c = new oiy0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final dp5 a = new dp5((byte) 2);

    public final sm41 a(Class cls) {
        xz00 xz00Var;
        sm41 sm41VarB;
        Class cls2;
        l290.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        sm41 sm41Var = (sm41) concurrentHashMap.get(cls);
        if (sm41Var != null) {
            return sm41Var;
        }
        Class cls3 = l.a;
        if (!h.class.isAssignableFrom(cls) && (cls2 = l.a) != null && !cls2.isAssignableFrom(cls)) {
            hhg1.n("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        jzi0 jzi0VarA = ((jig0) this.a.b).a(cls);
        if (jzi0VarA.a()) {
            if (h.class.isAssignableFrom(cls)) {
                sm41VarB = new k(l.c, e010.a, jzi0VarA.b());
            } else {
                m mVar = l.b;
                xz00 xz00Var2 = e010.b;
                if (xz00Var2 == null) {
                    eg.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                sm41VarB = new k(mVar, xz00Var2, jzi0VarA.b());
            }
        } else if (h.class.isAssignableFrom(cls)) {
            sm41VarB = j.B(jzi0VarA, x9o0.b, ttc0.b, l.c, l1d.C(jzi0VarA.c()) != 1 ? e010.a : null, aog0.b);
        } else {
            p9o0 p9o0Var = x9o0.a;
            otc0 otc0Var = ttc0.a;
            m mVar2 = l.b;
            if (l1d.C(jzi0VarA.c()) != 1) {
                xz00 xz00Var3 = e010.b;
                if (xz00Var3 == null) {
                    eg.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                xz00Var = xz00Var3;
            } else {
                xz00Var = null;
            }
            sm41VarB = j.B(jzi0VarA, p9o0Var, otc0Var, mVar2, xz00Var, aog0.a);
        }
        sm41 sm41Var2 = (sm41) concurrentHashMap.putIfAbsent(cls, sm41VarB);
        return sm41Var2 != null ? sm41Var2 : sm41VarB;
    }
}
