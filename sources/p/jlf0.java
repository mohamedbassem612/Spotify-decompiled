package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jlf0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ g3e0 b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jlf0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                jlf0 jlf0Var = new jlf0(i, (lnm) obj3, (byte) 0);
                jlf0Var.c = zBooleanValue;
                jlf0Var.b = (g3e0) obj2;
                return jlf0Var.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                jlf0 jlf0Var2 = new jlf0(i, (lnm) obj3, (byte) 1);
                jlf0Var2.b = (g3e0) obj;
                jlf0Var2.c = zBooleanValue2;
                return jlf0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        fef0 fef0Var;
        switch (this.a) {
            case 0:
                boolean z = this.c;
                g3e0 g3e0Var = this.b;
                hm5.M(obj);
                if (!(g3e0Var instanceof f3e0)) {
                    return new glf0();
                }
                f3e0 f3e0Var = (f3e0) g3e0Var;
                return new glf0(f3e0Var.b, f3e0Var.c, z ? new elf0(f3e0Var.a) : dlf0.a);
            default:
                g3e0 g3e0Var2 = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                if (z2) {
                    f3e0 f3e0Var2 = g3e0Var2 instanceof f3e0 ? (f3e0) g3e0Var2 : null;
                    a9h a9hVar = f3e0Var2 != null ? f3e0Var2.a : null;
                    List list = (a9hVar == null || (fef0Var = a9hVar.a) == null) ? null : fef0Var.i;
                    if (list == null) {
                        list = z6x.a;
                    }
                    if (a9hVar != null && !list.isEmpty()) {
                        fef0 fef0Var2 = a9hVar.a;
                        String str = fef0Var2.d;
                        String str2 = f3e0Var2.d;
                        return new t9p0(str, list, rqt0.A(fef0Var2, str2) ? str2 : null);
                    }
                }
                return u9p0.a;
        }
    }
}
