package p;

import android.graphics.Color;
import com.spotify.wrapped.v1.proto.ButtonConfiguration;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yeg extends hab0 implements iu30 {
    public final /* synthetic */ StoryCard a;
    public final /* synthetic */ cfg b;
    public final /* synthetic */ ButtonConfiguration c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeg(StoryCard storyCard, cfg cfgVar, ButtonConfiguration buttonConfiguration) {
        super(1);
        this.a = storyCard;
        this.b = cfgVar;
        this.c = buttonConfiguration;
    }

    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        StoryCard storyCard = this.a;
        mmr0 mmr0VarA = p1p1.A(storyCard.v(), Integer.valueOf(iIntValue), true);
        CardShareConfiguration cardShareConfiguration = (CardShareConfiguration) mmr0VarA.a;
        int iIntValue2 = ((Number) mmr0VarA.b).intValue();
        zxl1 zxl1Var = this.b.k;
        ButtonConfiguration buttonConfiguration = this.c;
        buttonConfiguration.getClass();
        String id = storyCard.getId();
        String strP = buttonConfiguration.q().p();
        String strR = buttonConfiguration.q().r();
        strR.getClass();
        if (strR.length() <= 0) {
            strR = null;
        }
        String strQ = buttonConfiguration.q().q();
        strQ.getClass();
        if (ihc1.y0(strQ)) {
            strQ = null;
        }
        Integer numValueOf = strQ != null ? Integer.valueOf(Color.parseColor(strQ)) : null;
        String strN = buttonConfiguration.q().n();
        strN.getClass();
        if (ihc1.y0(strN)) {
            strN = null;
        }
        return jec.a(zxl1Var, buttonConfiguration, new q8m1(id, cardShareConfiguration, new gec(numValueOf, strN != null ? Integer.valueOf(Color.parseColor(strN)) : null, strP, strR), iIntValue2, 40), storyCard.getId(), 20);
    }
}
