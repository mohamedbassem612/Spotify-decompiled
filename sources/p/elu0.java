package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.RiveAnimationInput;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class elu0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ elu0(byte b, Object obj, Object obj2, Object obj3, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = str;
        this.d = obj2;
        this.f = obj3;
    }

    private final Object e(Object obj) {
        String str = (String) this.f;
        String str2 = (String) this.e;
        za21 za21Var = (za21) this.c;
        s880 s880Var = (s880) this.d;
        Context context = (Context) s880Var.b;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        try {
            if (!z) {
                hm5.M(obj);
                za21Var.d();
                bfd bfdVar = (bfd) s880Var.e;
                this.b = true;
                Object objB = bfdVar.b.a.b(str2, this);
                d9n d9nVar = d9n.a;
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            za21Var.l(true);
            ((kt91) s880Var.g).k(new er91((fs91) null, context.getString(2131958552, str), (Integer) null, context.getString(2131958554), (Integer) null, new kw6(s880Var, za21Var, str2, (byte) 16), (cvr) null, (xq91) null, false));
        } catch (Exception unused) {
            op71.x(cto1.q((dg30) s880Var.f).b);
            za21Var.h();
            ((jjz) s880Var.d).a(new xiz(fjz.b, new yiz(context.getString(2131958551)), ajz.d), new ya21(s880Var, str2, str, za21Var, (byte) 1), n521.f);
        }
        return rih1Var;
    }

    private final Object g(Object obj) {
        ven0 ven0Var;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            gs21 gs21Var = (gs21) this.d;
            if (gs21Var != null) {
                ven0 ven0Var2 = (ven0) this.f;
                hpd0 hpd0Var = (hpd0) this.e;
                this.c = ven0Var2;
                this.b = true;
                obj = hpd0Var.c(gs21Var, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
                ven0Var = ven0Var2;
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ven0Var = (ven0) this.c;
        hm5.M(obj);
        ven0Var.setValue((wr21) obj);
        return rih1.a;
    }

    private final Object h(Object obj) {
        RiveAnimationInput riveAnimationInput = (RiveAnimationInput) this.d;
        boolean z = this.b;
        try {
            if (!z) {
                hm5.M(obj);
                ni31 ni31Var = (ni31) this.c;
                String path = riveAnimationInput.getPath();
                ob01 ob01Var = new ob01((cxc) this.f, riveAnimationInput, (lnm) null, (byte) 10);
                this.b = true;
                obj = ni31Var.b(path, ob01Var, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return new mmr0(riveAnimationInput.getPath(), (byte[]) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            String path2 = riveAnimationInput.getPath();
            String imageUrl = riveAnimationInput.n().getImageUrl();
            String url = ((RiveAnimation) this.e).getUrl();
            StringBuilder sbN = gvg.n("Failed to load image '", path2, "' from ", imageUrl, " for rive: ");
            sbN.append(url);
            Logger.e(e2, sbN.toString(), new Object[0]);
            return null;
        }
    }

    private final Object i(Object obj) {
        lnm lnmVar;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            q8n q8nVarA = ((c9n) this.c).J().A(wdu0.Y);
            q8nVarA.getClass();
            q8n q8nVar = q8nVarA;
            en31 en31Var = (en31) this.d;
            o8n o8nVarY = q8nVar.y(new p7g1(q8nVar));
            o8n o8nVarY2 = o8nVarY.y(new ige1(o8nVarY, en31Var.i));
            lnm lnmVar2 = (ohd) this.e;
            fuo fuoVar = (fuo) this.f;
            this.c = lnmVar2;
            this.b = true;
            obj = fn31.Y(o8nVarY2, fuoVar, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
            lnmVar = lnmVar2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lnmVar = (lnm) this.c;
            hm5.M(obj);
        }
        lnmVar.resumeWith(obj);
        return rih1.a;
    }

    private final Object j(Object obj) {
        Set set;
        bx51 bx51Var;
        vo3 vo3Var = (vo3) this.e;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            Set setP1 = o7h.p1(vo3Var.d);
            jzs0 jzs0Var = ((bo31) this.f).b;
            List list = vo3Var.d;
            bx51 bx51Var2 = bx51.b;
            this.c = bx51Var2;
            this.d = setP1;
            this.b = true;
            Object objA = jzs0Var.a(list, this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            set = setP1;
            obj = objA;
            bx51Var = bx51Var2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = (Set) this.d;
            bx51Var = (bx51) this.c;
            hm5.M(obj);
        }
        return new uq3(bx51Var, set, (Set) obj, w7x.a);
    }

    private final Object m(Object obj) {
        et90 et90Var = (et90) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            kge kgeVarB = ((oud) et90Var.d).b();
            ywm0 ywm0Var = new ywm0(et90Var, (mz31) this.d, (xwa) this.e, (nz31) this.f, (byte) 9);
            this.b = true;
            Object objCollect = kgeVarB.collect(ywm0Var, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
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
    }

    private final Object o(Object obj) {
        c9n c9nVar = (c9n) this.c;
        boolean z = this.b;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        List list = (List) this.d;
        l041 l041Var = (l041) this.e;
        voe1 voe1Var = (voe1) this.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new h041(l041Var, (xz31) it.next(), voe1Var, (lnm) null, (byte) 1), 3));
        }
        this.c = null;
        this.b = true;
        Object objU = o1p1.u(arrayList, this);
        d9n d9nVar = d9n.a;
        return objU == d9nVar ? d9nVar : objU;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 0);
            case 1:
                elu0 elu0Var = new elu0((zou0) obj2, lnmVar);
                elu0Var.e = obj;
                return elu0Var;
            case 2:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 2);
            case 3:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 3);
            case 4:
                elu0 elu0Var2 = new elu0((ggv0) this.d, (oei1) this.e, (vr20) obj2, lnmVar, (byte) 4);
                elu0Var2.c = obj;
                return elu0Var2;
            case 5:
                return new elu0((d0r) this.d, (s8a1) this.e, (qhf0) obj2, lnmVar, (byte) 5);
            case 6:
                return new elu0((gwv0) this.d, (String) this.e, (ven0) obj2, lnmVar, (byte) 6);
            case 7:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 7);
            case 8:
                elu0 elu0Var3 = new elu0((List) this.d, (xmu0) this.e, (File) obj2, lnmVar, (byte) 8);
                elu0Var3.c = obj;
                return elu0Var3;
            case 9:
                return new elu0((byte) 9, this.c, this.d, obj2, (String) this.e, lnmVar);
            case 10:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 10);
            case 11:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 11);
            case 12:
                elu0 elu0Var4 = new elu0((is20) this.d, lnmVar, (poy0) this.e, obj2);
                elu0Var4.c = obj;
                return elu0Var4;
            case 13:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 13);
            case 14:
                elu0 elu0Var5 = new elu0((rwz0) obj2, (String) this.e, lnmVar);
                elu0Var5.d = obj;
                return elu0Var5;
            case 15:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 15);
            case 16:
                elu0 elu0Var6 = new elu0((dw01) this.d, (String) this.e, (vr01) obj2, lnmVar, (byte) 16);
                elu0Var6.c = obj;
                return elu0Var6;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new elu0((byte) 17, this.c, this.d, obj2, (String) this.e, lnmVar);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                elu0 elu0Var7 = new elu0((vi11) this.d, (String) this.e, (tv80) obj2, lnmVar, (byte) 18);
                elu0Var7.c = obj;
                return elu0Var7;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                elu0 elu0Var8 = new elu0((xa21) this.d, (String) this.e, (String) obj2, lnmVar, (byte) 19);
                elu0Var8.c = obj;
                return elu0Var8;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                elu0 elu0Var9 = new elu0((x8c0) this.d, (w8c0) this.e, (vu30) obj2, lnmVar, (byte) 21);
                elu0Var9.c = obj;
                return elu0Var9;
            case 22:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 22);
            case 23:
                return new elu0((gs21) this.d, (hpd0) this.e, (ven0) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 24);
            case 25:
                elu0 elu0Var10 = new elu0((en31) this.d, (ohd) this.e, (fuo) obj2, lnmVar, (byte) 25);
                elu0Var10.c = obj;
                return elu0Var10;
            case 26:
                return new elu0((vo3) this.e, (bo31) obj2, lnmVar);
            case 27:
                return new elu0(this.c, this.d, this.e, obj2, lnmVar, (byte) 27);
            case 28:
                elu0 elu0Var11 = new elu0((List) this.d, (l041) this.e, (voe1) obj2, lnmVar, (byte) 28);
                elu0Var11.c = obj;
                return elu0Var11;
            default:
                elu0 elu0Var12 = new elu0((xm41) this.d, (iu30) this.e, (mr20) obj2, lnmVar, (byte) 29);
                elu0Var12.c = obj;
                return elu0Var12;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:168:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:294:0x062b  */
    /* JADX WARN: Code duplicated, block: B:296:0x062f  */
    /* JADX WARN: Code duplicated, block: B:298:0x063d  */
    /* JADX WARN: Code duplicated, block: B:301:0x0662  */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, p.c0r] */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        m231 m231Var;
        Object objInvoke;
        zou0 zou0Var;
        zou0 zou0Var2;
        Object objB;
        ven0 ven0Var;
        Object objU;
        h6y0 h6y0Var;
        o6y0 o6y0Var;
        o6y0 o6y0VarA;
        String string;
        m231 m231Var2;
        m231 m231Var3;
        Object objS;
        m231 m231Var4;
        Throwable thA;
        Object objU2;
        rwz0 rwz0Var;
        m231 m231Var5;
        Object objL;
        m231 m231Var6;
        String str = "";
        byte b = 10;
        lnm zxc0Var = null;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ylk0 ylk0Var = (ylk0) this.c;
                    zpn zpnVar = (zpn) this.d;
                    String str2 = zpnVar.h;
                    List list = zpnVar.e;
                    List list2 = zpnVar.f;
                    String str3 = (String) this.e;
                    ddd1 ddd1Var = ddd1.S0;
                    dqa1 dqa1Var = (dqa1) this.f;
                    this.b = true;
                    if (ylk0Var.b(str2, list, list2, str3, ddd1Var, dqa1Var, this) == d9nVar) {
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
                m231 m231Var7 = rih1.a;
                zou0 zou0Var3 = (zou0) this.f;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        nzu0 nzu0Var = zou0Var3.h;
                        this.e = null;
                        this.c = zou0Var3;
                        this.d = zou0Var3;
                        this.b = true;
                        objInvoke = nzu0Var.invoke(this);
                        if (objInvoke == d9nVar2) {
                            return d9nVar2;
                        }
                        zou0Var = zou0Var3;
                        zou0Var2 = zou0Var;
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zou0Var = (zou0) this.d;
                        zou0 zou0Var4 = (zou0) this.c;
                        hm5.M(obj);
                        zou0Var2 = zou0Var4;
                        objInvoke = obj;
                    }
                    zou0Var.Y = (k331) objInvoke;
                    k331 k331Var = zou0Var2.Y;
                    if (k331Var instanceof y131) {
                        zou0Var2.i();
                    } else if ((k331Var instanceof r231) || (k331Var instanceof o231) || (k331Var instanceof p231) || (k331Var instanceof a331)) {
                        zou0Var2.g();
                    } else {
                        if (!u890.j(k331Var, b331.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zou0Var2.h(new IllegalStateException("Unexpected Unknown result"));
                    }
                    m231Var = m231Var7;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    zou0Var3.h(thA2);
                }
                return m231Var7;
            case 2:
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ien0 ien0VarA = ((c0r) this.c).a();
                rwm0 rwm0Var = new rwm0((ven0) this.d, (j1v0) this.e, (vhc1) this.f, (lnm) null, (byte) 23);
                this.b = true;
                ien0VarA.b(rwm0Var, this);
                return d9nVar3;
            case 3:
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ien0 ien0VarA2 = ((c0r) this.c).a();
                rwm0 rwm0Var2 = new rwm0((ssw0) this.d, (j1v0) this.e, (xe91) this.f, (lnm) null, (byte) 24);
                this.b = true;
                ien0VarA2.b(rwm0Var2, this);
                return d9nVar4;
            case 4:
                oei1 oei1Var = (oei1) this.e;
                ggv0 ggv0Var = (ggv0) this.d;
                c9n c9nVar = (c9n) this.c;
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    l4p1.u(c9nVar, ggv0Var.a(oei1Var, 0, true));
                    tzr0 tzr0Var = new tzr0(ggv0Var, oei1Var, c9nVar);
                    l811 l811Var = new l811();
                    vr20 vr20Var = (vr20) this.f;
                    jge jgeVarE = hu20.e(ggv0Var.b.b, new db3(l811Var, tzr0Var, oei1Var, (lnm) null, (byte) 4));
                    this.c = null;
                    this.b = true;
                    if (l4p1.s(vr20Var, jgeVarE, this) == d9nVar5) {
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
                ?? r1 = this.b;
                try {
                    if (r1 == 0) {
                        hm5.M(obj);
                        this.c = ((d0r) this.d).c(((s8a1) this.e).c.a(new m8a1(((qhf0) this.f).a)));
                        this.b = true;
                        hap1.f(this);
                        return d9nVar6;
                    }
                    if (r1 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    r1.dispose();
                    throw th2;
                }
            case 6:
                d9n d9nVar7 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    ven0 ven0Var2 = (ven0) this.f;
                    yzh1 yzh1Var = ((gwv0) this.d).c;
                    this.c = ven0Var2;
                    this.b = true;
                    objB = yzh1.b(yzh1Var, this);
                    if (objB == d9nVar7) {
                        return d9nVar7;
                    }
                    ven0Var = ven0Var2;
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var = (ven0) this.c;
                    hm5.M(obj);
                    objB = obj;
                }
                String str4 = (String) objB;
                if (str4 == null) {
                    str4 = (String) this.e;
                }
                ven0Var.setValue(str4);
                return rih1.a;
            case 7:
                d9n d9nVar8 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    mr20 mr20VarU = rqt0.u(new x010((mr20) this.c, (mr20) this.d, new lag0((w7u0) this.e, (lnm) null, (byte) 6), (byte) 1));
                    jfw0 jfw0Var = new jfw0((ofw0) this.f, (byte) 0);
                    this.b = true;
                    if (mr20VarU.collect(jfw0Var, this) == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 8:
                c9n c9nVar2 = (c9n) this.c;
                d9n d9nVar9 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    List<String> list3 = (List) this.d;
                    xmu0 xmu0Var = (xmu0) this.e;
                    File file = (File) this.f;
                    ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                    for (String str5 : list3) {
                        fns fnsVar = igu.a;
                        arrayList.add(fn31.q(c9nVar2, b3s.c, 0, new rwm0(str5, xmu0Var, file, (lnm) null, (byte) 26), 2));
                    }
                    this.c = null;
                    this.b = true;
                    objU = o1p1.u(arrayList, this);
                    if (objU == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return sqg0.T((Iterable) objU);
            case 9:
                ayh ayhVar = (ayh) this.f;
                String str6 = (String) this.e;
                u6y0 u6y0Var = (u6y0) this.c;
                rih1 rih1Var = rih1.a;
                d9n d9nVar10 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    LinkedHashMap linkedHashMap = u6y0Var.Z;
                    LinkedHashMap linkedHashMap2 = u6y0Var.Z;
                    h6y0 h6y0Var2 = (h6y0) linkedHashMap.get(str6);
                    if (h6y0Var2 == null) {
                        oy21 oy21Var = (py21) this.d;
                        if (oy21Var instanceof oy21) {
                            Map map = ((qxc0) oy21Var.a).X;
                            Set set = h4d0.a;
                            String str7 = (String) map.get("generation_status");
                            if (str7 != null && (string = ihc1.e1(str7).toString()) != null) {
                                str = string;
                            }
                            h4d0 h4d0VarU = qyo1.u(str);
                            h4d0VarU.getClass();
                            if (h4d0.a.contains(h4d0VarU)) {
                                u6y0.l(u6y0Var, str6, 2, (UUID) null, 4);
                                h6y0Var2 = (h6y0) linkedHashMap2.get(str6);
                                h6y0Var = h6y0Var2;
                                if (h6y0Var != null) {
                                    o6y0Var = h6y0Var.g;
                                    if (o6y0Var == null) {
                                        o6y0VarA = new o6y0(h6y0Var.a, false, Collections.singletonList(ayhVar));
                                    } else {
                                        o6y0VarA = o6y0.a(o6y0Var, o7h.O0(ayhVar, o6y0Var.c), 3);
                                    }
                                    linkedHashMap2.put(str6, h6y0.a(h6y0Var, (v6y0) null, false, (UUID) null, (xab1) null, o6y0VarA, 63));
                                    this.b = true;
                                    if (u6y0Var.c(str6, this) == d9nVar10) {
                                        return d9nVar10;
                                    }
                                }
                            } else {
                                ayhVar.m0(Boolean.TRUE);
                            }
                        } else if (oy21Var instanceof ly21) {
                            ayhVar.m0(Boolean.FALSE);
                        } else {
                            ayhVar.m0(Boolean.TRUE);
                        }
                    } else {
                        h6y0Var = h6y0Var2;
                        if (h6y0Var != null) {
                            o6y0Var = h6y0Var.g;
                            if (o6y0Var == null) {
                                o6y0VarA = new o6y0(h6y0Var.a, false, Collections.singletonList(ayhVar));
                            } else {
                                o6y0VarA = o6y0.a(o6y0Var, o7h.O0(ayhVar, o6y0Var.c), 3);
                            }
                            linkedHashMap2.put(str6, h6y0.a(h6y0Var, (v6y0) null, false, (UUID) null, (xab1) null, o6y0VarA, 63));
                            this.b = true;
                            if (u6y0Var.c(str6, this) == d9nVar10) {
                                return d9nVar10;
                            }
                        }
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 10:
                m231 m231Var8 = rih1.a;
                String str8 = (String) this.e;
                iu30 iu30Var = (iu30) this.c;
                tcy0 tcy0Var = (tcy0) this.d;
                d9n d9nVar11 = d9n.a;
                boolean z10 = this.b;
                try {
                    if (!z10) {
                        hm5.M(obj);
                        iu30Var.invoke(new rcy0(((qcy0) tcy0Var).a, str8));
                        l0x0 l0x0Var = (l0x0) ((cm0) this.f).d;
                        String str9 = ((qcy0) tcy0Var).a;
                        this.b = true;
                        if (l0x0Var.A(str9, str8, this) == d9nVar11) {
                            return d9nVar11;
                        }
                    } else {
                        if (!z10) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var2 = m231Var8;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th3) {
                    m231Var2 = new m231(th3);
                }
                Throwable thA3 = e331.a(m231Var2);
                if (thA3 != null) {
                    n57.t("Failure when refreshing prompted world section", thA3);
                    qcy0 qcy0Var = (qcy0) tcy0Var;
                    iu30Var.invoke(new pcy0(qcy0Var.a, "", qcy0Var.f));
                }
                return m231Var8;
            case 11:
                iu30 iu30Var2 = (iu30) this.e;
                m231 m231Var9 = rih1.a;
                tcy0 tcy0Var2 = (tcy0) this.d;
                d9n d9nVar12 = d9n.a;
                boolean z11 = this.b;
                try {
                    if (!z11) {
                        hm5.M(obj);
                        l0x0 l0x0Var2 = (l0x0) ((cm0) this.c).d;
                        String str10 = ((qcy0) tcy0Var2).a;
                        this.b = true;
                        if (l0x0Var2.z(str10, this) == d9nVar12) {
                            return d9nVar12;
                        }
                    } else {
                        if (!z11) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var3 = m231Var9;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th4) {
                    m231Var3 = new m231(th4);
                }
                ncy0 ncy0Var = (ncy0) this.f;
                if (!(m231Var3 instanceof m231)) {
                    String str11 = ncy0Var.a;
                    String str12 = ncy0Var.b;
                    z6x z6xVar = z6x.a;
                    iu30Var2.invoke(new ocy0(str11, str12, z6xVar, z6xVar));
                }
                Throwable thA4 = e331.a(m231Var3);
                if (thA4 != null) {
                    n57.t("Failure when resetting prompted world section", thA4);
                    iu30Var2.invoke(qcy0.b((qcy0) tcy0Var2, null, null, false, false, 511));
                }
                return m231Var9;
            case 12:
                d9n d9nVar13 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    if (!((is20) this.d).f) {
                        vu30 vu30Var = ((poy0) this.e).d.d;
                        Object obj2 = this.f;
                        this.c = null;
                        this.b = true;
                        if (vu30Var.invoke(obj2, this) == d9nVar13) {
                            return d9nVar13;
                        }
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                guz0 guz0Var = (guz0) this.d;
                rih1 rih1Var2 = rih1.a;
                iu30 iu30Var3 = (iu30) this.f;
                xtz0 xtz0Var = (xtz0) this.e;
                String str13 = xtz0Var.a;
                d9n d9nVar14 = d9n.a;
                boolean z13 = this.b;
                try {
                    if (!z13) {
                        hm5.M(obj);
                        if (((duz0) this.c) instanceof cuz0) {
                            this.b = true;
                            objS = smo1.s(new sew0(guz0Var, str13, zxc0Var, (byte) 7), this);
                            if (objS == d9nVar14) {
                                return d9nVar14;
                            }
                        }
                        return rih1Var2;
                    }
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objS = obj;
                    wtz0 wtz0Var = (wtz0) objS;
                    if (wtz0Var instanceof utz0) {
                        ytz0 ytz0Var = ((utz0) wtz0Var).a;
                        Integer num = xtz0Var.b;
                        int iIntValue = num != null ? num.intValue() : ytz0Var.c;
                        boolean z14 = ytz0Var.a;
                        String str14 = ytz0Var.b;
                        if (z14) {
                            iu30Var3.invoke(new ztz0(str14, iIntValue, iIntValue > 0));
                        } else {
                            iu30Var3.invoke(new auz0(str14));
                        }
                    } else {
                        if (!u890.j(wtz0Var, vtz0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iu30Var3.invoke(new buz0(true));
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    Logger.e(e4, "Ratings: Failed to load ratings page for %s", new Object[]{str13});
                    iu30Var3.invoke(new buz0(!(guz0Var.g.a() instanceof twz0)));
                }
                return rih1Var2;
            case 14:
                m231 m231Var10 = rih1.a;
                d9n d9nVar15 = d9n.a;
                boolean z15 = this.b;
                try {
                    if (!z15) {
                        hm5.M(obj);
                        rwz0 rwz0Var2 = (rwz0) this.f;
                        String str15 = (String) this.e;
                        if (rwz0Var2.e == 0 || rwz0Var2.a.b() - rwz0Var2.e > 21600000) {
                            xyc0 xyc0Var = rwz0Var2.b;
                            ddd1 ddd1Var2 = ddd1.c;
                            this.d = null;
                            this.c = rwz0Var2;
                            this.b = true;
                            objU2 = xyc0Var.u(str15, ddd1Var2, this);
                            if (objU2 == d9nVar15) {
                                return d9nVar15;
                            }
                            rwz0Var = rwz0Var2;
                        }
                        m231Var4 = m231Var10;
                        thA = e331.a(m231Var4);
                        if (thA != null) {
                            Logger.e(thA, "Playlist: Failed resyncing. its OK!", new Object[0]);
                        }
                        return m231Var10;
                    }
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rwz0Var = (rwz0) this.c;
                    hm5.M(obj);
                    objU2 = obj;
                    ((py21) objU2).d();
                    rwz0Var.e = rwz0Var.a.b();
                    m231Var4 = m231Var10;
                } catch (Throwable th5) {
                    m231Var4 = new m231(th5);
                }
                thA = e331.a(m231Var4);
                if (thA != null) {
                    Logger.e(thA, "Playlist: Failed resyncing. its OK!", new Object[0]);
                }
                return m231Var10;
            case 15:
                v601 v601Var = (v601) this.d;
                e701 e701Var = (e701) this.c;
                d9n d9nVar16 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    jge jgeVarE2 = hu20.e(e701Var.b ? new lt20(((tag1) e701Var.f).b(v601Var.a), new q8t0(3, (lnm) null, (byte) 6), (byte) 0) : new huz((Object) null, (byte) 10), new c6e0(zxc0Var, (Object) v601Var, (Object) e701Var, (byte) 14));
                    zjf0 zjf0Var = new zjf0((iu30) this.e, (ven0) this.f, (byte) 1);
                    this.b = true;
                    if (jgeVarE2.collect(zjf0Var, this) == d9nVar16) {
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
                vr20 vr20Var2 = (vr20) this.c;
                d9n d9nVar17 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    bw01 bw01Var = (bw01) ((dw01) this.d).b.get((String) this.e);
                    if (bw01Var != null) {
                        this.c = null;
                        this.b = true;
                        if (vr20Var2.emit(bw01Var, this) == d9nVar17) {
                            return d9nVar17;
                        }
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                fn31.T(smo1.e(getContext()), (o8n) null, 0, new rr01((vr01) this.f, null, (byte) 1), 3);
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                gx01 gx01Var = (gx01) this.c;
                d9n d9nVar18 = d9n.a;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xyc0 xyc0Var2 = gx01Var.e;
                String str16 = (String) this.e;
                List listSingletonList = Collections.singletonList((String) this.d);
                String str17 = gx01Var.b.a;
                String str18 = (String) this.e;
                tv80 tv80Var = (tv80) this.f;
                zxc0Var = tv80Var != null ? new zxc0(tv80Var.a) : null;
                this.b = true;
                Object objE = xyc0Var2.e(str16, listSingletonList, "end", str17, str18, zxc0Var, this);
                return objE == d9nVar18 ? d9nVar18 : objE;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                m231 m231Var11 = rih1.a;
                vi11 vi11Var = (vi11) this.d;
                q8n q8nVar = (q8n) vi11Var.f;
                dg30 dg30Var = (dg30) vi11Var.b;
                d9n d9nVar19 = d9n.a;
                boolean z19 = this.b;
                try {
                    if (!z19) {
                        hm5.M(obj);
                        String str19 = (String) this.e;
                        tv80 tv80Var2 = (tv80) this.f;
                        xyc0 xyc0Var3 = (iyc0) vi11Var.c;
                        List listSingletonList2 = Collections.singletonList(str19);
                        this.c = null;
                        this.b = true;
                        objL = xyc0Var3.l("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", listSingletonList2, this, tv80Var2);
                        if (objL == d9nVar19) {
                            return d9nVar19;
                        }
                    } else {
                        if (!z19) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objL = obj;
                    }
                    ((py21) objL).d();
                    m231Var5 = m231Var11;
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th6) {
                    m231Var5 = new m231(th6);
                }
                if (e331.a(m231Var5) != null) {
                    fn31.T(cto1.q(dg30Var), q8nVar, 0, new nx5(vi11Var, 2131962633, zxc0Var, b), 2);
                }
                if (!(m231Var5 instanceof m231)) {
                    fn31.T(cto1.q(dg30Var), q8nVar, 0, new nx5(vi11Var, 2131962632, zxc0Var, b), 2);
                }
                return m231Var11;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                m231 m231Var12 = rih1.a;
                lnm lnmVar = (String) this.e;
                xa21 xa21Var = (xa21) this.d;
                kt91 kt91Var = xa21Var.c;
                d9n d9nVar20 = d9n.a;
                boolean z20 = this.b;
                try {
                    if (!z20) {
                        hm5.M(obj);
                        bfd bfdVar = xa21Var.b;
                        this.c = null;
                        this.b = true;
                        Object objB2 = bfdVar.b.a.b(lnmVar, this);
                        if (objB2 != d9nVar20) {
                            objB2 = m231Var12;
                        }
                        if (objB2 != d9nVar20) {
                            objB2 = m231Var12;
                        }
                        if (objB2 == d9nVar20) {
                            return d9nVar20;
                        }
                    } else {
                        if (!z20) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var6 = m231Var12;
                    break;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th7) {
                    m231Var6 = new m231(th7);
                }
                lnm lnmVar2 = (String) this.f;
                if (e331.a(m231Var6) == null) {
                    ao30 ao30Var = xa21Var.d;
                    dg30 dg30Var2 = xa21Var.a;
                    ao30Var.getClass();
                    ao30Var.a.l(new xn30(lnmVar));
                    zxc0Var = ihc1.y0(lnmVar2) ? null : lnmVar2;
                    if (zxc0Var == null) {
                        zxc0Var = lnmVar;
                    }
                    kt91Var.k(new er91((fs91) null, dg30Var2.getString(2131961175, zxc0Var), (Integer) null, dg30Var2.getString(2131961176), (Integer) null, new wa21(xa21Var, lnmVar, (byte) 0), (cvr) null, (xq91) null, false));
                } else {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961174});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131961174, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return m231Var12;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return e(obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                d9n d9nVar21 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    c9n c9nVar3 = (c9n) this.c;
                    fns fnsVar2 = igu.a;
                    bs50 bs50Var = pyf0.a.f;
                    af0 af0Var = new af0(this.d, this.e, (Object) c9nVar3, this.f, (lnm) null, (byte) 24);
                    this.b = true;
                    if (fn31.Y(bs50Var, af0Var, this) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                d9n d9nVar22 = d9n.a;
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                br21 br21Var = (br21) this.c;
                zxa zxaVar = br21Var.e;
                Bitmap bitmapS = br21Var.d.S((as21) this.d, (Bitmap) this.e, (Bitmap) this.f);
                this.b = true;
                Object objD = zxa.d(zxaVar, bitmapS, this);
                return objD == d9nVar22 ? d9nVar22 : objD;
            case 23:
                return g(obj);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return h(obj);
            case 25:
                return i(obj);
            case 26:
                return j(obj);
            case 27:
                return m(obj);
            case 28:
                return o(obj);
            default:
                ssw0 ssw0Var = (ssw0) this.c;
                d9n d9nVar23 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    AtomicInteger atomicInteger = new AtomicInteger();
                    p811 p811Var = new p811();
                    d4v0 d4v0Var = new d4v0(atomicInteger, p811Var, ((xm41) this.d).e(new odp0(atomicInteger, p811Var, ssw0Var, (mr20) this.f, (byte) 13), new vvu0(atomicInteger, p811Var, ssw0Var, (iu30) this.e, (byte) 26)), (byte) 25);
                    this.c = null;
                    this.b = true;
                    if (jch0.s(ssw0Var, d4v0Var, this) == d9nVar23) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ elu0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ elu0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elu0(vo3 vo3Var, bo31 bo31Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 26;
        this.e = vo3Var;
        this.f = bo31Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elu0(is20 is20Var, lnm lnmVar, poy0 poy0Var, Object obj) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.d = is20Var;
        this.e = poy0Var;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elu0(zou0 zou0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.f = zou0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elu0(rwz0 rwz0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 14;
        this.f = rwz0Var;
        this.e = str;
    }
}
