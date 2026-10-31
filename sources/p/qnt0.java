package p;

import com.spotify.extendedmetadata.extensions.playlinkcardtrait.proto.PlayLinkCardTrait;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qnt0 implements ov00 {
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    public final ez00 a(byte[] bArr) {
        m650 m650Var;
        PlayLinkCardTrait playLinkCardTraitC = PlayLinkCardTrait.C(bArr);
        String title = playLinkCardTraitC.getTitle();
        String strA = playLinkCardTraitC.A();
        String strX = playLinkCardTraitC.x();
        String strY = playLinkCardTraitC.y();
        String subtitle = playLinkCardTraitC.getSubtitle();
        String strZ = playLinkCardTraitC.z();
        String strU = playLinkCardTraitC.u();
        String strV = playLinkCardTraitC.v();
        int iP = playLinkCardTraitC.p();
        int i = iP == 0 ? -1 : pnt0.a[l1d.C(iP)];
        xdo wdoVar = i != 1 ? i != 2 ? xdo.a : new wdo(playLinkCardTraitC.t().q(), playLinkCardTraitC.t().o(), playLinkCardTraitC.t().n()) : new zdo(playLinkCardTraitC.w().getUri());
        int iO = playLinkCardTraitC.o();
        int i2 = iO != 0 ? pnt0.b[l1d.C(iO)] : -1;
        xv9 tv9Var = i2 != 1 ? i2 != 2 ? xv9.a : new tv9(playLinkCardTraitC.n().getUrl()) : new wv9(playLinkCardTraitC.s().getUrl());
        String strQ = playLinkCardTraitC.q();
        strQ.getClass();
        String str = !ihc1.y0(strQ) ? strQ : null;
        if (playLinkCardTraitC.B()) {
            h290<PlayLinkCardTrait.Gradient.Stop> h290VarO = playLinkCardTraitC.r().o();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
            for (PlayLinkCardTrait.Gradient.Stop stop : h290VarO) {
                arrayList.add(new d750(stop.n(), stop.o()));
            }
            if (arrayList.isEmpty()) {
                m650Var = null;
            } else {
                m650Var = new m650(arrayList);
            }
        } else {
            m650Var = null;
        }
        return new ont0(title, strA, strX, strY, subtitle, strZ, strU, strV, wdoVar, tv9Var, str, m650Var);
    }

    public final int b() {
        return 248;
    }

    public final Class type() {
        return ont0.class;
    }
}
