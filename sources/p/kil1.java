package p;

import java.io.Closeable;
import java.io.EOFException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kil1 implements Closeable {
    public yxi0 Z;
    public final ff01 a;
    public final ig01 b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean t;
    public final nac X = new nac();
    public final nac Y = new nac();
    public final byte[] N0 = null;

    public kil1(ff01 ff01Var, ig01 ig01Var, boolean z, boolean z2) {
        this.a = ff01Var;
        this.b = ig01Var;
        this.c = z;
        this.d = z2;
    }

    public final void a() throws ProtocolException, EOFException {
        d();
        if (this.i) {
            c();
            return;
        }
        int i = this.f;
        if (i != 1 && i != 2) {
            TimeZone timeZone = z4n1.a;
            throw new ProtocolException("Unknown opcode: ".concat(Integer.toHexString(i)));
        }
        while (!this.e) {
            long j = this.g;
            nac nacVar = this.Y;
            if (j > 0) {
                this.a.f(nacVar, j);
            }
            if (this.h) {
                if (this.t) {
                    yxi0 yxi0Var = this.Z;
                    if (yxi0Var == null) {
                        yxi0Var = new yxi0((byte) 1, this.d);
                        this.Z = yxi0Var;
                    }
                    yxi0Var.c(nacVar);
                }
                bmq0 bmq0Var = this.b.a;
                if (i == 1) {
                    bmq0Var.Q(nacVar.I());
                    return;
                } else {
                    bmq0Var.R(nacVar.w(nacVar.b));
                    return;
                }
            }
            while (!this.e) {
                d();
                if (!this.i) {
                    break;
                } else {
                    c();
                }
            }
            if (this.f != 0) {
                int i2 = this.f;
                TimeZone timeZone2 = z4n1.a;
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(Integer.toHexString(i2)));
            }
        }
        k220.i("closed");
    }

    public final void c() throws ProtocolException, EOFException {
        String strI;
        short sE;
        long j = this.g;
        if (j > 0) {
            this.a.f(this.X, j);
        }
        switch (this.f) {
            case 8:
                nac nacVar = this.X;
                long j2 = nacVar.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    sE = nacVar.E();
                    strI = this.X.I();
                    String strQ = x760.q(sE);
                    if (strQ != null) {
                        throw new ProtocolException(strQ);
                    }
                } else {
                    strI = "";
                    sE = 1005;
                }
                ig01 ig01Var = this.b;
                if (sE == -1) {
                    hhg1.n("Failed requirement.");
                    return;
                }
                synchronized (ig01Var) {
                    if (ig01Var.s != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    ig01Var.s = sE;
                    ig01Var.t = strI;
                }
                ig01Var.a.O(ig01Var, sE, strI);
                this.e = true;
                return;
            case 9:
                ig01 ig01Var2 = this.b;
                nac nacVar2 = this.X;
                rhc rhcVarW = nacVar2.w(nacVar2.b);
                synchronized (ig01Var2) {
                    try {
                        if (!ig01Var2.u && (!ig01Var2.r || !ig01Var2.f40p.isEmpty())) {
                            ig01Var2.o.add(rhcVarW);
                            ig01Var2.e();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 10:
                ig01 ig01Var3 = this.b;
                nac nacVar3 = this.X;
                nacVar3.w(nacVar3.b);
                synchronized (ig01Var3) {
                    ig01Var3.w = false;
                }
                return;
            default:
                int i = this.f;
                TimeZone timeZone = z4n1.a;
                throw new ProtocolException("Unknown control opcode: ".concat(Integer.toHexString(i)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yxi0 yxi0Var = this.Z;
        if (yxi0Var != null) {
            w4n1.b(yxi0Var);
        }
        w4n1.b(this.a);
    }

    public final void d() throws ProtocolException, EOFException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        ff01 ff01Var = this.a;
        nac nacVar = ff01Var.b;
        fka1 fka1Var = ff01Var.a;
        if (this.e) {
            k220.i("closed");
            return;
        }
        long jH = fka1Var.l().h();
        fka1Var.l().b();
        try {
            byte bD = ff01Var.d();
            byte[] bArr = w4n1.a;
            fka1Var.l().g(jH, timeUnit);
            int i = bD & 15;
            this.f = i;
            int i2 = 0;
            boolean z2 = (bD & 128) != 0;
            this.h = z2;
            boolean z3 = (bD & 8) != 0;
            this.i = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (bD & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.t = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((bD & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((bD & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte bD2 = ff01Var.d();
            boolean z5 = (bD2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long jD = bD2 & 127;
            this.g = jD;
            if (jD == 126) {
                jD = ff01Var.j() & 65535;
                this.g = jD;
            } else if (jD == 127) {
                ff01Var.q(8L);
                jD = nacVar.D();
                this.g = jD;
                if (jD < 0) {
                    long j = this.g;
                    TimeZone timeZone = z4n1.a;
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(j) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.i && jD > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z5) {
                return;
            }
            byte[] bArr2 = this.N0;
            bArr2.getClass();
            try {
                ff01Var.q(bArr2.length);
                nacVar.z(bArr2);
            } catch (EOFException e) {
                while (true) {
                    long j2 = nacVar.b;
                    if (j2 <= 0) {
                        throw e;
                    }
                    int i3 = nacVar.read(bArr2, i2, (int) j2);
                    if (i3 == -1) {
                        hhg1.c();
                        return;
                    }
                    i2 += i3;
                }
            }
        } catch (Throwable th) {
            fka1Var.l().g(jH, timeUnit);
            throw th;
        }
    }
}
