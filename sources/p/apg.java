package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class apg implements p641 {
    public final p641 a;
    public final boolean b;
    public boolean c;
    public final /* synthetic */ bpg d;

    public apg(bpg bpgVar, p641 p641Var, boolean z) {
        this.d = bpgVar;
        this.a = p641Var;
        this.b = z;
    }

    public final int c(w2z w2zVar, gar garVar, int i) {
        bpg bpgVar = this.d;
        if (bpgVar.e()) {
            return -3;
        }
        boolean z = bpgVar.Y;
        p641 p641Var = this.a;
        if (z) {
            int iC = p641Var.c(w2zVar, garVar, i);
            if (iC != -5) {
                return iC;
            }
            bpg.l(w2zVar, bpgVar.i, bpgVar.t);
            return -5;
        }
        if (this.c) {
            ((oac) garVar).a = 4;
            return -4;
        }
        long jX = bpgVar.x();
        int iC2 = p641Var.c(w2zVar, garVar, i);
        if (bpgVar.h != -9223372036854775807L && iC2 != -3) {
            bpgVar.h = -9223372036854775807L;
        }
        if (iC2 == -5) {
            bpg.l(w2zVar, bpgVar.i, bpgVar.t);
            return -5;
        }
        long j = bpgVar.t;
        if (j == Long.MIN_VALUE || ((iC2 != -4 || garVar.f < j) && !(iC2 == -3 && jX == Long.MIN_VALUE && !garVar.e))) {
            return iC2;
        }
        garVar.g();
        ((oac) garVar).a = 4;
        this.c = true;
        return -4;
    }

    public final void e() {
        this.a.e();
    }

    public final int getFlags() {
        int flags = this.a.getFlags();
        if (this.d.t != Long.MIN_VALUE) {
            flags |= 1;
        }
        return this.b ? (flags & (-3)) | 4 : flags;
    }

    public final boolean isReady() {
        return !this.d.e() && this.a.isReady();
    }

    public final int s(long j) {
        if (this.d.e()) {
            return -3;
        }
        return this.a.s(j);
    }
}
