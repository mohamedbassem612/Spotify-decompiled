package p;

import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p8o1 implements q7o1 {
    public final oao1 a;
    public boolean b = true;
    public final aje0 c;

    public p8o1(aje0 aje0Var, oao1 oao1Var) {
        this.c = aje0Var;
        this.a = oao1Var;
    }

    @Override // p.q7o1
    public final c6o1 a(Exception exc) {
        int i;
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode == -100) {
                i = 44;
            } else if (errorCode == -12) {
                i = 39;
            } else if (errorCode == -3) {
                i = 30;
            } else if (errorCode == -2) {
                i = 29;
            } else if (errorCode != -1) {
                switch (errorCode) {
                    case -19:
                        i = 54;
                        break;
                    case -18:
                        i = 53;
                        break;
                    case -17:
                        i = 52;
                        break;
                    case -16:
                        i = 43;
                        break;
                    case -15:
                        i = 42;
                        break;
                    case -14:
                        i = 41;
                        break;
                    default:
                        switch (errorCode) {
                            case -9:
                                i = 36;
                                break;
                            case -8:
                                i = 35;
                                break;
                            case -7:
                                i = 34;
                                break;
                            case -6:
                                i = 33;
                                break;
                            case -5:
                                i = 32;
                                break;
                            default:
                                i = 2;
                                break;
                        }
                        break;
                }
            } else {
                i = 28;
            }
        } else {
            i = 45;
        }
        pnn1 pnn1VarX = qnn1.x();
        pnn1VarX.j(i);
        pnn1VarX.i(15);
        return bmq0.m0(this, pnn1VarX.e());
    }

    @Override // p.q7o1
    public final qwo1 b(cmn1 cmn1Var) {
        return new qwo1(new p5o(this, cmn1Var, (lnm) null, (byte) 6));
    }

    @Override // p.q7o1
    public final qwo1 c(sln1 sln1Var) {
        return new qwo1(new q4m1(sln1Var, this, (lnm) null, (byte) 12));
    }

    @Override // p.q7o1
    public final int zza() {
        return 2;
    }

    @Override // p.q7o1
    public final boolean zzb() {
        return this.b;
    }
}
