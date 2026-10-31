package p;

import android.util.Log;
import com.spotify.ads.esperanto.proto.DeleteRequestHeadersRequest;
import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;
import com.spotify.scrollsita.v1.Section;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b751 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b751(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new b751((c751) obj2, lnmVar, (byte) 0);
            case 1:
                return new b751((db51) obj2, lnmVar, (byte) 1);
            case 2:
                return new b751((ywv0) obj2, lnmVar, (byte) 2);
            case 3:
                return new b751((jo51) obj2, lnmVar, (byte) 3);
            case 4:
                return new b751((c8u0) obj2, lnmVar, (byte) 4);
            case 5:
                return new b751((ju51) obj2, lnmVar, (byte) 5);
            case 6:
                return new b751((lu51) obj2, lnmVar, (byte) 6);
            case 7:
                return new b751((j061) obj2, lnmVar, (byte) 7);
            case 8:
                return new b751((nd61) obj2, lnmVar, (byte) 8);
            case 9:
                return new b751((String) obj2, lnmVar, (byte) 9);
            case 10:
                return new b751((SetPlaylistPictureWorker) obj2, lnmVar, (byte) 10);
            case 11:
                return new b751((np61) obj2, lnmVar, (byte) 11);
            case 12:
                return new b751((im0) obj2, lnmVar, (byte) 12);
            case 13:
                return new b751((oa71) obj2, lnmVar, (byte) 13);
            case 14:
                return new b751((af71) obj2, lnmVar, (byte) 14);
            case 15:
                return new b751((aj71) obj2, lnmVar, (byte) 15);
            case 16:
                return new b751((wt71) obj2, lnmVar, (byte) 16);
            case 17:
                return new b751((iz71) obj2, lnmVar, (byte) 17);
            case 18:
                return new b751((dea0) obj2, lnmVar, (byte) 18);
            case 19:
                return new b751((fh81) obj2, lnmVar, (byte) 19);
            case 20:
                return new b751((wh81) obj2, lnmVar, (byte) 20);
            case 21:
                return new b751((uj81) obj2, lnmVar, (byte) 21);
            case 22:
                return new b751((kk81) obj2, lnmVar, (byte) 22);
            case 23:
                return new b751((ar81) obj2, lnmVar, (byte) 23);
            case 24:
                return new b751((n381) obj2, lnmVar, (byte) 24);
            case 25:
                return new b751((dh91) obj2, lnmVar, (byte) 25);
            case 26:
                return new b751((ua91) obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new b751((tt91) obj2, lnmVar, (byte) 27);
            case 28:
                return new b751((p5a0) obj2, lnmVar, (byte) 28);
            default:
                return new b751((c8a1) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 6:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 8:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 9:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 10:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 11:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 12:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 13:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 14:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 15:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 16:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 17:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 18:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 19:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 20:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 21:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 22:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 23:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 24:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 25:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 26:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 28:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        int i = 2;
        byte b = 1;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                c751 c751Var = (c751) this.c;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(c751Var.g.t());
                    n651 n651Var = new n651(c751Var, b);
                    this.b = true;
                    if (ezcVarG.collect(n651Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(100L, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((db51) this.c).c();
                return rih1.a;
            case 2:
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    ywv0 ywv0Var = (ywv0) this.c;
                    wm51 wm51Var = (wm51) ywv0Var.e;
                    if (wm51Var != null) {
                        List list = (List) ywv0Var.h;
                        this.b = true;
                        if (wm51Var.a(list, this) == d9nVar3) {
                            return d9nVar3;
                        }
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 3:
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    jo51 jo51Var = (jo51) this.c;
                    this.b = true;
                    if (jo51Var.z1(this) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 4:
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    zuw0 zuw0Var = ((c8u0) this.c).c;
                    this.b = true;
                    if (zuw0Var.f(true, this) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 5:
                d9n d9nVar6 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    ju51 ju51Var = (ju51) this.c;
                    this.b = true;
                    if (ju51Var.a(this) == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 6:
                lu51 lu51Var = (lu51) this.c;
                rih1 rih1Var = rih1.a;
                d9n d9nVar7 = d9n.a;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = ((zor) lu51Var.e).f;
                j0z0 j0z0Var = new j0z0(lu51Var, (byte) 16);
                this.b = true;
                dt71Var.collect(new hu51(new u5z(j0z0Var, rc11.a.b(i7l.class), (byte) 16), (byte) 1), this);
                return d9nVar7;
            case 7:
                d9n d9nVar8 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    j061 j061Var = (j061) this.c;
                    this.b = true;
                    if (j061Var.d(this) == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 8:
                d9n d9nVar9 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    nd61 nd61Var = (nd61) this.c;
                    iib iibVar = nd61Var.d;
                    j0z0 j0z0Var2 = new j0z0(nd61Var, (byte) 19);
                    this.b = true;
                    if (iibVar.collect(j0z0Var2, this) == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 9:
                d9n d9nVar10 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    vj20 vj20Var = vj20.a;
                    this.b = true;
                    objB = vj20Var.b(this);
                    if (objB == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                Collection<ghn> collectionValues = ((Map) objB).values();
                String str = (String) this.c;
                for (ghn ghnVar : collectionValues) {
                    ghnVar.getClass();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uo5 uo5Var = ghnVar.b;
                    synchronized (uo5Var) {
                        if (!Objects.equals((String) uo5Var.d, str)) {
                            uo5.I((d520) uo5Var.b, (String) uo5Var.c, str);
                            uo5Var.d = str;
                        }
                        break;
                    }
                    di61.a.toString();
                }
                return rih1.a;
            case 10:
                d9n d9nVar11 = d9n.a;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                SetPlaylistPictureWorker setPlaylistPictureWorker = (SetPlaylistPictureWorker) this.c;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                kt91 kt91Var = setPlaylistPictureWorker.k;
                if (kt91Var == null) {
                    u890.C("snackbarManager");
                    throw null;
                }
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131955194});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131955194});
                kt91Var.k(new er91((fs91) null, "", 2131955194, (String) null, 2131955193, new gl61(ohdVar, (byte) 0), (cvr) null, (xq91) null, false));
                Object objR = ohdVar.r();
                return objR == d9nVar11 ? d9nVar11 : objR;
            case 11:
                d9n d9nVar12 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    oo61 oo61Var = ((np61) this.c).a;
                    e9t e9tVarN = DeleteRequestHeadersRequest.n();
                    e9tVarN.n();
                    e9tVarN.q();
                    DeleteRequestHeadersRequest deleteRequestHeadersRequestBuild = e9tVarN.build();
                    this.b = true;
                    if (oo61Var.a(deleteRequestHeadersRequestBuild, this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ax0.a;
            case 12:
                im0 im0Var = (im0) this.c;
                d9n d9nVar13 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    mr20 mr20VarU = rqt0.u(new tu41(((u601) im0Var.t).a(), (byte) 13));
                    oy3 oy3Var = new oy3(im0Var, (lnm) null, (byte) 17);
                    this.b = true;
                    if (l4p1.q(mr20VarU, oy3Var, this) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                d9n d9nVar14 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    oa71 oa71Var = (oa71) this.c;
                    mr20 mr20Var = oa71Var.O0;
                    j0z0 j0z0Var3 = new j0z0(oa71Var, (byte) 20);
                    this.b = true;
                    if (mr20Var.collect(j0z0Var3, this) == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 14:
                af71 af71Var = (af71) this.c;
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar15 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    wt20 wt20VarF = z4p1.F(af71Var.b.d(), 1);
                    lm61 lm61Var = new lm61(af71Var, lnmVar, (byte) 10);
                    this.b = true;
                    Object objCollect = wt20VarF.collect(new eu20(kfo0.a, lm61Var, (byte) 1), this);
                    if (objCollect != d9nVar15) {
                        objCollect = rih1Var2;
                    }
                    if (objCollect != d9nVar15) {
                        objCollect = rih1Var2;
                    }
                    if (objCollect == d9nVar15) {
                        return d9nVar15;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 15:
                aj71 aj71Var = (aj71) this.c;
                d9n d9nVar16 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    mr20 mr20VarB = aj71Var.i.b(new uh71(rc11.a.b(elw0.class), null));
                    j0z0 j0z0Var4 = new j0z0(aj71Var, (byte) 21);
                    this.b = true;
                    if (mr20VarB.collect(j0z0Var4, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 16:
                wt71 wt71Var = (wt71) this.c;
                int i2 = wt71Var.g;
                bma1 bma1Var = wt71Var.b;
                d9n d9nVar17 = d9n.a;
                boolean z17 = this.b;
                try {
                    if (!z17) {
                        hm5.M(obj);
                        if (bma1Var.l(xt71.a, 0) < i2) {
                            this.b = true;
                            if (wt71Var.a(this) == d9nVar17) {
                                return d9nVar17;
                            }
                        }
                        return rih1.a;
                    }
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    hma1 hma1VarEdit = bma1Var.edit();
                    bma1Var = xt71.a;
                    hma1VarEdit.b(bma1Var, i2);
                    hma1VarEdit.h();
                    return rih1.a;
                } catch (Throwable th) {
                    hma1 hma1VarEdit2 = bma1Var.edit();
                    hma1VarEdit2.b(xt71.a, i2);
                    hma1VarEdit2.h();
                    throw th;
                }
            case 17:
                iz71 iz71Var = (iz71) this.c;
                d9n d9nVar18 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    o95 o95Var = iz71Var.U0;
                    Float f = new Float(2.0f);
                    pxg1 pxg1VarO0 = irn1.o0(1000, 0, mlv.a, 2);
                    int iC = l1d.C(iz71Var.S0);
                    if (iC == 0) {
                        i = 1;
                    } else if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    bb80 bb80VarY = irn1.Y(pxg1VarO0, i, 0L, 4);
                    this.b = true;
                    if (o95.b(o95Var, f, bb80VarY, (Float) null, (iu30) null, this, 12) == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 18:
                d9n d9nVar19 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    bfd bfdVar = (bfd) ((dea0) this.c).g;
                    this.b = true;
                    if (bfdVar.D(this) == d9nVar19) {
                        return d9nVar19;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 19:
                d9n d9nVar20 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    fh81 fh81Var = (fh81) this.c;
                    xe01 xe01Var = fh81Var.s1;
                    j0z0 j0z0Var5 = new j0z0(fh81Var, (byte) 24);
                    this.b = true;
                    if (xe01Var.a.collect(j0z0Var5, this) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                jah.d();
                return null;
            case 20:
                d9n d9nVar21 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    wh81 wh81Var = (wh81) this.c;
                    xe01 xe01Var2 = wh81Var.a.o1;
                    j0z0 j0z0Var6 = new j0z0(wh81Var, (byte) 25);
                    this.b = true;
                    if (xe01Var2.a.collect(j0z0Var6, this) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                jah.d();
                return null;
            case 21:
                uj81 uj81Var = (uj81) this.c;
                d9n d9nVar22 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    uur0 uur0Var = uj81Var.K1;
                    if (uur0Var == null) {
                        u890.C("poller");
                        throw null;
                    }
                    m441 m441VarA = uur0.a(uur0Var, uj81Var.P0());
                    ft1 ft1Var = ft1.e;
                    this.b = true;
                    if (m441VarA.collect(ft1Var, this) == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                kk81 kk81Var = (kk81) this.c;
                d9n d9nVar23 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    uur0 uur0Var2 = kk81Var.H1;
                    if (uur0Var2 == null) {
                        u890.C("poller");
                        throw null;
                    }
                    m441 m441VarA2 = uur0.a(uur0Var2, kk81Var.P0());
                    ft1 ft1Var2 = ft1.f;
                    this.b = true;
                    if (m441VarA2.collect(ft1Var2, this) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 23:
                d9n d9nVar24 = d9n.a;
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                eyh0 eyh0Var = ((ar81) this.c).h;
                this.b = true;
                af4 af4Var = (af4) eyh0Var.c;
                Object objU = !af4Var.a() ? en2.a : eyh0Var.u(af4Var.c(), "signup", this, false);
                return objU == d9nVar24 ? d9nVar24 : objU;
            case 24:
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar25 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    n381 n381Var = (n381) this.c;
                    this.b = true;
                    mr20 mr20Var2 = (mr20) n381Var.c;
                    Object objS = smo1.s(new cch(z4p1.v(mr20Var2, 1), mr20Var2, new j0z0(n381Var, (byte) 26), new bu51(3, (lnm) null, (byte) 6), (lnm) null), this);
                    if (objS != d9nVar25) {
                        objS = rih1Var3;
                    }
                    if (objS != d9nVar25) {
                        objS = rih1Var3;
                    }
                    if (objS == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
            case 25:
                d9n d9nVar26 = d9n.a;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xe01 xe01Var3 = ((qor) ((dh91) this.c).b.get()).l;
                yy11 yy11Var = new yy11(2, (lnm) null, (byte) 3);
                this.b = true;
                Object objJ = b5p1.j(xe01Var3, yy11Var, this);
                return objJ == d9nVar26 ? d9nVar26 : objJ;
            case 26:
                d9n d9nVar27 = d9n.a;
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dn81 dn81Var = (dn81) ((ua91) this.c).b;
                this.b = true;
                Object objE = dn81Var.e(this);
                return objE == d9nVar27 ? d9nVar27 : objE;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                rih1 rih1Var4 = rih1.a;
                tt91 tt91Var = (tt91) this.c;
                d9n d9nVar28 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    mr20 mr20Var3 = tt91Var.p;
                    mr20 mr20Var4 = tt91Var.o;
                    irp0 irp0Var = new irp0(3, (lnm) null, (byte) 18);
                    nt91 nt91Var = new nt91(tt91Var);
                    this.b = true;
                    Object objS2 = fc11.s(vrl.c, this, nt91Var, new ekv(irp0Var, (lnm) null), new mr20[]{mr20Var3, mr20Var4});
                    if (objS2 != d9nVar28) {
                        objS2 = rih1Var4;
                    }
                    if (objS2 == d9nVar28) {
                        return d9nVar28;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var4;
            case 28:
                d9n d9nVar29 = d9n.a;
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                p5a0 p5a0Var = (p5a0) this.c;
                this.b = true;
                Object objA = p5a0Var.a(this);
                return objA == d9nVar29 ? d9nVar29 : objA;
            default:
                rih1 rih1Var5 = rih1.a;
                c8a1 c8a1Var = (c8a1) this.c;
                d9n d9nVar30 = d9n.a;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var5;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarG = d3p1.G(c8a1Var.f, c8a1Var.d, c8a1Var.e);
                j0z0 j0z0Var7 = new j0z0(c8a1Var, (byte) 29);
                this.b = true;
                ay8VarG.collect(new ae91(j0z0Var7, (byte) 15), this);
                return d9nVar30;
        }
    }
}
