package p;

import com.spotify.cosmos.servicebasedrouter.RemoteNativeCallbackRouter;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ib2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib2(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jb2 jb2Var = jb2.c;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(jb2Var);
                break;
            case 1:
                iu30Var.invoke(jb2Var);
                break;
            case 2:
                iu30Var.invoke(jb2Var);
                break;
            case 3:
                iu30Var.invoke(new qd2((gax) obj));
                break;
            case 4:
                iu30Var.invoke((sg2) obj);
                break;
            case 5:
                iu30Var.invoke(new lg2((String) obj));
                break;
            case 6:
                iu30Var.invoke(new og2((tg2) obj));
                break;
            case 7:
                iu30Var.invoke(new rg2((String) obj));
                break;
            case 8:
                iu30Var.invoke((String) obj);
                break;
            case 9:
                iu30Var.invoke((String) obj);
                break;
            case 10:
                iu30Var.invoke(y33.a);
                break;
            case 11:
                if (((ezn) obj).equals(czn.a)) {
                    iu30Var.invoke(s93.a);
                }
                break;
            case 12:
                ((Boolean) obj).getClass();
                iu30Var.invoke(nc3.a);
                break;
            case 13:
                ((qtr) obj).b(new k1(iu30Var, (lnm) null, (byte) 2));
                break;
            case 14:
                iu30Var.invoke(jr3.a);
                break;
            case 15:
                iu30Var.invoke(new ir3(((Boolean) obj).booleanValue()));
                break;
            case 16:
                iu30Var.invoke(new yy5((hxb) obj));
                break;
            case 17:
                iu30Var.invoke(new l76((String) obj));
                break;
            case 18:
                iu30Var.invoke(new wn7(!((Boolean) obj).booleanValue()));
                break;
            case 19:
                if (((ljy) obj) instanceof ijy) {
                    iu30Var.invoke(mb8.a);
                }
                break;
            case 20:
                if (g98.a[((wez0) obj).ordinal()] == 1) {
                    iu30Var.invoke(mb8.b);
                }
                break;
            case 21:
                ((qtr) obj).b(new k1(iu30Var, (lnm) null, (byte) 5));
                break;
            case 22:
                ((Boolean) obj).getClass();
                iu30Var.invoke(mn8.a);
                break;
            case 23:
                ((Boolean) obj).getClass();
                iu30Var.invoke(ap8.a);
                break;
            case 24:
                iu30Var.invoke(new cbt0(((c10) obj).e));
                break;
            case 25:
                iu30Var.invoke(new yr9(((Boolean) obj).booleanValue()));
                break;
            case 26:
                iu30Var.invoke(new wr9(((Boolean) obj).booleanValue()));
                break;
            case 27:
                iu30Var.invoke(new RemoteNativeCallbackRouter(((nx9) obj).u().getRemoteNativeRouter()));
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                iu30Var.invoke((q3a) obj);
                break;
            default:
                iu30Var.invoke((String) obj);
                break;
        }
        return rih1Var;
    }
}
