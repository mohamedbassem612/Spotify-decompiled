package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v2y extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2y(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        rly rlyVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new c3y(((t3y) obj).h()));
                return rih1Var;
            case 1:
                iu30Var.invoke(new h9y((d9h) obj));
                return rih1Var;
            case 2:
                iu30Var.invoke(new k9y((ax70) obj));
                return rih1Var;
            case 3:
                iu30Var.invoke(new n9y((nxb1) obj));
                return rih1Var;
            case 4:
                iu30Var.invoke(new j9y((chf0) obj));
                return rih1Var;
            case 5:
                elb0 elb0Var = (elb0) obj;
                iu30Var.invoke(nho1.v(elb0Var).M(elb0Var, true));
                return rih1Var;
            case 6:
                long j = ((yr80) obj).a;
                return new yr80((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) ((Number) iu30Var.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32));
            case 7:
                long j2 = ((yr80) obj).a;
                return new yr80((((long) ((int) (j2 & 4294967295L))) & 4294967295L) | (((long) ((Number) iu30Var.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue()) << 32));
            case 8:
                return new qr80(((long) ((Number) iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a >> 32)))).intValue()) << 32);
            case 9:
                return new qr80(((long) ((Number) iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a >> 32)))).intValue()) << 32);
            case 10:
                return new qr80(((long) ((Number) iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a & 4294967295L)))).intValue()) & 4294967295L);
            case 11:
                b07 b07Var = (f07) obj;
                if (b07Var instanceof b07) {
                    rlyVar = new rly(b07Var.a);
                } else if (b07Var.equals(c07.a)) {
                    rlyVar = sly.a;
                } else {
                    if (!b07Var.equals(e07.a)) {
                        eg.o();
                        return null;
                    }
                    rlyVar = sly.b;
                }
                iu30Var.invoke(rlyVar);
                return rih1Var;
            case 12:
                ((Boolean) obj).getClass();
                iu30Var.invoke(kpy.f);
                return rih1Var;
            case 13:
                if (m3z.a[((wez0) obj).ordinal()] == 1) {
                    iu30Var.invoke(t9z.b);
                }
                return rih1Var;
            case 14:
                ljy ljyVar = (ljy) obj;
                if (ljyVar instanceof ijy) {
                    iu30Var.invoke(t9z.a);
                } else if (ljyVar instanceof hjy) {
                    iu30Var.invoke(t9z.c);
                } else if (ljyVar instanceof gjy) {
                    iu30Var.invoke(t9z.d);
                }
                return rih1Var;
            case 15:
                ((qtr) obj).b(new jaz(iu30Var, (lnm) null, (byte) 0));
                return rih1Var;
            case 16:
                iu30Var.invoke(new abz((yaz) obj));
                return rih1Var;
            case 17:
                iu30Var.invoke(y800.b);
                return rih1Var;
            case 18:
                iu30Var.invoke(kod0.a);
                return rih1Var;
            case 19:
                iu30Var.invoke(new rr00(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 20:
                return new j3r(iu30Var.invoke(obj));
            case 21:
                List list = ph10.a;
                List<mmr0> list2 = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (mmr0 mmr0Var : list2) {
                    qvc0 qvc0Var = (qvc0) mmr0Var.a;
                    k3r k3rVar = (k3r) mmr0Var.b;
                    arrayList.add((ph10.a(qvc0Var.a) && (k3rVar instanceof h3r)) ? new mmr0(qvc0Var, new j3r(z6x.a)) : new mmr0(qvc0Var, k3rVar));
                }
                iu30Var.invoke(arrayList);
                return rih1Var;
            case 22:
                gxb gxbVar = (hxb) obj;
                if (gxbVar instanceof gxb) {
                    iu30Var.invoke(new uj10(gxbVar.a));
                } else if (!gxbVar.equals(exb.a) && !gxbVar.equals(fxb.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                iu30Var.invoke(new pv10((String) obj));
                return rih1Var;
            case 24:
                iu30Var.invoke(new uu10((String) obj));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(new kv10((String) obj));
                return rih1Var;
            case 26:
                iu30Var.invoke(new dv10(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 27:
                iu30Var.invoke(new uu10((String) obj));
                return rih1Var;
            case 28:
                iu30Var.invoke((String) obj);
                return rih1Var;
            default:
                iu30Var.invoke(new x620((qa20) obj));
                return rih1Var;
        }
    }
}
