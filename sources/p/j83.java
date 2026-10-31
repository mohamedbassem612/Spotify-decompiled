package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j83 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x83 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j83(x83 x83Var, byte b) {
        super(1);
        this.a = b;
        this.b = x83Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        x83 x83Var = this.b;
        switch (b) {
            case 0:
                ymd0 ymd0Var = (ymd0) obj;
                rt01 rt01VarY = cso1.y(f6o1.A(ycm.a((ycm) x83Var.b.h), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), x83Var.y, new n2(x83Var, ymd0Var, (byte) 26));
                iac0 iac0Var = x83Var.d;
                q8n q8nVar = x83Var.x;
                mr20 mr20VarI = t5p1.i(ymd0Var);
                u9c0 u9c0VarQ = cto1.q(iac0Var);
                alb1 alb1Var = new alb1(0L, Long.MAX_VALUE);
                ioj0 ioj0Var = (ioj0) ymd0Var.e();
                if (ioj0Var == null) {
                    ioj0Var = new ioj0();
                }
                return l6o1.A(new jpg0(new rt01(rt01VarY, p83.P0, d5p1.t(mr20VarI, u9c0VarQ, alb1Var, ioj0Var), q8nVar), b03.Z0));
            case 1:
                return new hv70("you-may-also-like", new hvl1(x83Var.a.getString(2131952202), 254, (String) null, (String) null, false, (String) null), ((v53) obj).a, false, (n1x) null, 112);
            case 2:
                hvl1 hvl1Var = new hvl1(x83Var.a.getString(2131952180), 254, (String) null, (String) null, false, (String) null);
                List<vui0> list = ((s53) obj).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (vui0 vui0Var : list) {
                    arrayList.add(new tb3(vui0Var.b, vui0Var.d, vui0Var.e));
                }
                return new kmb1("merch", arrayList, hvl1Var);
            case 3:
                return new viv0(x83Var.i.e);
            case 4:
                return new gvu(6, (String) obj, (String) null, x83Var.q.b(), (String) null);
            default:
                l83 l83Var = new l83(x83Var, (byte) 6);
                ((ji50) obj).b.put(rih1.class, r4o1.Q(q83.g, w7x.a, l83Var, p83.Y));
                return rih1.a;
        }
    }
}
