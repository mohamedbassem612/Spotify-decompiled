package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f4o extends a8d1 implements dv30 {
    public List a;
    public String b;
    public boolean c;
    public /* synthetic */ List d;
    public /* synthetic */ String e;
    public /* synthetic */ List f;
    public /* synthetic */ boolean g;
    public /* synthetic */ boolean h;
    public final /* synthetic */ m4o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4o(m4o m4oVar, lnm lnmVar) {
        super(6, lnmVar);
        this.i = m4oVar;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        f4o f4oVar = new f4o(this.i, (lnm) obj6);
        f4oVar.d = (List) obj;
        f4oVar.e = (String) obj2;
        f4oVar.f = (List) obj3;
        f4oVar.g = zBooleanValue;
        f4oVar.h = zBooleanValue2;
        return f4oVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        List list = this.d;
        String str = this.e;
        List list2 = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        boolean z3 = this.c;
        if (!z3) {
            hm5.M(obj);
            this.d = null;
            this.e = null;
            this.f = null;
            this.a = list;
            this.b = str;
            this.g = z;
            this.h = z2;
            this.c = true;
            obj = this.i.f(str, list2, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.b;
            list = this.a;
            hm5.M(obj);
        }
        return new e4o(list, str, (List) obj, z, z2, false);
    }
}
