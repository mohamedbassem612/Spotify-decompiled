package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qna extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qna(byte b, long j, long j2) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = j2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        long j2 = this.c;
        switch (b) {
            case 0:
                return z590.a((z590) obj, null, false, null, false, 0L, this.b, 0.0f, this.c, null, 351);
            case 1:
                return z590.a((z590) obj, null, false, null, false, this.b, 0L, 0.0f, this.c, null, 109);
            case 2:
                return z590.a((z590) obj, null, false, new k091(g091.a), false, this.b, 0L, 0.0f, this.c, null, 363);
            case 3:
                return z590.a((z590) obj, null, false, new k091(d091.a), false, this.b, 0L, 0.0f, this.c, null, 363);
            case 4:
                return z590.a((z590) obj, null, false, null, false, this.b, 0L, 0.0f, this.c, null, 367);
            case 5:
                return z590.a((z590) obj, null, false, null, false, this.b, 0L, 0.0f, this.c, null, 367);
            case 6:
                bfo bfoVar = (bfo) obj;
                return Boolean.valueOf(bfoVar.c > 0 && bfoVar.d > j && bfoVar.b < j2);
            case 7:
                return new l4g1(((gxc) obj).a, this.b, this.c);
            case 8:
                sp21 sp21Var = (sp21) obj;
                sp21Var.i = Long.valueOf(j);
                Long l = sp21Var.n;
                sp21Var.n = Long.valueOf((l != null ? l.longValue() : 0L) + j2);
                sp21Var.o = Long.valueOf(j2);
                return rih1Var;
            case 9:
                return new l4g1(((gxc) obj).a, this.b, this.c);
            case 10:
                return new k4g1(((gxc) obj).a, this.b, this.c);
            case 11:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, true, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32745);
            case 12:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, true, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32649);
            case 13:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32713);
            case 14:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, true, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32649);
            case 15:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32697);
            case 16:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32761);
            case 17:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32761);
            case 18:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32761);
            case 19:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope.d0(drawScope, this.b, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                DrawScope.S0(drawScope, v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(this.c, 0.5f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(this.c, 0.75f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case 20:
                long j3 = ((uvg1) obj).c;
                return Boolean.valueOf(j <= j3 && j3 <= j2);
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                float f = hrt.f(drawScope2, 2.0f);
                long j4 = this.b;
                z520 z520Var = z520.a;
                DrawScope.b0(drawScope2, j4, f, 0L, 0.0f, z520Var, 108);
                DrawScope.b0(drawScope2, this.c, drawScope2.X0(3.0f), 0L, 0.0f, z520Var, 108);
                return rih1Var;
        }
    }
}
