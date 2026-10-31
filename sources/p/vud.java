package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vud extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vud(float f, long j, boolean z, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.b = f;
        this.c = j;
        this.d = z;
        this.f = function0;
        this.g = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                float f = this.b;
                r4o1.B(f, (zud) obj4, (zud) obj3, this.c, nim0.a, this.d, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                float f2 = this.b;
                long j = this.c;
                boolean z = this.d;
                rck.g(f2, j, z, (Function0) obj4, (qim0) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vud(float f, zud zudVar, zud zudVar2, long j, boolean z, int i) {
        super(2);
        this.b = f;
        this.f = zudVar;
        this.g = zudVar2;
        this.c = j;
        this.d = z;
        this.e = i;
    }
}
