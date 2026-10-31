package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.SceneTemplate$RelationshipStatusContent$Card2;
import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedPlacesContent$Card1;
import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedTwinContent$IntroCard;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class se8 implements a3k {
    public final /* synthetic */ byte a;
    public final pe b;
    public final tjs0 c;
    public final ti31 d;
    public final kj31 e;
    public final cxc f;

    public se8(pe peVar, tjs0 tjs0Var, cxc cxcVar, ti31 ti31Var, kj31 kj31Var) {
        this.a = (byte) 2;
        this.b = peVar;
        this.c = tjs0Var;
        this.f = cxcVar;
        this.d = ti31Var;
        this.e = kj31Var;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, onm onmVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return b((g7m1) obj, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:134:0x0328  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:98:0x0260  */
    public final Object b(g7m1 g7m1Var, lnm lnmVar) {
        pe8 pe8Var;
        SceneTemplate.AudiobooksContent.Card2 card2;
        bju bjuVar;
        int i;
        int i2;
        qj41 qj41Var;
        gf8 gf8Var;
        SceneTemplate.AudiobooksContent.Card3 card3;
        int i3;
        rhd0 rhd0Var;
        SceneTemplate.ListeningAgeContent.Card1 card1;
        int i4;
        atj0 atj0Var;
        se8 se8Var;
        SceneTemplate.MinutesListenedContent.Reveal reveal;
        int i5;
        qj41 qj41Var2;
        int i6;
        zn11 zn11Var;
        SceneTemplate$RelationshipStatusContent$Card2 sceneTemplate$RelationshipStatusContent$Card2;
        byg1 byg1Var;
        byg1 byg1Var2;
        SceneTemplate$WrappedTwinContent$IntroCard sceneTemplate$WrappedTwinContent$IntroCard;
        boolean z;
        ayg1 ayg1Var;
        edm1 edm1Var;
        SceneTemplate$WrappedPlacesContent$Card1 sceneTemplate$WrappedPlacesContent$Card1;
        g7m1 g7m1Var2 = g7m1Var;
        byte b = this.a;
        int i7 = 0;
        d9n d9nVar = d9n.a;
        u3k u3kVar = u3k.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof pe8) {
                    pe8Var = (pe8) lnmVar;
                    int i8 = pe8Var.g;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        pe8Var.g = i8 - Integer.MIN_VALUE;
                    } else {
                        pe8Var = new pe8(this, (onm) lnmVar);
                    }
                } else {
                    pe8Var = new pe8(this, (onm) lnmVar);
                }
                pe8 pe8Var2 = pe8Var;
                Object objD = pe8Var2.e;
                int i9 = pe8Var2.g;
                if (i9 != 0) {
                    if (i9 == 1) {
                        i = pe8Var2.d;
                        bjuVar = pe8Var2.b;
                        card2 = pe8Var2.a;
                        hm5.M(objD);
                    } else if (i9 == 2) {
                        int i10 = pe8Var2.d;
                        qj41 qj41Var3 = pe8Var2.c;
                        card2 = pe8Var2.a;
                        hm5.M(objD);
                        i2 = i10;
                        qj41Var = qj41Var3;
                        mmr0 mmr0Var = (mmr0) objD;
                        re8 re8Var = new re8(qj41Var, this, card2, (wj31) mmr0Var.a, (List) mmr0Var.b, (lnm) null);
                        pe8Var2.a = null;
                        pe8Var2.b = null;
                        pe8Var2.c = null;
                        pe8Var2.d = i2;
                        pe8Var2.g = 3;
                        objD = u3kVar.a(re8Var, pe8Var2);
                        if (objD == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i9 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objD);
                    }
                    return (wj41) objD;
                }
                hm5.M(objD);
                SceneTemplate.AudiobooksContent.Card2 card2Q = g7m1Var2.a.q().q();
                bju bjuVar2 = g7m1Var2.b;
                RiveAnimation riveAnimationO = card2Q.o();
                pe8Var2.a = card2Q;
                pe8Var2.b = bjuVar2;
                pe8Var2.d = 0;
                pe8Var2.g = 1;
                objD = u3k.d(riveAnimationO, g7m1Var2, this.d, this.e, this.f, null, null, pe8Var2, 224);
                if (objD == d9nVar) {
                    return d9nVar;
                }
                card2 = card2Q;
                bjuVar = bjuVar2;
                i = 0;
                qj41 qj41Var4 = (qj41) objD;
                us0 us0Var = new us0(card2, this, (lnm) null, (byte) 4);
                pe8Var2.a = card2;
                pe8Var2.b = null;
                pe8Var2.c = qj41Var4;
                pe8Var2.d = i;
                pe8Var2.g = 2;
                Object objD2 = bjuVar.d("cover_reveal", us0Var, pe8Var2);
                if (objD2 == d9nVar) {
                    return d9nVar;
                }
                i2 = i;
                qj41Var = qj41Var4;
                objD = objD2;
                mmr0 mmr0Var2 = (mmr0) objD;
                re8 re8Var2 = new re8(qj41Var, this, card2, (wj31) mmr0Var2.a, (List) mmr0Var2.b, (lnm) null);
                pe8Var2.a = null;
                pe8Var2.b = null;
                pe8Var2.c = null;
                pe8Var2.d = i2;
                pe8Var2.g = 3;
                objD = u3kVar.a(re8Var2, pe8Var2);
                if (objD == d9nVar) {
                    return d9nVar;
                }
                return (wj41) objD;
            case 1:
                if (lnmVar instanceof gf8) {
                    gf8Var = (gf8) lnmVar;
                    int i11 = gf8Var.e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        gf8Var.e = i11 - Integer.MIN_VALUE;
                    } else {
                        gf8Var = new gf8(this, (onm) lnmVar);
                    }
                } else {
                    gf8Var = new gf8(this, (onm) lnmVar);
                }
                gf8 gf8Var2 = gf8Var;
                Object objD3 = gf8Var2.c;
                int i12 = gf8Var2.e;
                if (i12 != 0) {
                    if (i12 == 1) {
                        int i13 = gf8Var2.b;
                        SceneTemplate.AudiobooksContent.Card3 card4 = gf8Var2.a;
                        hm5.M(objD3);
                        i3 = i13;
                        card3 = card4;
                    } else {
                        if (i12 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objD3);
                    }
                    return (wj41) objD3;
                }
                hm5.M(objD3);
                SceneTemplate.AudiobooksContent.Card3 card3R = g7m1Var2.a.q().r();
                RiveAnimation riveAnimationN = card3R.n();
                gf8Var2.a = card3R;
                gf8Var2.b = 0;
                gf8Var2.e = 1;
                objD3 = u3k.d(riveAnimationN, g7m1Var2, this.d, this.e, this.f, null, null, gf8Var2, 224);
                if (objD3 == d9nVar) {
                    return d9nVar;
                }
                card3 = card3R;
                i3 = 0;
                th6 th6Var = new th6((qj41) objD3, this, card3, null, (byte) 1);
                gf8Var2.a = null;
                gf8Var2.b = i3;
                gf8Var2.e = 2;
                objD3 = u3kVar.a(th6Var, gf8Var2);
                if (objD3 == d9nVar) {
                    return d9nVar;
                }
                return (wj41) objD3;
            case 2:
                if (lnmVar instanceof rhd0) {
                    rhd0Var = (rhd0) lnmVar;
                    int i14 = rhd0Var.e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        rhd0Var.e = i14 - Integer.MIN_VALUE;
                    } else {
                        rhd0Var = new rhd0(this, (onm) lnmVar);
                    }
                } else {
                    rhd0Var = new rhd0(this, (onm) lnmVar);
                }
                rhd0 rhd0Var2 = rhd0Var;
                Object objA = rhd0Var2.c;
                int i15 = rhd0Var2.e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        i4 = rhd0Var2.b;
                        SceneTemplate.ListeningAgeContent.Card1 card5 = rhd0Var2.a;
                        hm5.M(objA);
                        card1 = card5;
                    } else {
                        if (i15 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objA);
                    }
                    return (wj41) objA;
                }
                hm5.M(objA);
                SceneTemplate.ListeningAgeContent.Card1 card1P = g7m1Var2.a.p().p();
                bju bjuVar3 = g7m1Var2.b;
                rzu rzuVar = new rzu(card1P, this, (lnm) null, (byte) 27);
                rhd0Var2.a = card1P;
                rhd0Var2.b = 0;
                rhd0Var2.e = 1;
                Object objD4 = bjuVar3.d("intro", rzuVar, rhd0Var2);
                if (objD4 == d9nVar) {
                    return d9nVar;
                }
                card1 = card1P;
                objA = objD4;
                i4 = 0;
                mmr0 mmr0Var3 = (mmr0) objA;
                ke6 ke6Var = new ke6(mmr0Var3.a, mmr0Var3.b, (a3k) this, (Object) card1, (lnm) null, (byte) 1);
                rhd0Var2.a = null;
                rhd0Var2.b = i4;
                rhd0Var2.e = 2;
                objA = u3kVar.a(ke6Var, rhd0Var2);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                return (wj41) objA;
            case 3:
                if (lnmVar instanceof atj0) {
                    atj0Var = (atj0) lnmVar;
                    int i16 = atj0Var.g;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        atj0Var.g = i16 - Integer.MIN_VALUE;
                    } else {
                        atj0Var = new atj0(this, (onm) lnmVar);
                    }
                } else {
                    atj0Var = new atj0(this, (onm) lnmVar);
                }
                atj0 atj0Var2 = atj0Var;
                Object objD5 = atj0Var2.e;
                int i17 = atj0Var2.g;
                if (i17 != 0) {
                    if (i17 == 1) {
                        int i18 = atj0Var2.d;
                        SceneTemplate.MinutesListenedContent.Reveal reveal2 = atj0Var2.b;
                        g7m1 g7m1Var3 = atj0Var2.a;
                        hm5.M(objD5);
                        se8Var = this;
                        i5 = i18;
                        reveal = reveal2;
                        g7m1Var2 = g7m1Var3;
                        qj41Var2 = (qj41) objD5;
                        bju bjuVar4 = g7m1Var2.b;
                        k1e0 k1e0Var = new k1e0(reveal, se8Var, (lnm) null, (byte) 8);
                        atj0Var2.a = null;
                        atj0Var2.b = reveal;
                        atj0Var2.c = qj41Var2;
                        atj0Var2.d = i5;
                        atj0Var2.g = 2;
                        objD5 = bjuVar4.d("countUp", k1e0Var, atj0Var2);
                        if (objD5 == d9nVar) {
                            return d9nVar;
                        }
                        i6 = i5;
                    } else if (i17 == 2) {
                        int i19 = atj0Var2.d;
                        qj41Var2 = atj0Var2.c;
                        reveal = atj0Var2.b;
                        hm5.M(objD5);
                        i6 = i19;
                        se8Var = this;
                    } else {
                        if (i17 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objD5);
                    }
                    return (wj41) objD5;
                }
                hm5.M(objD5);
                SceneTemplate.MinutesListenedContent.Reveal revealY = g7m1Var2.a.q().y();
                if (revealY.q() <= 0) {
                    hhg1.n("MinutesListenedReveal received empty minutes data");
                    return null;
                }
                RiveAnimation riveAnimationR = revealY.r();
                atj0Var2.a = g7m1Var2;
                atj0Var2.b = revealY;
                atj0Var2.d = 0;
                atj0Var2.g = 1;
                se8Var = this;
                objD5 = u3k.d(riveAnimationR, g7m1Var2, this.d, this.e, this.f, null, null, atj0Var2, 224);
                if (objD5 == d9nVar) {
                    return d9nVar;
                }
                reveal = revealY;
                i5 = 0;
                qj41Var2 = (qj41) objD5;
                bju bjuVar5 = g7m1Var2.b;
                k1e0 k1e0Var2 = new k1e0(reveal, se8Var, (lnm) null, (byte) 8);
                atj0Var2.a = null;
                atj0Var2.b = reveal;
                atj0Var2.c = qj41Var2;
                atj0Var2.d = i5;
                atj0Var2.g = 2;
                objD5 = bjuVar5.d("countUp", k1e0Var2, atj0Var2);
                if (objD5 == d9nVar) {
                    return d9nVar;
                }
                i6 = i5;
                mmr0 mmr0Var4 = (mmr0) objD5;
                re8 re8Var3 = new re8(qj41Var2, reveal, (wj31) mmr0Var4.a, (List) mmr0Var4.b, se8Var, (lnm) null);
                atj0Var2.a = null;
                atj0Var2.b = null;
                atj0Var2.c = null;
                atj0Var2.d = i6;
                atj0Var2.g = 3;
                objD5 = u3kVar.a(re8Var3, atj0Var2);
                if (objD5 == d9nVar) {
                    return d9nVar;
                }
                return (wj41) objD5;
            case 4:
                if (lnmVar instanceof zn11) {
                    zn11Var = (zn11) lnmVar;
                    int i20 = zn11Var.d;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        zn11Var.d = i20 - Integer.MIN_VALUE;
                    } else {
                        zn11Var = new zn11(this, (onm) lnmVar);
                    }
                } else {
                    zn11Var = new zn11(this, (onm) lnmVar);
                }
                zn11 zn11Var2 = zn11Var;
                Object objA2 = zn11Var2.b;
                int i21 = zn11Var2.d;
                if (i21 != 0) {
                    if (i21 == 1) {
                        SceneTemplate$RelationshipStatusContent$Card2 sceneTemplate$RelationshipStatusContent$Card3 = zn11Var2.a;
                        hm5.M(objA2);
                        sceneTemplate$RelationshipStatusContent$Card2 = sceneTemplate$RelationshipStatusContent$Card3;
                    } else {
                        if (i21 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objA2);
                    }
                    return objA2;
                }
                hm5.M(objA2);
                SceneTemplate$RelationshipStatusContent$Card2 sceneTemplate$RelationshipStatusContent$Card2A = g7m1Var2.a.q().A();
                bju bjuVar6 = g7m1Var2.b;
                ciw0 ciw0Var = new ciw0(sceneTemplate$RelationshipStatusContent$Card2A, this, (lnm) null, (byte) 8);
                zn11Var2.a = sceneTemplate$RelationshipStatusContent$Card2A;
                zn11Var2.d = 1;
                Object objD6 = bjuVar6.d("relationshipStatusRevealBackground", ciw0Var, zn11Var2);
                if (objD6 == d9nVar) {
                    return d9nVar;
                }
                sceneTemplate$RelationshipStatusContent$Card2 = sceneTemplate$RelationshipStatusContent$Card2A;
                objA2 = objD6;
                mmr0 mmr0Var5 = (mmr0) objA2;
                ke6 ke6Var2 = new ke6(mmr0Var5.a, mmr0Var5.b, (a3k) this, (Object) sceneTemplate$RelationshipStatusContent$Card2, (lnm) null, (byte) 2);
                zn11Var2.a = null;
                zn11Var2.d = 2;
                objA2 = u3kVar.a(ke6Var2, zn11Var2);
                if (objA2 == d9nVar) {
                    return d9nVar;
                }
                return objA2;
            case 5:
                if (lnmVar instanceof byg1) {
                    byg1Var = (byg1) lnmVar;
                    int i22 = byg1Var.g;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        byg1Var.g = i22 - Integer.MIN_VALUE;
                    } else {
                        byg1Var = new byg1(this, (onm) lnmVar);
                    }
                } else {
                    byg1Var = new byg1(this, (onm) lnmVar);
                }
                Object objB = byg1Var.e;
                int i23 = byg1Var.g;
                if (i23 != 0) {
                    if (i23 == 1) {
                        boolean z2 = byg1Var.d;
                        i7 = byg1Var.c;
                        ayg1 ayg1Var2 = byg1Var.b;
                        SceneTemplate$WrappedTwinContent$IntroCard sceneTemplate$WrappedTwinContent$IntroCard2 = byg1Var.a;
                        hm5.M(objB);
                        z = z2;
                        ayg1Var = ayg1Var2;
                        byg1Var2 = byg1Var;
                        sceneTemplate$WrappedTwinContent$IntroCard = sceneTemplate$WrappedTwinContent$IntroCard2;
                    } else {
                        if (i23 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objB);
                    }
                    return (wj41) objB;
                }
                hm5.M(objB);
                SceneTemplate$WrappedTwinContent$IntroCard sceneTemplate$WrappedTwinContent$IntroCardP = g7m1Var2.a.q().P();
                boolean zV = pwo1.v(this.b, this.c);
                ayg1 ayg1Var3 = new ayg1();
                RiveAnimation riveAnimationN2 = sceneTemplate$WrappedTwinContent$IntroCardP.n();
                dyg1 dyg1Var = new dyg1(ayg1Var3, (byte) 0);
                byg1Var.a = sceneTemplate$WrappedTwinContent$IntroCardP;
                byg1Var.b = ayg1Var3;
                byg1Var.c = 0;
                byg1Var.d = zV;
                byg1Var.g = 1;
                byg1Var2 = byg1Var;
                objB = u3k.a.b(riveAnimationN2, g7m1Var2, this.d, this.e, this.f, dyg1Var, "background", z6x.a, b7x.a, byg1Var2);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                sceneTemplate$WrappedTwinContent$IntroCard = sceneTemplate$WrappedTwinContent$IntroCardP;
                z = zV;
                ayg1Var = ayg1Var3;
                l24 l24Var = new l24((qj41) objB, z, ayg1Var, sceneTemplate$WrappedTwinContent$IntroCard, (lnm) null);
                byg1Var2.a = null;
                byg1Var2.b = null;
                byg1Var2.c = i7;
                byg1Var2.d = z;
                byg1Var2.g = 2;
                objB = u3kVar.a(l24Var, byg1Var2);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                return (wj41) objB;
            default:
                if (lnmVar instanceof edm1) {
                    edm1Var = (edm1) lnmVar;
                    int i24 = edm1Var.e;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        edm1Var.e = i24 - Integer.MIN_VALUE;
                    } else {
                        edm1Var = new edm1(this, (onm) lnmVar);
                    }
                } else {
                    edm1Var = new edm1(this, (onm) lnmVar);
                }
                edm1 edm1Var2 = edm1Var;
                Object objA3 = edm1Var2.c;
                int i25 = edm1Var2.e;
                if (i25 != 0) {
                    if (i25 == 1) {
                        i7 = edm1Var2.b;
                        SceneTemplate$WrappedPlacesContent$Card1 sceneTemplate$WrappedPlacesContent$Card2 = edm1Var2.a;
                        hm5.M(objA3);
                        sceneTemplate$WrappedPlacesContent$Card1 = sceneTemplate$WrappedPlacesContent$Card2;
                    } else {
                        if (i25 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objA3);
                    }
                    return (wj41) objA3;
                }
                hm5.M(objA3);
                SceneTemplate$WrappedPlacesContent$Card1 sceneTemplate$WrappedPlacesContent$Card1M = g7m1Var2.a.q().M();
                RiveAnimation riveAnimationN3 = sceneTemplate$WrappedPlacesContent$Card1M.n();
                edm1Var2.a = sceneTemplate$WrappedPlacesContent$Card1M;
                edm1Var2.b = 0;
                edm1Var2.e = 1;
                Object objD7 = u3k.d(riveAnimationN3, g7m1Var2, this.d, this.e, this.f, null, null, edm1Var2, 224);
                if (objD7 == d9nVar) {
                    return d9nVar;
                }
                sceneTemplate$WrappedPlacesContent$Card1 = sceneTemplate$WrappedPlacesContent$Card1M;
                objA3 = objD7;
                th6 th6Var2 = new th6((qj41) objA3, this, sceneTemplate$WrappedPlacesContent$Card1, null, (byte) 7);
                edm1Var2.a = null;
                edm1Var2.b = i7;
                edm1Var2.e = 2;
                objA3 = u3kVar.a(th6Var2, edm1Var2);
                if (objA3 == d9nVar) {
                    return d9nVar;
                }
                return (wj41) objA3;
        }
    }

    public /* synthetic */ se8(pe peVar, tjs0 tjs0Var, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, byte b) {
        this.a = b;
        this.b = peVar;
        this.c = tjs0Var;
        this.d = ti31Var;
        this.e = kj31Var;
        this.f = cxcVar;
    }

    public se8(ti31 ti31Var, kj31 kj31Var, pe peVar, tjs0 tjs0Var, cxc cxcVar) {
        this.a = (byte) 3;
        this.d = ti31Var;
        this.e = kj31Var;
        this.b = peVar;
        this.c = tjs0Var;
        this.f = cxcVar;
    }
}
