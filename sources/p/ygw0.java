package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ygw0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xgw0 b;
    public final /* synthetic */ rt01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ygw0(xgw0 xgw0Var, rt01 rt01Var, byte b) {
        super(2);
        this.a = b;
        this.b = xgw0Var;
        this.c = rt01Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rt01 rt01Var = this.c;
        xgw0 xgw0Var = this.b;
        switch (b) {
            case 0:
                ufw0 ufw0Var = (ufw0) obj;
                mhw0 mhw0Var = (mhw0) obj2;
                String str = ufw0Var.a;
                ((dt71) xgw0Var.b.c).a(str);
                xgw0Var.c.b.a(str);
                ((ghw0) rt01Var.d).d = ufw0Var.c;
                return Next.h(mhw0.a(mhw0Var, str, ufw0Var.b, (lhw0) null, (khw0) null, (PlayabilityRestriction) null, 56));
            default:
                ufw0 ufw0Var2 = (ufw0) obj;
                mhw0 mhw0Var2 = (mhw0) obj2;
                String str2 = ufw0Var2.a;
                ((dt71) xgw0Var.b.c).a(str2);
                xgw0Var.c.b.a(str2);
                ((ghw0) rt01Var.d).d = ufw0Var2.c;
                return First.b(mhw0.a(mhw0Var2, str2, ufw0Var2.b, (lhw0) null, (khw0) null, (PlayabilityRestriction) null, 56));
        }
    }
}
