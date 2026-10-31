package p;

import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k881 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m881 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k881(m881 m881Var, byte b) {
        super(3);
        this.a = b;
        this.b = m881Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m881 m881Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ilx ilxVar = ilx.c;
                jsl jslVar = new jsl(cwl1.n0(2131952943, new Object[]{m881Var.b}, b0kVar));
                uwr uwrVar = cbx.a;
                w0h1.a(ilxVar, jslVar, (qim0) null, cbx.a(b0kVar).b.f, 0L, false, b0kVar, ilx.d, 52);
                break;
            case 1:
                ((Number) obj3).intValue();
                eso1.e(m881Var.c, new jsl(m881Var.b), (qim0) null, new p3v(56.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, (b0k) obj2, 0, 0, 4084);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = m881Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str, null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
                break;
        }
        return rih1Var;
    }
}
