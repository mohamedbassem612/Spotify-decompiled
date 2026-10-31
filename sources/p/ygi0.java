package p;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.protobuf.Empty;
import com.spotify.deviceproxy.navigation.v1.NavigationCommand;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ygi0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ygi0(vr20 vr20Var, dlk0 dlk0Var, String str, String str2) {
        this.a = (byte) 4;
        this.b = vr20Var;
        this.c = dlk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x021b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0293  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:179:0x0335  */
    /* JADX WARN: Code duplicated, block: B:206:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:225:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:241:0x043a  */
    /* JADX WARN: Code duplicated, block: B:268:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:290:0x0530  */
    /* JADX WARN: Code duplicated, block: B:306:0x0570  */
    /* JADX WARN: Code duplicated, block: B:326:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:353:0x0661  */
    /* JADX WARN: Code duplicated, block: B:374:0x06af  */
    /* JADX WARN: Code duplicated, block: B:410:0x0765  */
    /* JADX WARN: Code duplicated, block: B:431:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:447:0x0804  */
    /* JADX WARN: Code duplicated, block: B:475:0x086f  */
    /* JADX WARN: Code duplicated, block: B:491:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:507:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:523:0x093f  */
    /* JADX WARN: Code duplicated, block: B:541:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public final Object emit(Object obj, lnm lnmVar) {
        xgi0 xgi0Var;
        eii0 eii0Var;
        rii0 rii0Var;
        cxj0 cxj0Var;
        clk0 clk0Var;
        lnk0 lnk0Var;
        ntm0 ntm0Var;
        Long lA;
        eym0 eym0Var;
        u8n0 u8n0Var;
        gtn0 gtn0Var;
        ytn0 ytn0Var;
        jun0 jun0Var;
        jbo0 jbo0Var;
        vr20 vr20Var;
        m0p0 m0p0Var;
        g3p0 g3p0Var;
        g4p0 g4p0Var;
        Object objB;
        r9p0 r9p0Var;
        hip0 hip0Var;
        ole0 ole0Var;
        opp0 opp0Var;
        etp0 etp0Var;
        dtp0 dtp0Var;
        ptp0 ptp0Var;
        vr20 vr20Var2;
        vr20 vr20Var3;
        EsOffline.OfflineLicenseInfo.Expiry expiryN;
        mtp0 mtp0Var;
        vtp0 vtp0Var;
        vr20 vr20Var4;
        q3q0 q3q0Var;
        byte b = this.a;
        z = false;
        z = false;
        boolean z = false;
        int i = 0;
        i = 0;
        int i2 = 0;
        int i3 = 0;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        ole0 ole0VarValueOf = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof xgi0) {
                    xgi0Var = (xgi0) lnmVar;
                    int i4 = xgi0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        xgi0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        xgi0Var = new xgi0(this, lnmVar);
                    }
                } else {
                    xgi0Var = new xgi0(this, lnmVar);
                }
                Object obj4 = xgi0Var.a;
                int i5 = xgi0Var.b;
                if (i5 == 0) {
                    hm5.M(obj4);
                    Set set = (Set) obj;
                    ioj0 ioj0Var = (ioj0) ((ahi0) obj2).V0;
                    set.getClass();
                    egi0 egi0Var = new egi0(ioj0Var, set);
                    xgi0Var.b = 1;
                    if (((vr20) obj3).emit(egi0Var, xgi0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i5 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 1:
                if (lnmVar instanceof eii0) {
                    eii0Var = (eii0) lnmVar;
                    int i6 = eii0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        eii0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        eii0Var = new eii0(this, lnmVar);
                    }
                } else {
                    eii0Var = new eii0(this, lnmVar);
                }
                Object obj5 = eii0Var.a;
                int i7 = eii0Var.b;
                if (i7 == 0) {
                    hm5.M(obj5);
                    rhi0 rhi0Var = (rhi0) obj;
                    String strQ = z8p1.q(((mey0) obj2).c, rhi0Var.d, rhi0Var.e);
                    eii0Var.b = 1;
                    if (((vr20) obj3).emit(strQ, eii0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i7 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof rii0) {
                    rii0Var = (rii0) lnmVar;
                    int i8 = rii0Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        rii0Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        rii0Var = new rii0(this, lnmVar);
                    }
                } else {
                    rii0Var = new rii0(this, lnmVar);
                }
                Object obj6 = rii0Var.a;
                int i9 = rii0Var.b;
                if (i9 == 0) {
                    hm5.M(obj6);
                    Set set2 = (Set) obj;
                    ioj0 ioj0Var2 = (ioj0) ((r8s) obj2).Y;
                    set2.getClass();
                    lii0 lii0Var = new lii0(ioj0Var2, set2);
                    rii0Var.b = 1;
                    if (((vr20) obj3).emit(lii0Var, rii0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i9 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof cxj0) {
                    cxj0Var = (cxj0) lnmVar;
                    int i10 = cxj0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        cxj0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        cxj0Var = new cxj0(this, lnmVar);
                    }
                } else {
                    cxj0Var = new cxj0(this, lnmVar);
                }
                Object obj7 = cxj0Var.a;
                int i11 = cxj0Var.b;
                if (i11 == 0) {
                    hm5.M(obj7);
                    cug0 cug0VarD = ((exj0) obj2).i.d((Map) obj);
                    cxj0Var.b = 1;
                    if (((vr20) obj3).emit(cug0VarD, cxj0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i11 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof clk0) {
                    clk0Var = (clk0) lnmVar;
                    int i12 = clk0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        clk0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        clk0Var = new clk0(this, lnmVar);
                    }
                } else {
                    clk0Var = new clk0(this, lnmVar);
                }
                Object obj8 = clk0Var.a;
                int i13 = clk0Var.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                vr20 vr20Var5 = (vr20) obj3;
                i1r i1rVar = (k1r) obj;
                if (!(i1rVar instanceof j1r)) {
                    if (i1rVar instanceof i1r) {
                        glk0 glk0Var = ((dlk0) obj2).a;
                        mmr0 mmr0Var = (mmr0) i1rVar.a;
                        ole0VarValueOf = Boolean.valueOf(glk0Var.a((zkk0) mmr0Var.a, (zkk0) mmr0Var.b));
                    } else {
                        if (!(i1rVar instanceof h1r)) {
                            eg.o();
                            return null;
                        }
                        ole0VarValueOf = Boolean.FALSE;
                    }
                }
                if (ole0VarValueOf != null) {
                    clk0Var.b = 1;
                    if (vr20Var5.emit(ole0VarValueOf, clk0Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof lnk0) {
                    lnk0Var = (lnk0) lnmVar;
                    int i14 = lnk0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        lnk0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        lnk0Var = new lnk0(this, lnmVar);
                    }
                } else {
                    lnk0Var = new lnk0(this, lnmVar);
                }
                Object obj9 = lnk0Var.a;
                int i15 = lnk0Var.b;
                if (i15 == 0) {
                    hm5.M(obj9);
                    Map map = (Map) obj;
                    jbk0 jbk0Var = (jbk0) obj2;
                    jbk0Var.getClass();
                    ibk0 ibk0VarA = jbk0Var.a((String) map.get("mixing-tools"), (String) map.get("type"));
                    lnk0Var.b = 1;
                    if (((vr20) obj3).emit(ibk0VarA, lnk0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i15 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof ntm0) {
                    ntm0Var = (ntm0) lnmVar;
                    int i16 = ntm0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        ntm0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        ntm0Var = new ntm0(this, lnmVar);
                    }
                } else {
                    ntm0Var = new ntm0(this, lnmVar);
                }
                Object obj10 = ntm0Var.a;
                int i17 = ntm0Var.b;
                if (i17 == 0) {
                    hm5.M(obj10);
                    vr20 vr20Var6 = (vr20) obj3;
                    lsm0 lsm0Var = ((i091) obj).a;
                    if (u890.j(lsm0Var != null ? lsm0Var.h : null, ((jtm0) obj2).c.h)) {
                        ntm0Var.b = 1;
                        if (vr20Var6.emit(obj, ntm0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 7:
                i091 i091Var = (i091) obj;
                n2u0 n2u0Var = ((o0i) obj3).c.b;
                if (n2u0Var != null) {
                    l2u0 l2u0VarW = k4k.w(i091Var);
                    clj1 clj1Var = ((gij1) obj2).b;
                    n2u0Var.b(l2u0.a(l2u0VarW, false, clj1Var.c, 0L, !clj1Var.f, (Integer) null, 439));
                }
                return rih1Var;
            case 8:
                dal1 dal1Var = (eal1) obj;
                ven0 ven0Var = (ven0) obj2;
                if (!(dal1Var instanceof dal1)) {
                    if (!(dal1Var instanceof cal1)) {
                        eg.o();
                        return null;
                    }
                    r091 r091Var = (r091) ven0Var.getValue();
                    if (r091Var == null) {
                        return rih1Var;
                    }
                    r091Var.h(((cal1) dal1Var).a);
                    return rih1Var;
                }
                n2u0 n2u0Var2 = ((o0i) obj3).c.b;
                if (n2u0Var2 == null || (lA = n2u0Var2.a()) == null) {
                    return rih1Var;
                }
                long jLongValue = lA.longValue();
                r091 r091Var2 = (r091) ven0Var.getValue();
                if (r091Var2 == null) {
                    return rih1Var;
                }
                r091Var2.h(((long) dal1Var.a) + jLongValue);
                return rih1Var;
            case 9:
                if (lnmVar instanceof eym0) {
                    eym0Var = (eym0) lnmVar;
                    int i18 = eym0Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        eym0Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        eym0Var = new eym0(this, lnmVar);
                    }
                } else {
                    eym0Var = new eym0(this, lnmVar);
                }
                Object obj11 = eym0Var.a;
                int i19 = eym0Var.b;
                if (i19 == 0) {
                    hm5.M(obj11);
                    mmr0 mmr0Var2 = new mmr0(new Integer(((qxm0) obj2).a), (lax) obj);
                    eym0Var.b = 1;
                    if (((vr20) obj3).emit(mmr0Var2, eym0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i19 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 10:
                if (lnmVar instanceof u8n0) {
                    u8n0Var = (u8n0) lnmVar;
                    int i20 = u8n0Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        u8n0Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        u8n0Var = new u8n0(this, lnmVar);
                    }
                } else {
                    u8n0Var = new u8n0(this, lnmVar);
                }
                Object obj12 = u8n0Var.a;
                int i21 = u8n0Var.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    vr20 vr20Var7 = (vr20) obj3;
                    z7n0 z7n0Var = new z7n0((((q0o1) obj2).equals(wkd.c) && ((bf90) obj).a) ? false : true);
                    u8n0Var.b = 1;
                    if (vr20Var7.emit(z7n0Var, u8n0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var;
            case 11:
                mmr0 mmr0Var3 = (mmr0) obj;
                Context context = (Context) obj2;
                EncoreTextView encoreTextView = ((wkn0) obj3).h1;
                e090 e090Var = (e090) mmr0Var3.a;
                boolean zBooleanValue = ((Boolean) mmr0Var3.b).booleanValue();
                if (e090Var instanceof zz80) {
                    encoreTextView.setText(context.getString(2131962536));
                    encoreTextView.setVisibility(0);
                } else if ((e090Var instanceof d090) && zBooleanValue) {
                    encoreTextView.setText(context.getString(2131962537));
                    encoreTextView.setVisibility(0);
                } else {
                    encoreTextView.setVisibility(4);
                }
                return rih1Var;
            case 12:
                ((ven0) obj3).setValue(Boolean.TRUE);
                ((drr0) obj2).t(((vt9) obj).c);
                return rih1Var;
            case 13:
                if (lnmVar instanceof gtn0) {
                    gtn0Var = (gtn0) lnmVar;
                    int i22 = gtn0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        gtn0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        gtn0Var = new gtn0(this, lnmVar);
                    }
                } else {
                    gtn0Var = new gtn0(this, lnmVar);
                }
                Object obj13 = gtn0Var.a;
                int i23 = gtn0Var.b;
                if (i23 == 0) {
                    hm5.M(obj13);
                    usn0 usn0Var = new usn0((ntn0) obj2, ((Boolean) obj).booleanValue());
                    gtn0Var.b = 1;
                    if (((vr20) obj3).emit(usn0Var, gtn0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i23 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var;
            case 14:
                if (lnmVar instanceof ytn0) {
                    ytn0Var = (ytn0) lnmVar;
                    int i24 = ytn0Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        ytn0Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        ytn0Var = new ytn0(this, lnmVar);
                    }
                } else {
                    ytn0Var = new ytn0(this, lnmVar);
                }
                Object obj14 = ytn0Var.a;
                int i25 = ytn0Var.b;
                if (i25 == 0) {
                    hm5.M(obj14);
                    vr20 vr20Var8 = (vr20) obj3;
                    NavigationCommand navigationCommand = (NavigationCommand) obj;
                    nnr nnrVar = (nnr) ((bun0) obj2).b.g().d.h();
                    if (nnrVar != null ? u890.j(navigationCommand.q(), nnrVar.d) : false) {
                        ytn0Var.b = 1;
                        if (vr20Var8.emit(obj, ytn0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
            case 15:
                if (lnmVar instanceof jun0) {
                    jun0Var = (jun0) lnmVar;
                    int i26 = jun0Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        jun0Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        jun0Var = new jun0(this, lnmVar);
                    }
                } else {
                    jun0Var = new jun0(this, lnmVar);
                }
                Object obj15 = jun0Var.a;
                int i27 = jun0Var.b;
                if (i27 == 0) {
                    hm5.M(obj15);
                    iun0 iun0VarW = ((bnj0) obj2).w((hx21) obj);
                    jun0Var.b = 1;
                    if (((vr20) obj3).emit(iun0VarW, jun0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var;
            case 16:
                if (lnmVar instanceof jbo0) {
                    jbo0Var = (jbo0) lnmVar;
                    int i28 = jbo0Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        jbo0Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        jbo0Var = new jbo0(this, lnmVar);
                    }
                } else {
                    jbo0Var = new jbo0(this, lnmVar);
                }
                Object obj16 = jbo0Var.a;
                int i29 = jbo0Var.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        i3 = jbo0Var.d;
                        vr20Var = jbo0Var.c;
                        hm5.M(obj16);
                    } else {
                        if (i29 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj16);
                    }
                    return rih1Var;
                }
                hm5.M(obj16);
                vr20 vr20Var9 = (vr20) obj3;
                esa1 esa1Var = (esa1) ((g2z) obj2).c;
                jbo0Var.c = vr20Var9;
                jbo0Var.d = 0;
                jbo0Var.b = 1;
                Object objY = fn31.Y((q8n) esa1Var.b, new kdt0(esa1Var, (lnm) null, (byte) 29), jbo0Var);
                if (objY == d9nVar) {
                    return d9nVar;
                }
                vr20Var = vr20Var9;
                obj16 = objY;
                Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj16).booleanValue());
                jbo0Var.c = null;
                jbo0Var.d = i3;
                jbo0Var.b = 2;
                if (vr20Var.emit(boolValueOf, jbo0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                int iIntValue = ((Number) obj).intValue();
                ViewGroup viewGroup = (ViewGroup) obj3;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = iIntValue;
                viewGroup.setLayoutParams(layoutParams);
                m1p0 m1p0Var = (m1p0) obj2;
                m1p0Var.e.c(m1p0.f[0], m1p0Var, Integer.valueOf(iIntValue));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof m0p0) {
                    m0p0Var = (m0p0) lnmVar;
                    int i30 = m0p0Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        m0p0Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        m0p0Var = new m0p0(this, lnmVar);
                    }
                } else {
                    m0p0Var = new m0p0(this, lnmVar);
                }
                Object obj17 = m0p0Var.a;
                int i31 = m0p0Var.b;
                if (i31 == 0) {
                    hm5.M(obj17);
                    vr20 vr20Var10 = (vr20) obj3;
                    vir0 vir0Var = (vir0) obj;
                    Bundle bundle = ((zf30) ((o0p0) obj2)).f;
                    Boolean boolValueOf2 = Boolean.valueOf(j0o1.o(vir0Var, bundle != null ? bundle.getBoolean("embedded_in_bottom_sheet", false) : false ? w7u0.b : w7u0.a));
                    m0p0Var.b = 1;
                    if (vr20Var10.emit(boolValueOf2, m0p0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i31 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof g3p0) {
                    g3p0Var = (g3p0) lnmVar;
                    int i32 = g3p0Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        g3p0Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        g3p0Var = new g3p0(this, lnmVar);
                    }
                } else {
                    g3p0Var = new g3p0(this, lnmVar);
                }
                Object obj18 = g3p0Var.a;
                int i33 = g3p0Var.b;
                if (i33 == 0) {
                    hm5.M(obj18);
                    m3p0 m3p0Var = new m3p0((e090) obj, ((x2p0) obj2).a);
                    g3p0Var.b = 1;
                    if (((vr20) obj3).emit(m3p0Var, g3p0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i33 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof g4p0) {
                    g4p0Var = (g4p0) lnmVar;
                    int i34 = g4p0Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        g4p0Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        g4p0Var = new g4p0(this, lnmVar);
                    }
                } else {
                    g4p0Var = new g4p0(this, lnmVar);
                }
                Object obj19 = g4p0Var.a;
                int i35 = g4p0Var.b;
                if (i35 == 0) {
                    hm5.M(obj19);
                    vr20 vr20Var11 = (vr20) obj3;
                    p3p0 p3p0Var = new p3p0(((k84) ((l4p0) obj2).f.b).d() ? (String) obj : null);
                    g4p0Var.b = 1;
                    if (vr20Var11.emit(p3p0Var, g4p0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i35 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj19);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (((Boolean) ((bpb1) obj3).getValue()).booleanValue() && (objB = ((ssw0) obj2).b((PlayerState) obj, lnmVar)) == d9nVar) ? objB : rih1Var;
            case 22:
                svh0 svh0Var = (svh0) obj2;
                if (lnmVar instanceof r9p0) {
                    r9p0Var = (r9p0) lnmVar;
                    int i36 = r9p0Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        r9p0Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        r9p0Var = new r9p0(this, lnmVar);
                    }
                } else {
                    r9p0Var = new r9p0(this, lnmVar);
                }
                Object obj20 = r9p0Var.a;
                int i37 = r9p0Var.b;
                if (i37 == 0) {
                    hm5.M(obj20);
                    vr20 vr20Var12 = (vr20) obj3;
                    yvg1 yvg1Var = (yvg1) obj;
                    ju0 ju0Var = (ju0) yvg1Var.b;
                    uuw uuwVar = (uuw) yvg1Var.c;
                    ju0Var.getClass();
                    if (ju0Var == ju0.b && svh0Var.b) {
                        ju0Var = ju0.f;
                    }
                    svh0Var.b = false;
                    uuwVar.getClass();
                    mmr0 mmr0Var4 = new mmr0(uuwVar, ju0Var);
                    r9p0Var.b = 1;
                    if (vr20Var12.emit(mmr0Var4, r9p0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i37 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var;
            case 23:
                rzo0 rzo0Var = (rzo0) obj2;
                if (lnmVar instanceof hip0) {
                    hip0Var = (hip0) lnmVar;
                    int i38 = hip0Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        hip0Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        hip0Var = new hip0(this, lnmVar);
                    }
                } else {
                    hip0Var = new hip0(this, lnmVar);
                }
                Object obj21 = hip0Var.a;
                int i39 = hip0Var.b;
                if (i39 == 0) {
                    hm5.M(obj21);
                    vr20 vr20Var13 = (vr20) obj3;
                    i1r i1rVar2 = (k1r) obj;
                    if (i1rVar2 instanceof i1r) {
                        Map map2 = (Map) i1rVar2.a;
                        String str = (String) map2.get("user_location_tny_city_localized");
                        if (str == null) {
                            ole0Var = null;
                        } else {
                            if (ihc1.y0(str)) {
                                str = null;
                            }
                            if (str != null) {
                                String str2 = (String) map2.get("geoname_id");
                                ole0Var = new ole0(new nhe0(str, null, str2 != null ? nhc1.c0(str2) : null));
                            } else {
                                ole0Var = null;
                            }
                        }
                        if (ole0Var != null) {
                            g5s g5sVar = (g5s) rzo0Var.c;
                            nhe0 nhe0Var = ole0Var.a;
                            hma1 hma1VarEdit = g5sVar.a.edit();
                            hma1VarEdit.d(dw51.a, nhe0Var.a);
                            bma1 bma1Var = dw51.b;
                            Integer num = nhe0Var.c;
                            hma1VarEdit.b(bma1Var, num != null ? num.intValue() : -1);
                            hma1VarEdit.g();
                            ole0VarValueOf = ole0Var;
                        }
                    }
                    if (ole0VarValueOf != null) {
                        hip0Var.b = 1;
                        if (vr20Var13.emit(ole0VarValueOf, hip0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i39 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                boolean z2 = ((vir0) obj) instanceof sir0;
                ((d7v) obj3).invoke(Boolean.valueOf(z2));
                if (!z2) {
                    ((rtm0) obj2).a(dtm0.a);
                }
                return rih1Var;
            case 25:
                if (lnmVar instanceof opp0) {
                    opp0Var = (opp0) lnmVar;
                    int i40 = opp0Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        opp0Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        opp0Var = new opp0(this, lnmVar);
                    }
                } else {
                    opp0Var = new opp0(this, lnmVar);
                }
                Object obj22 = opp0Var.a;
                int i41 = opp0Var.b;
                if (i41 == 0) {
                    hm5.M(obj22);
                    ly50 ly50VarA = ly50.a((ly50) obj, null, false, true, 0, false, null, new by50(((Context) ((uqg) obj2).b).getColor(2131102449)), 185);
                    opp0Var.b = 1;
                    if (((vr20) obj3).emit(ly50VarA, opp0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i41 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return rih1Var;
            case 26:
                itp0 itp0Var = (itp0) obj2;
                if (lnmVar instanceof etp0) {
                    etp0Var = (etp0) lnmVar;
                    int i42 = etp0Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        etp0Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        etp0Var = new etp0(this, lnmVar);
                    }
                } else {
                    etp0Var = new etp0(this, lnmVar);
                }
                Object obj23 = etp0Var.a;
                int i43 = etp0Var.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                vr20 vr20Var14 = (vr20) obj3;
                swz0 swz0Var = (uwz0) obj;
                if (!(swz0Var instanceof twz0)) {
                    if (swz0Var instanceof swz0) {
                        eho0 eho0Var = swz0Var.a;
                        if (eho0Var instanceof dho0) {
                            dtp0Var = (dtp0) itp0Var.c.getValue();
                        } else if (eho0Var instanceof eho0) {
                            eho0 eho0Var2 = eho0Var;
                            dtp0Var = (eho0Var2.a && eho0Var2.b) ? (dtp0) itp0Var.d.getValue() : (dtp0) itp0Var.e.getValue();
                        } else {
                            eg.o();
                        }
                    } else {
                        eg.o();
                    }
                    return null;
                }
                dtp0Var = itp0Var.b;
                etp0Var.b = 1;
                if (vr20Var14.emit(dtp0Var, etp0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 27:
                if (lnmVar instanceof ptp0) {
                    ptp0Var = (ptp0) lnmVar;
                    int i44 = ptp0Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        ptp0Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        ptp0Var = new ptp0(this, lnmVar);
                    }
                } else {
                    ptp0Var = new ptp0(this, lnmVar);
                }
                Object obj24 = ptp0Var.a;
                int i45 = ptp0Var.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        i2 = ptp0Var.d;
                        vr20Var3 = ptp0Var.c;
                        hm5.M(obj24);
                    } else {
                        if (i45 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj24);
                    }
                    return rih1Var;
                }
                hm5.M(obj24);
                vr20Var2 = (vr20) obj3;
                ClientBase clientBase = ((qtp0) obj2).b;
                if (((EsOffline.GetContextsResponse) obj).p().isEmpty()) {
                    clientBase = null;
                }
                if (clientBase != null) {
                    Single map3 = clientBase.callSingle("spotify.offline_esperanto.proto.Offline", "GetOfflineLicenseInfo", Empty.n()).map(a020.T0);
                    ptp0Var.c = vr20Var2;
                    ptp0Var.d = 0;
                    ptp0Var.b = 1;
                    Object objJ = fc11.j(map3, ptp0Var);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    vr20Var3 = vr20Var2;
                    obj24 = objJ;
                } else {
                    vr20Var3 = vr20Var2;
                    expiryN = null;
                }
                mtp0Var = new mtp0(expiryN);
                ptp0Var.c = null;
                ptp0Var.d = i2;
                ptp0Var.b = 2;
                if (vr20Var3.emit(mtp0Var, ptp0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
                EsOffline.OfflineLicenseInfo offlineLicenseInfo = (EsOffline.OfflineLicenseInfo) obj24;
                if (offlineLicenseInfo != null) {
                    expiryN = offlineLicenseInfo.n();
                } else {
                    vr20Var2 = vr20Var3;
                    vr20Var3 = vr20Var2;
                    expiryN = null;
                }
                mtp0Var = new mtp0(expiryN);
                ptp0Var.c = null;
                ptp0Var.d = i2;
                ptp0Var.b = 2;
                if (vr20Var3.emit(mtp0Var, ptp0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 28:
                if (lnmVar instanceof vtp0) {
                    vtp0Var = (vtp0) lnmVar;
                    int i46 = vtp0Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        vtp0Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        vtp0Var = new vtp0(this, lnmVar);
                    }
                } else {
                    vtp0Var = new vtp0(this, lnmVar);
                }
                Object obj25 = vtp0Var.a;
                int i47 = vtp0Var.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        i = vtp0Var.d;
                        vr20Var4 = vtp0Var.c;
                        hm5.M(obj25);
                    } else {
                        if (i47 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj25);
                    }
                    return rih1Var;
                }
                hm5.M(obj25);
                vr20 vr20Var15 = (vr20) obj3;
                wtp0 wtp0Var = (wtp0) obj2;
                vtp0Var.c = vr20Var15;
                vtp0Var.d = 0;
                vtp0Var.b = 1;
                ohd ohdVar = new ohd(1, aym.t(vtp0Var));
                ohdVar.t();
                ixg ixgVarF = wtp0Var.b.f((String) obj);
                ixgVarF.g = false;
                ixgVarF.g(new u4a0(ohdVar, (byte) 2), new j9n0(ohdVar, wtp0Var, (byte) 28));
                Object objR = ohdVar.r();
                if (objR == d9nVar) {
                    return d9nVar;
                }
                vr20Var4 = vr20Var15;
                obj25 = objR;
                vtp0Var.c = null;
                vtp0Var.d = i;
                vtp0Var.b = 2;
                if (vr20Var4.emit(obj25, vtp0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            default:
                if (lnmVar instanceof q3q0) {
                    q3q0Var = (q3q0) lnmVar;
                    int i48 = q3q0Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        q3q0Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        q3q0Var = new q3q0(this, lnmVar);
                    }
                } else {
                    q3q0Var = new q3q0(this, lnmVar);
                }
                Object obj26 = q3q0Var.a;
                int i49 = q3q0Var.b;
                if (i49 == 0) {
                    hm5.M(obj26);
                    vr20 vr20Var16 = (vr20) obj3;
                    Map map4 = (Map) obj;
                    if (y7y0.F(map4) && ((vn4) ((drj0) obj2).c).a() && !"active".equals(map4.get("on-demand-trial"))) {
                        z = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    q3q0Var.b = 1;
                    if (vr20Var16.emit(boolValueOf3, q3q0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i49 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj26);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ ygi0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
