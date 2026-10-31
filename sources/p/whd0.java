package p;

import android.graphics.Color;
import com.spotify.wrapped.v1.proto.ButtonConfiguration;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class whd0 extends a8d1 implements iu30 {
    public zhd0 a;
    public String b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ yhd0 e;
    public final /* synthetic */ SceneTemplate.ListeningAgeContent.Card2 f;
    public final /* synthetic */ g7m1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whd0(yhd0 yhd0Var, SceneTemplate.ListeningAgeContent.Card2 card2, g7m1 g7m1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.e = yhd0Var;
        this.f = card2;
        this.g = g7m1Var;
    }

    public final lnm create(lnm lnmVar) {
        return new whd0(this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var;
        String str;
        Object objD;
        boolean z;
        boolean z2 = this.d;
        if (!z2) {
            hm5.M(obj);
            SceneTemplate.ListeningAgeContent.Card2 card2 = this.f;
            card2.getClass();
            g7m1 g7m1Var = this.g;
            StoryCard storyCard = g7m1Var.a;
            yhd0 yhd0Var = this.e;
            zxl1 zxl1Var = yhd0Var.e;
            ButtonConfiguration buttonConfigurationR = storyCard.p().q().r();
            String id = storyCard.getId();
            CardShareConfiguration cardShareConfigurationV = storyCard.v();
            ButtonConfiguration.Style styleQ = storyCard.p().q().r().q();
            String strP = styleQ.p();
            String strQ = styleQ.q();
            Integer numValueOf = (strQ == null || strQ.length() == 0) ? null : Integer.valueOf(Color.parseColor(styleQ.q()));
            String strN = styleQ.n();
            zhd0Var = new zhd0(new xhd0(card2, (byte) 0), new xhd0(card2, (byte) 1), new xhd0(card2, (byte) 2), card2.n(), jec.a(zxl1Var, buttonConfigurationR, new q8m1(id, cardShareConfigurationV, new gec(numValueOf, (strN == null || strN.length() == 0) ? null : Integer.valueOf(Color.parseColor(styleQ.n())), strP, (String) null), 0, 56), storyCard.getId(), 20));
            boolean zV = pwo1.v(yhd0Var.a, yhd0Var.b);
            bju bjuVar = g7m1Var.b;
            n0a0 n0a0Var = new n0a0(card2, yhd0Var, (lnm) null, (byte) 22);
            this.a = zhd0Var;
            str = "revealTextLayer";
            this.b = "revealTextLayer";
            this.c = zV;
            this.d = true;
            objD = bjuVar.d("reveal", n0a0Var, this);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
            z = zV;
        } else {
            if (!z2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.c;
            str = this.b;
            zhd0 zhd0Var2 = this.a;
            hm5.M(obj);
            zhd0Var = zhd0Var2;
            objD = obj;
        }
        return Collections.singletonList(new bk41(str, Collections.singletonList(new aid0((wj31) objD, zhd0Var, z))));
    }
}
