package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dio extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ asn c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ tv80 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dio(asn asnVar, String str, Function0 function0, iu30 iu30Var, tv80 tv80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = asnVar;
        this.d = str;
        this.e = function0;
        this.f = iu30Var;
        this.g = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new dio(this.c, this.d, this.e, this.f, this.g, lnmVar, (byte) 0);
            default:
                return new dio(this.c, this.d, this.e, this.f, this.g, lnmVar, (byte) 1);
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

    public final Object invokeSuspend(Object obj) {
        Object objB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                asn asnVar = this.c;
                if (!z) {
                    hm5.M(obj);
                    isc iscVar = (isc) asnVar.b;
                    this.b = true;
                    objB = iscVar.b(this.d, this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                kt91 kt91Var = (kt91) asnVar.a;
                Function0 function0 = this.e;
                if (!zBooleanValue) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954759});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131954759, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    function0.invoke();
                    return rih1Var;
                }
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954760});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131954760, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                function0.invoke();
                this.f.invoke(this.g);
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                geo0 geo0Var = geo0.b;
                dio dioVar = new dio(this.c, this.d, this.e, this.f, this.g, null, (byte) 0);
                this.b = true;
                return fn31.Y(geo0Var, dioVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
