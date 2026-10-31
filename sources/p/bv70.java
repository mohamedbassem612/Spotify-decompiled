package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bv70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv70(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke((z2s) obj);
                return rih1Var;
            case 1:
                iu30Var.invoke(new j880((haw0) obj));
                return rih1Var;
            case 2:
                iu30Var.invoke(new c10((String) null, 111, (String) null, (String) null, false, (String) obj));
                return rih1Var;
            case 3:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 4:
                iu30Var.invoke((p60) obj);
                return rih1Var;
            case 5:
                iu30Var.invoke(yf80.a);
                return rih1Var;
            case 6:
                return new go70(iu30Var.invoke(obj));
            case 7:
                if (((wz20) obj).b()) {
                    iu30Var.invoke(qi80.a);
                }
                return rih1Var;
            case 8:
                iu30Var.invoke(new um80((String) obj));
                return rih1Var;
            case 9:
                iu30Var.invoke(new xm80((cl80) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(new zm80((String) obj));
                return rih1Var;
            case 11:
                iu30Var.invoke(new cy80((String) obj));
                return rih1Var;
            case 12:
                hxb hxbVar = (hxb) obj;
                if ((hxbVar instanceof gxb) || (hxbVar instanceof fxb)) {
                    iu30Var.invoke(wp90.c);
                } else if (!(hxbVar instanceof exb)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 13:
                ((Boolean) obj).getClass();
                iu30Var.invoke(vr90.a);
                return rih1Var;
            case 14:
                ((Boolean) obj).getClass();
                iu30Var.invoke(vr90.b);
                return rih1Var;
            case 15:
                hxb hxbVar2 = (hxb) obj;
                gxb gxbVar = hxbVar2 instanceof gxb ? (gxb) hxbVar2 : null;
                iu30Var.invoke(new kt90((gxbVar != null ? gxbVar.a : 0) == 2));
                return rih1Var;
            case 16:
                ((Boolean) obj).getClass();
                iu30Var.invoke(zy90.a);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Boolean) obj).getClass();
                iu30Var.invoke(zy90.b);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                iu30Var.invoke(new v5a0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hxb hxbVar3 = (hxb) obj;
                if (hxbVar3 instanceof gxb) {
                    iu30Var.invoke(cba0.a);
                } else if (hxbVar3 instanceof fxb) {
                    iu30Var.invoke(fba0.a);
                } else if (!(hxbVar3 instanceof exb)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                iu30Var.invoke(new bba0((no90) obj));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                iu30Var.invoke(new dba0((no90) obj));
                return rih1Var;
            case 22:
                hxb hxbVar4 = (hxb) obj;
                if (hxbVar4 instanceof gxb) {
                    iu30Var.invoke(rca0.a);
                } else if (hxbVar4 instanceof fxb) {
                    iu30Var.invoke(sca0.a);
                } else if (!(hxbVar4 instanceof exb)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 23:
                hxb hxbVar5 = (hxb) obj;
                if (hxbVar5 instanceof gxb) {
                    iu30Var.invoke(pda0.a);
                } else if (hxbVar5 instanceof fxb) {
                    iu30Var.invoke(qda0.a);
                } else if (!(hxbVar5 instanceof exb)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((qtr) obj).b(new jaz(iu30Var, (lnm) null, (byte) 9));
                return rih1Var;
            case 25:
                iu30Var.invoke(new kra0((iys0) obj));
                return rih1Var;
            case 26:
                iu30Var.invoke(new cra0((tv80) obj));
                return rih1Var;
            case 27:
                iu30Var.invoke(new l200(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 28:
                iu30Var.invoke(new t100(((Boolean) obj).booleanValue()));
                return rih1Var;
            default:
                iu30Var.invoke(new j200((String) obj));
                return rih1Var;
        }
    }
}
