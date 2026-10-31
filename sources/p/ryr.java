package p;

import android.content.Context;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ryr implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ryr(iu30 iu30Var, xhy xhyVar, why whyVar) {
        this.a = (byte) 28;
        this.b = iu30Var;
        this.c = whyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object b(Object obj, lnm lnmVar) {
        cfv cfvVar;
        boolean zE;
        dfv dfvVar = (dfv) this.c;
        if (lnmVar instanceof cfv) {
            cfvVar = (cfv) lnmVar;
            int i = cfvVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfvVar.b = i - Integer.MIN_VALUE;
            } else {
                cfvVar = new cfv(this, lnmVar);
            }
        } else {
            cfvVar = new cfv(this, lnmVar);
        }
        Object obj2 = cfvVar.a;
        int i2 = cfvVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            cxc0 cxc0Var = (cxc0) obj;
            le30 le30VarA = dfvVar.d.a(cxc0Var.f.p);
            d2f1 d2f1Var = dfvVar.c;
            String str = dfvVar.b;
            boolean z = cxc0Var.i;
            kby kbyVar = cxc0Var.f;
            boolean z2 = kbyVar.j;
            boolean z3 = kbyVar.D;
            wls0 wls0Var = kbyVar.v;
            Map map = kbyVar.q;
            if (z || z3 || ((wls0Var.a() && !z2) || Boolean.parseBoolean((String) map.get("is_video_first")))) {
                zE = false;
            } else {
                boolean zA = d2f1.a(str, le30VarA);
                jq4 jq4Var = d2f1Var.c;
                zE = zA ? jq4Var.e() : jq4Var.f();
            }
            Boolean boolValueOf = Boolean.valueOf(zE);
            cfvVar.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, cfvVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object c(Object obj, lnm lnmVar) {
        shv shvVar;
        if (lnmVar instanceof shv) {
            shvVar = (shv) lnmVar;
            int i = shvVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                shvVar.b = i - Integer.MIN_VALUE;
            } else {
                shvVar = new shv(this, lnmVar);
            }
        } else {
            shvVar = new shv(this, lnmVar);
        }
        Object obj2 = shvVar.a;
        int i2 = shvVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            if (u890.j(((l0l) obj).d(), ((uhv) this.c).f.a)) {
                shvVar.b = 1;
                Object objEmit = vr20Var.emit(obj, shvVar);
                d9n d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
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

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    private final Object e(Object obj, lnm lnmVar) {
        sov sovVar;
        z0t z0tVar = (z0t) ((jut) this.c).b;
        if (lnmVar instanceof sov) {
            sovVar = (sov) lnmVar;
            int i = sovVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sovVar.b = i - Integer.MIN_VALUE;
            } else {
                sovVar = new sov(this, lnmVar);
            }
        } else {
            sovVar = new sov(this, lnmVar);
        }
        Object obj2 = sovVar.a;
        int i2 = sovVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Boolean boolValueOf = Boolean.valueOf((((Boolean) obj).booleanValue() || z0tVar.a.n()) && z0tVar.a.g());
            sovVar.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, sovVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    private final Object f(Object obj, lnm lnmVar) {
        jwv jwvVar;
        Context context = ((lwv) this.c).a;
        if (lnmVar instanceof jwv) {
            jwvVar = (jwv) lnmVar;
            int i = jwvVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jwvVar.b = i - Integer.MIN_VALUE;
            } else {
                jwvVar = new jwv(this, lnmVar);
            }
        } else {
            jwvVar = new jwv(this, lnmVar);
        }
        Object obj2 = jwvVar.a;
        int i2 = jwvVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            z6x z6xVarSingletonList = !((List) obj).isEmpty() ? z6x.a : Collections.singletonList(new h8k1(new vzu0(context.getString(2131955281), context.getString(2131955280), null), "empty_state"));
            jwvVar.b = 1;
            Object objEmit = vr20Var.emit(z6xVarSingletonList, jwvVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object g(Object obj, lnm lnmVar) {
        uow uowVar;
        goq goqVar = (goq) this.c;
        if (lnmVar instanceof uow) {
            uowVar = (uow) lnmVar;
            int i = uowVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                uowVar.b = i - Integer.MIN_VALUE;
            } else {
                uowVar = new uow(this, lnmVar);
            }
        } else {
            uowVar = new uow(this, lnmVar);
        }
        Object obj2 = uowVar.a;
        int i2 = uowVar.b;
        String str = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            PlayerState playerState = (PlayerState) obj;
            playerState.getClass();
            String str2 = ((ContextTrack) playerState.track().h()) != null ? ((bnj0) goqVar.c).v(playerState).b : null;
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            if ((str2 == null || str2.length() != 0) && (contextTrack == null || !l4o1.P(contextTrack) || !u890.j(l4o1.a0(contextTrack, "album_title"), str2))) {
                str = str2;
            }
            uowVar.b = 1;
            Object objEmit = vr20Var.emit(str, uowVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object h(Object obj, lnm lnmVar) {
        t5x t5xVar;
        int i;
        if (lnmVar instanceof t5x) {
            t5xVar = (t5x) lnmVar;
            int i2 = t5xVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t5xVar.b = i2 - Integer.MIN_VALUE;
            } else {
                t5xVar = new t5x(this, lnmVar);
            }
        } else {
            t5xVar = new t5x(this, lnmVar);
        }
        Object obj2 = t5xVar.a;
        int i3 = t5xVar.b;
        if (i3 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Map map = (Map) obj;
            map.getClass();
            boolean zG = y7y0.G(map);
            ((u5x) this.c).c.getClass();
            boolean zC = rh11.c(map);
            if (zG) {
                i = v5x.a.a;
            } else {
                i = zC ? v5x.b.a : v5x.c.a;
            }
            Integer num = new Integer(i);
            t5xVar.b = 1;
            Object objEmit = vr20Var.emit(num, t5xVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object i(Object obj, lnm lnmVar) {
        oax oaxVar;
        if (lnmVar instanceof oax) {
            oaxVar = (oax) lnmVar;
            int i = oaxVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oaxVar.b = i - Integer.MIN_VALUE;
            } else {
                oaxVar = new oax(this, lnmVar);
            }
        } else {
            oaxVar = new oax(this, lnmVar);
        }
        Object obj2 = oaxVar.a;
        int i2 = oaxVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            iax gaxVar = ((Boolean) obj).booleanValue() ? iax.a : new gax((Integer) this.c, (String) null);
            oaxVar.b = 1;
            Object objEmit = vr20Var.emit(gaxVar, oaxVar);
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

    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c5, code lost:
    
        if (r1.emit(r2, r0) == r7) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r14, p.lnm r15) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ryr.j(java.lang.Object, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object k(Object obj, lnm lnmVar) {
        kfy kfyVar;
        if (lnmVar instanceof kfy) {
            kfyVar = (kfy) lnmVar;
            int i = kfyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfyVar.b = i - Integer.MIN_VALUE;
            } else {
                kfyVar = new kfy(this, lnmVar);
            }
        } else {
            kfyVar = new kfy(this, lnmVar);
        }
        Object obj2 = kfyVar.a;
        int i2 = kfyVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            f020 f020Var = (f020) obj;
            mfy mfyVar = new mfy(f020Var.a);
            ((myq0) this.c).m(1, f020Var.b);
            kfyVar.b = 1;
            Object objEmit = vr20Var.emit(mfyVar, kfyVar);
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

    private final Object l(Object obj, lnm lnmVar) {
        ((iu30) this.b).invoke(new xhy((why) this.c, ((Boolean) obj).booleanValue()));
        return rih1.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:117:0x01de  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:132:0x020a  */
    /* JADX WARN: Code duplicated, block: B:148:0x024d  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:195:0x0329  */
    /* JADX WARN: Code duplicated, block: B:211:0x0370  */
    /* JADX WARN: Code duplicated, block: B:239:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:255:0x0441  */
    /* JADX WARN: Code duplicated, block: B:275:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:347:0x0636  */
    /* JADX WARN: Code duplicated, block: B:373:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:440:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:475:0x093d  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:558:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:559:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:563:0x0a58 A[PHI: r5
      0x0a58: PHI (r5v4 int) = (r5v0 int), (r5v5 int), (r5v6 int), (r5v0 int) binds: [B:561:0x0a51, B:559:0x0a49, B:558:0x0a47, B:556:0x0a40] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:573:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:617:0x0b4f  */
    /* JADX WARN: Code duplicated, block: B:641:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:720:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public final Object emit(Object obj, lnm lnmVar) {
        qyr qyrVar;
        boolean z;
        tyr tyrVar;
        oa10 oa10Var;
        String string;
        l1s l1sVar;
        ex60 ex60Var;
        int i;
        d4s d4sVar;
        ev90 ev90Var;
        yu90 yu90Var;
        Object obj2;
        q4s q4sVar;
        c8s c8sVar;
        bjs bjsVar;
        rih1 rih1Var;
        my90 my90Var;
        String str;
        op90 op90Var;
        pks pksVar;
        qks qksVar;
        dls dlsVar;
        vr20 vr20Var;
        vr20 vr20Var2;
        Object obj3;
        vr20 vr20Var3;
        nos nosVar;
        xus xusVar;
        l9t l9tVar;
        cqt cqtVar;
        iyt iytVar;
        Object next;
        l0l l0lVar;
        n89 n89Var;
        int iOrdinal;
        int i2;
        String strD;
        Locale locale;
        i3v i3vVar;
        zav zavVar;
        tvy tvyVar;
        byte b = this.a;
        int i3 = 2;
        int i4 = 0;
        d9n d9nVar = d9n.a;
        rih1 rih1Var2 = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                if (lnmVar instanceof qyr) {
                    qyrVar = (qyr) lnmVar;
                    int i5 = qyrVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qyrVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        qyrVar = new qyr(this, lnmVar);
                    }
                } else {
                    qyrVar = new qyr(this, lnmVar);
                }
                Object obj6 = qyrVar.a;
                int i6 = qyrVar.b;
                if (i6 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var4 = (vr20) obj5;
                    List list = (List) obj;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                            } else if (u890.j(((qo90) it.next()).c, ((qo90) obj4).c)) {
                                z = true;
                            }
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    qyrVar.b = 1;
                    if (vr20Var4.emit(boolValueOf, qyrVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var2;
            case 1:
                Context context = (Context) ((iir) obj4).b;
                if (lnmVar instanceof tyr) {
                    tyrVar = (tyr) lnmVar;
                    int i7 = tyrVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        tyrVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        tyrVar = new tyr(this, lnmVar);
                    }
                } else {
                    tyrVar = new tyr(this, lnmVar);
                }
                Object obj7 = tyrVar.a;
                int i8 = tyrVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj7);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                vr20 vr20Var5 = (vr20) obj5;
                l0l l0lVar2 = (l0l) ((spq0) obj).h();
                if (l0lVar2 != null) {
                    boolean zC0 = hqq0.c0(l0lVar2);
                    f0u type = l0lVar2.getType();
                    String name = l0lVar2.getName();
                    if (zC0) {
                        name = context.getString(a6o1.u(type));
                    }
                    f0u type2 = l0lVar2.getType();
                    String name2 = l0lVar2.getName();
                    if (zC0) {
                        int iOrdinal2 = type2.ordinal();
                        if (iOrdinal2 == 1) {
                            string = context.getString(2131956960);
                        } else if (iOrdinal2 != 2) {
                            string = (iOrdinal2 == 3 || iOrdinal2 != 14) ? context.getString(2131956962) : context.getString(2131956959);
                        } else {
                            string = context.getString(2131956963);
                        }
                        string.getClass();
                    } else {
                        if (zC0) {
                            eg.o();
                            return null;
                        }
                        string = context.getString(2131956961, name2);
                    }
                    oa10Var = new oa10(name, string, sqe.t(l0lVar2.getType(), l0lVar2.z(), 0), hqq0.a0(l0lVar2));
                } else {
                    oa10Var = null;
                }
                tyrVar.b = 1;
                if (vr20Var5.emit(oa10Var, tyrVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var2;
            case 2:
                if (lnmVar instanceof l1s) {
                    l1sVar = (l1s) lnmVar;
                    int i9 = l1sVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        l1sVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        l1sVar = new l1s(this, lnmVar);
                    }
                } else {
                    l1sVar = new l1s(this, lnmVar);
                }
                Object obj8 = l1sVar.a;
                int i10 = l1sVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj8);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                vr20 vr20Var6 = (vr20) obj5;
                to90 to90Var = (to90) obj;
                String str2 = ((th61) obj4).a;
                so90 so90Var = to90Var.d;
                if (so90Var == null || (i = so90Var.a) == 0) {
                    switch (l1d.C(to90Var.c)) {
                        case 0:
                        case 1:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            i3 = 3;
                            ex60Var = new ex60(str2, i3, to90Var.a);
                            l1sVar.b = 1;
                            if (vr20Var6.emit(ex60Var, l1sVar) == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 2:
                        case 3:
                            i3 = 1;
                            ex60Var = new ex60(str2, i3, to90Var.a);
                            l1sVar.b = 1;
                            if (vr20Var6.emit(ex60Var, l1sVar) == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 4:
                        case 5:
                        case 9:
                        case 12:
                        case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                            ex60Var = new ex60(str2, i3, to90Var.a);
                            l1sVar.b = 1;
                            if (vr20Var6.emit(ex60Var, l1sVar) == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                } else {
                    switch (l1d.C(i)) {
                        case 0:
                        case 5:
                        case 6:
                            i3 = 3;
                            ex60Var = new ex60(str2, i3, to90Var.a);
                            l1sVar.b = 1;
                            if (vr20Var6.emit(ex60Var, l1sVar) == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 1:
                            i3 = 1;
                            ex60Var = new ex60(str2, i3, to90Var.a);
                            l1sVar.b = 1;
                            if (vr20Var6.emit(ex60Var, l1sVar) == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                            ex60Var = new ex60(str2, i3, to90Var.a);
                            l1sVar.b = 1;
                            if (vr20Var6.emit(ex60Var, l1sVar) == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                }
                return rih1Var2;
            case 3:
                if (lnmVar instanceof d4s) {
                    d4sVar = (d4s) lnmVar;
                    int i11 = d4sVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        d4sVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        d4sVar = new d4s(this, lnmVar);
                    }
                } else {
                    d4sVar = new d4s(this, lnmVar);
                }
                Object obj9 = d4sVar.a;
                int i12 = d4sVar.b;
                if (i12 == 0) {
                    hm5.M(obj9);
                    vr20 vr20Var7 = (vr20) obj5;
                    pp90 pp90Var = (pp90) obj;
                    if (pp90Var != null) {
                        e4s e4sVar = (e4s) obj4;
                        ArrayList arrayList = pp90Var.c;
                        hp90 hp90VarH = pno1.h(arrayList);
                        np90 np90Var = pp90Var.h;
                        hp90 hp90Var = np90Var.b;
                        String str3 = pp90Var.a;
                        String str4 = hp90VarH.b;
                        int i13 = hp90Var.e ? 1 : hp90Var.f ? 3 : 2;
                        int i14 = np90Var.i ? 3 : np90Var.h ? 2 : 1;
                        int size = arrayList.size();
                        ((c4s) e4sVar.c.get()).getClass();
                        String str5 = hp90Var.a;
                        Iterator it2 = arrayList.iterator();
                        Object obj10 = null;
                        boolean z2 = false;
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (u890.j(((hp90) next2).a, str5)) {
                                    if (!z2) {
                                        obj10 = next2;
                                        z2 = true;
                                    }
                                }
                            } else if (!z2) {
                            }
                            obj10 = null;
                        }
                        hp90 hp90Var2 = (hp90) obj10;
                        if (hp90Var2 != null && hp90Var2.equals(hp90Var)) {
                            boolean z3 = hp90Var.g;
                            String str6 = hp90Var.c;
                            if (z3 || ihc1.y0(str6)) {
                                yu90Var = null;
                            } else {
                                Iterator it3 = arrayList.iterator();
                                Object obj11 = null;
                                boolean z4 = false;
                                while (true) {
                                    if (it3.hasNext()) {
                                        Object next3 = it3.next();
                                        if (((hp90) next3).e) {
                                            if (!z4) {
                                                obj11 = next3;
                                                z4 = true;
                                            }
                                        }
                                    } else if (!z4) {
                                    }
                                    obj11 = null;
                                }
                                hp90 hp90Var3 = (hp90) obj11;
                                if (hp90Var3 == null) {
                                    yu90Var = null;
                                } else if (hp90Var.f) {
                                    String str7 = hp90Var3.c;
                                    if (!u890.j(hp90Var3.a, str5) || u890.j(str7, str6) || ihc1.y0(str7) || hp90Var3.g) {
                                        yu90Var = null;
                                    } else {
                                        yu90Var = new yu90(str7, hp90Var3.b, hp90Var3.d);
                                    }
                                } else {
                                    Iterator it4 = arrayList.iterator();
                                    Object obj12 = null;
                                    boolean z5 = false;
                                    while (true) {
                                        if (it4.hasNext()) {
                                            Object next4 = it4.next();
                                            hp90 hp90Var4 = (hp90) next4;
                                            if (!hp90Var4.e && !hp90Var4.f) {
                                                if (!z5) {
                                                    obj12 = next4;
                                                    z5 = true;
                                                }
                                            }
                                        } else if (z5) {
                                            obj2 = obj12;
                                        }
                                        obj2 = null;
                                    }
                                    hp90 hp90Var5 = (hp90) obj2;
                                    if (hp90Var5 != null) {
                                        if (hp90Var.e) {
                                            hp90Var3 = hp90Var5;
                                        } else if (hp90Var.equals(hp90Var5)) {
                                        }
                                        String str8 = hp90Var3.c;
                                        if (u890.j(hp90Var3.a, str5)) {
                                        }
                                    }
                                    yu90Var = null;
                                }
                            }
                        } else {
                            yu90Var = null;
                        }
                        ev90Var = new ev90(str3, str4, i13, i14, size, yu90Var);
                    } else {
                        ev90Var = null;
                    }
                    d4sVar.b = 1;
                    if (vr20Var7.emit(ev90Var, d4sVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i12 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1Var2;
            case 4:
                if (lnmVar instanceof q4s) {
                    q4sVar = (q4s) lnmVar;
                    int i15 = q4sVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        q4sVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        q4sVar = new q4s(this, lnmVar);
                    }
                } else {
                    q4sVar = new q4s(this, lnmVar);
                }
                Object obj13 = q4sVar.a;
                int i16 = q4sVar.b;
                if (i16 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var8 = (vr20) obj5;
                    ((t4s) obj4).getClass();
                    List list2 = (List) obj;
                    ArrayList<v0a0> arrayList2 = new ArrayList();
                    for (Object obj14 : list2) {
                        if (obj14 instanceof v0a0) {
                            arrayList2.add(obj14);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    for (v0a0 v0a0Var : arrayList2) {
                        Set set = v0a0Var.a;
                        ArrayList arrayList4 = new ArrayList(q7h.U(set, 10));
                        Iterator it5 = set.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(new mmr0(it5.next(), v0a0Var.a()));
                        }
                        arrayList3.add(arrayList4);
                    }
                    ArrayList<mmr0> arrayListV = q7h.V(arrayList3);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (mmr0 mmr0Var : arrayListV) {
                        Object obj15 = mmr0Var.a;
                        Object arrayList5 = linkedHashMap.get(obj15);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            linkedHashMap.put(obj15, arrayList5);
                        }
                        ((List) arrayList5).add((ko90) mmr0Var.b);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), o7h.p1((Iterable) entry.getValue()));
                    }
                    ArrayList<w0a0> arrayList6 = new ArrayList();
                    for (Object obj16 : list2) {
                        if (obj16 instanceof w0a0) {
                            arrayList6.add(obj16);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                    for (w0a0 w0a0Var : arrayList6) {
                        Set set2 = w0a0Var.a;
                        ArrayList arrayList8 = new ArrayList(q7h.U(set2, 10));
                        Iterator it6 = set2.iterator();
                        while (it6.hasNext()) {
                            arrayList8.add(new mmr0(it6.next(), w0a0Var.a()));
                        }
                        arrayList7.add(arrayList8);
                    }
                    ArrayList<mmr0> arrayListV2 = q7h.V(arrayList7);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (mmr0 mmr0Var2 : arrayListV2) {
                        Object obj17 = mmr0Var2.a;
                        Object arrayList9 = linkedHashMap3.get(obj17);
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                            linkedHashMap3.put(obj17, arrayList9);
                        }
                        ((List) arrayList9).add((ko90) mmr0Var2.b);
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(zno1.s(linkedHashMap3.size()));
                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                        linkedHashMap4.put(entry2.getKey(), o7h.p1((Iterable) entry2.getValue()));
                    }
                    u0a0 u0a0Var = new u0a0(linkedHashMap2, linkedHashMap4);
                    q4sVar.b = 1;
                    if (vr20Var8.emit(u0a0Var, q4sVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var2;
            case 5:
                if (lnmVar instanceof c8s) {
                    c8sVar = (c8s) lnmVar;
                    int i17 = c8sVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c8sVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        c8sVar = new c8s(this, lnmVar);
                    }
                } else {
                    c8sVar = new c8s(this, lnmVar);
                }
                Object obj18 = c8sVar.a;
                int i18 = c8sVar.b;
                if (i18 == 0) {
                    hm5.M(obj18);
                    vr20 vr20Var9 = (vr20) obj5;
                    rnb1 rnb1Var = (rnb1) obj;
                    for (czi0 czi0Var : rnb1Var.b) {
                        zdz0 zdz0Var = czi0Var.a;
                        zdz0Var.b.invoke(new k5j0(zdz0Var.a, czi0Var.b));
                    }
                    zdz0 zdz0Var2 = rnb1Var.a;
                    gd80 gd80Var = zdz0Var2 != null ? new gd80(new xwi0(zdz0Var2), new qj0((f8s) ((w7p) ((d8s) obj4).a.get()).a.a.v0.get(), new fyk0())) : null;
                    c8sVar.b = 1;
                    if (vr20Var9.emit(gd80Var, c8sVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i18 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                }
                return rih1Var2;
            case 6:
                mxr mxrVar = (mxr) obj4;
                b0a0 b0a0Var = (b0a0) mxrVar.c;
                if (lnmVar instanceof bjs) {
                    bjsVar = (bjs) lnmVar;
                    int i19 = bjsVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        bjsVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        bjsVar = new bjs(this, lnmVar);
                    }
                } else {
                    bjsVar = new bjs(this, lnmVar);
                }
                Object obj19 = bjsVar.a;
                int i20 = bjsVar.b;
                if (i20 == 0) {
                    hm5.M(obj19);
                    vr20 vr20Var10 = (vr20) obj5;
                    mmr0 mmr0Var3 = (mmr0) obj;
                    pp90 pp90Var2 = (pp90) mmr0Var3.a;
                    bp90 bp90Var = (bp90) mmr0Var3.b;
                    lp90 lp90Var = pp90Var2.d;
                    ArrayList<hp90> arrayList10 = pp90Var2.c;
                    np90 np90Var2 = pp90Var2.h;
                    hp90 hp90Var6 = np90Var2.b;
                    int i21 = lp90Var.c;
                    boolean zC = ((no4) b0a0Var.a.get()).C();
                    boolean z6 = zC && hp90Var6.f;
                    boolean z7 = (!zC || (op90Var = pp90Var2.f) == null) ? true : op90Var.a;
                    String str9 = np90Var2.a;
                    bw8 bw8Var = (bw8) mxrVar.b;
                    boolean z8 = hp90Var6.e;
                    Context context2 = bw8Var.a;
                    lp90 lp90Var2 = pp90Var2.d;
                    String string2 = lp90Var2.b;
                    f0u f0uVarB = kr90.b(lp90Var2.c);
                    jp90 jp90Var = lp90Var2.g;
                    boolean z9 = jp90Var.b;
                    boolean z10 = jp90Var.a;
                    Boolean boolValueOf2 = Boolean.valueOf(z8);
                    for (hp90 hp90Var7 : arrayList10) {
                        boolean z11 = z9;
                        rih1Var = rih1Var2;
                        if (hp90Var7.e) {
                            String str10 = hp90Var7.b;
                            if (z10 && u890.j(boolValueOf2, Boolean.FALSE)) {
                                string2 = j9k1.o(context2, f0uVarB, string2, str10);
                            } else if (z11) {
                                string2 = context2.getString(a6o1.u(f0uVarB));
                            }
                            f0u f0uVarB2 = kr90.b(i21);
                            for (hp90 hp90Var8 : arrayList10) {
                                if (hp90Var8.e) {
                                    String str11 = hp90Var8.b;
                                    boolean z12 = hp90Var6.e;
                                    String str12 = hp90Var6.c;
                                    fp90 fp90Var = pp90Var2.e;
                                    if (fp90Var == null || (str = fp90Var.b) == null) {
                                        my90Var = null;
                                    } else {
                                        String str13 = fp90Var.a;
                                        my90Var = new my90(str, str13, str13);
                                    }
                                    qc0 qc0Var = new qc0(str9, string2, f0uVarB2, str11, str12, mqo1.A(o7h.N0(rwq0.F(arrayList10), p7h.N(my90Var))), new pc0(pp90Var2.a, z12), ((no4) b0a0Var.a.get()).x() && np90Var2.j && bp90Var.g, np90Var2.c, lp90Var.e, ((eh4) mxrVar.d).b() == bh4.b && !z6, ((no4) b0a0Var.a.get()).t() && z12, z6, z7);
                                    bjsVar.b = 1;
                                    if (vr20Var10.emit(qc0Var, bjsVar) == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                            }
                            bhn0.t("Collection contains no element matching the predicate.");
                            return null;
                        }
                        z9 = z11;
                        rih1Var2 = rih1Var;
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                if (i20 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                rih1Var = rih1Var2;
                return rih1Var;
            case 7:
                if (lnmVar instanceof pks) {
                    pksVar = (pks) lnmVar;
                    int i22 = pksVar.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        pksVar.b = i22 - Integer.MIN_VALUE;
                    } else {
                        pksVar = new pks(this, lnmVar);
                    }
                } else {
                    pksVar = new pks(this, lnmVar);
                }
                Object obj20 = pksVar.a;
                int i23 = pksVar.b;
                if (i23 == 0) {
                    hm5.M(obj20);
                    vr20 vr20Var11 = (vr20) obj5;
                    List list3 = (List) obj;
                    ArrayList arrayList11 = new ArrayList(q7h.U(list3, 10));
                    Iterator it7 = list3.iterator();
                    while (it7.hasNext()) {
                        arrayList11.add(new ki90((zv31) it7.next(), ((but) obj4).getType(), false));
                    }
                    pksVar.b = 1;
                    if (vr20Var11.emit(arrayList11, pksVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i23 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var2;
            case 8:
                if (lnmVar instanceof qks) {
                    qksVar = (qks) lnmVar;
                    int i24 = qksVar.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        qksVar.b = i24 - Integer.MIN_VALUE;
                    } else {
                        qksVar = new qks(this, lnmVar);
                    }
                } else {
                    qksVar = new qks(this, lnmVar);
                }
                Object obj21 = qksVar.a;
                int i25 = qksVar.b;
                if (i25 == 0) {
                    hm5.M(obj21);
                    ki90 ki90Var = (ki90) obj4;
                    ki90 ki90Var2 = new ki90(ki90Var.a, ki90Var.b, ((Boolean) obj).booleanValue());
                    qksVar.b = 1;
                    if (((vr20) obj5).emit(ki90Var2, qksVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1Var2;
            case 9:
                goq goqVar = (goq) obj4;
                if (lnmVar instanceof dls) {
                    dlsVar = (dls) lnmVar;
                    int i26 = dlsVar.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        dlsVar.b = i26 - Integer.MIN_VALUE;
                    } else {
                        dlsVar = new dls(this, lnmVar);
                    }
                } else {
                    dlsVar = new dls(this, lnmVar);
                }
                Object obj22 = dlsVar.a;
                int i27 = dlsVar.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        i4 = dlsVar.d;
                        vr20Var3 = dlsVar.c;
                        hm5.M(obj22);
                        vr20Var2 = null;
                    } else {
                        if (i27 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj22);
                    }
                    return rih1Var2;
                }
                hm5.M(obj22);
                vr20Var = (vr20) obj5;
                if (((Boolean) obj).booleanValue() && ((c9c0) goqVar.d).b.current().getValue() == null) {
                    dlsVar.c = vr20Var;
                    dlsVar.d = 0;
                    dlsVar.b = 1;
                    vr20Var2 = null;
                    Object objY = fn31.Y((q8n) goqVar.h, new bu(goqVar, (lnm) null, (byte) 11), dlsVar);
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                    vr20Var3 = vr20Var;
                    obj22 = objY;
                } else {
                    vr20Var2 = null;
                    obj3 = Boolean.FALSE;
                }
                dlsVar.c = vr20Var2;
                dlsVar.d = i4;
                dlsVar.b = 2;
                if (vr20Var.emit(obj3, dlsVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var2;
                vr20 vr20Var12 = vr20Var3;
                obj3 = obj22;
                vr20Var = vr20Var12;
                dlsVar.c = vr20Var2;
                dlsVar.d = i4;
                dlsVar.b = 2;
                if (vr20Var.emit(obj3, dlsVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var2;
            case 10:
                if (lnmVar instanceof nos) {
                    nosVar = (nos) lnmVar;
                    int i28 = nosVar.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        nosVar.b = i28 - Integer.MIN_VALUE;
                    } else {
                        nosVar = new nos(this, lnmVar);
                    }
                } else {
                    nosVar = new nos(this, lnmVar);
                }
                Object obj23 = nosVar.a;
                int i29 = nosVar.b;
                if (i29 == 0) {
                    hm5.M(obj23);
                    mmr0 mmr0Var4 = new mmr0(((xz71) obj4).getType(), (gd80) obj);
                    nosVar.b = 1;
                    if (((vr20) obj5).emit(mmr0Var4, nosVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i29 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj23);
                }
                return rih1Var2;
            case 11:
                if (lnmVar instanceof xus) {
                    xusVar = (xus) lnmVar;
                    int i30 = xusVar.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        xusVar.b = i30 - Integer.MIN_VALUE;
                    } else {
                        xusVar = new xus(this, lnmVar);
                    }
                } else {
                    xusVar = new xus(this, lnmVar);
                }
                Object obj24 = xusVar.a;
                int i31 = xusVar.b;
                if (i31 == 0) {
                    hm5.M(obj24);
                    vr20 vr20Var13 = (vr20) obj5;
                    Collection<uus> collectionValues = ((Map) obj).values();
                    ArrayList arrayList12 = new ArrayList(q7h.U(collectionValues, 10));
                    for (uus uusVar : collectionValues) {
                        mma0[] mma0VarArr = zus.i;
                        arrayList12.add(new k6w0(p4j0.a, uusVar.c, new fpo(uusVar, (zus) obj4, (lnm) null, (byte) 3)));
                    }
                    xusVar.b = 1;
                    if (vr20Var13.emit(arrayList12, xusVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i31 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj24);
                }
                return rih1Var2;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yzs yzsVar = (yzs) obj5;
                if (!zBooleanValue) {
                    nqs nqsVar = yzsVar.j;
                    if (nqsVar != null) {
                        nqsVar.a();
                    }
                    yzsVar.j = null;
                }
                yzsVar.e.c(zBooleanValue, (a8l) obj4);
                return rih1Var2;
            case 13:
                if (lnmVar instanceof l9t) {
                    l9tVar = (l9t) lnmVar;
                    int i32 = l9tVar.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        l9tVar.b = i32 - Integer.MIN_VALUE;
                    } else {
                        l9tVar = new l9t(this, lnmVar);
                    }
                } else {
                    l9tVar = new l9t(this, lnmVar);
                }
                Object obj25 = l9tVar.a;
                int i33 = l9tVar.b;
                if (i33 == 0) {
                    hm5.M(obj25);
                    vr20 vr20Var14 = (vr20) obj5;
                    Boolean bool = (Boolean) obj;
                    boolean zBooleanValue2 = bool.booleanValue();
                    p9t p9tVar = (p9t) obj4;
                    Boolean bool2 = p9tVar.g;
                    p9tVar.g = bool;
                    if (u890.j(bool2, Boolean.TRUE) && !zBooleanValue2) {
                        l9tVar.b = 1;
                        if (vr20Var14.emit(obj, l9tVar) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i33 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj25);
                }
                return rih1Var2;
            case 14:
                if (lnmVar instanceof cqt) {
                    cqtVar = (cqt) lnmVar;
                    int i34 = cqtVar.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        cqtVar.b = i34 - Integer.MIN_VALUE;
                    } else {
                        cqtVar = new cqt(this, lnmVar);
                    }
                } else {
                    cqtVar = new cqt(this, lnmVar);
                }
                Object obj26 = cqtVar.a;
                int i35 = cqtVar.b;
                if (i35 == 0) {
                    hm5.M(obj26);
                    bqt bqtVar = new bqt(((aqt) obj4).a, (List) obj);
                    cqtVar.b = 1;
                    if (((vr20) obj5).emit(bqtVar, cqtVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i35 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj26);
                }
                return rih1Var2;
            case 15:
                if (lnmVar instanceof iyt) {
                    iytVar = (iyt) lnmVar;
                    int i36 = iytVar.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        iytVar.b = i36 - Integer.MIN_VALUE;
                    } else {
                        iytVar = new iyt(this, lnmVar);
                    }
                } else {
                    iytVar = new iyt(this, lnmVar);
                }
                Object obj27 = iytVar.a;
                int i37 = iytVar.b;
                if (i37 != 0) {
                    if (i37 == 1) {
                        hm5.M(obj27);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                vr20 vr20Var15 = (vr20) obj5;
                ArrayList arrayList13 = new ArrayList();
                for (cut cutVar : (Set) obj) {
                    Iterator it8 = ((g0l) obj4).i().iterator();
                    do {
                        if (it8.hasNext()) {
                            next = it8.next();
                            strD = ((l0l) next).d();
                            locale = Locale.ROOT;
                        } else {
                            next = null;
                        }
                        l0lVar = (l0l) next;
                        if (l0lVar == null) {
                            n89Var = null;
                        } else {
                            String strJ = l0lVar.j();
                            String name3 = l0lVar.getName();
                            f0u type3 = l0lVar.getType();
                            iOrdinal = cutVar.c.ordinal();
                            if (iOrdinal != 0) {
                                i2 = 3;
                            } else if (iOrdinal != 1) {
                                i2 = 2;
                            } else if (iOrdinal != 2) {
                                i2 = 1;
                            } else {
                                if (iOrdinal == 3) {
                                    eg.o();
                                    return null;
                                }
                                i2 = 4;
                            }
                            n89Var = new n89(strJ, name3, type3, i2);
                        }
                        if (n89Var != null) {
                            arrayList13.add(n89Var);
                        }
                    } while (!strD.toLowerCase(locale).equals(cutVar.a.toLowerCase(locale)));
                    l0lVar = (l0l) next;
                    if (l0lVar == null) {
                        n89Var = null;
                    } else {
                        String strJ2 = l0lVar.j();
                        String name4 = l0lVar.getName();
                        f0u type4 = l0lVar.getType();
                        iOrdinal = cutVar.c.ordinal();
                        if (iOrdinal != 0) {
                            i2 = 3;
                        } else if (iOrdinal != 1) {
                            i2 = 2;
                        } else if (iOrdinal != 2) {
                            i2 = 1;
                        } else {
                            if (iOrdinal == 3) {
                                eg.o();
                                return null;
                            }
                            i2 = 4;
                        }
                        n89Var = new n89(strJ2, name4, type4, i2);
                    }
                    if (n89Var != null) {
                        arrayList13.add(n89Var);
                    }
                }
                Set setP1 = o7h.p1(arrayList13);
                iytVar.b = 1;
                if (vr20Var15.emit(setP1, iytVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var2;
            case 16:
                en60 en60Var = (en60) obj;
                ji0 ji0Var = ((xgu) obj5).a;
                if (ji0Var != null) {
                    ((ygu) obj4).d.v(en60Var, ji0Var);
                }
                return rih1Var2;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof i3v) {
                    i3vVar = (i3v) lnmVar;
                    int i38 = i3vVar.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        i3vVar.b = i38 - Integer.MIN_VALUE;
                    } else {
                        i3vVar = new i3v(this, lnmVar);
                    }
                } else {
                    i3vVar = new i3v(this, lnmVar);
                }
                Object obj28 = i3vVar.a;
                int i39 = i3vVar.b;
                if (i39 == 0) {
                    hm5.M(obj28);
                    vr20 vr20Var16 = (vr20) obj5;
                    b3v b3vVar = u890.j((String) obj, ((ttw0) obj4).b) ? b3v.a : c3v.a;
                    i3vVar.b = 1;
                    if (vr20Var16.emit(b3vVar, i3vVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i39 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj28);
                }
                return rih1Var2;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof zav) {
                    zavVar = (zav) lnmVar;
                    int i40 = zavVar.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        zavVar.b = i40 - Integer.MIN_VALUE;
                    } else {
                        zavVar = new zav(this, lnmVar);
                    }
                } else {
                    zavVar = new zav(this, lnmVar);
                }
                Object obj29 = zavVar.a;
                int i41 = zavVar.b;
                if (i41 == 0) {
                    hm5.M(obj29);
                    vr20 vr20Var17 = (vr20) obj5;
                    Boolean bool3 = (Boolean) obj;
                    bbv bbvVar = (bbv) obj4;
                    Boolean bool4 = bbvVar.f;
                    bbvVar.f = bool3;
                    if (bool4 != null && !bool4.equals(bool3)) {
                        zavVar.b = 1;
                        if (vr20Var17.emit(obj, zavVar) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i41 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj29);
                }
                return rih1Var2;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return b(obj, lnmVar);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return c(obj, lnmVar);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return e(obj, lnmVar);
            case 22:
                return f(obj, lnmVar);
            case 23:
                return g(obj, lnmVar);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return h(obj, lnmVar);
            case 25:
                return i(obj, lnmVar);
            case 26:
                return j(obj, lnmVar);
            case 27:
                return k(obj, lnmVar);
            case 28:
                return l(obj, lnmVar);
            default:
                if (lnmVar instanceof tvy) {
                    tvyVar = (tvy) lnmVar;
                    int i42 = tvyVar.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        tvyVar.b = i42 - Integer.MIN_VALUE;
                    } else {
                        tvyVar = new tvy(this, lnmVar);
                    }
                } else {
                    tvyVar = new tvy(this, lnmVar);
                }
                Object obj30 = tvyVar.a;
                int i43 = tvyVar.b;
                if (i43 == 0) {
                    hm5.M(obj30);
                    ((uvy) obj4).getClass();
                    List listA = uvy.g((py21) obj).a();
                    tvyVar.b = 1;
                    if (((vr20) obj5).emit(listA, tvyVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i43 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj30);
                }
                return rih1Var2;
        }
    }

    public /* synthetic */ ryr(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
