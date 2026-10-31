package p;

import com.spotify.collection_esperanto.proto.BanGlobalRequest;
import com.spotify.collection_esperanto.proto.IsSnoozedRequest;
import com.spotify.collection_esperanto.proto.IsSnoozedResponse;
import com.spotify.collection_esperanto.proto.UnbanGlobalRequest;
import com.spotify.collection_esperanto.proto.UnsnoozeRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jjr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zfr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjr(String str, zfr zfrVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = str;
        this.e = zfrVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        zfr zfrVar = this.e;
        switch (b) {
            case 0:
                jjr jjrVar = new jjr(zfrVar, str, lnmVar, (byte) 0);
                jjrVar.c = obj;
                return jjrVar;
            case 1:
                jjr jjrVar2 = new jjr(str, zfrVar, lnmVar, (byte) 1);
                jjrVar2.c = obj;
                return jjrVar2;
            case 2:
                jjr jjrVar3 = new jjr(str, zfrVar, lnmVar, (byte) 2);
                jjrVar3.c = obj;
                return jjrVar3;
            default:
                jjr jjrVar4 = new jjr(zfrVar, str, lnmVar, (byte) 3);
                jjrVar4.c = obj;
                return jjrVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Integer m231Var;
        IsSnoozedResponse m231Var2;
        Boolean boolValueOf;
        Integer m231Var3;
        byte b = this.a;
        Object obj2 = p4a.a;
        q4a q4aVar = q4a.a;
        String str = this.d;
        zfr zfrVar = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        r5h r5hVar = (r5h) zfrVar.b;
                        c4a c4aVarN = BanGlobalRequest.n();
                        c4aVarN.n(str);
                        Single map = r5hVar.callSingle("spotify.collection_esperanto.proto.CollectionService", "BanGlobal", (BanGlobalRequest) c4aVarN.build()).map(cq41.P0).map(rbc.W0);
                        this.c = null;
                        this.b = true;
                        obj = fc11.j(map, this);
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
                    m231Var = (Integer) obj;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (e331.a(m231Var) != null) {
                    m231Var = new Integer(500);
                }
                int iIntValue = m231Var.intValue();
                tr80 tr80Var = s4a.a;
                int i = ((rr80) tr80Var).a;
                if (iIntValue <= ((rr80) tr80Var).b && i <= iIntValue) {
                    obj2 = q4aVar;
                }
                return obj2;
            case 1:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        Set set = s4b1.f;
                        if (uic.x(str).c != blc0.ti) {
                            return Boolean.FALSE;
                        }
                        r5h r5hVar2 = (r5h) zfrVar.b;
                        yf90 yf90VarN = IsSnoozedRequest.n();
                        yf90VarN.n(str);
                        Single map2 = r5hVar2.callSingle("spotify.collection_esperanto.proto.CollectionService", "IsSnoozed", (IsSnoozedRequest) yf90VarN.build()).map(o9p1.Q0);
                        this.c = null;
                        this.b = true;
                        obj = fc11.j(map2, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var2 = (IsSnoozedResponse) obj;
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                if (e331.a(m231Var2) == null) {
                    IsSnoozedResponse isSnoozedResponse = m231Var2;
                    tr80 tr80Var2 = s4a.a;
                    int i2 = ((rr80) tr80Var2).a;
                    int i3 = ((rr80) tr80Var2).b;
                    int iN = isSnoozedResponse.o().n();
                    boolValueOf = Boolean.valueOf((i2 > iN || iN > i3) ? false : isSnoozedResponse.n());
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            case 2:
                boolean z3 = this.b;
                rih1 rih1Var = rih1.a;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        Set set2 = s4b1.f;
                        if (uic.x(str).c == blc0.ti) {
                            r5h r5hVar3 = (r5h) zfrVar.b;
                            rlh1 rlh1VarN = UnsnoozeRequest.n();
                            rlh1VarN.n(str);
                            Single map3 = r5hVar3.callSingle("spotify.collection_esperanto.proto.CollectionService", "Unsnooze", (UnsnoozeRequest) rlh1VarN.build()).map(q9w.R0);
                            this.c = null;
                            this.b = true;
                            obj = fc11.j(map3, this);
                            if (obj == d9nVar) {
                                return d9nVar;
                            }
                        }
                        return rih1Var;
                    }
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    break;
                } catch (Throwable unused) {
                }
                return rih1Var;
            default:
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        r5h r5hVar4 = (r5h) zfrVar.b;
                        ggh1 ggh1VarN = UnbanGlobalRequest.n();
                        ggh1VarN.n(str);
                        Single map4 = r5hVar4.callSingle("spotify.collection_esperanto.proto.CollectionService", "UnbanGlobal", (UnbanGlobalRequest) ggh1VarN.build()).map(m9h.R0).map(m9h.Y0);
                        this.c = null;
                        this.b = true;
                        obj = fc11.j(map4, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var3 = (Integer) obj;
                    break;
                } catch (Throwable th3) {
                    m231Var3 = new m231(th3);
                }
                if (e331.a(m231Var3) != null) {
                    m231Var3 = new Integer(500);
                }
                int iIntValue2 = m231Var3.intValue();
                tr80 tr80Var3 = s4a.a;
                int i4 = ((rr80) tr80Var3).a;
                if (iIntValue2 <= ((rr80) tr80Var3).b && i4 <= iIntValue2) {
                    obj2 = q4aVar;
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjr(zfr zfrVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = zfrVar;
        this.d = str;
    }
}
