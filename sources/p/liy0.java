package p;

import androidx.glance.appwidget.protobuf.e;
import androidx.glance.appwidget.protobuf.g;
import androidx.glance.appwidget.protobuf.h;
import androidx.glance.appwidget.protobuf.i;
import androidx.glance.appwidget.protobuf.j;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class liy0 {
    public static final liy0 c = new liy0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final t7o0 a = new t7o0();

    public static liy0 a() {
        return c;
    }

    public final qm41 b(Class cls) {
        zz00 zz00Var;
        qm41 qm41VarW;
        Class cls2;
        j290.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        qm41 qm41Var = (qm41) concurrentHashMap.get(cls);
        if (qm41Var != null) {
            return qm41Var;
        }
        Class cls3 = i.a;
        if (!e.class.isAssignableFrom(cls) && (cls2 = i.a) != null && !cls2.isAssignableFrom(cls)) {
            hhg1.n("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        vvz0 vvz0VarA = ((hig0) this.a.b).a(cls);
        if ((vvz0VarA.d & 2) == 2) {
            if (e.class.isAssignableFrom(cls)) {
                qm41VarW = new h(i.c, c010.a, vvz0VarA.a);
            } else {
                j jVar = i.b;
                zz00 zz00Var2 = c010.b;
                if (zz00Var2 == null) {
                    eg.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                qm41VarW = new h(jVar, zz00Var2, vvz0VarA.a);
            }
        } else if (e.class.isAssignableFrom(cls)) {
            qm41VarW = g.w(vvz0VarA, v9o0.b, utc0.b, i.c, l1d.C(vvz0VarA.a()) != 1 ? c010.a : null, yng0.b);
        } else {
            r9o0 r9o0Var = v9o0.a;
            stc0 stc0Var = utc0.a;
            j jVar2 = i.b;
            if (l1d.C(vvz0VarA.a()) != 1) {
                zz00 zz00Var3 = c010.b;
                if (zz00Var3 == null) {
                    eg.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                zz00Var = zz00Var3;
            } else {
                zz00Var = null;
            }
            qm41VarW = g.w(vvz0VarA, r9o0Var, stc0Var, jVar2, zz00Var, yng0.a);
        }
        qm41 qm41Var2 = (qm41) concurrentHashMap.putIfAbsent(cls, qm41VarW);
        return qm41Var2 != null ? qm41Var2 : qm41VarW;
    }

    public final qm41 c(Object obj) {
        return b(obj.getClass());
    }
}
