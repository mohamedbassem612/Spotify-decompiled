package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hi00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goq b;
    public final /* synthetic */ y11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi00(goq goqVar, y11 y11Var, byte b) {
        super(1);
        this.a = b;
        this.b = goqVar;
        this.c = y11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mg00 mg00Var = mg00.a;
        goq goqVar = this.b;
        y11 y11Var = this.c;
        switch (b) {
            case 0:
                tt80 tt80Var = tt80.f;
                uny unyVar = (uny) goqVar.g;
                int iOrdinal = ((g920) obj).ordinal();
                og00 og00Var = og00.a;
                ng00 ng00Var = ng00.a;
                switch (iOrdinal) {
                    case 0:
                        y11Var.accept(new yg00(null, ((uny) goqVar.g).z(new eu80("header-change-location-button")).a));
                        return rih1Var;
                    case 1:
                        unyVar.z(tt80Var);
                        y11Var.accept(mg00Var);
                        y11Var.accept(og00Var);
                        y11Var.accept(ng00Var);
                        return rih1Var;
                    case 2:
                        y11Var.accept(new yg00("browse", unyVar.z(tt80.e).a));
                        return rih1Var;
                    case 3:
                        unyVar.z(tt80Var);
                        y11Var.accept(mg00Var);
                        return rih1Var;
                    case 4:
                        unyVar.z(tt80.h);
                        y11Var.accept(vg00.a);
                        return rih1Var;
                    case 5:
                        y11Var.accept(og00Var);
                        return rih1Var;
                    case 6:
                        unyVar.z(tt80.g);
                        y11Var.accept(sg00.a);
                        return rih1Var;
                    case 7:
                        y11Var.accept(ng00Var);
                        return rih1Var;
                    default:
                        eg.o();
                        return null;
                }
            default:
                mod0 mod0Var = (mod0) obj;
                uny unyVar2 = (uny) goqVar.g;
                if (mod0Var.equals(kod0.e)) {
                    y11Var.accept(new yg00(null, ((uny) goqVar.g).z(new eu80("header-change-location-button")).a));
                    return rih1Var;
                }
                if (mod0Var.equals(kod0.a)) {
                    unyVar2.z(tt80.d);
                    y11Var.accept(kg00.a);
                    return rih1Var;
                }
                if (mod0Var.equals(kod0.f)) {
                    y11Var.accept(new bh00(unyVar2.z(new gu80())));
                    return rih1Var;
                }
                if (mod0Var instanceof lod0) {
                    boolean z = ((lod0) mod0Var).a;
                    y11Var.accept(new ih00(z ? unyVar2.z(new ju80(2, 1)) : unyVar2.z(new ju80(1, 2)), z));
                    return rih1Var;
                }
                if (mod0Var.equals(kod0.b)) {
                    y11Var.accept(new yg00("browse", unyVar2.z(tt80.e).a));
                    return rih1Var;
                }
                if (mod0Var.equals(kod0.d)) {
                    pod0 pod0Var = (pod0) goqVar.h;
                    y11Var.accept(new yg00(null, unyVar2.z(new eu80((pod0Var != null ? pod0Var.c : 0) == 2 ? "header-change-location-warning-button" : "header-change-location-button")).a));
                    return rih1Var;
                }
                if (!mod0Var.equals(kod0.c)) {
                    eg.o();
                    return null;
                }
                unyVar2.z(tt80.f);
                y11Var.accept(mg00Var);
                return rih1Var;
        }
    }
}
