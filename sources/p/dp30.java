package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dp30 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp30(String str, String str2, Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Function0 function0 = this.d;
        nim0 nim0Var = nim0.a;
        String str = this.c;
        String str2 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2c i2cVar = (i2c) obj;
                ((Number) obj3).intValue();
                long j = i2cVar.b;
                float fI = hjl.i(j);
                float fH = hjl.h(j);
                long jFloatToRawIntBits = Float.floatToRawIntBits(fI);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fH);
                x340 x340Var = (b0k) obj2;
                float fMin = Math.min(2.0f, 4096.0f / Math.max(hjl.i(j), hjl.h(j)));
                wm5.k(this.b, this.c, this.d, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), jhc1.c(i2cVar.d() * fMin, i2cVar.c() * fMin), x340Var, 0);
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                tro1.e(0L, d7j.b, b0kVar, 48, 1);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                op71.g(b0kVar, u291.v(nim0Var, 6.0f));
                qim0 qim0VarA = ((nw31) obj).a(1.0f, nim0Var, true);
                cvx cvxVar2 = cbx.b(b0kVar).b;
                uwo1.e(cwl1.n0(2131959717, new Object[]{str2}, b0kVar), uyn1.z(0.0f, 8.0f, 1, qim0VarA), cbx.d(b0kVar).j, cbx.a(b0kVar).b.a, null, null, 0, false, null, 0, null, b0kVar, 0, 0, 2032);
                cvx cvxVar3 = cbx.b(b0kVar).b;
                op71.g(b0kVar, u291.v(nim0Var, 6.0f));
                ldx ldxVar = ldx.c;
                gdx gdxVarA = yla.s(b0kVar).a();
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(str), function0), ldxVar, null, null, gdxVarA, null, null, null, null, null, apo.r(862175659, new psr0(str, (byte) 8), b0kVar), b0kVar, 0, 48, 2012);
                return rih1Var;
            default:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                jsl jslVar = new jsl(cwl1.n0(2131952457, new Object[]{str2}, x340Var2));
                Uri uri = Uri.parse(str);
                qim0 qim0VarN = anm1.N("artistImage", nim0Var);
                x340 x340Var3 = x340Var2;
                boolean zG = x340Var3.g(function0);
                Object objT = x340Var3.T();
                if (zG || objT == fkj0.X) {
                    objT = new uuc1(function0, (byte) 21);
                    x340Var3.s0(objT);
                }
                eso1.e(uri, jslVar, bin.x(qim0VarN, false, null, null, null, (Function0) objT, 15), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var3, 0, 0, 4088);
                return rih1Var;
        }
    }
}
