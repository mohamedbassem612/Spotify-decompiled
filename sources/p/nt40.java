package p;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nt40 {
    public static final nt40 a = new nt40();
    public static final xgn0 b = ygn0.a();
    public static final LinkedHashMap c = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, v441 v441Var, String str, onm onmVar) {
        jt40 jt40Var;
        vgn0 vgn0Var;
        if (onmVar instanceof jt40) {
            jt40Var = (jt40) onmVar;
            int i = jt40Var.g;
            if ((i & os00.INVALID_ID) != 0) {
                jt40Var.g = i - os00.INVALID_ID;
            } else {
                jt40Var = new jt40(this, onmVar);
            }
        } else {
            jt40Var = new jt40(this, onmVar);
        }
        Object obj = jt40Var.e;
        int i2 = jt40Var.g;
        if (i2 == 0) {
            hm5.M(obj);
            jt40Var.a = context;
            jt40Var.b = v441Var;
            jt40Var.c = str;
            vgn0Var = b;
            jt40Var.d = vgn0Var;
            jt40Var.g = 1;
            Object objA = vgn0Var.a(jt40Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vgn0 vgn0Var2 = jt40Var.d;
            str = jt40Var.c;
            v441Var = jt40Var.b;
            Context context2 = jt40Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var2;
            context = context2;
        }
        try {
            c.remove(str);
            v441Var.a(context, str).delete();
            return rih1.a;
        } finally {
            vgn0Var.c((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, ot40 ot40Var, String str, onm onmVar) throws Throwable {
        kt40 kt40Var;
        vgn0 vgn0Var;
        vgn0 vgn0Var2;
        Throwable th;
        Object obj;
        Map map;
        if (onmVar instanceof kt40) {
            kt40Var = (kt40) onmVar;
            int i = kt40Var.g;
            if ((i & os00.INVALID_ID) != 0) {
                kt40Var.g = i - os00.INVALID_ID;
            } else {
                kt40Var = new kt40(this, onmVar);
            }
        } else {
            kt40Var = new kt40(this, onmVar);
        }
        Object obj2 = kt40Var.e;
        int i2 = kt40Var.g;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                kt40Var.a = context;
                kt40Var.b = ot40Var;
                kt40Var.c = str;
                vgn0Var = b;
                kt40Var.d = vgn0Var;
                kt40Var.g = 1;
                if (vgn0Var.a(kt40Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = (Map) kt40Var.c;
                vgn0Var2 = (vgn0) kt40Var.b;
                str = (String) kt40Var.a;
                try {
                    hm5.M(obj2);
                    obj = (r4r) obj2;
                    map.put(str, obj);
                    r4r r4rVar = (r4r) obj;
                    vgn0Var2.c((Object) null);
                    return r4rVar;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            vgn0 vgn0Var3 = kt40Var.d;
            str = (String) kt40Var.c;
            ot40Var = (ot40) kt40Var.b;
            Context context2 = (Context) kt40Var.a;
            hm5.M(obj2);
            vgn0Var = vgn0Var3;
            context = context2;
            LinkedHashMap linkedHashMap = c;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                kt40Var.a = str;
                kt40Var.b = vgn0Var;
                kt40Var.c = linkedHashMap;
                kt40Var.d = null;
                kt40Var.g = 2;
                Object objB = ot40Var.b(context, str);
                if (objB != d9nVar) {
                    vgn0Var2 = vgn0Var;
                    obj2 = objB;
                    map = linkedHashMap;
                    obj = (r4r) obj2;
                    map.put(str, obj);
                }
                return d9nVar;
            }
            vgn0Var2 = vgn0Var;
            r4r r4rVar2 = (r4r) obj;
            vgn0Var2.c((Object) null);
            return r4rVar2;
        } catch (Throwable th3) {
            vgn0Var2 = vgn0Var;
            th = th3;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, ot40 ot40Var, String str, onm onmVar) throws Throwable {
        lt40 lt40Var;
        if (onmVar instanceof lt40) {
            lt40Var = (lt40) onmVar;
            int i = lt40Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                lt40Var.c = i - os00.INVALID_ID;
            } else {
                lt40Var = new lt40(this, onmVar);
            }
        } else {
            lt40Var = new lt40(this, onmVar);
        }
        Object objB = lt40Var.a;
        int i2 = lt40Var.c;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            lt40Var.c = 1;
            objB = b(context, ot40Var, str, lt40Var);
            if (objB != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objB);
                return objB;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        mr20 data = ((r4r) objB).getData();
        lt40Var.c = 2;
        Object objI = b5p1.i(data, lt40Var);
        return objI == obj ? obj : objI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Context context, ot40 ot40Var, String str, vu30 vu30Var, onm onmVar) throws Throwable {
        mt40 mt40Var;
        if (onmVar instanceof mt40) {
            mt40Var = (mt40) onmVar;
            int i = mt40Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                mt40Var.d = i - os00.INVALID_ID;
            } else {
                mt40Var = new mt40(this, onmVar);
            }
        } else {
            mt40Var = new mt40(this, onmVar);
        }
        Object objB = mt40Var.b;
        int i2 = mt40Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            mt40Var.a = (a8d1) vu30Var;
            mt40Var.d = 1;
            objB = b(context, ot40Var, str, mt40Var);
            if (objB != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objB);
                return objB;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vu30Var = (vu30) mt40Var.a;
        hm5.M(objB);
        mt40Var.a = null;
        mt40Var.d = 2;
        Object objA = ((r4r) objB).a(vu30Var, mt40Var);
        return objA == obj ? obj : objA;
    }
}
