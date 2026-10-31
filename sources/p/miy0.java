package p;

import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.g;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class miy0 {
    public static final miy0 c = new miy0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ifl1 a = new ifl1((byte) 1);

    public final rm41 a(Class cls) {
        h hVarU;
        Class cls2;
        k290.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        rm41 rm41Var = (rm41) concurrentHashMap.get(cls);
        if (rm41Var != null) {
            return rm41Var;
        }
        Class cls3 = i.a;
        if (!e.class.isAssignableFrom(cls) && (cls2 = i.a) != null && !cls2.isAssignableFrom(cls)) {
            hhg1.n("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        wvz0 wvz0VarA = ((iig0) this.a.b).a(cls);
        if ((wvz0VarA.d & 2) == 2) {
            hVarU = e.class.isAssignableFrom(cls) ? h.k(i.d, d010.a, wvz0VarA.a) : h.k(i.b, d010.a(), wvz0VarA.a);
        } else if (e.class.isAssignableFrom(cls)) {
            hVarU = (wvz0VarA.d & 1) == 1 ? g.u(wvz0VarA, w9o0.b, ntc0.b, i.d, d010.a, zng0.b) : g.u(wvz0VarA, w9o0.b, ntc0.b, i.d, null, zng0.b);
        } else {
            hVarU = (wvz0VarA.d & 1) == 1 ? g.u(wvz0VarA, w9o0.a, ntc0.a, i.b, d010.a(), zng0.a) : g.u(wvz0VarA, w9o0.a, ntc0.a, i.c, null, zng0.a);
        }
        rm41 rm41Var2 = (rm41) concurrentHashMap.putIfAbsent(cls, hVarU);
        return rm41Var2 != null ? rm41Var2 : hVarU;
    }
}
