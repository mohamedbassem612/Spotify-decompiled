package p;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class axm0 extends hab0 implements iu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axm0(ArrayList arrayList, ArrayList arrayList2, boolean z, tln tlnVar, dp71 dp71Var, iu30 iu30Var, mxf0 mxf0Var, yp71 yp71Var, nbh nbhVar, ven0 ven0Var, cb0 cb0Var) {
        super(1);
        this.a = (byte) 2;
        this.d = arrayList;
        this.e = arrayList2;
        this.b = z;
        this.f = tlnVar;
        this.g = dp71Var;
        this.h = iu30Var;
        this.i = mxf0Var;
        this.t = yp71Var;
        this.X = nbhVar;
        this.c = ven0Var;
        this.Y = cb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.d;
        Object obj8 = this.c;
        byte b2 = 1;
        Object obj9 = this.t;
        Object obj10 = this.f;
        Object obj11 = this.e;
        switch (b) {
            case 0:
                abc0 abc0Var = (abc0) obj;
                ven0 ven0Var = (ven0) obj8;
                abc0Var.a = new vk1(ven0Var, (lnm) null, (byte) 19);
                abc0Var.b = new wkk0(this.b, (b9l1) obj11, ven0Var, (lsm0) obj10, (lnm) null, (byte) 10);
                abc0Var.c = new d96((b9l1) obj11, ven0Var, (lsm0) obj10, (gij1) obj6, (q9l1) obj5, (c2u0) obj4, (ven0) obj7, (fal1) obj9, (m0t) obj3, (o0i) obj2, (lnm) null);
                abc0Var.d = new q2j0(ven0Var, (byte) 7);
                break;
            case 1:
                dnc0 dnc0Var = (dnc0) obj;
                two1.v(dnc0Var, (m441) obj8, true, new ts11((ms11) obj11, (zsc) obj10, (w3l0) obj6, (y1c1) obj5, (toc) obj4, this.b, (it8) obj9, (hpc) obj3, (lzn0) obj2));
                ((iu30) obj7).invoke(dnc0Var);
                break;
            case 2:
                rtb0 rtb0Var = (rtb0) obj;
                dp71 dp71Var = (dp71) obj6;
                rtb0.c(rtb0Var, (Object) null, new j2i(-1817309228, new nu31((tln) obj10, dp71Var, (iu30) obj5, (byte) 9), true), 3);
                rtb0.c(rtb0Var, (Object) null, new j2i(1806303051, new rt11(obj4, (Object) dp71Var, (byte) 20), true), 3);
                c380 c380VarA = mqo1.A((ArrayList) obj7);
                rtb0Var.e(c380VarA.size(), new nt(c380VarA, (byte) 11), new nt(c380VarA, (byte) 12), new j2i(2039820996, new d311(b2, (yp71) obj9, dp71Var, c380VarA), true));
                ArrayList arrayList = (ArrayList) obj11;
                boolean zIsEmpty = arrayList.isEmpty();
                boolean z = this.b;
                if (!zIsEmpty || z) {
                    rtb0.c(rtb0Var, (Object) null, ghj.a, 3);
                }
                rtb0Var.e(arrayList.size(), new qbb0(arrayList, (byte) 23), new qbb0(arrayList, (byte) 24), new j2i(2039820996, new a87(arrayList, (nbh) obj3, (yp71) obj9, dp71Var, (ven0) obj8, (byte) 9), true));
                if (z) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(-2129769178, new gkn((cb0) obj2, (byte) 1), true), 3);
                }
                break;
            case 3:
                wcg1 wcg1Var = (wcg1) obj8;
                List list = wcg1Var.a;
                ((rtb0) obj).e(list.size(), (iu30) null, new vse1(list, (byte) 4), new j2i(2039820996, new cdg1(list, (xv81) obj7, (yxb0) obj11, wcg1Var, (ng20) obj10, (et90) obj6, (ou8) obj5, (zhy) obj4, (qj0) obj9, (ldo) obj3, this.b, (u710) obj2), true));
                break;
            default:
                List list2 = ((xdg1) obj8).a;
                ((rtb0) obj).e(list2.size(), (iu30) null, new vse1(list2, (byte) 5), new j2i(2039820996, new deg1(list2, (xv81) obj7, (Set) obj11, (Set) obj10, (iu30) obj6, (et90) obj5, (zhy) obj4, (qj0) obj9, (ldo) obj3, this.b, (u710) obj2), true));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ axm0(Parcelable parcelable, xv81 xv81Var, Object obj, Object obj2, Object obj3, xpw xpwVar, zhy zhyVar, qj0 qj0Var, ldo ldoVar, boolean z, u710 u710Var, byte b) {
        super(1);
        this.a = b;
        this.c = parcelable;
        this.d = xv81Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = xpwVar;
        this.i = zhyVar;
        this.t = qj0Var;
        this.X = ldoVar;
        this.b = z;
        this.Y = u710Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axm0(ven0 ven0Var, boolean z, b9l1 b9l1Var, lsm0 lsm0Var, gij1 gij1Var, q9l1 q9l1Var, c2u0 c2u0Var, ven0 ven0Var2, fal1 fal1Var, m0t m0tVar, o0i o0iVar) {
        super(1);
        this.a = (byte) 0;
        this.c = ven0Var;
        this.b = z;
        this.e = b9l1Var;
        this.f = lsm0Var;
        this.g = gij1Var;
        this.h = q9l1Var;
        this.i = c2u0Var;
        this.d = ven0Var2;
        this.t = fal1Var;
        this.X = m0tVar;
        this.Y = o0iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axm0(m441 m441Var, iu30 iu30Var, ms11 ms11Var, zsc zscVar, w3l0 w3l0Var, y1c1 y1c1Var, toc tocVar, boolean z, it8 it8Var, hpc hpcVar, lzn0 lzn0Var) {
        super(1);
        this.a = (byte) 1;
        this.c = m441Var;
        this.d = iu30Var;
        this.e = ms11Var;
        this.f = zscVar;
        this.g = w3l0Var;
        this.h = y1c1Var;
        this.i = tocVar;
        this.b = z;
        this.t = it8Var;
        this.X = hpcVar;
        this.Y = lzn0Var;
    }
}
