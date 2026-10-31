package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ws71 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xs71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ws71(xs71 xs71Var, byte b) {
        super(0);
        this.a = b;
        this.b = xs71Var;
    }

    public final Object invoke() {
        Object obj;
        byte b = this.a;
        xs71 xs71Var = this.b;
        switch (b) {
            case 0:
                boolean z = xs71Var.g;
                o95 o95Var = xs71Var.f;
                pv71 pv71Var = xs71Var.b;
                if (!z && pv71Var.c() && o95Var.f()) {
                    List listC = xs71Var.c();
                    int size = listC.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            obj = listC.get(i);
                            if (!((ys71) obj).o()) {
                                i++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ys71 ys71Var = (ys71) obj;
                    if (ys71Var != null) {
                        n8b1 n8b1Var = ys71Var.c().f;
                        if (n8b1Var instanceof n8b1) {
                            n8b1 n8b1Var2 = n8b1Var;
                            fn31.T(pv71Var.b, null, 0, new lm61(xs71Var, new n8b1(n8b1Var2.a, n8b1Var2.b, new Offset((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L))), (lnm) null, (byte) 17), 3);
                        }
                        xs71Var.g = true;
                    }
                }
                Offset offset = (Offset) o95Var.e();
                long j = offset.a;
                return offset;
            default:
                List listB = xs71Var.b();
                int size2 = listB.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ys71 ys71Var2 = (ys71) listB.get(i2);
                    if (ys71Var2.o() && ys71Var2.q()) {
                        return rih1.a;
                    }
                }
                return rih1.a;
        }
    }
}
