package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class lyc1 {
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(SceneTemplate.SummaryShare summaryShare, gw70 gw70Var, ryc1 ryc1Var, bju bjuVar, syf syfVar, mim1 mim1Var, yeg yegVar, boolean z, boolean z2, onm onmVar) throws Throwable {
        gyc1 gyc1Var;
        syf syfVar2;
        mim1 mim1Var2;
        yeg yegVar2;
        boolean z3;
        ryc1 ryc1Var2;
        boolean z4;
        Object obj;
        SceneTemplate.SummaryShare summaryShare2 = summaryShare;
        if (onmVar instanceof gyc1) {
            gyc1Var = (gyc1) onmVar;
            int i = gyc1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                gyc1Var.i = i - Integer.MIN_VALUE;
            } else {
                gyc1Var = new gyc1(onmVar);
            }
        } else {
            gyc1Var = new gyc1(onmVar);
        }
        Object objS = gyc1Var.h;
        int i2 = gyc1Var.i;
        Throwable th = null;
        if (i2 == 0) {
            hm5.M(objS);
            kyc1 kyc1Var = new kyc1(summaryShare2, bjuVar, gw70Var, null);
            gyc1Var.a = summaryShare2;
            gyc1Var.b = ryc1Var;
            syfVar2 = syfVar;
            gyc1Var.c = syfVar2;
            mim1Var2 = mim1Var;
            gyc1Var.d = mim1Var2;
            yegVar2 = yegVar;
            gyc1Var.e = yegVar2;
            gyc1Var.f = z;
            z3 = z2;
            gyc1Var.g = z3;
            gyc1Var.i = 1;
            objS = smo1.s(kyc1Var, gyc1Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            ryc1Var2 = ryc1Var;
            z4 = z;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = gyc1Var.g;
            z4 = gyc1Var.f;
            yeg yegVar3 = gyc1Var.e;
            mim1Var2 = gyc1Var.d;
            syf syfVar3 = gyc1Var.c;
            ryc1Var2 = gyc1Var.b;
            SceneTemplate.SummaryShare summaryShare3 = gyc1Var.a;
            hm5.M(objS);
            yegVar2 = yegVar3;
            syfVar2 = syfVar3;
            z3 = z5;
            summaryShare2 = summaryShare3;
        }
        List list = (List) objS;
        String strU = ror0.a(summaryShare2.q().o()).u();
        hyc1 hyc1Var = (strU == null || ihc1.y0(strU)) ? null : new hyc1(summaryShare2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i3 = 0;
        for (Object obj2 : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                Throwable th2 = th;
                p7h.T();
                throw th2;
            }
            Throwable th3 = th;
            Integer num = new Integer(i3);
            String str = ((nxc1) obj2).m;
            int iHashCode = str.hashCode();
            if (iHashCode != -1313747187) {
                if (iHashCode != -845201925) {
                    if (iHashCode == -135761730 && str.equals("identity")) {
                        obj = qyc1.c;
                    } else {
                        obj = th3;
                    }
                } else if (str.equals("top-moments")) {
                    obj = qyc1.b;
                } else {
                    obj = th3;
                }
            } else if (str.equals("year-in-music")) {
                obj = qyc1.a;
            } else {
                obj = th3;
            }
            arrayList.add(new mmr0(num, obj));
            th = th3;
            i3 = i4;
        }
        return new kkz0(new mxc1(list, hyc1Var, ror0.d(summaryShare2.s()), ror0.d(summaryShare2.t()), yegVar2, z3), syfVar2, mim1Var2, z4, new j2i(-187159604, new xw91(sqg0.T(arrayList), ryc1Var2, (byte) 12), true));
    }
}
