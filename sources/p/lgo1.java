package p;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridSection;
import androidx.car.app.model.Header;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.SectionHeader;
import androidx.car.app.model.SectionedItemTemplate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class lgo1 {
    public static final t2b a;
    public static final t2b b;
    public static b180 c;

    static {
        byte b2 = 24;
        a = new t2b(b2);
        b = new t2b(b2);
    }

    public static final void a(hw61 hw61Var, int i, float f, qim0 qim0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, b0k b0kVar, int i2, int i3) {
        int i4;
        Function0 function6;
        int i5;
        Function0 function7;
        Function0 function8;
        int i6;
        Function0 function9;
        Function0 function10;
        Function0 function11;
        Function0 function12;
        int i7;
        Function0 function13;
        int i8;
        float f2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1998199258);
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var.g(hw61Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        int i9 = i4 | (x340Var.d(f) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536);
        int i10 = i3 & 64;
        if (i10 != 0) {
            i5 = i9 | 1572864;
            function6 = function2;
        } else {
            function6 = function2;
            i5 = i9 | (x340Var.i(function6) ? 1048576 : 524288);
        }
        int i11 = i3 & 128;
        if (i11 != 0) {
            i5 |= 12582912;
            function7 = function3;
        } else {
            function7 = function3;
            if ((i2 & 12582912) == 0) {
                i5 |= x340Var.i(function7) ? 8388608 : 4194304;
            }
        }
        int i12 = i3 & 256;
        if (i12 != 0) {
            i5 |= 100663296;
            function8 = function4;
        } else {
            function8 = function4;
            if ((i2 & 100663296) == 0) {
                i5 |= x340Var.i(function8) ? 67108864 : 33554432;
            }
        }
        int i13 = i3 & 512;
        if (i13 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= x340Var.i(function5) ? 536870912 : 268435456;
        }
        int i14 = i5;
        if (x340Var.Y(i14 & 1, (i5 & 306783379) != 306783378)) {
            if (i10 != 0) {
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ng5.P0;
                    x340Var.s0(objT);
                }
                function10 = (Function0) objT;
                i7 = i12;
            } else {
                i7 = i12;
                function10 = function6;
            }
            if (i11 != 0) {
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = ng5.Q0;
                    x340Var.s0(objT2);
                }
                function13 = (Function0) objT2;
            } else {
                function13 = function7;
            }
            if (i7 != 0) {
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = ng5.R0;
                    x340Var.s0(objT3);
                }
                function9 = (Function0) objT3;
                i8 = i13;
            } else {
                i8 = i13;
                function9 = function8;
            }
            if (i8 != 0) {
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = ng5.S0;
                    x340Var.s0(objT4);
                }
                function12 = (Function0) objT4;
            } else {
                function12 = function5;
            }
            float f3 = f / 240.0f;
            boolean zD = ((i14 & 57344) == 16384) | ((i14 & 458752) == 131072) | ((i14 & 29360128) == 8388608) | ((i14 & 234881024) == 67108864) | ((i14 & 112) == 32) | x340Var.d(f3) | ((i14 & 3670016) == 1048576) | ((i14 & 1879048192) == 536870912);
            Object objT5 = x340Var.T();
            if (zD || objT5 == m4cVar) {
                i6 = i;
                qd6 qd6Var = new qd6(function0, function1, function13, function9, i6, f3, function10, function12);
                x340Var.s0(qd6Var);
                objT5 = qd6Var;
            } else {
                i6 = i;
            }
            qim0 qim0VarC = i541.C(qim0Var, (iu30) objT5);
            float f4 = f3 * 3.3333333f;
            long j = u7h.b;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            if (i6 == 1) {
                f2 = 0.3f;
            } else {
                if (i6 != 2) {
                    throw null;
                }
                f2 = 0.35f;
            }
            t1c.a(sto1.k(qim0VarC, hw61Var, new bw61(f4, j, 0.0f, jFloatToRawIntBits, f2, 32, 0)), x340Var, 0);
            function11 = function13;
        } else {
            i6 = i;
            x340Var.b0();
            function9 = function8;
            function10 = function6;
            function11 = function7;
            function12 = function5;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rd6(hw61Var, i6, f, qim0Var, function0, function1, function10, function11, function9, function12, i2, i3);
        }
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void c(j2i j2iVar, Function0 function0, String str, qim0 qim0Var, int i, xu30 xu30Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        xu30 xu30Var2;
        int i7;
        boolean z;
        xu30 xu30Var3;
        int i8;
        h311 h311VarV;
        xu30 xu30Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1811993781);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(j2iVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 == 0) {
            if ((i2 & 24576) == 0) {
                i5 = i;
                i4 |= x340Var.e(i5) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i2) == 0) {
                    xu30Var2 = xu30Var;
                    if (x340Var.i(xu30Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i4 |= i7;
                }
                if ((74899 & i4) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i9 != 0) {
                        i5 = 1;
                    }
                    if (i6 != 0) {
                        xu30Var4 = null;
                    } else {
                        xu30Var4 = xu30Var2;
                    }
                    d(j2iVar, apo.r(-1367892288, new ue0(i5, str, (byte) 1), x340Var), qim0Var, function0, null, xu30Var4, x340Var, (i4 & 14) | 48 | ((i4 >> 3) & 896) | ((i4 << 6) & 7168) | (i4 & 458752), 16);
                    xu30Var3 = xu30Var4;
                } else {
                    x340Var.b0();
                    xu30Var3 = xu30Var2;
                }
                i8 = i5;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mzd(j2iVar, function0, str, qim0Var, i8, xu30Var3, i2, i3);
                }
            }
            i4 |= 196608;
            xu30Var2 = xu30Var;
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i9 != 0) {
                    i5 = 1;
                }
                if (i6 != 0) {
                    xu30Var4 = null;
                } else {
                    xu30Var4 = xu30Var2;
                }
                d(j2iVar, apo.r(-1367892288, new ue0(i5, str, (byte) 1), x340Var), qim0Var, function0, null, xu30Var4, x340Var, (i4 & 14) | 48 | ((i4 >> 3) & 896) | ((i4 << 6) & 7168) | (i4 & 458752), 16);
                xu30Var3 = xu30Var4;
            } else {
                x340Var.b0();
                xu30Var3 = xu30Var2;
            }
            i8 = i5;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mzd(j2iVar, function0, str, qim0Var, i8, xu30Var3, i2, i3);
            }
        }
        i4 |= 24576;
        i5 = i;
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i2) == 0) {
                xu30Var2 = xu30Var;
                if (x340Var.i(xu30Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i9 != 0) {
                    i5 = 1;
                }
                if (i6 != 0) {
                    xu30Var4 = null;
                } else {
                    xu30Var4 = xu30Var2;
                }
                d(j2iVar, apo.r(-1367892288, new ue0(i5, str, (byte) 1), x340Var), qim0Var, function0, null, xu30Var4, x340Var, (i4 & 14) | 48 | ((i4 >> 3) & 896) | ((i4 << 6) & 7168) | (i4 & 458752), 16);
                xu30Var3 = xu30Var4;
            } else {
                x340Var.b0();
                xu30Var3 = xu30Var2;
            }
            i8 = i5;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mzd(j2iVar, function0, str, qim0Var, i8, xu30Var3, i2, i3);
            }
        }
        i4 |= 196608;
        xu30Var2 = xu30Var;
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i9 != 0) {
                i5 = 1;
            }
            if (i6 != 0) {
                xu30Var4 = null;
            } else {
                xu30Var4 = xu30Var2;
            }
            d(j2iVar, apo.r(-1367892288, new ue0(i5, str, (byte) 1), x340Var), qim0Var, function0, null, xu30Var4, x340Var, (i4 & 14) | 48 | ((i4 >> 3) & 896) | ((i4 << 6) & 7168) | (i4 & 458752), 16);
            xu30Var3 = xu30Var4;
        } else {
            x340Var.b0();
            xu30Var3 = xu30Var2;
        }
        i8 = i5;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mzd(j2iVar, function0, str, qim0Var, i8, xu30Var3, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x00a0, please report this as an issue */
    public static final void d(j2i j2iVar, j2i j2iVar2, qim0 qim0Var, Function0 function0, String str, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function1;
        int i4;
        String str2;
        int i5;
        boolean z;
        b0k b0kVar2;
        Function0 function2;
        String str3;
        h311 h311VarV;
        Function0 function3;
        String str4;
        int i6;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1991703555);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(j2iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(j2iVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                i3 |= b0kVar3.i(function1) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (b0kVar3.g(str2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if (b0kVar3.i(xu30Var)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i4 != 0) {
                        str4 = "carousel-item-test-tag";
                    } else {
                        str4 = str2;
                    }
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    qim0 qim0VarN = anm1.N(str4, u291.v(uyn1.z(4.0f, 0.0f, 2, qim0Var), 72.0f));
                    cvx cvxVar2 = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    function2 = function3;
                    cwl1.b(qim0VarN, (tl3) null, (hw61) null, (pgx) null, uyn1.h(1, 0.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(-1207068052, new nzd(j2iVar2, xu30Var, j2iVar), b0kVar3), b0kVar2, 0, 48, 1518);
                    str3 = str4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    function2 = function1;
                    str3 = str2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new bd5(j2iVar, j2iVar2, qim0Var, function2, str3, xu30Var, i, i2, (byte) 2);
                }
            }
            i3 |= 24576;
            str2 = str;
            if ((196608 & i) == 0) {
                if (b0kVar3.i(xu30Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i4 != 0) {
                    str4 = "carousel-item-test-tag";
                } else {
                    str4 = str2;
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                qim0 qim0VarN2 = anm1.N(str4, u291.v(uyn1.z(4.0f, 0.0f, 2, qim0Var), 72.0f));
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                function2 = function3;
                cwl1.b(qim0VarN2, (tl3) null, (hw61) null, (pgx) null, uyn1.h(1, 0.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(-1207068052, new nzd(j2iVar2, xu30Var, j2iVar), b0kVar3), b0kVar2, 0, 48, 1518);
                str3 = str4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                function2 = function1;
                str3 = str2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(j2iVar, j2iVar2, qim0Var, function2, str3, xu30Var, i, i2, (byte) 2);
            }
        }
        i3 |= 3072;
        function1 = function0;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (b0kVar3.g(str2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.i(xu30Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i4 != 0) {
                    str4 = "carousel-item-test-tag";
                } else {
                    str4 = str2;
                }
                uwr uwrVar3 = cbx.a;
                cvx cvxVar5 = cbx.b(b0kVar3).b;
                qim0 qim0VarN3 = anm1.N(str4, u291.v(uyn1.z(4.0f, 0.0f, 2, qim0Var), 72.0f));
                cvx cvxVar6 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                function2 = function3;
                cwl1.b(qim0VarN3, (tl3) null, (hw61) null, (pgx) null, uyn1.h(1, 0.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(-1207068052, new nzd(j2iVar2, xu30Var, j2iVar), b0kVar3), b0kVar2, 0, 48, 1518);
                str3 = str4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                function2 = function1;
                str3 = str2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(j2iVar, j2iVar2, qim0Var, function2, str3, xu30Var, i, i2, (byte) 2);
            }
        }
        i3 |= 24576;
        str2 = str;
        if ((196608 & i) == 0) {
            if (b0kVar3.i(xu30Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i7 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            if (i4 != 0) {
                str4 = "carousel-item-test-tag";
            } else {
                str4 = str2;
            }
            uwr uwrVar4 = cbx.a;
            cvx cvxVar7 = cbx.b(b0kVar3).b;
            qim0 qim0VarN4 = anm1.N(str4, u291.v(uyn1.z(4.0f, 0.0f, 2, qim0Var), 72.0f));
            cvx cvxVar8 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            function2 = function3;
            cwl1.b(qim0VarN4, (tl3) null, (hw61) null, (pgx) null, uyn1.h(1, 0.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(-1207068052, new nzd(j2iVar2, xu30Var, j2iVar), b0kVar3), b0kVar2, 0, 48, 1518);
            str3 = str4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            function2 = function1;
            str3 = str2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(j2iVar, j2iVar2, qim0Var, function2, str3, xu30Var, i, i2, (byte) 2);
        }
    }

    public static final void e(cib0 cib0Var, iu30 iu30Var, qim0 qim0Var, zgb0 zgb0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1019711429);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(cib0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? b0kVar3.g(zgb0Var) : b0kVar3.i(zgb0Var) ? 2048 : 1024;
        }
        boolean z = true;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            m4c m4cVar = fkj0.X;
            b0kVar3.i0(-2038213931);
            if ((((i2 & 112) ^ 48) <= 32 || !b0kVar3.g(iu30Var)) && (i2 & 48) != 32) {
                z = false;
            }
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                mlp mlpVar = zgb0Var.d;
                ygb0 ygb0Var = new ygb0(zgb0Var, iu30Var);
                wdm wdmVar = (wdm) mlpVar.a.c;
                gib0 gib0Var = (gib0) wdmVar.c;
                d0r d0rVar = (d0r) ((jly0) wdmVar.e).get();
                v6q v6qVar = (v6q) gib0Var.h.get();
                c8o.l(v6qVar);
                nib0 nib0Var = (nib0) ((jly0) wdmVar.g).get();
                glk0 glk0Var = (glk0) gib0Var.f.get();
                c8o.l(glk0Var);
                bjb0 bjb0Var = new bjb0(d0rVar, v6qVar, nib0Var, glk0Var, ygb0Var);
                b0kVar3.s0(bjb0Var);
                objT = bjb0Var;
            }
            bjb0 bjb0Var2 = (bjb0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = new dw91();
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            nyx.a(2, (wux) null, apo.r(-1614394712, new uuy((Object) qim0Var2, (Object) cib0Var, (Object) zgb0Var, (Object) iu30Var, objT2, (Object) bjb0Var2, (byte) 13), b0kVar3), b0kVar2, 3078, 6);
            b0kVar2.r(false);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, cib0Var, iu30Var, qim0Var, zgb0Var, (byte) 5);
        }
    }

    public static final void f(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(730636151);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function1) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(qim0Var, 32.0f, 16.0f);
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            gfx.g(8, apo.r(-827071270, new bvk(function0, (byte) 26), x340Var), x340Var, 54);
            gfx.g(1, apo.r(1574413649, new bvk(function1, (byte) 27), x340Var), x340Var, 54);
            x0d.s(qim0Var, 8.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(function0, function1, qim0Var2, i, (byte) 10);
        }
    }

    public static final void g(Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1614414583);
        int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | (b0kVar3.i(function1) ? 32 : 16) | (b0kVar3.i(function2) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            vy71 vy71VarF = dem0.f(0, 3, b0kVar3, (iu30) null, false);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cua cuaVar2 = cbx.b(b0kVar3).f;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            dem0.a(function0, qim0Var3, vy71VarF, 0.0f, false, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12), 0L, 0L, 0.0f, 0L, jli.a, (vu30) null, (eem0) null, apo.r(1446809685, new myq(function1, function2, (byte) 1), b0kVar3), b0kVar2, (i2 & 14) | 48, 3078, 7128);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n3n(function0, function1, function2, qim0Var2, i, (byte) 1);
        }
    }

    public static final void h(zrm zrmVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        xu30 xu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1364730836);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(zrmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uvx uvxVar = new uvx(0, (pgx) null, 0, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
            String str = zrmVar.c;
            xu30 xu30VarR = null;
            if (str == null) {
                b0kVar3.i0(536091234);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(536091235);
                xu30 xu30VarR2 = apo.r(1333906404, new kaf(str, (byte) 16), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR2;
            }
            String str2 = zrmVar.b;
            if (str2 == null) {
                b0kVar3.i0(536416734);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(536416735);
                xu30VarR = apo.r(-205779743, new kaf(str2, (byte) 17), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(null, uvxVar, null, false, null, null, null, null, null, xu30Var, null, xu30VarR, null, null, null, apo.r(-2113451240, new mgl(zrmVar, (byte) 9), b0kVar3), b0kVar2, 64, 196608, 30205);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) zrmVar, i, (byte) 17);
        }
    }

    public static final void i(int i, xtb0 xtb0Var, kzt kztVar, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        kzt kztVar2;
        xtb0 xtb0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1478204782);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(xtb0Var) ? 32 : 16) | (x340Var.g(kztVar) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new ih1(xtb0Var, (byte) 24));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = yv91.a(new ih1(xtb0Var, (byte) 25));
                x340Var.s0(objT2);
            }
            if (((Number) ((tob1) objT2).getValue()).intValue() <= 100 || ((Boolean) tob1Var.getValue()).booleanValue()) {
                qim0Var2 = qim0Var;
                kztVar2 = kztVar;
                xtb0Var2 = xtb0Var;
                x340Var.i0(899509364);
                x340Var.r(false);
            } else {
                x340Var.i0(899419030);
                kztVar.a(xtb0Var, qim0Var, Integer.valueOf(i), x340Var, ((i3 >> 3) & 14) | ((i3 >> 6) & 112) | ((i3 << 6) & 896) | ((i3 << 3) & 7168));
                kztVar2 = kztVar;
                xtb0Var2 = xtb0Var;
                qim0Var2 = qim0Var;
                x340Var.r(false);
            }
        } else {
            qim0Var2 = qim0Var;
            kztVar2 = kztVar;
            xtb0Var2 = xtb0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(i, xtb0Var2, kztVar2, qim0Var2, i2);
        }
    }

    public static final void j(int i, List list, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1768969860);
        int i2 = i | (x340Var.i(list) ? 4 : 2) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131957794);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, u291.B(nim0.a, (gra) null, 3), cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            x340Var.i0(1951567287);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                j2iVar.J(Integer.valueOf(i3), (eeo0) obj, x340Var, 384);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new deo0(list, j2iVar, qim0Var, i);
        }
    }

    public static final void k(String str, Double d, Double d2, Double d3, Double d4, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1215532489);
        int i10 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(d) ? 32 : 16) | (b0kVar3.g(d2) ? 256 : 128) | (b0kVar3.g(d3) ? 2048 : 1024) | (b0kVar3.g(d4) ? 16384 : 8192) | 196608;
        if (b0kVar3.Y(i10 & 1, (74899 & i10) != 74898)) {
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            vex vexVar = (vex) zscVar.b;
            yex yexVar = (yex) zscVar.d;
            long j = vexVar.f;
            if (str != null) {
                i2 = -1058772855;
                i3 = 2131962027;
            } else {
                i2 = -1058670059;
                i3 = 2131962187;
            }
            m0c1 m0c1Var = new m0c1(j, x0d.k(b0kVar3, i2, i3, b0kVar3, false), d);
            long j2 = ((vex) zscVar.b).j;
            if (str != null) {
                i4 = -1058406590;
                i5 = 2131962029;
            } else {
                i4 = -1058296943;
                i5 = 2131962185;
            }
            m0c1 m0c1Var2 = new m0c1(j2, x0d.k(b0kVar3, i4, i5, b0kVar3, false), d2);
            long j3 = yexVar.g;
            if (str != null) {
                i6 = -1058033722;
                i7 = 2131962028;
            } else {
                i6 = -1057928043;
                i7 = 2131962184;
            }
            m0c1 m0c1Var3 = new m0c1(j3, x0d.k(b0kVar3, i6, i7, b0kVar3, false), d3);
            long j4 = yexVar.e;
            if (str != null) {
                i8 = -1057672913;
                i9 = 2131962026;
            } else {
                i8 = -1057575914;
                i9 = 2131962186;
            }
            c380 c380VarA = mqo1.A(p7h.M(new m0c1[]{m0c1Var, m0c1Var2, m0c1Var3, new m0c1(j4, x0d.k(b0kVar3, i8, i9, b0kVar3, false), d4)}));
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), null, null, false, null, null, null, null, null, null, null, null, null, apo.r(-370990403, new ql50(c380VarA, (byte) 5), b0kVar3), null, apo.r(-1739451013, new dba1(str, (byte) 1), b0kVar3), b0kVar2, 0, 199680, 24574);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(str, d, d2, d3, d4, qim0Var2, i, (byte) 13);
        }
    }

    public static final void l(m0c1 m0c1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1191325898);
        int i2 = i | (x340Var.g(m0c1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.N0;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = axb1.T0;
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarB);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            zov0 zov0Var = cbx.b(x340Var).g;
            t1c.a(dug.f(i1p1.q(u291.r(qim0VarB2, 12.0f), er31.a), m0c1Var.a, d4o1.a), x340Var, 0);
            uwo1.e(m0c1Var.b, u291.f(nim0Var, 0.4f), cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            String strX = oho1.x(m0c1Var.c, x340Var);
            lee1 lee1Var = cbx.d(x340Var).j;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(strX, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wh91(m0c1Var, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    public static final void m(c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(225800896);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            float f = 1.0f;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarQ = i1p1.q(u291.h(uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 12.0f, 7), 8.0f), er31.a);
            long j = ((yex) zex.a.d).e;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF2 = dug.f(qim0VarQ, j, u5j1Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Iterator it = c380Var.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                Double d = ((m0c1) it.next()).c;
                dDoubleValue += d != null ? d.doubleValue() : 0.0d;
            }
            x340Var.i0(-1440959225);
            Iterator it2 = c380Var.iterator();
            float fDoubleValue = 0.0f;
            while (it2.hasNext()) {
                m0c1 m0c1Var = (m0c1) it2.next();
                Double d2 = m0c1Var.c;
                if (d2 != null) {
                    if (d2.doubleValue() < 1.0d) {
                        d2 = null;
                    }
                    if (d2 != null) {
                        fDoubleValue += (float) (d2.doubleValue() / dDoubleValue);
                        t1c.a(lrn1.x(dug.f(u291.c(u291.f(nim0Var, fDoubleValue > f ? f : fDoubleValue), f), m0c1Var.a, u5j1Var), -fDoubleValue), x340Var, 0);
                    }
                }
                it2 = it2;
                f = 1.0f;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i90(c380Var, i, (byte) 14);
        }
    }

    public static dah n(b0k b0kVar) {
        return (dah) ((x340) b0kVar).k(eah.a);
    }

    public static jnm0 o(b0k b0kVar) {
        return (jnm0) ((x340) b0kVar).k(ich0.a);
    }

    public static mx61 p(b0k b0kVar) {
        return (mx61) ((x340) b0kVar).k(px61.a);
    }

    public static k2h1 q(b0k b0kVar) {
        return (k2h1) ((x340) b0kVar).k(o2h1.a);
    }

    public static final GridSection r(String str, List list, int i, Function0 function0, b8p1 b8p1Var, SectionHeader sectionHeader) {
        qg50 qg50Var = new qg50();
        if (sectionHeader != null) {
            qg50Var.c = sectionHeader;
        } else if (str == null) {
            qg50Var.b = null;
        } else {
            CarText carTextCreate = CarText.create(str);
            trd.e.b(carTextCreate);
            qg50Var.b = carTextCreate;
        }
        qg50Var.f = i;
        byte b2 = 0;
        qg50Var.g = ((sectionHeader != null ? sectionHeader.getOnClickDelegate() : null) == null || list.size() <= 4) ? 0 : 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qg50Var.a.add((GridItem) it.next());
        }
        qg50Var.e = OnItemVisibilityChangedDelegateImpl.create(new qj51(b8p1Var, list, function0, b2));
        return new GridSection(qg50Var, 0);
    }

    public static final boolean s(qvy0 qvy0Var) {
        if (qvy0Var instanceof vjq0) {
            return ((vjq0) qvy0Var).e;
        }
        return false;
    }

    public static RowSection t(String str, List list, String str2, Function0 function0, b8p1 b8p1Var, SectionHeader sectionHeader, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        if ((i & 16) != 0) {
            b8p1Var = null;
        }
        if ((i & 32) != 0) {
            sectionHeader = null;
        }
        qw31 qw31Var = new qw31();
        if (sectionHeader != null) {
            qw31Var.c = sectionHeader;
        } else if (str != null) {
            CarText carTextCreate = CarText.create(str);
            trd.e.b(carTextCreate);
            qw31Var.b = carTextCreate;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qw31Var.a.add((Row) it.next());
        }
        qw31Var.e = OnItemVisibilityChangedDelegateImpl.create(new qj51(b8p1Var, list, function0, (byte) 1));
        if (str2 != null) {
            CarText carTextCreate2 = CarText.create(str2);
            trd.e.b(carTextCreate2);
            qw31Var.d = carTextCreate2;
        }
        return qw31Var.a();
    }

    public static final PaneTemplate u(Header header, evc evcVar, Action action, List list) {
        knr0 knr0Var = new knr0();
        knr0Var.c = false;
        if (evcVar != null) {
            knr0Var.d = lnn1.r(evcVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Row row = (Row) it.next();
            Objects.requireNonNull(row);
            knr0Var.a.add(row);
        }
        if (action != null) {
            knr0Var.b.add(action);
        }
        Pane paneA = knr0Var.a();
        rnr0 rnr0Var = new rnr0();
        rnr0Var.b = paneA;
        rnr0Var.b(header);
        return rnr0Var.a();
    }

    public static SectionedItemTemplate v(List list) {
        kwc kwcVar = new kwc(2131953095);
        Header headerR = x1p1.r(null, Action.BACK, null, 5);
        pj51 pj51Var = new pj51();
        qw31 qw31Var = new qw31();
        CharSequence charSequenceB = hon1.B(kwcVar);
        if (charSequenceB == null) {
            qw31Var.d = null;
        } else {
            CarText carTextCreate = CarText.create(charSequenceB);
            trd.e.b(carTextCreate);
            qw31Var.d = carTextCreate;
        }
        pj51Var.a = Collections.singletonList(qw31Var.a());
        pj51Var.c = headerR;
        pj51Var.b(list);
        return pj51Var.a();
    }

    public static SectionedItemTemplate w(boolean z, Header header, List list, List list2, int i) {
        if ((i & 2) != 0) {
            header = null;
        }
        if ((i & 8) != 0) {
            list2 = z6x.a;
        }
        pj51 pj51Var = new pj51();
        if (header != null) {
            pj51Var.c = header;
        }
        pj51Var.a = list2;
        pj51Var.d = z;
        pj51Var.b(list);
        pj51Var.e = false;
        return pj51Var.a();
    }

    public static /* synthetic */ boolean x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, nvn1 nvn1Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(nvn1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(nvn1Var) != obj && atomicReferenceFieldUpdater.get(nvn1Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
