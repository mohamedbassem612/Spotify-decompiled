package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iaf1 extends a8d1 implements iu30 {
    public bk41[] a;
    public bk41[] b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ qj41 f;
    public final /* synthetic */ SceneTemplate.TopFiveSongsContent.Card1 g;
    public final /* synthetic */ g7m1 h;
    public final /* synthetic */ jaf1 i;
    public final /* synthetic */ kia t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaf1(qj41 qj41Var, SceneTemplate.TopFiveSongsContent.Card1 card1, g7m1 g7m1Var, jaf1 jaf1Var, kia kiaVar, lnm lnmVar) {
        super(1, lnmVar);
        this.f = qj41Var;
        this.g = card1;
        this.h = g7m1Var;
        this.i = jaf1Var;
        this.t = kiaVar;
    }

    public final lnm create(lnm lnmVar) {
        return new iaf1(this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objA;
        bk41[] bk41VarArr;
        bk41[] bk41VarArr2;
        boolean z = this.e;
        ?? r11 = 1;
        if (!z) {
            hm5.M(obj);
            bk41[] bk41VarArr3 = new bk41[2];
            bk41VarArr3[0] = new bk41("topFiveSongsBackgroundLayer", Collections.singletonList(this.f));
            SceneTemplate.TopFiveSongsContent.Card1 card1 = this.g;
            card1.getClass();
            g7m1 g7m1Var = this.h;
            String id = g7m1Var.a.getId();
            jaf1 jaf1Var = this.i;
            gw70 gw70Var = jaf1Var.a;
            pe peVar = jaf1Var.b;
            tjs0 tjs0Var = jaf1Var.c;
            bju bjuVar = g7m1Var.b;
            ard1 ard1Var = jaf1Var.g;
            nda1 nda1Var = new nda1(0, this.t, kia.class, "reset", "reset()V", 0, (byte) 27);
            k7b1 k7b1Var = new k7b1(1, this.t, kia.class, "select", "select(I)V", 0, (byte) 28);
            String str2 = g7m1Var.c;
            this.a = bk41VarArr3;
            this.b = bk41VarArr3;
            str = "topFiveSongsLayer";
            this.c = "topFiveSongsLayer";
            this.d = true;
            this.e = true;
            objA = uaf1.a(card1, id, gw70Var, peVar, tjs0Var, bjuVar, ard1Var, nda1Var, k7b1Var, str2, this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            bk41VarArr = bk41VarArr3;
            bk41VarArr2 = bk41VarArr;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = this.d;
            String str3 = this.c;
            bk41VarArr = this.b;
            bk41VarArr2 = this.a;
            hm5.M(obj);
            str = str3;
            objA = obj;
            r11 = z2;
        }
        bk41VarArr[r11] = new bk41(str, Collections.singletonList(objA));
        return p7h.M(bk41VarArr2);
    }
}
