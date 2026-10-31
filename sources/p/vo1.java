package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public interface vo1 extends Parcelable {
    default tu1 N(tu1 tu1Var) {
        long j = tu1Var.c ? tu1Var.b : 1L;
        return new tu1(j + 1, o7h.O0(new su1(j, this), tu1Var.b()));
    }

    default tu1 e0(tu1 tu1Var) {
        if (!u890.j(tu1Var.a().b, this) || tu1Var.b().size() <= 1) {
            return tu1Var;
        }
        return new tu1(tu1Var.b, o7h.l0(1, tu1Var.b()));
    }
}
