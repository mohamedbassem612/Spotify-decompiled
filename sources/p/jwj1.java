package p;

import android.content.Context;
import android.view.View;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jwj1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lwj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jwj1(lwj1 lwj1Var, byte b) {
        super(2);
        this.a = b;
        this.b = lwj1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        String string;
        int i2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lwj1 lwj1Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                zvj1 zvj1Var = (zvj1) obj;
                bwj1 bwj1Var = (bwj1) obj2;
                Context context = lwj1Var.c;
                if (zvj1Var instanceof wvj1) {
                    int iOrdinal = bwj1Var.ordinal();
                    if (iOrdinal == 0) {
                        i2 = 2131954786;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        i2 = 2131954782;
                    }
                    string = context.getString(i2);
                    lwj1Var.e.o(new er91((fs91) null, string, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    lwj1Var.d.c();
                    return rih1Var;
                }
                if (zvj1Var instanceof yvj1) {
                    String lowerCase = context.getString(((yvj1) zvj1Var).a.a).toLowerCase(Locale.ROOT);
                    int iOrdinal2 = bwj1Var.ordinal();
                    if (iOrdinal2 == 0) {
                        i = 2131954788;
                    } else if (iOrdinal2 == 1) {
                        i = 2131954784;
                    } else {
                        eg.o();
                    }
                    string = context.getString(i, lowerCase);
                    lwj1Var.e.o(new er91((fs91) null, string, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    lwj1Var.d.c();
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                byte b3 = 0;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yup0 yup0Var = lwj1Var.b;
                    boolean zI = x340Var2.i(lwj1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new dch1(lwj1Var, (byte) 25);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zI2 = x340Var2.i(lwj1Var);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new jwj1(lwj1Var, b3);
                        x340Var2.s0(objT2);
                    }
                    u4p1.L(yup0Var, function0, (vu30) objT2, (qim0) null, x340Var2, 8);
                    boolean zI3 = x340Var2.i(lwj1Var);
                    Object objT3 = x340Var2.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new kwj1(lwj1Var, b2);
                        x340Var2.s0(objT3);
                    }
                    qxd0.i(lwj1Var, (iu30) objT3, x340Var2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }
}
