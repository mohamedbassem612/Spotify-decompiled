package p;

import android.R;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qnb0 {
    public static final Map a = sqg0.J(new mmr0[]{new mmr0(vnb0.d, 2131624932), new mmr0(vnb0.e, 2131624867), new mmr0(vnb0.f, 2131624728), new mmr0(vnb0.g, 2131624729), new mmr0(vnb0.h, 2131624716), new mmr0(vnb0.R0, 2131624908), new mmr0(vnb0.S0, 2131624909), new mmr0(vnb0.i, 2131624770), new mmr0(vnb0.T0, 2131624782), new mmr0(vnb0.W0, 2131624786), new mmr0(vnb0.U0, 2131624830), new mmr0(vnb0.X0, 2131624834), new mmr0(vnb0.V0, 2131624806), new mmr0(vnb0.Y0, 2131624810), new mmr0(vnb0.t, 2131624855), new mmr0(vnb0.X, 2131624755), new mmr0(vnb0.Y, 2131624980), new mmr0(vnb0.Z, 2131625004), new mmr0(vnb0.N0, 2131624992), new mmr0(vnb0.O0, 2131624968), new mmr0(vnb0.P0, 2131624956), new mmr0(vnb0.Q0, 2131624944), new mmr0(vnb0.Z0, 2131624879), new mmr0(vnb0.a1, 2131624880)});
    public static final int b;
    public static final int c;

    static {
        int size = oe40.f.size();
        b = size;
        c = Build.VERSION.SDK_INT >= 31 ? oe40.h : oe40.h / size;
    }

    public static final d421 a(cng1 cng1Var, gt40 gt40Var, int i) {
        Context context = cng1Var.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            short s = oe40.h;
            if (i >= s) {
                hhg1.f(cy30.i(s, "Index of the root view cannot be more than ", i, ", currently "));
                return null;
            }
            a391 a391Var = new a391(1, 1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), oe40.g + i);
            iql1 iql1Var = (iql1) gt40Var.foldIn(null, k9b0.T0);
            if (iql1Var != null) {
                i3o1.h(context, remoteViews, iql1Var, 2131430705);
            }
            f660 f660Var = (f660) gt40Var.foldIn(null, k9b0.U0);
            if (f660Var != null) {
                i3o1.g(context, remoteViews, f660Var, 2131430705);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(2131430705);
            }
            return new d421(remoteViews, new lk80(2131430705, 0, i2 >= 33 ? b7x.a : Collections.singletonMap(0, Collections.singletonMap(a391Var, 2131430704)), 2));
        }
        int i3 = b * i;
        short s2 = oe40.h;
        if (i3 >= s2) {
            k220.d(s2 / 4, i, ", currently ", "Index of the root view cannot be more than ");
            return null;
        }
        iql1 iql1Var2 = (iql1) gt40Var.foldIn(null, k9b0.R0);
        b5u b5uVarF = z4u.a;
        b5u b5uVarF2 = iql1Var2 != null ? f(iql1Var2.a, context) : b5uVarF;
        f660 f660Var2 = (f660) gt40Var.foldIn(null, k9b0.S0);
        if (f660Var2 != null) {
            b5uVarF = f(f660Var2.a, context);
        }
        v4u v4uVar = v4u.a;
        int i4 = b5uVarF2.equals(v4uVar) ? 4 : 1;
        int i5 = b5uVarF.equals(v4uVar) ? 4 : 1;
        a391 a391Var2 = new a391(i4 == 2 ? 1 : i4, i5 != 2 ? i5 : 1);
        Integer num = (Integer) oe40.f.get(a391Var2);
        if (num != null) {
            return new d421(new RemoteViews(context.getPackageName(), i3 + oe40.g + num.intValue()), new lk80(0, 0, Collections.singletonMap(0, Collections.singletonMap(a391Var2, 2131430704)), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + kaa0.q(i4) + ", " + kaa0.q(i5) + ']');
    }

    public static final int b() {
        return c;
    }

    public static final lk80 c(RemoteViews remoteViews, cng1 cng1Var, vnb0 vnb0Var, int i, gt40 gt40Var, ml3 ml3Var, ol3 ol3Var) {
        int iIntValue;
        if (i > 10) {
            Objects.toString(vnb0Var);
            new IllegalArgumentException(vnb0Var + " container cannot have more than 10 elements");
        }
        int i2 = i <= 10 ? i : 10;
        Integer numH = h(vnb0Var, gt40Var);
        if (numH != null) {
            iIntValue = numH.intValue();
        } else {
            dnl dnlVar = (dnl) oe40.a.get(new onl(vnb0Var, i2, ml3Var, ol3Var));
            Integer numValueOf = dnlVar != null ? Integer.valueOf(dnlVar.a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + vnb0Var + " with " + i + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) oe40.b.get(vnb0Var);
        if (map == null) {
            hhg1.g(vnb0Var, "Cannot find generated children for ");
            return null;
        }
        lk80 lk80VarE = e(remoteViews, cng1Var, iIntValue, gt40Var);
        int i3 = lk80VarE.a;
        lk80 lk80Var = new lk80(i3, lk80VarE.b, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return lk80Var;
    }

    public static final lk80 d(RemoteViews remoteViews, cng1 cng1Var, vnb0 vnb0Var, gt40 gt40Var) {
        Integer numH = h(vnb0Var, gt40Var);
        if (numH != null || (numH = (Integer) a.get(vnb0Var)) != null) {
            return e(remoteViews, cng1Var, numH.intValue(), gt40Var);
        }
        hhg1.g(vnb0Var, "Cannot use `insertView` with a container like ");
        return null;
    }

    public static final lk80 e(RemoteViews remoteViews, cng1 cng1Var, int i, gt40 gt40Var) {
        Integer numValueOf;
        int i2 = cng1Var.e;
        Context context = cng1Var.a;
        iql1 iql1Var = (iql1) gt40Var.foldIn(null, k9b0.V0);
        b5u b5uVar = z4u.a;
        b5u b5uVar2 = iql1Var != null ? iql1Var.a : b5uVar;
        f660 f660Var = (f660) gt40Var.foldIn(null, k9b0.W0);
        if (f660Var != null) {
            b5uVar = f660Var.a;
        }
        if (gt40Var.b()) {
            numValueOf = null;
        } else {
            if (cng1Var.i.getAndSet(true)) {
                eg.m("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            numValueOf = Integer.valueOf(R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            int iIntValue = numValueOf != null ? numValueOf.intValue() : cng1Var.g.incrementAndGet();
            RemoteViews remoteViewsA = pnb0.a.a(context.getPackageName(), i, iIntValue);
            int i4 = cng1Var.h.a;
            if (i3 >= 31) {
                f421.a.a(remoteViews, i4, remoteViewsA, i2);
            } else {
                remoteViews.addView(i4, remoteViewsA);
            }
            return new lk80(iIntValue, 0, null, 6);
        }
        if (i3 >= 31) {
            u4u u4uVar = u4u.a;
            return new lk80(puo1.q(remoteViews, cng1Var, g(remoteViews, cng1Var, i2, b5uVar2.equals(u4uVar) ? 3 : 1, b5uVar.equals(u4uVar) ? 3 : 1), i, numValueOf), 0, null, 6);
        }
        int i5 = i(f(b5uVar2, context));
        int i6 = i(f(b5uVar, context));
        int iG = g(remoteViews, cng1Var, i2, i5, i6);
        if (i5 != 2 && i6 != 2) {
            return new lk80(puo1.q(remoteViews, cng1Var, iG, i, numValueOf), 0, null, 6);
        }
        nlb0 nlb0Var = (nlb0) oe40.e.get(new a391(i5, i6));
        if (nlb0Var != null) {
            return new lk80(puo1.q(remoteViews, cng1Var, 2131428997, i, numValueOf), puo1.q(remoteViews, cng1Var, iG, nlb0Var.a, (Integer) null), null, 4);
        }
        eg.i("Could not find complex layout for width=", kaa0.q(i5), ", height=", kaa0.q(i6));
        return null;
    }

    public static final b5u f(b5u b5uVar, Context context) {
        if (!(b5uVar instanceof x4u)) {
            return b5uVar;
        }
        float dimension = context.getResources().getDimension(2131167210);
        int i = (int) dimension;
        if (i != -2) {
            return i != -1 ? new t4u(dimension / context.getResources().getDisplayMetrics().density) : v4u.a;
        }
        return z4u.a;
    }

    public static final int g(RemoteViews remoteViews, cng1 cng1Var, int i, int i2, int i3) {
        a391 a391Var = new a391(i2 == 2 ? 1 : i2, i3 != 2 ? i3 : 1);
        Map map = (Map) cng1Var.h.c.get(Integer.valueOf(i));
        if (map == null) {
            eg.m(f4i1.c(i, "Parent doesn't have child position "));
            return 0;
        }
        Integer num = (Integer) map.get(a391Var);
        if (num == null) {
            StringBuilder sbR = cy30.r(i, "No child for position ", " and size ");
            sbR.append(kaa0.q(i2));
            sbR.append(" x ");
            bhn0.h(kaa0.q(i3), sbR);
            return 0;
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            puo1.q(remoteViews, cng1Var, ((Number) it.next()).intValue(), 2131624768, 2131428434);
        }
        return iIntValue;
    }

    public static final Integer h(vnb0 vnb0Var, gt40 gt40Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            cm3 cm3Var = (cm3) gt40Var.foldIn(null, k9b0.X0);
            iql1 iql1Var = (iql1) gt40Var.foldIn(null, k9b0.Y0);
            u4u u4uVar = u4u.a;
            boolean zEquals = iql1Var != null ? iql1Var.a.equals(u4uVar) : false;
            f660 f660Var = (f660) gt40Var.foldIn(null, k9b0.Z0);
            boolean zEquals2 = f660Var != null ? f660Var.a.equals(u4uVar) : false;
            if (cm3Var != null) {
                ql3 ql3Var = cm3Var.a;
                nlb0 nlb0Var = (nlb0) oe40.c.get(new q1c(vnb0Var, ql3Var.a, ql3Var.b));
                if (nlb0Var != null) {
                    return Integer.valueOf(nlb0Var.a);
                }
                hhg1.i("Cannot find ", vnb0Var, " with alignment ", ql3Var);
                return null;
            }
            if (zEquals || zEquals2) {
                nlb0 nlb0Var2 = (nlb0) oe40.d.get(new gt31(vnb0Var, zEquals, zEquals2));
                if (nlb0Var2 != null) {
                    return Integer.valueOf(nlb0Var2.a);
                }
                eg.n("Cannot find ", vnb0Var, " with defaultWeight set");
                return null;
            }
        }
        return null;
    }

    public static final int i(b5u b5uVar) {
        if (b5uVar instanceof z4u) {
            return 1;
        }
        if (b5uVar instanceof u4u) {
            return 3;
        }
        if (b5uVar instanceof v4u) {
            return 4;
        }
        if (b5uVar instanceof t4u ? true : b5uVar instanceof x4u) {
            return 2;
        }
        eg.o();
        return 0;
    }
}
