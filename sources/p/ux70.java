package p;

import android.app.Activity;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ux70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux70(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        mr20 huzVar;
        byte b = 13;
        byte b2 = 23;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                b261.n((e261) obj, ((s3t0) this.b).f);
                return rih1.a;
            case 1:
                ky70 ky70Var = (ky70) obj;
                py70 py70Var = (py70) this.b;
                return new x010(new m441(new xtz(ky70Var, py70Var, lnmVar, b)), (ky70Var.b == null || ky70Var.c != null || ky70Var.d) ? new huz(Long.valueOf(py70Var.a.b()), (byte) 10) : new m441(new p1r(py70Var, (lnm) null, (byte) 27)), new my70(3, (lnm) null), (byte) 1);
            case 2:
                ((AtomicBoolean) ((av7) this.b).f).set(false);
                return rih1.a;
            case 3:
                ((qtr) obj).b(new f3((ng20) this.b, (lnm) null, (byte) 14));
                return rih1.a;
            case 4:
                wfx wfxVar = ((px6) this.b).b.c;
                return new nwr(wfxVar.b, wfxVar.a, (byte) 1);
            case 5:
                ((qtr) obj).b(new kr((e111) this.b, (lnm) null, (byte) 20));
                return rih1.a;
            case 6:
                return ((igx) ((rt01) this.b).d).a((l0i) null);
            case 7:
                List list = (List) obj;
                id80 id80Var = (id80) this.b;
                synchronized (id80Var.b) {
                    try {
                        if (!id80Var.e) {
                            List<mmr0> list2 = list;
                            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                            for (mmr0 mmr0Var : list2) {
                                jh5 jh5Var = (jh5) mmr0Var.a;
                                j3r j3rVar = (k3r) mmr0Var.b;
                                if (!(j3rVar instanceof j3r)) {
                                    Object obj2 = ((Map) id80Var.g.b.b).get(jh5Var);
                                    if (obj2 != null) {
                                        j3rVar = new j3r(obj2);
                                    } else if (j3rVar == null) {
                                        j3rVar = i3r.a;
                                    }
                                }
                                arrayList.add(new mmr0(jh5Var, j3rVar));
                            }
                            ArrayList<mmr0> arrayList2 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                mmr0 mmr0Var2 = (mmr0) obj3;
                                jh5 jh5Var2 = (jh5) mmr0Var2.a;
                                k3r k3rVar = (k3r) mmr0Var2.b;
                                if (id80Var.c.contains(jh5Var2) && !u890.j(id80Var.d.get(jh5Var2), k3rVar)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            for (mmr0 mmr0Var3 : arrayList2) {
                                id80Var.d.put((jh5) mmr0Var3.a, (k3r) mmr0Var3.b);
                                break;
                            }
                            if (!arrayList2.isEmpty() && !((id80) this.b).e) {
                                ((id80) this.b).a.invoke(arrayList2);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rih1.a;
            case 8:
                b261.n((e261) obj, ((zf80) this.b).d);
                return rih1.a;
            case 9:
                cas casVar = (a7m0) obj;
                casVar.a = g070.W0;
                rwj rwjVar = (rwj) this.b;
                casVar.d = new sm80(rwjVar, (byte) 0);
                casVar.e = new sm80(rwjVar, (byte) 1);
                return rih1.a;
            case 10:
                return new k6r((res) this.b, (byte) 13);
            case 11:
                Object obj4 = ((e331) obj).a;
                ro30 ro30Var = (ro30) this.b;
                Throwable thA = e331.a(obj4);
                if (thA != null) {
                    ae5 ae5Var = (ae5) ro30Var.c;
                    String strS = nmn1.s(thA);
                    t2j0 t2j0Var = ae5Var.a;
                    t210 t210VarN = ExternalAccessoryRemoteError.n();
                    t210VarN.n("jam_settings");
                    t210VarN.r();
                    t210VarN.q(strS);
                    t2j0Var.a(t210VarN.build());
                }
                return rih1.a;
            case 12:
                eqc eqcVar = (eqc) obj;
                mw80 mw80Var = (mw80) this.b;
                return eqcVar.b(new vq80(mw80Var, mw80Var.Q0.a(eqcVar.a.j(), eqcVar.a.getLayoutDirection(), eqcVar), (byte) 1));
            case 13:
                MobiusLoop mobiusLoop = ((gx80) this.b).Y;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return rih1.a;
                }
                u890.C("mobiusLoop");
                throw null;
            case 14:
                bz80 bz80Var = (bz80) this.b;
                cas casVar2 = (a7m0) obj;
                casVar2.d = new cc00(bz80Var, (byte) 19);
                casVar2.e = new nd70(bz80Var, b2);
                return rih1.a;
            case 15:
                qz80 qz80Var = (qz80) this.b;
                synchronized (qz80Var.c) {
                    qz80Var.d = (byte) 5;
                    qz80Var.f = null;
                }
                return rih1.a;
            case 16:
                return (a1r0) ((jly0) ((p4a1) this.b).a.a((Activity) obj).f).get();
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((ExoPlayer) obj).a0((qba) this.b);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                List list3 = (List) obj;
                w9i1 w9i1Var = (w9i1) this.b;
                if (w9i1Var.S0 && !list3.isEmpty()) {
                    synchronized (w9i1Var.x1) {
                        if (!w9i1Var.w1 && !w9i1Var.C1 && !((Boolean) w9i1Var.o1.getValue()).booleanValue()) {
                            bpb1 bpb1Var = w9i1Var.o1;
                            Boolean bool = Boolean.TRUE;
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, bool);
                            xab1 xab1VarT = fn31.T(ack1.a(w9i1Var), (o8n) null, 2, new k6g1(w9i1Var, list3, (lnm) null, (byte) 17), 1);
                            w9i1Var.D1 = xab1VarT;
                            xab1VarT.start();
                        }
                    }
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                daq daqVar = ((v2o0) this.b).a.a;
                return new yjq(new wtp(daqVar, (Activity) obj).y(), (q1o0) daqVar.ht.get(), (d3o0) daqVar.E2.get(), (h84) daqVar.B2.get(), (o241) daqVar.u4.get(), (byte) 20);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new k6r((da90) this.b, (byte) 14);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new k6r((sa90) this.b, (byte) 15);
            case 22:
                wfx wfxVar2 = ((px6) this.b).b.c;
                return new nwr(wfxVar2.b, wfxVar2.a, (byte) 1);
            case 23:
                return rqt0.u(new ld2(((rf40) this.b).a, (String) obj, (byte) 16));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return rqt0.u(yoi1.g((Observable) ((idd1) ((y7c0) this.b).f).getValue()));
            case 25:
                vl90 vl90Var = (vl90) this.b;
                return new vvu(d3p1.H(vl90Var.a, vl90Var.c, (pl90) obj), (byte) 21);
            case 26:
                Set set = (Set) obj;
                hm90 hm90Var = (hm90) this.b;
                r3d0 r3d0Var = hm90Var.d;
                if (r3d0Var == null || set.isEmpty()) {
                    huzVar = new huz(b7x.a, (byte) 10);
                } else {
                    Set<String> set2 = set;
                    ArrayList arrayList3 = new ArrayList(q7h.U(set2, 10));
                    for (String str : set2) {
                        arrayList3.add(new ld2(r3d0Var.c(str), str, (byte) 17));
                    }
                    huzVar = rqt0.u(new wa3((mr20[]) o7h.l1(arrayList3).toArray(new mr20[0]), (byte) 18));
                }
                return hu20.e(new x010(huzVar, rqt0.u(new x010(hm90Var.e, new zx60(yoi1.g(hm90Var.b.d()), (byte) 5), new ce2(3, (lnm) null, (byte) 24), (byte) 1)), dm90.h, (byte) 1), new qd0((lnm) null, hm90Var, set, (byte) 23));
            case 27:
                iu30 iu30Var = ((ym90) this.b).b;
                if (iu30Var != null) {
                    iu30Var.invoke(obj);
                }
                return rih1.a;
            case 28:
                ai0 ai0VarA = ((m4a1) this.b).a.a((Activity) obj);
                return new yt91((Activity) ai0VarA.a, (b0a0) ((daq) ai0VarA.b).bm.get());
            default:
                return new k6r((vyz0) this.b, (byte) 16);
        }
    }
}
