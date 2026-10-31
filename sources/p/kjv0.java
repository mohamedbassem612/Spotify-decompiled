package p;

import android.view.View;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import io.reactivex.rxjava3.core.Completable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kjv0 extends a8d1 implements bv30 {
    public final /* synthetic */ String N0;
    public final /* synthetic */ pzn0 O0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ d78 Y;
    public final /* synthetic */ kv00 Z;
    public Object a;
    public String b;
    public boolean c;
    public int d;
    public byte e;
    public /* synthetic */ xiv0 f;
    public /* synthetic */ piv0 g;
    public /* synthetic */ tqw h;
    public final /* synthetic */ qtr i;
    public final /* synthetic */ a1q t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjv0(qtr qtrVar, a1q a1qVar, boolean z, d78 d78Var, kv00 kv00Var, String str, pzn0 pzn0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.i = qtrVar;
        this.t = a1qVar;
        this.X = z;
        this.Y = d78Var;
        this.Z = kv00Var;
        this.N0 = str;
        this.O0 = pzn0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str = this.N0;
        pzn0 pzn0Var = this.O0;
        kjv0 kjv0Var = new kjv0(this.i, this.t, this.X, this.Y, this.Z, str, pzn0Var, (lnm) obj5);
        kjv0Var.f = (xiv0) obj2;
        kjv0Var.g = (piv0) obj3;
        kjv0Var.h = (tqw) obj4;
        return kjv0Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:14:0x004b, B:46:0x0121, B:17:0x0054, B:20:0x0065, B:32:0x00a4, B:38:0x00c5, B:27:0x007b, B:42:0x00fd), top: B:66:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: all -> 0x01c0, TRY_LEAVE, TryCatch #0 {all -> 0x01c0, blocks: (B:14:0x004b, B:46:0x0121, B:17:0x0054, B:20:0x0065, B:32:0x00a4, B:38:0x00c5, B:27:0x007b, B:42:0x00fd), top: B:66:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x019d  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c0 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        bs50 bs50Var;
        cqu0 cqu0Var;
        kv00 kv00Var;
        String str;
        int i;
        d78 d78Var;
        boolean z;
        d78 d78Var2;
        int i2;
        Object objY;
        Completable completableA;
        fcc fccVar = fcc.R0;
        a1q a1qVar = this.t;
        CollectionPlatformItemsRequest collectionPlatformItemsRequest = (CollectionPlatformItemsRequest) a1qVar.c;
        w4h w4hVar = (w4h) a1qVar.b;
        xiv0 xiv0Var = this.f;
        piv0 piv0Var = this.g;
        tqw tqwVar = this.h;
        byte b = this.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            try {
                switch (b) {
                    case 0:
                        hm5.M(obj);
                        if (piv0Var != null) {
                            boolean zJ = u890.j(xiv0Var, xiv0.a);
                            d78 d78Var3 = this.Y;
                            if (zJ) {
                                boolean z2 = this.X;
                                Completable completableIgnoreElement = w4hVar.a(collectionPlatformItemsRequest).doOnSuccess(fccVar).ignoreElement();
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.a = d78Var3;
                                this.b = null;
                                this.c = z2;
                                this.d = 0;
                                this.e = (byte) 1;
                                if (fc11.i(completableIgnoreElement, this) != d9nVar) {
                                    z = z2;
                                    d78Var2 = d78Var3;
                                    i2 = 0;
                                    if (z) {
                                        this.f = null;
                                        this.g = null;
                                        this.h = null;
                                        this.a = null;
                                        this.b = null;
                                        this.d = i2;
                                        this.e = (byte) 2;
                                        objY = fn31.Y(d78Var2.d, new bu(d78Var2, (lnm) null, (byte) 2), this);
                                        if (objY == d9nVar) {
                                            objY = rih1Var;
                                        }
                                        if (objY == d9nVar) {
                                        }
                                    } else {
                                        kt91 kt91Var = d78Var2.a;
                                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952625});
                                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                                        kt91Var.k(new er91((fs91) null, "", 2131952625, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                                    }
                                }
                            } else if (u890.j(xiv0Var, xiv0.c)) {
                                Completable completableIgnoreElement2 = w4hVar.b(collectionPlatformItemsRequest).doOnSuccess(fccVar).ignoreElement();
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.a = d78Var3;
                                this.b = null;
                                this.d = 0;
                                this.e = (byte) 3;
                                if (fc11.i(completableIgnoreElement2, this) != d9nVar) {
                                    d78Var = d78Var3;
                                    kt91 kt91Var2 = d78Var.a;
                                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952626});
                                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                                    kt91Var2.k(new er91((fs91) null, "", 2131952626, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                                }
                            } else {
                                if (!u890.j(xiv0Var, xiv0.b)) {
                                    eg.o();
                                    return null;
                                }
                                kv00Var = this.Z;
                                str = this.N0;
                                Completable completableA2 = kv00Var.a(va81.class, Collections.singletonList(str));
                                this.f = null;
                                this.g = null;
                                this.h = tqwVar;
                                this.a = kv00Var;
                                this.b = str;
                                this.d = 0;
                                this.e = (byte) 4;
                                if (fc11.i(completableA2, this) != d9nVar) {
                                    i = 0;
                                    completableA = kv00Var.a(att0.class, Collections.singletonList(str));
                                    this.f = null;
                                    this.g = null;
                                    this.h = tqwVar;
                                    this.a = null;
                                    this.b = null;
                                    this.d = i;
                                    this.e = (byte) 5;
                                    if (fc11.i(completableA, this) != d9nVar) {
                                        fns fnsVar = igu.a;
                                        bs50Var = pyf0.a;
                                        cqu0Var = new cqu0(this.O0, tqwVar, (lnm) null, (byte) 2);
                                        this.f = null;
                                        this.g = null;
                                        this.h = null;
                                        this.a = null;
                                        this.b = null;
                                        this.e = (byte) 6;
                                        if (fn31.Y(bs50Var, cqu0Var, this) != d9nVar) {
                                        }
                                    }
                                }
                            }
                            return d9nVar;
                        }
                        return rih1Var;
                    case 1:
                        i2 = this.d;
                        z = this.c;
                        qtr qtrVar = this.b;
                        d78Var2 = (d78) this.a;
                        hm5.M(obj);
                        if (z) {
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.a = null;
                            this.b = null;
                            this.d = i2;
                            this.e = (byte) 2;
                            objY = fn31.Y(d78Var2.d, new bu(d78Var2, (lnm) null, (byte) 2), this);
                            if (objY == d9nVar) {
                                objY = rih1Var;
                            }
                            if (objY == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            kt91 kt91Var3 = d78Var2.a;
                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952625});
                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                            kt91Var3.k(new er91((fs91) null, "", 2131952625, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        }
                        return rih1Var;
                    case 2:
                        hm5.M(obj);
                        return rih1Var;
                    case 3:
                        qtr qtrVar2 = this.b;
                        d78Var = (d78) this.a;
                        hm5.M(obj);
                        kt91 kt91Var4 = d78Var.a;
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952626});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        kt91Var4.k(new er91((fs91) null, "", 2131952626, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return rih1Var;
                    case 4:
                        i = this.d;
                        str = this.b;
                        kv00Var = (kv00) this.a;
                        hm5.M(obj);
                        completableA = kv00Var.a(att0.class, Collections.singletonList(str));
                        this.f = null;
                        this.g = null;
                        this.h = tqwVar;
                        this.a = null;
                        this.b = null;
                        this.d = i;
                        this.e = (byte) 5;
                        if (fc11.i(completableA, this) != d9nVar) {
                            fns fnsVar2 = igu.a;
                            bs50Var = pyf0.a;
                            cqu0Var = new cqu0(this.O0, tqwVar, (lnm) null, (byte) 2);
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.a = null;
                            this.b = null;
                            this.e = (byte) 6;
                            if (fn31.Y(bs50Var, cqu0Var, this) != d9nVar) {
                                return rih1Var;
                            }
                        }
                        return d9nVar;
                    case 5:
                        hm5.M(obj);
                        fns fnsVar3 = igu.a;
                        bs50Var = pyf0.a;
                        cqu0Var = new cqu0(this.O0, tqwVar, (lnm) null, (byte) 2);
                        this.f = null;
                        this.g = null;
                        this.h = null;
                        this.a = null;
                        this.b = null;
                        this.e = (byte) 6;
                        if (fn31.Y(bs50Var, cqu0Var, this) != d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    case 6:
                        hm5.M(obj);
                        return rih1Var;
                    default:
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }
}
