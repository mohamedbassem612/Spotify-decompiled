package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iod0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iod0(ArrayList arrayList, ArrayList arrayList2, byte b) {
        super(1);
        this.a = b;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.b;
        int i = 0;
        switch (b) {
            case 0:
                qv00 qv00Var = (qv00) obj;
                qv00Var.b(j6k.class, arrayList2, false);
                qv00Var.b(lhe0.class, arrayList2, false);
                qv00Var.b(jo70.class, arrayList, false);
                qv00Var.b(xkk1.class, arrayList, false);
                break;
            default:
                DrawScope drawScope = (DrawScope) obj;
                char c = ' ';
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 0.03f;
                float fE = ktd.e(fIntBitsToFloat, 12.0f, Float.intBitsToFloat((int) (drawScope.j() >> 32)), 13.0f);
                float f = 0.45f * fE;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                while (i < 13) {
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * ((Number) arrayList2.get(i)).floatValue();
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fIntBitsToFloat2;
                    char c2 = c;
                    DrawScope.g0(drawScope, ((u7h) arrayList.get(i)).a, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (Float.floatToRawIntBits((fE + fIntBitsToFloat) * i) << c2), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fE) << c2), jFloatToRawIntBits, (DrawStyle) null, 0.0f, 0, 240);
                    i++;
                    fIntBitsToFloat = fIntBitsToFloat;
                    rih1Var = rih1Var;
                    c = c2;
                }
                break;
        }
        return rih1Var;
    }
}
