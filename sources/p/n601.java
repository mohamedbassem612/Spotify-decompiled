package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeCallbackRouter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n601 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n601(iu30 iu30Var, byte b) {
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
                y301 y301Var = (y301) obj;
                if (y301Var.equals(t301.a) || y301Var.equals(u301.a)) {
                    iu30Var.invoke(x001.a);
                }
                return rih1Var;
            case 1:
                iu30Var.invoke(new od01((String) obj));
                return rih1Var;
            case 2:
                iu30Var.invoke(Integer.valueOf(yoi1.p((int) ((Number) obj).floatValue(), 0, 7)));
                return rih1Var;
            case 3:
                iu30Var.invoke(new qk01(((Number) obj).intValue()));
                return rih1Var;
            case 4:
                iu30Var.invoke(new vk01(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 5:
                iu30Var.invoke(new bh11(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 6:
                iu30Var.invoke((r691) obj);
                return rih1Var;
            case 7:
                dr11 dr11Var = (dr11) iu30Var.invoke(obj);
                return new qvc0(dr11Var.a, dr11Var.b, dr11Var.c, dr11Var.d);
            case 8:
                fe00 fe00Var = (fe00) obj;
                if (!fe00Var.equals(be00.a) && !fe00Var.equals(ce00.a) && !fe00Var.equals(zd00.a) && !fe00Var.equals(ae00.a)) {
                    iu30Var.invoke(fe00Var);
                }
                return rih1Var;
            case 9:
                if (((gki0) obj) instanceof gki0) {
                    iu30Var.invoke(u521.a);
                }
                return rih1Var;
            case 10:
                iu30Var.invoke(new uf21(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 11:
                iu30Var.invoke(new yg21((t7q0) obj));
                return rih1Var;
            case 12:
                iu30Var.invoke(new ah21((wol) obj));
                return rih1Var;
            case 13:
                iu30Var.invoke((hif0) obj);
                return rih1Var;
            case 14:
                return (Integer) iu30Var.invoke(((jh5) obj).b);
            case 15:
                int iOrdinal = ((piw0) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var.invoke(wt31.a);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(yt31.a);
                }
                return rih1Var;
            case 16:
                return iu30Var.invoke(obj);
            case 17:
                iu30Var.invoke(new g251((String) obj));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b261.g((e261) obj, (String) null, new wg31(iu30Var, (byte) 13));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                iu30Var.invoke(tcv.a);
                return rih1Var;
            case 20:
                iu30Var.invoke(Boolean.valueOf(((wz20) obj).b()));
                return rih1Var;
            case 21:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 22:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 23:
                iu30Var.invoke(new js51(((Number) obj).longValue()));
                return rih1Var;
            case 24:
                iu30Var.invoke(Long.valueOf(((Number) obj).longValue()));
                return rih1Var;
            case 25:
                iu30Var.invoke(new xki0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 26:
                List<mmr0> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (mmr0 mmr0Var : list) {
                    jh5 jh5Var = (jh5) mmr0Var.a;
                    arrayList.add(new mmr0(jh5Var.b, (k3r) mmr0Var.b));
                }
                iu30Var.invoke(arrayList);
                return rih1Var;
            case 27:
                iu30Var.invoke(new RemoteNativeCallbackRouter(((mlv0) obj).a().u().getRemoteNativeRouter()));
                return rih1Var;
            case 28:
                return (w7h1) iu30Var.invoke(new nwl0((owl0) obj));
            default:
                return (w7h1) iu30Var.invoke(new nwl0((owl0) obj));
        }
    }
}
