package p;

import android.companion.virtual.VirtualDeviceManager;
import android.companion.virtual.VirtualDeviceManager$VirtualDeviceListener;
import android.content.Context;
import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qkx0 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q8n c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkx0(q8n q8nVar, Context context, lnm lnmVar) {
        super(2, lnmVar);
        this.c = q8nVar;
        this.d = context;
    }

    public static final void e(ssw0 ssw0Var, Context context) {
        ssw0Var.l(Boolean.valueOf(rkx0.e(context)));
    }

    public static final void g(VirtualDeviceManager virtualDeviceManager, pkx0 pkx0Var, DisplayManager displayManager, okx0 okx0Var) {
        virtualDeviceManager.unregisterVirtualDeviceListener(pkx0Var);
        displayManager.unregisterDisplayListener(okx0Var);
    }

    public final lnm create(Object obj, lnm lnmVar) {
        qkx0 qkx0Var = new qkx0(this.c, this.d, lnmVar);
        qkx0Var.b = obj;
        return qkx0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            ssw0 ssw0Var = (ssw0) this.b;
            q8n q8nVarL = f6o1.l(this.c, q8n.b);
            if (q8nVarL == null) {
                hhg1.n("CoroutineContext must contain a CoroutineDispatcher.");
                return null;
            }
            Context context = this.d;
            VirtualDeviceManager$VirtualDeviceListener pkx0Var = new pkx0(ssw0Var, context);
            DisplayManager.DisplayListener okx0Var = new okx0(ssw0Var, context);
            ssw0Var.l(Boolean.valueOf(rkx0.e(context)));
            VirtualDeviceManager virtualDeviceManagerE = qpp0.e(context.getSystemService(qpp0.m()));
            virtualDeviceManagerE.registerVirtualDeviceListener(qgo1.l(q8nVarL), pkx0Var);
            DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
            displayManager.registerDisplayListener(qgo1.l(q8nVarL), 7L, okx0Var);
            qd4 qd4Var = new qd4(virtualDeviceManagerE, pkx0Var, displayManager, okx0Var, (byte) 5);
            this.a = true;
            Object objS = jch0.s(ssw0Var, qd4Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
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
}
