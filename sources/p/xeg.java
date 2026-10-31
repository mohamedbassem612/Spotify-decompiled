package p;

import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedTwinContent$GiftCard;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xeg extends a8d1 implements iu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public bk41[] b;
    public bk41[] c;
    public String d;
    public boolean e;
    public byte f;
    public Serializable g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeg(s2t s2tVar, s2t s2tVar2, vh6 vh6Var, SceneTemplate$WrappedTwinContent$GiftCard sceneTemplate$WrappedTwinContent$GiftCard, lnm lnmVar) {
        super(1, lnmVar);
        this.h = s2tVar;
        this.i = s2tVar2;
        this.t = vh6Var;
        this.X = sceneTemplate$WrappedTwinContent$GiftCard;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.X;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                return new xeg((g7m1) obj2, (cfg) obj, lnmVar);
            default:
                return new xeg((s2t) this.h, (s2t) this.i, (vh6) obj2, (SceneTemplate$WrappedTwinContent$GiftCard) obj, lnmVar);
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

    /* JADX WARN: Code duplicated, block: B:52:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Serializable, p.bk41[]] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p.bk41[]] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object orb1Var;
        ?? r1;
        Object objD;
        ?? r13;
        ?? r11;
        smc0 smc0VarN;
        String str2;
        Object objB;
        smc0 smc0Var;
        smc0 smc0Var2;
        ?? r4;
        ?? r12;
        ?? r2;
        Object objQ;
        bk41[] bk41VarArr;
        bk41[] bk41VarArr2;
        String str3;
        ?? r3;
        String str4;
        Object objQ2;
        vu30 vu30Var;
        ?? r5;
        bk41[] bk41VarArr3;
        bk41[] bk41VarArr4;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.X;
        Object obj3 = this.t;
        ?? r8 = 1;
        switch (b) {
            case 0:
                cfg cfgVar = (cfg) obj2;
                pe peVar = cfgVar.a;
                g7m1 g7m1Var = (g7m1) obj3;
                StoryCard storyCard = g7m1Var.a;
                byte b2 = this.f;
                if (b2 != 0) {
                    if (b2 == 1) {
                        String str5 = this.d;
                        bk41[] bk41VarArr5 = (bk41[]) this.g;
                        bk41[] bk41VarArr6 = this.b;
                        hm5.M(obj);
                        r13 = bk41VarArr6;
                        str = str5;
                        objD = obj;
                        r12 = bk41VarArr5;
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z = this.e;
                        String str6 = (String) this.h;
                        bk41[] bk41VarArr7 = this.c;
                        smc0Var = (smc0) this.i;
                        smc0Var2 = (List) this.g;
                        bk41[] bk41VarArr8 = this.b;
                        hm5.M(obj);
                        str2 = str6;
                        objB = obj;
                        r2 = bk41VarArr7;
                        r4 = bk41VarArr8;
                        r8 = z;
                    }
                    smc0Var.add(objB);
                    r2[r8] = new bk41(str2, k4p1.k(smc0Var2));
                    return p7h.M((Object[]) r4);
                }
                hm5.M(obj);
                ?? r14 = new bk41[2];
                str = "riveBackground";
                if (storyCard.r().E()) {
                    bju bjuVar = g7m1Var.b;
                    us0 us0Var = new us0(g7m1Var, cfgVar, (lnm) null, (byte) 17);
                    this.b = r14;
                    this.g = r14;
                    this.d = "riveBackground";
                    this.f = (byte) 1;
                    objD = bjuVar.d("background", us0Var, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                    r13 = r14;
                    r12 = r14;
                } else {
                    String strO = storyCard.o();
                    if (strO == null || ihc1.y0(strO)) {
                        strO = null;
                    }
                    orb1Var = new orb1(strO != null ? ror0.d(strO) : u7h.j);
                    r1 = r14;
                    r11 = r14;
                }
                r1[0] = new bk41(str, Collections.singletonList(orb1Var));
                smc0VarN = k4p1.n();
                if (storyCard.r().F() && pwo1.v(peVar, cfgVar.b)) {
                    smc0VarN.add(new p7x((int) storyCard.r().o()));
                }
                gw70 gw70Var = cfgVar.c;
                woa woaVar = cfgVar.e;
                bih1 bih1Var = cfgVar.f;
                this.b = r11;
                this.g = smc0VarN;
                this.d = null;
                this.i = smc0VarN;
                this.c = r11;
                str2 = "foreground";
                this.h = "foreground";
                this.e = true;
                this.f = (byte) 2;
                objB = cfgVar.b(g7m1Var, peVar, gw70Var, woaVar, bih1Var, this);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                smc0Var = smc0VarN;
                smc0Var2 = smc0Var;
                ?? r6 = r11;
                r4 = r6;
                r2 = r6;
                smc0Var.add(objB);
                r2[r8] = new bk41(str2, k4p1.k(smc0Var2));
                return p7h.M((Object[]) r4);
                mmr0 mmr0Var = (mmr0) objD;
                orb1Var = new ej31((wj31) mmr0Var.a, (List) mmr0Var.b, (Map) null, new weg(g7m1Var, (byte) 0), 10);
                r1 = r12;
                r11 = r13;
                r1[0] = new bk41(str, Collections.singletonList(orb1Var));
                smc0VarN = k4p1.n();
                if (storyCard.r().F()) {
                    smc0VarN.add(new p7x((int) storyCard.r().o()));
                }
                gw70 gw70Var2 = cfgVar.c;
                woa woaVar2 = cfgVar.e;
                bih1 bih1Var2 = cfgVar.f;
                this.b = r11;
                this.g = smc0VarN;
                this.d = null;
                this.i = smc0VarN;
                this.c = r11;
                str2 = "foreground";
                this.h = "foreground";
                this.e = true;
                this.f = (byte) 2;
                objB = cfgVar.b(g7m1Var, peVar, gw70Var2, woaVar2, bih1Var2, this);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                smc0Var = smc0VarN;
                smc0Var2 = smc0Var;
                ?? r7 = r11;
                r4 = r7;
                r2 = r7;
                smc0Var.add(objB);
                r2[r8] = new bk41(str2, k4p1.k(smc0Var2));
                return p7h.M((Object[]) r4);
            default:
                vh6 vh6Var = (vh6) obj3;
                SceneTemplate$WrappedTwinContent$GiftCard sceneTemplate$WrappedTwinContent$GiftCard = (SceneTemplate$WrappedTwinContent$GiftCard) obj2;
                byte b3 = this.f;
                if (b3 != 0) {
                    if (b3 == 1) {
                        boolean z2 = this.e;
                        String str7 = this.d;
                        bk41[] bk41VarArr9 = this.c;
                        bk41[] bk41VarArr10 = this.b;
                        hm5.M(obj);
                        bk41VarArr2 = bk41VarArr10;
                        bk41VarArr = bk41VarArr9;
                        str3 = str7;
                        r3 = z2;
                        objQ = obj;
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z3 = this.e;
                        txg1 txg1Var = (txg1) this.g;
                        str4 = this.d;
                        bk41VarArr4 = this.c;
                        bk41VarArr3 = this.b;
                        hm5.M(obj);
                        vu30Var = txg1Var;
                        r5 = z3;
                        objQ2 = obj;
                    }
                    bk41VarArr4[r5] = new bk41(str4, Collections.singletonList(new jye1(new wxg1(vu30Var, (yj41) objQ2, new txg1(sceneTemplate$WrappedTwinContent$GiftCard, (byte) 1), new txg1(sceneTemplate$WrappedTwinContent$GiftCard, (byte) 2), new txg1(sceneTemplate$WrappedTwinContent$GiftCard, (byte) 3)), pwo1.v(vh6Var.b, vh6Var.c), new j4f1(vh6Var, (byte) 23))));
                    return p7h.M(bk41VarArr3);
                }
                hm5.M(obj);
                bk41[] bk41VarArr11 = new bk41[2];
                s2t s2tVar = (s2t) this.h;
                this.b = bk41VarArr11;
                this.c = bk41VarArr11;
                this.d = "twinGiftBackgroundLayer";
                this.e = false;
                this.f = (byte) 1;
                objQ = s2tVar.Q(this);
                if (objQ == d9nVar) {
                    return d9nVar;
                }
                bk41VarArr = bk41VarArr11;
                bk41VarArr2 = bk41VarArr;
                str3 = "twinGiftBackgroundLayer";
                r3 = 0;
                bk41VarArr[r3] = new bk41(str3, Collections.singletonList(objQ));
                vu30 txg1Var2 = new txg1(sceneTemplate$WrappedTwinContent$GiftCard, (byte) 0);
                s2t s2tVar2 = (s2t) this.i;
                this.b = bk41VarArr2;
                this.c = bk41VarArr2;
                str4 = "twinGiftLayer";
                this.d = "twinGiftLayer";
                this.g = txg1Var2;
                this.e = true;
                this.f = (byte) 2;
                objQ2 = s2tVar2.Q(this);
                if (objQ2 == d9nVar) {
                    return d9nVar;
                }
                vu30Var = txg1Var2;
                r5 = 1;
                bk41VarArr3 = bk41VarArr2;
                bk41VarArr4 = bk41VarArr3;
                bk41VarArr4[r5] = new bk41(str4, Collections.singletonList(new jye1(new wxg1(vu30Var, (yj41) objQ2, new txg1(sceneTemplate$WrappedTwinContent$GiftCard, (byte) 1), new txg1(sceneTemplate$WrappedTwinContent$GiftCard, (byte) 2), new txg1(sceneTemplate$WrappedTwinContent$GiftCard, (byte) 3)), pwo1.v(vh6Var.b, vh6Var.c), new j4f1(vh6Var, (byte) 23))));
                return p7h.M(bk41VarArr3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeg(g7m1 g7m1Var, cfg cfgVar, lnm lnmVar) {
        super(1, lnmVar);
        this.t = g7m1Var;
        this.X = cfgVar;
    }
}
