package p;

import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class rb91 {
    public static final long a = jhc1.c(4.0f, 44.0f);
    public static final float b;
    public static final float c;
    public static final k5j1 d;

    static {
        jhc1.c(44.0f, 4.0f);
        b = 6.0f;
        c = 2.0f;
        d = new k5j1(ob91.a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:123:0x016a  */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0178  */
    /* JADX WARN: Code duplicated, block: B:129:0x017b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0188  */
    /* JADX WARN: Code duplicated, block: B:135:0x018b  */
    /* JADX WARN: Code duplicated, block: B:136:0x018e  */
    /* JADX WARN: Code duplicated, block: B:140:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x019f  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01be  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:157:0x020d  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    public static final void a(final float f, final iu30 iu30Var, final qim0 qim0Var, boolean z, Function0 function0, fb91 fb91Var, idn0 idn0Var, int i, final j2i j2iVar, final j2i j2iVar2, final ksg ksgVar, b0k b0kVar, final int i2, final int i3, final int i4) {
        int i5;
        qim0 qim0Var2;
        boolean z2;
        int i6;
        Function0 function1;
        int i7;
        fb91 fb91Var2;
        int i8;
        idn0 idn0Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        b0k b0kVar2;
        final int i14;
        final idn0 idn0Var3;
        final boolean z4;
        final Function0 function2;
        final fb91 fb91Var3;
        h311 h311VarV;
        Function0 function3;
        fb91 fb91VarD;
        idn0 idn0Var4;
        int i15;
        idn0 idn0Var5;
        Object objT;
        boolean z5;
        boolean z6;
        Object objT2;
        int i16;
        int i17;
        int i18;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(985901935);
        if ((i2 & 6) == 0) {
            i5 = (b0kVar3.d(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            qim0Var2 = qim0Var;
            i5 |= b0kVar3.g(qim0Var2) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            qim0Var2 = qim0Var;
        }
        int i19 = i4 & 8;
        if (i19 == 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i5 |= b0kVar3.h(z2) ? SemanticState.Modal : SemanticState.ReadOnly;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    function1 = function0;
                    if (b0kVar3.i(function1)) {
                        i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i7 = SemanticState.Multiline;
                    }
                    i5 |= i7;
                }
                if ((196608 & i2) == 0) {
                    if ((i4 & 32) == 0) {
                        fb91Var2 = fb91Var;
                        int i20 = b0kVar3.g(fb91Var2) ? 131072 : 65536;
                        i5 |= i20;
                    } else {
                        fb91Var2 = fb91Var;
                    }
                    i5 |= i20;
                } else {
                    fb91Var2 = fb91Var;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    idn0Var2 = idn0Var;
                } else {
                    idn0Var2 = idn0Var;
                    if ((i2 & 1572864) == 0) {
                        if (b0kVar3.g(idn0Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i5 |= i9;
                    }
                }
                i10 = i4 & SemanticState.Focused;
                i11 = i5;
                if (i10 != 0) {
                    i11 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (b0kVar3.e(i)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i11 |= i12;
                }
                if ((i2 & 100663296) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i11 |= i18;
                }
                if ((i2 & 805306368) == 0) {
                    if (b0kVar3.i(j2iVar2)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i11 |= i17;
                }
                if ((i3 & 6) == 0) {
                    if (b0kVar3.g(ksgVar)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i13 = i3 | i16;
                } else {
                    i13 = i3;
                }
                if ((i11 & 306783379) == 306783378 || (i13 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i11 & 1, z3)) {
                    b0kVar3.d0();
                    if ((i2 & 1) != 0 || b0kVar3.E()) {
                        if (i19 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 32) != 0) {
                            lb91 lb91Var = lb91.a;
                            fb91VarD = lb91.d(b0kVar3);
                            i11 &= -458753;
                        } else {
                            fb91VarD = fb91Var2;
                        }
                        if (i8 != 0) {
                            objT = b0kVar3.T();
                            if (objT == obj) {
                                objT = ktd.n(b0kVar3);
                            }
                            idn0Var4 = (idn0) objT;
                        } else {
                            idn0Var4 = idn0Var2;
                        }
                        if (i10 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        idn0Var5 = idn0Var4;
                    } else {
                        b0kVar3.b0();
                        if ((i4 & 32) != 0) {
                            i11 &= -458753;
                        }
                        idn0Var5 = idn0Var2;
                        function3 = function1;
                        fb91VarD = fb91Var2;
                        i15 = i;
                    }
                    boolean z7 = z2;
                    b0kVar3.s();
                    if ((i11 & 29360128) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((((i13 & 14) ^ 6) <= 4 && b0kVar3.g(ksgVar)) || (i13 & 6) == 4);
                    objT2 = b0kVar3.T();
                    if (z6 || objT2 == obj) {
                        objT2 = new tb91(f, i15, function3, ksgVar);
                        b0kVar3.s0(objT2);
                    }
                    tb91 tb91Var = (tb91) objT2;
                    tb91Var.b = function3;
                    tb91Var.e = iu30Var;
                    tb91Var.d(f);
                    int i21 = i11 >> 9;
                    b0kVar2 = b0kVar3;
                    b(tb91Var, qim0Var2, z7, null, idn0Var5, j2iVar, j2iVar2, b0kVar2, ((i11 >> 3) & ContentMediaFormat.PREVIEW_EPISODE) | ((i11 >> 6) & 57344) | (458752 & i21) | (i21 & 3670016));
                    fb91 fb91Var4 = fb91VarD;
                    i14 = i15;
                    fb91Var3 = fb91Var4;
                    function2 = function3;
                    z4 = z7;
                    idn0Var3 = idn0Var5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    i14 = i;
                    idn0Var3 = idn0Var2;
                    z4 = z2;
                    function2 = function1;
                    fb91Var3 = fb91Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.mb91
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = czo1.p(i2 | 1);
                            int iP2 = czo1.p(i3);
                            rb91.a(f, iu30Var, qim0Var, z4, function2, fb91Var3, idn0Var3, i14, j2iVar, j2iVar2, ksgVar, (b0k) obj2, iP, iP2, i4);
                            return rih1.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            function1 = function0;
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    fb91Var2 = fb91Var;
                    if (b0kVar3.g(fb91Var2)) {
                    }
                    i5 |= i20;
                } else {
                    fb91Var2 = fb91Var;
                }
                i5 |= i20;
            } else {
                fb91Var2 = fb91Var;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                idn0Var2 = idn0Var;
            } else {
                idn0Var2 = idn0Var;
                if ((i2 & 1572864) == 0) {
                    if (b0kVar3.g(idn0Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i10 = i4 & SemanticState.Focused;
            i11 = i5;
            if (i10 != 0) {
                i11 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (b0kVar3.e(i)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i11 |= i12;
            }
            if ((i2 & 100663296) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i11 |= i18;
            }
            if ((i2 & 805306368) == 0) {
                if (b0kVar3.i(j2iVar2)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i11 |= i17;
            }
            if ((i3 & 6) == 0) {
                if (b0kVar3.g(ksgVar)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i13 = i3 | i16;
            } else {
                i13 = i3;
            }
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar3.Y(i11 & 1, z3)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 32) != 0) {
                        lb91 lb91Var2 = lb91.a;
                        fb91VarD = lb91.d(b0kVar3);
                        i11 &= -458753;
                    } else {
                        fb91VarD = fb91Var2;
                    }
                    if (i8 != 0) {
                        objT = b0kVar3.T();
                        if (objT == obj) {
                            objT = ktd.n(b0kVar3);
                        }
                        idn0Var4 = (idn0) objT;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    if (i10 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    idn0Var5 = idn0Var4;
                } else {
                    if (i19 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 32) != 0) {
                        lb91 lb91Var3 = lb91.a;
                        fb91VarD = lb91.d(b0kVar3);
                        i11 &= -458753;
                    } else {
                        fb91VarD = fb91Var2;
                    }
                    if (i8 != 0) {
                        objT = b0kVar3.T();
                        if (objT == obj) {
                            objT = ktd.n(b0kVar3);
                        }
                        idn0Var4 = (idn0) objT;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    if (i10 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    idn0Var5 = idn0Var4;
                }
                boolean z8 = z2;
                b0kVar3.s();
                if ((i11 & 29360128) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((((i13 & 14) ^ 6) <= 4 && b0kVar3.g(ksgVar)) || (i13 & 6) == 4);
                objT2 = b0kVar3.T();
                if (z6) {
                    objT2 = new tb91(f, i15, function3, ksgVar);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new tb91(f, i15, function3, ksgVar);
                    b0kVar3.s0(objT2);
                }
                tb91 tb91Var2 = (tb91) objT2;
                tb91Var2.b = function3;
                tb91Var2.e = iu30Var;
                tb91Var2.d(f);
                int i22 = i11 >> 9;
                b0kVar2 = b0kVar3;
                b(tb91Var2, qim0Var2, z8, null, idn0Var5, j2iVar, j2iVar2, b0kVar2, ((i11 >> 3) & ContentMediaFormat.PREVIEW_EPISODE) | ((i11 >> 6) & 57344) | (458752 & i22) | (i22 & 3670016));
                fb91 fb91Var5 = fb91VarD;
                i14 = i15;
                fb91Var3 = fb91Var5;
                function2 = function3;
                z4 = z8;
                idn0Var3 = idn0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                i14 = i;
                idn0Var3 = idn0Var2;
                z4 = z2;
                function2 = function1;
                fb91Var3 = fb91Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.mb91
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = czo1.p(i2 | 1);
                        int iP2 = czo1.p(i3);
                        rb91.a(f, iu30Var, qim0Var, z4, function2, fb91Var3, idn0Var3, i14, j2iVar, j2iVar2, ksgVar, (b0k) obj2, iP, iP2, i4);
                        return rih1.a;
                    }
                };
            }
        }
        i5 |= 3072;
        z2 = z;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                function1 = function0;
                if (b0kVar3.i(function1)) {
                    i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i7 = SemanticState.Multiline;
                }
                i5 |= i7;
            }
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    fb91Var2 = fb91Var;
                    if (b0kVar3.g(fb91Var2)) {
                    }
                    i5 |= i20;
                } else {
                    fb91Var2 = fb91Var;
                }
                i5 |= i20;
            } else {
                fb91Var2 = fb91Var;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                idn0Var2 = idn0Var;
            } else {
                idn0Var2 = idn0Var;
                if ((i2 & 1572864) == 0) {
                    if (b0kVar3.g(idn0Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i10 = i4 & SemanticState.Focused;
            i11 = i5;
            if (i10 != 0) {
                i11 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (b0kVar3.e(i)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i11 |= i12;
            }
            if ((i2 & 100663296) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i11 |= i18;
            }
            if ((i2 & 805306368) == 0) {
                if (b0kVar3.i(j2iVar2)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i11 |= i17;
            }
            if ((i3 & 6) == 0) {
                if (b0kVar3.g(ksgVar)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i13 = i3 | i16;
            } else {
                i13 = i3;
            }
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar3.Y(i11 & 1, z3)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 32) != 0) {
                        lb91 lb91Var4 = lb91.a;
                        fb91VarD = lb91.d(b0kVar3);
                        i11 &= -458753;
                    } else {
                        fb91VarD = fb91Var2;
                    }
                    if (i8 != 0) {
                        objT = b0kVar3.T();
                        if (objT == obj) {
                            objT = ktd.n(b0kVar3);
                        }
                        idn0Var4 = (idn0) objT;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    if (i10 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    idn0Var5 = idn0Var4;
                } else {
                    if (i19 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 32) != 0) {
                        lb91 lb91Var5 = lb91.a;
                        fb91VarD = lb91.d(b0kVar3);
                        i11 &= -458753;
                    } else {
                        fb91VarD = fb91Var2;
                    }
                    if (i8 != 0) {
                        objT = b0kVar3.T();
                        if (objT == obj) {
                            objT = ktd.n(b0kVar3);
                        }
                        idn0Var4 = (idn0) objT;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    if (i10 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    idn0Var5 = idn0Var4;
                }
                boolean z9 = z2;
                b0kVar3.s();
                if ((i11 & 29360128) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((((i13 & 14) ^ 6) <= 4 && b0kVar3.g(ksgVar)) || (i13 & 6) == 4);
                objT2 = b0kVar3.T();
                if (z6) {
                    objT2 = new tb91(f, i15, function3, ksgVar);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new tb91(f, i15, function3, ksgVar);
                    b0kVar3.s0(objT2);
                }
                tb91 tb91Var3 = (tb91) objT2;
                tb91Var3.b = function3;
                tb91Var3.e = iu30Var;
                tb91Var3.d(f);
                int i23 = i11 >> 9;
                b0kVar2 = b0kVar3;
                b(tb91Var3, qim0Var2, z9, null, idn0Var5, j2iVar, j2iVar2, b0kVar2, ((i11 >> 3) & ContentMediaFormat.PREVIEW_EPISODE) | ((i11 >> 6) & 57344) | (458752 & i23) | (i23 & 3670016));
                fb91 fb91Var6 = fb91VarD;
                i14 = i15;
                fb91Var3 = fb91Var6;
                function2 = function3;
                z4 = z9;
                idn0Var3 = idn0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                i14 = i;
                idn0Var3 = idn0Var2;
                z4 = z2;
                function2 = function1;
                fb91Var3 = fb91Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.mb91
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = czo1.p(i2 | 1);
                        int iP2 = czo1.p(i3);
                        rb91.a(f, iu30Var, qim0Var, z4, function2, fb91Var3, idn0Var3, i14, j2iVar, j2iVar2, ksgVar, (b0k) obj2, iP, iP2, i4);
                        return rih1.a;
                    }
                };
            }
        }
        i5 |= 24576;
        function1 = function0;
        if ((196608 & i2) == 0) {
            if ((i4 & 32) == 0) {
                fb91Var2 = fb91Var;
                if (b0kVar3.g(fb91Var2)) {
                }
                i5 |= i20;
            } else {
                fb91Var2 = fb91Var;
            }
            i5 |= i20;
        } else {
            fb91Var2 = fb91Var;
        }
        i8 = i4 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
            idn0Var2 = idn0Var;
        } else {
            idn0Var2 = idn0Var;
            if ((i2 & 1572864) == 0) {
                if (b0kVar3.g(idn0Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
        }
        i10 = i4 & SemanticState.Focused;
        i11 = i5;
        if (i10 != 0) {
            i11 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (b0kVar3.e(i)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i11 |= i12;
        }
        if ((i2 & 100663296) == 0) {
            if (b0kVar3.i(j2iVar)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i11 |= i18;
        }
        if ((i2 & 805306368) == 0) {
            if (b0kVar3.i(j2iVar2)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i11 |= i17;
        }
        if ((i3 & 6) == 0) {
            if (b0kVar3.g(ksgVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i13 = i3 | i16;
        } else {
            i13 = i3;
        }
        if ((i11 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (b0kVar3.Y(i11 & 1, z3)) {
            b0kVar3.d0();
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if ((i4 & 32) != 0) {
                    lb91 lb91Var6 = lb91.a;
                    fb91VarD = lb91.d(b0kVar3);
                    i11 &= -458753;
                } else {
                    fb91VarD = fb91Var2;
                }
                if (i8 != 0) {
                    objT = b0kVar3.T();
                    if (objT == obj) {
                        objT = ktd.n(b0kVar3);
                    }
                    idn0Var4 = (idn0) objT;
                } else {
                    idn0Var4 = idn0Var2;
                }
                if (i10 != 0) {
                    i15 = 0;
                } else {
                    i15 = i;
                }
                idn0Var5 = idn0Var4;
            } else {
                if (i19 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if ((i4 & 32) != 0) {
                    lb91 lb91Var7 = lb91.a;
                    fb91VarD = lb91.d(b0kVar3);
                    i11 &= -458753;
                } else {
                    fb91VarD = fb91Var2;
                }
                if (i8 != 0) {
                    objT = b0kVar3.T();
                    if (objT == obj) {
                        objT = ktd.n(b0kVar3);
                    }
                    idn0Var4 = (idn0) objT;
                } else {
                    idn0Var4 = idn0Var2;
                }
                if (i10 != 0) {
                    i15 = 0;
                } else {
                    i15 = i;
                }
                idn0Var5 = idn0Var4;
            }
            boolean z10 = z2;
            b0kVar3.s();
            if ((i11 & 29360128) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | ((((i13 & 14) ^ 6) <= 4 && b0kVar3.g(ksgVar)) || (i13 & 6) == 4);
            objT2 = b0kVar3.T();
            if (z6) {
                objT2 = new tb91(f, i15, function3, ksgVar);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new tb91(f, i15, function3, ksgVar);
                b0kVar3.s0(objT2);
            }
            tb91 tb91Var4 = (tb91) objT2;
            tb91Var4.b = function3;
            tb91Var4.e = iu30Var;
            tb91Var4.d(f);
            int i24 = i11 >> 9;
            b0kVar2 = b0kVar3;
            b(tb91Var4, qim0Var2, z10, null, idn0Var5, j2iVar, j2iVar2, b0kVar2, ((i11 >> 3) & ContentMediaFormat.PREVIEW_EPISODE) | ((i11 >> 6) & 57344) | (458752 & i24) | (i24 & 3670016));
            fb91 fb91Var7 = fb91VarD;
            i14 = i15;
            fb91Var3 = fb91Var7;
            function2 = function3;
            z4 = z10;
            idn0Var3 = idn0Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            i14 = i;
            idn0Var3 = idn0Var2;
            z4 = z2;
            function2 = function1;
            fb91Var3 = fb91Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.mb91
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(i2 | 1);
                    int iP2 = czo1.p(i3);
                    rb91.a(f, iu30Var, qim0Var, z4, function2, fb91Var3, idn0Var3, i14, j2iVar, j2iVar2, ksgVar, (b0k) obj2, iP, iP2, i4);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(tb91 tb91Var, qim0 qim0Var, boolean z, fb91 fb91Var, idn0 idn0Var, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i) {
        int i2;
        fb91 fb91Var2;
        int i3;
        fb91 fb91VarD;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(409861960);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(tb91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(idn0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                lb91 lb91Var = lb91.a;
                i3 = i2 & (-7169);
                fb91VarD = lb91.d(x340Var);
            } else {
                x340Var.b0();
                i3 = i2 & (-7169);
                fb91VarD = fb91Var;
            }
            x340Var.s();
            if (tb91Var.a < 0) {
                hhg1.n("steps should be >= 0");
                return;
            } else {
                int i4 = i3 >> 3;
                c(qim0Var, tb91Var, z, idn0Var, j2iVar, j2iVar2, x340Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                fb91Var2 = fb91VarD;
            }
        } else {
            x340Var.b0();
            fb91Var2 = fb91Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kvf(tb91Var, qim0Var, z, fb91Var2, idn0Var, j2iVar, j2iVar2, i);
        }
    }

    public static final void c(qim0 qim0Var, tb91 tb91Var, boolean z, idn0 idn0Var, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar3;
        tb91 tb91Var2;
        Object obj;
        Object obj2;
        boolean z2;
        Object obj3;
        j2i j2iVar4 = j2iVar2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(898172835);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tb91Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(idn0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar4) ? 131072 : 65536;
        }
        int i3 = i2;
        boolean z3 = false;
        if (x340Var.Y(i3 & 1, (i3 & 74899) != 74898)) {
            boolean z4 = x340Var.k(t4k.n) == flb0.b;
            tb91Var.j = z4;
            drr0 drr0Var = tb91Var.d;
            qqq0 qqq0Var = tb91Var.m;
            if (qqq0Var == qqq0.b && z4) {
                z3 = true;
            }
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarC = z ? f8d1.c(qim0Var2, tb91Var, idn0Var, new vix(tb91Var, (byte) 2)) : qim0Var2;
            qqq0 qqq0Var2 = tb91Var.m;
            boolean zBooleanValue = ((Boolean) tb91Var.n.getValue()).booleanValue();
            boolean zI = x340Var.i(tb91Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                xx0 xx0Var = new xx0(tb91Var, (lnm) null, (byte) 24);
                x340Var.s0(xx0Var);
                obj = xx0Var;
            } else {
                obj = objT;
            }
            qim0 qim0Var3 = qim0VarC;
            qim0 qim0VarB = k6v.b(qim0Var2, tb91Var, qqq0Var2, z, idn0Var, zBooleanValue, null, (xu30) obj, z3, 32);
            boolean z5 = z3;
            tb91Var2 = tb91Var;
            gb91 gb91Var = gb91.a;
            byte b2 = 3;
            qqq0 qqq0Var3 = qqq0.a;
            qim0 qim0VarZ = qqq0Var == qqq0Var3 ? u291.z(t3k1.x(qim0Var2, gb91Var), (fra) null, 3) : u291.D(t3k1.x(qim0Var2, gb91Var), (era) null, 3);
            vq60 vq60Var = jw80.a;
            qim0 qim0VarB2 = s161.b(u291.o(qim0Var.then(tsj0.a), qqq0Var == qqq0Var3 ? 16.0f : 4.0f, qqq0Var == qqq0Var3 ? 4.0f : 16.0f, 0.0f, 0.0f, 12), false, new r4e1(z, tb91Var2, b2));
            ksg ksgVar = tb91Var2.c;
            qim0 qim0VarThen = qim0VarB2.then(qqq0Var == qqq0Var3 ? fh.b : fh.a);
            final float fS = drr0Var.s();
            final jsg jsgVar = new jsg(((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue());
            final int i4 = tb91Var2.a;
            qim0 qim0VarT = qxy0.t(s161.b(qim0VarThen, true, new iu30() { // from class: p.dix0
                public final Object invoke(Object obj4) {
                    Float fValueOf = Float.valueOf(fS);
                    ksg ksgVar2 = jsgVar;
                    b261.w((e261) obj4, new vfx0(((Number) yoi1.u(fValueOf, ksgVar2)).floatValue(), ksgVar2, i4));
                    return rih1.a;
                }
            }), z, idn0Var);
            int i5 = tb91Var2.a;
            qim0 qim0Var4 = qim0VarZ;
            ksg ksgVar2 = tb91Var2.c;
            float fS2 = drr0Var.s();
            iu30 iu30Var = tb91Var2.e;
            Function0 function0 = tb91Var2.b;
            if (i5 < 0) {
                hhg1.n("steps should be >= 0");
                return;
            }
            byte b3 = 3;
            qim0 qim0VarThen2 = y9g1.s(qim0VarT, new qb91(z, iu30Var, ksgVar2, i5, z5, fS2, function0)).then(qim0Var3).then(qim0VarB);
            boolean zI2 = x340Var.i(tb91Var2);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                obj2 = objT2;
                hu6 hu6Var = new hu6(tb91Var2, b3);
                x340Var.s0(hu6Var);
                obj2 = hu6Var;
            }
            gfh0 gfh0Var = (gfh0) obj2;
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean zI3 = x340Var.i(tb91Var2);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                z2 = false;
                nb91 nb91Var = new nb91(tb91Var2, false ? 1 : 0);
                x340Var.s0(nb91Var);
                obj3 = nb91Var;
            } else {
                z2 = false;
                obj3 = objT3;
            }
            qim0 qim0VarU = lrn1.u(qim0Var4, (iu30) obj3);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, z2);
            int iK2 = tgp1.k(x340Var);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarU);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i6 = (i3 >> 3) & 14;
            j2iVar3 = j2iVar;
            j2iVar3.invoke(tb91Var2, x340Var, Integer.valueOf(((i3 >> 9) & ContentType.LONG_FORM_ON_DEMAND) | i6));
            x340Var.r(true);
            qim0 qim0VarX = t3k1.x(qim0Var2, gb91.b);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iK3 = tgp1.k(x340Var);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK3))) {
                z5c.f(iK3, x340Var, iK3, lljVar3);
            }
            nko1.H(qim0VarE3, x340Var, lljVar4);
            j2iVar4 = j2iVar2;
            j2iVar4.invoke(tb91Var2, x340Var, Integer.valueOf(i6 | ((i3 >> 12) & ContentType.LONG_FORM_ON_DEMAND)));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            j2iVar3 = j2iVar;
            tb91Var2 = tb91Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ifa(qim0Var, tb91Var2, z, idn0Var, j2iVar3, j2iVar4, i);
        }
    }

    public static final float d(float f, float f2, float f3, float[] fArr) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f4);
            } else {
                float fAbs = Math.abs(dm5.T(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float fAbs2 = Math.abs(dm5.T(f2, f3, f5) - f);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f4 = f5;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? dm5.T(f2, f3, fValueOf.floatValue()) : f;
    }
}
