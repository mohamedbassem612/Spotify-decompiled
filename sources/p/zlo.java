package p;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.collection_esperanto.proto.UnsnoozeRequest;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zlo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlo(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new zlo((toj0) this.e, (String) obj2, lnmVar, (byte) 0);
            case 1:
                return new zlo(this.d, (String) obj2, this.e, lnmVar, (byte) 1);
            case 2:
                return new zlo(this.d, this.e, obj2, lnmVar, (byte) 2);
            case 3:
                zlo zloVar = new zlo((i0h) this.e, lnmVar, (vdr) obj2);
                zloVar.d = obj;
                return zloVar;
            case 4:
                return new zlo(this.d, (String) obj2, this.e, lnmVar, (byte) 4);
            case 5:
                return new zlo(this.d, (String) obj2, this.e, lnmVar, (byte) 5);
            case 6:
                return new zlo(this.d, this.e, obj2, lnmVar, (byte) 6);
            case 7:
                zlo zloVar2 = new zlo((hvr) this.e, (String) obj2, lnmVar, (byte) 7);
                zloVar2.d = obj;
                return zloVar2;
            case 8:
                zlo zloVar3 = new zlo((String) obj2, lnmVar, (k9r) this.e);
                zloVar3.d = obj;
                return zloVar3;
            case 9:
                zlo zloVar4 = new zlo((mzr) this.e, (String) obj2, lnmVar, (byte) 9);
                zloVar4.d = obj;
                return zloVar4;
            case 10:
                return new zlo(this.d, (String) obj2, this.e, lnmVar, (byte) 10);
            case 11:
                return new zlo(this.d, this.e, obj2, lnmVar, (byte) 11);
            case 12:
                zlo zloVar5 = new zlo((mhc) this.e, (View) obj2, lnmVar, (byte) 12);
                zloVar5.d = obj;
                return zloVar5;
            case 13:
                zlo zloVar6 = new zlo(obj2, lnmVar, (byte) 13);
                zloVar6.e = obj;
                return zloVar6;
            case 14:
                return new zlo(this.d, (String) obj2, this.e, lnmVar, (byte) 14);
            case 15:
                return new zlo(this.d, (String) obj2, this.e, lnmVar, (byte) 15);
            case 16:
                return new zlo((ak3) this.e, (oms) obj2, lnmVar, (byte) 16);
            case 17:
                zlo zloVar7 = new zlo((List) this.e, (oms) obj2, lnmVar, (byte) 17);
                zloVar7.d = obj;
                return zloVar7;
            case 18:
                zlo zloVar8 = new zlo((jns) this.e, (vu30) obj2, lnmVar, (byte) 18);
                zloVar8.d = obj;
                return zloVar8;
            case 19:
                return new zlo(this.d, this.e, obj2, lnmVar, (byte) 19);
            case 20:
                return new zlo(this.d, this.e, obj2, lnmVar, (byte) 20);
            case 21:
                zlo zloVar9 = new zlo((vxs) this.e, (nsf1) obj2, lnmVar, (byte) 21);
                zloVar9.d = obj;
                return zloVar9;
            case 22:
                zlo zloVar10 = new zlo((t0t) this.e, (hsm1) obj2, lnmVar, (byte) 22);
                zloVar10.d = obj;
                return zloVar10;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new zlo(this.d, (String) obj2, this.e, lnmVar, (byte) 23);
            case 24:
                zlo zloVar11 = new zlo((mxr) this.e, (String) obj2, lnmVar, (byte) 24);
                zloVar11.d = obj;
                return zloVar11;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new zlo(this.d, (String) obj2, this.e, lnmVar, (byte) 25);
            case 26:
                zlo zloVar12 = new zlo((okt) this.e, (vr20) obj2, lnmVar, (byte) 26);
                zloVar12.d = obj;
                return zloVar12;
            case 27:
                return new zlo(obj2, lnmVar, (byte) 27);
            case 28:
                zlo zloVar13 = new zlo((r2v) this.e, (a3v) obj2, lnmVar, (byte) 28);
                zloVar13.d = obj;
                return zloVar13;
            default:
                zlo zloVar14 = new zlo((swn) this.e, (x5v) obj2, lnmVar, (byte) 29);
                zloVar14.d = obj;
                return zloVar14;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((uxs) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((uvr) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:351:0x075e  */
    public final Object invokeSuspend(Object obj) {
        bpb1 bpb1Var;
        Object objE;
        Status m231Var;
        Object objJ;
        YourLibraryResponse m231Var2;
        h290 h290VarO;
        Object objK;
        blc0 m231Var3;
        Object objY;
        xea0 xea0Var;
        ou80 ou80Var;
        Object objQ;
        Object objH;
        Object objB;
        ak3 ak3Var;
        Object objI;
        m231 m231Var4;
        Object objG;
        xgn0 xgn0Var;
        Context context;
        String defaultUserAgent;
        String str;
        hfd m231Var5;
        w2v y2vVar;
        Object value;
        Object objB2;
        byte b = this.a;
        byte b2 = 18;
        boolean z = false;
        m231 m231Var6 = rih1.a;
        Object obj2 = this.c;
        d9n d9nVar = d9n.a;
        byte b3 = 1;
        String str2 = null;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    toj0 toj0Var = (toj0) this.e;
                    bpb1Var = (bpb1) toj0Var.e;
                    this.d = bpb1Var;
                    this.b = true;
                    objE = toj0Var.e((String) obj2, this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bpb1 bpb1Var2 = (bpb1) this.d;
                    hm5.M(obj);
                    bpb1Var = bpb1Var2;
                    objE = obj;
                }
                bpb1Var.l(objE);
                return m231Var6;
            case 1:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gfm0 gfm0Var = (gfm0) this.e;
                String str3 = gfm0Var.a;
                String str4 = gfm0Var.b;
                String str5 = gfm0Var.d;
                boolean z4 = gfm0Var.c;
                this.b = true;
                return ((lqo) this.d).g.x((String) obj2, str3, str4, str5, z4, this) == d9nVar ? d9nVar : m231Var6;
            case 2:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    if (d0r.d((rzq) this.d, hvm.a, (mqm) this.e, (trm) obj2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            case 3:
                vr20 vr20Var = (vr20) this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                i0h i0hVar = (i0h) this.e;
                t0l t0lVar = new t0l(vr20Var, (vdr) obj2, (byte) 14);
                this.d = null;
                this.b = true;
                return i0hVar.collect(t0lVar, this) == d9nVar ? d9nVar : m231Var6;
            case 4:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xqs xqsVar = ((ijr) this.d).d;
                String str6 = (String) this.e;
                this.b = true;
                Object objY2 = fn31.Y(xqsVar.d, new hxn(obj2, (Object) str6, (Object) xqsVar, (lnm) null, (byte) 15), this);
                return objY2 == d9nVar ? d9nVar : objY2;
            case 5:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = ((qkr) this.d).b;
                w8d w8dVar = new w8d((String) obj2, (String) this.e);
                this.b = true;
                return dt71Var.emit(w8dVar, this) == d9nVar ? d9nVar : m231Var6;
            case 6:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mxr mxrVar = ((bmr) this.d).c;
                tqw tqwVar = (tqw) this.e;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                dsf dsfVar = (dsf) ((gsf) obj2);
                String str7 = dsfVar.a;
                bca0 bca0Var = new bca0(new wea0(xea0.X), dsfVar.b, Collections.singleton(ko90.e), (String) null);
                this.b = true;
                return mxrVar.B(tv80VarY, str7, bca0Var, this) == d9nVar ? d9nVar : m231Var6;
            case 7:
                boolean z10 = this.b;
                try {
                    if (!z10) {
                        hm5.M(obj);
                        String str8 = (String) obj2;
                        r5h r5hVar = ((hvr) this.e).h;
                        rlh1 rlh1VarN = UnsnoozeRequest.n();
                        rlh1VarN.n(str8);
                        Single map = r5hVar.callSingle("spotify.collection_esperanto.proto.CollectionService", "Unsnooze", rlh1VarN.build()).map(q9w.R0);
                        this.d = null;
                        this.b = true;
                        objJ = fc11.j(map, this);
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z10) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    m231Var = (Status) objJ;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                return new e331(m231Var);
            case 8:
                boolean z11 = this.b;
                try {
                    if (!z11) {
                        hm5.M(obj);
                        mwm1 mwm1Var = (mwm1) ((k9r) this.e).d;
                        gvm1 gvm1VarO = YourLibraryRequest.o();
                        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
                        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
                        jsm1VarR.q(ksm1.f);
                        hvm1VarQ.u(jsm1VarR.build());
                        hvm1VarQ.C(2);
                        gvm1VarO.q(hvm1VarQ.build());
                        ezc ezcVarG = yoi1.g(mwm1Var.b(gvm1VarO.build()));
                        this.d = null;
                        this.b = true;
                        objK = b5p1.k(ezcVarG, this);
                        if (objK == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z11) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objK = obj;
                    }
                    m231Var2 = (YourLibraryResponse) objK;
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                if (e331.a(m231Var2) != null) {
                    return Boolean.FALSE;
                }
                YourLibraryResponse yourLibraryResponse = m231Var2;
                if (yourLibraryResponse == null || (h290VarO = yourLibraryResponse.o()) == null) {
                    return Boolean.FALSE;
                }
                if (h290VarO.isEmpty()) {
                    z = true;
                } else if (h290VarO.size() == 1) {
                    ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                    Iterator it = h290VarO.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((htm1) it.next()).e().getUri());
                    }
                    if (arrayList.contains((String) obj2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                String str9 = (String) obj2;
                mzr mzrVar = (mzr) this.e;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    try {
                        m231Var3 = blc0.valueOf(str9);
                    } catch (Throwable th3) {
                        m231Var3 = new m231(th3);
                    }
                    if (e331.a(m231Var3) != null) {
                        n57.e("First Save page should be invoked with a valid type");
                        return m231Var6;
                    }
                    this.d = null;
                    this.b = true;
                    objY = fn31.Y(mzrVar.c, new eum(mzrVar, (lnm) null, (byte) 18), this);
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                    break;
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objY = obj;
                }
                Set setO1 = o7h.o1((Iterable) objY);
                setO1.add(str9);
                bma1 bma1Var = mzr.e;
                hma1 hma1VarEdit = ((dma1) mzrVar.d.getValue()).edit();
                hma1VarEdit.d(mzr.e, mzrVar.a.b(new r36(chc1.a, (byte) 0), o7h.l1(setO1)));
                hma1VarEdit.h();
                return m231Var6;
            case 10:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    byp bypVar = (byp) ((ip31) this.d).f;
                    String str10 = (String) obj2;
                    qo90 qo90Var = (qo90) this.e;
                    boolean z14 = qo90Var.i.a;
                    if (z14) {
                        xea0Var = xea0.h;
                    } else if (z14) {
                        eg.o();
                    } else {
                        xea0Var = xea0.f;
                    }
                    aca0 aca0Var = new aca0(new wea0(xea0Var), qo90Var);
                    this.b = true;
                    return bypVar.B(str10, aca0Var, this) == d9nVar ? d9nVar : m231Var6;
                }
                if (z13) {
                    hm5.M(obj);
                    return m231Var6;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                byp bypVar2 = (byp) ((mxr) this.d).b;
                tv80 tv80Var = (tv80) this.e;
                if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                    str2 = ou80Var.a;
                }
                this.b = true;
                return bypVar2.B(str2, (cca0) obj2, this) == d9nVar ? d9nVar : m231Var6;
            case 12:
                View view = (View) obj2;
                ssw0 ssw0Var = (ssw0) this.d;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                WeakHashMap weakHashMap = b8k1.a;
                hsl1 hsl1VarA = s7k1.a(view);
                if (hsl1VarA != null && hsl1VarA.a.u(8)) {
                    z = true;
                }
                ssw0Var.l(Boolean.valueOf(z));
                r7k1.c(view, new i5s(ssw0Var));
                th thVar = new th(view, (byte) 2);
                this.d = null;
                this.b = true;
                return jch0.s(ssw0Var, thVar, this) == d9nVar ? d9nVar : m231Var6;
            case 13:
                y9s y9sVar = (y9s) obj2;
                c9n c9nVar = (c9n) this.e;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 4, new p9s(y9sVar, str2, b3), 1);
                    p250 p250Var = y9sVar.b;
                    if (p250Var.c()) {
                        fn31.T(p250Var.e, (o8n) null, 0, new o250(p250Var, null, (byte) 3), 3);
                    }
                    this.e = null;
                    this.d = y9sVar;
                    this.b = true;
                    objQ = s2tVarQ.Q(this);
                    if (objQ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y9sVar = (y9s) this.d;
                    hm5.M(obj);
                    objQ = obj;
                }
                return new bla1(y9sVar.f((m250) objQ));
            case 14:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        objH = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var = (xrc0) ((pbq) this.d).f;
                List list = (List) this.e;
                this.b = true;
                rsc0 rsc0Var2 = rsc0Var;
                objH = c921.H(rsc0Var2.c, new n0a0((String) obj2, list, rsc0Var2, (lnm) null), this);
                if (objH == d9nVar) {
                    return d9nVar;
                }
                oy21 oy21Var = (py21) objH;
                oy21Var.getClass();
                if (oy21Var instanceof ly21) {
                    return z6x.a;
                }
                if (oy21Var instanceof oy21) {
                    return (List) oy21Var.a;
                }
                eg.o();
                return null;
            case 15:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    boolean z20 = !((a8v0) this.e).b;
                    this.b = true;
                    objB = ((dgs) this.d).h.b((String) obj2, this, z20);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = ((e331) obj).a;
                }
                hm5.M(objB);
                return m231Var6;
            case 16:
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    ak3Var = (ak3) this.e;
                    mr20 mr20VarA = ((oms) obj2).a(ak3Var);
                    this.d = ak3Var;
                    this.b = true;
                    objI = b5p1.i(mr20VarA, this);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ak3Var = (ak3) this.d;
                    hm5.M(obj);
                    objI = obj;
                }
                return new wms(ak3Var, (List) objI);
            case 17:
                c9n c9nVar2 = (c9n) this.d;
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
                List list2 = (List) this.e;
                oms omsVar = (oms) obj2;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(fn31.q(c9nVar2, (o8n) null, 0, new zlo((ak3) it2.next(), omsVar, str2, (byte) 16), 3));
                }
                this.d = null;
                this.b = true;
                Object objU = o1p1.u(arrayList2, this);
                return objU == d9nVar ? d9nVar : objU;
            case 18:
                hrr0 hrr0Var = ((jns) this.e).d;
                boolean z23 = this.b;
                try {
                    if (!z23) {
                        hm5.M(obj);
                        bs41 bs41Var = (bs41) this.d;
                        hrr0Var.setValue(Boolean.TRUE);
                        this.b = true;
                        if (((vu30) obj2).invoke(bs41Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z23) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    hrr0Var.setValue(Boolean.FALSE);
                    return m231Var6;
                } catch (Throwable th4) {
                    hrr0Var.setValue(Boolean.FALSE);
                    throw th4;
                }
            case 19:
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jns jnsVar = (jns) this.d;
                pfn0 pfn0Var = jnsVar.c;
                ins insVar = jnsVar.b;
                hfn0 hfn0Var = (hfn0) this.e;
                zlo zloVar = new zlo(jnsVar, (vu30) obj2, str2, b2);
                this.b = true;
                pfn0Var.getClass();
                return smo1.s(new ofn0(hfn0Var, pfn0Var, zloVar, insVar, (lnm) null), this) == d9nVar ? d9nVar : m231Var6;
            case 20:
                r591 r591Var = (r591) this.e;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    vu30 vu30Var = (vu30) ((ven0) this.d).getValue();
                    this.b = true;
                    if (vu30Var.invoke(r591Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((cir0) obj2).c().a(new y231(new z591(r591Var)));
                return m231Var6;
            case 21:
                Boolean bool = (vxs) this.e;
                boolean z26 = this.b;
                try {
                    if (!z26) {
                        hm5.M(obj);
                        uxs uxsVar = (uxs) this.d;
                        ((vxs) bool).d.setValue(Boolean.TRUE);
                        this.b = true;
                        if (((nsf1) obj2).invoke(uxsVar, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z26) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    hrr0 hrr0Var2 = ((vxs) bool).d;
                    bool = Boolean.FALSE;
                    hrr0Var2.setValue(bool);
                    return m231Var6;
                } catch (Throwable th5) {
                    ((vxs) bool).d.setValue(Boolean.FALSE);
                    throw th5;
                }
            case 22:
                vr20 vr20Var2 = (vr20) this.d;
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean boolValueOf = Boolean.valueOf(((t0t) this.e).a((hsm1) obj2));
                this.d = null;
                this.b = true;
                return vr20Var2.emit(boolValueOf, this) == d9nVar ? d9nVar : m231Var6;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    String str11 = (String) this.e;
                    this.b = true;
                    return ((y7h0) ((cp31) this.d).a).b((String) obj2, str11, this) == d9nVar ? d9nVar : m231Var6;
                }
                if (!z28) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Object obj3 = ((e331) obj).a;
                return m231Var6;
            case 24:
                boolean z29 = this.b;
                try {
                    if (!z29) {
                        hm5.M(obj);
                        String str12 = (String) obj2;
                        pp31 pp31Var = (op31) ((mxr) this.e).c;
                        this.d = null;
                        this.b = true;
                        objG = pp31Var.g(str12, this);
                        if (objG == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z29) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objG = obj;
                    }
                    ((py21) objG).d();
                    m231Var4 = m231Var6;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th6) {
                    m231Var4 = new m231(th6);
                }
                Throwable thA = e331.a(m231Var4);
                if (thA == null) {
                    return m231Var6;
                }
                Logger.e(thA, "DeleteListContextMenuItem: failed to delete list", new Object[0]);
                return m231Var6;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xyc0 xyc0Var = (iyc0) ((qmr) this.d).b;
                String str13 = (String) this.e;
                this.b = true;
                xyc0 xyc0Var2 = xyc0Var;
                Object objH2 = c921.H(xyc0Var2.c, new ary(obj2, (Object) xyc0Var2, (Object) str13, (lnm) null, (byte) 11), this);
                return objH2 == d9nVar ? d9nVar : objH2;
            case 26:
                okt oktVar = (okt) this.e;
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vr20 vr20Var3 = (vr20) obj2;
                mr20 mr20VarU = rqt0.u(new i0h(new x3s(oktVar.a, (byte) 5), (byte) 23));
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var3);
                Object objCollect = mr20VarU.collect(new k9t(vr20Var3, (byte) 8), this);
                if (objCollect != d9nVar) {
                    objCollect = m231Var6;
                }
                if (objCollect != d9nVar) {
                    objCollect = m231Var6;
                }
                return objCollect == d9nVar ? d9nVar : m231Var6;
            case 27:
                boolean z32 = this.b;
                if (!z32) {
                    hm5.M(obj);
                    xgn0Var = cwt.a;
                    context = (Context) obj2;
                    this.d = xgn0Var;
                    this.e = context;
                    this.b = true;
                    if (xgn0Var.a(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z32) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) this.e;
                    xgn0Var = (xgn0) this.d;
                    hm5.M(obj);
                }
                try {
                    if (TextUtils.isEmpty(n3c.p)) {
                        try {
                            i1k0.B("Begin getUserAgentAsync " + Thread.currentThread());
                            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                            try {
                                i1k0.B("End getUserAgentAsync " + Thread.currentThread() + ' ' + defaultUserAgent);
                            } catch (Exception e2) {
                                e = e2;
                                i1k0.n("Failed to retrieve userAgent string. " + e.getMessage());
                            }
                        } catch (Exception e3) {
                            e = e3;
                            defaultUserAgent = null;
                        }
                        str = defaultUserAgent;
                        break;
                    } else {
                        i1k0.B("UserAgent cached " + n3c.p);
                        str = n3c.p;
                    }
                    return str;
                } finally {
                    xgn0Var.c((Object) null);
                }
            case 28:
                r2v r2vVar = (r2v) this.e;
                a3v a3vVar = (a3v) obj2;
                boolean z33 = this.b;
                try {
                    if (z33) {
                        if (z33) {
                            hm5.M(obj);
                            objB2 = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    elj1 elj1Var = (elj1) r2vVar.a.get();
                    String str14 = a3vVar.a;
                    wpc wpcVar = elj1Var.a.c;
                    k2r k2rVar = wpcVar.e;
                    g3r g3rVar = new g3r(wpcVar.a(k2rVar != null ? k2rVar.j() : null, 0), new n3r(Uri.parse(str14)));
                    jfd jfdVar = (ifd) r2vVar.b.get();
                    String strConcat = nhc1.W(ihc1.Z0(ihc1.X0(a3vVar.a, "/"), "?"), ":", "_").concat(".mp4");
                    this.d = null;
                    this.b = true;
                    objB2 = jfdVar.b(g3rVar, strConcat);
                    if (objB2 == d9nVar) {
                        return d9nVar;
                    }
                    m231Var5 = (hfd) objB2;
                    break;
                } catch (Throwable th7) {
                    m231Var5 = new m231(th7);
                }
                Throwable thA2 = e331.a(m231Var5);
                if (thA2 == null) {
                    hfd hfdVar = m231Var5;
                    if (u890.j(hfdVar, gfd.a)) {
                        y2vVar = w2v.a;
                    } else if (u890.j(hfdVar, ffd.a)) {
                        y2vVar = z2v.a;
                    } else {
                        if (!(hfdVar instanceof efd)) {
                            eg.o();
                            return null;
                        }
                        y2vVar = new y2v(((efd) hfdVar).a);
                    }
                } else {
                    op71.x(getContext());
                    y2vVar = new y2v(thA2);
                }
                bpb1 bpb1Var3 = r2vVar.d;
                do {
                    value = bpb1Var3.getValue();
                } while (!bpb1Var3.k(value, sqg0.P((Map) value, new mmr0(a3vVar.a, y2vVar))));
                return new mmr0(a3vVar.a, y2vVar);
            default:
                boolean z34 = this.b;
                if (z34) {
                    if (z34) {
                        hm5.M(obj);
                        return m231Var6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uvr uvrVar = (uvr) this.d;
                swn swnVar = (swn) this.e;
                j6 j6Var = new j6(uvrVar, (x5v) obj2, (byte) 26);
                this.b = true;
                return swnVar.invoke(j6Var, this) == d9nVar ? d9nVar : m231Var6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlo(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlo(Object obj, String str, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = str;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlo(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlo(String str, lnm lnmVar, k9r k9rVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.c = str;
        this.e = k9rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlo(i0h i0hVar, lnm lnmVar, vdr vdrVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.e = i0hVar;
        this.c = vdrVar;
    }
}
