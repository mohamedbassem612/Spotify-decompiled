package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ik2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ cv30 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ik2(String str, String str2, Function0 function0, qim0 qim0Var, max maxVar, int i, int i2) {
        super(2);
        this.a = (byte) 2;
        this.b = str;
        this.f = str2;
        this.c = function0;
        this.g = qim0Var;
        this.e = maxVar;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.g;
        Function0 function0 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                hux huxVar = (hux) obj4;
                int iP = czo1.p(b2 | 1);
                aq8.r(iP, (String) obj6, (String) obj3, function0, (b0k) obj, huxVar, (qim0) obj5);
                break;
            case 1:
                ((Number) obj2).intValue();
                acq0.a((p791) obj4, (String) obj6, (a2r0) obj3, function0, (Function0) obj5, (b0k) obj, czo1.p(b2 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                myo1.d((String) obj6, (String) obj3, function0, (qim0) obj5, (max) obj4, (b0k) obj, czo1.p(1), this.d);
                break;
            case 3:
                ((Number) obj2).intValue();
                ywo1.b((String) obj6, (ryx) obj4, (qim0) obj5, (mfv0) obj3, (j2i) function0, (b0k) obj, czo1.p(24577), this.d);
                break;
            case 4:
                ((Number) obj2).intValue();
                sbl.n((String) obj6, (Uri) obj4, (qim0) obj5, (qim0) obj3, function0, (b0k) obj, czo1.p(1), this.d);
                break;
            case 5:
                ((Number) obj2).intValue();
                o4o1.b((hux) obj4, (jsl) obj6, (y50) obj3, (qim0) obj5, function0, (b0k) obj, czo1.p(b2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                r1p1.b((String) obj6, function0, (qim0) obj5, (Function0) obj4, (j2i) obj3, (b0k) obj, czo1.p(24577), this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ik2(String str, Object obj, qim0 qim0Var, Object obj2, cv30 cv30Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.e = obj;
        this.g = qim0Var;
        this.f = obj2;
        this.c = cv30Var;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ik2(Object obj, String str, Object obj2, Function0 function0, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = str;
        this.f = obj2;
        this.c = function0;
        this.g = obj3;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ik2(String str, Function0 function0, qim0 qim0Var, Function0 function1, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = (byte) 6;
        this.b = str;
        this.c = function0;
        this.g = qim0Var;
        this.e = function1;
        this.f = j2iVar;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ik2(hux huxVar, jsl jslVar, y50 y50Var, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 5;
        this.e = huxVar;
        this.b = jslVar;
        this.f = y50Var;
        this.g = qim0Var;
        this.c = function0;
        this.d = i;
    }
}
