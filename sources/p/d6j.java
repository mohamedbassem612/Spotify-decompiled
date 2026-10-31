package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d6j extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6j(kxr0 kxr0Var, byte b) {
        super(3);
        this.a = b;
        this.b = kxr0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kxr0 kxr0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    String str = kxr0Var.c;
                    Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                    uri.getClass();
                    nkx nkxVar = nkx.c;
                    nux nuxVar = new nux(nkxVar, nkxVar);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    eso1.e(uri, isl.a, i541.D(i1p1.q(u291.r(nim0.a, 48.0f), er31.a), 0.0f, 0.0f, kxr0Var.d ? 0.7f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var2, 1073741872, 0, 3576);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String strO0 = cwl1.o0(x340Var4, 2131959636);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO0, i541.D(nim0.a, 0.0f, 0.0f, kxr0Var.d ? 0.7f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571), cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 1572864, 0, 1712);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    String str2 = kxr0Var.b;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str2, i541.D(nim0.a, 0.0f, 0.0f, kxr0Var.d ? 0.7f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571), cbx.d(x340Var6).g, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var6, 1572864, 0, 1712);
                }
                break;
        }
        return rih1Var;
    }
}
