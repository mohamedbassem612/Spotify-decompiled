package p;

import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oqc1 implements c0u0 {
    public final /* synthetic */ pqc1 a;

    public oqc1(pqc1 pqc1Var) {
        this.a = pqc1Var;
    }

    public final void r(hpc1 hpc1Var, long j, long j2) {
        pqc1 pqc1Var = this.a;
        pqc1Var.d = hpc1Var;
        if (pqc1Var.e) {
            return;
        }
        pqc1Var.g = hpc1Var;
        pqc1Var.b.onNext(Optional.ofNullable(hpc1Var));
    }

    public final void v(yhg0 yhg0Var, long j) {
        List list = yhg0Var.a;
        pqc1 pqc1Var = this.a;
        pqc1Var.c = list;
        if (pqc1Var.e) {
            return;
        }
        pqc1Var.f = list;
        pqc1Var.a.onNext(Boolean.valueOf(!list.isEmpty()));
    }
}
