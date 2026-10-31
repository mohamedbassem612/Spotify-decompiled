package p;

import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nm61 {
    public static final mnv0 c = rc2.o("firebase_sessions_enabled");
    public static final mnv0 d = rc2.s("firebase_sessions_sampling_rate");
    public static final mnv0 e = rc2.A("firebase_sessions_restart_timeout");
    public static final mnv0 f = rc2.A("firebase_sessions_cache_duration");
    public static final mnv0 g = rc2.B("firebase_sessions_cache_updated_time");
    public final r4r a;
    public cb61 b;

    public nm61(r4r r4rVar) {
        this.a = r4rVar;
        c921.C(new lm61(this, (lnm) null, (byte) 0));
    }

    public final boolean a() {
        cb61 cb61Var = this.b;
        if (cb61Var == null) {
            u890.C("sessionConfigs");
            throw null;
        }
        Long l = cb61Var.e;
        if (cb61Var != null) {
            Integer num = cb61Var.d;
            return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / 1000 >= ((long) num.intValue());
        }
        u890.C("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(mnv0 mnv0Var, Object obj, onm onmVar) {
        mm61 mm61Var;
        if (onmVar instanceof mm61) {
            mm61Var = (mm61) onmVar;
            int i = mm61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mm61Var.c = i - Integer.MIN_VALUE;
            } else {
                mm61Var = new mm61(this, onmVar);
            }
        } else {
            mm61Var = new mm61(this, onmVar);
        }
        Object obj2 = mm61Var.a;
        int i2 = mm61Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                r4r r4rVar = this.a;
                c6h0 c6h0Var = new c6h0(obj, mnv0Var, this, (lnm) null, (byte) 26);
                mm61Var.c = 1;
                Object objH = jm5.h(r4rVar, c6h0Var, mm61Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
            }
        } catch (IOException e2) {
            e2.toString();
        }
        return rih1.a;
    }

    public final void c(cen0 cen0Var) {
        Boolean bool = (Boolean) cen0Var.a.get(c);
        LinkedHashMap linkedHashMap = cen0Var.a;
        this.b = new cb61(bool, (Double) linkedHashMap.get(d), (Integer) linkedHashMap.get(e), (Integer) linkedHashMap.get(f), (Long) linkedHashMap.get(g));
    }
}
