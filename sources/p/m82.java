package p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m82 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m82(oih oihVar, fih fihVar, iu30 iu30Var, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = (byte) 1;
        this.e = oihVar;
        this.f = fihVar;
        this.g = iu30Var;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ebp1.a((Uri) obj6, (qim0) obj5, (zvx) obj4, (p3v) obj3, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 1:
                ((Number) obj2).intValue();
                ((oih) obj6).d((fih) obj4, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 2:
                ((Number) obj2).intValue();
                ggo1.j((eeo0) obj6, (String) obj5, (List) obj4, (xu30) obj3, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 3:
                ((Number) obj2).intValue();
                fdg1.k((mwq0) obj6, (j2i) obj4, (qim0) obj5, (j2i) obj3, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 4:
                ((Number) obj2).intValue();
                jzn1.j((s9y0) obj6, (qim0) obj5, (xu30) obj4, (xu30) obj3, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            default:
                ((Number) obj2).intValue();
                d7e.k((s1f1) obj6, (vu30) obj5, (vu30) obj4, (j2i) obj3, (b0k) obj, czo1.p(s | 1), this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m82(int i, Object obj, Object obj2, Object obj3, Object obj4, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m82(mwq0 mwq0Var, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, int i, int i2) {
        super(2);
        this.a = (byte) 3;
        this.e = mwq0Var;
        this.f = j2iVar;
        this.b = qim0Var;
        this.g = j2iVar2;
        this.c = i;
        this.d = i2;
    }
}
