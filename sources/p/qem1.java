package p;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qem1 implements hth0 {
    public final Context a;
    public final cxc b;
    public final Uri c;
    public final c9n d;
    public yo00 e;
    public Surface f;
    public final bpb1 g;
    public final bpb1 h;
    public xab1 i;
    public float j;
    public boolean k;
    public final xe01 l;
    public final xe01 m;
    public final pem1 n;

    public qem1(Context context, cxc cxcVar, Uri uri) {
        z8n z8nVar = new z8n("WrappedPlacesVideoTimeout");
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(flo1.l(z8nVar, pyf0.a.f));
        this.a = context;
        this.b = cxcVar;
        this.c = uri;
        this.d = llmVarE;
        bpb1 bpb1VarB = gio1.b(lem1.a);
        this.g = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(Boolean.FALSE);
        this.h = bpb1VarB2;
        this.j = 1.0f;
        this.l = d5p1.h(bpb1VarB);
        this.m = d5p1.h(bpb1VarB2);
        this.n = new pem1(this);
    }

    @Override // p.hth0
    public final void a() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = null;
        yo00 yo00Var = this.e;
        if (yo00Var != null) {
            yo00Var.M(false);
        }
    }

    @Override // p.hth0
    public final void b(boolean z) {
        if (z == this.k) {
            return;
        }
        this.k = z;
        yo00 yo00Var = this.e;
        if (yo00Var != null) {
            yo00Var.g(z ? 0.0f : this.j);
        }
    }

    @Override // p.hth0
    public final float c() {
        return this.j;
    }

    @Override // p.hth0
    public final void d() {
        yo00 yo00Var = this.e;
        if (yo00Var != null) {
            yo00Var.h1(5, 0L);
        }
    }

    public final void e() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = null;
        yo00 yo00Var = this.e;
        if (yo00Var != null) {
            yo00Var.P(this.n);
            yo00Var.y1();
        }
        this.e = null;
        this.g.m((Object) null, lem1.a);
        this.h.m((Object) null, Boolean.FALSE);
    }

    public final void f() {
        if (this.e != null) {
            return;
        }
        cl60 cl60VarE = new HlsMediaSource.Factory(new dzp0(this.b, (byte) 1)).e(yoh0.c(this.c));
        HashMap map = new HashMap();
        map.put(dbu0.d.a, 144179200);
        h6s.a(2500, "bufferForPlaybackMs", 0, "0");
        h6s.a(2500, "bufferForPlaybackAfterRebufferMs", 0, "0");
        h6s.a(4000, "minBufferMs", 2500, "bufferForPlaybackMs");
        h6s.a(4000, "minBufferMs", 2500, "bufferForPlaybackAfterRebufferMs");
        h6s.a(4000, "maxBufferMs", 4000, "minBufferMs");
        h6s h6sVar = new h6s(new a9a((byte) 1), 4000, 4000, 4000, 4000, 2500, 2500, 2500, 2500, true, 0, map);
        u61 u61Var = new u61(2000);
        Context context = this.a;
        exs exsVar = new exs(context, u61Var);
        bo00 bo00Var = new bo00(context);
        bo00Var.b(h6sVar);
        bo00Var.c(exsVar);
        yo00 yo00VarA = bo00Var.a();
        this.e = yo00VarA;
        yo00VarA.m.a(this.n);
        yo00VarA.W0(cl60VarE);
        yo00VarA.setRepeatMode(2);
        yo00VarA.M(false);
        Surface surface = this.f;
        if (surface != null) {
            yo00VarA.n(surface);
        }
        yo00VarA.g(this.k ? 0.0f : this.j);
        yo00VarA.e();
    }

    @Override // p.hth0
    public final void g(float f) {
        float fO = zko1.o(f);
        this.j = fO;
        yo00 yo00Var = this.e;
        if (yo00Var != null) {
            if (this.k) {
                fO = 0.0f;
            }
            yo00Var.g(fO);
        }
    }

    public final void h() {
        yo00 yo00Var = this.e;
        if (yo00Var == null) {
            return;
        }
        yo00Var.J1();
        if (yo00Var.t0.f != null) {
            yo00Var.e();
        }
        yo00Var.M(true);
        if (((Boolean) this.h.getValue()).booleanValue()) {
            return;
        }
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = fn31.T(this.d, (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 25), 3);
    }

    @Override // p.hth0
    public final void j() {
        h();
    }

    @Override // p.hth0
    public final void release() {
        e();
    }
}
