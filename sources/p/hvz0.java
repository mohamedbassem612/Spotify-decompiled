package p;

import android.app.Application;
import com.ravelin.core.model.RavelinError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hvz0 extends a8d1 implements vu30 {
    public final /* synthetic */ String N0;
    public final /* synthetic */ String O0;
    public final /* synthetic */ cnr P0;
    public /* synthetic */ Object X;
    public final /* synthetic */ bvz0 Y;
    public final /* synthetic */ Application Z;
    public q6n1 a;
    public too1 b;
    public Object c;
    public Object d;
    public Object e;
    public cnr f;
    public q6n1 g;
    public int h;
    public int i;
    public byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvz0(bvz0 bvz0Var, Application application, String str, String str2, cnr cnrVar, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = bvz0Var;
        this.Z = application;
        this.N0 = str;
        this.O0 = str2;
        this.P0 = cnrVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        hvz0 hvz0Var = new hvz0(this.Y, this.Z, this.N0, this.O0, this.P0, lnmVar);
        hvz0Var.X = obj;
        return hvz0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009a A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #7 {all -> 0x00cf, blocks: (B:25:0x0096, B:27:0x009a), top: B:72:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #3 {all -> 0x00c7, blocks: (B:33:0x00c1, B:41:0x00d4, B:43:0x00d8, B:48:0x00e3, B:49:0x00ea), top: B:65:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[Catch: all -> 0x00c7, TRY_ENTER, TryCatch #3 {all -> 0x00c7, blocks: (B:33:0x00c1, B:41:0x00d4, B:43:0x00d8, B:48:0x00e3, B:49:0x00ea), top: B:65:0x00c1 }] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00e1: MOVE (r12 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:226), block:B:47:0x00e0 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Exception exc;
        c9n c9nVar;
        c9n c9nVar2;
        q6n1 q6n1Var;
        Application application;
        String str;
        String str2;
        cnr cnrVar;
        too1 too1Var;
        int i;
        int i2;
        vgn0 vgn0Var;
        cnr cnrVar2;
        String str3;
        String str4;
        Application application2;
        Throwable th;
        pvz0 pvz0Var;
        pvz0 pvz0Var2;
        pvz0 pvz0Var3;
        d9n d9nVar = d9n.a;
        byte b = this.t;
        try {
            if (b == 0) {
                hm5.M(obj);
                c9nVar2 = (c9n) this.X;
                try {
                    q6n1Var = pvz0.r;
                    too1 too1Var2 = this.Y;
                    application = this.Z;
                    str = this.N0;
                    str2 = this.O0;
                    cnrVar = this.P0;
                    this.X = c9nVar2;
                    this.a = q6n1Var;
                    this.b = too1Var2;
                    this.c = application;
                    this.d = str;
                    this.e = str2;
                    this.f = cnrVar;
                    this.g = q6n1Var;
                    this.h = 0;
                    this.i = 0;
                    this.t = (byte) 1;
                    try {
                        if (q6n1Var.a.a(this) != d9nVar) {
                            too1Var = too1Var2;
                            i = 0;
                            i2 = 0;
                            vgn0Var = q6n1Var;
                            cnrVar2 = cnrVar;
                            str3 = str;
                            str4 = str2;
                            application2 = application;
                            pvz0Var = pvz0.s;
                            if (pvz0Var == null) {
                                pvz0Var2 = new pvz0(application2, str3);
                                this.X = c9nVar2;
                                this.a = q6n1Var;
                                this.b = too1Var;
                                this.c = vgn0Var;
                                this.d = c9nVar2;
                                this.e = pvz0Var2;
                                this.f = null;
                                this.g = null;
                                this.h = i2;
                                this.i = i;
                                this.t = (byte) 2;
                                if (pvz0Var2.b(application2, str4, (String) null, cnrVar2, this) != d9nVar) {
                                    pvz0Var3 = pvz0Var2;
                                    pvz0.s = pvz0Var3;
                                    uic uicVar = pvz0.n;
                                    pvz0Var = pvz0Var3;
                                }
                            }
                            if (!pvz0.p) {
                                throw new IllegalArgumentException("The SDK was not initialized successfully");
                            }
                            too1Var.u(pvz0Var);
                            vgn0Var.c((Object) null);
                        }
                        return d9nVar;
                    } catch (Exception e) {
                        exc = e;
                        this.Y.n(new RavelinError(exc.getMessage(), (String) null, 2, (DefaultConstructorMarker) null));
                        op71.x(c9nVar2.J());
                    }
                } catch (Exception e2) {
                    exc = e2;
                }
            } else if (b == 1) {
                int i3 = this.i;
                int i4 = this.h;
                q6n1 q6n1Var2 = this.g;
                cnrVar = this.f;
                str2 = (String) this.e;
                str = (String) this.d;
                application = (Application) this.c;
                too1 too1Var3 = this.b;
                q6n1Var = this.a;
                c9nVar2 = (c9n) this.X;
                try {
                    hm5.M(obj);
                    i = i3;
                    vgn0Var = q6n1Var2;
                    i2 = i4;
                    too1Var = too1Var3;
                    cnrVar2 = cnrVar;
                    str3 = str;
                    str4 = str2;
                    application2 = application;
                    try {
                        pvz0Var = pvz0.s;
                        if (pvz0Var == null) {
                            pvz0Var2 = new pvz0(application2, str3);
                            this.X = c9nVar2;
                            this.a = q6n1Var;
                            this.b = too1Var;
                            this.c = vgn0Var;
                            this.d = c9nVar2;
                            this.e = pvz0Var2;
                            this.f = null;
                            this.g = null;
                            this.h = i2;
                            this.i = i;
                            this.t = (byte) 2;
                            try {
                                if (pvz0Var2.b(application2, str4, (String) null, cnrVar2, this) != d9nVar) {
                                    pvz0Var3 = pvz0Var2;
                                    pvz0.s = pvz0Var3;
                                    uic uicVar2 = pvz0.n;
                                    pvz0Var = pvz0Var3;
                                }
                                return d9nVar;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                vgn0Var.c((Object) null);
                                throw th;
                            }
                        }
                        if (!pvz0.p) {
                            throw new IllegalArgumentException("The SDK was not initialized successfully");
                        }
                        too1Var.u(pvz0Var);
                        vgn0Var.c((Object) null);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e3) {
                    exc = e3;
                    this.Y.n(new RavelinError(exc.getMessage(), (String) null, 2, (DefaultConstructorMarker) null));
                    op71.x(c9nVar2.J());
                }
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pvz0Var3 = (pvz0) this.e;
                vgn0Var = (vgn0) this.c;
                too1Var = this.b;
                try {
                    hm5.M(obj);
                    try {
                        pvz0.s = pvz0Var3;
                        uic uicVar3 = pvz0.n;
                        pvz0Var = pvz0Var3;
                        if (!pvz0.p) {
                            throw new IllegalArgumentException("The SDK was not initialized successfully");
                        }
                        too1Var.u(pvz0Var);
                        vgn0Var.c((Object) null);
                    } catch (Throwable th4) {
                        th = th4;
                        vgn0Var.c((Object) null);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    vgn0Var.c((Object) null);
                    throw th;
                }
            }
        } catch (Exception e4) {
            exc = e4;
            c9nVar2 = c9nVar;
        }
        return rih1.a;
    }
}
