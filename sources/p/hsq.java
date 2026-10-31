package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hsq implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ hsq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                lzn0 lzn0Var = (lzn0) ((ibq) ((lbq) obj).b).a.i.get();
                c8o.l(lzn0Var);
                return new f330(lzn0Var, (byte) 2);
            case 1:
                return u1n0.z((q7r0) ((a1q) obj).b);
            case 2:
                return pzm.h((mos) ((ryd1) ((k2q) obj).b).b.get());
            case 3:
                return new ysq(this);
            case 4:
                return new zsq(this);
            case 5:
                return new atq(this, (byte) 0);
            case 6:
                return new btq(this);
            case 7:
                return new dtq(this);
            case 8:
                return u1n0.z((q7r0) ((a1q) obj).b);
            case 9:
                return ((qop) ((k2q) obj).b).f();
            case 10:
                jmq jmqVar = (jmq) obj;
                return new yg01(((qop) jmqVar.a).d(), ((m0q) jmqVar.b).a.i3(), (byte) 1);
            case 11:
                pch1 pch1Var = (pch1) ((xzp) ((lbq) obj).b).a.m8.get();
                c8o.l(pch1Var);
                return pch1Var;
            case 12:
                return u1n0.z((q7r0) ((jnq) obj).b);
            case 13:
                return pzm.h((mos) ((hct) ((a1q) obj).b).f.get());
            case 14:
                l3q l3qVar = (l3q) ((k2q) obj).b;
                agc0 agc0Var = (agc0) l3qVar.a.B7.get();
                c8o.l(agc0Var);
                drp0 drp0Var = (drp0) l3qVar.b.G4.get();
                c8o.l(drp0Var);
                return new smp0(agc0Var, drp0Var);
            case 15:
                return pzm.h((mos) ((o0i1) ((lbq) obj).b).e.get());
            case 16:
                return pzm.h((mos) ((v8i1) ((a1q) obj).b).b.get());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ywv0 ywv0Var = (ywv0) ((k2q) obj).b;
                mr20 mr20Var = (mr20) ywv0Var.g;
                c8o.l(mr20Var);
                q8n q8nVar = (q8n) ywv0Var.i;
                c8o.l(q8nVar);
                fn5 fn5Var = new fn5(mr20Var, q8nVar);
                RetrofitMaker retrofitMaker = (RetrofitMaker) ywv0Var.f;
                c8o.l(retrofitMaker);
                gqb0 gqb0Var = new gqb0(new xq81((dmi1) retrofitMaker.createWebgateService(dmi1.class, "android-usersnearby-data-impl"), (byte) 27), (byte) 13);
                uz5 uz5Var = (uz5) ywv0Var.d;
                c8o.l(uz5Var);
                fwn0 fwn0Var = (fwn0) ywv0Var.e;
                c8o.l(fwn0Var);
                fna fnaVar = new fna(new xid(uz5Var, fwn0Var, (byte) 11), (byte) 12);
                pni1 pni1Var = (pni1) ywv0Var.b;
                c8o.l(pni1Var);
                svb0 svb0Var = new svb0(fnaVar, pni1Var, (byte) 4);
                q8n q8nVar2 = (q8n) ywv0Var.h;
                c8o.l(q8nVar2);
                b0o0 b0o0Var = new b0o0(gqb0Var, svb0Var, q8nVar2);
                mbu mbuVar = (mbu) ywv0Var.a;
                c8o.l(mbuVar);
                q8n q8nVar3 = (q8n) ywv0Var.i;
                c8o.l(q8nVar3);
                db9 db9Var = new db9(mbuVar, q8nVar3);
                hes hesVar = (hes) ywv0Var.c;
                c8o.l(hesVar);
                q8n q8nVar4 = (q8n) ywv0Var.i;
                c8o.l(q8nVar4);
                return new uzn0(fn5Var, b0o0Var, db9Var, new rni1(hesVar, q8nVar4));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                sgj1 sgj1Var = (sgj1) ((lbq) obj).b;
                return new luq(new jij1(sgj1Var.c, sgj1Var.b, sgj1Var.a, sgj1Var.d, sgj1Var.e, sgj1Var.f, sgj1Var.g, sgj1Var.h));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                jnq jnqVar = (jnq) obj;
                return new yxb0(((jbt) jnqVar.b).b, ((qop) jnqVar.a).d(), jnqVar.k());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return pzm.h((mos) ((vjj1) ((a1q) obj).b).a.get());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                jij1 jij1Var = (jij1) ((k2q) obj).b;
                return new luq(new jij1(jij1Var.a, jij1Var.c, jij1Var.b, jij1Var.d, jij1Var.e, jij1Var.f, jij1Var.g, jij1Var.h));
            case 22:
                sgj1 sgj1Var2 = (sgj1) ((lbq) obj).b;
                return new luq(new jij1(sgj1Var2.c, sgj1Var2.b, sgj1Var2.a, sgj1Var2.d, sgj1Var2.e, sgj1Var2.f, sgj1Var2.g, sgj1Var2.h));
            case 23:
                return u1n0.z((q7r0) ((a1q) obj).b);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new s1p(this, (byte) 8);
            case 25:
                return new evq(this);
            case 26:
                j4m1 j4m1Var = (j4m1) ((a1q) obj).b;
                xrc0 xrc0Var = (xrc0) j4m1Var.f.get();
                c8o.l(xrc0Var);
                h3y0 h3y0Var = (h3y0) j4m1Var.g.get();
                c8o.l(h3y0Var);
                xpv0 xpv0Var = new xpv0((byte) 18);
                y4m1 y4m1Var = (y4m1) j4m1Var.h.get();
                c8o.l(y4m1Var);
                u6y0 u6y0Var = (u6y0) j4m1Var.i.get();
                c8o.l(u6y0Var);
                ov20 ov20Var = (ov20) j4m1Var.j.get();
                c8o.l(ov20Var);
                iz31 iz31Var = (iz31) j4m1Var.k.get();
                c8o.l(iz31Var);
                luk lukVar = (luk) j4m1Var.b.get();
                c8o.l(lukVar);
                hj4 hj4Var = new hj4(gj4.b, lukVar);
                u6y0 u6y0Var2 = u6y0Var.X;
                fns fnsVar = igu.a;
                return new i2m1(xrc0Var, h3y0Var, xpv0Var, y4m1Var, u6y0Var2, ov20Var, iz31Var, pyf0.a, hj4Var.a());
            case 27:
                jmq jmqVar2 = (jmq) obj;
                String strD = ((qop) jmqVar2.a).d();
                k3q k3qVar = (k3q) jmqVar2.b;
                y4m1 y4m1Var2 = (y4m1) k3qVar.b.Le.get();
                c8o.l(y4m1Var2);
                tp91 tp91Var = (tp91) k3qVar.a.t7.get();
                c8o.l(tp91Var);
                hj91 hj91VarA = tp91Var.a(new pp91((nn61) null, (qp91) null, 1, (ywv0) null, 103));
                zwz0 zwz0Var = (zwz0) k3qVar.a.U1.get();
                c8o.l(zwz0Var);
                return new suh1(strD, y4m1Var2, hj91VarA, zwz0Var);
            case 28:
                hwb hwbVar = new hwb((byte) 10);
                jmq jmqVar3 = (jmq) obj;
                ujq ujqVar = (ujq) jmqVar3.a;
                lzn0 lzn0Var2 = (lzn0) ujqVar.b.i.get();
                c8o.l(lzn0Var2);
                v5n v5nVar = (v5n) ujqVar.a.Pb.get();
                c8o.l(v5nVar);
                String str = ((qop) jmqVar3.b).e;
                c8o.l(str);
                daq daqVar = ujqVar.a;
                gw70 gw70Var = (gw70) daqVar.d8.get();
                c8o.l(gw70Var);
                nww0 nww0Var = (nww0) daqVar.Jn.get();
                c8o.l(nww0Var);
                return new rwj(hwbVar, lzn0Var2, v5nVar, str, new af10(gw70Var, nww0Var));
            default:
                return ((yzp) ((k2q) obj).b).a.h3();
        }
    }
}
