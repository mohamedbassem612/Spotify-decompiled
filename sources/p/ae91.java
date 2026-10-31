package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.ads.esperanto.proto.AdSlotEvent;
import com.spotify.ads.esperanto.proto.SubSlotResponse;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ae91 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ ae91(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        hxa1 hxa1Var;
        cxa1 dxa1Var;
        if (lnmVar instanceof hxa1) {
            hxa1Var = (hxa1) lnmVar;
            int i = hxa1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hxa1Var.b = i - Integer.MIN_VALUE;
            } else {
                hxa1Var = new hxa1(this, lnmVar);
            }
        } else {
            hxa1Var = new hxa1(this, lnmVar);
        }
        Object obj2 = hxa1Var.a;
        int i2 = hxa1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            EsContextPlayerState.ContextPlayerState contextPlayerState = (EsContextPlayerState.ContextPlayerState) obj;
            if (contextPlayerState.x() && !contextPlayerState.y() && Boolean.parseBoolean((String) contextPlayerState.S().o().getMetadataMap().get("is_transition_preview"))) {
                dxa1Var = cxa1.a;
            } else {
                dxa1Var = (contextPlayerState.z() && !contextPlayerState.y() && Boolean.parseBoolean((String) contextPlayerState.S().o().getMetadataMap().get("is_transition_preview"))) ? new dxa1(contextPlayerState.S().o().getUri()) : exa1.a;
            }
            hxa1Var.b = 1;
            Object objEmit = this.b.emit(dxa1Var, hxa1Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x0229  */
    /* JADX WARN: Code duplicated, block: B:173:0x0271  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:203:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:222:0x034b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0396  */
    /* JADX WARN: Code duplicated, block: B:265:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:291:0x0455  */
    /* JADX WARN: Code duplicated, block: B:317:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:345:0x0538  */
    /* JADX WARN: Code duplicated, block: B:360:0x0571  */
    /* JADX WARN: Code duplicated, block: B:379:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:410:0x062d A[PHI: r4
      0x062d: PHI (r4v30 java.lang.String) = (r4v28 java.lang.String), (r4v31 java.lang.String) binds: [B:414:0x0638, B:408:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:411:0x0630  */
    /* JADX WARN: Code duplicated, block: B:447:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:466:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:483:0x0724  */
    /* JADX WARN: Code duplicated, block: B:498:0x0767  */
    /* JADX WARN: Code duplicated, block: B:518:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:533:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:550:0x083e  */
    /* JADX WARN: Code duplicated, block: B:569:0x0891  */
    /* JADX WARN: Code duplicated, block: B:589:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:609:0x0925  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:97:0x015c  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public final Object emit(Object obj, lnm lnmVar) {
        zd91 zd91Var;
        nf91 nf91Var;
        di91 di91Var;
        kj91 kj91Var;
        y0a1 y0a1Var;
        sm91 sm91Var;
        xm91 xm91Var;
        an91 an91Var;
        dn91 dn91Var;
        it91 it91Var;
        jt91 jt91Var;
        by91 by91Var;
        String str;
        dy91 dy91Var;
        ey91 ey91Var;
        lz91 lz91Var;
        x4i1 x4i1Var;
        r5a1 r5a1Var;
        String str2;
        b8a1 b8a1Var;
        h8a1 h8a1Var;
        q8a1 q8a1Var;
        hca1 hca1Var;
        cda1 cda1Var;
        iha1 iha1Var;
        nha1 nha1Var;
        xka1 xka1Var;
        kpa1 kpa1Var;
        jua1 jua1Var;
        ova1 ova1Var;
        rva1 rva1Var;
        owa1 owa1Var;
        qwa1 qwa1Var;
        zya1 zya1Var;
        byte b = this.a;
        int i = 3;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        ji0 vq90Var = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (lnmVar instanceof zd91) {
                    zd91Var = (zd91) lnmVar;
                    int i2 = zd91Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        zd91Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        zd91Var = new zd91(this, lnmVar);
                    }
                } else {
                    zd91Var = new zd91(this, lnmVar);
                }
                Object obj2 = zd91Var.a;
                int i3 = zd91Var.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    AdSlotEvent adSlotEventN = ((SubSlotResponse) obj).n();
                    int iOrdinal = adSlotEventN.p().ordinal();
                    if (iOrdinal == 0) {
                        i = 1;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i = 2;
                        } else if (iOrdinal == 3) {
                            i = 5;
                        } else {
                            eg.o();
                        }
                    }
                    lx0 lx0Var = new lx0(i, t2p1.z(adSlotEventN.q()), t2p1.y(adSlotEventN.n()), adSlotEventN.r());
                    zd91Var.b = 1;
                    return vr20Var.emit(lx0Var, zd91Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i3 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof nf91) {
                    nf91Var = (nf91) lnmVar;
                    int i4 = nf91Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        nf91Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        nf91Var = new nf91(this, lnmVar);
                    }
                } else {
                    nf91Var = new nf91(this, lnmVar);
                }
                Object obj3 = nf91Var.a;
                int i5 = nf91Var.b;
                if (i5 == 0) {
                    hm5.M(obj3);
                    byte[] bArr = (byte[]) obj;
                    try {
                        SubSlotResponse subSlotResponseO = SubSlotResponse.o(bArr);
                        nf91Var.b = 1;
                        return vr20Var.emit(subSlotResponseO, nf91Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.SubSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                if (lnmVar instanceof di91) {
                    di91Var = (di91) lnmVar;
                    int i6 = di91Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        di91Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        di91Var = new di91(this, lnmVar);
                    }
                } else {
                    di91Var = new di91(this, lnmVar);
                }
                Object obj4 = di91Var.a;
                int i7 = di91Var.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                Boolean bool = (Boolean) obj;
                Boolean boolValueOf = Boolean.valueOf(bool == null || !bool.booleanValue());
                di91Var.b = 1;
                return vr20Var.emit(boolValueOf, di91Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof kj91) {
                    kj91Var = (kj91) lnmVar;
                    int i8 = kj91Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        kj91Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        kj91Var = new kj91(this, lnmVar);
                    }
                } else {
                    kj91Var = new kj91(this, lnmVar);
                }
                Object obj5 = kj91Var.a;
                int i9 = kj91Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                pp90 pp90Var = (pp90) obj;
                if (pp90Var == null) {
                    Boolean bool2 = Boolean.FALSE;
                    y0a1Var = new y0a1(bool2, bool2);
                } else {
                    y0a1Var = new y0a1(Boolean.TRUE, Boolean.valueOf(pp90Var.h.b.e));
                }
                kj91Var.b = 1;
                return vr20Var.emit(y0a1Var, kj91Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof sm91) {
                    sm91Var = (sm91) lnmVar;
                    int i10 = sm91Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        sm91Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        sm91Var = new sm91(this, lnmVar);
                    }
                } else {
                    sm91Var = new sm91(this, lnmVar);
                }
                Object obj6 = sm91Var.a;
                int i11 = sm91Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (((sp91) obj).i.isEmpty()) {
                    return rih1Var;
                }
                sm91Var.b = 1;
                return vr20Var.emit(obj, sm91Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof xm91) {
                    xm91Var = (xm91) lnmVar;
                    int i12 = xm91Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        xm91Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        xm91Var = new xm91(this, lnmVar);
                    }
                } else {
                    xm91Var = new xm91(this, lnmVar);
                }
                Object obj7 = xm91Var.a;
                int i13 = xm91Var.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    Boolean boolValueOf2 = Boolean.valueOf(((zm91) obj).a);
                    xm91Var.b = 1;
                    return vr20Var.emit(boolValueOf2, xm91Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof an91) {
                    an91Var = (an91) lnmVar;
                    int i14 = an91Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        an91Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        an91Var = new an91(this, lnmVar);
                    }
                } else {
                    an91Var = new an91(this, lnmVar);
                }
                Object obj8 = an91Var.a;
                int i15 = an91Var.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                cxc0 cxc0Var = (cxc0) obj;
                if (!cxc0Var.a()) {
                    if (eqr0.r(cxc0Var.k, (dlc0[]) Arrays.copyOf(new dlc0[]{dlc0.d, dlc0.h}, 2))) {
                        z = true;
                    }
                }
                zm91 zm91Var = new zm91(z);
                an91Var.b = 1;
                return vr20Var.emit(zm91Var, an91Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof dn91) {
                    dn91Var = (dn91) lnmVar;
                    int i16 = dn91Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        dn91Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        dn91Var = new dn91(this, lnmVar);
                    }
                } else {
                    dn91Var = new dn91(this, lnmVar);
                }
                Object obj9 = dn91Var.a;
                int i17 = dn91Var.b;
                if (i17 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf3 = Boolean.valueOf(u890.j(((mp91) obj).b, Boolean.TRUE));
                    dn91Var.b = 1;
                    return vr20Var.emit(boolValueOf3, dn91Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof it91) {
                    it91Var = (it91) lnmVar;
                    int i18 = it91Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        it91Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        it91Var = new it91(this, lnmVar);
                    }
                } else {
                    it91Var = new it91(this, lnmVar);
                }
                Object obj10 = it91Var.a;
                int i19 = it91Var.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                if (((k8c0) obj) != k8c0.ON_PAUSE) {
                    return rih1Var;
                }
                it91Var.b = 1;
                return vr20Var.emit(obj, it91Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof jt91) {
                    jt91Var = (jt91) lnmVar;
                    int i20 = jt91Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        jt91Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        jt91Var = new jt91(this, lnmVar);
                    }
                } else {
                    jt91Var = new jt91(this, lnmVar);
                }
                Object obj11 = jt91Var.a;
                int i21 = jt91Var.b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                m6w0 m6w0Var = (m6w0) obj;
                List listSingletonList = m6w0Var != null ? Collections.singletonList(m6w0Var.b) : z6x.a;
                jt91Var.b = 1;
                return vr20Var.emit(listSingletonList, jt91Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof by91) {
                    by91Var = (by91) lnmVar;
                    int i22 = by91Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        by91Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        by91Var = new by91(this, lnmVar);
                    }
                } else {
                    by91Var = new by91(this, lnmVar);
                }
                Object obj12 = by91Var.a;
                int i23 = by91Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                m1a1 m1a1Var = (q1a1) obj;
                m1a1Var.getClass();
                Set set = fy91.b;
                if (m1a1Var instanceof m1a1) {
                    List<jg61> list = m1a1Var.a;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (jg61 jg61Var : list) {
                        String str3 = jg61Var.b;
                        String str4 = str3 == null ? "" : str3;
                        String str5 = jg61Var.d;
                        String str6 = str5 == null ? "" : str5;
                        String str7 = jg61Var.c;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = jg61Var.e;
                        if (str9 == null) {
                            str9 = jg61Var.f;
                            if (str9 != null || ihc1.y0(str9)) {
                                str = null;
                            } else {
                                str = str9;
                            }
                        } else {
                            if (ihc1.y0(str9)) {
                                str9 = null;
                            }
                            if (str9 == null) {
                                str9 = jg61Var.f;
                                if (str9 != null) {
                                }
                                str = null;
                            } else {
                                str = str9;
                            }
                        }
                        arrayList.add(new hp90(str4, str6, str8, str, false, jg61Var.g, jg61Var.h));
                    }
                    vq90Var = new cr90(arrayList);
                } else if (m1a1Var instanceof p1a1) {
                    vq90Var = zq90.a;
                } else if (m1a1Var instanceof d1a1) {
                    vq90Var = ((d1a1) m1a1Var).a instanceof rea0 ? xq90.a : wq90.a;
                } else if (m1a1Var instanceof j1a1) {
                    vq90Var = uq90.a;
                } else if (m1a1Var instanceof k1a1) {
                    vq90Var = br90.a;
                } else if (m1a1Var instanceof c1a1) {
                    vq90Var = new vq90(((c1a1) m1a1Var).a);
                }
                if (vq90Var == null) {
                    return rih1Var;
                }
                by91Var.b = 1;
                return vr20Var.emit(vq90Var, by91Var) == d9nVar ? d9nVar : rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (lnmVar instanceof dy91) {
                    dy91Var = (dy91) lnmVar;
                    int i24 = dy91Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        dy91Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        dy91Var = new dy91(this, lnmVar);
                    }
                } else {
                    dy91Var = new dy91(this, lnmVar);
                }
                Object obj13 = dy91Var.a;
                int i25 = dy91Var.b;
                if (i25 != 0) {
                    if (i25 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                k5a1 k5a1Var = (k5a1) obj;
                k5a1Var.getClass();
                Set set2 = fy91.b;
                if (k5a1Var.k != 3 || !fy91.b.contains(k5a1Var.j)) {
                    return rih1Var;
                }
                dy91Var.b = 1;
                return vr20Var.emit(obj, dy91Var) == d9nVar ? d9nVar : rih1Var;
            case grn1.d /* 12 */:
                if (lnmVar instanceof ey91) {
                    ey91Var = (ey91) lnmVar;
                    int i26 = ey91Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        ey91Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        ey91Var = new ey91(this, lnmVar);
                    }
                } else {
                    ey91Var = new ey91(this, lnmVar);
                }
                Object obj14 = ey91Var.a;
                int i27 = ey91Var.b;
                if (i27 == 0) {
                    hm5.M(obj14);
                    ey91Var.b = 1;
                    return vr20Var.emit(ar90.a, ey91Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i27 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof lz91) {
                    lz91Var = (lz91) lnmVar;
                    int i28 = lz91Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        lz91Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        lz91Var = new lz91(this, lnmVar);
                    }
                } else {
                    lz91Var = new lz91(this, lnmVar);
                }
                Object obj15 = lz91Var.a;
                int i29 = lz91Var.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                kz91 kz91Var = (kz91) obj;
                gz91 gz91Var = hz91.a;
                if (kz91Var != null && kz91Var.a >= 2 && kz91Var.b && (x4i1Var = kz91Var.d) != null) {
                    String str10 = x4i1Var.b;
                    String str11 = x4i1Var.c;
                    String str12 = x4i1Var.e;
                    if (str12 == null) {
                        str12 = x4i1Var.f;
                    }
                    gz91Var = new gz91(new fz91(str10, str11, x4i1Var.g, str12), kz91Var.c, kz91Var.e);
                }
                lz91Var.b = 1;
                return vr20Var.emit(gz91Var, lz91Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof r5a1) {
                    r5a1Var = (r5a1) lnmVar;
                    int i30 = r5a1Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        r5a1Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        r5a1Var = new r5a1(this, lnmVar);
                    }
                } else {
                    r5a1Var = new r5a1(this, lnmVar);
                }
                Object obj16 = r5a1Var.a;
                int i31 = r5a1Var.b;
                if (i31 == 0) {
                    hm5.M(obj16);
                    Set<z2a0> set3 = (Set) obj;
                    ArrayList arrayList2 = new ArrayList(q7h.U(set3, 10));
                    for (z2a0 z2a0Var : set3) {
                        String str13 = z2a0Var.a;
                        int iC = l1d.C(z2a0Var.b);
                        if (iC == 0) {
                            str2 = "far";
                        } else if (iC == 1) {
                            str2 = "close";
                        } else {
                            eg.o();
                        }
                        arrayList2.add(new y0a0(str13, Collections.singletonMap("ble_range", str2)));
                    }
                    v0a0 v0a0Var = new v0a0(o7h.p1(arrayList2), ko90.c);
                    r5a1Var.b = 1;
                    return vr20Var.emit(v0a0Var, r5a1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof b8a1) {
                    b8a1Var = (b8a1) lnmVar;
                    int i32 = b8a1Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        b8a1Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        b8a1Var = new b8a1(this, lnmVar);
                    }
                } else {
                    b8a1Var = new b8a1(this, lnmVar);
                }
                Object obj17 = b8a1Var.a;
                int i33 = b8a1Var.b;
                if (i33 == 0) {
                    hm5.M(obj17);
                    h1r h1rVar = (k1r) obj;
                    if (h1rVar instanceof h1r) {
                        vq90Var = new e331(new m231(new Exception(h1rVar.a.getMessage())));
                    } else if (h1rVar instanceof i1r) {
                        vq90Var = new e331(((i1r) h1rVar).a);
                    } else if (!u890.j(h1rVar, j1r.a)) {
                        eg.o();
                    }
                    if (vq90Var == null) {
                        return rih1Var;
                    }
                    b8a1Var.b = 1;
                    return vr20Var.emit(vq90Var, b8a1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i33 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof h8a1) {
                    h8a1Var = (h8a1) lnmVar;
                    int i34 = h8a1Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        h8a1Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        h8a1Var = new h8a1(this, lnmVar);
                    }
                } else {
                    h8a1Var = new h8a1(this, lnmVar);
                }
                Object obj18 = h8a1Var.a;
                int i35 = h8a1Var.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                ji0 ji0Var = (k1r) obj;
                vq90Var = ji0Var instanceof i1r ? (i1r) ji0Var : null;
                if (vq90Var != null && ((Boolean) ((i1r) vq90Var).a).booleanValue()) {
                    z = true;
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                h8a1Var.b = 1;
                return vr20Var.emit(boolValueOf4, h8a1Var) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof q8a1) {
                    q8a1Var = (q8a1) lnmVar;
                    int i36 = q8a1Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        q8a1Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        q8a1Var = new q8a1(this, lnmVar);
                    }
                } else {
                    q8a1Var = new q8a1(this, lnmVar);
                }
                Object obj19 = q8a1Var.a;
                int i37 = q8a1Var.b;
                if (i37 != 0) {
                    if (i37 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                p8a1 p8a1Var = new p8a1(i1rVar2 != null ? (f7a1) i1rVar2.a : null);
                q8a1Var.b = 1;
                return vr20Var.emit(p8a1Var, q8a1Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof hca1) {
                    hca1Var = (hca1) lnmVar;
                    int i38 = hca1Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        hca1Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        hca1Var = new hca1(this, lnmVar);
                    }
                } else {
                    hca1Var = new hca1(this, lnmVar);
                }
                Object obj20 = hca1Var.a;
                int i39 = hca1Var.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                List<gca1> list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                for (gca1 gca1Var : list2) {
                    arrayList3.add(new h8k1(gca1Var, gca1Var.getId()));
                }
                hca1Var.b = 1;
                return vr20Var.emit(arrayList3, hca1Var) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof cda1) {
                    cda1Var = (cda1) lnmVar;
                    int i40 = cda1Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        cda1Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        cda1Var = new cda1(this, lnmVar);
                    }
                } else {
                    cda1Var = new cda1(this, lnmVar);
                }
                Object obj21 = cda1Var.a;
                int i41 = cda1Var.b;
                if (i41 == 0) {
                    hm5.M(obj21);
                    String string = ihc1.e1((String) obj).toString();
                    cda1Var.b = 1;
                    return vr20Var.emit(string, cda1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i41 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof iha1) {
                    iha1Var = (iha1) lnmVar;
                    int i42 = iha1Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        iha1Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        iha1Var = new iha1(this, lnmVar);
                    }
                } else {
                    iha1Var = new iha1(this, lnmVar);
                }
                Object obj22 = iha1Var.a;
                int i43 = iha1Var.b;
                if (i43 == 0) {
                    hm5.M(obj22);
                    hha1 hha1Var = new hha1((g3d0) obj);
                    iha1Var.b = 1;
                    return vr20Var.emit(hha1Var, iha1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i43 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof nha1) {
                    nha1Var = (nha1) lnmVar;
                    int i44 = nha1Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        nha1Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        nha1Var = new nha1(this, lnmVar);
                    }
                } else {
                    nha1Var = new nha1(this, lnmVar);
                }
                Object obj23 = nha1Var.a;
                int i45 = nha1Var.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                vq90Var = i1rVar4 != null ? (g3d0) i1rVar4.a : null;
                if (vq90Var == null) {
                    return rih1Var;
                }
                nha1Var.b = 1;
                return vr20Var.emit(vq90Var, nha1Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof xka1) {
                    xka1Var = (xka1) lnmVar;
                    int i46 = xka1Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        xka1Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        xka1Var = new xka1(this, lnmVar);
                    }
                } else {
                    xka1Var = new xka1(this, lnmVar);
                }
                Object obj24 = xka1Var.a;
                int i47 = xka1Var.b;
                if (i47 == 0) {
                    hm5.M(obj24);
                    zs1 zs1Var = new zs1((Set) obj);
                    xka1Var.b = 1;
                    return vr20Var.emit(zs1Var, xka1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i47 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof kpa1) {
                    kpa1Var = (kpa1) lnmVar;
                    int i48 = kpa1Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        kpa1Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        kpa1Var = new kpa1(this, lnmVar);
                    }
                } else {
                    kpa1Var = new kpa1(this, lnmVar);
                }
                Object obj25 = kpa1Var.a;
                int i49 = kpa1Var.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                jpa1 jpa1Var = (jpa1) obj;
                if (u890.j(jpa1Var, fpa1.a)) {
                    vq90Var = ht81.a;
                } else if (u890.j(jpa1Var, gpa1.a)) {
                    vq90Var = vs81.a;
                }
                kpa1Var.b = 1;
                return vr20Var.emit(vq90Var, kpa1Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof jua1) {
                    jua1Var = (jua1) lnmVar;
                    int i50 = jua1Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        jua1Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        jua1Var = new jua1(this, lnmVar);
                    }
                } else {
                    jua1Var = new jua1(this, lnmVar);
                }
                Object obj26 = jua1Var.a;
                int i51 = jua1Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                htl1 htl1Var = (htl1) obj;
                Boolean boolValueOf5 = Boolean.valueOf(u890.j(htl1Var != null ? htl1Var.b : null, brl1.b));
                jua1Var.b = 1;
                return vr20Var.emit(boolValueOf5, jua1Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof ova1) {
                    ova1Var = (ova1) lnmVar;
                    int i52 = ova1Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        ova1Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        ova1Var = new ova1(this, lnmVar);
                    }
                } else {
                    ova1Var = new ova1(this, lnmVar);
                }
                Object obj27 = ova1Var.a;
                int i53 = ova1Var.b;
                if (i53 == 0) {
                    hm5.M(obj27);
                    psa1 psa1Var = new psa1((fxa1) obj);
                    ova1Var.b = 1;
                    return vr20Var.emit(psa1Var, ova1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i53 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof rva1) {
                    rva1Var = (rva1) lnmVar;
                    int i54 = rva1Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        rva1Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        rva1Var = new rva1(this, lnmVar);
                    }
                } else {
                    rva1Var = new rva1(this, lnmVar);
                }
                Object obj28 = rva1Var.a;
                int i55 = rva1Var.b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                l0l l0lVar = (l0l) ((spq0) obj).h();
                lsa1 lsa1Var = new lsa1(l0lVar == null || l0lVar.l() || l0lVar.getState() != 4 || l0lVar.t());
                rva1Var.b = 1;
                return vr20Var.emit(lsa1Var, rva1Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof owa1) {
                    owa1Var = (owa1) lnmVar;
                    int i56 = owa1Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        owa1Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        owa1Var = new owa1(this, lnmVar);
                    }
                } else {
                    owa1Var = new owa1(this, lnmVar);
                }
                Object obj29 = owa1Var.a;
                int i57 = owa1Var.b;
                if (i57 == 0) {
                    hm5.M(obj29);
                    Boolean bool3 = (Boolean) obj;
                    if (bool3 == null || bool3.equals(Boolean.FALSE)) {
                        qwa1Var = qwa1.b;
                    } else if (bool3.equals(Boolean.TRUE)) {
                        qwa1Var = qwa1.c;
                    } else {
                        eg.o();
                    }
                    owa1Var.b = 1;
                    return vr20Var.emit(qwa1Var, owa1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i57 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                return b(obj, lnmVar);
            default:
                if (lnmVar instanceof zya1) {
                    zya1Var = (zya1) lnmVar;
                    int i58 = zya1Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        zya1Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        zya1Var = new zya1(this, lnmVar);
                    }
                } else {
                    zya1Var = new zya1(this, lnmVar);
                }
                Object obj30 = zya1Var.a;
                int i59 = zya1Var.b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                px0 px0Var = (px0) obj;
                nx0 nx0Var = px0Var instanceof nx0 ? (nx0) px0Var : null;
                vq90Var = nx0Var != null ? nx0Var.a : null;
                zya1Var.b = 1;
                return vr20Var.emit(vq90Var, zya1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ ae91(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
