package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l14 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l14(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                l14 l14Var = new l14((t24) this.f, (fe5) obj5, (lnm) obj4, (byte) 0);
                l14Var.c = (o24) obj;
                l14Var.d = (wvr) obj2;
                l14Var.e = obj3;
                return l14Var.invokeSuspend(rih1Var);
            case 1:
                l14 l14Var2 = new l14((res) obj5, (lnm) obj4, (byte) 1);
                l14Var2.d = (g2n) obj;
                l14Var2.e = (f2n) obj2;
                l14Var2.f = (tqw) obj3;
                return l14Var2.invokeSuspend(rih1Var);
            case 2:
                l14 l14Var3 = new l14((res) obj5, (lnm) obj4, (byte) 2);
                l14Var3.d = (rao) obj;
                l14Var3.e = (qao) obj2;
                l14Var3.f = (tqw) obj3;
                return l14Var3.invokeSuspend(rih1Var);
            case 3:
                l14 l14Var4 = new l14((uho) this.f, (xho) obj5, (lnm) obj4, (byte) 3);
                l14Var4.c = (vho) obj;
                l14Var4.d = (iho) obj2;
                l14Var4.e = (tqw) obj3;
                return l14Var4.invokeSuspend(rih1Var);
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l14 l14Var5 = new l14((szu) this.e, (hti0) this.f, (qxc0) obj5, (lnm) obj4, (byte) 4);
                l14Var5.b = zBooleanValue;
                l14Var5.c = (Map) obj2;
                l14Var5.d = (mmr0) obj3;
                return l14Var5.invokeSuspend(rih1Var);
            case 5:
                l14 l14Var6 = new l14((res) this.d, (iu30) this.e, (apv) this.f, (zov) obj5, (lnm) obj4, (byte) 5);
                l14Var6.c = (yov) obj2;
                return l14Var6.invokeSuspend(rih1Var);
            case 6:
                l14 l14Var7 = new l14((b431) this.d, (ven0) this.e, (ven0) this.f, (ven0) obj5, (lnm) obj4, (byte) 6);
                l14Var7.c = (tqw) obj3;
                return l14Var7.invokeSuspend(rih1Var);
            case 7:
                l14 l14Var8 = new l14((l8r0) this.f, (h8r0) obj5, (lnm) obj4, (byte) 7);
                l14Var8.c = (k8r0) obj;
                l14Var8.d = (j8r0) obj2;
                l14Var8.e = (tqw) obj3;
                return l14Var8.invokeSuspend(rih1Var);
            case 8:
                l14 l14Var9 = new l14((guz0) this.e, (xtz0) this.f, (iu30) obj5, (lnm) obj4, (byte) 8);
                l14Var9.c = (duz0) obj;
                l14Var9.d = (ttz0) obj2;
                return l14Var9.invokeSuspend(rih1Var);
            case 9:
                l14 l14Var10 = new l14((jd6) this.e, (rwb1) this.f, (c9n) obj5, (lnm) obj4, (byte) 9);
                l14Var10.c = (swb1) obj;
                l14Var10.d = (qwb1) obj2;
                return l14Var10.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                l14 l14Var11 = new l14((jl1) this.e, (hti0) this.f, (qxc0) obj5, (lnm) obj4, (byte) 10);
                l14Var11.c = (mmr0) obj;
                l14Var11.b = zBooleanValue2;
                l14Var11.d = (Map) obj3;
                return l14Var11.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:211:0x0440 A[Catch: all -> 0x03f9, TRY_ENTER, TryCatch #1 {all -> 0x03f9, blocks: (B:185:0x03f3, B:208:0x0436, B:211:0x0440, B:215:0x045b, B:197:0x0411, B:199:0x0417, B:201:0x041d, B:203:0x0421, B:205:0x0425), top: B:279:0x03eb }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0458  */
    /* JADX WARN: Code duplicated, block: B:214:0x045a  */
    /* JADX WARN: Code duplicated, block: B:257:0x04eb A[Catch: all -> 0x0491, TRY_ENTER, TryCatch #0 {all -> 0x0491, blocks: (B:225:0x048b, B:254:0x04e1, B:257:0x04eb, B:261:0x0504, B:243:0x04bc, B:245:0x04c2, B:247:0x04c8, B:249:0x04cc, B:251:0x04d0), top: B:277:0x0483 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0501  */
    /* JADX WARN: Code duplicated, block: B:260:0x0503  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0201  */
    public final Object invokeSuspend(Object obj) {
        tv80 tv80VarY;
        Object objA;
        ou80 ou80Var;
        noe noeVar;
        String str;
        String str2;
        tv80 tv80VarY2;
        Object objA2;
        ou80 ou80Var2;
        noe noeVar2;
        String str3;
        String str4;
        Object objJ;
        ou80 ou80Var3;
        boolean z;
        String str5;
        String strConcat;
        byte b = this.a;
        boolean z2 = false;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    o24 o24Var = (o24) this.c;
                    wvr wvrVar = (wvr) this.d;
                    Object obj3 = this.e;
                    t24 t24Var = (t24) this.f;
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (wm5.t(t24Var, t24Var.k.s(), o24Var, wvrVar, obj3, (fe5) obj2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                res resVar = (res) obj2;
                xgn0 xgn0Var = (xgn0) resVar.h;
                g2n g2nVar = (g2n) this.d;
                f2n f2nVar = (f2n) this.e;
                tqw tqwVar = (tqw) this.f;
                boolean z4 = this.b;
                try {
                    if (z4) {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tv80VarY = (tv80) this.c;
                        hm5.M(obj);
                        objA = obj;
                        noeVar = (noe) objA;
                        if (!(noeVar instanceof loe)) {
                            tv80 tv80VarA = noeVar.a(tv80VarY);
                            iu30 iu30Var = (iu30) resVar.g;
                            String str6 = g2nVar.b;
                            str = g2nVar.f;
                            if (((di4) resVar.d).o()) {
                                str2 = str;
                            } else {
                                str2 = null;
                            }
                            iu30Var.invoke(new jz41(null, str6, null, tv80VarA, str2));
                        }
                        xgn0Var.c((Object) null);
                        break;
                    } else {
                        hm5.M(obj);
                        if (f2nVar == null) {
                            eg.o();
                            return null;
                        }
                        String str7 = g2nVar.e;
                        if (ihc1.y0(str7)) {
                            str7 = null;
                        }
                        if (str7 != null) {
                            ((iu30) resVar.f).invoke(str7);
                        }
                        if (xgn0Var.g()) {
                            tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                            joe joeVar = (joe) resVar.e;
                            String str8 = (tv80VarY == null || (ou80Var = tv80VarY.a) == null) ? null : ou80Var.a;
                            this.d = g2nVar;
                            this.e = null;
                            this.f = null;
                            this.c = tv80VarY;
                            this.b = true;
                            objA = joeVar.a(str8, this);
                            if (objA == d9nVar) {
                                return d9nVar;
                            }
                            noeVar = (noe) objA;
                            if (!(noeVar instanceof loe)) {
                                tv80 tv80VarA2 = noeVar.a(tv80VarY);
                                iu30 iu30Var2 = (iu30) resVar.g;
                                String str9 = g2nVar.b;
                                str = g2nVar.f;
                                if (((di4) resVar.d).o()) {
                                    str2 = str;
                                } else {
                                    str2 = null;
                                }
                                iu30Var2.invoke(new jz41(null, str9, null, tv80VarA2, str2));
                            }
                            xgn0Var.c((Object) null);
                        }
                        break;
                    }
                    return rih1Var;
                } catch (Throwable th) {
                    xgn0Var.c((Object) null);
                    throw th;
                }
            case 2:
                res resVar2 = (res) obj2;
                xgn0 xgn0Var2 = (xgn0) resVar2.h;
                rao raoVar = (rao) this.d;
                qao qaoVar = (qao) this.e;
                tqw tqwVar2 = (tqw) this.f;
                boolean z5 = this.b;
                try {
                    if (z5) {
                        if (!z5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tv80VarY2 = (tv80) this.c;
                        hm5.M(obj);
                        objA2 = obj;
                        noeVar2 = (noe) objA2;
                        if (!(noeVar2 instanceof loe)) {
                            tv80 tv80VarA3 = noeVar2.a(tv80VarY2);
                            iu30 iu30Var3 = (iu30) resVar2.g;
                            String str10 = raoVar.a;
                            List list = raoVar.b;
                            str3 = raoVar.g;
                            if (((di4) resVar2.e).o()) {
                                str4 = str3;
                            } else {
                                str4 = null;
                            }
                            iu30Var3.invoke(new jz41(str10, null, list, tv80VarA3, str4));
                        }
                        xgn0Var2.c((Object) null);
                        break;
                    } else {
                        hm5.M(obj);
                        if (qaoVar == null) {
                            eg.o();
                            return null;
                        }
                        if (xgn0Var2.g()) {
                            tv80VarY2 = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                            joe joeVar2 = (joe) resVar2.f;
                            String str11 = (tv80VarY2 == null || (ou80Var2 = tv80VarY2.a) == null) ? null : ou80Var2.a;
                            this.d = raoVar;
                            this.e = null;
                            this.f = null;
                            this.c = tv80VarY2;
                            this.b = true;
                            objA2 = joeVar2.a(str11, this);
                            if (objA2 == d9nVar) {
                                return d9nVar;
                            }
                            noeVar2 = (noe) objA2;
                            if (!(noeVar2 instanceof loe)) {
                                tv80 tv80VarA4 = noeVar2.a(tv80VarY2);
                                iu30 iu30Var4 = (iu30) resVar2.g;
                                String str12 = raoVar.a;
                                List list2 = raoVar.b;
                                str3 = raoVar.g;
                                if (((di4) resVar2.e).o()) {
                                    str4 = str3;
                                } else {
                                    str4 = null;
                                }
                                iu30Var4.invoke(new jz41(str12, null, list2, tv80VarA4, str4));
                            }
                            xgn0Var2.c((Object) null);
                        }
                        break;
                    }
                    return rih1Var;
                } catch (Throwable th2) {
                    xgn0Var2.c((Object) null);
                    throw th2;
                }
            case 3:
                vho vhoVar = (vho) this.c;
                iho ihoVar = (iho) this.d;
                tqw tqwVar3 = (tqw) this.e;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (who.a[ihoVar.ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                Function0 function0 = ((uho) this.f).g;
                if (function0 != null) {
                    function0.invoke();
                }
                kko kkoVar = ((xho) obj2).a;
                String str13 = vhoVar.b;
                tv80 tv80VarY3 = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                if (kkoVar.b(str13, tv80VarY3, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 4:
                boolean z7 = this.b;
                Map map = (Map) this.c;
                mmr0 mmr0Var = (mmr0) this.d;
                hm5.M(obj);
                vnb1 vnb1Var = (vnb1) mmr0Var.a;
                h2v h2vVar = (h2v) mmr0Var.b;
                if (!y7y0.G(map) && y7y0.L(map) && !y7y0.F(map)) {
                    z2 = true;
                }
                if (!z7 && !z2) {
                    return null;
                }
                zeu zeuVar = ((szu) this.e).f;
                hti0 hti0Var = (hti0) this.f;
                return zeuVar.j(hti0Var.b, hti0Var.a, h2vVar, vnb1Var.a, ((qxc0) obj2).h, false);
            case 5:
                String str14 = ((apv) this.f).a;
                iu30 iu30Var5 = (iu30) this.e;
                res resVar3 = (res) this.d;
                lzn0 lzn0Var = (lzn0) resVar3.e;
                yov yovVar = (yov) this.c;
                boolean z8 = this.b;
                try {
                    if (!z8) {
                        hm5.M(obj);
                        if (!(yovVar instanceof xov)) {
                            if (yovVar instanceof vov) {
                                lzn0Var.e();
                            } else {
                                if (!(yovVar instanceof wov)) {
                                    eg.o();
                                    return null;
                                }
                                iu30Var5.invoke(new apv(str14, true));
                                q8n q8nVar = (q8n) resVar3.g;
                                hxn hxnVar = new hxn(resVar3, (zov) obj2, yovVar, (lnm) null, (byte) 22);
                                this.c = null;
                                this.b = true;
                                if (fn31.Y(q8nVar, hxnVar, this) == d9nVar) {
                                    return d9nVar;
                                }
                                lzn0Var.e();
                            }
                        }
                    } else {
                        if (!z8) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        lzn0Var.e();
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    iu30Var5.invoke(new apv(str14, false));
                    Context context = (Context) resVar3.d;
                    Toast.makeText(context, context.getString(2131953372), 0).show();
                }
                return rih1Var;
            case 6:
                ven0 ven0Var = (ven0) this.e;
                tqw tqwVar4 = (tqw) this.c;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    ven0Var.setValue(tqwVar4 != null ? n3o1.y(tqwVar4) : null);
                    Flowable flowableH = Flowable.h((Flowable) ((ven0) this.f).getValue(), (Flowable) ((ven0) obj2).getValue(), ok10.Z);
                    FlowableSingleSingle flowableSingleSingle = new FlowableSingleSingle(ydh.f(flowableH, flowableH));
                    this.c = null;
                    this.b = true;
                    objJ = fc11.j(flowableSingleSingle, this);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                }
                mmr0 mmr0Var2 = (mmr0) objJ;
                ContextTrack contextTrack = (ContextTrack) mmr0Var2.a;
                fvf1 fvf1Var = (fvf1) mmr0Var2.b;
                o6i0 o6i0Var = s3o1.v(contextTrack, false) ? o6i0.a : o6i0.b;
                b431 b431Var = (b431) this.d;
                String strUri = contextTrack.uri();
                n3i0 n3i0Var = new n3i0(new r3i0(new vve1(fvf1Var.a), (xve1) null));
                tv80 tv80Var = (tv80) ven0Var.getValue();
                b431Var.a(new u3i0(strUri, n3i0Var, (tv80Var == null || (ou80Var3 = tv80Var.a) == null) ? null : ou80Var3.a, o6i0Var, null, 16), (String) null);
                return rih1Var;
            case 7:
                l8r0 l8r0Var = (l8r0) this.f;
                k8r0 k8r0Var = (k8r0) this.c;
                j8r0 j8r0Var = (j8r0) this.d;
                tqw tqwVar5 = (tqw) this.e;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    if (j8r0Var == null) {
                        eg.o();
                        return null;
                    }
                    if (k8r0Var.b) {
                        l8r0Var.h.k(new er91((fs91) null, j8r0Var.a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    } else {
                        n9r0 n9r0Var = l8r0Var.d;
                        int iB = l8r0Var.b.b();
                        this.c = k8r0Var;
                        this.d = null;
                        this.e = tqwVar5;
                        this.b = true;
                        if (n9r0Var.d(iB, this) == d9nVar) {
                            return d9nVar;
                        }
                        z = k8r0Var.a;
                        str5 = ((h8r0) obj2).b;
                        if (z) {
                            strConcat = "spotify:page-match:landing:".concat(str5);
                        } else {
                            strConcat = "spotify:page-match:onboarding:".concat(str5);
                        }
                        if (tqwVar5 != null) {
                            l8r0Var.a.a(strConcat, n3o1.y(tqwVar5), (Bundle) null);
                        }
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    z = k8r0Var.a;
                    str5 = ((h8r0) obj2).b;
                    if (z) {
                        strConcat = "spotify:page-match:onboarding:".concat(str5);
                    } else {
                        strConcat = "spotify:page-match:landing:".concat(str5);
                    }
                    if (tqwVar5 != null) {
                        l8r0Var.a.a(strConcat, n3o1.y(tqwVar5), (Bundle) null);
                    }
                }
                return rih1Var;
            case 8:
                iu30 iu30Var6 = (iu30) obj2;
                String str15 = ((xtz0) this.f).a;
                guz0 guz0Var = (guz0) this.e;
                Context context2 = guz0Var.e;
                kt91 kt91Var = guz0Var.d;
                lzn0 lzn0Var2 = guz0Var.c;
                t8r0 t8r0Var = guz0Var.b;
                ztz0 ztz0Var = (duz0) this.c;
                ttz0 ttz0Var = (ttz0) this.d;
                boolean z11 = this.b;
                try {
                    if (z11) {
                        if (!z11) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        lzn0Var2.e();
                        kt91Var.k(new er91((fs91) null, context2.getString(2131960857), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        break;
                    } else {
                        hm5.M(obj);
                        if (ttz0Var instanceof stz0) {
                            ztz0 ztz0Var2 = ztz0Var instanceof ztz0 ? ztz0Var : null;
                            if (ztz0Var2 != null) {
                                int i = ztz0Var2.b;
                                t8r0Var.m(i, str15);
                                kdy0 kdy0Var = guz0Var.a;
                                this.c = null;
                                this.d = null;
                                this.b = true;
                                if (kdy0Var.n(i, str15, this) == d9nVar) {
                                    return d9nVar;
                                }
                                lzn0Var2.e();
                                kt91Var.k(new er91((fs91) null, context2.getString(2131960857), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                            }
                            break;
                        } else if (ttz0Var instanceof qtz0) {
                            ztz0 ztz0Var3 = ztz0Var instanceof ztz0 ? ztz0Var : null;
                            if (ztz0Var3 != null) {
                                int i2 = ((qtz0) ttz0Var).a;
                                iu30Var6.invoke(new ztz0(ztz0Var3.a, i2, i2 > 0));
                            }
                        } else if (ttz0Var instanceof otz0) {
                            t8r0Var.l(ztz0Var instanceof ztz0);
                            lzn0Var2.e();
                        } else if (ttz0Var instanceof ptz0) {
                            ((i8h1) ((ynb0) t8r0Var.a).get()).m(((tdl0) t8r0Var.b).r(ywx0.a(2)).s().q(), (xj61) null);
                            lzn0Var2.e();
                        } else {
                            if (!(ttz0Var instanceof rtz0)) {
                                eg.o();
                                return null;
                            }
                            if (ztz0Var instanceof buz0) {
                                iu30Var6.invoke(cuz0.a);
                            }
                        }
                    }
                } catch (Exception unused2) {
                    kt91Var.k(new er91((fs91) null, context2.getString(2131960842), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return rih1Var;
            case 9:
                e821 e821Var = (e821) ((jd6) this.e).f;
                swb1 swb1Var = (swb1) this.c;
                qwb1 qwb1Var = (qwb1) this.d;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str16 = swb1Var.a;
                if (str16 != null) {
                    if (qwb1Var instanceof pwb1) {
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (e821Var.s(str16, ((rwb1) this.f).a, (c9n) obj2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!(qwb1Var instanceof owb1)) {
                            eg.o();
                            return null;
                        }
                        e821Var.x();
                    }
                }
                return rih1Var;
            default:
                mmr0 mmr0Var3 = (mmr0) this.c;
                boolean z13 = this.b;
                Map map2 = (Map) this.d;
                hm5.M(obj);
                return ((jl1) this.e).i((hti0) this.f, (qxc0) obj2, (vnb1) mmr0Var3.a, (h2v) mmr0Var3.b, z13, map2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l14(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l14(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l14(xpw xpwVar, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.g = xpwVar;
    }
}
