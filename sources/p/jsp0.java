package p;

import android.content.res.Resources;
import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import com.spotify.home.evopage.mobius.State;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jsp0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ nsp0 c;

    public /* synthetic */ jsp0(vr20 vr20Var, nsp0 nsp0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = nsp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        isp0 isp0Var;
        msp0 msp0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nsp0 nsp0Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        osp0 osp0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof isp0) {
                    isp0Var = (isp0) lnmVar;
                    int i = isp0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        isp0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        isp0Var = new isp0(this, lnmVar);
                    }
                } else {
                    isp0Var = new isp0(this, lnmVar);
                }
                Object obj2 = isp0Var.a;
                int i2 = isp0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                uut0 uut0Var = (uut0) obj;
                uut0Var.getClass();
                Resources resources = nsp0Var.c;
                if (psp0.a[l1d.C(uut0Var.a)] == 1) {
                    hvl1 hvl1Var = new hvl1(resources.getString(2131953959), 254, (String) null, (String) null, false, (String) null);
                    String str = uut0Var.d;
                    ymx0 ymx0Var = new ymx0("playable-cache-promo", "playable-cache-promo", hvl1Var, yz21.d, new epx0("playable-cache-promo", str, str, EmbeddedAdMetadata.p(), 3));
                    String str2 = uut0Var.d;
                    String string = resources.getString(2131953958);
                    String str3 = uut0Var.c;
                    String str4 = uut0Var.d;
                    String string2 = resources.getString(2131953957);
                    z6x z6xVar = z6x.a;
                    osp0Var = new osp0(ymx0Var, Collections.singletonMap(str2, Collections.singletonList(new pnx0(string, "", str4, str3, "", z6xVar, (Long) null, "", z6xVar, str4, string2, false, 0, "", false))));
                }
                List listN = p7h.N(osp0Var);
                isp0Var.b = 1;
                return vr20Var.emit(listN, isp0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof msp0) {
                    msp0Var = (msp0) lnmVar;
                    int i3 = msp0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        msp0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        msp0Var = new msp0(this, lnmVar);
                    }
                } else {
                    msp0Var = new msp0(this, lnmVar);
                }
                Object obj3 = msp0Var.a;
                int i4 = msp0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                State.Content content = (State) obj;
                Boolean boolValueOf = Boolean.valueOf((content instanceof State.Content) && !content.isOnline() && u890.j(nsp0Var.d.a, "default"));
                msp0Var.b = 1;
                return vr20Var.emit(boolValueOf, msp0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
