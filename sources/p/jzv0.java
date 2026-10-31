package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jzv0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gzv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzv0(gzv0 gzv0Var, byte b) {
        super(3);
        this.a = b;
        this.b = gzv0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        gzv0 gzv0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(uyn1.w(anm1.N("album-art-view", nim0Var), sok.y(b0kVar)), 1.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                qim0 qim0VarK = xcg1.k(cbx.a, i1p1.q(qim0VarF, er31.b(8.0f)));
                Uri uri = Uri.parse(gzv0Var.b);
                jsl jslVar = new jsl(cwl1.o0(b0kVar, 2131960383));
                as80 as80Var = mif1.P0;
                akx akxVar = akx.c;
                eso1.e(uri, jslVar, qim0VarK, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new nux(akxVar, akxVar), false, false, b0kVar, 1073741824, 0, 3512);
                break;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarW = uyn1.w(anm1.N("release-date-view", nim0Var), sok.y(x340Var));
                x340 x340Var2 = x340Var;
                uwo1.e(a4p1.j(gzv0Var.f, gzv0Var.e, (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b), gzv0Var.g), qim0VarW, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1724);
                break;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(gzv0Var.d, uyn1.w(anm1.N("prerelease-artist-name-view", nim0Var), sok.y(b0kVar2)), (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1724);
                break;
            default:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(gzv0Var.a, uyn1.w(anm1.N("prerelease-title-view", nim0Var), sok.y(b0kVar3)), (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1724);
                break;
        }
        return rih1Var;
    }
}
