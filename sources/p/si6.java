package p;

import android.graphics.Bitmap;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class si6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 5;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si6(Bitmap bitmap, qim0 qim0Var, long j, String str, jzy0 jzy0Var, int i) {
        super(2);
        this.c = bitmap;
        this.d = qim0Var;
        this.b = j;
        this.f = str;
        this.g = jzy0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.g;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                long j = this.b;
                vi6.a((String) obj6, j, (yux) obj5, (z3g1) obj3, (qim0) obj4, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                long j2 = this.b;
                sio1.f((dj6) obj6, (dj6) obj3, j2, (yux) obj5, (qim0) obj4, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                g9p1.a((j2i) obj6, (qim0) obj4, (qim0) obj5, (vu30) obj3, this.b, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                long j3 = this.b;
                guo1.o((String) obj6, j3, (String) obj5, (String) obj3, (Function0) obj4, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                long j4 = this.b;
                irn1.D((String) obj6, (qim0) obj4, (lee1) obj5, j4, (iu30) obj3, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                long j5 = this.b;
                zgo1.j((Bitmap) obj5, (qim0) obj4, j5, (String) obj6, (jzy0) obj3, (b0k) obj, iP6);
                break;
            default:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                long j6 = this.b;
                g9p1.n((List) obj6, (hw61) obj5, (qim0) obj4, j6, (j2i) obj3, (b0k) obj, iP7);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si6(String str, long j, String str2, String str3, Function0 function0, int i) {
        super(2);
        this.f = str;
        this.b = j;
        this.c = str2;
        this.g = str3;
        this.d = function0;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si6(String str, long j, yux yuxVar, z3g1 z3g1Var, qim0 qim0Var, int i) {
        super(2);
        this.f = str;
        this.b = j;
        this.c = yuxVar;
        this.g = z3g1Var;
        this.d = qim0Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si6(String str, qim0 qim0Var, lee1 lee1Var, long j, iu30 iu30Var, int i) {
        super(2);
        this.f = str;
        this.d = qim0Var;
        this.c = lee1Var;
        this.b = j;
        this.g = iu30Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si6(List list, hw61 hw61Var, qim0 qim0Var, long j, j2i j2iVar, int i) {
        super(2);
        this.f = list;
        this.c = hw61Var;
        this.d = qim0Var;
        this.b = j;
        this.g = j2iVar;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si6(dj6 dj6Var, dj6 dj6Var2, long j, yux yuxVar, qim0 qim0Var, int i) {
        super(2);
        this.f = dj6Var;
        this.g = dj6Var2;
        this.b = j;
        this.c = yuxVar;
        this.d = qim0Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si6(j2i j2iVar, qim0 qim0Var, qim0 qim0Var2, vu30 vu30Var, long j, int i) {
        super(2);
        this.f = j2iVar;
        this.d = qim0Var;
        this.c = qim0Var2;
        this.g = vu30Var;
        this.b = j;
        this.e = i;
    }
}
