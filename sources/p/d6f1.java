package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d6f1 extends a8d1 implements iu30 {
    public final /* synthetic */ qj41 a;
    public final /* synthetic */ g7m1 b;
    public final /* synthetic */ SceneTemplate.TopAlbumsContent.Carousel c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ f6f1 e;
    public final /* synthetic */ kia f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6f1(qj41 qj41Var, g7m1 g7m1Var, SceneTemplate.TopAlbumsContent.Carousel carousel, c380 c380Var, f6f1 f6f1Var, kia kiaVar, lnm lnmVar) {
        super(1, lnmVar);
        this.a = qj41Var;
        this.b = g7m1Var;
        this.c = carousel;
        this.d = c380Var;
        this.e = f6f1Var;
        this.f = kiaVar;
    }

    public final lnm create(lnm lnmVar) {
        return new d6f1(this.a, this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        s6f1 s6f1Var;
        f6f1 f6f1Var = this.e;
        pe peVar = f6f1Var.b;
        hm5.M(obj);
        bk41 bk41Var = new bk41("topAlbumsCarouselBackgroundLayer", Collections.singletonList(this.a));
        String id = this.b.a.getId();
        SceneTemplate.TopAlbumsContent.Carousel carousel = this.c;
        String strR = carousel.r();
        boolean zQ = carousel.q();
        if (carousel.t()) {
            c6f1 c6f1Var = new c6f1(carousel);
            String strO = carousel.s().o().o();
            String strP = carousel.s().o().p();
            long j = u7h.k;
            s6f1Var = new s6f1(c6f1Var, strO, ror0.e(j, strP), carousel.s().q().o(), ror0.e(j, carousel.s().q().p()));
        } else {
            s6f1Var = null;
        }
        return p7h.M(new bk41[]{bk41Var, new bk41("topAlbumsCarouselLayer", Collections.singletonList(new c7f1(new t6f1(id, this.d, strR, s6f1Var, zQ), pwo1.v(peVar, f6f1Var.c), peVar.e(), f6f1Var.g, new nda1(0, this.f, kia.class, "reset", "reset()V", 0, (byte) 25), new k7b1(1, this.f, kia.class, "select", "select(I)V", 0, (byte) 24))))});
    }
}
