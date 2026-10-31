package p;

import androidx.compose.ui.geometry.Offset;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kzm extends hab0 implements iu30 {
    public final /* synthetic */ ss50 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ yym a;
    public final /* synthetic */ gb5 b;
    public final /* synthetic */ o4w c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ c380 i;
    public final /* synthetic */ drr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzm(yym yymVar, gb5 gb5Var, o4w o4wVar, int i, float f, float f2, float f3, iu30 iu30Var, c380 c380Var, drr0 drr0Var, ss50 ss50Var, boolean z) {
        super(1);
        this.a = yymVar;
        this.b = gb5Var;
        this.c = o4wVar;
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = iu30Var;
        this.i = c380Var;
        this.t = drr0Var;
        this.X = ss50Var;
        this.Y = z;
    }

    public final Object invoke(Object obj) {
        long j = ((Offset) obj).a;
        gb5 gb5Var = this.b;
        o4w o4wVarA = gb5Var.a();
        if (o4wVarA == null) {
            o4wVarA = this.c;
        }
        o4w o4wVarA2 = this.a.a(o4wVarA, this.d, j, this.e, this.f, this.g);
        List list = o4wVarA2.a;
        gb5Var.d(o4wVarA2);
        int i = this.d;
        this.h.invoke(new Offset(((xz3) list.get(i)).a));
        c380 c380Var = this.i;
        boolean zIsEmpty = c380Var.isEmpty();
        sct0 sct0Var = this.X;
        if (!zIsEmpty) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (((xz3) list.get(i)).a >> 32));
            drr0 drr0Var = this.t;
            float fS = drr0Var.s();
            if (!Float.isNaN(fS) && !c380Var.isEmpty() && fS != fIntBitsToFloat) {
                float fMin = Math.min(fS, fIntBitsToFloat);
                float fMax = Math.max(fS, fIntBitsToFloat);
                if (!c380Var.isEmpty()) {
                    Iterator it = c380Var.iterator();
                    while (it.hasNext()) {
                        float fFloatValue = ((Number) it.next()).floatValue();
                        if (fFloatValue > fMin && fFloatValue < fMax) {
                            sct0Var.a(9);
                            break;
                        }
                    }
                }
            }
            drr0Var.t(fIntBitsToFloat);
        }
        if (this.Y) {
            if (this.a.b(Float.intBitsToFloat((int) (((xz3) list.get(i)).a & 4294967295L)), this.g)) {
                sct0Var.a(9);
            }
        }
        return rih1.a;
    }
}
