package p;

import android.content.Context;
import com.spotify.listplatform.sortingimpl.ListSortingProto$ListSortingStore;
import com.spotify.listplatform.sortingimpl.ListSortingProto$UserSortOrders;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r3d0 {
    public final String a;
    public final vvu0 b;
    public final r4r c;
    public final klu0 d;

    public r3d0(Context context, String str, e4q e4qVar, vvu0 vvu0Var) {
        klu0 klu0Var;
        klu0 klu0Var2;
        this.a = str;
        this.b = vvu0Var;
        this.c = (r4r) s3d0.b.a(context, s3d0.a[0]);
        switch (e4qVar.a) {
            case 0:
                thq thqVar = e4qVar.b;
                daq daqVar = thqVar.b;
                klu0Var = new klu0((Context) daqVar.x1.a, str, (ut71) daqVar.g2.get(), thqVar.c.g0(), (nfa0) daqVar.b2.get());
                klu0Var2 = klu0Var;
                break;
            case 1:
                daq daqVar2 = e4qVar.b.a;
                klu0Var = new klu0((Context) daqVar2.x1.a, str, (ut71) daqVar2.g2.get(), uou0.l(new dg8((wqg) daqVar2.h8.get(), (byte) 21), new il00((agc0) daqVar2.B7.get(), (byte) 23), new ye90((gqm1) daqVar2.A9.get(), (xrm1) daqVar2.l7.get(), (byte) 25), new mka((byte) 15), new l1p0(w3p0.x(daqVar2.C1()), (byte) 4), new fza((byte) 18)), (nfa0) daqVar2.b2.get());
                klu0Var2 = klu0Var;
                break;
            default:
                r7q r7qVar = e4qVar.b;
                daq daqVar3 = r7qVar.b;
                klu0Var2 = new klu0((Context) daqVar3.x1.a, str, (ut71) daqVar3.g2.get(), r7qVar.d.i2(), (nfa0) daqVar3.b2.get());
                break;
        }
        this.d = klu0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, lnm lnmVar) {
        o3d0 o3d0Var;
        Map mapP;
        if (lnmVar instanceof o3d0) {
            o3d0Var = (o3d0) lnmVar;
            int i = o3d0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3d0Var.d = i - Integer.MIN_VALUE;
            } else {
                o3d0Var = new o3d0(this, lnmVar);
            }
        } else {
            o3d0Var = new o3d0(this, lnmVar);
        }
        Object objI = o3d0Var.b;
        int i2 = o3d0Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 data = this.c.getData();
            o3d0Var.a = str;
            o3d0Var.d = 1;
            objI = b5p1.i(data, o3d0Var);
            if (objI != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return objI;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = o3d0Var.a;
        hm5.M(objI);
        ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = (ListSortingProto$UserSortOrders) ((ListSortingProto$ListSortingStore) objI).o().get(this.a);
        String str2 = (listSortingProto$UserSortOrders == null || (mapP = listSortingProto$UserSortOrders.p()) == null) ? null : (String) mapP.get(str);
        if (str2 != null) {
            return ot11.B(str2, s3d0.a(listSortingProto$UserSortOrders, str));
        }
        o3d0Var.a = null;
        o3d0Var.d = 2;
        Object objB = b(str, o3d0Var);
        return objB == obj ? obj : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        p3d0 p3d0Var;
        g3d0 g3d0Var;
        Map map;
        String str2;
        Map map2;
        if (onmVar instanceof p3d0) {
            p3d0Var = (p3d0) onmVar;
            int i = p3d0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p3d0Var.e = i - Integer.MIN_VALUE;
            } else {
                p3d0Var = new p3d0(this, onmVar);
            }
        } else {
            p3d0Var = new p3d0(this, onmVar);
        }
        Object obj = p3d0Var.c;
        int i2 = p3d0Var.e;
        klu0 klu0Var = this.d;
        String strB = null;
        if (i2 == 0) {
            hm5.M(obj);
            g3d0 g3d0VarB = (g3d0) klu0Var.a.invoke(str);
            bma1 bma1Var = klu0.e;
            cmm cmmVarX = h5p1.x(str);
            if (cmmVarX != null && (map = ((kja1) klu0Var.d.getValue()).a) != null && (str2 = (String) map.get(cmmVarX)) != null) {
                g3d0VarB = ot11.B(str2, null);
            }
            if (g3d0VarB.equals(this.b.invoke(str))) {
                return g3d0VarB;
            }
            p3d0Var.a = str;
            p3d0Var.b = g3d0VarB;
            p3d0Var.e = 1;
            Object objD = d(str, g3d0VarB, p3d0Var);
            Object obj2 = d9n.a;
            if (objD == obj2) {
                return obj2;
            }
            g3d0Var = g3d0VarB;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g3d0Var = p3d0Var.b;
            str = p3d0Var.a;
            hm5.M(obj);
        }
        if (klu0Var == null) {
            klu0Var = null;
        }
        if (klu0Var != null) {
            idd1 idd1Var = klu0Var.d;
            bma1 bma1Var2 = klu0.e;
            cmm cmmVarX2 = h5p1.x(str);
            if (cmmVarX2 != null && (map2 = ((kja1) idd1Var.getValue()).a) != null && map2.remove(cmmVarX2) != null) {
                try {
                    strB = klu0Var.b.b(kja1.Companion.serializer(), (kja1) idd1Var.getValue());
                } catch (AssertionError e) {
                    n57.e("Failed to write sorting for items: " + e);
                }
                if (strB != null) {
                    hma1 hma1VarEdit = klu0Var.c.edit();
                    hma1VarEdit.d(klu0.e, strB);
                    hma1VarEdit.g();
                }
            }
        }
        return g3d0Var;
    }

    public final mr20 c(String str) {
        return rqt0.u(new x010(this.c.getData(), this, str, (byte) 4));
    }

    public final Object d(String str, g3d0 g3d0Var, onm onmVar) {
        Object objA = this.c.a(new sr1(this, str, g3d0Var, (lnm) null, (byte) 27), onmVar);
        return objA == d9n.a ? objA : rih1.a;
    }
}
