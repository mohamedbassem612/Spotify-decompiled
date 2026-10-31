package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r35 {
    public final fo71 a;
    public final vnr b;
    public final q8n c;

    public r35(fo71 fo71Var, vnr vnrVar, q8n q8nVar) {
        this.a = fo71Var;
        this.b = vnrVar;
        this.c = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(Context context, p371 p371Var, String str, String str2, String str3, String str4, onm onmVar) {
        p35 p35Var;
        String str5;
        String str6;
        String str7;
        Context context2;
        String str8;
        p371 p371Var2;
        if (onmVar instanceof p35) {
            p35Var = (p35) onmVar;
            int i = p35Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                p35Var.i = i - Integer.MIN_VALUE;
            } else {
                p35Var = new p35(this, onmVar);
            }
        } else {
            p35Var = new p35(this, onmVar);
        }
        p35 p35Var2 = p35Var;
        Object obj = p35Var2.g;
        int i2 = p35Var2.i;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            String strD = p371Var.d();
            String strB = p371Var.b();
            dqi1 dqi1VarF = p371Var.f();
            go71 go71Var = new go71(strD, strB, dqi1VarF != null ? dqi1VarF.a() : null, p371Var.e(), z471.d.getValue(), (ujc0) null);
            p35Var2.a = context;
            p35Var2.b = p371Var;
            str5 = str;
            p35Var2.c = str5;
            str6 = str2;
            p35Var2.d = str6;
            str7 = str3;
            p35Var2.e = str7;
            p35Var2.f = str4;
            p35Var2.i = 1;
            Object objA = this.a.a(go71Var, p35Var2);
            if (objA != d9nVar) {
                context2 = context;
                obj = objA;
                str8 = str4;
                p371Var2 = p371Var;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str9 = p35Var2.f;
        String str10 = p35Var2.e;
        String str11 = p35Var2.d;
        String str12 = p35Var2.c;
        p371 p371Var3 = p35Var2.b;
        Context context3 = p35Var2.a;
        hm5.M(obj);
        str7 = str10;
        p371Var2 = p371Var3;
        str6 = str11;
        str5 = str12;
        str8 = str9;
        context2 = context3;
        q35 q35Var = new q35(this, (yn71) obj, p371Var2, str5, str6, str7, (z771) null, str8, context2, (lnm) null);
        p35Var2.a = null;
        p35Var2.b = null;
        p35Var2.c = null;
        p35Var2.d = null;
        p35Var2.e = null;
        p35Var2.f = null;
        p35Var2.i = 2;
        Object objH = c921.H(this.c, q35Var, p35Var2);
        return objH == d9nVar ? d9nVar : objH;
    }
}
