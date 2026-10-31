package p;

import android.content.Intent;
import java.util.Set;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ff3 extends a8d1 implements xu30 {
    public bju a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte f;
    public /* synthetic */ Intent g;
    public /* synthetic */ th61 h;
    public final /* synthetic */ gf3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff3(gf3 gf3Var, lnm lnmVar) {
        super(3, lnmVar);
        this.i = gf3Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ff3 ff3Var = new ff3(this.i, (lnm) obj3);
        ff3Var.g = (Intent) obj;
        ff3Var.h = (th61) obj2;
        return ff3Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x010e  */
    public final Object invokeSuspend(Object obj) {
        bju bjuVarB;
        String str;
        long jE;
        Class cls;
        Object objA;
        String str2;
        String str3;
        Object objA2;
        String str4;
        String str5;
        String str6;
        String str7;
        gf3 gf3Var = this.i;
        s45 s45Var = gf3Var.d;
        ptk ptkVar = gf3Var.a;
        Intent intent = this.g;
        th61 th61Var = this.h;
        byte b = this.f;
        a6w0 a6w0Var = a6w0.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            bjuVarB = dgb.b(s45Var);
            bjuVarB.g();
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(intent.getDataString());
            String strE = s4b1VarX.E();
            if (strE == null) {
                strE = "";
            }
            String strD = s4b1VarX.d();
            str = th61Var.a;
            jE = s45Var.a.a.e();
            u961 u961Var = gf3Var.b;
            boolean z = ptkVar.d;
            cls = gc3.class;
            int i = ptkVar.c;
            this.g = null;
            this.h = null;
            this.a = bjuVarB;
            this.b = strE;
            this.c = strD;
            this.d = str;
            this.e = jE;
            this.f = (byte) 1;
            objA = u961Var.A(i, strE, this, z);
            if (objA != d9nVar) {
                str2 = strD;
                str3 = strE;
            }
            return d9nVar;
        }
        if (b == 1) {
            long j = this.e;
            String str8 = this.d;
            String str9 = this.c;
            str3 = this.b;
            bjuVarB = this.a;
            hm5.M(obj);
            objA = ((e331) obj).a;
            str2 = str9;
            cls = gc3.class;
            jE = j;
            str = str8;
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str10 = this.d;
            String str11 = this.c;
            String str12 = this.b;
            hm5.M(obj);
            str5 = str10;
            str4 = str11;
            str6 = str12;
            objA2 = obj;
            cls = gc3.class;
        }
        str7 = (String) objA2;
        if (str7 != null) {
            return new hrn0(u2w0.class, new w2w0(str6), a6w0Var);
        }
        return new hrn0(cls, new lc3(str6, str5, str4, str7, true), a6w0Var);
        Throwable thA = e331.a(objA);
        if (thA != null) {
            Class cls2 = cls;
            if (thA instanceof TimeoutCancellationException) {
                bjuVarB.i(ptkVar.c);
            } else {
                bjuVarB.b();
            }
            return new hrn0(cls2, new lc3(str3, str, str2), a6w0Var);
        }
        if (!((Boolean) objA).booleanValue()) {
            bjuVarB.h("album_page");
            return new hrn0(cls, new lc3(str3, str, str2), a6w0Var);
        }
        bjuVarB.h("prerelease_page");
        if (!ptkVar.e) {
            return new hrn0(u2w0.class, new w2w0(str3), a6w0Var);
        }
        long jE2 = ((long) ptkVar.c) - (s45Var.a.a.e() - jE);
        if (jE2 < 0) {
            jE2 = 0;
        }
        qd3 qd3Var = (qd3) gf3Var.c.get();
        this.g = null;
        this.h = null;
        this.a = null;
        this.b = str3;
        this.c = str2;
        this.d = str;
        this.e = jE;
        this.f = (byte) 2;
        objA2 = qd3Var.a(str3, (int) jE2, this);
        if (objA2 != d9nVar) {
            str4 = str2;
            str5 = str;
            str6 = str3;
            str7 = (String) objA2;
            if (str7 != null) {
                return new hrn0(u2w0.class, new w2w0(str6), a6w0Var);
            }
            return new hrn0(cls, new lc3(str6, str5, str4, str7, true), a6w0Var);
        }
        return d9nVar;
    }
}
