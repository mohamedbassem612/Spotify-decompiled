package p;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rk60 implements anh0, w2i0 {
    public final l270 a;
    public final o5n b;
    public final yt91 c;
    public final qma d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public hoh0 f;
    public bnh0 g;

    public rk60(l270 l270Var, o5n o5nVar, yt91 yt91Var, qma qmaVar) {
        this.a = l270Var;
        this.b = o5nVar;
        this.c = yt91Var;
        this.d = qmaVar;
    }

    @Override // p.w2i0
    public final void E(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var, int i2) {
        bnh0 bnh0Var;
        if (qqh0Var.a != 4 || (bnh0Var = this.g) == null) {
            return;
        }
        if (this.f != null) {
            bnh0Var.r();
        } else {
            u890.C("mediaIdentity");
            throw null;
        }
    }

    @Override // p.w2i0
    public final void F(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
        bnh0 bnh0Var = this.g;
        if (bnh0Var != null) {
            if (this.f != null) {
                bnh0Var.p(qqh0Var.b, qqh0Var.c);
            } else {
                u890.C("mediaIdentity");
                throw null;
            }
        }
    }

    @Override // p.anh0
    public final qba a(hoh0 hoh0Var, bpa bpaVar, gxu gxuVar, bnh0 bnh0Var, yeg1 yeg1Var) {
        b8c0 b8c0VarA;
        List listC;
        o5n o5nVar;
        this.f = hoh0Var;
        this.g = bnh0Var;
        String strB = b(hoh0Var);
        if (gxuVar != null) {
            strB = gxuVar.d();
            listC = gxuVar.c();
            b8c0VarA = gxuVar.a();
        } else {
            b8c0VarA = null;
            listC = null;
        }
        yyp0 yyp0Var = this.a;
        k2r k2rVarP = zgo1.p(yyp0Var.e().c(), bpaVar, yeg1Var);
        qma qmaVar = this.d;
        if (qmaVar.R1 && !(bpaVar instanceof coa)) {
            bpaVar = null;
        }
        HlsMediaSource.Factory factory = new HlsMediaSource.Factory(new ro30(zgo1.p(yyp0Var.c(), bpaVar, yeg1Var), k2rVarP, (byte) 14));
        int i = hon1.x(hoh0Var.a()) ? 2 : 3;
        if (oqo1.s(qmaVar.z1, i) && (o5nVar = this.b) != null) {
            zzo1.r(factory, o5nVar, hoh0Var.c(), i, bnh0Var);
        }
        factory.f(new laz(this.c.b(bnh0Var, i, b8c0VarA, hoh0Var.c()), (byte) 18));
        koh0 koh0Var = new koh0();
        koh0Var.c(strB);
        koh0Var.b(listC);
        cl60 cl60VarE = factory.e(koh0Var.a());
        Handler handler = this.e;
        cl60VarE.b(handler, this);
        cl60VarE.a(handler, bnh0Var);
        return cl60VarE;
    }

    @Override // p.anh0
    public final String b(hoh0 hoh0Var) {
        String strQ;
        String strA = hoh0Var.a();
        boolean zY = wqn1.y(strA);
        qma qmaVar = this.d;
        if (zY) {
            String strW = wqn1.w(strA);
            if (strW != null) {
                return String.format(qmaVar.a.b, Arrays.copyOf(new Object[]{strW}, 1));
            }
        } else if (hon1.x(strA) && (strQ = hon1.q(strA)) != null) {
            return nhc1.W(qmaVar.a.a, "{audio_id}", strQ);
        }
        return strA;
    }

    @Override // p.anh0
    public final boolean c(hoh0 hoh0Var) {
        if ((wqn1.y(hoh0Var.a()) && this.d.f) || hon1.x(hoh0Var.a())) {
            return true;
        }
        String path = Uri.parse(b(hoh0Var)).getPath();
        if (path != null) {
            return nhc1.R(path, ".m3u8", false);
        }
        return false;
    }

    @Override // p.w2i0
    public final void d(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
        bnh0 bnh0Var;
        if (qqh0Var.a != 4 || (bnh0Var = this.g) == null) {
            return;
        }
        if (this.f == null) {
            u890.C("mediaIdentity");
            throw null;
        }
        z6x z6xVar = z6x.a;
        bnh0Var.G(z6xVar, z6xVar, (nn51) null, (xw7) null, z6xVar, z6xVar, 1, (Long) null, (Long) null, false);
    }

    @Override // p.anh0
    public final int getType() {
        return 2;
    }

    @Override // p.w2i0
    public final void v(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var, IOException iOException, boolean z) {
        bnh0 bnh0Var;
        if (qqh0Var.a != 4 || (bnh0Var = this.g) == null) {
            return;
        }
        if (this.f != null) {
            bnh0Var.Q(iOException);
        } else {
            u890.C("mediaIdentity");
            throw null;
        }
    }
}
