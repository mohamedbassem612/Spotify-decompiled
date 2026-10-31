package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pwv0 extends pim0 implements m7v {
    public static final long O0;
    public static final mic0 P0;
    public static final List Q0;

    static {
        Float fValueOf = Float.valueOf(0.55f);
        Float fValueOf2 = Float.valueOf(1.0f);
        O0 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
        List listM = p7h.M(new u7h[]{new u7h(z4p1.g(4289387698L)), new u7h(z4p1.g(4285515149L)), new u7h(z4p1.g(4284140929L)), new u7h(z4p1.g(4284530565L))});
        Float fValueOf3 = Float.valueOf(0.0f);
        P0 = new mic0(0, (((long) Float.floatToRawIntBits(0.33333334f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(0.6666667f)) & 4294967295L), listM, (List) null);
        mmr0[] mmr0VarArr = {new mmr0(fValueOf3, fValueOf2), new mmr0(Float.valueOf(0.13f), Float.valueOf(0.5f)), new mmr0(fValueOf, fValueOf3)};
        mmr0[] mmr0VarArr2 = {new mmr0(fValueOf3, fValueOf2), new mmr0(Float.valueOf(0.25f), fValueOf2), new mmr0(fValueOf, fValueOf3)};
        Q0 = p7h.M(new Brush[]{mod.q(z4p1.g(4286369954L), 0.9f, 0.92f, mmr0VarArr2), mod.q(z4p1.g(4285515149L), 0.12f, 0.9f, mmr0VarArr2), mod.q(z4p1.g(4282500207L), 0.92f, 0.1f, mmr0VarArr2), mod.q(z4p1.g(4293260247L), 0.1f, 0.08f, mmr0VarArr)});
    }

    public final void t0(lsl lslVar) {
        if (Size.g(lslVar.j())) {
            lslVar.s1();
            return;
        }
        fid fidVarP = lslVar.a1().p();
        fidVarP.j(anm1.g(0L, lslVar.j()), fdg1.l());
        lslVar.s1();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
        cab cabVarA1 = lslVar.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).t(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            DrawScope.S0(lslVar, P0, 0L, O0, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 58);
            Iterator it = Q0.iterator();
            while (it.hasNext()) {
                DrawScope.S0(lslVar, (Brush) it.next(), 0L, O0, 0.0f, (DrawStyle) null, (ColorFilter) null, 9, 58);
            }
            cabVarA1.p().i();
            cabVarA1.D(jU);
            fidVarP.i();
        } catch (Throwable th) {
            i3a.n(cabVarA1, jU);
            throw th;
        }
    }
}
