package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.Timestamp;
import com.spotify.concertcampaignview.v1.CampaignRoutingWithStatus;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class k4k {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static b180 b;
    public static b180 c;

    public static final void a(int i, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        int i2;
        int i3;
        Object obj;
        Function0 function0;
        Object obj2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1471187960);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (z) {
                x340Var.i0(-1980565470);
                i3 = 0;
                cb80 cb80VarG = t5p1.g(t5p1.r("agentIcon", x340Var, 0), 0.0f, 6.2831855f, irn1.Y(irn1.o0(2000, 0, mlv.d, 2), 1, 0L, 4), "pole", x340Var, 28728, 0);
                boolean zI = x340Var.i(cb80VarG);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    obj2 = objT;
                    bu2 bu2Var = new bu2(cb80VarG, (byte) 0);
                    x340Var.s0(bu2Var);
                    obj2 = bu2Var;
                }
                function0 = (Function0) obj2;
                x340Var.r(false);
            } else {
                i3 = 0;
                x340Var.i0(-1980058899);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    obj = objT2;
                    ou1 ou1Var = ou1.X;
                    x340Var.s0(ou1Var);
                    obj = ou1Var;
                }
                obj = objT2;
                function0 = (Function0) obj;
                x340Var.r(false);
            }
            qim0 qim0VarR = u291.r(qim0Var, 24.0f);
            int i5 = (x340Var.g(function0) ? 1 : 0) | ((i4 & 112) == 32 ? 1 : i3);
            Object objT3 = x340Var.T();
            Object obj3 = objT3;
            if (i5 != 0 || objT3 == m4cVar) {
                zt2 zt2Var = new zt2(function0, z2);
                x340Var.s0(zt2Var);
                obj3 = zt2Var;
            }
            j0o1.b(i3, x340Var, (iu30) obj3, qim0VarR);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new au2(qim0Var, z, z2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void b(qim0 qim0Var, int i, boolean z, boolean z2, Integer num, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        Integer num2;
        int i8;
        boolean z5;
        qim0 qim0Var2;
        boolean z6;
        boolean z7;
        Integer num3;
        h311 h311VarV;
        boolean z8;
        int iC;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-33197821);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (x340Var.i(qim0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                z3 = z;
                i4 |= x340Var.h(z3) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    z4 = z2;
                    if (x340Var.h(z4)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        num2 = num;
                        if (x340Var.g(num2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i4 & 9363) != 9362) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (x340Var.Y(i4 & 1, z5)) {
                        if (i9 != 0) {
                            qim0Var = nim0.a;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        }
                        if (i7 != 0) {
                            num2 = null;
                        }
                        if (z3 || z4) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        iC = l1d.C(i);
                        if (iC != 0) {
                            x340Var.i0(-1838325770);
                            a(((i4 >> 6) & 112) | ((i4 << 6) & 896), x340Var, qim0Var, z8, z4);
                            x340Var.r(false);
                        } else {
                            if (iC == 1) {
                                throw p3d1.k(x340Var, -1838327202, false);
                            }
                            x340Var.i0(-1838321936);
                            i(z8, num2 != null ? new u7h(z4p1.e(num2.intValue())) : null, qim0Var, x340Var, (i4 << 6) & 896);
                            x340Var.r(false);
                        }
                    } else {
                        x340Var.b0();
                    }
                    qim0Var2 = qim0Var;
                    z6 = z3;
                    z7 = z4;
                    num3 = num2;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new cu2(qim0Var2, i, z6, z7, num3, i2, i3);
                    }
                }
                i4 |= 24576;
                num2 = num;
                if ((i4 & 9363) != 9362) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (x340Var.Y(i4 & 1, z5)) {
                    if (i9 != 0) {
                        qim0Var = nim0.a;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    }
                    if (i7 != 0) {
                        num2 = null;
                    }
                    if (z3) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    iC = l1d.C(i);
                    if (iC != 0) {
                        x340Var.i0(-1838325770);
                        a(((i4 >> 6) & 112) | ((i4 << 6) & 896), x340Var, qim0Var, z8, z4);
                        x340Var.r(false);
                    } else {
                        if (iC == 1) {
                            throw p3d1.k(x340Var, -1838327202, false);
                        }
                        x340Var.i0(-1838321936);
                        i(z8, num2 != null ? new u7h(z4p1.e(num2.intValue())) : null, qim0Var, x340Var, (i4 << 6) & 896);
                        x340Var.r(false);
                    }
                } else {
                    x340Var.b0();
                }
                qim0Var2 = qim0Var;
                z6 = z3;
                z7 = z4;
                num3 = num2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cu2(qim0Var2, i, z6, z7, num3, i2, i3);
                }
            }
            i4 |= 3072;
            z4 = z2;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    num2 = num;
                    if (x340Var.g(num2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (x340Var.Y(i4 & 1, z5)) {
                    if (i9 != 0) {
                        qim0Var = nim0.a;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    }
                    if (i7 != 0) {
                        num2 = null;
                    }
                    if (z3) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    iC = l1d.C(i);
                    if (iC != 0) {
                        x340Var.i0(-1838325770);
                        a(((i4 >> 6) & 112) | ((i4 << 6) & 896), x340Var, qim0Var, z8, z4);
                        x340Var.r(false);
                    } else {
                        if (iC == 1) {
                            throw p3d1.k(x340Var, -1838327202, false);
                        }
                        x340Var.i0(-1838321936);
                        i(z8, num2 != null ? new u7h(z4p1.e(num2.intValue())) : null, qim0Var, x340Var, (i4 << 6) & 896);
                        x340Var.r(false);
                    }
                } else {
                    x340Var.b0();
                }
                qim0Var2 = qim0Var;
                z6 = z3;
                z7 = z4;
                num3 = num2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cu2(qim0Var2, i, z6, z7, num3, i2, i3);
                }
            }
            i4 |= 24576;
            num2 = num;
            if ((i4 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var.Y(i4 & 1, z5)) {
                if (i9 != 0) {
                    qim0Var = nim0.a;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    z4 = false;
                }
                if (i7 != 0) {
                    num2 = null;
                }
                if (z3) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                iC = l1d.C(i);
                if (iC != 0) {
                    x340Var.i0(-1838325770);
                    a(((i4 >> 6) & 112) | ((i4 << 6) & 896), x340Var, qim0Var, z8, z4);
                    x340Var.r(false);
                } else {
                    if (iC == 1) {
                        throw p3d1.k(x340Var, -1838327202, false);
                    }
                    x340Var.i0(-1838321936);
                    i(z8, num2 != null ? new u7h(z4p1.e(num2.intValue())) : null, qim0Var, x340Var, (i4 << 6) & 896);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            qim0Var2 = qim0Var;
            z6 = z3;
            z7 = z4;
            num3 = num2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cu2(qim0Var2, i, z6, z7, num3, i2, i3);
            }
        }
        i4 |= 384;
        z3 = z;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                z4 = z2;
                if (x340Var.h(z4)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    num2 = num;
                    if (x340Var.g(num2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (x340Var.Y(i4 & 1, z5)) {
                    if (i9 != 0) {
                        qim0Var = nim0.a;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    }
                    if (i7 != 0) {
                        num2 = null;
                    }
                    if (z3) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    iC = l1d.C(i);
                    if (iC != 0) {
                        x340Var.i0(-1838325770);
                        a(((i4 >> 6) & 112) | ((i4 << 6) & 896), x340Var, qim0Var, z8, z4);
                        x340Var.r(false);
                    } else {
                        if (iC == 1) {
                            throw p3d1.k(x340Var, -1838327202, false);
                        }
                        x340Var.i0(-1838321936);
                        i(z8, num2 != null ? new u7h(z4p1.e(num2.intValue())) : null, qim0Var, x340Var, (i4 << 6) & 896);
                        x340Var.r(false);
                    }
                } else {
                    x340Var.b0();
                }
                qim0Var2 = qim0Var;
                z6 = z3;
                z7 = z4;
                num3 = num2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cu2(qim0Var2, i, z6, z7, num3, i2, i3);
                }
            }
            i4 |= 24576;
            num2 = num;
            if ((i4 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var.Y(i4 & 1, z5)) {
                if (i9 != 0) {
                    qim0Var = nim0.a;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    z4 = false;
                }
                if (i7 != 0) {
                    num2 = null;
                }
                if (z3) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                iC = l1d.C(i);
                if (iC != 0) {
                    x340Var.i0(-1838325770);
                    a(((i4 >> 6) & 112) | ((i4 << 6) & 896), x340Var, qim0Var, z8, z4);
                    x340Var.r(false);
                } else {
                    if (iC == 1) {
                        throw p3d1.k(x340Var, -1838327202, false);
                    }
                    x340Var.i0(-1838321936);
                    i(z8, num2 != null ? new u7h(z4p1.e(num2.intValue())) : null, qim0Var, x340Var, (i4 << 6) & 896);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            qim0Var2 = qim0Var;
            z6 = z3;
            z7 = z4;
            num3 = num2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cu2(qim0Var2, i, z6, z7, num3, i2, i3);
            }
        }
        i4 |= 3072;
        z4 = z2;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                num2 = num;
                if (x340Var.g(num2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i4 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var.Y(i4 & 1, z5)) {
                if (i9 != 0) {
                    qim0Var = nim0.a;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    z4 = false;
                }
                if (i7 != 0) {
                    num2 = null;
                }
                if (z3) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                iC = l1d.C(i);
                if (iC != 0) {
                    x340Var.i0(-1838325770);
                    a(((i4 >> 6) & 112) | ((i4 << 6) & 896), x340Var, qim0Var, z8, z4);
                    x340Var.r(false);
                } else {
                    if (iC == 1) {
                        throw p3d1.k(x340Var, -1838327202, false);
                    }
                    x340Var.i0(-1838321936);
                    i(z8, num2 != null ? new u7h(z4p1.e(num2.intValue())) : null, qim0Var, x340Var, (i4 << 6) & 896);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            qim0Var2 = qim0Var;
            z6 = z3;
            z7 = z4;
            num3 = num2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cu2(qim0Var2, i, z6, z7, num3, i2, i3);
            }
        }
        i4 |= 24576;
        num2 = num;
        if ((i4 & 9363) != 9362) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (x340Var.Y(i4 & 1, z5)) {
            if (i9 != 0) {
                qim0Var = nim0.a;
            }
            if (i10 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                z4 = false;
            }
            if (i7 != 0) {
                num2 = null;
            }
            if (z3) {
                z8 = false;
            } else {
                z8 = false;
            }
            iC = l1d.C(i);
            if (iC != 0) {
                x340Var.i0(-1838325770);
                a(((i4 >> 6) & 112) | ((i4 << 6) & 896), x340Var, qim0Var, z8, z4);
                x340Var.r(false);
            } else {
                if (iC == 1) {
                    throw p3d1.k(x340Var, -1838327202, false);
                }
                x340Var.i0(-1838321936);
                i(z8, num2 != null ? new u7h(z4p1.e(num2.intValue())) : null, qim0Var, x340Var, (i4 << 6) & 896);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        qim0Var2 = qim0Var;
        z6 = z3;
        z7 = z4;
        num3 = num2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cu2(qim0Var2, i, z6, z7, num3, i2, i3);
        }
    }

    public static final void c(kvt kvtVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2048542503);
        int i2 = i | (x340Var.i(kvtVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qti1 qti1Var = voo1.g;
            qim0 qim0Var3 = nim0.a;
            cwl1.b(u291.z(u291.f(voo1.y(qim0Var3, qti1Var), 1.0f), (fra) null, 3), (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-1755003568, new lvt(kvtVar, iu30Var, (byte) 0), x340Var), x340Var, 0, 48, 2030);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mvt(kvtVar, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void d(boolean z, hux huxVar, String str, String str2, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        String str3;
        boolean z2;
        b0k b0kVar2;
        String str4;
        h311 h311VarV;
        ogx ogxVar;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-914556014);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                str3 = str2;
                i3 |= b0kVar3.g(str3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (b0kVar3.i(function0)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b0kVar3.Y(i3 & 1, z2)) {
                if (i5 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                qim0 qim0VarN = anm1.N("connectionItem", u291.f(nim0.a, 1.0f));
                if (z) {
                    ogxVar = ogx.e;
                } else {
                    ogxVar = ngx.e;
                }
                ogx ogxVar2 = ogxVar;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, new uvx(0, ogxVar2, 3, (vzq0) null, uyn1.h(2, 8.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 489), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, apo.r(-1738760932, new g70(huxVar, (byte) 3), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(792707001, new t1(str4, function0, (byte) 2), b0kVar3), (xu30) null, (xu30) null, apo.r(388958934, new kaf(str, (byte) 26), b0kVar3), b0kVar2, 100663360, 196992, 28348);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                str4 = str3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(z, huxVar, str, str4, function0, i, i2);
            }
        }
        i3 |= 3072;
        str3 = str2;
        if ((i & 24576) == 0) {
            if (b0kVar3.i(function0)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b0kVar3.Y(i3 & 1, z2)) {
            if (i5 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            qim0 qim0VarN2 = anm1.N("connectionItem", u291.f(nim0.a, 1.0f));
            if (z) {
                ogxVar = ogx.e;
            } else {
                ogxVar = ngx.e;
            }
            ogx ogxVar3 = ogxVar;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN2, new uvx(0, ogxVar3, 3, (vzq0) null, uyn1.h(2, 8.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 489), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, apo.r(-1738760932, new g70(huxVar, (byte) 3), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(792707001, new t1(str4, function0, (byte) 2), b0kVar3), (xu30) null, (xu30) null, apo.r(388958934, new kaf(str, (byte) 26), b0kVar3), b0kVar2, 100663360, 196992, 28348);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            str4 = str3;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(z, huxVar, str, str4, function0, i, i2);
        }
    }

    public static final void e(kvt kvtVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(156547284);
        int i2 = i | (x340Var.i(kvtVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean zI = x340Var.i(watVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new pj(watVar, (byte) 2);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = x340Var.i(watVar);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new pj(watVar, (byte) 3);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z = (i2 & 112) == 32;
            Object objT3 = x340Var.T();
            if (z || objT3 == m4cVar) {
                objT3 = new hws(iu30Var, (byte) 7);
                x340Var.s0(objT3);
            }
            nyx.a(2, (wux) null, apo.r(-1281022879, new won(t890.s(new vy71(true, function0, function1, xy71.b, (iu30) objT3, 32), (bs91) null, x340Var, 0, 2), kvtVar, iu30Var), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mvt(kvtVar, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void f(boolean z, a140 a140Var, String str, String str2, sqe sqeVar, yhv yhvVar, yhv yhvVar2, w140 w140Var, j040 j040Var, pbf0 pbf0Var, pbf0 pbf0Var2, b0k b0kVar, int i) {
        int i2;
        a140 a140Var2;
        pbf0 pbf0Var3;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2082472625);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(a140Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? x340Var.g(sqeVar) : x340Var.i(sqeVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? x340Var.g(yhvVar) : x340Var.i(yhvVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? x340Var.g(yhvVar2) : x340Var.i(yhvVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(w140Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= (i & 134217728) == 0 ? x340Var.g(j040Var) : x340Var.i(j040Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= x340Var.i(pbf0Var) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((x340Var.i(pbf0Var2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            float f2 = 16.0f;
            if (z) {
                x340Var.i0(198584246);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            } else {
                x340Var.i0(198585523);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 16.0f;
            }
            if (z) {
                x340Var.i0(198588086);
                cvx cvxVar3 = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 12.0f;
            } else {
                x340Var.i0(198589363);
                cvx cvxVar4 = cbx.b(x340Var).b;
                x340Var.r(false);
            }
            nim0 nim0Var = nim0.a;
            float f3 = f;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarD3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            qim0 qim0VarF = u291.f(kk0.q(x340Var, qim0VarE3, lljVar4, 1.0f, true), 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            otw.c(yhvVar, new vhv(pbf0Var.a, pbf0Var.b, true), (qim0) null, (ipb1) null, x340Var, 8 | ((i3 >> 15) & 14), 12);
            x340Var.r(true);
            qim0 qim0VarX = uyn1.x(u291.f(nim0Var, 1.0f), f3);
            mbh mbhVarA3 = jbh.a(new d36(f2, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            pbf0Var3 = pbf0Var2;
            h(a140Var, str, z, f2, w140Var, x340Var, ((i3 >> 3) & 126) | ((i3 << 6) & 896) | ((i3 >> 9) & 57344));
            a140Var2 = a140Var;
            otw.c(j040Var, new f040(sqeVar, a140Var2.d, str2, z, nhc1.W(nhc1.W(((klz0) x340Var.k(llz0.a)).b.d.e, "{quizName}", a140Var2.a), "{scorePercentage}", String.valueOf(a140Var2.b.a)), a140Var2.h), (qim0) null, (ipb1) null, x340Var, 8 | ((i3 >> 24) & 14), 12);
            x340Var.r(true);
            x340Var.r(true);
            x340Var.r(true);
            otw.c(yhvVar2, new vhv(pbf0Var3.a, pbf0Var3.b, false), u291.d(nim0Var, 1.0f), (ipb1) null, x340Var, 8 | ((i3 >> 18) & 14), 8);
            x340Var.r(true);
        } else {
            a140Var2 = a140Var;
            pbf0Var3 = pbf0Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rpr(z, a140Var2, str, str2, sqeVar, yhvVar, yhvVar2, w140Var, j040Var, pbf0Var, pbf0Var3, i);
        }
    }

    public static final void g(a140 a140Var, String str, String str2, sip sipVar, tip tipVar, uip uipVar, xip xipVar, zja1 zja1Var, rgn0 rgn0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        ez30 ez30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1354551764);
        int i2 = i | (b0kVar3.i(a140Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(sipVar) ? 2048 : 1024) | (b0kVar3.g(tipVar) ? 16384 : 8192) | (b0kVar3.i(uipVar) ? 131072 : 65536) | (b0kVar3.i(xipVar) ? 1048576 : 524288) | (b0kVar3.i(zja1Var) ? 8388608 : 4194304) | (b0kVar3.i(rgn0Var) ? 67108864 : 33554432) | 805306368;
        if (b0kVar3.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            aka1 aka1Var = (aka1) b0kVar3.k(bka1.a);
            cir0 cir0Var = (cir0) b0kVar3.k(k2r0.a);
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = sipVar.a();
                b0kVar3.s0(objT);
            }
            yhv yhvVar = (yhv) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = sipVar.a();
                b0kVar3.s0(objT2);
            }
            yhv yhvVar2 = (yhv) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == obj) {
                k42 k42Var = (k42) tipVar.a.c;
                v5n v5nVar = (v5n) ((e140) k42Var.c).e.get();
                c8o.l(v5nVar);
                ggv ggvVar = (ggv) ((e140) k42Var.c).g.get();
                c8o.l(ggvVar);
                objT3 = new w140(v5nVar, ggvVar, ((Boolean) ((jly0) k42Var.f).get()).booleanValue());
                b0kVar3.s0(objT3);
            }
            w140 w140Var = (w140) objT3;
            boolean zG = b0kVar3.g(cir0Var);
            Object objT4 = b0kVar3.T();
            if (zG || objT4 == obj) {
                k42 k42Var2 = (k42) uipVar.a.c;
                vip vipVar = (vip) ((jly0) k42Var2.i).get();
                wip wipVar = (wip) ((jly0) k42Var2.j).get();
                q8n q8nVar = (q8n) ((e140) k42Var2.c).a.get();
                c8o.l(q8nVar);
                objT4 = new j040(cir0Var, vipVar, wipVar, q8nVar);
                b0kVar3.s0(objT4);
            }
            j040 j040Var = (j040) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == obj) {
                objT5 = xipVar.a(rgn0Var);
                b0kVar3.s0(objT5);
            }
            xiz0 xiz0Var = (xiz0) objT5;
            q331 q331Var = a140Var.g;
            pbf0 pbf0Var = q331Var.a;
            pbf0 pbf0Var2 = q331Var.b;
            boolean zI = b0kVar3.i(zja1Var) | b0kVar3.i(aka1Var);
            Object objT6 = b0kVar3.T();
            if (zI || objT6 == obj) {
                objT6 = new j140(zja1Var, aka1Var, null, (byte) 0);
                b0kVar3.s0(objT6);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT6);
            z040 z040Var = a140Var.c;
            if (z040Var instanceof y040) {
                ez30Var = ez30.d;
            } else {
                if (!(z040Var instanceof x040)) {
                    eg.o();
                    return;
                }
                ez30Var = dz30.d;
            }
            klz0 klz0Var = (klz0) b0kVar3.k(llz0.a);
            j2i j2iVarR = apo.r(841977311, new xx00(xiz0Var, a140Var, klz0Var, (byte) 23), b0kVar3);
            j2i j2iVarR2 = apo.r(-614123867, new l140(klz0Var, a140Var, str, str2, ez30Var, yhvVar, yhvVar2, w140Var, j040Var, pbf0Var, pbf0Var2), b0kVar3);
            b0kVar2 = b0kVar3;
            irn1.u((qim0) null, j2iVarR, (vu30) null, (erl1) null, j2iVarR2, b0kVar2, 24624, 13);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o06(a140Var, str, str2, sipVar, tipVar, uipVar, xipVar, zja1Var, rgn0Var, qim0Var2, i, (byte) 4);
        }
    }

    public static final void h(a140 a140Var, String str, boolean z, float f, w140 w140Var, b0k b0kVar, int i) {
        int i2;
        lee1 lee1Var;
        int iIntValue;
        boolean z2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(2036845231);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(a140Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(w140Var) ? 16384 : 8192;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(new d36(f, true, new um5(false)), een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String str2 = a140Var.i;
            if (str2 == null) {
                b0kVar2.i0(-1542279017);
                b0kVar2.r(false);
                iIntValue = 0;
                z2 = true;
            } else {
                b0kVar2.i0(-1542279016);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                if (z) {
                    b0kVar2.i0(-467290895);
                    uwr uwrVar = cbx.a;
                    lee1Var = cbx.d(b0kVar2).e;
                } else {
                    b0kVar2.i0(-467289806);
                    uwr uwrVar2 = cbx.a;
                    lee1Var = cbx.d(b0kVar2).d;
                }
                b0kVar2.r(false);
                lee1 lee1Var2 = lee1Var;
                iIntValue = 0;
                z2 = true;
                uwo1.e(str2, qim0VarF2, lee1Var2, cbx.a(b0kVar2).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            }
            ggi1 ggi1Var = a140Var.b;
            int i3 = ggi1Var.a;
            Integer num = ggi1Var.b;
            if (num != null) {
                iIntValue = num.intValue();
            }
            otw.c(w140Var, new n140(str, i3, iIntValue, a140Var.c, z), (qim0) null, (ipb1) null, b0kVar2, (i2 >> 12) & 14, 12);
            b0kVar2.r(z2);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m140(a140Var, str, z, f, w140Var, i);
        }
    }

    public static final void i(boolean z, u7h u7hVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(625886053);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(u7hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            Float fValueOf = Float.valueOf(0.0f);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = ((i3 ^ 6) > 4 && x340Var.h(z)) || (i2 & 6) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new du2(z, null);
                x340Var.s0(objT);
            }
            ven0 ven0VarP = yto.p(fValueOf, boolValueOf, (vu30) objT, x340Var, ((i3 << 3) & 112) | 6);
            qim0 qim0VarR = u291.r(qim0Var, 24.0f);
            boolean zI = (i3 == 4) | x340Var.i(ven0VarP) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new c30(ven0VarP, z, u7hVar, (byte) 3);
                x340Var.s0(objT2);
            }
            j0o1.b(0, x340Var, (iu30) objT2, qim0VarR);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(z, u7hVar, qim0Var, i, (byte) 2);
        }
    }

    public static final void j(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(390036841);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.c;
            float f2 = cbx.b(x340Var).b.c;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, anm1.N("messageTitle", uyn1.A(nim0.a, f, 2.0f, f2, 12.0f)), cbx.d(x340Var).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2024);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pji(str, i, (byte) 29);
        }
    }

    public static final void k(syv0 syv0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1796437366);
        int i2 = i | (b0kVar3.i(syv0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zB = xoi1.b((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b));
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).b.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            float f2 = zB ? f : 16.0f;
            ss50 ss50Var = (ss50) b0kVar3.k(t4k.l);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.z(anm1.N("card-container", qim0Var3), (fra) null, 3), 1.0f);
            String strO0 = cwl1.o0(b0kVar3, 2131961038);
            boolean zI = ((i2 & 112) == 32) | b0kVar3.i(syv0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new tyv0(iu30Var, syv0Var, (byte) 0);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0VarF, idn0Var, (ga80) null, false, strO0, (pm31) null, (Function0) objT2, 20);
            long jA = cbx.a(b0kVar3).a.a.a();
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarF2 = dug.f(qim0VarV, jA, er31.b(16.0f));
            cua cuaVar2 = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(16.0f);
            mgx mgxVar = mgx.e;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarF2, mgxVar, new ydx((23 & 1) != 0 ? 4.0f : 0.0f, (23 & 2) != 0 ? 12.0f : 0.0f, (23 & 4) != 0 ? 8.0f : 0.0f, (23 & 8) != 0 ? new zzq0(12.0f, 12.0f, 12.0f, 12.0f) : new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (23 & 16) != 0 ? vdx.a : wdx.a), cr31VarB, (max) null, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-15658319, new ye6(syv0Var, f2, (byte) 8), b0kVar3), (xu30) null, (xu30) null, apo.r(-2015902353, new uyv0(f2, f, syv0Var, (byte) 0), b0kVar3), apo.r(1863738126, new vyv0(syv0Var, f2, iu30Var, ss50Var), b0kVar3), (xu30) null, (xu30) null, apo.r(617757675, new uyv0(f2, f, syv0Var, (byte) 1), b0kVar3), b0kVar2, 805306880, 1576320, 52720);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(syv0Var, iu30Var, qim0Var2, i, (byte) 21);
        }
    }

    public static final int l(int i) {
        int iC = l1d.C(i);
        if (iC != 0) {
            return iC != 1 ? 0 : 2;
        }
        return 1;
    }

    public static final Object m(o8n o8nVar, Function0 function0) throws Throwable {
        Unsafe unsafe;
        long j;
        int intVolatile;
        try {
            qge1 qge1Var = new qge1();
            qge1Var.h = op71.A(op71.z(o8nVar), true, qge1Var);
            do {
                unsafe = avg.a;
                j = qge1.i;
                intVolatile = unsafe.getIntVolatile(qge1Var, j);
                if (intVolatile != 0) {
                    if (intVolatile == 2 || intVolatile == 3) {
                        break;
                        break;
                    }
                    qge1.n(intVolatile);
                    throw null;
                }
            } while (!unsafe.compareAndSwapInt(qge1Var, j, intVolatile, 0));
            try {
                return function0.invoke();
            } finally {
                qge1Var.m();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }

    public static final mgb n(jge jgeVar, bpb1 bpb1Var) {
        return new mgb(jgeVar, bpb1Var, (byte) 4);
    }

    public static void o(Button button, String str, j4b1 j4b1Var) {
        g4b1 g4b1Var;
        Context context = button.getContext();
        Resources resources = context.getResources();
        if (j4b1Var != null) {
            g4b1Var = new g4b1(context, j4b1Var, resources.getDimensionPixelSize(2131165274));
            g4b1Var.c(button.getTextColors());
        } else {
            g4b1Var = null;
        }
        button.setPadding(resources.getDimensionPixelSize(2131165275), 0, resources.getDimensionPixelSize(2131165276), 0);
        button.setCompoundDrawablesWithIntrinsicBounds((Drawable) g4b1Var, (Drawable) null, (Drawable) null, (Drawable) null);
        button.setCompoundDrawablePadding(resources.getDimensionPixelOffset(2131165273));
        button.setText(str.toUpperCase(Locale.getDefault()));
    }

    public static lgy p(int i) {
        boolean z = true;
        n57.k(i != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        lgy lgyVar = new lgy();
        Integer num = (Integer) lgyVar.d;
        if (num != null && num.intValue() == 0) {
            z = false;
        }
        n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
        lgyVar.d = Integer.valueOf(i);
        lgyVar.a = false;
        return lgyVar;
    }

    public static lgy q(String str) {
        lgy lgyVar = new lgy();
        lgyVar.c = str;
        lgyVar.a = false;
        return lgyVar;
    }

    public static final long r(xt2 xt2Var, float f) {
        float fP = c13.p(xt2Var.a, 6.0f, 3.0f, f);
        return (((long) Float.floatToRawIntBits(c13.p(xt2Var.b, 6.0f, 3.0f, f))) & 4294967295L) | (Float.floatToRawIntBits(fP) << 32);
    }

    public static brl0 s() {
        return new brl0((byte) 28);
    }

    public static final Set t(Set set) {
        Set<UUID> set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        for (UUID uuid : set2) {
            Map map = fe9.a;
            if (uuid instanceof ce9) {
                uuid = ((ce9) uuid).b;
            }
            arrayList.add(uuid);
        }
        return o7h.p1(arrayList);
    }

    public static Object u(Function0 function0, onm onmVar) {
        return fn31.Y(o6x.a, new xw0(function0, (lnm) null, (byte) 7), onmVar);
    }

    public static final xj61 v(xbk xbkVar) {
        xj61 xj61Var = new xj61();
        ArrayList<CampaignRoutingWithStatus> arrayListN0 = o7h.N0(xbkVar.e, xbkVar.d);
        ArrayList<Timestamp> arrayList = new ArrayList();
        for (CampaignRoutingWithStatus campaignRoutingWithStatus : arrayListN0) {
            Timestamp timestampO = (campaignRoutingWithStatus.hasStatus() && campaignRoutingWithStatus.o().q()) ? campaignRoutingWithStatus.o().o() : null;
            if (timestampO != null) {
                arrayList.add(timestampO);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (Timestamp timestamp : arrayList) {
            arrayList2.add(Long.valueOf((((long) timestamp.p()) / 1000000) + (timestamp.q() * 1000)));
        }
        Long l = (Long) o7h.G0(arrayList2);
        if (l != null) {
            xj61Var.add(new t9k(xbkVar.a, l.longValue()));
        }
        return cwl1.j(xj61Var);
    }

    public static final l2u0 w(i091 i091Var) {
        jsm0 jsm0Var;
        Long l;
        p091 p091Var = i091Var.i;
        boolean zQ = ebp1.q(i091Var);
        long j = i091Var.d;
        long j2 = i091Var.e;
        lsm0 lsm0Var = i091Var.a;
        return new l2u0(zQ, j, j2, (lsm0Var == null || (jsm0Var = lsm0Var.e) == null || (l = jsm0Var.a) == null) ? 0L : l.longValue(), i091Var.c, i091Var.f, p091Var != null ? Integer.valueOf(p091Var.a) : null, p091Var != null ? Integer.valueOf(p091Var.b) : null, 64);
    }

    public static final Next x(xnb1 xnb1Var, y500 y500Var) {
        vzg1 vzg1Var = xnb1Var.d;
        if (y500Var.equals(a200.a)) {
            return Next.h(xnb1.a(xnb1Var, vzg1.y(vzg1Var, (String) null, pe11.e, 5)));
        }
        if (y500Var instanceof b200) {
            return Next.h(xnb1.a(xnb1Var, vzg1.y(vzg1Var, ((b200) y500Var).a, pe11.c, 4)));
        }
        if (y500Var.equals(z100.a)) {
            return Next.i(xnb1.a(xnb1Var, vzg1.y(vzg1Var, (String) null, pe11.d, 5)), Collections.singleton(new mew(xnb1Var.a)));
        }
        eg.o();
        return null;
    }
}
