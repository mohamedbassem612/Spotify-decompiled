package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q4h1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4h1(t4h1 t4h1Var, byte b) {
        super(0);
        this.a = b;
        this.b = t4h1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        t4h1 t4h1Var = this.b;
        switch (b) {
            case 0:
                azb azbVar = (azb) t4h1Var.a.b.getValue();
                if (((Boolean) t4h1Var.e.getValue()).booleanValue() && !(azbVar instanceof wyb) && !(azbVar instanceof vyb) && !((Boolean) t4h1Var.f.getValue()).booleanValue() && !((Boolean) t4h1Var.d.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                mdt mdtVar = t4h1Var.u;
                r4h1 r4h1Var = t4h1Var.w;
                if (!((Boolean) mdtVar.getValue()).booleanValue() && !((Boolean) t4h1Var.d.getValue()).booleanValue() && !((Boolean) t4h1Var.f.getValue()).booleanValue() && (!((Boolean) ((mdt) r4h1Var.e).getValue()).booleanValue() || ((Boolean) ((hrr0) r4h1Var.f).getValue()).booleanValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (((Boolean) t4h1Var.u.getValue()).booleanValue() && !((Boolean) t4h1Var.d.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                if (!((Boolean) t4h1Var.u.getValue()).booleanValue() && !((Boolean) t4h1Var.d.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return Boolean.valueOf(!((Boolean) t4h1Var.d.getValue()).booleanValue());
            case 5:
                return (Boolean) t4h1Var.d.getValue();
            case 6:
                return (Boolean) t4h1Var.d.getValue();
            case 7:
                return Boolean.valueOf(((Boolean) t4h1Var.h.getValue()).booleanValue() || ((Boolean) t4h1Var.i.getValue()).booleanValue());
            case 8:
                return Boolean.valueOf(!((Boolean) t4h1Var.d.getValue()).booleanValue());
            case 9:
                return (Boolean) t4h1Var.d.getValue();
            case 10:
                if (!((Boolean) t4h1Var.d.getValue()).booleanValue() && !((Boolean) t4h1Var.f.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                return Boolean.valueOf(((Boolean) ((hrr0) t4h1Var.j.a).getValue()).booleanValue() || ((Boolean) ((hrr0) t4h1Var.k.a).getValue()).booleanValue());
            case 12:
                if (!((Boolean) t4h1Var.d.getValue()).booleanValue() && !((Boolean) t4h1Var.f.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                azb azbVar2 = (azb) t4h1Var.a.b.getValue();
                return Boolean.valueOf((azbVar2 instanceof zyb) || (azbVar2 instanceof syb) || (azbVar2 instanceof tyb) || (azbVar2 instanceof uyb) || (azbVar2 instanceof wyb) || (azbVar2 instanceof vyb));
        }
    }
}
