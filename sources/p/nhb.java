package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nhb extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhb(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return new nhb((AtomicBoolean) this.c, (phb) obj3, (zxh) obj2, (ohb) obj, lnmVar, (byte) 0);
            case 1:
                return new nhb((zor) this.c, (String) obj3, (String) obj2, (String) obj, lnmVar, (byte) 1);
            case 2:
                return new nhb((dxy) this.c, (String) obj3, (String) obj2, (qxc0) obj, lnmVar, (byte) 2);
            case 3:
                return new nhb((List) this.c, (c9n) obj3, (l5d0) obj2, (t45) obj, lnmVar, (byte) 3);
            case 4:
                return new nhb((et9) this.c, (cir0) obj3, (String) obj2, (String) obj, lnmVar, (byte) 4);
            default:
                return new nhb((Uri) obj3, (esa1) obj2, (a3e1) obj, lnmVar);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        a3e1 a3e1Var;
        Object objA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        rih1 rih1Var2 = d9n.a;
        switch (b) {
            case 0:
                ohb ohbVar = (ohb) obj3;
                phb phbVar = (phb) obj4;
                Context context = phbVar.a;
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        ((AtomicBoolean) this.c).set(true);
                        phbVar.b.a.stopBluetoothSco();
                        c38 c38Var = new c38((zxh) obj2, null, (byte) 2);
                        this.b = true;
                        if (rc2.M(2000L, c38Var, this) == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    try {
                        context.unregisterReceiver(ohbVar);
                        return rih1Var;
                    } catch (Throwable unused) {
                        return rih1Var;
                    }
                } catch (Throwable th) {
                    try {
                        context.unregisterReceiver(ohbVar);
                        break;
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zor zorVar = (zor) this.c;
                String str = (String) obj4;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                this.b = true;
                zorVar.getClass();
                boolean zJ = u890.j(str, "local_device");
                c3l c3lVar = zorVar.a;
                if (zJ) {
                    objB = c3lVar.e(str2, this);
                } else {
                    c3l c3lVar2 = c3lVar;
                    c3lVar2.getClass();
                    v4l v4lVarN = ConnectMessages.TransferRequest.n();
                    v4lVarN.n(str);
                    osh oshVarO = CommonMessages.LoggingParams.o();
                    if (str2 != null) {
                        oshVarO.n(str2);
                    }
                    if (str3 != null) {
                        oshVarO.q(str3);
                    }
                    v4lVarN.q(oshVarO.build());
                    objB = c3lVar2.b("Transfer playback failure", new i24(c3lVar2, v4lVarN.build(), (lnm) null, (byte) 26), this);
                }
                return objB == rih1Var2 ? rih1Var2 : objB;
            case 2:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        rzu rzuVar = new rzu((dxy) this.c, (String) obj4, (String) obj2, (qxc0) obj3, (lnm) null, (byte) 24);
                        this.b = true;
                        if (rc2.M(5000L, rzuVar, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused3) {
                }
                break;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list = (List) this.c;
                c9n c9nVar = (c9n) obj4;
                l5d0 l5d0Var = (l5d0) obj2;
                t45 t45Var = (t45) obj3;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new ary(l5d0Var, (i5d0) it.next(), t45Var, (lnm) null), 3));
                }
                this.b = true;
                return o1p1.u(arrayList, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 4:
                et9 et9Var = (et9) this.c;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    Object objB2 = ((j2e0) et9Var.f).b(((cir0) obj4).h(), ((wne0) et9Var.c).a, (String) obj2, (String) obj3, this);
                    return objB2 == rih1Var2 ? rih1Var2 : objB2;
                }
                if (z5) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z6 = this.b;
                if (z6) {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a3e1Var = (a3e1) this.c;
                    hm5.M(obj);
                    objA = obj;
                    return new wgf((xgf) objA, (fhf) null, new r771(a3e1Var.a.a.b));
                }
                hm5.M(obj);
                Uri uri = (Uri) obj4;
                if (uri != null) {
                    a3e1Var = (a3e1) obj3;
                    bnt bntVar = new bnt(uri);
                    ez61 ez61Var = a3e1Var.a.b.c;
                    this.c = a3e1Var;
                    this.b = true;
                    objA = bhf.a(bntVar, ez61Var);
                    if (objA == rih1Var2) {
                        return rih1Var2;
                    }
                    return new wgf((xgf) objA, (fhf) null, new r771(a3e1Var.a.a.b));
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhb(Uri uri, esa1 esa1Var, a3e1 a3e1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 5;
        this.d = uri;
        this.e = esa1Var;
        this.f = a3e1Var;
    }
}
