package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class cix0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        f5x f5xVar = null;
        f5xVar = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b261.w((e261) obj, vfx0.d);
                return rih1Var;
            case 1:
                s8s0 s8s0Var = xw21.f;
                return Boolean.valueOf(sua.i(((i4n1) obj).a));
            case 2:
                throw new jgo0();
            case 3:
                return new zwb0((nma0) o7h.q0((List) obj), (byte) 1);
            case 4:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                boolean zJ = u890.j(obj3, Boolean.FALSE);
                df41 df41Var = f6o1.b;
                if (!zJ && obj3 != null) {
                    f5xVar = (f5x) df41Var.b.invoke(obj3);
                }
                f5xVar.getClass();
                return new edt0(f5xVar.a, zBooleanValue);
            case 5:
                return new f5x(((Integer) obj).intValue());
            case 6:
                return new mhc0(((Integer) obj).intValue());
            case 7:
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                fbe1 fbe1Var = (u890.j(obj4, Boolean.FALSE) || obj4 == null) ? null : (fbe1) f6o1.e.b.invoke(obj4);
                fbe1Var.getClass();
                int i = fbe1Var.a;
                Object obj5 = list2.get(1);
                Boolean bool2 = obj5 != null ? (Boolean) obj5 : null;
                bool2.getClass();
                return new gbe1(i, bool2.booleanValue());
            case 8:
                return new fbe1(((Integer) obj).intValue());
            case 9:
                return Integer.valueOf(((wq41) obj).b);
            case 10:
                return Integer.valueOf(((wq41) obj).c.b());
            case 11:
                return new es41(((Integer) obj).intValue());
            case 12:
                mma0[] mma0VarArr = b261.a;
                ((e261) obj).b(z161.e, rih1Var);
                return rih1Var;
            case 13:
                Offset offset = (Offset) obj;
                long j = offset.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new le5(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & offset.a))) : vy51.a;
            case 14:
                le5 le5Var = (le5) obj;
                return new Offset((((long) Float.floatToRawIntBits(le5Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(le5Var.a)) << 32));
            case 15:
                return ((n561) obj).iterator();
            case 16:
                return ((Iterable) obj).iterator();
            case 17:
                return obj;
            case 18:
                return Boolean.valueOf(obj == null);
            case 19:
                tka0 tka0Var = (tka0) obj;
                nma0 nma0VarV = wmo1.v(tka0Var);
                if (nma0VarV != null) {
                    return nma0VarV;
                }
                if (syo1.w(tka0Var)) {
                    return new tcv0(tka0Var);
                }
                return null;
            case 20:
                tka0 tka0Var2 = (tka0) obj;
                tcv0 tcv0VarV = wmo1.v(tka0Var2);
                if (tcv0VarV == null) {
                    tcv0VarV = syo1.w(tka0Var2) ? new tcv0(tka0Var2) : null;
                }
                if (tcv0VarV != null) {
                    return m5n1.z(tcv0VarV);
                }
                return null;
            case 21:
                return rih1Var;
            case 22:
                return (String) obj;
            case 23:
                mma0[] mma0VarArr2 = b261.a;
                d261 d261Var = z161.m;
                mma0 mma0Var = b261.a[5];
                Boolean bool3 = Boolean.TRUE;
                d261Var.getClass();
                ((e261) obj).b(d261Var, bool3);
                return rih1Var;
            case 24:
                mma0[] mma0VarArr3 = b261.a;
                d261 d261Var2 = z161.m;
                mma0 mma0Var2 = b261.a[5];
                Boolean bool4 = Boolean.TRUE;
                d261Var2.getClass();
                ((e261) obj).b(d261Var2, bool4);
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return rih1Var;
            case 27:
                d441 d441VarG1 = ((y341) obj).g1("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        arrayList.add(d441VarG1.P0(0));
                    }
                    d441VarG1.close();
                    return arrayList;
                } catch (Throwable th) {
                    d441VarG1.close();
                    throw th;
                }
            case 28:
                ((Float) obj).getClass();
                return rih1Var;
            default:
                ((Integer) obj).intValue();
                return e5e1.a;
        }
    }

    public /* synthetic */ cix0(byte b) {
        this.a = b;
    }
}
