package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lu6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b9e b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu6(b9e b9eVar, long j, byte b) {
        super(3);
        this.a = b;
        this.b = b9eVar;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b9e b9eVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                hux huxVar = b9eVar.c;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                w0h1.a(huxVar, isl.a, u291.r(nim0.a, 16.0f), this.c, 0L, false, b0kVar, 56, 48);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = b9eVar.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str, null, cbx.d(b0kVar2).g, this.c, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
                break;
        }
        return rih1Var;
    }
}
