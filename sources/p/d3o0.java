package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d3o0 {
    public static final xgn0 j = ygn0.a();
    public static final bpb1 k = gio1.b(0L);
    public final ut71 a;
    public final Flowable b;
    public final Scheduler c;
    public final Scheduler d;
    public final q8n e;
    public final kly0 f;
    public final poj0 g;
    public final Context h;
    public final dma1 i;

    public d3o0(Context context, ut71 ut71Var, Flowable flowable, Scheduler scheduler, Scheduler scheduler2, q8n q8nVar, caq caqVar, poj0 poj0Var) {
        this.a = ut71Var;
        this.b = flowable;
        this.c = scheduler;
        this.d = scheduler2;
        this.e = q8nVar;
        this.f = caqVar;
        this.g = poj0Var;
        Context applicationContext = context.getApplicationContext();
        this.h = applicationContext;
        this.i = ut71Var.c(applicationContext);
    }

    public final Single a() {
        return b().flatMap(new z8c0(this, (byte) 23)).observeOn(this.d);
    }

    public final Single b() {
        return this.b.x(xi20.R0).J(yi20.P0).x(zi20.N0).z().subscribeOn(this.c).observeOn(this.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar, boolean z) {
        a3o0 a3o0Var;
        if (onmVar instanceof a3o0) {
            a3o0Var = (a3o0) onmVar;
            int i = a3o0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a3o0Var.d = i - Integer.MIN_VALUE;
            } else {
                a3o0Var = new a3o0(this, onmVar);
            }
        } else {
            a3o0Var = new a3o0(this, onmVar);
        }
        Object obj = a3o0Var.b;
        int i2 = a3o0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            nbc nbcVar = bma1.b;
            l0o1.k(this.i, nbcVar.k("key_nearby_devices_permissions_count_app_scope"), nbcVar.k("key_nearby_devices_permissions_sdk37_counter_reset_app_scope"), nbcVar.k("key_nearby_devices_permissions_last_known_sdk_version_app_scope"));
            if (z) {
                a3o0Var.a = str;
                a3o0Var.d = 1;
                Object objA = this.g.A(str, a3o0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = a3o0Var.a;
            hm5.M(obj);
        }
        dma1 dma1VarB = this.a.b(this.h, str);
        nbc nbcVar2 = bma1.b;
        l0o1.k(dma1VarB, nbcVar2.n("key_tap_bt_permissions_count"), nbcVar2.n("key_bt_permissions_sdk37_counter_reset"), nbcVar2.n("key_bt_permissions_last_known_sdk_version"));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:29:0x0077, B:31:0x009a, B:30:0x0086), top: B:40:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0086 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:29:0x0077, B:31:0x009a, B:30:0x0086), top: B:40:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar, boolean z) throws Throwable {
        b3o0 b3o0Var;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        String str2;
        boolean z2;
        int iL;
        if (onmVar instanceof b3o0) {
            b3o0Var = (b3o0) onmVar;
            int i2 = b3o0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b3o0Var.g = i2 - Integer.MIN_VALUE;
            } else {
                b3o0Var = new b3o0(this, onmVar);
            }
        } else {
            b3o0Var = new b3o0(this, onmVar);
        }
        Object obj = b3o0Var.e;
        int i3 = b3o0Var.g;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                b3o0Var.a = str;
                xgn0 xgn0Var = j;
                b3o0Var.b = xgn0Var;
                b3o0Var.c = z;
                b3o0Var.d = 0;
                b3o0Var.g = 1;
                if (xgn0Var.a(b3o0Var) != d9nVar) {
                    vgn0Var = xgn0Var;
                    i = 0;
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = b3o0Var.c;
                vgn0Var2 = b3o0Var.b;
                str2 = b3o0Var.a;
                try {
                    hm5.M(obj);
                    if (z2) {
                        iL = this.i.l(bma1.b.k("key_nearby_devices_permissions_count_app_scope"), 0);
                    } else {
                        iL = this.a.b(this.h, str2).l(bma1.b.n("key_tap_bt_permissions_count"), 0);
                    }
                    Integer numP = yah0.p(iL);
                    vgn0Var2.c(null);
                    return numP;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c(null);
                    throw th;
                }
            }
            int i4 = b3o0Var.d;
            z = b3o0Var.c;
            vgn0Var = b3o0Var.b;
            String str3 = b3o0Var.a;
            hm5.M(obj);
            i = i4;
            str = str3;
            b3o0Var.a = str;
            b3o0Var.b = vgn0Var;
            b3o0Var.c = z;
            b3o0Var.d = i;
            b3o0Var.g = 2;
            if (c(str, b3o0Var, z) != d9nVar) {
                str2 = str;
                z2 = z;
                vgn0Var2 = vgn0Var;
                if (z2) {
                    iL = this.i.l(bma1.b.k("key_nearby_devices_permissions_count_app_scope"), 0);
                } else {
                    iL = this.a.b(this.h, str2).l(bma1.b.n("key_tap_bt_permissions_count"), 0);
                }
                Integer numP2 = yah0.p(iL);
                vgn0Var2.c(null);
                return numP2;
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c(null);
            throw th;
        }
    }
}
