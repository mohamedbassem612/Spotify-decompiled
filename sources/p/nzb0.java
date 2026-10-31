package p;

import android.R;
import android.content.Context;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsContainerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import spotify.playlist.esperanto.proto.CopyResponse;
import spotify.playlist.esperanto.proto.PlaylistContainsResponse;
import spotify.playlist.esperanto.proto.PlaylistItemSignalResponse;
import spotify.playlist.esperanto.proto.PlaylistModificationResponse;
import spotify.playlist.esperanto.proto.PlaylistSignalResponse;
import spotify.playlist.esperanto.proto.SignalStatusResult;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nzb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzb0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        byte b3 = 5;
        byte b4 = 0;
        byte b5 = 1;
        lnm lnmVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                pzb0 pzb0Var = (pzb0) obj;
                vf0 vf0Var = pzb0Var.a;
                mzb0 mzb0Var = new mzb0(pzb0Var, b4);
                mzb0 mzb0Var2 = new mzb0(pzb0Var, b5);
                jd11 jd11Var = rc11.a;
                return vf0Var.a(mzb0Var, mzb0Var2, jd11Var.b(String.class), jd11Var.b(tyb0.class));
            case 1:
                return new bk1((t0c0) obj, (byte) 25);
            case 2:
                return (i8h1) ((k2c0) obj).a.get();
            case 3:
                return ((View) ((n4c0) obj).a.get()).findViewById(2131429818);
            case 4:
                return Long.valueOf(((LibraryChipsContainerView) obj).getResources().getInteger(R.integer.config_shortAnimTime));
            case 5:
                m7c0 m7c0Var = (m7c0) obj;
                dvm1 dvm1Var = m7c0Var.e;
                return ((dvm1Var.a() && m7c0Var.d.getPackageManager().hasSystemFeature("com.google.desktop.gms")) || l7c0.a[dvm1Var.b().ordinal()] == 1) ? b7c0.b : b7c0.a;
            case 6:
                ccc0 ccc0Var = (ccc0) obj;
                x3h x3hVar = (x3h) ccc0Var.f.h();
                if (x3hVar != null) {
                    return x3hVar.a(ccc0Var.a.getResources());
                }
                return null;
            case 7:
                return new kpg0((xpw) ((ncc0) obj).h.get(), hyb0.X0);
            case 8:
                qjp qjpVar = (qjp) ((lop) obj).a.b;
                String strD = ((qop) qjpVar.b).d();
                kzp kzpVar = (kzp) qjpVar.c;
                z0t z0tVar = (z0t) kzpVar.a.wp.get();
                c8o.l(z0tVar);
                sb7 sb7Var = (sb7) kzpVar.b.V5.get();
                c8o.l(sb7Var);
                return new kpg0(new o9x(strD, z0tVar, sb7Var, (byte) 1), hyb0.d1);
            case 9:
                aec0 aec0Var = (aec0) obj;
                return new kpg0(aec0Var.a, new pdb0(aec0Var, (byte) 13));
            case 10:
                el9 el9Var = (el9) obj;
                return ((pop) el9Var.t).a(el9Var.b);
            case 11:
                k9k k9kVar = (k9k) ((oop) ((ka3) obj).d).a.c;
                d0r d0rVar = ((tbt) k9kVar.b).a;
                String strD2 = ((qop) k9kVar.c).d();
                daq daqVar = ((uzp) k9kVar.d).b;
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                luk lukVar = (luk) daqVar.L1.get();
                c8o.l(lukVar);
                return new xzq(new el9(d0rVar, strD2, context, new pp4(false, lukVar), (pop) ((jly0) k9kVar.e).get()), xdc0.X);
            case 12:
                return ((PlaylistContainsResponse) obj).n().o();
            case 13:
                return ((Context) ((fdc) obj).e).getString(2131960630);
            case 14:
                return ((PlaylistModificationResponse) obj).n();
            case 15:
                CopyResponse copyResponse = (CopyResponse) obj;
                return new yxc0(copyResponse.getUri(), copyResponse.n());
            case 16:
                Map mapN = ((PlaylistSignalResponse) obj).n();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapN.size()));
                for (Map.Entry entry : mapN.entrySet()) {
                    Object key = entry.getKey();
                    SignalStatusResult signalStatusResult = (SignalStatusResult) entry.getValue();
                    int statusCode = signalStatusResult.getStatusCode();
                    String statusDetails = signalStatusResult.getStatusDetails();
                    phc statusPayload = signalStatusResult.getStatusPayload();
                    if (statusPayload.isEmpty()) {
                        statusPayload = null;
                    }
                    linkedHashMap.put(key, new byc0(statusCode, statusDetails, statusPayload));
                }
                return linkedHashMap;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Map mapN2 = ((PlaylistItemSignalResponse) obj).n();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(mapN2.size()));
                for (Map.Entry entry2 : mapN2.entrySet()) {
                    Object key2 = entry2.getKey();
                    SignalStatusResult signalStatusResult2 = (SignalStatusResult) entry2.getValue();
                    int statusCode2 = signalStatusResult2.getStatusCode();
                    String statusDetails2 = signalStatusResult2.getStatusDetails();
                    phc statusPayload2 = signalStatusResult2.getStatusPayload();
                    if (statusPayload2.isEmpty()) {
                        statusPayload2 = null;
                    }
                    linkedHashMap2.put(key2, new byc0(statusCode2, statusDetails2, statusPayload2));
                }
                return linkedHashMap2;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (dts) ((ne) obj).b;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((h3d0) obj).c.a(ixb.c);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                q7d0 q7d0Var = (q7d0) obj;
                b431 b431Var = (b431) q7d0Var.h.getValue();
                p811 p811Var = new p811();
                return new kpg0(new br0(new jcp1(q7d0Var, p811Var)), new lb50(p811Var, q7d0Var, b431Var, (byte) 19));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                v7d0 v7d0Var = (v7d0) obj;
                zpp zppVar = v7d0Var.a;
                e9c0 e9c0Var = new e9c0(v7d0Var, lnmVar, b3);
                t7p t7pVar = (t7p) zppVar.a.b;
                return new xzq(new nm1(((jbt) t7pVar.b).b, ((qop) t7pVar.c).d(), e9c0Var, ((xzp) t7pVar.d).a.i2()), l1d0.T0);
            case 22:
                return new nu((ka3) obj);
            case 23:
                t7p t7pVar2 = (t7p) ((aqp) ((j1b) obj).e).a.b;
                d0r d0rVar2 = ((lbt) t7pVar2.b).a;
                String strD3 = ((qop) t7pVar2.c).d();
                ktv ktvVar = (ktv) ((b0q) t7pVar2.d).a.n6.get();
                c8o.l(ktvVar);
                return new kpg0(new ng20(d0rVar2, strD3, ktvVar), l1d0.U0);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (maa) ((ikp) ((j1b) obj).e).get();
            case 25:
                ((dt71) ((res) obj).h).a(rih1Var);
                return rih1Var;
            case 26:
                jcd0 jcd0Var = (jcd0) obj;
                return new b8d0((mr20) ((idd1) ((haa0) jcd0Var.c).d).getValue(), (gcd0) jcd0Var.b.get(), b5);
            case 27:
                haa0 haa0Var = (haa0) obj;
                return ((hgd0) haa0Var.c).d() ? new jff(((jed0) haa0Var.b).c(), b2) : new huz(Boolean.FALSE, (byte) 10);
            case 28:
                jed0 jed0Var = (jed0) obj;
                return ((q940) jed0Var.a.get()).a(jed0Var.b).b(p7h.M(new m9d0[]{l9d0.b, l9d0.f, l9d0.e, l9d0.d, l9d0.c}));
            default:
                hgd0 hgd0Var = (hgd0) obj;
                luk lukVar2 = hgd0Var.t;
                if (lukVar2 != null) {
                    return lukVar2.e(new c44(hgd0Var, (byte) 12));
                }
                return null;
        }
    }
}
