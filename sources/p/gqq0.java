package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gqq0 extends aec1 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f55p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(izr0 izr0Var, byte[] bArr) {
        if (izr0Var.a() < bArr.length) {
            return false;
        }
        int i = izr0Var.b;
        byte[] bArr2 = new byte[bArr.length];
        izr0Var.o(0, bArr2, bArr.length);
        izr0Var.R(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p.aec1
    public final long b(izr0 izr0Var) {
        byte[] bArr = izr0Var.a;
        return (((long) this.i) * bs51.p(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p.aec1
    public final boolean c(izr0 izr0Var, long j, r2a1 r2a1Var) {
        if (e(izr0Var, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(izr0Var.a, izr0Var.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListL = bs51.l(bArrCopyOf);
            if (((ie30) r2a1Var.b) == null) {
                ge30 ge30Var = new ge30();
                ge30Var.n = asj0.p("audio/ogg");
                ge30Var.o = asj0.p("audio/opus");
                ge30Var.I = i;
                ge30Var.K = 48000;
                ge30Var.r = arrayListL;
                r2a1Var.b = new ie30(ge30Var);
                return true;
            }
        } else {
            boolean zE = e(izr0Var, f55p);
            ie30 ie30Var = (ie30) r2a1Var.b;
            if (!zE) {
                ie30Var.getClass();
                return false;
            }
            ie30Var.getClass();
            if (!this.n) {
                this.n = true;
                izr0Var.S(8);
                hjj0 hjj0VarA = muk1.a(b380.q((String[]) sj1.y(izr0Var, false, false).b));
                if (hjj0VarA != null) {
                    ge30 ge30VarA = ((ie30) r2a1Var.b).a();
                    ge30VarA.l = hjj0VarA.b(((ie30) r2a1Var.b).m);
                    r2a1Var.b = new ie30(ge30VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // p.aec1
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
