package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jvg extends a8d1 implements vu30 {
    public long a;
    public ovg b;
    public List c;
    public int d;
    public boolean e;
    public final /* synthetic */ ovg f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvg(ovg ovgVar, Context context, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.f = ovgVar;
        this.g = context;
        this.h = list;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new jvg(this.f, this.g, this.h, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((jvg) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        List list;
        ovg ovgVar;
        int i;
        d9n d9nVar = d9n.a;
        boolean z = this.e;
        if (!z) {
            hm5.M(obj);
            String str = ovg.m;
            String strM = l1d.m("***Debug current thread: ", Thread.currentThread().getName());
            utw0 utw0Var = ike1.a;
            utw0Var.y(str);
            utw0Var.o(strM, new Object[0]);
            jCurrentTimeMillis = System.currentTimeMillis();
            ovg ovgVar2 = this.f;
            Context context = this.g;
            List list2 = this.h;
            String packageName = context.getPackageName();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!u890.j(((ComponentName) obj2).getPackageName(), packageName)) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                ComponentName componentName = (ComponentName) obj3;
                ServiceConnection serviceConnectionG = ovgVar2.b.g(componentName.getPackageName());
                Intent intent = new Intent();
                intent.setComponent(componentName);
                intent.setAction("com.ravelin.core.SERVICE_DEVICE_ACTION");
                try {
                    context.bindService(intent, serviceConnectionG, 9);
                } catch (SecurityException e) {
                    String str2 = ovg.m;
                    String strH = gvg.h("Failed binding service for ", componentName.getPackageName(), ": ", e.getMessage());
                    utw0 utw0Var2 = ike1.a;
                    utw0Var2.y(str2);
                    utw0Var2.A(strH, new Object[0]);
                }
            }
            list = this.h;
            ovgVar = this.f;
            String str3 = ovg.m;
            String strE = gvg.e(list.size() - 1, "***Debug binding services for ", " components");
            utw0 utw0Var3 = ike1.a;
            utw0Var3.y(str3);
            utw0Var3.o(strE, new Object[0]);
            i = 0;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.d;
            jCurrentTimeMillis = this.a;
            list = this.c;
            ovgVar = this.b;
            hm5.M(obj);
        }
        while (ovgVar.b.a() < list.size() - 1) {
            this.b = ovgVar;
            this.c = list;
            this.a = jCurrentTimeMillis;
            this.d = i;
            this.e = true;
            if (hap1.i(20L, this) == d9nVar) {
                return d9nVar;
            }
        }
        ovg ovgVar3 = this.f;
        ovgVar3.h = ovgVar3.b.a();
        String str4 = ovg.m;
        String strF = gvg.f(System.currentTimeMillis() - jCurrentTimeMillis, "***Debug binding process took: ", " ms");
        utw0 utw0Var4 = ike1.a;
        utw0Var4.y(str4);
        utw0Var4.o(strF, new Object[0]);
        return rih1.a;
    }
}
