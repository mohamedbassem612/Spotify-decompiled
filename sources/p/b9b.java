package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b9b extends hab0 implements iu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ float X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ pmg1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ List f;
    public final /* synthetic */ long g;
    public final /* synthetic */ List h;
    public final /* synthetic */ List i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9b(pmg1 pmg1Var, boolean z, boolean z2, float f, float f2, List list, long j, List list2, List list3, int i, float f3, List list4, long j2, boolean z3, int i2) {
        super(1);
        this.a = pmg1Var;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = f2;
        this.f = list;
        this.g = j;
        this.h = list2;
        this.i = list3;
        this.t = i;
        this.X = f3;
        this.Y = list4;
        this.Z = j2;
        this.N0 = z3;
        this.O0 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    public final Object invoke(Object obj) throws Throwable {
        DrawScope drawScope;
        Throwable th;
        DrawScope drawScope2 = (DrawScope) obj;
        float fX0 = drawScope2.X0(8.0f);
        float fX1 = drawScope2.X0(2.0f);
        pmg1 pmg1Var = this.a;
        float f = pmg1Var.g;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L));
        boolean z = this.b;
        boolean z2 = z && !this.c;
        float f2 = pmg1Var.i;
        List list = this.f;
        List list2 = this.h;
        List list3 = this.i;
        boolean z3 = this.c;
        List list4 = this.Y;
        long j = this.Z;
        ((dg8) drawScope2.a1().b).z(f2, 0.0f);
        float f3 = this.d;
        float f4 = this.e;
        boolean z4 = z2;
        long j2 = this.g;
        if (!z4 || f3 <= 0.0f || f4 <= 0.0f) {
            drawScope = drawScope2;
        } else {
            try {
                if (list.isEmpty()) {
                    drawScope = drawScope2;
                } else {
                    drawScope = drawScope2;
                    try {
                        kbb.t(drawScope, list, j2, f4, f, fIntBitsToFloat, f3, fX0, list2);
                    } catch (Throwable th2) {
                        th = th2;
                        ((dg8) drawScope.a1().b).z(-f2, -0.0f);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                drawScope = drawScope2;
                ((dg8) drawScope.a1().b).z(-f2, -0.0f);
                throw th;
            }
        }
        if (f3 > 0.0f && f4 > 0.0f && !list3.isEmpty()) {
            kbb.u(drawScope, list3, j2, f4, f, fIntBitsToFloat, f3, z && this.t == 2, z3, fX0, fX1);
            fX0 = fX0;
        }
        float f5 = this.X;
        if (f5 > 0 && !
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v5 java.util.Collection
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b9b.invoke(java.lang.Object):java.lang.Object");
    }
}
