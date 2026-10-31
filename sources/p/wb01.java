package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface wb01 extends qsk {
    @Override // p.qsk
    default Set c() {
        return l().c();
    }

    @Override // p.qsk
    default Object e(sy8 sy8Var) {
        return l().e(sy8Var);
    }

    @Override // p.qsk
    default void f(uk4 uk4Var) {
        l().f(uk4Var);
    }

    @Override // p.qsk
    default boolean g(sy8 sy8Var) {
        return l().g(sy8Var);
    }

    @Override // p.qsk
    default Object h(sy8 sy8Var, Object obj) {
        return l().h(sy8Var, obj);
    }

    @Override // p.qsk
    default osk i(sy8 sy8Var) {
        return l().i(sy8Var);
    }

    @Override // p.qsk
    default Object j(sy8 sy8Var, osk oskVar) {
        return l().j(sy8Var, oskVar);
    }

    @Override // p.qsk
    default Set k(sy8 sy8Var) {
        return l().k(sy8Var);
    }

    qsk l();
}
