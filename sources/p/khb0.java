package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class khb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ phb0 a;

    public khb0(phb0 phb0Var) {
        this.a = phb0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        boolean zJ;
        hhb0 hhb0Var = (hhb0) obj;
        nib0 nib0Var = this.a.d;
        String str = hhb0Var.a;
        String str2 = hhb0Var.b;
        String str3 = hhb0Var.c;
        tv80 tv80Var = hhb0Var.d;
        bpb1 bpb1Var = nib0Var.k;
        idd1 idd1Var = nib0Var.d;
        vlw0 vlw0Var = (vlw0) bpb1Var.getValue();
        if (u890.j(vlw0Var, tlw0.a)) {
            zJ = false;
        } else if (vlw0Var instanceof olw0) {
            zJ = u890.j(((olw0) vlw0Var).a, str3);
        } else {
            if (!(vlw0Var instanceof rlw0)) {
                eg.o();
                return null;
            }
            zJ = u890.j(((rlw0) vlw0Var).a, str3);
        }
        if (zJ) {
            nib0Var.e();
        } else if (str2 != null) {
            ((ttm0) nib0Var.b.get()).a((zau0) idd1Var.getValue());
            r091 r091VarR = q3p1.r((zau0) idd1Var.getValue(), nib0Var.h);
            if (r091VarR != null) {
                nib0Var.d(r091VarR);
                nib0Var.i = str3;
                nib0Var.j = false;
                bpb1Var.m((Object) null, new olw0(str3));
                r091VarR.b(new lsm0(str2, new ksm0(new gec1(nib0Var.e), str, nib0Var.c.b.a, "playlist-mixing-later-in-playlist-preview", str3, (String) null, 480), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
                r091VarR.k();
                r091.f(r091VarR, tv80Var, (Long) null, bky0.a, 6);
            }
        }
        return rih1.a;
    }
}
