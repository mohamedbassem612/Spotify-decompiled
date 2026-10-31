package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z83 implements kko {
    public final /* synthetic */ b93 a;

    public z83(b93 b93Var) {
        this.a = b93Var;
    }

    @Override // p.kko
    public final zob1 a() {
        return b93.c(this.a);
    }

    @Override // p.kko
    public final Object b(String str, tv80 tv80Var, onm onmVar) {
        b93.d(this.a, new v450(str, tv80Var));
        return rih1.a;
    }

    @Override // p.kko
    public final void c(Set set) {
        b93.d(this.a, new z450(set));
    }
}
