package p;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e48 extends h541 {
    public final fmr e;
    public final c18 f;
    public final gar g;
    public final gar h;
    public final hv7 i;
    public final jv7 j;
    public final ie30 k;
    public boolean l;
    public long m;
    public gar n;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public e48(ie30 ie30Var, ie30 ie30Var2, zfg1 zfg1Var, e4w e4wVar, b380 b380Var, hfb hfbVar, gwg gwgVar, dhn0 dhn0Var, yjq yjqVar, LogSessionId logSessionId) throws ExportException {
        jv7 jv7VarC;
        super(ie30Var, dhn0Var);
        sfa1 sfa1Var = new sfa1(false);
        v280 v280Var = new v280(4);
        v280Var.e(b380Var);
        v280Var.c(sfa1Var);
        hv7 hv7Var = new hv7(hfbVar, v280Var.g());
        this.i = hv7Var;
        this.k = ie30Var2;
        jv7 jv7VarC2 = hv7Var.c(e4wVar, ie30Var2);
        b18 b18Var = hv7Var.c;
        c18 c18Var = b18Var.d;
        boolean zEquals = c18Var.equals(c18.e);
        int i = c18Var.a;
        dm5.y(!zEquals);
        ge30 ge30Var = new ge30();
        zfg1 zfg1VarC = zfg1Var;
        String str = zfg1VarC.b;
        if (str == null) {
            str = ie30Var.f66p;
            str.getClass();
        }
        ge30Var.o = asj0.p(str);
        ge30Var.K = i;
        ge30Var.I = c18Var.b;
        ge30Var.L = c18Var.c;
        ie30 ie30Var3 = new ie30(ge30Var);
        ge30 ge30VarA = ie30Var3.a();
        ge30VarA.o = asj0.p(h541.b(ie30Var3, dhn0Var.b.b(1)));
        fmr fmrVarB = gwgVar.b(new ie30(ge30VarA), logSessionId);
        ie30 ie30Var4 = fmrVarB.c;
        this.e = fmrVarB;
        try {
            int i2 = new c18(fmr.a(fmrVarB.d.getInputFormat(), fmrVarB.g, ie30Var4.m)).a;
            if (i2 != i) {
                hv7Var.d();
                dm5.m(i2 == -1 || i2 > 0);
                sfa1Var.c = i2;
                jv7VarC = hv7Var.c(e4wVar, ie30Var2);
                c18Var = b18Var.d;
            } else {
                jv7VarC = jv7VarC2;
            }
            this.j = jv7VarC;
            this.f = c18Var;
            this.g = new gar(0);
            this.h = new gar(0);
            if (!Objects.equals(ie30Var3.f66p, ie30Var4.f66p)) {
                w4c0 w4c0VarA = zfg1VarC.a();
                w4c0VarA.H(ie30Var4.f66p);
                zfg1VarC = w4c0VarA.c();
            }
            yjqVar.w(zfg1VarC);
        } catch (RuntimeException e) {
            oon1.t("MediaCodec error", e);
            throw fmrVarB.b(e);
        }
    }

    @Override // p.h541
    public final gd50 j(e4w e4wVar, ie30 ie30Var, int i) {
        if (this.l) {
            return this.i.c(e4wVar, ie30Var);
        }
        this.l = true;
        dm5.y(ie30Var.equals(this.k));
        return this.j;
    }

    @Override // p.h541
    public final gar k() {
        fmr fmrVar = this.e;
        ByteBuffer byteBufferD = fmrVar.d();
        gar garVar = this.h;
        garVar.d = byteBufferD;
        if (byteBufferD == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = fmrVar.g(false) ? fmrVar.a : null;
        bufferInfo.getClass();
        garVar.f = bufferInfo.presentationTimeUs;
        ((oac) garVar).a = 1;
        return garVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    @Override // p.h541
    public final ie30 l() throws ExportException {
        fmr fmrVar = this.e;
        fmrVar.g(false);
        return fmrVar.j;
    }

    @Override // p.h541
    public final boolean m() {
        return this.e.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    @Override // p.h541
    public final boolean n() throws ExportException {
        boolean z;
        gar garVar = this.n;
        gar garVar2 = this.g;
        fmr fmrVar = this.e;
        if (garVar == null && !fmrVar.f(garVar2)) {
            return false;
        }
        if (!this.i.b()) {
            return q();
        }
        if (this.n != null) {
            q();
        }
        x8r.a();
        if (this.n == null) {
            ByteBuffer byteBuffer = garVar2.d;
            byteBuffer.getClass();
            if (byteBuffer.position() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        dm5.y(z);
        long j = this.m;
        c18 c18Var = this.f;
        garVar2.f = ((j / ((long) c18Var.d)) * 1000000) / ((long) c18Var.a);
        garVar2.e(4);
        garVar2.j();
        fmrVar.h(garVar2);
        return false;
    }

    @Override // p.h541
    public final void o() {
        this.i.d();
        this.e.i();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    @Override // p.h541
    public final void p() throws ExportException {
        this.e.j();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final boolean q() throws ExportException {
        hv7 hv7Var;
        gar garVar = this.n;
        if (garVar == null) {
            garVar = this.g;
        }
        ByteBuffer byteBuffer = garVar.d;
        byteBuffer.getClass();
        while (true) {
            hv7Var = this.i;
            if (hv7Var.b() || !hv7Var.a().hasRemaining() || byteBuffer.remaining() <= 0) {
                break;
            }
            ByteBuffer byteBufferA = hv7Var.a();
            int iMin = Math.min(byteBufferA.remaining(), byteBuffer.remaining());
            int iLimit = byteBufferA.limit();
            byteBufferA.limit(byteBufferA.position() + iMin);
            byteBuffer.put(byteBufferA);
            byteBufferA.limit(iLimit);
        }
        if (byteBuffer.remaining() != 0 && !hv7Var.b()) {
            this.n = garVar;
            return false;
        }
        long j = this.m;
        c18 c18Var = this.f;
        garVar.f = ((j / ((long) c18Var.d)) * 1000000) / ((long) c18Var.a);
        this.m = j + ((long) byteBuffer.position());
        ((oac) garVar).a = 0;
        garVar.j();
        this.e.h(garVar);
        this.n = null;
        return true;
    }
}
