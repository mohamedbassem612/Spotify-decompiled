package p;

import android.util.Size;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class m implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ m(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        oqq0 oqq0Var;
        oqq0 oqq0VarA;
        byte b = this.a;
        sxh sxhVarC = sxh.a;
        switch (b) {
            case 0:
                ep80 ep80Var = (ep80) obj;
                ep80 ep80Var2 = (ep80) obj2;
                if (dhn.a.contains(o.class)) {
                    return 0;
                }
                try {
                    Long l = ep80Var.g;
                    if (l == null) {
                        return -1;
                    }
                    long jLongValue = l.longValue();
                    Long l2 = ep80Var2.g;
                    if (l2 != null) {
                        return u890.r(l2.longValue(), jLongValue);
                    }
                    return 1;
                } catch (Throwable th) {
                    dhn.a(o.class, th);
                    return 0;
                }
            case 1:
                return u890.q(((gow0) obj2).a ? 1 : 0, ((gow0) obj).a ? 1 : 0);
            case 2:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 3:
                return Integer.compare(((ie30) obj2).k, ((ie30) obj).k);
            case 4:
                return Integer.compare(((z9e) obj2).b, ((z9e) obj).b);
            case 5:
                ep80 ep80Var3 = (ep80) obj2;
                Long l3 = ((ep80) obj).g;
                if (l3 == null) {
                    return -1;
                }
                long jLongValue2 = l3.longValue();
                Long l4 = ep80Var3.g;
                if (l4 != null) {
                    return u890.r(l4.longValue(), jLongValue2);
                }
                return 1;
            case 6:
                String name = ((File) obj).getName();
                byte b2 = zin.f;
                return name.substring(0, b2).compareTo(((File) obj2).getName().substring(0, b2));
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                return ((axs) ((List) obj).get(0)).compareTo((axs) ((List) obj2).get(0));
            case 9:
                return Integer.compare(((wws) ((List) obj).get(0)).f, ((wws) ((List) obj2).get(0)).f);
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                byte b3 = 12;
                byte b4 = 13;
                return qxh.g(dxs.c((dxs) Collections.max(list, new m(b3)), (dxs) Collections.max(list2, new m(b3)))).a(list.size(), list2.size()).c((dxs) Collections.max(list, new m(b4)), (dxs) Collections.max(list2, new m(b4)), new m(b4)).f();
            case 11:
                return ((vws) Collections.max((List) obj)).compareTo((vws) Collections.max((List) obj2));
            case 12:
                return dxs.c((dxs) obj, (dxs) obj2);
            case 13:
                dxs dxsVar = (dxs) obj;
                dxs dxsVar2 = (dxs) obj2;
                boolean z = dxsVar.e;
                int i = dxsVar.t;
                if (z && dxsVar.h) {
                    oqq0VarA = exs.l;
                    oqq0Var = oqq0VarA;
                } else {
                    oqq0 oqq0Var2 = exs.l;
                    oqq0Var = oqq0Var2;
                    oqq0VarA = oqq0Var2.a();
                }
                if (dxsVar.f.F) {
                    sxhVarC = sxhVarC.c(Integer.valueOf(i), Integer.valueOf(dxsVar2.t), oqq0Var.a());
                }
                sxh sxhVarC2 = sxhVarC.d(dxsVar.Y0, dxsVar2.Y0).c(Integer.valueOf(dxsVar.X), Integer.valueOf(dxsVar2.X), oqq0VarA);
                if (dxsVar.U0 && dxsVar.W0) {
                    sxhVarC2 = sxhVarC2.a(dxsVar.X0, dxsVar2.X0);
                }
                return sxhVarC2.d(dxsVar.V0, dxsVar2.V0).c(Integer.valueOf(i), Integer.valueOf(dxsVar2.t), oqq0VarA).f();
            case 14:
                return Long.compare(((kru) obj).c, ((kru) obj2).c);
            case 15:
                riz rizVar = (riz) obj2;
                Long l5 = ((riz) obj).c;
                if (l5 == null) {
                    return -1;
                }
                long jLongValue3 = l5.longValue();
                Long l6 = rizVar.c;
                if (l6 != null) {
                    return u890.r(l6.longValue(), jLongValue3);
                }
                return 1;
            case 16:
                return u890.q(((bc90) obj).b, ((bc90) obj2).b);
            case 17:
                return ((tk60) obj).a.compareTo(((tk60) obj2).a);
            case 18:
                tr80 tr80Var = (tr80) obj;
                tr80 tr80Var2 = (tr80) obj2;
                return (((rr80) tr80Var).b - ((rr80) tr80Var).a) - (((rr80) tr80Var2).b - ((rr80) tr80Var2).a);
            case 19:
                return u890.q(((jsb0) obj).getIndex(), ((jsb0) obj2).getIndex());
            case 20:
                aw81 aw81Var = (aw81) obj;
                aw81 aw81Var2 = (aw81) obj2;
                long j = aw81Var.f;
                long j2 = aw81Var2.f;
                if (j - j2 == 0) {
                    return aw81Var.compareTo(aw81Var2);
                }
                return j < j2 ? -1 : 1;
            case 21:
                rlc0 rlc0Var = (rlc0) obj;
                rlc0 rlc0Var2 = (rlc0) obj2;
                int i2 = rlc0Var.c;
                int i3 = rlc0Var2.c;
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                return Integer.compare(rlc0Var2.d, rlc0Var.d);
            case 22:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 23:
                ((ejf1) obj).getClass();
                ((ejf1) obj2).getClass();
                return Integer.compare(1, 1);
            case 24:
                return ((sy8) obj).a.compareTo(((sy8) obj2).a);
            case 25:
                return ((Number) f261.b.invoke(obj, obj2)).intValue();
            case 26:
                return ((yhn) obj).a.compareTo(((yhn) obj2).a);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((ub91) obj).a - ((ub91) obj2).a;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Float.compare(((ub91) obj).c, ((ub91) obj2).c);
            default:
                rf91 rf91Var = (rf91) obj;
                rf91 rf91Var2 = (rf91) obj2;
                return sxhVarC.b(rf91Var.a, rf91Var2.a).b(rf91Var.b, rf91Var2.b).a(rf91Var.c, rf91Var2.c).f();
        }
    }
}
