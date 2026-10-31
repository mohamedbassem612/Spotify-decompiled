package p;

import android.icu.text.DecimalFormat;
import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.StoryCard;
import com.spotify.wrapped.v1.proto.a0;
import com.spotify.wrapped.v1.proto.e0;
import com.spotify.wrapped.v1.proto.v;
import com.spotify.wrapped.v1.proto.y;
import com.spotify.wrapped.v1.proto.z;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aa90 extends a8d1 implements iu30 {
    public final /* synthetic */ StoryCard N0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ hrr0 Y;
    public final /* synthetic */ hrr0 Z;
    public bk41[] a;
    public bk41[] b;
    public String c;
    public boolean d;
    public final /* synthetic */ SceneTemplate.IntroContent.LiveCounterCard e;
    public final /* synthetic */ g7m1 f;
    public final /* synthetic */ oe6 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ qan i;
    public final /* synthetic */ frr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa90(SceneTemplate.IntroContent.LiveCounterCard liveCounterCard, g7m1 g7m1Var, oe6 oe6Var, boolean z, qan qanVar, frr0 frr0Var, boolean z2, hrr0 hrr0Var, hrr0 hrr0Var2, StoryCard storyCard, lnm lnmVar) {
        super(1, lnmVar);
        this.e = liveCounterCard;
        this.f = g7m1Var;
        this.g = oe6Var;
        this.h = z;
        this.i = qanVar;
        this.t = frr0Var;
        this.X = z2;
        this.Y = hrr0Var;
        this.Z = hrr0Var2;
        this.N0 = storyCard;
    }

    public final lnm create(lnm lnmVar) {
        return new aa90(this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        bk41[] bk41VarArr;
        char c;
        byte b;
        SceneTemplate.IntroContent.LiveCounterCard liveCounterCard;
        ven0 ven0Var;
        Object objB;
        String str;
        bk41[] bk41VarArr2;
        SceneTemplate.IntroContent.LiveCounterCard liveCounterCard2;
        g990 f990Var;
        Paragraph paragraphBuild;
        boolean z = this.d;
        oe6 oe6Var = this.g;
        ven0 ven0Var2 = this.Y;
        ven0 ven0Var3 = this.Z;
        SceneTemplate.IntroContent.LiveCounterCard liveCounterCard3 = this.e;
        if (!z) {
            hm5.M(obj);
            bk41[] bk41VarArr3 = new bk41[2];
            RiveAnimation riveAnimationS = liveCounterCard3.s();
            ti31 ti31Var = oe6Var.e;
            kj31 kj31Var = oe6Var.f;
            cxc cxcVar = oe6Var.d;
            List listSingletonList = Collections.singletonList(new nj31("dataCounter", this.h));
            Map mapJ = sqg0.J(new mmr0[]{new mmr0("showLiveCounter", new w990(ven0Var3, null, (byte) 0)), new mmr0("showSubtitle", new w990(ven0Var2, null, (byte) 1))});
            this.a = bk41VarArr3;
            this.b = bk41VarArr3;
            this.c = "introLiveCounterBackgroundLayer";
            this.d = true;
            g7m1 g7m1Var = this.f;
            bk41VarArr = bk41VarArr3;
            c = 0;
            b = 1;
            liveCounterCard = liveCounterCard3;
            ven0Var = null;
            objB = u3k.a.b(riveAnimationS, g7m1Var, ti31Var, kj31Var, cxcVar, new p3k(new boj(g7m1Var, (byte) 10), (byte) 0), "introLiveCounterBackground", listSingletonList, mapJ, this);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
            str = "introLiveCounterBackgroundLayer";
            bk41VarArr2 = bk41VarArr;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = this.c;
            bk41VarArr2 = this.b;
            bk41[] bk41VarArr4 = this.a;
            hm5.M(obj);
            ven0Var = null;
            liveCounterCard = liveCounterCard3;
            bk41VarArr = bk41VarArr4;
            c = 0;
            str = str2;
            b = 1;
            objB = obj;
        }
        bk41VarArr2[c] = new bk41(str, Collections.singletonList(objB));
        frr0 frr0Var = this.t;
        qan qanVar = this.i;
        if (qanVar != null) {
            Paragraph paragraphP = liveCounterCard.p();
            san sanVar = qanVar.d;
            String strW = nhc1.W(((DecimalFormat) sanVar.c.getValue()).format(qanVar.b), ",", sanVar.b);
            int iU = paragraphP.u();
            int i = iU == 0 ? -1 : ba90.a[l1d.C(iU)];
            if (i == b) {
                v builder = paragraphP.toBuilder();
                y builder2 = paragraphP.p().toBuilder();
                e0 builder3 = paragraphP.p().s().toBuilder();
                builder3.q(strW);
                builder2.n(builder3.build());
                builder.n(builder2);
                paragraphBuild = builder.build();
            } else if (i == 2) {
                v builder4 = paragraphP.toBuilder();
                a0 builder5 = paragraphP.r().toBuilder();
                e0 builder6 = paragraphP.r().s().toBuilder();
                builder6.q(strW);
                builder5.n(builder6.build());
                builder4.s(builder5);
                paragraphBuild = (Paragraph) builder4.build();
            } else {
                if (i != 3) {
                    k220.f("Unsupported paragraph type: ".concat(jup0.m(paragraphP.u())));
                    return ven0Var;
                }
                v builder7 = paragraphP.toBuilder();
                z builder8 = paragraphP.q().toBuilder();
                e0 builder9 = paragraphP.q().t().toBuilder();
                builder9.q(strW);
                builder8.q(builder9.build());
                builder7.q(builder8);
                paragraphBuild = (Paragraph) builder7.build();
            }
            liveCounterCard2 = liveCounterCard;
            f990Var = new d990(this.i, new x990(paragraphBuild, (byte) 0), new y990(liveCounterCard2, (byte) 0), frr0Var, this.X ? ven0Var2 : ven0Var);
        } else {
            liveCounterCard2 = liveCounterCard;
            f990Var = liveCounterCard2.t() ? new f990(new y990(liveCounterCard2, b)) : e990.a;
        }
        long jR = liveCounterCard2.r();
        boolean z2 = this.X;
        if (z2) {
            ven0Var = ven0Var3;
        }
        bk41VarArr[b] = new bk41("introLiveCounterContentLayer", Collections.singletonList(new da90(new bz60(f990Var, jR, z2, ven0Var, (mim1) oe6Var.i, new z990(this.h, z2, (hrr0) ven0Var3, oe6Var, this.N0, this.i, frr0Var, (hrr0) ven0Var2)))));
        return p7h.M(bk41VarArr);
    }
}
