package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ae6 extends a8d1 implements iu30 {
    public final /* synthetic */ g7m1 X;
    public final /* synthetic */ be6 Y;
    public Object a;
    public Object b;
    public SceneTemplate.ArtistCardsContent.Card1 c;
    public bk41[] d;
    public String e;
    public bk41[] f;
    public int g;
    public boolean h;
    public boolean i;
    public byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae6(g7m1 g7m1Var, be6 be6Var, lnm lnmVar) {
        super(1, lnmVar);
        this.X = g7m1Var;
        this.Y = be6Var;
    }

    public final lnm create(lnm lnmVar) {
        return new ae6(this.X, this.Y, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final Object invokeSuspend(Object obj) {
        Object objD;
        be6 be6Var;
        g7m1 g7m1Var;
        SceneTemplate.ArtistCardsContent.Card1 card1;
        int i;
        Object objS;
        ?? r1;
        bk41[] bk41VarArr;
        boolean z;
        String str;
        bk41[] bk41VarArr2;
        byte b = this.t;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            g7m1 g7m1Var2 = this.X;
            SceneTemplate.ArtistCardsContent.Card1 card1N = g7m1Var2.a.q().n();
            bju bjuVar = g7m1Var2.b;
            be6 be6Var2 = this.Y;
            us0 us0Var = new us0(card1N, be6Var2, (lnm) null, (byte) 2);
            this.a = g7m1Var2;
            this.b = be6Var2;
            this.c = card1N;
            this.g = 0;
            this.t = (byte) 1;
            objD = bjuVar.d("artistCardIntro", us0Var, this);
            if (objD != d9nVar) {
                be6Var = be6Var2;
                g7m1Var = g7m1Var2;
                card1 = card1N;
                i = 0;
            }
            return d9nVar;
        }
        if (b == 1) {
            i = this.g;
            SceneTemplate.ArtistCardsContent.Card1 card2 = this.c;
            be6Var = (be6) this.b;
            g7m1 g7m1Var3 = (g7m1) this.a;
            hm5.M(obj);
            g7m1Var = g7m1Var3;
            card1 = card2;
            objD = obj;
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = this.h;
            boolean z3 = this.i;
            bk41VarArr = this.f;
            str = this.e;
            bk41[] bk41VarArr3 = this.d;
            wj31 wj31Var = this.c;
            card1 = (SceneTemplate.ArtistCardsContent.Card1) this.b;
            be6 be6Var3 = (be6) this.a;
            hm5.M(obj);
            z = z3;
            bk41VarArr2 = bk41VarArr3;
            be6Var = be6Var3;
            objS = obj;
            r1 = z2;
        }
        bk41VarArr[r1] = new bk41(str, Collections.singletonList(new ce6(new zd6(card1, (byte) 0), new zd6(card1, (byte) 1), (zyq0) objS, z, new i26(be6Var, (byte) 2))));
        return p7h.M(bk41VarArr2);
        mmr0 mmr0Var = (mmr0) objD;
        wj31 wj31Var2 = (wj31) mmr0Var.a;
        List list = (List) mmr0Var.b;
        bk41[] bk41VarArr4 = new bk41[2];
        bk41VarArr4[0] = new bk41("artistCardsIntroBackgroundLayer", Collections.singletonList(new ej31(wj31Var2, list, (Map) null, (zu30) null, 26)));
        boolean zV = pwo1.v(be6Var.d, be6Var.e);
        SceneTemplate.ArtistCardsContent.Wrapper wrapperR = card1.r();
        Image imageS = card1.s();
        gw70 gw70Var = be6Var.a;
        bju bjuVar2 = g7m1Var.b;
        this.a = be6Var;
        this.b = card1;
        this.c = null;
        this.d = bk41VarArr4;
        this.e = "artistCardsIntroNativeLayer";
        this.f = bk41VarArr4;
        this.g = i;
        this.i = zV;
        this.h = true;
        this.t = (byte) 2;
        objS = smo1.s(new czq0(wrapperR, bjuVar2, gw70Var, imageS, null), this);
        if (objS != d9nVar) {
            r1 = 1;
            bk41VarArr = bk41VarArr4;
            z = zV;
            str = "artistCardsIntroNativeLayer";
            bk41VarArr2 = bk41VarArr;
            bk41VarArr[r1] = new bk41(str, Collections.singletonList(new ce6(new zd6(card1, (byte) 0), new zd6(card1, (byte) 1), (zyq0) objS, z, new i26(be6Var, (byte) 2))));
            return p7h.M(bk41VarArr2);
        }
        return d9nVar;
    }
}
