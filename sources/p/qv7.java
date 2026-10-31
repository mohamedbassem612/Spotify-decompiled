package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qv7 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public qv7(iu30 iu30Var, if00 if00Var) {
        this.a = (byte) 14;
        this.b = iu30Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        adb adbVar = adb.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke((pv7) obj);
                return rih1Var;
            case 1:
                Object objInvoke = iu30Var.invoke(lnmVar);
                return objInvoke == d9nVar ? objInvoke : rih1Var;
            case 2:
                iu30Var.invoke(zcb.a);
                iu30Var.invoke(adbVar);
                return rih1Var;
            case 3:
                iu30Var.invoke(adbVar);
                return rih1Var;
            case 4:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 5:
                ((Boolean) obj).getClass();
                iu30Var.invoke(opf.a);
                return rih1Var;
            case 6:
                iu30Var.invoke(new q6f((String) obj));
                return rih1Var;
            case 7:
                iu30Var.invoke(rw81.a);
                return rih1Var;
            case 8:
                ((Boolean) obj).getClass();
                iu30Var.invoke(s0m.a);
                return rih1Var;
            case 9:
                if (((Number) obj).intValue() > 0) {
                    iu30Var.invoke(ddj0.a);
                }
                return rih1Var;
            case 10:
                iu30Var.invoke(otk1.a);
                return rih1Var;
            case 11:
                fns fnsVar = igu.a;
                Object objY = fn31.Y(pyf0.a.f, new py5(iu30Var, obj, (lnm) null), lnmVar);
                return objY == d9nVar ? objY : rih1Var;
            case 12:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 13:
                iu30Var.invoke(new wrv(((Number) obj).intValue()));
                return rih1Var;
            case 14:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    iu30Var.invoke(new gf00(0, new tr80(((qtb0) o7h.q0(list)).a, ((qtb0) o7h.A0(list)).a, 1)));
                }
                return rih1Var;
            case 15:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(xg00.a);
                return rih1Var;
            case 16:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 17:
                iu30Var.invoke(new ivc1((String) obj));
                return rih1Var;
            case 18:
                iu30Var.invoke(hwc1.a);
                return rih1Var;
            case 19:
                iu30Var.invoke(new dra0((lpu) obj));
                return rih1Var;
            case 20:
                Map map = ((k2v) obj).a;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new mmr0(new a2v((String) entry.getKey(), 1), new j3r(entry.getValue())));
                }
                iu30Var.invoke(o7h.l1(arrayList));
                return rih1Var;
            case 21:
                Map map2 = ((whx0) obj).a;
                ArrayList arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry2 : map2.entrySet()) {
                    arrayList2.add(new mmr0(entry2.getKey(), new j3r(entry2.getValue())));
                }
                iu30Var.invoke(o7h.l1(arrayList2));
                return rih1Var;
            case 22:
                iu30Var.invoke(new eme0((String) obj));
                return rih1Var;
            case 23:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 24:
                iu30Var.invoke((e4h0) obj);
                return rih1Var;
            case 25:
                iu30Var.invoke(new n0j0(((Number) obj).intValue()));
                return rih1Var;
            case 26:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                iu30Var.invoke(bool);
                return rih1Var;
            case 27:
                iu30Var.invoke((k8r0) obj);
                return rih1Var;
            case 28:
                iu30Var.invoke(tk01.a);
                return rih1Var;
            default:
                iu30Var.invoke((tv80) obj);
                return rih1Var;
        }
    }

    public /* synthetic */ qv7(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }
}
