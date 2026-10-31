package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jf3 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ if3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf3(if3 if3Var, byte b) {
        super(3);
        this.a = b;
        this.b = if3Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        if3 if3Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = if3Var.c.a;
                if (str == null) {
                    str = "";
                }
                Uri uri = Uri.parse(str);
                qim0 qim0VarN = anm1.N("album_row_artist_artwork", nim0Var);
                akx akxVar = akx.c;
                nux nuxVar = new nux(akxVar, akxVar);
                as80 as80Var = mif1.P0;
                cbx.a.getClass();
                eso1.e(uri, isl.a, qim0VarN, new p3v(80.0f), (zvx) null, uwr.a(), as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073769520, 0, 3456);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), een.N0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                int iOrdinal = if3Var.d.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal != 1) {
                    i = 2;
                    if (iOrdinal != 2) {
                        i = 3;
                        if (iOrdinal != 3) {
                            i = 4;
                            if (iOrdinal != 4) {
                                eg.o();
                                return null;
                            }
                        }
                    }
                } else {
                    i = 1;
                }
                if (i == 0) {
                    x340Var3.i0(-537256264);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-537256263);
                    acq0.e(i, 0, x340Var, anm1.N("album_row_artist_download_badge", nim0Var));
                    x340Var3.r(false);
                }
                uwo1.e(if3Var.b, anm1.N("album_row_artist_subtitle", nim0Var), cbx.d(x340Var).j, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1720);
                x340Var3.r(true);
                return rih1Var;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = if3Var.a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, anm1.N("album_row_artist_title", nim0Var), cbx.d(b0kVar2).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1720);
                return rih1Var;
        }
    }
}
