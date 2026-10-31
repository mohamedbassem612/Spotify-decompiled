package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bpq implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ bpq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return pzm.h((mos) ((sct) ((k2q) obj).b).e.get());
            case 1:
                jnq jnqVar = (jnq) obj;
                koc0 koc0Var = ((jbt) jnqVar.c).d;
                k3q k3qVar = (k3q) jnqVar.b;
                daq daqVar = k3qVar.a;
                i8h1 i8h1Var = (i8h1) daqVar.A5.get();
                c8o.l(i8h1Var);
                qop qopVar = (qop) jnqVar.a;
                u9c0 u9c0VarQ = cto1.q(qopVar.c());
                String strD = qopVar.d();
                iyc0 iyc0Var = (iyc0) k3qVar.b.g1.get();
                c8o.l(iyc0Var);
                kt91 kt91Var = (kt91) daqVar.f8.get();
                c8o.l(kt91Var);
                zwz0 zwz0Var = (zwz0) daqVar.U1.get();
                c8o.l(zwz0Var);
                return new et90(koc0Var, new mzr0(i8h1Var, u9c0VarQ, strD, iyc0Var, kt91Var, zwz0Var));
            case 2:
                x03 x03Var = ((mpq) obj).a;
                return new y241((Scheduler) x03Var.a.get(), (Observable) x03Var.b.get(), (dxz0) x03Var.c.get());
            case 3:
                jmq jmqVar = (jmq) obj;
                String strD2 = ((qop) jmqVar.a).d();
                l0q l0qVar = (l0q) jmqVar.b;
                lzn0 lzn0Var = (lzn0) l0qVar.a.i.get();
                c8o.l(lzn0Var);
                ktv ktvVar = (ktv) l0qVar.a.n6.get();
                c8o.l(ktvVar);
                return new kls0(strD2, lzn0Var, ktvVar);
            case 4:
                jmq jmqVar2 = (jmq) obj;
                String strD3 = ((qop) jmqVar2.a).d();
                m0q m0qVar = (m0q) jmqVar2.b;
                lzn0 lzn0Var2 = (lzn0) m0qVar.a.i.get();
                c8o.l(lzn0Var2);
                ktv ktvVar2 = (ktv) m0qVar.a.n6.get();
                c8o.l(ktvVar2);
                return new yup0(strD3, lzn0Var2, ktvVar2);
            case 5:
                return u1n0.z((q7r0) ((lbq) obj).b);
            case 6:
                return new ypq(this);
            case 7:
                Map map = ((n67) ((k2q) obj).b).a;
                c8o.l(map);
                return new ya71(map);
            case 8:
                a1r0 a1r0Var = (a1r0) ((sh71) ((lbq) obj).b).a.get();
                c8o.l(a1r0Var);
                return new gjz(a1r0Var);
            case 9:
                return pzm.h((mos) ((ba91) ((a1q) obj).b).f.get());
            case 10:
                jbq jbqVar = (jbq) ((jmq) obj).c;
                tp91 tp91Var = (tp91) jbqVar.a.t7.get();
                c8o.l(tp91Var);
                teq teqVar = jbqVar.b;
                p3q p3qVar = (p3q) teqVar.m5.get();
                c8o.l(p3qVar);
                dg30 dg30Var = (dg30) teqVar.f.a;
                c8o.l(dg30Var);
                ywv0 ywv0VarA = p3qVar.a(dg30Var.e0());
                u3q u3qVar = (u3q) jbqVar.b.ng.get();
                c8o.l(u3qVar);
                return tp91Var.a(new pp91(u3qVar.a(), (qp91) null, 1, ywv0VarA, 78));
            case 11:
                return new vqq(this);
            case 12:
                return new arq(this);
            case 13:
                return new drq(this);
            case 14:
                return new erq(this);
            case 15:
                return new frq(this);
            case 16:
                return new grq(this);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new nrq(this);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new rrq(this);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new srq(this);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new qap(this, (byte) 1);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new vrq(this);
            case 22:
                return new wrq(this);
            case 23:
                return new xrq(this);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new zrq(this);
            case 25:
                luk lukVar = (luk) ((asq) obj).a.d;
                c8o.l(lukVar);
                return new vl4(false, false, lukVar);
            case 26:
                return new hpm0(fdb1.B((g420) ((bsq) obj).a.a.get()));
            case 27:
                return new esq(this);
            case 28:
                return new fsq(this);
            default:
                return new gsq(this);
        }
    }
}
