package p;

import android.os.Parcelable;
import java.io.File;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l3a extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3a(float f, Float f2, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.c = f;
        this.d = f2;
        this.b = z;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        qim0 qim0VarA;
        Object obj4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                t5p1.b((qim0) obj6, (p3v) obj5, this.c, this.b, (b0k) obj, czo1.p(24583));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    c380 c380VarA = mqo1.A(Collections.singletonList((w4i1) obj6));
                    boolean z = this.b;
                    nim0 nim0Var = nim0.a;
                    if (z) {
                        x340Var2.i0(477202261);
                        qim0 qim0VarD = i541.D(nim0Var, 0.0f, 0.0f, this.c, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571);
                        Object objT = x340Var2.T();
                        if (objT == m4cVar) {
                            obj4 = objT;
                            rmf rmfVar = rmf.N0;
                            x340Var2.s0(rmfVar);
                            obj4 = rmfVar;
                        }
                        obj4 = objT;
                        qim0VarA = s161.a(qim0VarD, (iu30) obj4);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(477314295);
                        Object objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            obj3 = objT2;
                            rmf rmfVar2 = rmf.O0;
                            x340Var2.s0(rmfVar2);
                            obj3 = rmfVar2;
                        }
                        obj3 = objT2;
                        qim0VarA = s161.a(nim0Var, (iu30) obj3);
                        x340Var2.r(false);
                    }
                    qim0 qim0Var = qim0VarA;
                    Parcelable.Creator creator = w4i1.CREATOR;
                    aqo1.f(0, 0, x340Var2, (hcx) obj5, c380VarA, qim0Var);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = (qim0) obj6;
                int iP = czo1.p(433);
                boolean z2 = this.b;
                iro1.b((z2o) obj5, z2 ? 1 : 0, this.c, qim0Var2, (b0k) obj, iP);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                d7e.b((File) obj6, this.c, this.b, (iu30) obj5, (b0k) obj, iP2);
                break;
            case 4:
                ((Number) obj2).intValue();
                ((zyo0) obj6).e((vyo0) obj5, this.c, this.b, (b0k) obj, czo1.p(9));
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                gwa1.c(this.c, (Float) obj6, this.b, (iu30) obj5, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(1);
                i2p1.c((chf0) obj6, this.b, this.c, (Function0) obj5, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3a(File file, float f, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.d = file;
        this.c = f;
        this.b = z;
        this.e = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3a(Object obj, Object obj2, float f, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = f;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l3a(z2o z2oVar, int i, float f, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.e = z2oVar;
        this.b = i;
        this.c = f;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3a(chf0 chf0Var, boolean z, float f, Function0 function0, int i) {
        super(2);
        this.a = (byte) 6;
        this.d = chf0Var;
        this.b = z;
        this.c = f;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3a(w4i1 w4i1Var, boolean z, float f, hcx hcxVar) {
        super(2);
        this.a = (byte) 1;
        this.d = w4i1Var;
        this.b = z;
        this.c = f;
        this.e = hcxVar;
    }
}
