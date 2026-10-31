package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l8a {
    public final kly0 a;
    public final kly0 b;

    public /* synthetic */ l8a(kly0 kly0Var, kly0 kly0Var2) {
        this.a = kly0Var;
        this.b = kly0Var2;
    }

    public static String c(Integer num, String str, b0k b0kVar) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        if (str != null) {
            x340Var.i0(-2103703316);
            x340Var.r(false);
            return str;
        }
        x340Var.i0(-790273173);
        if (num == null) {
            x340Var.i0(-790273174);
            x340Var.r(false);
            strK = null;
        } else {
            strK = kk0.k(x340Var, -790273173, num, x340Var, false);
        }
        x340Var.r(false);
        return strK;
    }

    public void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1713561978);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            WeakHashMap weakHashMap = b8k1.a;
            hsl1 hsl1VarA = s7k1.a(view);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.t(oqn1.n(0, 0));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = ((i2 & 14) == 4) | x340Var.i(hsl1VarA) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new oo6(function0, hsl1VarA, ven0Var, (byte) 11);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI2 = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new cy7(ven0Var, (byte) 7);
                x340Var.s0(objT3);
            }
            dm5.a(iu30Var, qim0Var, (iu30) objT3, x340Var, i2 & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(this, function0, qim0Var, i, (byte) 19);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void b(z7a z7aVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2 = qim0Var;
        m4c m4cVar = fkj0.X;
        n5a n5aVar = z7aVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1429622491);
        int i2 = i | (x340Var.i(z7aVar) ? 4 : 2) | (x340Var.i(qim0Var2) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            h8a h8aVar = new h8a(z7aVar, this.a, this.b);
            if (n5aVar instanceof n5a) {
                x340Var.i0(-987642561);
                n5a n5aVar2 = n5aVar;
                m5a m5aVarF = n5aVar2.f();
                Integer numB = n5aVar2.b();
                String strC = c(n5aVar2.h(), null, x340Var);
                h5a h5aVarG = n5aVar2.g();
                k8a k8aVar = h5aVarG != null ? new k8a(h5aVarG, (byte) 0) : null;
                String strC2 = c(n5aVar2.e(), n5aVar2.c(), x340Var);
                h5a h5aVarD = n5aVar2.d();
                k8a k8aVar2 = h5aVarD != null ? new k8a(h5aVarD, (byte) 1) : null;
                x340Var.i0(522342363);
                List listA = n5aVar2.a();
                ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
                for (Iterator it = listA.iterator(); it.hasNext(); it = it) {
                    i5a i5aVar = (i5a) it.next();
                    m5a m5aVar = m5aVarF;
                    Integer num = numB;
                    String strC3 = c(i5aVar.b(), i5aVar.a(), x340Var);
                    if (strC3 == null) {
                        strC3 = "";
                    }
                    boolean zI = x340Var.i(i5aVar) | x340Var.i(h8aVar);
                    Object objT = x340Var.T();
                    if (zI || objT == m4cVar) {
                        objT = new z77(i5aVar, h8aVar, (byte) 23);
                        x340Var.s0(objT);
                    }
                    arrayList.add(new txd1(strC3, (Function0) objT));
                    m5aVarF = m5aVar;
                    numB = num;
                }
                m5a m5aVar2 = m5aVarF;
                Integer num2 = numB;
                x340Var.r(false);
                c9 c9VarF = mqo1.F(arrayList);
                x340Var.i0(-224374650);
                boolean zI2 = x340Var.i(n5aVar2) | x340Var.i(h8aVar);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new z77(n5aVar2, h8aVar, (byte) 24);
                    x340Var.s0(objT2);
                }
                x340Var.r(false);
                u1p1.o(m5aVar2, qim0Var, num2, strC, k8aVar, strC2, k8aVar2, c9VarF, (Function0) objT2, x340Var, i2 & 112, 0);
                qim0Var2 = qim0Var;
                x340Var.r(false);
            } else if (n5aVar instanceof f5a) {
                x340Var.i0(522361112);
                ((f5a) n5aVar).a().a(h8aVar, qim0Var2, x340Var, 8 | (i2 & 112));
                x340Var.r(false);
            } else {
                if (!(n5aVar instanceof g5a)) {
                    throw p3d1.k(x340Var, 522328612, false);
                }
                x340Var.i0(-986543611);
                Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                boolean zI3 = x340Var.i(z7aVar) | x340Var.i(context) | x340Var.i(h8aVar);
                Object objT3 = x340Var.T();
                if (zI3 || objT3 == m4cVar) {
                    objT3 = new ft0(z7aVar, context, h8aVar);
                    x340Var.s0(objT3);
                }
                a(i2 & CollectionItemdata$ItemData.HIDDEN_FROM_HOME_ITEM_DATA_FIELD_NUMBER, (Function0) objT3, x340Var, qim0Var2);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y46(this, z7aVar, qim0Var2, i, (byte) 1);
        }
    }
}
