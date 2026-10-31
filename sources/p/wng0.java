package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wng0 implements sng0 {
    @Override // p.sng0
    public final Object d(Object obj, Object obj2) {
        qng0 qng0VarH = (qng0) obj;
        qng0 qng0Var = (qng0) obj2;
        if (!qng0Var.isEmpty()) {
            if (!qng0VarH.a) {
                qng0VarH = qng0VarH.h();
            }
            qng0VarH.e();
            if (!qng0Var.isEmpty()) {
                qng0VarH.putAll(qng0Var);
            }
        }
        return qng0VarH;
    }

    @Override // p.sng0
    public final w6e0 e(Object obj) {
        return ((dng0) obj).a;
    }

    @Override // p.sng0
    public final Map f(Object obj) {
        return (qng0) obj;
    }

    @Override // p.sng0
    public final Object g(Object obj) {
        return qng0.b.h();
    }

    @Override // p.sng0
    public final Map h(Object obj) {
        return (qng0) obj;
    }

    @Override // p.sng0
    public final Object i(Object obj) {
        ((qng0) obj).a = false;
        return obj;
    }

    @Override // p.sng0
    public final int j(int i, Object obj, Object obj2) {
        qng0 qng0Var = (qng0) obj;
        dng0 dng0Var = (dng0) obj2;
        int iF = 0;
        if (qng0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : qng0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            dng0Var.getClass();
            int iE = rwg.e(i);
            int iA = dng0.a(dng0Var.a, key, value);
            iF += rwg.f(iA) + iA + iE;
        }
        return iF;
    }

    @Override // p.sng0
    public final boolean k(Object obj) {
        return !((qng0) obj).a;
    }
}
