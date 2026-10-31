package p;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r7j0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7j0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01ec  */
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                kby kbyVar = ((cxc0) obj).f;
                return new f7j0(kbyVar.b, kbyVar.d.a(1), (String) ((rb3) this.b).d);
            case 1:
                cas casVar = (a7m0) obj;
                casVar.a = m2j0.h;
                ldo ldoVar = (ldo) this.b;
                casVar.d = new wcj0(ldoVar, (byte) 0);
                casVar.e = new wcj0(ldoVar, (byte) 1);
                return rih1.a;
            case 2:
                return yoi1.g(((hj91) this.b).d(((xej0) obj).a).map(b610.O0).distinctUntilChanged());
            case 3:
                String str = (String) obj;
                return str.length() == 0 ? "" : nhc1.W(((rjj0) this.b).a, "{id}", str);
            case 4:
                rwj rwjVar = (rwj) this.b;
                return dzo1.h((w6e0) rwjVar.f, obj, (tlj0) rwjVar.g);
            case 5:
                ug3 ug3Var = (ug3) this.b;
                return dzo1.h((w6e0) ug3Var.d, obj, (tlj0) ug3Var.e);
            case 6:
                return Integer.valueOf(((MetadataRow) this.b).indexOfChild((View) obj));
            case 7:
                fmj0 fmj0Var = (fmj0) obj;
                fju fjuVar = fmj0Var.b;
                lmj0 lmj0Var = (lmj0) this.b;
                d0r d0rVar = lmj0Var.a;
                o3r o3rVar = lmj0Var.h;
                String str2 = fmj0Var.a;
                ay8 ay8VarF = d3p1.F(d0rVar, o3rVar, str2);
                ay8 ay8VarF2 = d3p1.F(d0rVar, lmj0.g(str2) ? lmj0Var.t : lmj0Var.i, str2);
                c1v0 c1v0Var = new c1v0(lmj0Var.c.b(str2, (ymd0) null), (byte) 7);
                Set set = s4b1.f;
                ay8 ay8VarF3 = uic.h(str2, new blc0[]{blc0.Pg, blc0.ld, blc0.Qg, blc0.Rg, blc0.Vg, blc0.z6}) ? d3p1.F(d0rVar, lmj0Var.X, str2) : new huz((Object) null, (byte) 10);
                String str3 = fjuVar.j;
                p1e0 p1e0Var = str3 != null ? new p1e0(d3p1.F(d0rVar, lmj0Var.Y, str3), (byte) 16) : new huz(Boolean.FALSE, (byte) 10);
                huz huzVar = fjuVar.k;
                if (huzVar == null) {
                    huzVar = new huz("", (byte) 10);
                }
                huz huzVar2 = fjuVar.l;
                if (huzVar2 == null) {
                    huzVar2 = new huz("", (byte) 10);
                }
                return new x010(h5p1.r(ay8VarF, ay8VarF2, c1v0Var, ay8VarF3, new f3(5, (lnm) null, (byte) 16)), h5p1.r(p1e0Var, huzVar, huzVar2, fjuVar.m ? new p1e0(d3p1.F(d0rVar, ((vl90) lmj0Var.g.getValue()).c, new pl90(str2)), (byte) 15) : new huz(Boolean.FALSE, (byte) 10), new cxl(5, null, (byte) 2)), new t83(lmj0Var, fmj0Var, (lnm) null, (byte) 7), (byte) 1);
            case 8:
                return new smj0(((dx0) this.b).h((rmj0) obj, true, false, false, false, (afv0) null));
            case 9:
                bs0 bs0Var = (bs0) this.b;
                return d3p1.F((d0r) bs0Var.d, (o3r) bs0Var.b, obj);
            case 10:
                int iIntValue = ((Number) obj).intValue();
                qoj0 qoj0Var = (qoj0) this.b;
                nwj1 nwj1Var = qoj0Var.a;
                svj1 svj1VarA = nwj1Var.a(iIntValue);
                qoj0Var.b.k(svj1VarA, iIntValue, 2);
                bma1 bma1Var = nwj1.e;
                hma1 hma1VarEdit = nwj1Var.a.edit();
                hma1VarEdit.b(bma1Var, xvj1.e(svj1VarA.a));
                hma1VarEdit.g();
                nwj1Var.c.accept(svj1VarA);
                return rih1.a;
            case 11:
                return (uov0) orj0.b(((zov0) ((orj0) this.b).c).e("ro.odm.csc.spotify.music.referrerid"), new fki0((String) obj, (byte) 5));
            case 12:
                return (Boolean) ((r7j0) this.b).invoke((mmr0) obj);
            case 13:
                mmr0 mmr0Var = (mmr0) obj;
                ml5 ml5Var = ((pkc) this.b).a;
                gmc gmcVar = (gmc) mmr0Var.a;
                if (((a5j0) mmr0Var.b) instanceof z4j0) {
                    String str4 = gmcVar.b;
                    TriggerType triggerType = gmcVar.c;
                    nlc nlcVar = ml5Var.a;
                    if (triggerType == TriggerType.URI && (nlcVar instanceof nlc) && !ihc1.j0(str4, nlcVar.a)) {
                        z = true;
                    } else {
                        String str5 = gmcVar.b;
                        zlc zlcVar = ml5Var.b;
                        if (triggerType == TriggerType.PLAYBACK_STARTED && (zlcVar instanceof zlc) && !ihc1.j0(str5, zlcVar.a)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                return new dnl0((fjl0) ((p410) this.b).h);
            case 15:
                return new enl0(((huj0) this.b).f);
            case 16:
                return (qvc0) ((fdc) this.b).e;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((qtr) obj).b(new js((exj0) this.b, (lnm) null, (byte) 15));
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new cnl0((fjl0) ((p410) this.b).h);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((qyj0) this.b).f.invoke((k4k0) obj);
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new rxc0(((p7k0) this.b).b);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                cas casVar2 = (a7m0) obj;
                casVar2.a = qlk0.X;
                casVar2.a(ook0.g, ook0.i);
                casVar2.d = z7i0.X0;
                casVar2.e = new u6j0((Scheduler) this.b, (byte) 1);
                return rih1.a;
            case 22:
                cas casVar3 = (a7m0) obj;
                casVar3.d = z7i0.Y0;
                casVar3.e = z7i0.Z0;
                casVar3.c = (lud) this.b;
                casVar3.a(ook0.t, ook0.X);
                return rih1.a;
            case 23:
                ((PublishSubject) this.b).onNext((j2l1) obj);
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Function0 function0 = (Function0) obj;
                sam0 sam0Var = (sam0) this.b;
                sam0Var.f.a(sam0Var.d);
                long jC = ((sam0) this.b).f.c();
                sam0 sam0Var2 = (sam0) this.b;
                tif1 tif1Var = sam0Var2.c;
                String strConcat = sam0Var2.a.concat("_component");
                sam0 sam0Var3 = (sam0) this.b;
                try {
                    tif1Var.e(2, strConcat, "qss");
                    xbm xbmVar = (xbm) sam0Var3.g.b(sam0Var3.a, function0);
                    tif1Var.f(strConcat, "qss");
                    long jC2 = ((sam0) this.b).f.c() - jC;
                    klm klmVarW = xbmVar.W();
                    String strConcat2 = ((sam0) this.b).a.concat("_component");
                    klmVarW.getClass();
                    klmVarW.g = new zlb1(new sfh0(jC, jC2, strConcat2, 4));
                    return xbmVar;
                } catch (Throwable th) {
                    tif1Var.f(strConcat, "qss");
                    throw th;
                }
            case 25:
                Window window = (Window) obj;
                svh0 svh0Var = (svh0) this.b;
                Window window2 = (Window) svh0Var.c;
                if (window2 != null && !window2.equals(window)) {
                    Window.Callback callback = window2.getCallback();
                    Dialog dialog = callback instanceof Dialog ? (Dialog) callback : null;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
                svh0Var.c = window;
                svh0Var.b = true;
                return rih1.a;
            case 26:
                h141 h141Var = (h141) this.b;
                if (!u890.j(obj, h141Var.getState())) {
                    h141Var.e(obj);
                }
                return rih1.a;
            case 27:
                kjm0 kjm0Var = (kjm0) this.b;
                int i = kjm0Var.d;
                if (i == 0) {
                    kjm0Var.d = i + 1;
                    return new k6r(kjm0Var, (byte) 29);
                }
                eg.m("You may only have one onEvent handler!");
                return null;
            case 28:
                jd6 jd6Var = (jd6) this.b;
                return new p1e0(d3p1.H((d0r) jd6Var.b, jd6Var.c, (yjm0) obj), (byte) 22);
            default:
                return (zob1) ((ng20) this.b).b;
        }
    }
}
