package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class s9e1 {
    public static final kiv a = new kiv(new mf41((byte) 8), (byte) 0);

    public static final void a(lee1 lee1Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-13499697);
        byte b = 4;
        int i2 = (x340Var.g(lee1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            kiv kivVar = a;
            mod.b(kivVar.a(((lee1) x340Var.k(kivVar)).e(lee1Var)), j2iVar, x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sr91(lee1Var, j2iVar, i, b);
        }
    }

    public static final void b(final String str, qim0 qim0Var, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, lee1 lee1Var, b0k b0kVar, final int i4) {
        final qim0 qim0Var2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final int i5;
        final boolean z2;
        final int i6;
        final int i7;
        final lee1 lee1Var2;
        long j9;
        long j10;
        qim0 qim0Var3;
        lee1 lee1Var3;
        boolean z3;
        int i8;
        long j11;
        int i9;
        long j12;
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1028090691);
        int i10 = i4 | (x340Var.g(str) ? 4 : 2) | 920350128;
        int i11 = 1;
        if (x340Var.Y(i10 & 1, (306783379 & i10) != 306783378)) {
            x340Var.d0();
            if ((i4 & 1) == 0 || x340Var.E()) {
                j9 = u7h.k;
                j10 = TextUnit.c;
                lee1 lee1Var4 = (lee1) x340Var.k(a);
                qim0Var3 = nim0.a;
                lee1Var3 = lee1Var4;
                z3 = true;
                i8 = 1;
                j11 = j10;
                i9 = Integer.MAX_VALUE;
                j12 = j11;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                j9 = j;
                j10 = j2;
                j12 = j3;
                j11 = j4;
                i11 = i;
                z3 = z;
                i9 = i2;
                i8 = i3;
                lee1Var3 = lee1Var;
            }
            x340Var.s();
            boolean z4 = z3;
            long j13 = ((u7h) x340Var.k(xrl.a)).a;
            float fFloatValue = ((Number) x340Var.k(wql.a)).floatValue();
            if (j9 != 16) {
                jC = j9;
            } else {
                jC = lee1Var3.c() != 16 ? lee1Var3.c() : u7h.b(j13, fFloatValue, 0.0f, 0.0f, 0.0f, 14);
            }
            long j14 = j10;
            long j15 = j12;
            long j16 = j11;
            lee1 lee1Var5 = lee1Var3;
            lee1 lee1VarF = lee1.f(lee1Var5, 0L, j14, (FontWeight) null, (FontFamily) null, j15, 0, j16, 16609105);
            boolean zF = x340Var.f(jC);
            Object objT = x340Var.T();
            qim0 qim0Var4 = qim0Var3;
            if (zF || objT == fkj0.X) {
                objT = new o9e1(jC);
                x340Var.s0(objT);
            }
            int i12 = i9;
            int i13 = i8;
            jch0.c(str, qim0Var4, lee1VarF, (iu30) null, i11, z4, i12, i13, (x9h) objT, (m0e1) null, x340Var, (i10 & 126) | 14380032, 512);
            qim0Var2 = qim0Var4;
            i5 = i11;
            j5 = j9;
            j6 = j14;
            j8 = j16;
            lee1Var2 = lee1Var5;
            j7 = j15;
            z2 = z4;
            i6 = i12;
            i7 = i13;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            i5 = i;
            z2 = z;
            i6 = i2;
            i7 = i3;
            lee1Var2 = lee1Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(str, qim0Var2, j5, j6, j7, j8, i5, z2, i6, i7, lee1Var2, i4) { // from class: p.l9e1
                public final /* synthetic */ lee1 X;
                public final /* synthetic */ String a;
                public final /* synthetic */ qim0 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ int i;
                public final /* synthetic */ boolean t;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(1);
                    String str2 = this.a;
                    qim0 qim0Var5 = this.b;
                    long j17 = this.c;
                    long j18 = this.d;
                    long j19 = this.e;
                    long j20 = this.f;
                    boolean z5 = this.g;
                    boolean z6 = this.h;
                    int i14 = this.i;
                    boolean z7 = this.t;
                    lee1 lee1Var6 = this.X;
                    s9e1.b(str2, qim0Var5, j17, j18, j19, j20, z5 ? 1 : 0, z6, i14, z7 ? 1 : 0, lee1Var6, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }
}
