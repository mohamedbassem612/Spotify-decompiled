package p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bza extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bza(Function0 function0, float f, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4) {
        super(1);
        this.c = function0;
        this.b = f;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
        this.g = ven0Var4;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                u84 u84VarP = lslVar.a1().p();
                Canvas canvas = v84.a;
                Canvas canvas2 = u84VarP.a;
                tw4 tw4Var = (tw4) obj5;
                Paint paint = (Paint) obj3;
                canvas2.save();
                canvas2.clipPath(tw4Var.a);
                Path path = ((tw4) obj6).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
                }
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, fIntBitsToFloat, o7h.k1(arrayList), (float[]) null, Shader.TileMode.CLAMP));
                canvas2.drawPath(path, paint);
                canvas2.restore();
                DrawScope.j1(lslVar, tw4Var, (mic0) obj4, 0.0f, new phc1(this.b, 0.0f, 1, 1, (uw4) null, 18), 52);
                break;
            case 1:
                e261 e261Var = (e261) obj;
                b261.B(e261Var, (String) obj5);
                b261.n(e261Var, (String) obj6);
                String str = (String) obj4;
                b261.A(e261Var, str);
                b261.w(e261Var, (vfx0) obj3);
                b261.G(e261Var, f);
                e261Var.b(m161.i, new we(str, new d7v((ven0) obj2, (byte) 1)));
                break;
            default:
                long j = ((Offset) obj).a;
                ven0 ven0Var = (ven0) obj6;
                Function0 function0 = (Function0) obj5;
                if (function0 != null) {
                    function0.invoke();
                }
                ll10 ll10Var = (ll10) ven0Var.getValue();
                float fIntValue = ((Number) ((ven0) obj4).getValue()).intValue() - f;
                if (fIntValue < 0.0f) {
                    fIntValue = 0.0f;
                }
                float f2 = fIntValue * ll10Var.c;
                ((ven0) obj3).setValue(new v3v(f2, 0.0f));
                ((iu30) ((ven0) obj2).getValue()).invoke(ll10.a((ll10) ven0Var.getValue(), false, true, 0.0f, f2, 0, 0L, 53));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bza(String str, String str2, String str3, vfx0 vfx0Var, float f, ven0 ven0Var) {
        super(1);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = vfx0Var;
        this.b = f;
        this.g = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bza(tw4 tw4Var, mic0 mic0Var, float f, tw4 tw4Var2, Paint paint, List list) {
        super(1);
        this.c = tw4Var;
        this.e = mic0Var;
        this.b = f;
        this.d = tw4Var2;
        this.f = paint;
        this.g = list;
    }
}
