package p;

import android.content.Context;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fxj1 extends h541 {
    public final exj1 e;
    public final qkj1 f;
    public final gar g;
    public volatile long h;
    public long i;
    public boolean j;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public fxj1(Context context, ie30 ie30Var, zfg1 zfg1Var, m9x0 m9x0Var, List list, yys yysVar, gwg gwgVar, dhn0 dhn0Var, ifb1 ifb1Var, yjq yjqVar, long j, boolean z, b380 b380Var, LogSessionId logSessionId) throws ExportException {
        x8h x8hVar;
        super(ie30Var, dhn0Var);
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        x8h x8hVar2 = ie30Var.H;
        x8hVar2.getClass();
        if (Objects.equals(ie30Var.f66p, "image/jpeg_r") && x8hVar2.c == 2) {
            x8hVar = new x8h(6, 1, 7, null, -1, -1);
        } else {
            int i = x8hVar2.c;
            x8hVar = (i == 2 || i == 10) ? x8h.h : x8hVar2;
        }
        ge30 ge30VarA = ie30Var.a();
        ge30VarA.G = x8hVar;
        qkj1 qkj1Var = new qkj1(gwgVar, new ie30(ge30VarA), b380Var, dhn0Var.b.b(2), zfg1Var, yjqVar, logSessionId);
        this.f = qkj1Var;
        this.g = new gar(0);
        if (qkj1Var.h == 2 && x8h.h(x8hVar2)) {
            x8hVar = x8h.h;
        }
        try {
            exj1 exj1Var = new exj1(this, context, z ? new dz81(yysVar, (byte) 1) : new dz81(yysVar, (byte) 0), x8hVar, m9x0Var, list, ifb1Var, j, true);
            this.e = exj1Var;
            exj1Var.a.j();
        } catch (VideoFrameProcessingException e) {
            throw ExportException.e(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    @Override // p.h541
    public final gd50 j(e4w e4wVar, ie30 ie30Var, int i) throws ExportException {
        try {
            exj1 exj1Var = this.e;
            npj1 npj1Var = exj1Var.a;
            npj1Var.l(i);
            return new okj1(npj1Var, i, exj1Var.e);
        } catch (VideoFrameProcessingException e) {
            throw ExportException.e(e);
        }
    }

    @Override // p.h541
    public final gar k() {
        gar garVar = this.g;
        qkj1 qkj1Var = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        garVar.d = qkj1Var.k != null ? qkj1Var.k.d() : null;
        if (this.g.d == null) {
            return null;
        }
        qkj1 qkj1Var2 = this.f;
        if (qkj1Var2.k != null) {
            fmr fmrVar = qkj1Var2.k;
            if (fmrVar.g(false)) {
                bufferInfo = fmrVar.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0 && this.e.a.i() == this.j && this.h != -9223372036854775807L && bufferInfo.size > 0) {
            bufferInfo.presentationTimeUs = this.h;
        }
        gar garVar2 = this.g;
        long j = bufferInfo.presentationTimeUs;
        garVar2.f = j;
        ((oac) garVar2).a = bufferInfo.flags;
        this.i = j;
        return garVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    @Override // p.h541
    public final ie30 l() throws ExportException {
        qkj1 qkj1Var = this.f;
        if (qkj1Var.k == null) {
            return null;
        }
        fmr fmrVar = qkj1Var.k;
        fmrVar.g(false);
        ie30 ie30Var = fmrVar.j;
        if (ie30Var == null || qkj1Var.l == 0) {
            return ie30Var;
        }
        ge30 ge30VarA = ie30Var.a();
        ge30VarA.B = qkj1Var.l;
        return new ie30(ge30VarA);
    }

    @Override // p.h541
    public final boolean m() {
        boolean z;
        qkj1 qkj1Var = this.f;
        if (qkj1Var.k == null || !qkj1Var.k.e()) {
            exj1 exj1Var = this.e;
            if (exj1Var.d) {
                z = false;
            } else {
                boolean z2 = exj1Var.h.h != -9223372036854775807L;
                synchronized (exj1Var.b) {
                    z = exj1Var.f == 0 && z2;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // p.h541
    public final void o() {
        this.e.a.release();
        qkj1 qkj1Var = this.f;
        if (qkj1Var.k != null) {
            qkj1Var.k.i();
        }
        qkj1Var.m = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    @Override // p.h541
    public final void p() throws ExportException {
        if (this.i == 0) {
            this.j = true;
        }
        qkj1 qkj1Var = this.f;
        if (qkj1Var.k != null) {
            qkj1Var.k.j();
        }
        exj1 exj1Var = this.e;
        if (exj1Var.d) {
            return;
        }
        synchronized (exj1Var.b) {
            dm5.y(exj1Var.f > 0);
            exj1Var.f--;
        }
        exj1Var.f();
    }
}
