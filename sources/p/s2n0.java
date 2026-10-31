package p;

import android.content.Context;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2n0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2n0(mnn0 mnn0Var, hnn0 hnn0Var, boolean z) {
        super(0);
        this.a = (byte) 11;
        this.b = mnn0Var;
        this.c = hnn0Var;
    }

    public final Object invoke() {
        cbn0 cbn0Var;
        byte b = this.a;
        byte b2 = 11;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qjp qjpVar = (qjp) ((gtp) obj2).a.b;
                d0r d0rVar = ((gl90) qjpVar.b).b;
                vbs vbsVar = (vbs) ((y0q) qjpVar.c).b.wf.get();
                c8o.l(vbsVar);
                return new xzq(new o2n0(d0rVar, vbsVar), new nrj0(obj, (byte) 8));
            case 1:
                itp itpVar = (itp) ((htp) obj2).a.b;
                return new xzq(new qlb(itpVar.a.b, itpVar.b.d(), (byte) 11), new nrj0(obj, (byte) 9));
            case 2:
                j3n0 j3n0Var = (j3n0) obj2;
                String str = j3n0Var.c;
                if (str != null) {
                    ((iu30) obj).invoke(new i3n0(str, j3n0Var.d));
                }
                return rih1Var;
            case 3:
                return new xzq(new jd6(((ltp) ((ktp) obj2).a.b).a.b, (byte) 15), new nrj0(obj, (byte) 10));
            case 4:
                itp itpVar2 = (itp) ((mtp) obj2).a.b;
                return new xzq(new qlb(itpVar2.a.b, itpVar2.b.d(), (byte) 12), new nrj0((b3n0) obj, b2));
            case 5:
                return new kpg0((xpw) ((i7n0) obj2).a.invoke((oud) obj), k4n0.V0);
            case 6:
                e7n0 e7n0Var = (h7n0) obj;
                ((iu30) obj2).invoke(new a7n0(e7n0Var.a, e7n0Var.b, e7n0Var.c));
                return rih1Var;
            case 7:
                ((ven0) obj2).setValue(Boolean.FALSE);
                ydh.m((hdn0) obj, 1);
                return rih1Var;
            case 8:
                r091 r091Var = (r091) ((tob1) obj).getValue();
                if (r091Var != null && (cbn0Var = (cbn0) obj2) != null) {
                    if (cbn0Var.a) {
                        r091Var.k();
                    } else {
                        r091Var.c();
                    }
                }
                return rih1Var;
            case 9:
                h680 h680Var = (h680) obj2;
                bcl1.f((bcl1) h680Var.b, ((o0i) obj).e, "mute_button", (String) null, (String) null, new xkm0(h680Var, (byte) 18), 12);
                fal1 fal1Var = (fal1) h680Var.c;
                fal1Var.a(!((Boolean) fal1Var.d.getValue()).booleanValue());
                return rih1Var;
            case 10:
                ((iu30) obj2).invoke((jgn0) obj);
                return rih1Var;
            case 11:
                ((mnn0) obj2).f((hnn0) obj);
                return rih1Var;
            case 12:
                ven0 ven0Var = (ven0) obj;
                if (((Boolean) ven0Var.getValue()).booleanValue() && !((stn0) obj2).a.isEmpty()) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 13:
                ((stn0) obj2).d.invoke((btn0) obj);
                return rih1Var;
            case 14:
                ((iu30) obj2).invoke((lvn0) obj);
                return rih1Var;
            case 15:
                ((twn0) obj2).j.e((son0) obj);
                return rih1Var;
            case 16:
                ((kx70) obj2).invoke();
                ((Function0) obj).invoke();
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((iu30) obj2).invoke(new n0g0(0, (a761) obj, a761.class, "popFragmentInCurrentOperation", "popFragmentInCurrentOperation()V", 0, (byte) 27));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                r1q0 r1q0Var = (r1q0) obj2;
                if (r1q0Var.g) {
                    r1q0Var.d();
                } else {
                    ((Function0) obj).invoke();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((bf30) obj2).a = (xnn0) obj;
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (rdo0) ((iu30) obj2).invoke((bf30) obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((tbr0) obj2).a(new y231(tio0.a));
                qio0 qio0Var = (qio0) obj;
                qio0Var.e.b(qio0Var.a.a, true);
                return rih1Var;
            case 22:
                ((ihm) obj2).d.invoke((tv80) obj);
                return rih1Var;
            case 23:
                y1c1 y1c1Var = (y1c1) obj;
                return w3p1.q(new j9n0((qfv) obj2, y1c1Var, (byte) 17), new dmo0(y1c1Var, (byte) 0), ofo0.t, (o8n) null, new dmo0(y1c1Var, (byte) 1), 8);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                yso0.d((yso0) obj2, (ven0) obj);
                return rih1Var;
            case 25:
                return Integer.valueOf(((m1p0) obj2).b ? ((Context) obj).getResources().getDimensionPixelSize(2131166044) : 0);
            case 26:
                return new mu2((uu00) ((edp0) obj2).invoke(), (q8n) ((edp0) obj).invoke());
            case 27:
                return new km0((ypd) ((qbp0) obj2).invoke(), ((obp0) obj).b.S1);
            case 28:
                return new w((sfr) ((vcp0) obj2).invoke(), (dpb) ((vcp0) obj).invoke());
            default:
                return new km0((itz) ((vcp0) obj2).invoke(), (y2g0) ((vcp0) obj).invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2n0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
