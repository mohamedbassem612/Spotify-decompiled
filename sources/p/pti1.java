package p;

import android.graphics.Bitmap;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pti1 extends ari1 {
    public final ej50 b;
    public String c;
    public boolean d;
    public final k7v e;
    public Function0 f;
    public final hrr0 g;
    public f2b h;
    public final hrr0 i;
    public long j;
    public float k;
    public float l;
    public final oti1 m;

    public pti1(ej50 ej50Var) {
        this.b = ej50Var;
        ej50Var.i = new oti1(this, (byte) 0);
        this.c = "";
        this.d = true;
        this.e = new k7v();
        this.f = new mf41((byte) 14);
        this.g = xto.t((Object) null);
        this.i = xto.t(new Size(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new oti1(this, (byte) 1);
    }

    @Override // p.ari1
    public final void a(DrawScope drawScope) {
        e(drawScope, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    public final void e(DrawScope drawScope, float f, ColorFilter colorFilter) {
        int i;
        f2b f2bVarH;
        yk4 yk4VarB;
        char c;
        long j;
        long jB;
        ColorFilter colorFilter2;
        int iW;
        ej50 ej50Var = this.b;
        boolean z = ej50Var.d;
        hrr0 hrr0Var = this.g;
        if (z && ej50Var.e != 16) {
            ColorFilter colorFilter3 = (ColorFilter) hrr0Var.getValue();
            int i2 = bui1.a;
            if (colorFilter3 instanceof f2b) {
                int i3 = ((f2b) colorFilter3).c;
                if (jm5.j(i3, 5) || jm5.j(i3, 3)) {
                    if (colorFilter instanceof f2b) {
                        int i4 = ((f2b) colorFilter).c;
                        i = (!jm5.j(i4, 5) || jm5.j(i4, 3)) ? 1 : 0;
                    } else if (colorFilter == null) {
                    }
                }
            } else if (colorFilter3 == null) {
                if (colorFilter instanceof f2b) {
                    int i5 = ((f2b) colorFilter).c;
                    if (jm5.j(i5, 5)) {
                    }
                } else if (colorFilter == null) {
                }
            }
        }
        boolean z2 = this.d;
        k7v k7vVar = this.e;
        if (z2 || !Size.c(this.j, drawScope.j())) {
            if (jr70.a(i, 1)) {
                jB = ej50Var.e;
                int i6 = bui1.a;
                if (u7h.c(jB) != 1.0f) {
                    jB = u7h.b(jB, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                }
                f2bVarH = ejb.h(jB);
            } else {
                f2bVarH = null;
            }
            this.h = f2bVarH;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
            hrr0 hrr0Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((Size) hrr0Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / Float.intBitsToFloat((int) (((Size) hrr0Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.j() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L))))) & 4294967295L);
            flb0 layoutDirection = drawScope.getLayoutDirection();
            yk4VarB = (yk4) k7vVar.c;
            u84 u84VarA = (u84) k7vVar.d;
            if (yk4VarB != null || u84VarA == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i7 = (int) (jCeil >> 32);
                Bitmap bitmap = yk4VarB.a;
                c = ' ';
                j = 4294967295L;
                if (i7 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || !jr70.a(k7vVar.a, i)) {
                }
                k7vVar.b = jCeil;
                vid vidVar = (vid) k7vVar.e;
                uid uidVar = vidVar.a;
                long jR = o0c.R(jCeil);
                wat watVar = uidVar.a;
                flb0 flb0Var = uidVar.b;
                fid fidVar = uidVar.c;
                long j2 = uidVar.d;
                uidVar.a = drawScope;
                uidVar.b = layoutDirection;
                uidVar.c = u84VarA;
                uidVar.d = jR;
                u84VarA.q();
                int i8 = u7h.l;
                DrawScope.d0(vidVar, nfb.i(), 0L, 0L, 0.0f, null, null, 62);
                this.m.invoke(vidVar);
                u84VarA.i();
                uidVar.a = watVar;
                uidVar.b = flb0Var;
                uidVar.c = fidVar;
                uidVar.d = j2;
                yk4VarB.a.prepareToDraw();
                this.d = false;
                this.j = drawScope.j();
            }
            yk4VarB = h1p1.b((int) (jCeil >> c), (int) (jCeil & j), i);
            u84VarA = f0o1.a(yk4VarB);
            k7vVar.c = yk4VarB;
            k7vVar.d = u84VarA;
            k7vVar.a = i;
            k7vVar.b = jCeil;
            vid vidVar2 = (vid) k7vVar.e;
            uid uidVar2 = vidVar2.a;
            long jR2 = o0c.R(jCeil);
            wat watVar2 = uidVar2.a;
            flb0 flb0Var2 = uidVar2.b;
            fid fidVar2 = uidVar2.c;
            long j3 = uidVar2.d;
            uidVar2.a = drawScope;
            uidVar2.b = layoutDirection;
            uidVar2.c = u84VarA;
            uidVar2.d = jR2;
            u84VarA.q();
            int i9 = u7h.l;
            DrawScope.d0(vidVar2, nfb.i(), 0L, 0L, 0.0f, null, null, 62);
            this.m.invoke(vidVar2);
            u84VarA.i();
            uidVar2.a = watVar2;
            uidVar2.b = flb0Var2;
            uidVar2.c = fidVar2;
            uidVar2.d = j3;
            yk4VarB.a.prepareToDraw();
            this.d = false;
            this.j = drawScope.j();
        } else {
            yk4 yk4Var = (yk4) k7vVar.c;
            if (yk4Var != null) {
                Bitmap.Config config = yk4Var.a.getConfig();
                config.getClass();
                iW = no80.W(config);
            } else {
                iW = 0;
            }
            if (!jr70.a(i, iW)) {
                if (jr70.a(i, 1)) {
                    jB = ej50Var.e;
                    int i10 = bui1.a;
                    if (u7h.c(jB) != 1.0f) {
                        jB = u7h.b(jB, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    f2bVarH = ejb.h(jB);
                } else {
                    f2bVarH = null;
                }
                this.h = f2bVarH;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                hrr0 hrr0Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((Size) hrr0Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / Float.intBitsToFloat((int) (((Size) hrr0Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.j() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L))))) & 4294967295L);
                flb0 layoutDirection2 = drawScope.getLayoutDirection();
                yk4VarB = (yk4) k7vVar.c;
                u84 u84VarA2 = (u84) k7vVar.d;
                if (yk4VarB != null) {
                    c = ' ';
                    j = 4294967295L;
                    yk4VarB = h1p1.b((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    u84VarA2 = f0o1.a(yk4VarB);
                    k7vVar.c = yk4VarB;
                    k7vVar.d = u84VarA2;
                    k7vVar.a = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    yk4VarB = h1p1.b((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    u84VarA2 = f0o1.a(yk4VarB);
                    k7vVar.c = yk4VarB;
                    k7vVar.d = u84VarA2;
                    k7vVar.a = i;
                }
                k7vVar.b = jCeil2;
                vid vidVar3 = (vid) k7vVar.e;
                uid uidVar3 = vidVar3.a;
                long jR3 = o0c.R(jCeil2);
                wat watVar3 = uidVar3.a;
                flb0 flb0Var3 = uidVar3.b;
                fid fidVar3 = uidVar3.c;
                long j4 = uidVar3.d;
                uidVar3.a = drawScope;
                uidVar3.b = layoutDirection2;
                uidVar3.c = u84VarA2;
                uidVar3.d = jR3;
                u84VarA2.q();
                int i11 = u7h.l;
                DrawScope.d0(vidVar3, nfb.i(), 0L, 0L, 0.0f, null, null, 62);
                this.m.invoke(vidVar3);
                u84VarA2.i();
                uidVar3.a = watVar3;
                uidVar3.b = flb0Var3;
                uidVar3.c = fidVar3;
                uidVar3.d = j4;
                yk4VarB.a.prepareToDraw();
                this.d = false;
                this.j = drawScope.j();
            }
        }
        if (colorFilter != null) {
            colorFilter2 = colorFilter;
        } else {
            colorFilter2 = ((ColorFilter) hrr0Var.getValue()) != null ? (ColorFilter) hrr0Var.getValue() : this.h;
        }
        yk4 yk4Var2 = (yk4) k7vVar.c;
        if (yk4Var2 == null) {
            qf80.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.G(drawScope, yk4Var2, 0L, k7vVar.b, 0L, 0L, f, colorFilter2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        hrr0 hrr0Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((Size) hrr0Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((Size) hrr0Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
