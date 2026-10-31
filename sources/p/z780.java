package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z780 extends a8d1 implements vu30 {
    public ArrayList a;
    public u011 b;
    public byte c;
    public final /* synthetic */ b880 d;
    public final /* synthetic */ t45 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z780(b880 b880Var, t45 t45Var, String str, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.d = b880Var;
        this.e = t45Var;
        this.f = str;
        this.g = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new z780(this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        z780 z780Var;
        u011 u011Var;
        ArrayList arrayList;
        b880 b880Var = this.d;
        ae5 ae5Var = b880Var.d;
        byte b = this.c;
        String str = this.f;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                t45 t45Var = this.e;
                this.c = (byte) 1;
                obj = b880Var.d(t45Var, this);
                if (obj == d9nVar) {
                }
                return d9nVar;
            }
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u011Var = this.b;
                arrayList = this.a;
                hm5.M(obj);
                z780Var = this;
            }
            return b880Var.c(str, b880Var.b(u011Var, (String) obj), arrayList, z780Var.g);
            List list = (List) obj;
            if (list.isEmpty()) {
                ae5Var.d(2, str);
                return new WidgetState.TapToReload(str);
            }
            ArrayList arrayList2 = new ArrayList(list);
            u011 u011Var2 = (u011) arrayList2.remove(0);
            String str2 = this.f;
            String str3 = u011Var2.c;
            String string = u011Var2.e.toString();
            String strH = b880Var.f.h(u011Var2.c);
            t45 t45Var2 = this.e;
            this.a = arrayList2;
            this.b = u011Var2;
            this.c = (byte) 2;
            z780Var = this;
            Object objA = b880Var.a(str2, str3, string, strH, t45Var2, z780Var);
            if (objA != d9nVar) {
                u011Var = u011Var2;
                arrayList = arrayList2;
                obj = objA;
                return b880Var.c(str, b880Var.b(u011Var, (String) obj), arrayList, z780Var.g);
            }
            return d9nVar;
        } catch (Throwable th) {
            Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
            ae5Var.e(str, 2, th);
            throw th;
        }
    }
}
