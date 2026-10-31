package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o08 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o08(String str, String str2, float f, boolean z, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 3;
        j2i j2iVar = dtj.a;
        this.f = str;
        this.e = str2;
        this.c = f;
        this.b = z;
        this.g = function0;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                boolean z = this.b;
                float f = this.c;
                ((y08) obj5).f((String) obj6, z, (x4p1) obj4, f, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                boolean z2 = this.b;
                float f2 = this.c;
                tm80.f((List) obj5, (List) obj6, z2, (ArrayList) obj4, f2, (qim0) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                boolean z3 = this.b;
                int iP3 = czo1.p(1);
                float f3 = this.c;
                ryo1.j((u011) obj5, f3, (q10) obj6, (syo1) obj4, (gt40) obj3, z3, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                j2i j2iVar = dtj.a;
                int iP4 = czo1.p(24577);
                float f4 = this.c;
                boolean z4 = this.b;
                i1p1.m((String) obj6, (String) obj5, f4, z4, (Function0) obj4, (qim0) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o08(Object obj, Object obj2, boolean z, Object obj3, float f, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.g = obj3;
        this.c = f;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o08(u011 u011Var, float f, q10 q10Var, syo1 syo1Var, gt40 gt40Var, boolean z, int i) {
        super(2);
        this.a = (byte) 2;
        this.e = u011Var;
        this.c = f;
        this.f = q10Var;
        this.g = syo1Var;
        this.d = gt40Var;
        this.b = z;
    }
}
