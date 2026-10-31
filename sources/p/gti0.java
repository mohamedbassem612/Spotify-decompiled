package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gti0 implements vu30 {
    public final /* synthetic */ vu30 a;
    public final /* synthetic */ wsi0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ j2i d;

    public gti0(vu30 vu30Var, wsi0 wsi0Var, boolean z, j2i j2iVar) {
        this.a = vu30Var;
        this.b = wsi0Var;
        this.c = z;
        this.d = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.c;
            wsi0 wsi0Var = this.b;
            vu30 vu30Var = this.a;
            if (vu30Var != null) {
                x340Var2.i0(-864613220);
                mod.b(p3d1.o(z ? wsi0Var.b : wsi0Var.e, wrl.a), apo.r(1241781204, new bi3(vu30Var, (byte) 2), x340Var2), x340Var2, 56);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-864293207);
                x340Var2.r(false);
            }
            mod.b(p3d1.o(z ? wsi0Var.a : wsi0Var.d, wrl.a), apo.r(-893579015, new ei3(vu30Var, this.d, (byte) 2), x340Var2), x340Var2, 56);
            x340Var2.i0(-863072055);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
