package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateRequest;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials;
import com.spotify.connectivity.websocket.esperanto.proto.EsWebsocketConnectRequest$WebSocketConnectRequest;
import com.spotify.connectivity.websocket.esperanto.proto.EsWebsocketEvent;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(ven0 ven0Var, g431 g431Var, boolean z, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.c = ven0Var;
        this.d = g431Var;
        this.b = z;
        this.e = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = 2;
        switch (this.a) {
            case 0:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                c6 c6Var = new c6((List) this.d, (BluetoothCategorizer) this.e, lnmVar, (byte) 1);
                c6Var.c = obj;
                return c6Var;
            case 2:
                c6 c6Var2 = new c6((eo) this.e, lnmVar, b);
                c6Var2.d = obj;
                return c6Var2;
            case 3:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 3);
            case 4:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 4);
            case 5:
                c6 c6Var3 = new c6((Map) this.d, (il0) this.e, lnmVar, (byte) 5);
                c6Var3.c = obj;
                return c6Var3;
            case 6:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 6);
            case 7:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 7);
            case 8:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 8);
            case 9:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 9);
            case 10:
                return new c6((ven0) this.c, (g431) this.d, this.b, (ven0) this.e, lnmVar);
            case 11:
                c6 c6Var4 = new c6((t7o0) this.e, lnmVar, (byte) 11);
                c6Var4.d = obj;
                return c6Var4;
            case 12:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 12);
            case 13:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 13);
            case 14:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 14);
            case 15:
                c6 c6Var5 = new c6(b, lnmVar);
                c6Var5.e = obj;
                return c6Var5;
            case 16:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 16);
            case 17:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 17);
            case 18:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 18);
            case 19:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 19);
            case 20:
                c6 c6Var6 = new c6((qd3) this.d, (String) this.e, lnmVar, (byte) 20);
                c6Var6.c = obj;
                return c6Var6;
            case 21:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 21);
            case 22:
                return new c6((bl3) this.e, lnmVar, (byte) 22);
            case 23:
                return new c6(this.c, this.d, this.e, lnmVar, (byte) 23);
            case 24:
                c6 c6Var7 = new c6((xu30) this.d, (r24) this.e, lnmVar, (byte) 24);
                c6Var7.c = obj;
                return c6Var7;
            case 25:
                c6 c6Var8 = new c6((xu30) this.d, (s24) this.e, lnmVar, (byte) 25);
                c6Var8.c = obj;
                return c6Var8;
            case 26:
                c6 c6Var9 = new c6((xu30) this.d, (t24) this.e, lnmVar, (byte) 26);
                c6Var9.c = obj;
                return c6Var9;
            case 27:
                c6 c6Var10 = new c6((zu30) this.d, (s24) this.e, lnmVar, (byte) 27);
                c6Var10.c = obj;
                return c6Var10;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                c6 c6Var11 = new c6((zu30) this.d, (t24) this.e, lnmVar, (byte) 28);
                c6Var11.c = obj;
                return c6Var11;
            default:
                c6 c6Var12 = new c6((c85) this.d, (EsWebsocketConnectRequest$WebSocketConnectRequest) this.e, lnmVar, (byte) 29);
                c6Var12.c = obj;
                return c6Var12;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws NoSuchAlgorithmException, KeyManagementException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((ang0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((zmg0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((wvr) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, KeyManagementException {
        eo eoVar;
        o811 o811Var;
        o811 o811Var2;
        nq2 nq2Var;
        sy21 m231Var;
        z2w0 z2w0Var;
        String str;
        ut71 ut71Var;
        Context context;
        String strA = null;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    idn0 idn0Var = (idn0) this.c;
                    q9w0 q9w0Var = (q9w0) this.d;
                    this.b = true;
                    if (idn0Var.b(q9w0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                qku qkuVar = (qku) this.e;
                if (qkuVar != null) {
                    qkuVar.dispose();
                }
                return rih1.a;
            case 1:
                c9n c9nVar = (c9n) this.c;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        List list = (List) this.d;
                        BluetoothCategorizer bluetoothCategorizer = (BluetoothCategorizer) this.e;
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new q4((hi) it.next(), bluetoothCategorizer, (lnm) null, (byte) 3), 3));
                        }
                        this.c = null;
                        this.b = true;
                        obj = o1p1.u(arrayList, this);
                        if (obj == d9nVar2) {
                            return d9nVar2;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return o7h.o0((Iterable) obj);
                } catch (Exception e) {
                    Logger.e(e, "Error categorizing bluetooth devices", new Object[0]);
                    return z6x.a;
                }
            case 2:
                eo eoVar2 = (eo) this.e;
                c9n c9nVar2 = (c9n) this.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    wuc wucVar = eoVar2.X;
                    this.d = c9nVar2;
                    this.c = eoVar2;
                    this.b = true;
                    wucVar.getClass();
                    eoVar = eoVar2;
                    obj = null;
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eoVar = (eo) this.c;
                    hm5.M(obj);
                }
                if (obj != null) {
                    bhn0.d();
                    return null;
                }
                eoVar.getClass();
                eoVar2.c();
                fn31.T(c9nVar2, (o8n) null, 0, new co(eoVar2, (lnm) null, (byte) 0), 3);
                fn31.T(c9nVar2, (o8n) null, 0, new co(eoVar2, (lnm) null, (byte) 1), 3);
                return rih1.a;
            case 3:
                u7g0 u7g0Var = (u7g0) this.d;
                d9n d9nVar3 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    ox oxVar = (ox) this.c;
                    String str2 = u7g0Var.a;
                    of8 of8Var = (of8) this.e;
                    bma1 bma1Var = ox.h;
                    wve0 wve0Var = (wve0) oxVar.e.get();
                    zkz zkzVarN = EsAuthenticateRequest.AuthenticateRequest.n();
                    nkz nkzVarN = EsAuthenticateCredentials.AuthenticateCredentials.n();
                    vkz vkzVarO = EsAuthenticateCredentials.ParentChildCredentials.o();
                    vkzVarO.n(str2);
                    vsz vszVarP = EsUnencryptedStoredCredentials.UnencryptedStoredCredentials.p();
                    vszVarP.q(of8Var.a);
                    byte[] bArr = of8Var.b;
                    hhc hhcVar = phc.b;
                    vszVarP.n(phc.e(0, bArr, bArr.length));
                    vkzVarO.q((EsUnencryptedStoredCredentials.UnencryptedStoredCredentials) vszVarP.build());
                    nkzVarN.x(vkzVarO.build());
                    zkzVarN.n(nkzVarN.build());
                    Single singleSingleOrError = wve0Var.a(zkzVarN.build()).take(1L).map(new r6x0(oxVar, (byte) 27)).singleOrError();
                    this.b = true;
                    obj = fc11.j(singleSingleOrError, this);
                    if (obj == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ii8 ii8Var = (ji8) obj;
                return new mmr0(u7g0Var, ii8Var instanceof ii8 ? ii8Var.a : null);
            case 4:
                Enum r0 = d9n.a;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gf0 gf0Var = (gf0) this.c;
                ContextTrack contextTrack = (ContextTrack) this.d;
                t45 t45Var = (t45) this.e;
                this.b = true;
                Enum enumB = gf0Var.b(contextTrack, t45Var, this);
                return enumB == r0 ? r0 : enumB;
            case 5:
                c9n c9nVar3 = (c9n) this.c;
                d9n d9nVar4 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    Map map = (Map) this.d;
                    il0 il0Var = (il0) this.e;
                    ArrayList arrayList2 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList2.add(fn31.q(c9nVar3, (o8n) null, 0, new hl0(il0Var, (String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue(), (lnm) null, (byte) 0), 3));
                    }
                    this.c = null;
                    this.b = true;
                    obj = o1p1.u(arrayList2, this);
                    if (obj == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return sqg0.T(o7h.o0((Iterable) obj));
            case 6:
                rih1 rih1Var = rih1.a;
                d9n d9nVar5 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    ve01 ve01VarG = d5p1.g(((op0) this.c).a.a.a);
                    String str3 = (String) this.d;
                    mp0 mp0Var = new mp0((ven0) this.e, (byte) 0);
                    this.b = true;
                    Object objCollect = ve01VarG.a.collect(new st(mp0Var, str3, (byte) 1), this);
                    if (objCollect != d9nVar5) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 7:
                d9n d9nVar6 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    m441 m441VarQ = rwq.q(new g61((es41) this.c, (byte) 0));
                    hl0 hl0Var = new hl0((ven0) this.d, (ven0) this.e, (lnm) null, (byte) 1);
                    this.b = true;
                    if (l4p1.q(m441VarQ, hl0Var, this) == d9nVar6) {
                        return d9nVar6;
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
                frd1 frd1Var = (frd1) this.d;
                d9n d9nVar7 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    sxz0 sxz0VarA = ((zj1) this.c).b.a(frd1Var);
                    if (sxz0VarA == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    String str4 = ((b301) this.e).c;
                    this.b = true;
                    if (sxz0VarA.b(frd1Var, str4, this) == d9nVar7) {
                        return d9nVar7;
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
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar8 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    m441 m441VarQ2 = rwq.q(new ih1((xtb0) this.c, (byte) 1));
                    c380 c380Var = (c380) this.d;
                    vt vtVar = new vt(linkedHashSet, (ven0) this.e, (byte) 9);
                    this.b = true;
                    Object objCollect2 = m441VarQ2.collect(new zr1(vtVar, c380Var, (byte) 0), this);
                    if (objCollect2 != d9nVar8) {
                        objCollect2 = rih1Var2;
                    }
                    if (objCollect2 == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 10:
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.c;
                g431 g431Var = (g431) this.d;
                if (g431Var != null) {
                    if (!this.b) {
                        g431Var = null;
                    }
                    if (g431Var != null) {
                        strA = g431Var.a(uj1.r, new yw1((ven0) this.e, (byte) 0));
                    }
                }
                ven0Var.setValue(strA);
                return rih1.a;
            case 11:
                nsw0 nsw0Var = (nsw0) this.d;
                d9n d9nVar9 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.d = null;
                    this.c = nsw0Var;
                    this.b = true;
                    obj = ak3.e;
                    if (obj == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nsw0Var = (nsw0) this.c;
                    hm5.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(q7h.U(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new wms((ak3) it2.next(), z6x.a));
                }
                ((psw0) nsw0Var).setValue(arrayList3);
                return rih1.a;
            case 12:
                d9n d9nVar10 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    oy1 oy1Var = (oy1) this.c;
                    aas aasVar = oy1Var.b;
                    String str5 = (String) this.d;
                    y6r0 y6r0Var = oy1Var.c.get();
                    strA = y6r0Var != null ? y6r0Var.a : null;
                    if (strA == null) {
                        strA = "";
                    }
                    CompletableObserveOn completableObserveOnB = aasVar.b(str5, strA, 2, ((tv80) this.e).a.a);
                    this.b = true;
                    if (fc11.i(completableObserveOnB, this) == d9nVar10) {
                        return d9nVar10;
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
                d9n d9nVar11 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    i3j0 i3j0Var = ((wb2) this.c).d;
                    String str6 = (String) this.d;
                    e3j0 e3j0Var = e3j0.a;
                    Bundle bundle = (Bundle) this.e;
                    this.b = true;
                    if (i3j0.b(i3j0Var, str6, e3j0Var, bundle, this, 4) == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 14:
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar12 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    fq2 fq2Var = (fq2) this.c;
                    String str7 = (String) this.d;
                    gp21 gp21Var = (gp21) this.e;
                    this.b = true;
                    Set set = fq2.c0;
                    Object objS = smo1.s(new op2(fq2Var, gp21Var, str7, (lnm) null), this);
                    if (objS != d9nVar12) {
                        objS = rih1Var3;
                    }
                    if (objS == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
            case 15:
                nsw0 nsw0Var2 = (nsw0) this.e;
                d9n d9nVar13 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    o811 o811Var3 = new o811();
                    o811Var3.a = -1L;
                    o811Var = new o811();
                    o811Var2 = o811Var3;
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o811Var = (o811) this.d;
                    o811Var2 = (o811) this.c;
                    hm5.M(obj);
                }
                do {
                    nq2Var = new nq2(o811Var2, o811Var, nsw0Var2, (byte) 0);
                    this.e = nsw0Var2;
                    this.c = o811Var2;
                    this.d = o811Var;
                    this.b = true;
                } while (k5p1.x(nq2Var, this) != d9nVar13);
                return d9nVar13;
            case 16:
                d9n d9nVar14 = d9n.a;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mv2 mv2Var = (mv2) this.c;
                ekb ekbVar = (ekb) this.d;
                bq2 bq2Var = (bq2) this.e;
                this.b = true;
                Object objY = mv2Var.y(ekbVar, bq2Var, this);
                return objY == d9nVar14 ? d9nVar14 : objY;
            case 17:
                d9n d9nVar15 = d9n.a;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x390 x390Var = ((x73) this.c).e;
                String str8 = (String) this.e;
                this.b = true;
                Object objK = x390Var.k(str8, this);
                return objK == d9nVar15 ? d9nVar15 : objK;
            case 18:
                d9n d9nVar16 = d9n.a;
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
                ezc ezcVarG = yoi1.g(((x73) this.c).g.b((String) this.e, (lik1) this.d));
                this.b = true;
                Object objI = b5p1.i(ezcVarG, this);
                return objI == d9nVar16 ? d9nVar16 : objI;
            case 19:
                d9n d9nVar17 = d9n.a;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x73 x73Var = (x73) this.c;
                String str9 = (String) this.d;
                boolean z20 = ((mb3) this.e).O0;
                this.b = true;
                Object objC = !z20 ? x73Var.c(new wg7(), new t73(x73Var, str9, (lnm) null, (byte) 0), this) : new wg7();
                return objC == d9nVar17 ? d9nVar17 : objC;
            case 20:
                d9n d9nVar18 = d9n.a;
                boolean z21 = this.b;
                try {
                    if (!z21) {
                        hm5.M(obj);
                        Single singleA = ((u0w0) ((qd3) this.d).b.getValue()).a((String) this.e);
                        this.c = null;
                        this.b = true;
                        obj = fc11.j(singleA, this);
                        if (obj == d9nVar18) {
                            return d9nVar18;
                        }
                    } else {
                        if (!z21) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = (sy21) obj;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                sy21 sy21Var = m231Var;
                if (sy21Var == null) {
                    return null;
                }
                if (!sy21Var.a.Q0) {
                    sy21Var = null;
                }
                if (sy21Var == null || (z2w0Var = (z2w0) sy21Var.b) == null || (str = z2w0Var.a) == null) {
                    return null;
                }
                if (ihc1.y0(str)) {
                    str = null;
                }
                if (str != null) {
                    return "spotify:prerelease:".concat(str);
                }
                return null;
            case 21:
                d9n d9nVar19 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    Completable completableB = ((bl3) this.c).k.b((String) this.d, o7h.y0((List) this.e, ",", (String) null, (String) null, we3.d1, 30));
                    this.b = true;
                    if (fc11.i(completableB, this) == d9nVar19) {
                        return d9nVar19;
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
                d9n d9nVar20 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    bl3 bl3Var = (bl3) this.e;
                    ut71 ut71Var2 = bl3Var.g;
                    Context context2 = bl3Var.a;
                    joo jooVar = bl3Var.d;
                    this.c = ut71Var2;
                    this.d = context2;
                    this.b = true;
                    obj = jooVar.a(this);
                    if (obj == d9nVar20) {
                        return d9nVar20;
                    }
                    ut71Var = ut71Var2;
                    context = context2;
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) this.d;
                    ut71Var = (ut71) this.c;
                    hm5.M(obj);
                }
                return ut71Var.b(context, (String) obj);
            case 23:
                Consumer consumer = (Consumer) this.c;
                xx41 xx41Var = (by41) this.d;
                d9n d9nVar21 = d9n.a;
                boolean z24 = this.b;
                try {
                    if (!z24) {
                        hm5.M(obj);
                        fns fnsVar = igu.a;
                        b3s b3sVar = b3s.c;
                        hi2 hi2Var = new hi2((g931) this.e, xx41Var, (lnm) null, (byte) 13);
                        this.b = true;
                        obj = fn31.Y(b3sVar, hi2Var, this);
                        if (obj == d9nVar21) {
                            return d9nVar21;
                        }
                    } else {
                        if (!z24) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    Object obj2 = ((e331) obj).a;
                    Throwable thA = e331.a(obj2);
                    if (thA == null) {
                        consumer.accept(new d151(xx41Var.d, (List) obj2));
                    } else {
                        consumer.accept(new f151(xx41Var.d, thA));
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    consumer.accept(new f151(xx41Var.d, e4));
                }
                return rih1.a;
            case 24:
                d9n d9nVar22 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    ang0 ang0Var = (ang0) this.c;
                    xu30 xu30Var = (xu30) this.d;
                    m24 m24Var = (m24) ((r24) this.e).k;
                    this.b = true;
                    if (xu30Var.invoke(m24Var, ang0Var, this) == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 25:
                d9n d9nVar23 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    zmg0 zmg0Var = (zmg0) this.c;
                    xu30 xu30Var2 = (xu30) this.d;
                    n24 n24Var = (n24) ((s24) this.e).N0;
                    this.b = true;
                    if (xu30Var2.invoke(n24Var, zmg0Var, this) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 26:
                d9n d9nVar24 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    wvr wvrVar = (wvr) this.c;
                    xu30 xu30Var3 = (xu30) this.d;
                    o24 o24Var = ((t24) this.e).n;
                    this.b = true;
                    if (xu30Var3.invoke(o24Var, wvrVar, this) == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 27:
                d9n d9nVar25 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    mmr0 mmr0Var = (mmr0) this.c;
                    zmg0 zmg0Var2 = (zmg0) mmr0Var.a;
                    Object obj3 = mmr0Var.b;
                    zu30 zu30Var = (zu30) this.d;
                    n24 n24Var2 = (n24) ((s24) this.e).N0;
                    this.b = true;
                    if (zu30Var.J(n24Var2, zmg0Var2, obj3, this) == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                d9n d9nVar26 = d9n.a;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    mmr0 mmr0Var2 = (mmr0) this.c;
                    wvr wvrVar2 = (wvr) mmr0Var2.a;
                    Object obj4 = mmr0Var2.b;
                    zu30 zu30Var2 = (zu30) this.d;
                    o24 o24Var2 = ((t24) this.e).n;
                    this.b = true;
                    if (zu30Var2.J(o24Var2, wvrVar2, obj4, this) == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                ssw0 ssw0Var = (ssw0) this.c;
                d9n d9nVar27 = d9n.a;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    c85 c85Var = (c85) this.d;
                    EsWebsocketConnectRequest$WebSocketConnectRequest esWebsocketConnectRequest$WebSocketConnectRequest = (EsWebsocketConnectRequest$WebSocketConnectRequest) this.e;
                    azp0 azp0Var = c85Var.a;
                    if (esWebsocketConnectRequest$WebSocketConnectRequest.o()) {
                        a85 a85Var = new a85((byte) 0);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, new TrustManager[]{a85Var}, new SecureRandom());
                        zyp0 zyp0VarB = azp0Var.b();
                        zyp0VarB.b(sSLContext.getSocketFactory(), a85Var);
                        z75 z75Var = z75.a;
                        if (z75Var != zyp0VarB.u) {
                            zyp0VarB.E = null;
                        }
                        zyp0VarB.u = z75Var;
                        azp0Var = new azp0(zyp0VarB);
                    }
                    ne neVar = new ne((byte) 9);
                    neVar.e0(((EsWebsocketConnectRequest$WebSocketConnectRequest) this.e).getUrl());
                    ((t360) neVar.c).b("User-Agent", gvg.h("music/", ((c85) this.d).d, " android/", Build.VERSION.RELEASE));
                    EsWebsocketConnectRequest$WebSocketConnectRequest esWebsocketConnectRequest$WebSocketConnectRequest2 = (EsWebsocketConnectRequest$WebSocketConnectRequest) this.e;
                    if (esWebsocketConnectRequest$WebSocketConnectRequest2.n().length() > 0) {
                        neVar.d("Authorization", "Bearer " + esWebsocketConnectRequest$WebSocketConnectRequest2.n());
                    }
                    try {
                        ((c85) this.d).e = azp0Var.c(new ln21(neVar), new b85(ssw0Var));
                    } catch (Throwable th2) {
                        Logger.d(i3a.j("[WebSocket] caught throwable: ", th2), new Object[0]);
                        ysz yszVarN = EsWebsocketEvent.WebSocketEvent.n();
                        yszVarN.s(xsz.kTransportFailure);
                        ilo1.E(yszVarN.build(), ssw0Var);
                        ((c85) this.d).e = null;
                        ssw0Var.H(th2);
                    }
                    f55 f55Var = new f55((c85) this.d, (byte) 27);
                    this.c = null;
                    this.b = true;
                    if (jch0.s(ssw0Var, f55Var, this) == d9nVar27) {
                        return d9nVar27;
                    }
                    break;
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 15;
    }
}
