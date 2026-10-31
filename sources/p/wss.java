package p;

import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wss {
    public final ua91 a;
    public final lls0 b;
    public final eyh0 c;
    public final d5b1 d;
    public final int e;
    public final qp00 f;
    public final o2r g;
    public final boolean h;
    public final boolean i;
    public final long j = 1;
    public final List k;
    public boolean l;
    public int m;
    public BehindLiveWindowException n;

    public wss(ua91 ua91Var, lls0 lls0Var, eyh0 eyh0Var, d5b1 d5b1Var, int i, qp00 qp00Var, o2r o2rVar, yeg1 yeg1Var, boolean z, boolean z2) {
        ec10 pj30Var;
        this.a = ua91Var;
        this.b = lls0Var;
        this.c = eyh0Var;
        this.d = d5b1Var;
        this.e = i;
        this.f = qp00Var;
        this.g = o2rVar;
        this.h = z;
        this.i = z2;
        List<zvw0> list = a().b;
        this.k = list;
        xdx0 xdx0VarA = a();
        for (zvw0 zvw0Var : list) {
            lls0 lls0Var2 = this.b;
            byte b = xdx0VarA.a;
            ie30 ie30Var = zvw0Var.b;
            sjb sjbVar = (sjb) lls0Var2.c;
            String str = ie30Var.o;
            adc adcVar = null;
            if (asj0.n(str)) {
                if (lls0Var2.b) {
                    pj30Var = new upc1(sjbVar.h(ie30Var), ie30Var);
                }
                zvw0Var.i = adcVar;
            } else if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                pj30Var = new rch0(sjbVar, lls0Var2.b ? 1 : 3);
            } else if (Objects.equals(str, "image/jpeg")) {
                pj30Var = new b660(1, (byte) 1);
            } else if (Objects.equals(str, "image/png")) {
                pj30Var = new ukb((byte) 1);
            } else {
                pj30Var = new pj30(sjbVar, (!lls0Var2.b ? 32 : 0) | pj30.f(3), null, z6x.a);
            }
            adcVar = new adc(pj30Var, b, ie30Var);
            zvw0Var.i = adcVar;
        }
        if (yeg1Var != null) {
            this.g.a(yeg1Var);
        }
    }

    public final xdx0 a() {
        rpl rplVar = (rpl) this.d.a.get(0);
        return (xdx0) rplVar.d.get(this.e);
    }

    public final zvw0 b() {
        ie30 ie30VarS = this.f.s();
        for (zvw0 zvw0Var : this.k) {
            if (this.b.t(zvw0Var.b).equals(ie30VarS.b(0))) {
                return zvw0Var;
            }
        }
        return null;
    }
}
