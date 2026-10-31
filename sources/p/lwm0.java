package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lwm0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wdm b;

    public /* synthetic */ lwm0(wdm wdmVar, byte b) {
        this.a = b;
        this.b = wdmVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wdm wdmVar = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                r091 r091Var = (r091) wdmVar.X;
                if (zBooleanValue) {
                    if (r091Var != null) {
                        r091Var.c();
                    }
                } else if (r091Var != null) {
                    r091Var.k();
                }
                return rih1Var;
            case 1:
                bal1 bal1Var = (bal1) obj;
                if (bal1Var instanceof z9l1) {
                    r091 r091Var2 = (r091) wdmVar.X;
                    if (r091Var2 == null) {
                        return rih1Var;
                    }
                    r091Var2.d();
                    return rih1Var;
                }
                if (!u890.j(bal1Var, aal1.a)) {
                    eg.o();
                    return null;
                }
                r091 r091Var3 = (r091) wdmVar.X;
                if (r091Var3 == null || ebp1.r(r091Var3)) {
                    return rih1Var;
                }
                uwm0 uwm0Var = (uwm0) wdmVar.g;
                ny7 ny7Var = (ny7) wdmVar.h;
                if (ny7Var == null) {
                    u890.C("audioData");
                    throw null;
                }
                tv80 tv80VarA = uwm0Var.a(ny7Var.a.a(), new zem0(uwm0Var, (byte) 3));
                Long l = ((q9l1) wdmVar.c).f.b;
                Function0 function0 = (Function0) wdmVar.t;
                r091Var3.e(tv80VarA, l, function0 != null ? (String) function0.invoke() : null, mky0.a);
                return rih1Var;
            default:
                Float f = (Float) obj;
                r091 r091Var4 = (r091) wdmVar.X;
                if (r091Var4 != null) {
                    f.getClass();
                    float fFloatValue = f.floatValue();
                    w590 w590VarA = r091Var4.a();
                    if (w590VarA != null) {
                        w590VarA.t(fFloatValue);
                    }
                }
                return rih1Var;
        }
    }
}
