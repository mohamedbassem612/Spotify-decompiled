package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xhs0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dis0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xhs0(dis0 dis0Var, byte b) {
        super(3);
        this.a = b;
        this.b = dis0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dis0 dis0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(((ais0) dis0Var).b);
                qim0 qim0VarQ = i1p1.q(nim0.a, er31.a);
                nkx nkxVar = nkx.c;
                nux nuxVar = new nux(nkxVar, nkxVar);
                p3v p3vVar = new p3v(48.0f);
                eso1.e(uri, isl.a, qim0VarQ, p3vVar, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, (b0k) obj2, 1073766448, 0, 3552);
                break;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = ((ais0) dis0Var).a;
                uwr uwrVar = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2042);
                break;
            case 2:
                ((Number) obj3).intValue();
                Uri uri2 = Uri.parse(((cis0) dis0Var).c);
                p3v p3vVar2 = new p3v(48.0f);
                ltx ltxVar = ltx.c;
                nux nuxVar2 = new nux(ltxVar, ltxVar);
                eso1.e(uri2, isl.a, (qim0) null, p3vVar2, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar2, false, false, (b0k) obj2, 1073741872, 0, 3572);
                break;
            case 3:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = ((cis0) dis0Var).b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                break;
            default:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = ((cis0) dis0Var).a;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str3, (qim0) null, cbx.d(b0kVar3).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2042);
                break;
        }
        return rih1Var;
    }
}
