package p;

import android.text.Layout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nqb implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nqb(long j, float[] fArr, n811 n811Var, m811 m811Var) {
        this.a = (byte) 2;
        this.b = j;
        this.c = fArr;
        this.d = n811Var;
        this.e = m811Var;
    }

    public final Object invoke(Object obj) {
        long j;
        int i;
        boolean z;
        w9e1 w9e1Var;
        float fB;
        float fB2;
        byte b = this.a;
        final long j2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        n811 n811Var = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                n511 n511Var = (n511) obj3;
                p811 p811Var = (p811) n811Var;
                long j3 = this.b;
                ColorFilter colorFilter = (ColorFilter) obj2;
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                float f = n511Var.a;
                float f2 = n511Var.b;
                ((dg8) lslVar.a1().b).z(f, f2);
                try {
                    DrawScope.G(lslVar, (yk4) p811Var.a, 0L, j3, 0L, 0L, 0.0f, colorFilter, 0, 890);
                    return rih1Var;
                } finally {
                    ((dg8) lslVar.a1().b).z(-f, -f2);
                }
            case 1:
                final ArrayList arrayList = (ArrayList) n811Var;
                final isb0 isb0Var = (isb0) obj2;
                ((p5t0) obj).x(new iu30() { // from class: p.wub0
                    public final Object invoke(Object obj4) {
                        be50 be50Var;
                        p5t0 p5t0Var = (p5t0) obj4;
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            avb0 avb0Var = (avb0) arrayList2.get(i2);
                            boolean zW = isb0Var.b.W();
                            boolean z2 = avb0Var.d;
                            if (avb0Var.r == Integer.MIN_VALUE) {
                                tf80.a("position() should be called first");
                            }
                            List list = avb0Var.c;
                            int size2 = list.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                q5t0 q5t0Var = (q5t0) list.get(i3);
                                int i4 = avb0Var.s - (z2 ? q5t0Var.b : q5t0Var.a);
                                int i5 = avb0Var.t;
                                int i6 = i2;
                                long j4 = avb0Var.w;
                                ArrayList arrayList3 = arrayList2;
                                int i7 = size;
                                xrb0 xrb0VarA = avb0Var.j.a(i3, avb0Var.b);
                                if (xrb0VarA != null) {
                                    if (zW) {
                                        xrb0VarA.n = j4;
                                    } else {
                                        long jD = qr80.d(!qr80.b(xrb0VarA.n, 9223372034707292159L) ? xrb0VarA.n : j4, ((qr80) xrb0VarA.r.getValue()).a);
                                        if ((avb0Var.l(j4) <= i4 && avb0Var.l(jD) <= i4) || (avb0Var.l(j4) >= i5 && avb0Var.l(jD) >= i5)) {
                                            xrb0VarA.b();
                                        }
                                        j4 = jD;
                                    }
                                    be50Var = xrb0VarA.o;
                                } else {
                                    zW = zW;
                                    z2 = z2;
                                    list = list;
                                    size2 = size2;
                                    be50Var = null;
                                }
                                long jD2 = qr80.d(j4, j2);
                                if (!zW && xrb0VarA != null) {
                                    xrb0VarA.m = jD2;
                                }
                                if (be50Var != null) {
                                    p5t0.q(p5t0Var, q5t0Var, jD2, be50Var);
                                } else {
                                    p5t0.p(p5t0Var, q5t0Var, jD2);
                                }
                                i3++;
                                zW = zW;
                                i2 = i6;
                                arrayList2 = arrayList3;
                                size = i7;
                                z2 = z2;
                                list = list;
                                size2 = size2;
                            }
                            i2++;
                        }
                        return rih1.a;
                    }
                });
                ((vub0) obj3).a.u.getValue();
                return rih1Var;
            default:
                float[] fArr = (float[]) obj3;
                n811 n811Var2 = n811Var;
                m811 m811Var = (m811) obj2;
                sor0 sor0Var = (sor0) obj;
                int i2 = sor0Var.b;
                nw4 nw4Var = sor0Var.a;
                int iF = sor0Var.c;
                int iG = i2 > nbe1.g(j2) ? sor0Var.b : nbe1.g(j2);
                if (iF >= nbe1.f(j2)) {
                    iF = nbe1.f(j2);
                }
                long jE = e6p1.e(sor0Var.d(iG), sor0Var.d(iF));
                int i3 = n811Var2.a;
                w9e1 w9e1Var2 = nw4Var.d;
                int iG2 = nbe1.g(jE);
                int iF2 = nbe1.f(jE);
                Layout layout = w9e1Var2.f;
                int length = layout.getText().length();
                if (iG2 < 0) {
                    rf80.a("startOffset must be > 0");
                }
                if (iG2 >= length) {
                    rf80.a("startOffset must be less than text length");
                }
                if (iF2 <= iG2) {
                    rf80.a("endOffset must be greater than startOffset");
                }
                if (iF2 > length) {
                    rf80.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i3 < (iF2 - iG2) * 4) {
                    rf80.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iG3 = w9e1Var2.g(iG2);
                int iG4 = w9e1Var2.g(iF2 - 1);
                p8a p8aVar = new p8a(w9e1Var2);
                if (iG3 <= iG4) {
                    while (true) {
                        int lineStart = layout.getLineStart(iG3);
                        j = jE;
                        int iF3 = w9e1Var2.f(iG3);
                        int iMax = Math.max(iG2, lineStart);
                        float fI = w9e1Var2.i(iG3);
                        float fE = w9e1Var2.e(iG3);
                        int i4 = i3;
                        boolean z2 = layout.getParagraphDirection(iG3) == 1;
                        int i5 = iMax;
                        for (int iMin = Math.min(iF2, iF3); i5 < iMin; iMin = i) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i5);
                            if (!z2 || zIsRtlCharAt) {
                                i = iMin;
                                z = z2;
                                if (z && zIsRtlCharAt) {
                                    float fB3 = p8aVar.b(i5, false, false, false);
                                    w9e1Var = w9e1Var2;
                                    fB = p8aVar.b(i5 + 1, true, true, false);
                                    fB2 = fB3;
                                } else {
                                    w9e1Var = w9e1Var2;
                                    if (z || !zIsRtlCharAt) {
                                        fB = p8aVar.b(i5, false, false, false);
                                        fB2 = p8aVar.b(i5 + 1, true, true, false);
                                    } else {
                                        fB2 = p8aVar.b(i5, false, false, true);
                                        fB = p8aVar.b(i5 + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = fB;
                                fArr[i4 + 1] = fI;
                                fArr[i4 + 2] = fB2;
                                fArr[i4 + 3] = fE;
                                i4 += 4;
                                i5++;
                                z2 = z;
                                w9e1Var2 = w9e1Var;
                            } else {
                                i = iMin;
                                z = z2;
                                fB = p8aVar.b(i5, false, false, true);
                                w9e1Var = w9e1Var2;
                                fB2 = p8aVar.b(i5 + 1, true, true, true);
                            }
                            fArr[i4] = fB;
                            fArr[i4 + 1] = fI;
                            fArr[i4 + 2] = fB2;
                            fArr[i4 + 3] = fE;
                            i4 += 4;
                            i5++;
                            z2 = z;
                            w9e1Var2 = w9e1Var;
                        }
                        w9e1 w9e1Var3 = w9e1Var2;
                        if (iG3 != iG4) {
                            iG3++;
                            jE = j;
                            i3 = i4;
                            w9e1Var2 = w9e1Var3;
                        }
                    }
                } else {
                    j = jE;
                }
                int iE = (nbe1.e(j) * 4) + n811Var2.a;
                for (int i6 = n811Var2.a; i6 < iE; i6 += 4) {
                    int i7 = i6 + 1;
                    float f3 = fArr[i7];
                    float f4 = m811Var.a;
                    fArr[i7] = f3 + f4;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f4;
                }
                n811Var2.a = iE;
                m811Var.a += nw4Var.f;
                return rih1Var;
        }
    }

    public /* synthetic */ nqb(Object obj, Serializable serializable, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = serializable;
        this.b = j;
        this.e = obj2;
    }
}
