package p;

import com.spotify.wrapped.v1.proto.AudioPreview;
import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vh6 implements a3k {
    public final /* synthetic */ byte a;
    public final pe b;
    public final tjs0 c;
    public final Object d;
    public final cxc e;
    public final ti31 f;
    public final kj31 g;
    public final Object h;

    public vh6(pe peVar, tjs0 tjs0Var, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, xgm1 xgm1Var) {
        this.a = (byte) 3;
        this.b = peVar;
        this.c = tjs0Var;
        this.f = ti31Var;
        this.g = kj31Var;
        this.e = cxcVar;
        this.d = xgm1Var;
        this.h = new ConcurrentHashMap();
    }

    public final Object a(Object obj, onm onmVar) {
        switch (this.a) {
            case 0:
                return b((g7m1) obj, onmVar);
            case 1:
                return b((g7m1) obj, onmVar);
            case 2:
                return smo1.s(new vxg1(obj, (Object) this, (lnm) null, (byte) 0), onmVar);
            default:
                return b((g7m1) obj, onmVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x040c  */
    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:111:0x042a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0432  */
    /* JADX WARN: Code duplicated, block: B:115:0x043a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0442  */
    /* JADX WARN: Code duplicated, block: B:120:0x045b A[LOOP:0: B:118:0x0455->B:120:0x045b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0484 A[LOOP:1: B:122:0x047e->B:124:0x0484, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:133:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x04de  */
    /* JADX WARN: Code duplicated, block: B:138:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0527  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0224  */
    /* JADX WARN: Code duplicated, block: B:86:0x031f  */
    public Object b(g7m1 g7m1Var, lnm lnmVar) {
        ph6 ph6Var;
        boolean zE;
        ph6 ph6Var2;
        jfe jfeVar;
        g7m1 g7m1Var2;
        SceneTemplate.ArtistCardsContent.Card2 card2;
        boolean z;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        SceneTemplate.ArtistCardsContent.Card2 card3;
        g7m1 g7m1Var3;
        qj41 qj41Var;
        zyq0 zyq0Var;
        yj41 yj41Var;
        List list;
        uh6 uh6Var;
        uh6 uh6Var2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        AudioPreview audioPreviewP;
        String url;
        rx7 rx7Var;
        int i3;
        int i4;
        nuq0 nuq0Var;
        SceneTemplate.OutroContent.WrapUpCard wrapUpCardZ;
        Paragraph paragraphR;
        Paragraph paragraphQ;
        boolean z4;
        mim1 mim1Var;
        nuq0 nuq0Var2;
        yj41 yj41Var2;
        SceneTemplate.OutroContent.WrapUpCard wrapUpCard;
        boolean z5;
        Object ve8Var;
        jyg1 jyg1Var;
        ayg1 ayg1Var;
        gyg1 gyg1Var;
        g7m1 g7m1Var4;
        SceneTemplate.WrappedTwinContent.SearchingCard searchingCard;
        boolean z6;
        wen0 wen0Var;
        azg1 azg1Var;
        int i5;
        wj31 wj31Var;
        int i6;
        List list2;
        qk41 ok41Var;
        g7m1 g7m1Var5 = g7m1Var;
        byte b = this.a;
        u3k u3kVar = u3k.a;
        Object obj = this.h;
        tjs0 tjs0Var = this.c;
        pe peVar = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof ph6) {
                    ph6Var = (ph6) lnmVar;
                    int i7 = ph6Var.t;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ph6Var.t = i7 - Integer.MIN_VALUE;
                    } else {
                        ph6Var = new ph6(this, (onm) lnmVar);
                    }
                } else {
                    ph6Var = new ph6(this, (onm) lnmVar);
                }
                Object objB = ph6Var.h;
                int i8 = ph6Var.t;
                if (i8 != 0) {
                    if (i8 == 1) {
                        boolean z7 = ph6Var.g;
                        boolean z8 = ph6Var.f;
                        i = ph6Var.e;
                        jfe jfeVar2 = ph6Var.c;
                        SceneTemplate.ArtistCardsContent.Card2 card4 = ph6Var.b;
                        g7m1 g7m1Var6 = ph6Var.a;
                        hm5.M(objB);
                        zE = z8;
                        jfeVar = jfeVar2;
                        g7m1Var2 = g7m1Var6;
                        z = z7;
                        card2 = card4;
                        ph6Var2 = ph6Var;
                    } else if (i8 == 2) {
                        boolean z9 = ph6Var.g;
                        boolean z10 = ph6Var.f;
                        int i9 = ph6Var.e;
                        qj41 qj41Var2 = ph6Var.d;
                        jfe jfeVar3 = ph6Var.c;
                        card3 = ph6Var.b;
                        g7m1Var3 = ph6Var.a;
                        hm5.M(objB);
                        z2 = z9;
                        z3 = z10;
                        i2 = i9;
                        qj41Var = qj41Var2;
                        jfeVar = jfeVar3;
                        ph6Var2 = ph6Var;
                        yvg1 yvg1Var = (yvg1) objB;
                        zyq0Var = (zyq0) yvg1Var.a;
                        yj41Var = (yj41) yvg1Var.b;
                        list = (List) yvg1Var.c;
                        if (!list.isEmpty()) {
                            eg.m("No artist cards could be converted for the reveal card");
                            return null;
                        }
                        uh6 uh6Var3 = new uh6(card3, (byte) 0);
                        uh6 uh6Var4 = new uh6(card3, (byte) 1);
                        uh6 uh6Var5 = new uh6(card3, (byte) 2);
                        uh6 uh6Var6 = new uh6(card3, (byte) 3);
                        if (card3.L()) {
                            uh6Var = new uh6(card3, (byte) 4);
                        } else {
                            uh6Var = null;
                        }
                        if (card3.K()) {
                            uh6Var2 = new uh6(card3, (byte) 5);
                        } else {
                            uh6Var2 = null;
                        }
                        List list3 = list;
                        arrayList = new ArrayList(q7h.U(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((yqz0) it.next()).a);
                        }
                        c380 c380VarA = mqo1.A(arrayList);
                        arrayList2 = new ArrayList(q7h.U(list3, 10));
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((yqz0) it2.next()).b);
                        }
                        c380 c380VarA2 = mqo1.A(arrayList2);
                        audioPreviewP = card3.p();
                        url = audioPreviewP.getUrl();
                        if (url.length() == 0) {
                            url = null;
                        }
                        if (url != null) {
                            rx7Var = new rx7(url, u3k.m(audioPreviewP), u3k.j(audioPreviewP));
                        } else {
                            rx7Var = null;
                        }
                        String id = g7m1Var3.a.getId();
                        String strI = card3.I();
                        String strX = card3.x();
                        String strS = card3.s();
                        String strV = card3.v();
                        if (card3.t()) {
                            i3 = 3;
                        } else {
                            i3 = 0;
                        }
                        if (card3.t()) {
                            i4 = 4;
                        } else {
                            i4 = 0;
                        }
                        th6 th6Var = new th6(qj41Var, new wh6(uh6Var3, uh6Var4, uh6Var5, uh6Var6, uh6Var, uh6Var2, zyq0Var, yj41Var, c380VarA, c380VarA2, rx7Var, id, strI, strX, strS, strV, z3, z2, i3, i4, card3.u(), new i26(jfeVar, (byte) 6)), this, null, (byte) 0);
                        ph6Var2.a = null;
                        ph6Var2.b = null;
                        ph6Var2.c = null;
                        ph6Var2.d = null;
                        ph6Var2.e = i2;
                        ph6Var2.f = z3;
                        ph6Var2.g = z2;
                        ph6Var2.t = 3;
                        objB = u3kVar.a(th6Var, ph6Var2);
                        if (objB == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i8 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objB);
                    }
                    return (wj41) objB;
                }
                hm5.M(objB);
                SceneTemplate.ArtistCardsContent.Card2 card2P = g7m1Var5.a.q().p();
                zE = peVar.e();
                boolean zV = pwo1.v(peVar, tjs0Var);
                jfe jfeVarA = mno1.a(-2, 0, 6);
                RiveAnimation riveAnimationQ = card2P.q();
                v72 v72Var = new v72(jfeVarA, (byte) 17);
                ph6Var.a = g7m1Var5;
                ph6Var.b = card2P;
                ph6Var.c = jfeVarA;
                ph6Var.e = 0;
                ph6Var.f = zE;
                ph6Var.g = zV;
                ph6Var.t = 1;
                ph6Var2 = ph6Var;
                jfeVar = jfeVarA;
                objB = u3k.a.b(riveAnimationQ, g7m1Var5, this.f, this.g, this.e, v72Var, "background", z6x.a, b7x.a, ph6Var2);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                g7m1Var2 = g7m1Var;
                card2 = card2P;
                z = zV;
                i = 0;
                qj41 qj41Var3 = (qj41) objB;
                i2 = i;
                sh6 sh6Var = new sh6(card2, this, g7m1Var2, (lnm) null, (byte) 0);
                ph6Var2.a = g7m1Var2;
                ph6Var2.b = card2;
                ph6Var2.c = jfeVar;
                ph6Var2.d = qj41Var3;
                ph6Var2.e = i2;
                ph6Var2.f = zE;
                ph6Var2.g = z;
                ph6Var2.t = 2;
                objB = smo1.s(sh6Var, ph6Var2);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                z2 = z;
                z3 = zE;
                card3 = card2;
                g7m1Var3 = g7m1Var2;
                qj41Var = qj41Var3;
                yvg1 yvg1Var2 = (yvg1) objB;
                zyq0Var = (zyq0) yvg1Var2.a;
                yj41Var = (yj41) yvg1Var2.b;
                list = (List) yvg1Var2.c;
                if (!list.isEmpty()) {
                    eg.m("No artist cards could be converted for the reveal card");
                    return null;
                }
                uh6 uh6Var7 = new uh6(card3, (byte) 0);
                uh6 uh6Var8 = new uh6(card3, (byte) 1);
                uh6 uh6Var9 = new uh6(card3, (byte) 2);
                uh6 uh6Var10 = new uh6(card3, (byte) 3);
                if (card3.L()) {
                    uh6Var = new uh6(card3, (byte) 4);
                } else {
                    uh6Var = null;
                }
                if (card3.K()) {
                    uh6Var2 = new uh6(card3, (byte) 5);
                } else {
                    uh6Var2 = null;
                }
                List list4 = list;
                arrayList = new ArrayList(q7h.U(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((yqz0) it.next()).a);
                }
                c380 c380VarA3 = mqo1.A(arrayList);
                arrayList2 = new ArrayList(q7h.U(list4, 10));
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((yqz0) it2.next()).b);
                }
                c380 c380VarA4 = mqo1.A(arrayList2);
                audioPreviewP = card3.p();
                url = audioPreviewP.getUrl();
                if (url.length() == 0) {
                    url = null;
                }
                if (url != null) {
                    rx7Var = new rx7(url, u3k.m(audioPreviewP), u3k.j(audioPreviewP));
                } else {
                    rx7Var = null;
                }
                String id2 = g7m1Var3.a.getId();
                String strI2 = card3.I();
                String strX2 = card3.x();
                String strS2 = card3.s();
                String strV2 = card3.v();
                if (card3.t()) {
                    i3 = 3;
                } else {
                    i3 = 0;
                }
                if (card3.t()) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                th6 th6Var2 = new th6(qj41Var, new wh6(uh6Var7, uh6Var8, uh6Var9, uh6Var10, uh6Var, uh6Var2, zyq0Var, yj41Var, c380VarA3, c380VarA4, rx7Var, id2, strI2, strX2, strS2, strV2, z3, z2, i3, i4, card3.u(), new i26(jfeVar, (byte) 6)), this, null, (byte) 0);
                ph6Var2.a = null;
                ph6Var2.b = null;
                ph6Var2.c = null;
                ph6Var2.d = null;
                ph6Var2.e = i2;
                ph6Var2.f = z3;
                ph6Var2.g = z2;
                ph6Var2.t = 3;
                objB = u3kVar.a(th6Var2, ph6Var2);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                return (wj41) objB;
            case 1:
                mim1 mim1Var2 = (mim1) obj;
                if (lnmVar instanceof nuq0) {
                    nuq0Var = (nuq0) lnmVar;
                    int i10 = nuq0Var.h;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        nuq0Var.h = i10 - Integer.MIN_VALUE;
                    } else {
                        nuq0Var = new nuq0(this, (onm) lnmVar);
                    }
                } else {
                    nuq0Var = new nuq0(this, (onm) lnmVar);
                }
                Object objA = nuq0Var.f;
                int i11 = nuq0Var.h;
                u3k u3kVar2 = u3k.a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        boolean z11 = nuq0Var.e;
                        paragraphQ = nuq0Var.d;
                        paragraphR = nuq0Var.c;
                        SceneTemplate.OutroContent.WrapUpCard wrapUpCard2 = nuq0Var.b;
                        g7m1 g7m1Var7 = nuq0Var.a;
                        hm5.M(objA);
                        nuq0Var2 = nuq0Var;
                        wrapUpCard = wrapUpCard2;
                        z4 = z11;
                        g7m1Var5 = g7m1Var7;
                        mim1Var = mim1Var2;
                    } else {
                        if (i11 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objA);
                    }
                    return objA;
                }
                hm5.M(objA);
                wrapUpCardZ = g7m1Var5.a.q().z();
                boolean zV2 = pwo1.v(peVar, tjs0Var);
                paragraphR = wrapUpCardZ.r();
                paragraphQ = wrapUpCardZ.q();
                if (zV2) {
                    kkz0 kkz0Var = new kkz0(new x990(paragraphR, (byte) 2), new x990(paragraphQ, (byte) 3), zV2, new Integer(2000), mim1Var2, 8);
                    nuq0Var2 = nuq0Var;
                    z5 = zV2;
                    ve8Var = kkz0Var;
                } else {
                    z4 = zV2;
                    mim1Var = mim1Var2;
                    if (wrapUpCardZ.s()) {
                        Image imageO = wrapUpCardZ.o();
                        gw70 gw70Var = (gw70) this.d;
                        bju bjuVar = g7m1Var5.b;
                        nuq0Var.a = g7m1Var5;
                        nuq0Var.b = wrapUpCardZ;
                        nuq0Var.c = paragraphR;
                        nuq0Var.d = paragraphQ;
                        nuq0Var.e = z4;
                        nuq0Var.h = 1;
                        nuq0 nuq0Var3 = nuq0Var;
                        Object objL = u3kVar2.l(imageO, gw70Var, bjuVar, "outroWrapUpReducedMotionImage", nuq0Var3);
                        nuq0Var2 = nuq0Var3;
                        if (objL == d9nVar) {
                            return d9nVar;
                        }
                        wrapUpCard = wrapUpCardZ;
                        objA = objL;
                    } else {
                        nuq0Var2 = nuq0Var;
                        yj41Var2 = null;
                    }
                    boolean z12 = z4;
                    ve8Var = new ve8(new x990(paragraphR, (byte) 4), new x990(paragraphQ, (byte) 5), yj41Var2, mim1Var);
                    z5 = z12;
                }
                xa90 xa90Var = new xa90(wrapUpCardZ, g7m1Var5, this, z5, ve8Var, null, (byte) 3);
                nuq0Var2.a = null;
                nuq0Var2.b = null;
                nuq0Var2.c = null;
                nuq0Var2.d = null;
                nuq0Var2.e = z5;
                nuq0Var2.h = 2;
                objA = u3kVar2.a(xa90Var, nuq0Var2);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                return objA;
                yj41Var2 = (yj41) objA;
                wrapUpCardZ = wrapUpCard;
                boolean z13 = z4;
                ve8Var = new ve8(new x990(paragraphR, (byte) 4), new x990(paragraphQ, (byte) 5), yj41Var2, mim1Var);
                z5 = z13;
                xa90 xa90Var2 = new xa90(wrapUpCardZ, g7m1Var5, this, z5, ve8Var, null, (byte) 3);
                nuq0Var2.a = null;
                nuq0Var2.b = null;
                nuq0Var2.c = null;
                nuq0Var2.d = null;
                nuq0Var2.e = z5;
                nuq0Var2.h = 2;
                objA = u3kVar2.a(xa90Var2, nuq0Var2);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                return objA;
            default:
                if (lnmVar instanceof jyg1) {
                    jyg1Var = (jyg1) lnmVar;
                    int i12 = jyg1Var.Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        jyg1Var.Z = i12 - Integer.MIN_VALUE;
                    } else {
                        jyg1Var = new jyg1(this, (onm) lnmVar);
                    }
                } else {
                    jyg1Var = new jyg1(this, (onm) lnmVar);
                }
                jyg1 jyg1Var2 = jyg1Var;
                Object objD = jyg1Var2.X;
                int i13 = jyg1Var2.Z;
                if (i13 == 0) {
                    hm5.M(objD);
                    SceneTemplate.WrappedTwinContent.SearchingCard searchingCardQ = g7m1Var5.a.q().Q();
                    boolean zV3 = pwo1.v(peVar, tjs0Var);
                    azg1 azg1Var2 = (azg1) ((ConcurrentHashMap) obj).computeIfAbsent(g7m1Var5.a.getId(), azt.j);
                    wen0 wen0VarB = gio1.b(Boolean.FALSE);
                    ayg1 ayg1Var2 = new ayg1();
                    gyg1 gyg1Var2 = new gyg1(new sxg1(new nyg1(searchingCardQ), new oyg1(searchingCardQ)), new sxg1(new pyg1(searchingCardQ), new qyg1(searchingCardQ)), new sxg1(new ryg1(searchingCardQ), new syg1(searchingCardQ)), new sxg1(new tyg1(searchingCardQ), new uyg1(searchingCardQ)), searchingCardQ.w() ? new sxg1(new vyg1(searchingCardQ), new myg1(searchingCardQ)) : null);
                    bju bjuVar2 = g7m1Var5.b;
                    kyg1 kyg1Var = new kyg1(searchingCardQ, this, null, (byte) 0);
                    jyg1Var2.a = g7m1Var5;
                    jyg1Var2.b = searchingCardQ;
                    jyg1Var2.c = wen0VarB;
                    jyg1Var2.d = azg1Var2;
                    jyg1Var2.e = ayg1Var2;
                    jyg1Var2.f = gyg1Var2;
                    jyg1Var2.i = 0;
                    jyg1Var2.t = zV3;
                    jyg1Var2.Z = 1;
                    Object objD2 = bjuVar2.d("twinSearchForeground", kyg1Var, jyg1Var2);
                    if (objD2 == d9nVar) {
                        return d9nVar;
                    }
                    ayg1Var = ayg1Var2;
                    gyg1Var = gyg1Var2;
                    g7m1Var4 = g7m1Var5;
                    searchingCard = searchingCardQ;
                    z6 = zV3;
                    wen0Var = wen0VarB;
                    objD = objD2;
                    azg1Var = azg1Var2;
                    i5 = 0;
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            z6 = jyg1Var2.t;
                            int i14 = jyg1Var2.i;
                            List list5 = jyg1Var2.h;
                            wj31Var = jyg1Var2.g;
                            gyg1Var = jyg1Var2.f;
                            ayg1Var = jyg1Var2.e;
                            azg1Var = jyg1Var2.d;
                            wen0Var = jyg1Var2.c;
                            searchingCard = jyg1Var2.b;
                            hm5.M(objD);
                            i6 = i14;
                            list2 = list5;
                            azg1 azg1Var3 = azg1Var;
                            SceneTemplate.WrappedTwinContent.SearchingCard searchingCard2 = searchingCard;
                            mmr0 mmr0Var = (mmr0) objD;
                            wj31 wj31Var2 = (wj31) mmr0Var.a;
                            List list6 = (List) mmr0Var.b;
                            if (z6) {
                                ok41Var = new ok41(1866);
                            } else {
                                ok41Var = nk41.a;
                            }
                            lyg1 lyg1Var = new lyg1(new zyg1(azg1Var3, ok41Var, new wyg1(wen0Var, (byte) 0), new e971(list6, wj31Var2, wen0Var, ayg1Var), new ts11(z6, gyg1Var, wj31Var, list2, searchingCard2, wen0Var, ayg1Var, this, azg1Var3)), null, (byte) 0);
                            jyg1Var2.a = null;
                            jyg1Var2.b = null;
                            jyg1Var2.c = null;
                            jyg1Var2.d = null;
                            jyg1Var2.e = null;
                            jyg1Var2.f = null;
                            jyg1Var2.g = null;
                            jyg1Var2.h = null;
                            jyg1Var2.i = i6;
                            jyg1Var2.t = z6;
                            jyg1Var2.Z = 3;
                            objD = u3kVar.a(lyg1Var, jyg1Var2);
                            if (objD == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (i13 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            List list7 = jyg1Var2.h;
                            hm5.M(objD);
                        }
                        return (wj41) objD;
                    }
                    z6 = jyg1Var2.t;
                    i5 = jyg1Var2.i;
                    gyg1 gyg1Var3 = jyg1Var2.f;
                    ayg1 ayg1Var3 = jyg1Var2.e;
                    azg1 azg1Var4 = jyg1Var2.d;
                    wen0 wen0Var2 = jyg1Var2.c;
                    SceneTemplate.WrappedTwinContent.SearchingCard searchingCard3 = jyg1Var2.b;
                    g7m1Var4 = jyg1Var2.a;
                    hm5.M(objD);
                    wen0Var = wen0Var2;
                    searchingCard = searchingCard3;
                    ayg1Var = ayg1Var3;
                    azg1Var = azg1Var4;
                    gyg1Var = gyg1Var3;
                }
                mmr0 mmr0Var2 = (mmr0) objD;
                wj31Var = (wj31) mmr0Var2.a;
                List list8 = (List) mmr0Var2.b;
                if (ihc1.y0(searchingCard.n().getUrl())) {
                    hhg1.n("Background scene requires a non-blank Rive URL");
                    return null;
                }
                bju bjuVar3 = g7m1Var4.b;
                kyg1 kyg1Var2 = new kyg1(searchingCard, this, null, (byte) 1);
                jyg1Var2.a = null;
                jyg1Var2.b = searchingCard;
                jyg1Var2.c = wen0Var;
                jyg1Var2.d = azg1Var;
                jyg1Var2.e = ayg1Var;
                jyg1Var2.f = gyg1Var;
                jyg1Var2.g = wj31Var;
                jyg1Var2.h = list8;
                jyg1Var2.i = i5;
                jyg1Var2.t = z6;
                jyg1Var2.Z = 2;
                objD = bjuVar3.d("twinSearchBackground", kyg1Var2, jyg1Var2);
                if (objD == d9nVar) {
                    return d9nVar;
                }
                i6 = i5;
                list2 = list8;
                azg1 azg1Var5 = azg1Var;
                SceneTemplate.WrappedTwinContent.SearchingCard searchingCard4 = searchingCard;
                mmr0 mmr0Var3 = (mmr0) objD;
                wj31 wj31Var3 = (wj31) mmr0Var3.a;
                List list9 = (List) mmr0Var3.b;
                if (z6) {
                    ok41Var = new ok41(1866);
                } else {
                    ok41Var = nk41.a;
                }
                lyg1 lyg1Var2 = new lyg1(new zyg1(azg1Var5, ok41Var, new wyg1(wen0Var, (byte) 0), new e971(list9, wj31Var3, wen0Var, ayg1Var), new ts11(z6, gyg1Var, wj31Var, list2, searchingCard4, wen0Var, ayg1Var, this, azg1Var5)), null, (byte) 0);
                jyg1Var2.a = null;
                jyg1Var2.b = null;
                jyg1Var2.c = null;
                jyg1Var2.d = null;
                jyg1Var2.e = null;
                jyg1Var2.f = null;
                jyg1Var2.g = null;
                jyg1Var2.h = null;
                jyg1Var2.i = i6;
                jyg1Var2.t = z6;
                jyg1Var2.Z = 3;
                objD = u3kVar.a(lyg1Var2, jyg1Var2);
                if (objD == d9nVar) {
                    return d9nVar;
                }
                return (wj41) objD;
        }
    }

    public vh6(pe peVar, tjs0 tjs0Var, gw70 gw70Var, cxc cxcVar, ti31 ti31Var, kj31 kj31Var, mim1 mim1Var) {
        this.a = (byte) 1;
        this.b = peVar;
        this.c = tjs0Var;
        this.d = gw70Var;
        this.e = cxcVar;
        this.f = ti31Var;
        this.g = kj31Var;
        this.h = mim1Var;
    }

    public vh6(pe peVar, cxc cxcVar, gw70 gw70Var, tjs0 tjs0Var, ti31 ti31Var, kj31 kj31Var, xgm1 xgm1Var) {
        this.a = (byte) 2;
        this.b = peVar;
        this.c = tjs0Var;
        this.d = gw70Var;
        this.f = ti31Var;
        this.g = kj31Var;
        this.e = cxcVar;
        this.h = xgm1Var;
    }

    public vh6(gw70 gw70Var, ti31 ti31Var, kj31 kj31Var, pe peVar, tjs0 tjs0Var, cxc cxcVar, xf6 xf6Var) {
        this.a = (byte) 0;
        this.d = gw70Var;
        this.f = ti31Var;
        this.g = kj31Var;
        this.b = peVar;
        this.c = tjs0Var;
        this.e = cxcVar;
        this.h = xf6Var;
    }
}
