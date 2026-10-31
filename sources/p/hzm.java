package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hzm extends hab0 implements iu30 {
    public final /* synthetic */ yym a;
    public final /* synthetic */ gb5 b;
    public final /* synthetic */ o4w c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ss50 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzm(yym yymVar, gb5 gb5Var, o4w o4wVar, int i, float f, float f2, float f3, iu30 iu30Var, boolean z, ss50 ss50Var) {
        super(1);
        this.a = yymVar;
        this.b = gb5Var;
        this.c = o4wVar;
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = iu30Var;
        this.i = z;
        this.t = ss50Var;
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
        if (this.i) {
            if (this.a.b(Float.intBitsToFloat((int) (((xz3) list.get(i)).a & 4294967295L)), this.g)) {
                this.t.a(9);
            }
        }
        return rih1.a;
    }
}
