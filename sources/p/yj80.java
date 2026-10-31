package p;

import androidx.media3.common.VideoFrameProcessingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yj80 {
    public final o5 a;
    public dos b;
    public lls0 c;
    public boolean d;

    public yj80(o5 o5Var) {
        this.a = o5Var;
    }

    public final dos b() {
        return this.b;
    }

    public final void c(boolean z) {
        lls0 lls0Var = this.c;
        if (lls0Var == null) {
            return;
        }
        lls0Var.b = z;
    }

    public final void d(lls0 lls0Var) {
        this.c = lls0Var;
        dos dosVar = this.b;
        dosVar.getClass();
        dosVar.c = lls0Var;
    }

    public final void e(dos dosVar) throws VideoFrameProcessingException {
        dos dosVar2 = this.b;
        if (dosVar2 != null) {
            dosVar2.release();
        }
        this.b = dosVar;
        o5 o5Var = this.a;
        o5Var.K(dosVar);
        dosVar.c(o5Var);
    }
}
