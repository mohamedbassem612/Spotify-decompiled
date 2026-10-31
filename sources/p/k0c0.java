package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k0c0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0c0(Uri uri, byte b) {
        super(3);
        this.a = b;
        this.b = uri;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                eso1.e(this.b, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, (b0k) obj2, 48, 0, 4092);
                break;
            case 1:
                ((Number) obj3).intValue();
                eso1.e(this.b, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, (b0k) obj2, 48, 0, 4092);
                break;
            case 2:
                ((Number) obj3).intValue();
                eso1.e(this.b, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, (b0k) obj2, 48, 0, 4092);
                break;
            case 3:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                if (this.b == null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(30224879);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(29903657);
                    as80 as80Var = mif1.P0;
                    cbx.a.getClass();
                    ecx ecxVarA = uwr.a();
                    fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, x340Var3, ltx.d, 30);
                    eso1.e(this.b, isl.a, (qim0) null, (p3v) null, (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var3, 1073741872, 0, 3484);
                    x340Var3.r(false);
                }
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cbx.a.getClass();
                ecx ecxVar = (ecx) uwr.i.getValue();
                cvx cvxVar = cbx.b(b0kVar).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                akx akxVar = akx.c;
                nux nuxVar = new nux(akxVar, akxVar);
                eso1.e(this.b, isl.a, qim0VarB, new p3v(200.0f), (zvx) null, ecxVar, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073744944, 0, 3536);
                break;
        }
        return rih1Var;
    }
}
