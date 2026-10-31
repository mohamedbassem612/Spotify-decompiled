package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class old1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mmd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ old1(mmd1 mmd1Var, byte b) {
        super(1);
        this.a = b;
        this.b = mmd1Var;
    }

    public final Object invoke(Object obj) {
        Observable observableJust;
        byte b = this.a;
        byte b2 = 16;
        w7x w7xVar = w7x.a;
        byte b3 = 14;
        byte b4 = 9;
        byte b5 = 2;
        rih1 rih1Var = rih1.a;
        byte b6 = 10;
        byte b7 = 0;
        byte b8 = 1;
        mmd1 mmd1Var = this.b;
        switch (b) {
            case 0:
                return new wc50(mmd1Var.b);
            case 1:
                return new bob(mmd1Var.b);
            case 2:
                return Collections.singleton(mmd1Var.b);
            case 3:
                return new uc50(mmd1Var.b);
            case 4:
                return Collections.singleton(mmd1Var.b);
            case 5:
                return new lus0(mmd1Var.b);
            case 6:
                return Collections.singleton(mmd1Var.b);
            case 7:
                return new o5l1(mmd1Var.b);
            case 8:
                return new oob(mmd1Var.b, ((mid1) obj).a);
            case 9:
                return new y4e(mmd1Var.b, 1);
            case 10:
                return Collections.singleton(mmd1Var.b);
            case 11:
                return new rlb(mmd1Var.b, true);
            case 12:
                String str = mmd1Var.b;
                ArrayList<pid1> arrayList = ((qid1) obj).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (pid1 pid1Var : arrayList) {
                    String str2 = pid1Var.a;
                    ArrayList<rid1> arrayList3 = pid1Var.b;
                    String str3 = pid1Var.c;
                    String strY0 = o7h.y0(arrayList3, ", ", (String) null, (String) null, vkd1.T0, 30);
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    for (rid1 rid1Var : arrayList3) {
                        arrayList4.add(new qm31(rid1Var.a, rid1Var.b));
                    }
                    arrayList2.add(new iy2(36, str2, str3, strY0, arrayList4));
                }
                return new u6o(str, arrayList2);
            case 13:
                return new nnb(mmd1Var.b);
            case 14:
                return Collections.singleton(mmd1Var.b);
            case 15:
                return new set(mmd1Var.b);
            case 16:
                return Collections.singleton(mmd1Var.b);
            case 17:
                return new ke31(mmd1Var.b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ji50 ji50Var = (ji50) obj;
                ocq ocqVar = mmd1Var.d;
                d0r d0rVar = ji50Var.a;
                xzq xzqVar = new xzq(new fob(d0rVar, true, (lzn0) ocqVar.a.d.i.get()), new old1(mmd1Var, b8));
                osc1 osc1Var = osc1.i;
                LinkedHashMap linkedHashMap = ji50Var.b;
                byte b9 = 4;
                linkedHashMap.put(kid1.class, new r3r(xzqVar, osc1Var, 4));
                linkedHashMap.put(mid1.class, r4o1.Q(vkd1.W0, w7xVar, new qld1(mmd1Var, (byte) 7), osc1.a1));
                qld1 qld1Var = new qld1(mmd1Var, (byte) 8);
                inb.a.getClass();
                linkedHashMap.put(iid1.class, r4o1.Q(new old1(mmd1Var, b3), hnb.b, qld1Var, osc1.c1));
                linkedHashMap.put(whd1.class, r4o1.Q(new old1(mmd1Var, b2), wet.e, new qld1(mmd1Var, b4), osc1.e1));
                r7q r7qVar = mmd1Var.e.a;
                linkedHashMap.put(wid1.class, new r3r(new xzq(new qe31((byte) 0, d0rVar, (gw70) r7qVar.b.d8.get(), (lzn0) r7qVar.d.i.get()), new old1(mmd1Var, (byte) 17)), osc1.X, 4));
                linkedHashMap.put(tid1.class, r4o1.P(vkd1.Y, w7xVar, new qld1(mmd1Var, b6), osc1.Q0));
                qld1 qld1Var2 = new qld1(mmd1Var, b7);
                xc50.H.getClass();
                linkedHashMap.put(vid1.class, r4o1.P(new old1(mmd1Var, b5), vc50.b, qld1Var2, osc1.S0));
                linkedHashMap.put(uid1.class, r4o1.P(new old1(mmd1Var, b9), w7xVar, new qld1(mmd1Var, (byte) 1), osc1.U0));
                qld1 qld1Var3 = new qld1(mmd1Var, b5);
                mus0.f0.getClass();
                byte b10 = 6;
                linkedHashMap.put(sid1.class, r4o1.P(new old1(mmd1Var, b10), kus0.b, qld1Var3, osc1.V0));
                r7q r7qVar2 = mmd1Var.t.a;
                linkedHashMap.put(oid1.class, new r3r(new xzq(new lfo(d0rVar, (gw70) r7qVar2.b.d8.get(), (lzn0) r7qVar2.d.i.get()), new old1(mmd1Var, (byte) 7)), osc1.Z, 4));
                linkedHashMap.put(gid1.class, r4o1.P(vkd1.Q0, w7xVar, new qld1(mmd1Var, (byte) 3), osc1.W0));
                linkedHashMap.put(eid1.class, r4o1.P(new old1(mmd1Var, b6), l1d.u(l98.class), new qld1(mmd1Var, b9), osc1.X0));
                linkedHashMap.put(aid1.class, r4o1.P(vkd1.S0, w7xVar, new qld1(mmd1Var, (byte) 5), osc1.Y0));
                linkedHashMap.put(yhd1.class, new r3r(new xzq(new qlb((ahr) mmd1Var.j.a.d.Gd.get(), d0rVar), new old1(mmd1Var, (byte) 11)), osc1.O0, 4));
                linkedHashMap.put(qid1.class, new r3r(new xzq(new jd6(d0rVar, mmd1Var.v), new old1(mmd1Var, (byte) 12)), osc1.P0, 4));
                qld1 qld1Var4 = new qld1(mmd1Var, b10);
                aw2.j.getClass();
                linkedHashMap.put(pid1.class, r4o1.P(vkd1.V0, zv2.b, qld1Var4, osc1.Z0));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                dnc0 dnc0Var = (dnc0) obj;
                e4 e4Var = mmd1Var.o;
                String str4 = mmd1Var.b;
                ay8 ay8VarF = d3p1.F(e4Var.h, e4Var.j, str4);
                o6x o6xVar = o6x.a;
                Observable observableStartWithItem = yoi1.i(ay8VarF, o6xVar).filter(uwg.c).take(1L).startWithItem(j1r.a);
                if (e4Var.c) {
                    w4h w4hVar = e4Var.i.a;
                    u4h u4hVarQ = CollectionPlatformItemsRequest.q();
                    u4hVarQ.t(w5h.i);
                    u4hVarQ.n(Collections.singletonList(str4));
                    observableJust = yoi1.i(yoi1.g(w4hVar.c(u4hVarQ.build()).map(u9x0.U0)), o6xVar);
                } else {
                    observableJust = Observable.just(Boolean.FALSE);
                    observableJust.getClass();
                }
                two1.v(dnc0Var, yoi1.g(Observable.combineLatest(e4Var.a.b(new oi("cwp", false, new d4(str4, e4Var, (byte) 0))).filter(rbc.c), Observable.combineLatest(yoi1.i(e4Var.f.a, o6xVar), observableJust, m9h.c), observableStartWithItem, new gid(str4, e4Var, (byte) 3))), false, new old1(mmd1Var, (byte) 18));
                return rih1Var;
            case 20:
                Context context = mmd1Var.a;
                return new s460(2, 994, context.getString(2131952643), (String) null, context.getString(2131952644), ((mjd1) obj).a, false);
            case 21:
                return new s460(2, 1006, mmd1Var.a.getString(2131952599), (String) null, (String) null, (String) null, false);
            case 22:
                qld1 qld1Var5 = new qld1(mmd1Var, b3);
                zld1 zld1Var = zld1.X0;
                sld1 sld1Var = sld1.b1;
                LinkedHashMap linkedHashMap2 = ((ji50) obj).b;
                linkedHashMap2.put(mjd1.class, r4o1.P(zld1Var, w7xVar, qld1Var5, sld1Var));
                linkedHashMap2.put(ljd1.class, r4o1.P(zld1.Z0, w7xVar, new qld1(mmd1Var, (byte) 15), sld1.c1));
                linkedHashMap2.put(jjd1.class, r4o1.P(zld1.a1, w7xVar, new qld1(mmd1Var, b2), sld1.d1));
                linkedHashMap2.put(gjd1.class, r4o1.P(zld1.c1, w7xVar, sld1.a1, sld1.e1));
                sdb1 sdb1Var = new sdb1(mmd1Var, new hho(mmd1Var.D), (byte) 15);
                mmd1Var.k.getClass();
                linkedHashMap2.put(kjd1.class, r4o1.P(zld1.S0, rk11.b(2), sdb1Var, imd1.b));
                linkedHashMap2.put(ijd1.class, r4o1.P(zld1.U0, w7xVar, sld1.Y0, imd1.c));
                linkedHashMap2.put(hjd1.class, r4o1.P(zld1.W0, w7xVar, new qld1(mmd1Var, (byte) 13), imd1.d));
                return rih1Var;
            default:
                dnc0 dnc0Var2 = (dnc0) obj;
                drj0 drj0Var = mmd1Var.l;
                String str5 = mmd1Var.b;
                d0r d0rVar2 = (d0r) drj0Var.b;
                String str6 = (String) drj0Var.c;
                two1.v(dnc0Var2, new x010(str6 == null ? new huz(z6x.a, (byte) 10) : new qsc0(d3p1.H(d0rVar2, z761.a, str6), str5, drj0Var, (byte) 9), d3p1.H(d0rVar2, alm0.a, str5), new lok0(3, (lnm) null, (byte) 1), (byte) 1), false, new old1(mmd1Var, (byte) 22));
                return rih1Var;
        }
    }
}
