package p;

import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes14.dex */
public final class tv implements Predicate {
    public static final tv a = new tv();

    public static lw a(rw rwVar) {
        String strI = rwVar.i();
        of8 of8Var = new of8(strI, qr.b(rwVar.b()));
        ow owVarH = rwVar.h();
        return new lw(new di8(strI, owVarH != null ? new wd(owVarH.c(), owVarH.b(), owVarH.a()) : null, of8Var), rwVar.d(), rwVar.c(), rwVar.a(), rwVar.g(), rwVar.f(), rwVar.e());
    }

    public static rw b(lw lwVar) {
        di8 di8VarB = lwVar.b();
        of8 of8Var = di8VarB.c;
        if (of8Var == null) {
            of8Var = null;
        }
        byte[] bArr = of8Var != null ? of8Var.b : null;
        if (bArr == null) {
            return null;
        }
        String strA = qr.a(bArr);
        String str = di8VarB.a;
        wd wdVar = di8VarB.b;
        return new rw(str, strA, wdVar != null ? new ow(wdVar.a, wdVar.b, wdVar.c) : null, lwVar.e(), lwVar.d(), lwVar.c(), lwVar.h(), lwVar.g(), lwVar.f());
    }

    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }
}
