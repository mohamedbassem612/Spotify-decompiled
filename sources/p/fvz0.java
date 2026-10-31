package p;

import android.content.Context;
import com.ravelin.core.model.DeviceId;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fvz0 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pvz0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;
    public final /* synthetic */ List f;
    public final /* synthetic */ Boolean g;
    public final /* synthetic */ Long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvz0(pvz0 pvz0Var, Context context, String str, List list, Boolean bool, Long l, lnm lnmVar) {
        super(2, lnmVar);
        this.c = pvz0Var;
        this.d = context;
        this.e = str;
        this.f = list;
        this.g = bool;
        this.h = l;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        fvz0 fvz0Var = new fvz0(this.c, this.d, this.e, this.f, this.g, this.h, lnmVar);
        fvz0Var.b = obj;
        return fvz0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar;
        c9n c9nVar2;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            c9nVar = (c9n) this.b;
            try {
                lvg lvgVarA = this.c.a();
                Context context = this.d;
                String str = this.e;
                z6x z6xVar = this.f;
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                Boolean bool = this.g;
                Long l = this.h;
                this.b = c9nVar;
                this.a = true;
                Object objH = lvgVarA.h(context, str, z6xVar, bool, l, this);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
                obj = objH;
                c9nVar2 = c9nVar;
            } catch (Exception unused) {
                op71.x(c9nVar.J());
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9nVar2 = (c9n) this.b;
            try {
                hm5.M(obj);
            } catch (Exception unused2) {
                c9nVar = c9nVar2;
                op71.x(c9nVar.J());
            }
        }
        DeviceId deviceId = (DeviceId) obj;
        String str2 = pvz0.o;
        utw0 utw0Var = ike1.a;
        utw0Var.y(str2);
        utw0Var.o("***Debug unblocking path fromDevice = " + deviceId, new Object[0]);
        if (deviceId != null) {
            DeviceId.INSTANCE.lpt2(deviceId);
        }
        return rih1.a;
    }
}
