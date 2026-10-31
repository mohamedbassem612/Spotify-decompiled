package p;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ooo {
    public final ggg1 a;
    public final aae1 b;
    public final xid c;
    public final c9n d;
    public xab1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final CursorAnchorInfo.Builder j = new CursorAnchorInfo.Builder();
    public final float[] k = kch0.a();
    public final Matrix l = new Matrix();

    public ooo(ggg1 ggg1Var, aae1 aae1Var, xid xidVar, c9n c9nVar) {
        this.a = ggg1Var;
        this.b = aae1Var;
        this.c = xidVar;
        this.d = c9nVar;
    }

    public final CursorAnchorInfo a() {
        elb0 elb0Var;
        elb0 elb0VarB;
        y9e1 y9e1VarC;
        aae1 aae1Var = this.b;
        elb0 elb0VarE = aae1Var.e();
        if (elb0VarE != null) {
            if (!elb0VarE.a()) {
                elb0VarE = null;
            }
            if (elb0VarE != null && (elb0Var = (elb0) aae1Var.e.getValue()) != null) {
                if (!elb0Var.a()) {
                    elb0Var = null;
                }
                if (elb0Var != null && (elb0VarB = aae1Var.b()) != null) {
                    if (!elb0VarB.a()) {
                        elb0VarB = null;
                    }
                    if (elb0VarB != null && (y9e1VarC = aae1Var.c()) != null) {
                        i4e1 i4e1VarH = this.a.h();
                        float[] fArr = this.k;
                        kch0.e(fArr);
                        elb0VarE.u(fArr);
                        Matrix matrix = this.l;
                        y9g1.v(matrix, fArr);
                        n511 n511VarN = ljo1.u(elb0Var).n(elb0VarE.K(elb0Var, 0L));
                        n511 n511VarN2 = ljo1.u(elb0VarB).n(elb0VarE.K(elb0VarB, 0L));
                        long j = i4e1VarH.e;
                        nbe1 nbe1Var = i4e1VarH.f;
                        boolean z = this.f;
                        boolean z2 = this.g;
                        boolean z3 = this.h;
                        boolean z4 = this.i;
                        CursorAnchorInfo.Builder builder = this.j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iG = nbe1.g(j);
                        builder.setSelectionRange(iG, nbe1.f(j));
                        if (z && iG >= 0) {
                            n511 n511VarC = y9e1VarC.c(iG);
                            float fO = yoi1.o(n511VarC.a, 0.0f, (int) (y9e1VarC.c >> 32));
                            boolean zQ = rpo1.q(n511VarN, fO, n511VarC.b);
                            boolean zQ2 = rpo1.q(n511VarN, fO, n511VarC.d);
                            boolean z5 = y9e1VarC.a(iG) == 2;
                            int i = (zQ || zQ2) ? 1 : 0;
                            if (!zQ || !zQ2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            int i2 = i;
                            float f = n511VarC.b;
                            float f2 = n511VarC.d;
                            builder.setInsertionMarkerLocation(fO, f, f2, f2, i2);
                        }
                        if (z2) {
                            int iG2 = nbe1Var != null ? nbe1.g(nbe1Var.a) : -1;
                            int iF = nbe1Var != null ? nbe1.f(nbe1Var.a) : -1;
                            if (iG2 >= 0 && iG2 < iF) {
                                builder.setComposingText(iG2, i4e1VarH.d.subSequence(iG2, iF));
                                float[] fArr2 = new float[(iF - iG2) * 4];
                                y9e1VarC.b.a(e6p1.e(iG2, iF), fArr2);
                                int i3 = iG2;
                                while (i3 < iF) {
                                    int i4 = (i3 - iG2) * 4;
                                    float f3 = fArr2[i4];
                                    float f4 = fArr2[i4 + 1];
                                    float f5 = fArr2[i4 + 2];
                                    float f6 = fArr2[i4 + 3];
                                    int i5 = (f3 < n511VarN.c ? 1 : 0) & (n511VarN.a < f5 ? 1 : 0) & (n511VarN.b < f6 ? 1 : 0) & (f4 < n511VarN.d ? 1 : 0);
                                    if (!rpo1.q(n511VarN, f3, f4) || !rpo1.q(n511VarN, f5, f6)) {
                                        i5 |= 2;
                                    }
                                    int i6 = iF;
                                    if (y9e1VarC.a(i3) == 2) {
                                        i5 |= 4;
                                    }
                                    builder.addCharacterBounds(i3, f3, f4, f5, f6, i5);
                                    i3++;
                                    iF = i6;
                                }
                            }
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 33 && z3) {
                            gg.M(builder, n511VarN2);
                        }
                        if (i7 >= 34 && z4) {
                            sf.c(builder, y9e1VarC, n511VarN);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
