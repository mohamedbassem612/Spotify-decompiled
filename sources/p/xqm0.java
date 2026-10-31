package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xqm0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqm0(uqm0 uqm0Var, byte b) {
        super(3);
        this.a = b;
        this.b = uqm0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uqm0 uqm0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = uqm0Var.b;
                List list = uqm0Var.d;
                String strF = f4i1.f(str, " • ", cwl1.U(2131820773, list.size(), new Object[]{Integer.valueOf(list.size())}, b0kVar));
                uwr uwrVar = cbx.a;
                uwo1.e(strF, (qim0) null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1778);
                break;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(uqm0Var.c);
                bnx bnxVar = bnx.c;
                nux nuxVar = new nux(bnxVar, bnxVar);
                as80 as80Var = mif1.P0;
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(b0kVar2).f;
                cua cuaVar2 = cbx.b(b0kVar2).f;
                eso1.e(uri, isl.a, (qim0) null, (p3v) null, new zvx(), ecxVarA, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar2, 1073744944, 0, 3460);
                break;
            default:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = uqm0Var.a;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar3).g, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, b0kVar3, 0, 0, 1778);
                break;
        }
        return rih1Var;
    }
}
