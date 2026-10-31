package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class re8 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qj41 b;
    public final /* synthetic */ wj31 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re8(qj41 qj41Var, se8 se8Var, SceneTemplate.AudiobooksContent.Card2 card2, wj31 wj31Var, List list, lnm lnmVar) {
        super(1, lnmVar);
        this.b = qj41Var;
        this.e = se8Var;
        this.f = card2;
        this.c = wj31Var;
        this.d = list;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                wj31 wj31Var = this.c;
                List list = this.d;
                return new re8(this.b, (se8) obj2, (SceneTemplate.AudiobooksContent.Card2) obj, wj31Var, list, lnmVar);
            default:
                return new re8(this.b, (SceneTemplate.MinutesListenedContent.Reveal) obj2, this.c, this.d, (se8) obj, lnmVar);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        qj41 qj41Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                SceneTemplate.AudiobooksContent.Card2 card2 = (SceneTemplate.AudiobooksContent.Card2) obj2;
                se8 se8Var = (se8) obj3;
                return p7h.M(new bk41[]{new bk41("audiobooksBackgroundLayer", Collections.singletonList(qj41Var)), new bk41("audiobooksListLayer", Collections.singletonList(new ve8(new rl1(new qe8(card2, (byte) 0), new qe8(card2, (byte) 1), pwo1.v(se8Var.b, se8Var.c), card2.n()), this.c, this.d)))});
            default:
                hm5.M(obj);
                bk41 bk41Var = new bk41("minutesListenedRevealBackgroundLayer", Collections.singletonList(qj41Var));
                SceneTemplate.MinutesListenedContent.Reveal reveal = (SceneTemplate.MinutesListenedContent.Reveal) obj3;
                reveal.getClass();
                long jQ = reveal.q();
                btj0 btj0Var = new btj0(reveal, (byte) 0);
                h290 h290VarT = reveal.t();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarT, 10));
                for (Iterator it = h290VarT.iterator(); it.hasNext(); it = it) {
                    SceneTemplate.MinutesListenedContent.Reveal.TierTag tierTag = (SceneTemplate.MinutesListenedContent.Reveal.TierTag) it.next();
                    arrayList.add(new dtj0(new ctj0(tierTag), ror0.e(u7h.f, ror0.a(tierTag.n()).w())));
                }
                se8 se8Var2 = (se8) obj2;
                return p7h.M(new bk41[]{bk41Var, new bk41("minutesListenedRevealLayer", Collections.singletonList(new thd0(new etj0(jQ, btj0Var, mqo1.A(arrayList), reveal.v() ? new btj0(reveal, (byte) 1) : null, this.c, this.d, reveal.p()), pwo1.v(se8Var2.b, se8Var2.c))))});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re8(qj41 qj41Var, SceneTemplate.MinutesListenedContent.Reveal reveal, wj31 wj31Var, List list, se8 se8Var, lnm lnmVar) {
        super(1, lnmVar);
        this.b = qj41Var;
        this.e = reveal;
        this.c = wj31Var;
        this.d = list;
        this.f = se8Var;
    }
}
