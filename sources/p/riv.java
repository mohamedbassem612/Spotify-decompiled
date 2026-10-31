package p;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class riv extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ hab0 g;
    public final /* synthetic */ hab0 h;
    public final /* synthetic */ cv30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public riv(ucp0 ucp0Var, ucp0 ucp0Var2, ucp0 ucp0Var3, ucp0 ucp0Var4, ucp0 ucp0Var5, ucp0 ucp0Var6, ucp0 ucp0Var7, ucp0 ucp0Var8, ucp0 ucp0Var9, ucp0 ucp0Var10, ucp0 ucp0Var11) {
        super(0);
        this.b = ucp0Var;
        this.c = ucp0Var2;
        this.d = ucp0Var3;
        this.e = ucp0Var4;
        this.f = ucp0Var5;
        this.g = ucp0Var6;
        this.h = ucp0Var8;
        this.i = ucp0Var9;
    }

    public final Object invoke() {
        byte b = this.a;
        ucp0 ucp0Var = this.i;
        ucp0 ucp0Var2 = this.h;
        ucp0 ucp0Var3 = this.g;
        ucp0 ucp0Var4 = this.f;
        Object obj = this.e;
        ucp0 ucp0Var5 = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                teb tebVar = (teb) obj3;
                lvc1 lvc1Var = (lvc1) obj2;
                teb.d(tebVar, lvc1Var, (ArrayList) ucp0Var5, (fai0) obj, (String) ucp0Var4, (f2t) ucp0Var3, (qwc1) ucp0Var2);
                teb.a(tebVar, lvc1Var, (iu30) ucp0Var);
                return rih1.a;
            default:
                return h1p1.j(new h310((kly0) ((ucp0) obj3).invoke(), (kly0) ((ucp0) obj2).invoke(), (kly0) ucp0Var5.invoke(), (kly0) ((ucp0) obj).invoke(), (kly0) ucp0Var4.invoke(), (kly0) ucp0Var3.invoke(), (kly0) ucp0Var2.invoke(), (kly0) ucp0Var.invoke()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public riv(teb tebVar, lvc1 lvc1Var, ArrayList arrayList, fai0 fai0Var, String str, f2t f2tVar, qwc1 qwc1Var, iu30 iu30Var) {
        super(0);
        this.b = tebVar;
        this.c = lvc1Var;
        this.d = arrayList;
        this.e = fai0Var;
        this.f = str;
        this.g = f2tVar;
        this.h = qwc1Var;
        this.i = iu30Var;
    }
}
