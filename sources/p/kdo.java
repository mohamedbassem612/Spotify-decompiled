package p;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kdo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdo(Bitmap bitmap, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = bitmap;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Bitmap bitmap = this.b;
        switch (b) {
            case 0:
                return new kdo(bitmap, lnmVar, (byte) 0);
            default:
                return new kdo(bitmap, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Bitmap bitmap = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                tfp0 tfp0Var = new tfp0(bitmap);
                tfp0Var.a = (short) 10000;
                return tfp0Var.a();
            default:
                hm5.M(obj);
                bitmap.getClass();
                smr0 smr0VarA = new tfp0(bitmap).a();
                List listI0 = f46.i0(new rmr0[]{smr0VarA.b(grd1.e), smr0VarA.b(grd1.d), smr0VarA.b(grd1.f), smr0VarA.b(grd1.h), smr0VarA.b(grd1.g), smr0VarA.b(grd1.i)});
                ArrayList<rmr0> arrayList = (ArrayList) listI0;
                int iR = -16777216;
                if (!arrayList.isEmpty()) {
                    Iterator it = listI0.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i += ((rmr0) it.next()).e;
                    }
                    float f = i;
                    if (f < 1.0f) {
                        f = 1.0f;
                    }
                    float[] fArr = new float[3];
                    rmr0 rmr0Var = null;
                    float f2 = Float.NEGATIVE_INFINITY;
                    for (rmr0 rmr0Var2 : arrayList) {
                        Color.colorToHSV(rmr0Var2.d, fArr);
                        float f3 = fArr[2];
                        if (f3 >= 0.2f) {
                            float f4 = fArr[1];
                            if (f4 >= 0.1f) {
                                float f5 = rmr0Var2.e / f;
                                float f6 = fArr[0];
                                float f7 = ((f4 * f3) + f5) - ((30.0f > f6 || f6 > 80.0f) ? 0.0f : 1.0f);
                                if (f7 > f2) {
                                    rmr0Var = rmr0Var2;
                                    f2 = f7;
                                }
                            }
                        }
                    }
                    iR = loo1.r(rmr0Var != null ? rmr0Var.d : -16777216);
                }
                return new Integer(iR);
        }
    }
}
