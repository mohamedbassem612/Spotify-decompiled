package p;

import android.content.Intent;
import com.spotify.audiorecognition.v1.AudioChunk;
import com.spotify.audiorecognition.v1.AudioRecognitionRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zmj1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ zmj1(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017e  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x022e  */
    /* JADX WARN: Code duplicated, block: B:163:0x027a  */
    /* JADX WARN: Code duplicated, block: B:170:0x028d  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:202:0x0306  */
    /* JADX WARN: Code duplicated, block: B:221:0x0345  */
    /* JADX WARN: Code duplicated, block: B:239:0x038e  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:273:0x0409  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:307:0x048a  */
    /* JADX WARN: Code duplicated, block: B:322:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:337:0x0501  */
    /* JADX WARN: Code duplicated, block: B:352:0x0541  */
    /* JADX WARN: Code duplicated, block: B:367:0x057b  */
    /* JADX WARN: Code duplicated, block: B:387:0x05be  */
    /* JADX WARN: Code duplicated, block: B:406:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:421:0x0639  */
    /* JADX WARN: Code duplicated, block: B:436:0x0677  */
    /* JADX WARN: Code duplicated, block: B:459:0x06df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:477:0x0728  */
    /* JADX WARN: Code duplicated, block: B:492:0x0760  */
    /* JADX WARN: Code duplicated, block: B:543:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        ymj1 ymj1Var;
        anj1 anj1Var;
        hqj1 hqj1Var;
        iqj1 iqj1Var;
        kqj1 kqj1Var;
        k2k1 k2k1Var;
        j3k1 j3k1Var;
        idk1 idk1Var;
        kdk1 kdk1Var;
        ldk1 ldk1Var;
        kek1 kek1Var;
        yik1 yik1Var;
        Object objEmit;
        ook1 ook1Var;
        tok1 tok1Var;
        yok1 yok1Var;
        rvk1 rvk1Var;
        k9l1 k9l1Var;
        l9l1 l9l1Var;
        rgl1 rgl1Var;
        sgl1 sgl1Var;
        l0l l0lVar;
        String strD;
        dol1 dol1Var;
        gol1 gol1Var;
        fpl1 fpl1Var;
        gpl1 gpl1Var;
        hpl1 hpl1Var;
        ipl1 ipl1Var;
        jpl1 jpl1Var;
        byte b = this.a;
        String str = "";
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object objUri = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof ymj1) {
                    ymj1Var = (ymj1) lnmVar;
                    int i = ymj1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ymj1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        ymj1Var = new ymj1(this, lnmVar);
                    }
                } else {
                    ymj1Var = new ymj1(this, lnmVar);
                }
                Object obj2 = ymj1Var.a;
                int i2 = ymj1Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                th61 th61Var = (th61) obj;
                if (!th61Var.b || th61Var.a.length() <= 0) {
                    return rih1Var;
                }
                ymj1Var.b = 1;
                return vr20Var.emit(obj, ymj1Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof anj1) {
                    anj1Var = (anj1) lnmVar;
                    int i3 = anj1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        anj1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        anj1Var = new anj1(this, lnmVar);
                    }
                } else {
                    anj1Var = new anj1(this, lnmVar);
                }
                Object obj3 = anj1Var.a;
                int i4 = anj1Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    String str2 = ((th61) obj).a;
                    anj1Var.b = 1;
                    return vr20Var.emit(str2, anj1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof hqj1) {
                    hqj1Var = (hqj1) lnmVar;
                    int i5 = hqj1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        hqj1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        hqj1Var = new hqj1(this, lnmVar);
                    }
                } else {
                    hqj1Var = new hqj1(this, lnmVar);
                }
                Object obj4 = hqj1Var.a;
                int i6 = hqj1Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                PlayerState playerState = (PlayerState) obj;
                playerState.getClass();
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                objUri = contextTrack != null ? contextTrack.uri() : null;
                hqj1Var.b = 1;
                return vr20Var.emit(objUri, hqj1Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof iqj1) {
                    iqj1Var = (iqj1) lnmVar;
                    int i7 = iqj1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        iqj1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        iqj1Var = new iqj1(this, lnmVar);
                    }
                } else {
                    iqj1Var = new iqj1(this, lnmVar);
                }
                Object obj5 = iqj1Var.a;
                int i8 = iqj1Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                yvg1 yvg1Var = (yvg1) obj;
                PlayerState playerState2 = (PlayerState) yvg1Var.a;
                y58 y58Var = (y58) yvg1Var.b;
                if (!((Boolean) yvg1Var.c).booleanValue() || !(y58Var instanceof w58)) {
                    return rih1Var;
                }
                ContextTrack contextTrack2 = (ContextTrack) playerState2.track().h();
                if ((contextTrack2 != null ? (String) contextTrack2.metadata().get(ContextTrack$Metadata.KEY_ASSOCIATED_VIDEO_MANIFEST_ID) : null) == null) {
                    return rih1Var;
                }
                iqj1Var.b = 1;
                return vr20Var.emit(obj, iqj1Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof kqj1) {
                    kqj1Var = (kqj1) lnmVar;
                    int i9 = kqj1Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        kqj1Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        kqj1Var = new kqj1(this, lnmVar);
                    }
                } else {
                    kqj1Var = new kqj1(this, lnmVar);
                }
                Object obj6 = kqj1Var.a;
                int i10 = kqj1Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    Boolean boolValueOf = Boolean.valueOf(y7y0.L((Map) obj));
                    kqj1Var.b = 1;
                    return vr20Var.emit(boolValueOf, kqj1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof k2k1) {
                    k2k1Var = (k2k1) lnmVar;
                    int i11 = k2k1Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        k2k1Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        k2k1Var = new k2k1(this, lnmVar);
                    }
                } else {
                    k2k1Var = new k2k1(this, lnmVar);
                }
                Object obj7 = k2k1Var.a;
                int i12 = k2k1Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    Integer num = new Integer(xvj1.e(((svj1) obj).a));
                    k2k1Var.b = 1;
                    return vr20Var.emit(num, k2k1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof j3k1) {
                    j3k1Var = (j3k1) lnmVar;
                    int i13 = j3k1Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        j3k1Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        j3k1Var = new j3k1(this, lnmVar);
                    }
                } else {
                    j3k1Var = new j3k1(this, lnmVar);
                }
                Object obj8 = j3k1Var.a;
                int i14 = j3k1Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                String str3 = (String) obj;
                str = str3 != null ? str3 : "";
                j3k1Var.b = 1;
                return vr20Var.emit(str, j3k1Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof idk1) {
                    idk1Var = (idk1) lnmVar;
                    int i15 = idk1Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        idk1Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        idk1Var = new idk1(this, lnmVar);
                    }
                } else {
                    idk1Var = new idk1(this, lnmVar);
                }
                Object obj9 = idk1Var.a;
                int i16 = idk1Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                ibd0 ibd0Var = (ibd0) obj;
                Boolean boolValueOf2 = Boolean.valueOf((ibd0Var instanceof ebd0) || (ibd0Var instanceof hbd0));
                idk1Var.b = 1;
                return vr20Var.emit(boolValueOf2, idk1Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof kdk1) {
                    kdk1Var = (kdk1) lnmVar;
                    int i17 = kdk1Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        kdk1Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        kdk1Var = new kdk1(this, lnmVar);
                    }
                } else {
                    kdk1Var = new kdk1(this, lnmVar);
                }
                Object obj10 = kdk1Var.a;
                int i18 = kdk1Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    lax laxVarY = h0p1.y((ibd0) obj);
                    kdk1Var.b = 1;
                    return vr20Var.emit(laxVarY, kdk1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof ldk1) {
                    ldk1Var = (ldk1) lnmVar;
                    int i19 = ldk1Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ldk1Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        ldk1Var = new ldk1(this, lnmVar);
                    }
                } else {
                    ldk1Var = new ldk1(this, lnmVar);
                }
                Object obj11 = ldk1Var.a;
                int i20 = ldk1Var.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf3 = Boolean.valueOf(u890.j((k9d0) obj, i9d0.a));
                    ldk1Var.b = 1;
                    return vr20Var.emit(boolValueOf3, ldk1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof kek1) {
                    kek1Var = (kek1) lnmVar;
                    int i21 = kek1Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        kek1Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        kek1Var = new kek1(this, lnmVar);
                    }
                } else {
                    kek1Var = new kek1(this, lnmVar);
                }
                Object obj12 = kek1Var.a;
                int i22 = kek1Var.b;
                if (i22 == 0) {
                    hm5.M(obj12);
                    iek1 iek1Var = new iek1(((Boolean) obj).booleanValue());
                    kek1Var.b = 1;
                    return vr20Var.emit(iek1Var, kek1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof yik1) {
                    yik1Var = (yik1) lnmVar;
                    int i23 = yik1Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        yik1Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        yik1Var = new yik1(this, lnmVar);
                    }
                } else {
                    yik1Var = new yik1(this, lnmVar);
                }
                Object obj13 = yik1Var.a;
                int i24 = yik1Var.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    ji0 ji0Var = ((i600) obj).c;
                    yik1Var.b = 1;
                    return vr20Var.emit(ji0Var, yik1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                hpa1 hpa1Var = (jpa1) obj;
                if (hpa1Var instanceof ipa1) {
                    return rih1Var;
                }
                if (hpa1Var instanceof fpa1) {
                    objEmit = vr20Var.emit(vmk1.a, lnmVar);
                    if (objEmit != d9nVar) {
                        return rih1Var;
                    }
                } else if (hpa1Var instanceof hpa1) {
                    objEmit = vr20Var.emit(new xmk1(hpa1Var.a), lnmVar);
                    if (objEmit != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    if (!(hpa1Var instanceof gpa1)) {
                        eg.o();
                        return null;
                    }
                    objEmit = vr20Var.emit(wmk1.a, lnmVar);
                    if (objEmit != d9nVar) {
                        return rih1Var;
                    }
                }
                return objEmit;
            case 13:
                if (lnmVar instanceof ook1) {
                    ook1Var = (ook1) lnmVar;
                    int i25 = ook1Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ook1Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        ook1Var = new ook1(this, lnmVar);
                    }
                } else {
                    ook1Var = new ook1(this, lnmVar);
                }
                Object obj14 = ook1Var.a;
                int i26 = ook1Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    Float f = new Float((((Number) obj).floatValue() * 0.8f) + 0.2f);
                    ook1Var.b = 1;
                    return vr20Var.emit(f, ook1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof tok1) {
                    tok1Var = (tok1) lnmVar;
                    int i27 = tok1Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        tok1Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        tok1Var = new tok1(this, lnmVar);
                    }
                } else {
                    tok1Var = new tok1(this, lnmVar);
                }
                Object obj15 = tok1Var.a;
                int i28 = tok1Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                jpa1 jpa1Var = (jpa1) obj;
                if (!(jpa1Var instanceof fpa1) && !(jpa1Var instanceof gpa1)) {
                    return rih1Var;
                }
                tok1Var.b = 1;
                return vr20Var.emit(obj, tok1Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof yok1) {
                    yok1Var = (yok1) lnmVar;
                    int i29 = yok1Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        yok1Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        yok1Var = new yok1(this, lnmVar);
                    }
                } else {
                    yok1Var = new yok1(this, lnmVar);
                }
                Object obj16 = yok1Var.a;
                int i30 = yok1Var.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    Boolean boolValueOf4 = Boolean.valueOf(((jre) obj) instanceof gre);
                    yok1Var.b = 1;
                    return vr20Var.emit(boolValueOf4, yok1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof rvk1) {
                    rvk1Var = (rvk1) lnmVar;
                    int i31 = rvk1Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        rvk1Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        rvk1Var = new rvk1(this, lnmVar);
                    }
                } else {
                    rvk1Var = new rvk1(this, lnmVar);
                }
                Object obj17 = rvk1Var.a;
                int i32 = rvk1Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    Boolean boolValueOf5 = Boolean.valueOf(((String) ((cxc0) obj).f.q.get("voting_playlist_data")) != null);
                    rvk1Var.b = 1;
                    return vr20Var.emit(boolValueOf5, rvk1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof k9l1) {
                    k9l1Var = (k9l1) lnmVar;
                    int i33 = k9l1Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        k9l1Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        k9l1Var = new k9l1(this, lnmVar);
                    }
                } else {
                    k9l1Var = new k9l1(this, lnmVar);
                }
                Object obj18 = k9l1Var.a;
                int i34 = k9l1Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                gcl1 gcl1Var = (gcl1) obj;
                if (!(gcl1Var instanceof ecl1) && !(gcl1Var instanceof dcl1)) {
                    return rih1Var;
                }
                k9l1Var.b = 1;
                return vr20Var.emit(obj, k9l1Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof l9l1) {
                    l9l1Var = (l9l1) lnmVar;
                    int i35 = l9l1Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        l9l1Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        l9l1Var = new l9l1(this, lnmVar);
                    }
                } else {
                    l9l1Var = new l9l1(this, lnmVar);
                }
                Object obj19 = l9l1Var.a;
                int i36 = l9l1Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf6 = Boolean.valueOf(((gcl1) obj) instanceof dcl1);
                    l9l1Var.b = 1;
                    return vr20Var.emit(boolValueOf6, l9l1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof rgl1) {
                    rgl1Var = (rgl1) lnmVar;
                    int i37 = rgl1Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        rgl1Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        rgl1Var = new rgl1(this, lnmVar);
                    }
                } else {
                    rgl1Var = new rgl1(this, lnmVar);
                }
                Object obj20 = rgl1Var.a;
                int i38 = rgl1Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                if (((String) obj).length() <= 0) {
                    return rih1Var;
                }
                rgl1Var.b = 1;
                return vr20Var.emit(obj, rgl1Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof sgl1) {
                    sgl1Var = (sgl1) lnmVar;
                    int i39 = sgl1Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        sgl1Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        sgl1Var = new sgl1(this, lnmVar);
                    }
                } else {
                    sgl1Var = new sgl1(this, lnmVar);
                }
                Object obj21 = sgl1Var.a;
                int i40 = sgl1Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                List list = (List) obj;
                list.getClass();
                for (Object obj22 : list) {
                    if (((l0l) obj22).l()) {
                        objUri = obj22;
                        l0lVar = (l0l) objUri;
                        if (l0lVar != null && (strD = l0lVar.d()) != null) {
                            str = strD;
                        }
                        sgl1Var.b = 1;
                        if (vr20Var.emit(str, sgl1Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                l0lVar = (l0l) objUri;
                if (l0lVar != null) {
                    str = strD;
                }
                sgl1Var.b = 1;
                if (vr20Var.emit(str, sgl1Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 21:
                Object objEmit2 = vr20Var.emit((w18) obj, lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            case 22:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.getClass();
                x18 x18VarP = AudioRecognitionRequest.p();
                rr7 rr7VarN = AudioChunk.n();
                rr7VarN.n(phc.f(byteBuffer.asReadOnlyBuffer()));
                x18VarP.n(rr7VarN);
                Object objEmit3 = vr20Var.emit(x18VarP.build(), lnmVar);
                return objEmit3 == d9nVar ? objEmit3 : rih1Var;
            case 23:
                if (lnmVar instanceof dol1) {
                    dol1Var = (dol1) lnmVar;
                    int i41 = dol1Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        dol1Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        dol1Var = new dol1(this, lnmVar);
                    }
                } else {
                    dol1Var = new dol1(this, lnmVar);
                }
                Object obj23 = dol1Var.a;
                int i42 = dol1Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                if (!(obj instanceof j7l)) {
                    return rih1Var;
                }
                dol1Var.b = 1;
                return vr20Var.emit(obj, dol1Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof gol1) {
                    gol1Var = (gol1) lnmVar;
                    int i43 = gol1Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        gol1Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        gol1Var = new gol1(this, lnmVar);
                    }
                } else {
                    gol1Var = new gol1(this, lnmVar);
                }
                Object obj24 = gol1Var.a;
                int i44 = gol1Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf7 = Boolean.valueOf(((Intent) obj).getIntExtra("wifi_state", -1) != 3);
                    gol1Var.b = 1;
                    return vr20Var.emit(boolValueOf7, gol1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof fpl1) {
                    fpl1Var = (fpl1) lnmVar;
                    int i45 = fpl1Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        fpl1Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        fpl1Var = new fpl1(this, lnmVar);
                    }
                } else {
                    fpl1Var = new fpl1(this, lnmVar);
                }
                Object obj25 = fpl1Var.a;
                int i46 = fpl1Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (((PlayerState) obj).contextUri().length() <= 0) {
                    return rih1Var;
                }
                fpl1Var.b = 1;
                return vr20Var.emit(obj, fpl1Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof gpl1) {
                    gpl1Var = (gpl1) lnmVar;
                    int i47 = gpl1Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        gpl1Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        gpl1Var = new gpl1(this, lnmVar);
                    }
                } else {
                    gpl1Var = new gpl1(this, lnmVar);
                }
                Object obj26 = gpl1Var.a;
                int i48 = gpl1Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                PlayerState playerState3 = (PlayerState) obj;
                if (!playerState3.isPlaying() || playerState3.isPaused()) {
                    return rih1Var;
                }
                gpl1Var.b = 1;
                return vr20Var.emit(obj, gpl1Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof hpl1) {
                    hpl1Var = (hpl1) lnmVar;
                    int i49 = hpl1Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        hpl1Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        hpl1Var = new hpl1(this, lnmVar);
                    }
                } else {
                    hpl1Var = new hpl1(this, lnmVar);
                }
                Object obj27 = hpl1Var.a;
                int i50 = hpl1Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                PlayerState playerState4 = (PlayerState) obj;
                if (!playerState4.track().c() || l4o1.E((ContextTrack) playerState4.track().b())) {
                    return rih1Var;
                }
                hpl1Var.b = 1;
                return vr20Var.emit(obj, hpl1Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof ipl1) {
                    ipl1Var = (ipl1) lnmVar;
                    int i51 = ipl1Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        ipl1Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        ipl1Var = new ipl1(this, lnmVar);
                    }
                } else {
                    ipl1Var = new ipl1(this, lnmVar);
                }
                Object obj28 = ipl1Var.a;
                int i52 = ipl1Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (((PlayerState) obj).contextUri().length() <= 0) {
                    return rih1Var;
                }
                ipl1Var.b = 1;
                return vr20Var.emit(obj, ipl1Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof jpl1) {
                    jpl1Var = (jpl1) lnmVar;
                    int i53 = jpl1Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        jpl1Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        jpl1Var = new jpl1(this, lnmVar);
                    }
                } else {
                    jpl1Var = new jpl1(this, lnmVar);
                }
                Object obj29 = jpl1Var.a;
                int i54 = jpl1Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                PlayerState playerState5 = (PlayerState) obj;
                if (!playerState5.isPlaying() || playerState5.isPaused()) {
                    return rih1Var;
                }
                jpl1Var.b = 1;
                return vr20Var.emit(obj, jpl1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ zmj1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
