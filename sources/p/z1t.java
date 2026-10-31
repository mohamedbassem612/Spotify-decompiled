package p;

import com.spotify.gander.v2.proto.ResetLatestCursorRequest;
import com.spotify.gander.v2.proto.ResetLatestCursorResponse;
import com.spotify.gander.v2.proto.UpdateNotificationStateRequest;
import com.spotify.gander.v2.proto.UpdateNotificationStateResponse;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z1t extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ a2t c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1t(a2t a2tVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = a2tVar;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        a2t a2tVar = this.c;
        switch (b) {
            case 0:
                return new z1t(a2tVar, str, lnmVar, (byte) 0);
            default:
                return new z1t(a2tVar, str, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007c A[Catch: Exception -> 0x0092, TryCatch #1 {Exception -> 0x0092, blocks: (B:12:0x002c, B:13:0x0031, B:22:0x0074, B:24:0x007c, B:26:0x0087, B:25:0x0082, B:19:0x004c), top: B:63:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[Catch: Exception -> 0x0092, TryCatch #1 {Exception -> 0x0092, blocks: (B:12:0x002c, B:13:0x0031, B:22:0x0074, B:24:0x007c, B:26:0x0087, B:25:0x0082, B:19:0x004c), top: B:63:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010f A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:41:0x00bc, B:42:0x00c1, B:51:0x0107, B:53:0x010f, B:55:0x011a, B:54:0x0115, B:48:0x00da), top: B:62:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0115 A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:41:0x00bc, B:42:0x00c1, B:51:0x0107, B:53:0x010f, B:55:0x011a, B:54:0x0115, B:48:0x00da), top: B:62:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object a0n1Var;
        Object d0n1Var;
        bbc bbcVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        a2t a2tVar = this.c;
        String str = this.d;
        switch (b) {
            case 0:
                bbc bbcVar2 = a2tVar.c;
                byte b2 = this.b;
                try {
                    if (b2 == 0) {
                        hm5.M(obj);
                        b0n1 b0n1Var = new b0n1(str);
                        this.b = (byte) 1;
                        if (bbcVar2.b(b0n1Var, this) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b2 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            if (b2 == 3) {
                                hm5.M(obj);
                                return rih1Var;
                            }
                            if (b2 == 4) {
                                hm5.M(obj);
                                return rih1Var;
                            }
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    if (((UpdateNotificationStateResponse) obj).n()) {
                        a0n1Var = new c0n1(str);
                    } else {
                        a0n1Var = new a0n1(str);
                    }
                    this.b = (byte) 3;
                    if (bbcVar2.b(a0n1Var, this) != d9nVar) {
                        return rih1Var;
                    }
                    return d9nVar;
                    mma0[] mma0VarArr = a2t.d;
                    y2n1 y2n1Var = (y2n1) a2tVar.b.f(a2tVar, a2t.d[0]);
                    nth1 nth1VarQ = UpdateNotificationStateRequest.q();
                    nth1VarQ.q(str);
                    nth1VarQ.r(oth1.DELETED);
                    Single singleE = y2n1Var.e(nth1VarQ.build());
                    this.b = (byte) 2;
                    obj = fc11.j(singleE, this);
                    if (obj != d9nVar) {
                        if (((UpdateNotificationStateResponse) obj).n()) {
                            a0n1Var = new c0n1(str);
                        } else {
                            a0n1Var = new a0n1(str);
                        }
                        this.b = (byte) 3;
                        if (bbcVar2.b(a0n1Var, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                } catch (Exception unused) {
                    a0n1 a0n1Var2 = new a0n1(str);
                    this.b = (byte) 4;
                    if (bbcVar2.b(a0n1Var2, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                try {
                    if (b3 == 0) {
                        hm5.M(obj);
                        bbc bbcVar3 = a2tVar.c;
                        e0n1 e0n1Var = new e0n1(str);
                        this.b = (byte) 1;
                        if (bbcVar3.b(e0n1Var, this) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b3 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b3 != 2) {
                            if (b3 == 3) {
                                hm5.M(obj);
                                return rih1Var;
                            }
                            if (b3 == 4) {
                                hm5.M(obj);
                                return rih1Var;
                            }
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    if (((ResetLatestCursorResponse) obj).n()) {
                        d0n1Var = new f0n1(str);
                    } else {
                        d0n1Var = new d0n1(str);
                    }
                    bbcVar = a2tVar.c;
                    this.b = (byte) 3;
                    if (bbcVar.b(d0n1Var, this) != d9nVar) {
                        return rih1Var;
                    }
                    return d9nVar;
                    mma0[] mma0VarArr2 = a2t.d;
                    y2n1 y2n1Var2 = (y2n1) a2tVar.b.f(a2tVar, a2t.d[0]);
                    ls21 ls21VarO = ResetLatestCursorRequest.o();
                    ls21VarO.n(str);
                    Single singleB = y2n1Var2.b(ls21VarO.build());
                    this.b = (byte) 2;
                    obj = fc11.j(singleB, this);
                    if (obj != d9nVar) {
                        if (((ResetLatestCursorResponse) obj).n()) {
                            d0n1Var = new f0n1(str);
                        } else {
                            d0n1Var = new d0n1(str);
                        }
                        bbcVar = a2tVar.c;
                        this.b = (byte) 3;
                        if (bbcVar.b(d0n1Var, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                } catch (Exception unused2) {
                    bbc bbcVar4 = a2tVar.c;
                    d0n1 d0n1Var2 = new d0n1(str);
                    this.b = (byte) 4;
                    if (bbcVar4.b(d0n1Var2, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
        }
    }
}
