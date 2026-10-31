package p;

import android.content.Context;
import com.spotify.pam.v2.GetYourPremiumBadgeResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.yourupdates.domain.models.FetchMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wtl1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wtl1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0362  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:209:0x043b  */
    /* JADX WARN: Code duplicated, block: B:226:0x048b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:247:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:268:0x051f  */
    /* JADX WARN: Code duplicated, block: B:277:0x0549  */
    /* JADX WARN: Code duplicated, block: B:300:0x0597  */
    /* JADX WARN: Code duplicated, block: B:324:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0142  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d6  */
    public final Object emit(Object obj, lnm lnmVar) throws Exception {
        vtl1 vtl1Var;
        ozl1 ozl1Var;
        pzl1 pzl1Var;
        ryl1 ryl1VarE;
        rzl1 rzl1Var;
        int i;
        s4m1 s4m1Var;
        u4m1 u4m1Var;
        j5m1 j5m1Var;
        v5m1 v5m1Var;
        z7m1 z7m1Var;
        tem1 tem1Var;
        lmm1 lmm1Var;
        int i2;
        String string;
        boolean z;
        String string2;
        String strUri;
        kym1 kym1Var;
        t1n1 t1n1Var;
        kh81 kh81Var;
        byte b = this.a;
        w7x w7xVar = w7x.a;
        boolean z2 = false;
        d9n d9nVar = d9n.a;
        boolean z3 = true;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                if (lnmVar instanceof vtl1) {
                    vtl1Var = (vtl1) lnmVar;
                    int i3 = vtl1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vtl1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        vtl1Var = new vtl1(this, lnmVar);
                    }
                } else {
                    vtl1Var = new vtl1(this, lnmVar);
                }
                Object obj4 = vtl1Var.a;
                int i4 = vtl1Var.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    vr20 vr20Var = (vr20) obj3;
                    if (((aek1) obj2).b(((Number) obj).intValue())) {
                        vtl1Var.b = 1;
                        if (vr20Var.emit(obj, vtl1Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 1:
                ((k2q0) obj3).c((vwl1) obj2, (ojl) obj);
                return rih1Var;
            case 2:
                if (lnmVar instanceof ozl1) {
                    ozl1Var = (ozl1) lnmVar;
                    int i5 = ozl1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ozl1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        ozl1Var = new ozl1(this, lnmVar);
                    }
                } else {
                    ozl1Var = new ozl1(this, lnmVar);
                }
                Object obj5 = ozl1Var.a;
                int i6 = ozl1Var.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var2 = (vr20) obj3;
                    fot fotVar = ((czl1) obj).a ? new fot((rzl1) obj2) : got.a;
                    ozl1Var.b = 1;
                    if (vr20Var2.emit(fotVar, ozl1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof pzl1) {
                    pzl1Var = (pzl1) lnmVar;
                    int i7 = pzl1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        pzl1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        pzl1Var = new pzl1(this, lnmVar);
                    }
                } else {
                    pzl1Var = new pzl1(this, lnmVar);
                }
                Object obj6 = pzl1Var.a;
                int i8 = pzl1Var.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var3 = (vr20) obj3;
                    PlayerState playerState = (PlayerState) obj;
                    qzl1 qzl1Var = (qzl1) obj2;
                    playerState.getClass();
                    String strContextUri = playerState.contextUri();
                    if (strContextUri == null) {
                        i = 1;
                        rzl1Var = null;
                    } else {
                        j380 j380VarContextMetadata = playerState.contextMetadata();
                        xyl1 xyl1Var = qzl1Var.b;
                        j380VarContextMetadata.getClass();
                        if (xyl1Var.a(j380VarContextMetadata) && (ryl1VarE = ytw0.e(j380VarContextMetadata)) != null) {
                            nzl1 nzl1Var = new nzl1(strContextUri, ryl1VarE);
                            if (playerState.isPlaying() && !playerState.isPaused()) {
                                z2 = true;
                            }
                            rzl1Var = new rzl1(nzl1Var, playerState, z2);
                            i = 1;
                        } else {
                            i = 1;
                            rzl1Var = null;
                        }
                    }
                    pzl1Var.b = i;
                    if (vr20Var3.emit(rzl1Var, pzl1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof s4m1) {
                    s4m1Var = (s4m1) lnmVar;
                    int i9 = s4m1Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        s4m1Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        s4m1Var = new s4m1(this, lnmVar);
                    }
                } else {
                    s4m1Var = new s4m1(this, lnmVar);
                }
                Object obj7 = s4m1Var.a;
                int i10 = s4m1Var.b;
                if (i10 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var4 = (vr20) obj3;
                    bek1 bek1Var = (bek1) obj2;
                    w7x w7xVar2 = (Set) ((cma1) obj).a;
                    if (w7xVar2 != null) {
                        w7xVar = w7xVar2;
                    }
                    Object objInvoke = bek1Var.invoke(w7xVar);
                    s4m1Var.b = 1;
                    if (vr20Var4.emit(objInvoke, s4m1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof u4m1) {
                    u4m1Var = (u4m1) lnmVar;
                    int i11 = u4m1Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        u4m1Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        u4m1Var = new u4m1(this, lnmVar);
                    }
                } else {
                    u4m1Var = new u4m1(this, lnmVar);
                }
                Object obj8 = u4m1Var.a;
                int i12 = u4m1Var.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var5 = (vr20) obj3;
                    bek1 bek1Var2 = (bek1) obj2;
                    w7x w7xVar3 = (Set) ((cma1) obj).a;
                    if (w7xVar3 != null) {
                        w7xVar = w7xVar3;
                    }
                    Object objInvoke2 = bek1Var2.invoke(w7xVar);
                    u4m1Var.b = 1;
                    if (vr20Var5.emit(objInvoke2, u4m1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i12 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof j5m1) {
                    j5m1Var = (j5m1) lnmVar;
                    int i13 = j5m1Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        j5m1Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        j5m1Var = new j5m1(this, lnmVar);
                    }
                } else {
                    j5m1Var = new j5m1(this, lnmVar);
                }
                Object obj9 = j5m1Var.a;
                int i14 = j5m1Var.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf = Boolean.valueOf(((xyl1) ((k5m1) obj2).b.c).a(((cxc0) obj).f.q));
                    j5m1Var.b = 1;
                    if (((vr20) obj3).emit(boolValueOf, j5m1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1Var;
            case 7:
                if (lnmVar instanceof v5m1) {
                    v5m1Var = (v5m1) lnmVar;
                    int i15 = v5m1Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        v5m1Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        v5m1Var = new v5m1(this, lnmVar);
                    }
                } else {
                    v5m1Var = new v5m1(this, lnmVar);
                }
                Object obj10 = v5m1Var.a;
                int i16 = v5m1Var.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf2 = Boolean.valueOf(((w5m1) obj2).c.a(((cxc0) obj).f.q));
                    v5m1Var.b = 1;
                    if (((vr20) obj3).emit(boolValueOf2, v5m1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 8:
                if (lnmVar instanceof z7m1) {
                    z7m1Var = (z7m1) lnmVar;
                    int i17 = z7m1Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        z7m1Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        z7m1Var = new z7m1(this, lnmVar);
                    }
                } else {
                    z7m1Var = new z7m1(this, lnmVar);
                }
                Object obj11 = z7m1Var.a;
                int i18 = z7m1Var.b;
                if (i18 == 0) {
                    hm5.M(obj11);
                    List list = wb20.a((Map) obj, (nfa0) obj2).b;
                    z7m1Var.b = 1;
                    if (((vr20) obj3).emit(list, z7m1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i18 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 9:
                if (lnmVar instanceof tem1) {
                    tem1Var = (tem1) lnmVar;
                    int i19 = tem1Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        tem1Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        tem1Var = new tem1(this, lnmVar);
                    }
                } else {
                    tem1Var = new tem1(this, lnmVar);
                }
                Object obj12 = tem1Var.a;
                int i20 = tem1Var.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    le30 le30VarA = ((me30) ((frl1) obj2).c).a(((cxc0) obj).f.p);
                    tem1Var.b = 1;
                    if (((vr20) obj3).emit(le30VarA, tem1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i20 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var;
            case 10:
                Context context = (Context) ((frl1) obj2).c;
                if (lnmVar instanceof lmm1) {
                    lmm1Var = (lmm1) lnmVar;
                    int i21 = lmm1Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        lmm1Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        lmm1Var = new lmm1(this, lnmVar);
                    }
                } else {
                    lmm1Var = new lmm1(this, lnmVar);
                }
                Object obj13 = lmm1Var.a;
                int i22 = lmm1Var.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var6 = (vr20) obj3;
                    PlayerState playerState2 = (PlayerState) obj;
                    ContextTrack contextTrack = (ContextTrack) playerState2.track().h();
                    j380 j380VarMetadata = contextTrack != null ? contextTrack.metadata() : null;
                    int i23 = 4;
                    if (contextTrack != null) {
                        if (Boolean.parseBoolean((String) contextTrack.metadata().get("is_advertisement"))) {
                            i23 = 3;
                        } else if (nhc1.Y(contextTrack.uri(), "spotify:episode:", false)) {
                            i2 = 2;
                        } else if (nhc1.Y(contextTrack.uri(), "spotify:track:", false)) {
                            i2 = 1;
                        }
                        i2 = i23;
                    } else {
                        i2 = i23;
                    }
                    Restrictions restrictions = playerState2.restrictions();
                    if (zsf1.a[l1d.C(i2)] == 1) {
                        if (j380VarMetadata == null || (string = (String) j380VarMetadata.get("title")) == null) {
                            string = context.getString(2131951868);
                        } else {
                            if (ihc1.y0(string)) {
                                string = null;
                            }
                            if (string == null) {
                                string = context.getString(2131951868);
                            }
                        }
                    } else if (j380VarMetadata == null || (string = (String) j380VarMetadata.get("title")) == null) {
                        string = "";
                    }
                    int iC = l1d.C(i2);
                    if (iC == 1) {
                        z = true;
                        if (j380VarMetadata == null || (string2 = (String) j380VarMetadata.get("album_title")) == null) {
                            string2 = "";
                        }
                    } else if (iC != 2) {
                        if (j380VarMetadata != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : j380VarMetadata.entrySet()) {
                                boolean z4 = z3;
                                if (nhc1.Y((String) entry.getKey(), "artist_name", false)) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                                z3 = z4;
                            }
                            z = z3;
                            Collection collectionValues = new TreeMap(linkedHashMap).values();
                            if (collectionValues != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj14 : collectionValues) {
                                    String str = (String) obj14;
                                    str.getClass();
                                    if (str.length() > 0) {
                                        arrayList.add(obj14);
                                    }
                                }
                                string2 = o7h.y0(arrayList, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                            }
                        } else {
                            z = true;
                        }
                        string2 = "";
                    } else {
                        z = true;
                        string2 = context.getString(2131951868);
                    }
                    if (playerState2.isPlaying() && !playerState2.isPaused()) {
                        z2 = z;
                    }
                    long jLongValue = ((Number) playerState2.positionAsOfTimestamp().e(new Long(0L))).longValue();
                    long jLongValue2 = ((Number) playerState2.duration().e(new Long(0L))).longValue();
                    long jTimestamp = playerState2.timestamp();
                    boolean z5 = z2;
                    double dDoubleValue = ((Number) playerState2.playbackSpeed().e(new Double(1.0d))).doubleValue();
                    boolean zIsPlaying = playerState2.isPlaying();
                    String str2 = j380VarMetadata != null ? (String) j380VarMetadata.get("image_url") : null;
                    boolean z6 = !restrictions.disallowSkippingPrevReasons().isEmpty();
                    boolean z7 = !restrictions.disallowSkippingNextReasons().isEmpty();
                    boolean z8 = !restrictions.disallowSeekingReasons().isEmpty();
                    String str3 = (contextTrack == null || (strUri = contextTrack.uri()) == null) ? "" : strUri;
                    String str4 = (String) playerState2.playbackId().h();
                    kmm1 kmm1Var = new kmm1(string, string2, z5, jLongValue, jLongValue2, jTimestamp, dDoubleValue, zIsPlaying, i2, str2, z6, z7, z8, str3, str4 == null ? "" : str4, Boolean.parseBoolean(j380VarMetadata != null ? (String) j380VarMetadata.get("has_lyrics") : null));
                    lmm1Var.b = z ? 1 : 0;
                    if (vr20Var6.emit(kmm1Var, lmm1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i22 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var;
            case 11:
                if (lnmVar instanceof kym1) {
                    kym1Var = (kym1) lnmVar;
                    int i24 = kym1Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        kym1Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        kym1Var = new kym1(this, lnmVar);
                    }
                } else {
                    kym1Var = new kym1(this, lnmVar);
                }
                Object obj15 = kym1Var.a;
                int i25 = kym1Var.b;
                if (i25 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var7 = (vr20) obj3;
                    GetYourPremiumBadgeResponse getYourPremiumBadgeResponse = (GetYourPremiumBadgeResponse) obj;
                    kh81 kh81VarB = lym1.b((lym1) obj2, getYourPremiumBadgeResponse.n(), getYourPremiumBadgeResponse.o(), getYourPremiumBadgeResponse.p() == dct0.d, false, 56);
                    kym1Var.b = 1;
                    if (vr20Var7.emit(kh81VarB, kym1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var;
            case 12:
                if (lnmVar instanceof t1n1) {
                    t1n1Var = (t1n1) lnmVar;
                    int i26 = t1n1Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        t1n1Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        t1n1Var = new t1n1(this, lnmVar);
                    }
                } else {
                    t1n1Var = new t1n1(this, lnmVar);
                }
                Object obj16 = t1n1Var.a;
                int i27 = t1n1Var.b;
                if (i27 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var8 = (vr20) obj3;
                    if (((Boolean) obj).booleanValue()) {
                        kh81Var = null;
                    } else {
                        jcd0 jcd0Var = (jcd0) obj2;
                        sox soxVar = sox.c;
                        String str5 = nik1.O2.a;
                        uzl0 uzl0Var = (uzl0) jcd0Var.b.get();
                        uzl0Var.getClass();
                        kh81Var = new kh81(soxVar, 2131964190, str5, (tm81) null, new jh81(new nzl0(uzl0Var), bom1.t), (nh81) ((kly0) jcd0Var.c).get(), 18);
                    }
                    t1n1Var.b = 1;
                    if (vr20Var8.emit(kh81Var, t1n1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var;
            default:
                g2n1 g2n1Var = (g2n1) obj3;
                if (((Boolean) obj).booleanValue()) {
                    wro0 wro0Var = (wro0) o7h.C0(g2n1Var.d);
                    z2 = (wro0Var != null ? wro0Var.c : null) != null;
                    boolean zJ = u890.j(g2n1Var.c, new rbe0(FetchMode.NEXT));
                    if (z2 && !zJ) {
                        ((iu30) obj2).invoke(i1n1.a);
                    }
                }
                return rih1Var;
        }
    }
}
