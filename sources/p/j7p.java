package p;

import android.content.Context;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j7p implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ j7p(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new i7p(this);
            case 1:
                return new k7p(this, (byte) 0);
            case 2:
                return new l7p(this, b2);
            case 3:
                return new m7p(this);
            case 4:
                return pzm.h((mos) ((jok) ((b6p) obj).b).d.get());
            case 5:
                r2r r2rVar = (r2r) ((lnl) ((d3p) obj).a).c.get();
                c8o.l(r2rVar);
                return new n1n0(r2rVar);
            case 6:
                return new j8p(this);
            case 7:
                t7p t7pVar = (t7p) obj;
                qop qopVar = (qop) t7pVar.c;
                lik1 lik1VarG = qopVar.g();
                c8c0 c8c0Var = qopVar.b;
                n6r0 n6r0Var = qopVar.c;
                c8o.l(n6r0Var);
                nzp nzpVar = (nzp) t7pVar.b;
                k781 k781Var = (k781) nzpVar.b.v4.get();
                c8o.l(k781Var);
                ssf1 ssf1Var = (ssf1) nzpVar.b.g6.get();
                c8o.l(ssf1Var);
                a6z a6zVar = (a6z) nzpVar.b.b.B.get();
                c8o.l(a6zVar);
                zma0 zma0Var = (zma0) nzpVar.b.J6.get();
                c8o.l(zma0Var);
                mp8 mp8VarR0 = nzpVar.b.r0();
                vgm vgmVar = (vgm) nzpVar.b.b.E.get();
                c8o.l(vgmVar);
                i4q i4qVar = (i4q) nzpVar.b.t2.get();
                c8o.l(i4qVar);
                xi90 xi90Var = ((zbt) t7pVar.a).c;
                waz0 waz0Var = (waz0) nzpVar.a.Kc.get();
                c8o.l(waz0Var);
                return new zi90(lik1VarG, c8c0Var, n6r0Var, k781Var, ssf1Var, a6zVar, zma0Var, mp8VarR0, vgmVar, i4qVar, xi90Var, waz0Var);
            case 8:
                vi2 vi2Var = ((u8p) obj).a;
                return new hum((Context) vi2Var.a.get(), (q8n) vi2Var.b.get());
            case 9:
                return pzm.h((mos) ((dsm) ((z2p) obj).b).b.get());
            case 10:
                x2p x2pVar = (x2p) obj;
                return new ldo(((qop) x2pVar.c).d(), ((uzp) x2pVar.d).b.I());
            case 11:
                return new hoc(((Boolean) ((i7d) obj).Z).booleanValue(), new goc(2131165613, 2131165614));
            case 12:
                return new d9p(this);
            case 13:
                r2r r2rVar2 = (r2r) ((x2o) ((z2p) obj).b).l.get();
                c8o.l(r2rVar2);
                return new n1n0(r2rVar2);
            case 14:
                return new x9p(this);
            case 15:
                return u1n0.z((q7r0) ((d3p) obj).a);
            case 16:
                s1r s1rVar = (s1r) ((lo9) ((z2p) obj).b).b;
                c8o.l(s1rVar);
                return s1rVar;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new qap(this, (byte) 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                l6s l6sVar = (l6s) ((d3p) obj).a;
                Context context = (Context) l6sVar.a;
                c8o.l(context);
                iz40 iz40Var = new iz40(context);
                jqt jqtVar = (jqt) l6sVar.b;
                c8o.l(jqtVar);
                t2j0 t2j0Var = (t2j0) l6sVar.c;
                c8o.l(t2j0Var);
                return new l6s(false, iz40Var, jqtVar, t2j0Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                pdu pduVar = (pdu) ((z2p) obj).b;
                zce0 zce0Var = (zce0) pduVar.a.get();
                c8o.l(zce0Var);
                s6b1 s6b1Var = (s6b1) pduVar.b.get();
                c8o.l(s6b1Var);
                return new cvf(zce0Var, s6b1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new mbp(this);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new pbp(this);
            case 22:
                t7p t7pVar2 = (t7p) obj;
                jbt jbtVar = (jbt) t7pVar2.b;
                d0r d0rVar = jbtVar.b;
                String strD = ((qop) t7pVar2.a).d();
                ozp ozpVar = (ozp) t7pVar2.c;
                kt91 kt91Var = (kt91) ozpVar.a.f8.get();
                c8o.l(kt91Var);
                vun vunVar = new vun(jbtVar.d, (byte) 12);
                spn spnVar = (spn) ozpVar.b.T8.get();
                c8o.l(spnVar);
                return new nl9(d0rVar, strD, kt91Var, vunVar, spnVar);
            case 23:
                t7p t7pVar3 = (t7p) obj;
                jbt jbtVar2 = (jbt) t7pVar3.c;
                d0r d0rVar2 = jbtVar2.b;
                String strD2 = ((qop) t7pVar3.a).d();
                nzp nzpVar2 = (nzp) t7pVar3.b;
                z6k0 z6k0Var = (z6k0) nzpVar2.b.Z5.get();
                c8o.l(z6k0Var);
                koc0 koc0Var = jbtVar2.d;
                luk lukVar = (luk) nzpVar2.a.L1.get();
                c8o.l(lukVar);
                m980 m980Var = new m980(new yx4(false, lukVar));
                mnk0 mnk0Var = (mnk0) nzpVar2.b.b6.get();
                c8o.l(mnk0Var);
                ktv ktvVar = (ktv) nzpVar2.b.n6.get();
                c8o.l(ktvVar);
                return new cm0(d0rVar2, strD2, z6k0Var, koc0Var, m980Var, mnk0Var, ktvVar, jbtVar2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new jcp(this);
            case 25:
                return u1n0.z((q7r0) ((d3p) obj).a);
            case 26:
                x2p x2pVar2 = (x2p) obj;
                kzp kzpVar = (kzp) x2pVar2.c;
                f1n0 f1n0Var = (f1n0) kzpVar.b.T2.get();
                c8o.l(f1n0Var);
                uu00 uu00Var = (uu00) kzpVar.a.a5.get();
                c8o.l(uu00Var);
                x6w x6wVar = new x6w(uu00Var);
                xgc xgcVar = new xgc((byte) 8);
                mdq mdqVar = (mdq) kzpVar.b.Mh.get();
                c8o.l(mdqVar);
                return new el9(f1n0Var, x6wVar, xgcVar, mdqVar, ((qbt) x2pVar2.d).a);
            case 27:
                t8u0 t8u0Var = (t8u0) ((qmr) ((z2p) obj).b).b;
                c8o.l(t8u0Var);
                return t8u0Var.a(new s98((byte) 1));
            case 28:
                x2p x2pVar3 = (x2p) obj;
                t8u0 t8u0Var2 = (t8u0) ((t2y) x2pVar3.c).g.get();
                c8o.l(t8u0Var2);
                return kmq0.x((q7r0) x2pVar3.d, t8u0Var2);
            default:
                return new odp(this, (byte) 1);
        }
    }
}
