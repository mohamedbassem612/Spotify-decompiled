package p;

import android.graphics.Bitmap;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xa90 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ g7m1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa90(hb90 hb90Var, SceneTemplate.IntroTrackContent.Card1 card1, g7m1 g7m1Var, yj41 yj41Var, boolean z, Function0 function0, ck41 ck41Var, Bitmap bitmap, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 0;
        this.c = hb90Var;
        this.d = card1;
        this.e = g7m1Var;
        this.i = yj41Var;
        this.f = z;
        this.h = function0;
        this.g = ck41Var;
        this.t = bitmap;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.t;
        Object obj2 = this.g;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                return new xa90((hb90) this.c, (SceneTemplate.IntroTrackContent.Card1) this.d, this.e, (yj41) this.i, this.f, (Function0) obj3, (ck41) obj2, (Bitmap) obj, lnmVar);
            case 1:
                yj41 yj41Var = (yj41) this.i;
                return new xa90((hb90) this.c, (SceneTemplate.IntroTrackContent.Card1) this.d, this.e, this.f, (rkj1) obj, (ck41) obj2, (Function0) obj3, yj41Var, lnmVar);
            case 2:
                return new xa90((SceneTemplate.IntroContent.WelcomeMessageCardV3) obj3, this.e, (rb90) obj2, this.f, (hrr0) obj, lnmVar, (byte) 2);
            default:
                return new xa90((SceneTemplate.OutroContent.WrapUpCard) obj3, this.e, (vh6) obj2, this.f, (f311) obj, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objC2;
        Object dyyVar;
        bk41[] bk41VarArr;
        Object objD;
        String str;
        bk41[] bk41VarArr2;
        String str2;
        Object objD2;
        bk41[] bk41VarArr3;
        bk41[] bk41VarArr4;
        byte b = this.a;
        g7m1 g7m1Var = this.e;
        boolean z = this.f;
        Object obj2 = this.t;
        Object obj3 = this.g;
        d9n d9nVar = d9n.a;
        Object obj4 = this.h;
        switch (b) {
            case 0:
                SceneTemplate.IntroTrackContent.Card1 card1 = (SceneTemplate.IntroTrackContent.Card1) this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    hb90 hb90Var = (hb90) this.c;
                    RiveAnimation riveAnimationR = card1.r();
                    this.b = true;
                    objC = hb90Var.c(riveAnimationR, g7m1Var, this);
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                return f46.i0(new bk41[]{(bk41) objC, new bk41("introTrackFallbackLayer", Collections.singletonList(new dyy(new ua90(card1), new va90(card1), (yj41) this.i, this.f, new wa90(card1), (Function0) obj4, (ck41) obj3, (Bitmap) obj2, 24.0f, 8.0f)))});
            case 1:
                SceneTemplate.IntroTrackContent.Card1 card2 = (SceneTemplate.IntroTrackContent.Card1) this.d;
                hb90 hb90Var2 = (hb90) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    RiveAnimation riveAnimationR2 = card2.r();
                    this.b = true;
                    objC2 = hb90Var2.c(riveAnimationR2, g7m1Var, this);
                    if (objC2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC2 = obj;
                }
                bk41 bk41Var = (bk41) objC2;
                if (z) {
                    ilv.a.getClass();
                    dyyVar = new vkj1((rkj1) obj2, hb90Var2.b, (ck41) obj3, flv.j, (Function0) obj4);
                } else {
                    dyyVar = new dyy(new ya90(card2), new za90(card2), (yj41) this.i, false, new ab90(card2), (Function0) obj4, 192);
                }
                return f46.i0(new bk41[]{bk41Var, new bk41("introTrackContentLayer", Collections.singletonList(dyyVar))});
            case 2:
                rb90 rb90Var = (rb90) obj3;
                SceneTemplate.IntroContent.WelcomeMessageCardV3 welcomeMessageCardV3 = (SceneTemplate.IntroContent.WelcomeMessageCardV3) obj4;
                ven0 ven0Var = (hrr0) obj2;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    bk41[] bk41VarArr5 = new bk41[2];
                    RiveAnimation riveAnimationP = welcomeMessageCardV3.p();
                    ti31 ti31Var = rb90Var.d;
                    kj31 kj31Var = rb90Var.e;
                    cxc cxcVar = rb90Var.f;
                    Map mapSingletonMap = Collections.singletonMap("showLiveCounter", new w990(ven0Var, null, (byte) 2));
                    this.c = bk41VarArr5;
                    this.d = bk41VarArr5;
                    this.i = "introWelcomeBackgroundLayer";
                    this.b = true;
                    bk41VarArr = bk41VarArr5;
                    objD = u3k.d(riveAnimationP, this.e, ti31Var, kj31Var, cxcVar, "introWelcomeMessageBackground", mapSingletonMap, this, 64);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                    str = "introWelcomeBackgroundLayer";
                    bk41VarArr2 = bk41VarArr;
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) this.i;
                    bk41[] bk41VarArr6 = (bk41[]) this.d;
                    bk41VarArr2 = (bk41[]) this.c;
                    hm5.M(obj);
                    bk41VarArr = bk41VarArr6;
                    str = str3;
                    objD = obj;
                }
                bk41VarArr[0] = new bk41(str, Collections.singletonList(objD));
                jb50 jb50Var = new jb50(welcomeMessageCardV3, (byte) 27);
                boolean z5 = this.f;
                bk41VarArr2[1] = new bk41("introWelcomeContentLayer", Collections.singletonList(new sa90(jb50Var, z5, z5 ? ven0Var : null, welcomeMessageCardV3.o(), (mim1) rb90Var.g, new my2(ven0Var, (byte) 1))));
                return p7h.M(bk41VarArr2);
            default:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    bk41[] bk41VarArr7 = new bk41[2];
                    RiveAnimation riveAnimationP2 = ((SceneTemplate.OutroContent.WrapUpCard) obj4).p();
                    vh6 vh6Var = (vh6) obj3;
                    ti31 ti31Var2 = vh6Var.f;
                    kj31 kj31Var2 = vh6Var.g;
                    cxc cxcVar2 = vh6Var.e;
                    this.c = bk41VarArr7;
                    this.d = bk41VarArr7;
                    str2 = "riveBackground";
                    this.i = "riveBackground";
                    this.b = true;
                    objD2 = u3k.d(riveAnimationP2, this.e, ti31Var2, kj31Var2, cxcVar2, "outroWrapUpBackground", null, this, 192);
                    if (objD2 == d9nVar) {
                        return d9nVar;
                    }
                    bk41VarArr3 = bk41VarArr7;
                    bk41VarArr4 = bk41VarArr3;
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) this.i;
                    bk41VarArr3 = (bk41[]) this.d;
                    bk41VarArr4 = (bk41[]) this.c;
                    hm5.M(obj);
                    str2 = str4;
                    objD2 = obj;
                }
                bk41VarArr3[0] = new bk41(str2, Collections.singletonList(objD2));
                f311 f311Var = (f311) obj2;
                smc0 smc0VarN = k4p1.n();
                if (z) {
                    smc0VarN.add(new p7x(3000));
                }
                smc0VarN.add(f311Var);
                bk41VarArr4[1] = new bk41("foreground", k4p1.k(smc0VarN));
                return p7h.M(bk41VarArr4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa90(com.google.protobuf.h hVar, g7m1 g7m1Var, a3k a3kVar, boolean z, Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.h = hVar;
        this.e = g7m1Var;
        this.g = a3kVar;
        this.f = z;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa90(hb90 hb90Var, SceneTemplate.IntroTrackContent.Card1 card1, g7m1 g7m1Var, boolean z, rkj1 rkj1Var, ck41 ck41Var, Function0 function0, yj41 yj41Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 1;
        this.c = hb90Var;
        this.d = card1;
        this.e = g7m1Var;
        this.f = z;
        this.t = rkj1Var;
        this.g = ck41Var;
        this.h = function0;
        this.i = yj41Var;
    }
}
