package p;

import android.media.metrics.LogSessionId;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qkj1 {
    public final gwg a;
    public final ie30 b;
    public final b380 c;
    public final List d;
    public final zfg1 e;
    public final yjq f;
    public final String g;
    public final int h;
    public final LogSessionId i;
    public o3d1 j;
    public volatile fmr k;
    public volatile int l;
    public volatile boolean m;

    public qkj1(gwg gwgVar, ie30 ie30Var, b380 b380Var, b380 b380Var2, zfg1 zfg1Var, yjq yjqVar, LogSessionId logSessionId) {
        String str;
        x8h x8hVar = ie30Var.H;
        dm5.m(x8hVar != null);
        this.a = gwgVar;
        this.b = ie30Var;
        this.c = b380Var;
        this.d = b380Var2;
        this.e = zfg1Var;
        this.f = yjqVar;
        this.i = logSessionId;
        String str2 = ie30Var.f66p;
        str2.getClass();
        String str3 = "video/hevc";
        if (zfg1Var != null && (str = zfg1Var.c) != null) {
            str2 = str;
        } else if (asj0.m(str2)) {
            str2 = "video/hevc";
        }
        int i = zfg1Var != null ? zfg1Var.d : 0;
        if (i != 0 || !x8h.h(x8hVar) || !abx.f(str2, x8hVar).isEmpty()) {
            str3 = str2;
        } else if (abx.f("video/hevc", x8hVar).isEmpty()) {
            i = 2;
            str3 = str2;
        }
        Pair pairCreate = Pair.create(str3, Integer.valueOf(i));
        this.g = (String) pairCreate.first;
        this.h = ((Integer) pairCreate.second).intValue();
    }

    public final o3d1 a(int i, int i2) {
        x8h x8hVar;
        if (this.m) {
            return null;
        }
        o3d1 o3d1Var = this.j;
        if (o3d1Var != null) {
            return o3d1Var;
        }
        if (i < i2) {
            this.l = 90;
            i2 = i;
            i = i2;
        }
        if (this.b.C % 180 == this.l % 180) {
            this.l = this.b.C;
        }
        if (!this.c.contains(Integer.valueOf(this.l))) {
            int i3 = (this.l + 180) % 360;
            if (this.c.contains(Integer.valueOf(i3))) {
                this.l = i3;
            } else {
                this.l = ((Integer) this.c.get(0)).intValue();
                int i4 = i2;
                i2 = i;
                i = i4;
            }
        }
        ge30 ge30Var = new ge30();
        ge30Var.v = i;
        ge30Var.w = i2;
        ge30Var.B = 0;
        ge30Var.c(this.b.B);
        ge30Var.o = asj0.p(this.g);
        ie30 ie30Var = this.b;
        if ((!x8h.h(ie30Var.H) || this.h == 0) && !x8h.i.equals(ie30Var.H)) {
            x8hVar = ie30Var.H;
            x8hVar.getClass();
        } else {
            x8hVar = x8h.h;
        }
        ge30Var.G = x8hVar;
        ie30 ie30Var2 = new ie30(ge30Var);
        gwg gwgVar = this.a;
        ge30 ge30VarA = ie30Var2.a();
        ge30VarA.o = asj0.p(h541.b(ie30Var2, this.d));
        this.k = gwgVar.c(new ie30(ge30VarA), this.i);
        ie30 ie30Var3 = this.k.c;
        zfg1 zfg1Var = this.e;
        if (zfg1Var != null) {
            yjq yjqVar = this.f;
            boolean z = this.l != 0;
            int i5 = this.h;
            w4c0 w4c0VarA = zfg1Var.a();
            if (zfg1Var.d != i5) {
                w4c0VarA.c = i5;
            }
            if (!Objects.equals(ie30Var2.f66p, ie30Var3.f66p)) {
                w4c0VarA.L(ie30Var3.f66p);
            }
            if (z) {
                int i6 = ie30Var2.w;
                int i7 = ie30Var3.w;
                if (i6 != i7) {
                    w4c0VarA.b = i7;
                }
            } else {
                int i8 = ie30Var2.x;
                int i9 = ie30Var3.x;
                if (i8 != i9) {
                    w4c0VarA.b = i9;
                }
            }
            yjqVar.w(w4c0VarA.c());
        }
        Surface surface = this.k.e;
        surface.getClass();
        this.j = new o3d1(surface, ie30Var3.w, ie30Var3.x, this.l, true);
        if (this.m) {
            this.k.i();
        }
        return this.j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final void b() throws ExportException {
        if (this.k != null) {
            fmr fmrVar = this.k;
            if (!fmrVar.i.get()) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            LinkedHashMap linkedHashMap = x8r.a;
            try {
                synchronized (x8r.class) {
                    synchronized (x8r.class) {
                    }
                    fmrVar.d.signalEndOfInputStream();
                }
                fmrVar.d.signalEndOfInputStream();
            } catch (RuntimeException e) {
                oon1.t("MediaCodec error", e);
                throw fmrVar.b(e);
            }
        }
    }
}
