package p;

import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ef5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lee1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef5(lee1 lee1Var, byte b) {
        super(1);
        this.a = b;
        this.b = lee1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lee1 lee1Var = this.b;
        switch (b) {
            case 0:
                ze5 ze5Var = (ze5) obj;
                Object obj2 = ze5Var.a;
                zma1 zma1Var = obj2 instanceof zma1 ? (zma1) obj2 : null;
                if (!u890.j(zma1Var != null ? zma1Var.c : null, FontWeight.Z)) {
                    return ze5Var;
                }
                zma1 zma1Var2 = lee1Var.a;
                return ze5.a(ze5Var, zma1.a((zma1) obj2, 0L, 0L, zma1Var2.c, zma1Var2.d, zma1Var2.f, 65491), 0, 0, 14);
            default:
                ze5 ze5Var2 = (ze5) obj;
                Object obj3 = ze5Var2.a;
                zma1 zma1Var3 = obj3 instanceof zma1 ? (zma1) obj3 : null;
                if (!u890.j(zma1Var3 != null ? zma1Var3.c : null, FontWeight.Z)) {
                    return ze5Var2;
                }
                zma1 zma1Var4 = lee1Var.a;
                return ze5.a(ze5Var2, zma1.a((zma1) obj3, 0L, 0L, zma1Var4.c, zma1Var4.d, zma1Var4.f, 65491), 0, 0, 14);
        }
    }
}
