package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ilf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ilf(Function0 function0, qim0 qim0Var, boolean z, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = (byte) 8;
        this.g = function0;
        this.e = qim0Var;
        this.b = z;
        this.f = j2iVar;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.d;
                buo1.e((String) obj4, (hux) obj3, (Function0) obj5, this.b, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.d;
                bth.c((qim0) obj4, (vu30) obj3, (vu30) obj5, this.b, (b0k) obj, iP2, b3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.d;
                rrn1.l((Function0) obj5, (nwo) obj4, (qim0) obj3, this.b, (b0k) obj, iP3, b4);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                byte b5 = this.d;
                boolean z = this.b;
                tm80.c((String) obj4, z, (qim0) obj3, (xb10) obj5, (b0k) obj, iP4, b5);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                byte b6 = this.d;
                boolean z2 = this.b;
                mue1.j((c380) obj4, (qim0) obj3, z2, (Function0) obj5, (b0k) obj, iP5, b6);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                byte b7 = this.d;
                ((xjj0) obj5).f((hux) obj3, (String) obj4, this.b, (b0k) obj, iP6, b7);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                byte b8 = this.d;
                ((sdv0) obj5).e((hux) obj3, (String) obj4, this.b, (b0k) obj, iP7, b8);
                break;
            case 7:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(i | 1);
                byte b9 = this.d;
                rje1.l((uue1) obj4, (Function0) obj5, (yqg) obj3, this.b, (b0k) obj, iP8, b9);
                break;
            default:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(i | 1);
                byte b10 = this.d;
                boolean z3 = this.b;
                qpn1.e((Function0) obj5, (qim0) obj4, z3, (j2i) obj3, (b0k) obj, iP9, b10);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ilf(String str, boolean z, qim0 qim0Var, xb10 xb10Var, int i, int i2) {
        super(2);
        this.a = (byte) 3;
        this.e = str;
        this.b = z;
        this.f = qim0Var;
        this.g = xb10Var;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ilf(Function0 function0, nwo nwoVar, qim0 qim0Var, boolean z, int i, int i2) {
        super(2);
        this.a = (byte) 2;
        this.g = function0;
        this.e = nwoVar;
        this.f = qim0Var;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ilf(byte b, int i, int i2, Object obj, Object obj2, cv30 cv30Var, boolean z) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = cv30Var;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ilf(maa maaVar, hux huxVar, String str, boolean z, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.g = maaVar;
        this.f = huxVar;
        this.e = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ilf(c380 c380Var, qim0 qim0Var, boolean z, Function0 function0, int i, int i2) {
        super(2);
        this.a = (byte) 4;
        this.e = c380Var;
        this.f = qim0Var;
        this.b = z;
        this.g = function0;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ilf(uue1 uue1Var, Function0 function0, yqg yqgVar, boolean z, int i, int i2) {
        super(2);
        this.a = (byte) 7;
        this.e = uue1Var;
        this.g = function0;
        this.f = yqgVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }
}
