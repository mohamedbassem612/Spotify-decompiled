package androidx.media3.exoplayer.hls;

import java.util.List;
import p.cl60;
import p.d1s;
import p.dm5;
import p.f9v;
import p.g9v;
import p.h1s;
import p.ij81;
import p.il60;
import p.jl60;
import p.k2r;
import p.k9r;
import p.kp00;
import p.laz;
import p.nk60;
import p.o2i0;
import p.sjb;
import p.twb;
import p.ubc;
import p.xap;
import p.yoh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class HlsMediaSource$Factory implements o2i0 {
    public final nk60 a;
    public d1s b;
    public sjb c;
    public boolean d;
    public byte e;
    public final ubc f;
    public jl60 g;
    public final twb h;
    public g9v i;
    public final ij81 j;
    public final boolean k;
    public final boolean l;
    public final long m;

    public HlsMediaSource$Factory(nk60 nk60Var) {
        this.a = nk60Var;
        this.i = new k9r();
        this.f = new ubc((byte) 6);
        this.g = h1s.W0;
        this.j = new ij81(-1, (byte) 12);
        this.h = new twb((byte) 6);
        this.l = true;
        this.m = -9223372036854775807L;
        this.k = true;
        this.e = (byte) 3;
        this.d = true;
    }

    @Override // p.o2i0
    public final void a() {
        this.d = true;
    }

    @Override // p.o2i0
    public final void c(sjb sjbVar) {
        this.c = sjbVar;
    }

    @Override // p.o2i0
    public final void d() {
        this.e = (byte) 3;
    }

    @Override // p.o2i0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final cl60 b(yoh0 yoh0Var) {
        yoh0Var.b.getClass();
        d1s d1sVar = this.b;
        if (d1sVar == null) {
            d1sVar = new d1s();
            d1sVar.c = new sjb((byte) 7);
            d1sVar.b = (byte) 3;
            this.b = d1sVar;
        }
        d1s d1sVar2 = d1sVar;
        sjb sjbVar = this.c;
        if (sjbVar != null) {
            d1sVar2.c = sjbVar;
        }
        d1sVar2.a = this.d;
        d1sVar2.b = this.e;
        List list = yoh0Var.b.e;
        boolean zIsEmpty = list.isEmpty();
        il60 kp00Var = this.f;
        if (!zIsEmpty) {
            kp00Var = new kp00(kp00Var, list, (byte) 16);
        }
        f9v f9vVarB = this.i.b(yoh0Var);
        jl60 jl60Var = this.g;
        nk60 nk60Var = this.a;
        ij81 ij81Var = this.j;
        return new cl60(yoh0Var, this.a, d1sVar2, this.h, f9vVarB, ij81Var, jl60Var.b(nk60Var, ij81Var, kp00Var), this.m, this.k, this.l ? 1 : 0);
    }

    public final void f(laz lazVar) {
        dm5.s(lazVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.i = lazVar;
    }

    public HlsMediaSource$Factory(k2r k2rVar) {
        this((nk60) new xap(k2rVar, (byte) 10));
    }
}
