package p;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yxi0 implements Closeable {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final nac c;
    public Object d;
    public Closeable e;

    public yxi0(byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = z;
                this.c = new nac();
                break;
            default:
                this.b = z;
                nac nacVar = new nac();
                this.c = nacVar;
                Deflater deflater = new Deflater(-1, true);
                this.d = deflater;
                this.e = new j4t(new df01(nacVar), deflater);
                break;
        }
    }

    public void a(nac nacVar) {
        j4t j4tVar = this.e;
        nac nacVar2 = this.c;
        if (nacVar2.b != 0) {
            hhg1.n("Failed requirement.");
            return;
        }
        if (this.b) {
            ((Deflater) this.d).reset();
        }
        j4tVar.B0(nacVar, nacVar.b);
        j4tVar.flush();
        rhc rhcVar = zxi0.a;
        if (nacVar2.i0(nacVar2.b - ((long) rhcVar.a.length), rhcVar)) {
            long j = nacVar2.b - 4;
            lac lacVarQ = nacVar2.q(zod.c);
            try {
                lacVarQ.a(j);
                lacVarQ.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(lacVarQ, th);
                    throw th2;
                }
            }
        } else {
            nacVar2.R(0);
        }
        nacVar.B0(nacVar2, nacVar2.b);
    }

    public void c(nac nacVar) {
        nac nacVar2 = this.c;
        if (nacVar2.b != 0) {
            hhg1.n("Failed requirement.");
            return;
        }
        Inflater inflater = (Inflater) this.d;
        if (inflater == null) {
            inflater = new Inflater(true);
            this.d = inflater;
        }
        fb80 fb80Var = this.e;
        if (fb80Var == null) {
            fb80Var = new fb80(nacVar2, inflater);
            this.e = fb80Var;
        }
        if (this.b) {
            inflater.reset();
        }
        nacVar2.B(nacVar);
        nacVar2.U(65535);
        long bytesRead = inflater.getBytesRead() + nacVar2.b;
        do {
            fb80Var.a(nacVar, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            nacVar2.a();
            fb80Var.close();
            this.e = null;
            this.d = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                this.e.close();
                break;
            default:
                fb80 fb80Var = this.e;
                if (fb80Var != null) {
                    fb80Var.close();
                }
                this.e = null;
                this.d = null;
                break;
        }
    }
}
