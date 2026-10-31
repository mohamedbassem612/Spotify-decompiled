package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class is9 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is9(String str, iu30 iu30Var, dr41 dr41Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, cg0 cg0Var, yt91 yt91Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 8;
        this.f = str;
        this.Y = iu30Var;
        this.g = dr41Var;
        this.b = function0;
        this.c = function1;
        this.h = function2;
        this.i = function3;
        this.t = cg0Var;
        this.X = yt91Var;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.c;
        Object obj9 = this.b;
        Object obj10 = this.g;
        Object obj11 = this.Y;
        Object obj12 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                l3p1.j((Function0) obj9, (Function0) obj8, (j2i) obj12, (j2i) obj10, (j2i) obj7, (j2i) obj6, (j2i) obj5, (j2i) obj4, (iu30) obj11, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                r6p1.e((mhh) obj12, (Function0) obj9, (Function0) obj8, (Function0) obj10, (Function0) obj7, (Function0) obj6, (qim0) obj3, (Function0) obj5, (List) obj4, (vu30) obj11, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                hso1.k((c380) obj9, (String) obj8, (String) obj12, (c3o) obj10, (iu30) obj11, (iu30) obj7, (iu30) obj6, (ezc) obj5, (qim0) obj3, (a3o) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                j1p1.e((String) obj9, (String) obj8, (String) obj12, (String) obj10, (String) obj7, (String) obj6, (String) obj5, (String) obj4, (String) obj11, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                k4p1.e((zzz0) obj9, (lik1) obj8, (c380) obj12, (iu30) obj11, (z201) obj10, (oa0) obj7, (c101) obj6, (u201) obj5, (idm) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                crm0.e((xkf0) obj8, (lq41) obj10, (r9u0) obj7, (xym) obj6, (iu30) obj11, (Function0) obj9, (j2i) obj12, (iu30) obj5, (qim0) obj3, (vu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                int i2 = this.e;
                tto1.e((String) obj12, (String) obj10, (String) obj7, (String) obj6, i2, (Function0) obj9, (Function0) obj8, (r281) obj5, (Function0) obj4, (Function0) obj11, (Function0) obj3, (b0k) obj, iP);
                break;
            case 7:
                ((Number) obj2).intValue();
                u2p1.d((dp71) obj9, (iu30) obj11, (jwf0) obj8, (mxf0) obj12, (q251) obj10, (yp71) obj7, (tln) obj6, (d6o0) obj5, (cb0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                vvm1.b((String) obj12, (iu30) obj11, (dr41) obj10, (Function0) obj9, (Function0) obj8, (Function0) obj7, (Function0) obj6, (cg0) obj5, (yt91) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is9(String str, String str2, String str3, String str4, int i, Function0 function0, Function0 function1, r281 r281Var, Function0 function2, Function0 function3, Function0 function4, int i2) {
        super(2);
        this.a = (byte) 6;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.e = i;
        this.b = function0;
        this.c = function1;
        this.t = r281Var;
        this.X = function2;
        this.Y = function3;
        this.d = function4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.t = obj7;
        this.X = obj8;
        this.Y = obj9;
        this.d = qim0Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is9(mhh mhhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, qim0 qim0Var, Function0 function5, List list, vu30 vu30Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.f = mhhVar;
        this.b = function0;
        this.c = function1;
        this.g = function2;
        this.h = function3;
        this.i = function4;
        this.d = qim0Var;
        this.t = function5;
        this.X = list;
        this.Y = vu30Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is9(c380 c380Var, String str, String str2, c3o c3oVar, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, ezc ezcVar, qim0 qim0Var, a3o a3oVar, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = c380Var;
        this.c = str;
        this.f = str2;
        this.g = c3oVar;
        this.Y = iu30Var;
        this.h = iu30Var2;
        this.i = iu30Var3;
        this.t = ezcVar;
        this.d = qim0Var;
        this.X = a3oVar;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is9(xkf0 xkf0Var, lq41 lq41Var, r9u0 r9u0Var, xym xymVar, iu30 iu30Var, Function0 function0, j2i j2iVar, iu30 iu30Var2, qim0 qim0Var, vu30 vu30Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.c = xkf0Var;
        this.g = lq41Var;
        this.h = r9u0Var;
        this.i = xymVar;
        this.Y = iu30Var;
        this.b = function0;
        this.f = j2iVar;
        this.t = iu30Var2;
        this.d = qim0Var;
        this.X = vu30Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is9(zzz0 zzz0Var, lik1 lik1Var, c380 c380Var, iu30 iu30Var, z201 z201Var, oa0 oa0Var, c101 c101Var, u201 u201Var, idm idmVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 4;
        this.b = zzz0Var;
        this.c = lik1Var;
        this.f = c380Var;
        this.Y = iu30Var;
        this.g = z201Var;
        this.h = oa0Var;
        this.i = c101Var;
        this.t = u201Var;
        this.X = idmVar;
        this.d = qim0Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is9(dp71 dp71Var, iu30 iu30Var, jwf0 jwf0Var, mxf0 mxf0Var, q251 q251Var, yp71 yp71Var, tln tlnVar, d6o0 d6o0Var, cb0 cb0Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 7;
        this.b = dp71Var;
        this.Y = iu30Var;
        this.c = jwf0Var;
        this.f = mxf0Var;
        this.g = q251Var;
        this.h = yp71Var;
        this.i = tlnVar;
        this.t = d6o0Var;
        this.X = cb0Var;
        this.d = qim0Var;
        this.e = i;
    }
}
