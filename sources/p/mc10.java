package p;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mc10 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p410 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc10(p410 p410Var, String str, byte b) {
        super(1);
        this.a = b;
        this.b = p410Var;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        p410 p410Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                kpg0 kpg0Var = new kpg0(new nu(((Context) p410Var.b).getString(2131952581)), la10.a1);
                yty ytyVar = yty.Y0;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(oc10.class, new b7t0(new cdk1(kpg0Var), ytyVar));
                lc10 lc10Var = new lc10(p410Var, str, (byte) 0);
                linkedHashMap.put(nc10.class, r4o1.Q(new kq00(str, (byte) 9), emb.d, lc10Var, yty.Z0));
                kpg0 kpg0Var2 = new kpg0(new nu(((Context) p410Var.b).getString(2131952582)), la10.b1);
                linkedHashMap.put(qc10.class, new b7t0(new cdk1(kpg0Var2), yty.a1));
                lc10 lc10Var2 = new lc10(p410Var, str, (byte) 1);
                kwh.y.getClass();
                linkedHashMap.put(pc10.class, r4o1.Q(la10.c1, ewh.b, lc10Var2, yty.b1));
                break;
            default:
                yc10 yc10Var = (yc10) p410Var.e;
                ay8 ay8VarH = d3p1.H((d0r) p410Var.f, yc10Var.b, str);
                two1.v((dnc0) obj, rqt0.u(new any(new x010(rqt0.u(new evz(ay8VarH, yc10Var, (byte) 7)), new ht20(hu20.c(rqt0.u(new vvu(ay8VarH, (byte) 19)), new l2w(yc10Var, str, (lnm) null, (byte) 22)), new qjr(2, null, (byte) 25)), new wc10(3, (lnm) null, (byte) 0), (byte) 1), (byte) 18)), false, new mc10(p410Var, str, b2));
                break;
        }
        return rih1Var;
    }
}
