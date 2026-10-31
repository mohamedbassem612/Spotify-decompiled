package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jsj1 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsj1(msj1 msj1Var, boolean z, boolean z2, boolean z3) {
        super(2);
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0203  */
    /* JADX WARN: Code duplicated, block: B:113:0x0211  */
    /* JADX WARN: Code duplicated, block: B:115:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x0235  */
    /* JADX WARN: Code duplicated, block: B:120:0x0240  */
    /* JADX WARN: Code duplicated, block: B:122:0x0258  */
    /* JADX WARN: Code duplicated, block: B:123:0x0271  */
    /* JADX WARN: Code duplicated, block: B:125:0x028f  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:157:0x0305  */
    /* JADX WARN: Code duplicated, block: B:158:0x0308  */
    /* JADX WARN: Code duplicated, block: B:161:0x030d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0310  */
    /* JADX WARN: Code duplicated, block: B:164:0x0314  */
    /* JADX WARN: Code duplicated, block: B:165:0x0317  */
    /* JADX WARN: Code duplicated, block: B:167:0x031b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0323  */
    /* JADX WARN: Code duplicated, block: B:172:0x0326  */
    /* JADX WARN: Code duplicated, block: B:173:0x032b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        zx9 zx9Var;
        long j;
        long jMax;
        int i;
        int i2;
        m4m m4mVar;
        String strY0;
        String str;
        String strI;
        String str2;
        String imageUri;
        boolean z;
        List list;
        String str3;
        long jU;
        String str4;
        ho70 ho70Var;
        String str5;
        usd usdVar;
        String strConcat;
        prl prlVar;
        nrl nrlVar;
        int i3;
        boolean z2;
        long j2;
        gi90 gi90Var;
        long jU2;
        int iJ;
        int iL;
        String str6;
        xoy0 xoy0Var;
        Calendar calendar;
        xkk1 xkk1Var;
        mq70 mq70Var;
        List list2;
        up70 up70Var;
        nuj1 nuj1Var = (nuj1) obj;
        aa10 aa10Var = (aa10) obj2;
        e4p1 e4p1Var = aa10Var.f;
        se11 se11Var = na10.a;
        String str7 = nuj1Var.a;
        String str8 = nuj1Var.e;
        int iC = l1d.C(nuj1Var.d);
        gi90 gi90Var2 = null;
        int i4 = 1;
        if (iC == 0) {
            zx9Var = zx9.DEFAULT_BACKGROUND;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            zx9Var = zx9.NAKED_BACKGROUND;
        }
        List list3 = nuj1Var.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            String str9 = (String) it.next();
            gvj1 gvj1Var = (gvj1) aa10Var.a.get(str9);
            if (gvj1Var == null) {
                gi90Var = gi90Var2;
            } else {
                i6b i6bVar = this.a ? new i6b(gvj1Var.c, (byte) 15) : new mjv(gvj1Var.d, (byte) 23);
                int i5 = (aa10Var.e || aa10Var.b || !aa10Var.c) ? i4 : 0;
                y2u0 y2u0Var = (y2u0) aa10Var.d.getOrDefault(str9, new y2u0(0, false, false, false));
                ytw0 ytw0Var = jfv.b;
                ngv ngvVar = ngv.e;
                int i6 = i4;
                long jH = jfv.h(fdg1.k0(5, ngvVar));
                long jH2 = jfv.h(fdg1.k0(29, ngvVar));
                hll hllVar = gvj1Var.b;
                long j3 = hllVar.a;
                jo70 jo70Var = gvj1Var.a;
                zoy0 zoy0Var = gvj1Var.e;
                List list4 = hllVar.b;
                long jH3 = jfv.h(j3);
                boolean z3 = i5;
                i6b i6bVar2 = i6bVar;
                long j4 = jH + jH2;
                Long lF = i6bVar2.f();
                if (lF != null) {
                    jMax = lF.longValue();
                    j = j3;
                } else {
                    j = j3;
                    jMax = 0;
                }
                Long lA = i6bVar2.a();
                if (lA != null) {
                    jH2 = lA.longValue();
                }
                long jMax2 = jH2;
                if (jMax == 0 && jH3 >= j4) {
                    jMax = Math.max(jMax, jH);
                    jMax2 = Math.max(jMax2, j4);
                }
                if (this.b) {
                    Set set = s4b1.f;
                    if (!uic.g(str9, blc0.Pg) || jH3 <= jH) {
                        jH = jMax;
                        jH3 = jMax2;
                    }
                } else {
                    jH = jMax;
                    jH3 = jMax2;
                }
                List list5 = list4;
                boolean z4 = list5 instanceof Collection;
                if (!z4 || !list5.isEmpty()) {
                    Iterator it2 = list5.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = 0;
                            break;
                        }
                        if (((ell) it2.next()) == ell.d) {
                            i = i6;
                            break;
                        }
                    }
                } else {
                    i = 0;
                    break;
                }
                if (!z4 || !list5.isEmpty()) {
                    Iterator it3 = list5.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            i2 = 0;
                            break;
                        }
                        if (((ell) it3.next()) == ell.b) {
                            i2 = i6;
                            break;
                        }
                    }
                } else {
                    i2 = 0;
                    break;
                }
                if (i != 0) {
                    m4mVar = m4m.a;
                } else {
                    m4mVar = i2 != 0 ? m4m.b : m4m.c;
                }
                boolean zA = y2u0Var.a(m4mVar);
                Set set2 = s4b1.f;
                boolean zG = uic.g(str9, blc0.Pg);
                String str10 = jo70Var.a;
                List list6 = jo70Var.d;
                io70 io70Var = jo70Var.e;
                if (zG) {
                    strY0 = io70Var != null ? io70Var.a : null;
                    if (strY0 == null) {
                        str = "";
                    }
                    strI = i6bVar2.i();
                    if (strI == null) {
                        str2 = "";
                    } else {
                        str2 = strI;
                    }
                    imageUri = i6bVar2.getImageUri();
                    if (imageUri == null) {
                        imageUri = "";
                    }
                    if (imageUri.length() == 0) {
                        xkk1Var = gvj1Var.g;
                        if (xkk1Var != null || (mq70Var = xkk1Var.b) == null || (list2 = mq70Var.a) == null || (up70Var = (up70) o7h.s0(list2)) == null) {
                            imageUri = null;
                        } else {
                            imageUri = up70Var.a.a;
                        }
                        if (imageUri == null) {
                            imageUri = "";
                        }
                    }
                    m4m m4mVar2 = m4mVar;
                    if (zoy0Var != null) {
                        xoy0Var = (yoy0) zoy0Var.b.b;
                        z = zG;
                        calendar = Calendar.getInstance();
                        list = list6;
                        if (xoy0Var instanceof xoy0) {
                            xoy0 xoy0Var2 = xoy0Var;
                            str3 = "";
                            calendar.set(xoy0Var2.a, xoy0Var2.b - 1, xoy0Var2.c);
                        } else {
                            str3 = "";
                            if (xoy0Var instanceof woy0) {
                                woy0 woy0Var = (woy0) xoy0Var;
                                calendar.set(woy0Var.a, woy0Var.b - 1, i6);
                            } else {
                                if (xoy0Var instanceof voy0) {
                                    calendar.set(((voy0) xoy0Var).a, 0, i6);
                                }
                                if (zA) {
                                    str4 = null;
                                } else {
                                    long j5 = j;
                                    jU2 = jfv.u(j5, ngv.g);
                                    iJ = jfv.j(j5);
                                    iL = jfv.l(j5);
                                    if (jU2 < 1) {
                                        str6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                                    } else {
                                        str6 = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3));
                                    }
                                    str4 = str6;
                                }
                                String strC = i6bVar2.c();
                                ho70Var = (ho70) o7h.s0(list);
                                if (ho70Var != null) {
                                    str5 = ho70Var.b;
                                } else {
                                    str5 = null;
                                }
                                if (str5 == null) {
                                    str5 = str3;
                                }
                                if (z) {
                                    usdVar = usd.b;
                                } else {
                                    usdVar = usd.a;
                                }
                                if (z || !this.c) {
                                    jU = jU;
                                    if (!z && l4o1.R(zoy0Var)) {
                                        if (na10.a.a.matcher(str9).find()) {
                                            strConcat = str9;
                                        } else if (ihc1.i0(str9, '?')) {
                                            strConcat = str9.concat("&feature=mvcdp");
                                        } else {
                                            strConcat = str9.concat("?feature=mvcdp");
                                        }
                                        str3 = strConcat;
                                    }
                                } else {
                                    strConcat = io70Var != 0 ? f4i1.f(io70Var.b, ":", ihc1.H0(str9, "spotify:")) : null;
                                    if (strConcat != null) {
                                        str3 = strConcat;
                                    }
                                }
                                prlVar = gvj1Var.f;
                                if (prlVar != null) {
                                    nrlVar = prlVar.c;
                                } else {
                                    nrlVar = null;
                                }
                                if (nrlVar instanceof irl) {
                                    i3 = 1;
                                } else if (nrlVar instanceof jrl) {
                                    i3 = 2;
                                } else {
                                    i3 = 3;
                                }
                                if (z && l4o1.R(zoy0Var)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (zoy0Var != null) {
                                    j2 = zoy0Var.c;
                                } else {
                                    j2 = 0;
                                }
                                gi90Var = new gi90(z3, str2, str10, str, str9, strC, jH, jH3, imageUri, jU, str4, m4mVar2, zA, 1, str5, usdVar, str3, i3, z2, j2);
                            }
                            ytw0 ytw0Var2 = jfv.b;
                            jU = jfv.u(fdg1.l0(calendar.getTimeInMillis(), ngv.d), ngvVar);
                            if (zA) {
                                long j6 = j;
                                jU2 = jfv.u(j6, ngv.g);
                                iJ = jfv.j(j6);
                                iL = jfv.l(j6);
                                if (jU2 < 1) {
                                    str6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                                } else {
                                    str6 = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3));
                                }
                                str4 = str6;
                            } else {
                                str4 = null;
                            }
                            String strC2 = i6bVar2.c();
                            ho70Var = (ho70) o7h.s0(list);
                            if (ho70Var != null) {
                                str5 = ho70Var.b;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str5 = str3;
                            }
                            if (z) {
                                usdVar = usd.b;
                            } else {
                                usdVar = usd.a;
                            }
                            if (z) {
                                jU = jU;
                                if (!z) {
                                    if (na10.a.a.matcher(str9).find()) {
                                        strConcat = str9;
                                    } else if (ihc1.i0(str9, '?')) {
                                        strConcat = str9.concat("&feature=mvcdp");
                                    } else {
                                        strConcat = str9.concat("?feature=mvcdp");
                                    }
                                    str3 = strConcat;
                                }
                            } else {
                                jU = jU;
                                if (!z) {
                                    if (na10.a.a.matcher(str9).find()) {
                                        strConcat = str9;
                                    } else if (ihc1.i0(str9, '?')) {
                                        strConcat = str9.concat("&feature=mvcdp");
                                    } else {
                                        strConcat = str9.concat("?feature=mvcdp");
                                    }
                                    str3 = strConcat;
                                }
                            }
                            prlVar = gvj1Var.f;
                            if (prlVar != null) {
                                nrlVar = prlVar.c;
                            } else {
                                nrlVar = null;
                            }
                            if (nrlVar instanceof irl) {
                                i3 = 1;
                            } else if (nrlVar instanceof jrl) {
                                i3 = 2;
                            } else {
                                i3 = 3;
                            }
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (zoy0Var != null) {
                                j2 = zoy0Var.c;
                            } else {
                                j2 = 0;
                            }
                            gi90Var = new gi90(z3, str2, str10, str, str9, strC2, jH, jH3, imageUri, jU, str4, m4mVar2, zA, 1, str5, usdVar, str3, i3, z2, j2);
                        }
                        ytw0 ytw0Var3 = jfv.b;
                        jU = jfv.u(fdg1.l0(calendar.getTimeInMillis(), ngv.d), ngvVar);
                        if (zA) {
                            long j7 = j;
                            jU2 = jfv.u(j7, ngv.g);
                            iJ = jfv.j(j7);
                            iL = jfv.l(j7);
                            if (jU2 < 1) {
                                str6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                            } else {
                                str6 = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3));
                            }
                            str4 = str6;
                        } else {
                            str4 = null;
                        }
                        String strC3 = i6bVar2.c();
                        ho70Var = (ho70) o7h.s0(list);
                        if (ho70Var != null) {
                            str5 = ho70Var.b;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = str3;
                        }
                        if (z) {
                            usdVar = usd.b;
                        } else {
                            usdVar = usd.a;
                        }
                        if (z) {
                            jU = jU;
                            if (!z) {
                                if (na10.a.a.matcher(str9).find()) {
                                    strConcat = str9;
                                } else if (ihc1.i0(str9, '?')) {
                                    strConcat = str9.concat("&feature=mvcdp");
                                } else {
                                    strConcat = str9.concat("?feature=mvcdp");
                                }
                                str3 = strConcat;
                            }
                        } else {
                            jU = jU;
                            if (!z) {
                                if (na10.a.a.matcher(str9).find()) {
                                    strConcat = str9;
                                } else if (ihc1.i0(str9, '?')) {
                                    strConcat = str9.concat("&feature=mvcdp");
                                } else {
                                    strConcat = str9.concat("?feature=mvcdp");
                                }
                                str3 = strConcat;
                            }
                        }
                        prlVar = gvj1Var.f;
                        if (prlVar != null) {
                            nrlVar = prlVar.c;
                        } else {
                            nrlVar = null;
                        }
                        if (nrlVar instanceof irl) {
                            i3 = 1;
                        } else if (nrlVar instanceof jrl) {
                            i3 = 2;
                        } else {
                            i3 = 3;
                        }
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (zoy0Var != null) {
                            j2 = zoy0Var.c;
                        } else {
                            j2 = 0;
                        }
                        gi90Var = new gi90(z3, str2, str10, str, str9, strC3, jH, jH3, imageUri, jU, str4, m4mVar2, zA, 1, str5, usdVar, str3, i3, z2, j2);
                    } else {
                        z = zG;
                        list = list6;
                        str3 = "";
                    }
                    jU = 0;
                    if (zA) {
                        long j8 = j;
                        jU2 = jfv.u(j8, ngv.g);
                        iJ = jfv.j(j8);
                        iL = jfv.l(j8);
                        if (jU2 < 1) {
                            str6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                        } else {
                            str6 = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3));
                        }
                        str4 = str6;
                    } else {
                        str4 = null;
                    }
                    String strC4 = i6bVar2.c();
                    ho70Var = (ho70) o7h.s0(list);
                    if (ho70Var != null) {
                        str5 = ho70Var.b;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = str3;
                    }
                    if (z) {
                        usdVar = usd.b;
                    } else {
                        usdVar = usd.a;
                    }
                    if (z) {
                        jU = jU;
                        if (!z) {
                            if (na10.a.a.matcher(str9).find()) {
                                strConcat = str9;
                            } else if (ihc1.i0(str9, '?')) {
                                strConcat = str9.concat("&feature=mvcdp");
                            } else {
                                strConcat = str9.concat("?feature=mvcdp");
                            }
                            str3 = strConcat;
                        }
                    } else {
                        jU = jU;
                        if (!z) {
                            if (na10.a.a.matcher(str9).find()) {
                                strConcat = str9;
                            } else if (ihc1.i0(str9, '?')) {
                                strConcat = str9.concat("&feature=mvcdp");
                            } else {
                                strConcat = str9.concat("?feature=mvcdp");
                            }
                            str3 = strConcat;
                        }
                    }
                    prlVar = gvj1Var.f;
                    if (prlVar != null) {
                        nrlVar = prlVar.c;
                    } else {
                        nrlVar = null;
                    }
                    if (nrlVar instanceof irl) {
                        i3 = 1;
                    } else if (nrlVar instanceof jrl) {
                        i3 = 2;
                    } else {
                        i3 = 3;
                    }
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (zoy0Var != null) {
                        j2 = zoy0Var.c;
                    } else {
                        j2 = 0;
                    }
                    gi90Var = new gi90(z3, str2, str10, str, str9, strC4, jH, jH3, imageUri, jU, str4, m4mVar2, zA, 1, str5, usdVar, str3, i3, z2, j2);
                } else {
                    strY0 = o7h.y0(list6, ", ", (String) null, (String) null, la10.W0, 30);
                }
                str = strY0;
                strI = i6bVar2.i();
                if (strI == null) {
                    str2 = "";
                } else {
                    str2 = strI;
                }
                imageUri = i6bVar2.getImageUri();
                if (imageUri == null) {
                    imageUri = "";
                }
                if (imageUri.length() == 0) {
                    xkk1Var = gvj1Var.g;
                    if (xkk1Var != null) {
                        imageUri = null;
                    } else {
                        imageUri = null;
                    }
                    if (imageUri == null) {
                        imageUri = "";
                    }
                }
                m4m m4mVar3 = m4mVar;
                if (zoy0Var != null) {
                    xoy0Var = (yoy0) zoy0Var.b.b;
                    z = zG;
                    calendar = Calendar.getInstance();
                    list = list6;
                    if (xoy0Var instanceof xoy0) {
                        xoy0 xoy0Var3 = xoy0Var;
                        str3 = "";
                        calendar.set(xoy0Var3.a, xoy0Var3.b - 1, xoy0Var3.c);
                    } else {
                        str3 = "";
                        if (xoy0Var instanceof woy0) {
                            woy0 woy0Var2 = (woy0) xoy0Var;
                            calendar.set(woy0Var2.a, woy0Var2.b - 1, i6);
                        } else {
                            if (xoy0Var instanceof voy0) {
                                calendar.set(((voy0) xoy0Var).a, 0, i6);
                            }
                            if (zA) {
                                long j9 = j;
                                jU2 = jfv.u(j9, ngv.g);
                                iJ = jfv.j(j9);
                                iL = jfv.l(j9);
                                if (jU2 < 1) {
                                    str6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                                } else {
                                    str6 = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3));
                                }
                                str4 = str6;
                            } else {
                                str4 = null;
                            }
                            String strC5 = i6bVar2.c();
                            ho70Var = (ho70) o7h.s0(list);
                            if (ho70Var != null) {
                                str5 = ho70Var.b;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str5 = str3;
                            }
                            if (z) {
                                usdVar = usd.b;
                            } else {
                                usdVar = usd.a;
                            }
                            if (z) {
                                jU = jU;
                                if (!z) {
                                    if (na10.a.a.matcher(str9).find()) {
                                        strConcat = str9;
                                    } else if (ihc1.i0(str9, '?')) {
                                        strConcat = str9.concat("&feature=mvcdp");
                                    } else {
                                        strConcat = str9.concat("?feature=mvcdp");
                                    }
                                    str3 = strConcat;
                                }
                            } else {
                                jU = jU;
                                if (!z) {
                                    if (na10.a.a.matcher(str9).find()) {
                                        strConcat = str9;
                                    } else if (ihc1.i0(str9, '?')) {
                                        strConcat = str9.concat("&feature=mvcdp");
                                    } else {
                                        strConcat = str9.concat("?feature=mvcdp");
                                    }
                                    str3 = strConcat;
                                }
                            }
                            prlVar = gvj1Var.f;
                            if (prlVar != null) {
                                nrlVar = prlVar.c;
                            } else {
                                nrlVar = null;
                            }
                            if (nrlVar instanceof irl) {
                                i3 = 1;
                            } else if (nrlVar instanceof jrl) {
                                i3 = 2;
                            } else {
                                i3 = 3;
                            }
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (zoy0Var != null) {
                                j2 = zoy0Var.c;
                            } else {
                                j2 = 0;
                            }
                            gi90Var = new gi90(z3, str2, str10, str, str9, strC5, jH, jH3, imageUri, jU, str4, m4mVar3, zA, 1, str5, usdVar, str3, i3, z2, j2);
                        }
                        ytw0 ytw0Var4 = jfv.b;
                        jU = jfv.u(fdg1.l0(calendar.getTimeInMillis(), ngv.d), ngvVar);
                        if (zA) {
                            long j10 = j;
                            jU2 = jfv.u(j10, ngv.g);
                            iJ = jfv.j(j10);
                            iL = jfv.l(j10);
                            if (jU2 < 1) {
                                str6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                            } else {
                                str6 = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3));
                            }
                            str4 = str6;
                        } else {
                            str4 = null;
                        }
                        String strC6 = i6bVar2.c();
                        ho70Var = (ho70) o7h.s0(list);
                        if (ho70Var != null) {
                            str5 = ho70Var.b;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = str3;
                        }
                        if (z) {
                            usdVar = usd.b;
                        } else {
                            usdVar = usd.a;
                        }
                        if (z) {
                            jU = jU;
                            if (!z) {
                                if (na10.a.a.matcher(str9).find()) {
                                    strConcat = str9;
                                } else if (ihc1.i0(str9, '?')) {
                                    strConcat = str9.concat("&feature=mvcdp");
                                } else {
                                    strConcat = str9.concat("?feature=mvcdp");
                                }
                                str3 = strConcat;
                            }
                        } else {
                            jU = jU;
                            if (!z) {
                                if (na10.a.a.matcher(str9).find()) {
                                    strConcat = str9;
                                } else if (ihc1.i0(str9, '?')) {
                                    strConcat = str9.concat("&feature=mvcdp");
                                } else {
                                    strConcat = str9.concat("?feature=mvcdp");
                                }
                                str3 = strConcat;
                            }
                        }
                        prlVar = gvj1Var.f;
                        if (prlVar != null) {
                            nrlVar = prlVar.c;
                        } else {
                            nrlVar = null;
                        }
                        if (nrlVar instanceof irl) {
                            i3 = 1;
                        } else if (nrlVar instanceof jrl) {
                            i3 = 2;
                        } else {
                            i3 = 3;
                        }
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (zoy0Var != null) {
                            j2 = zoy0Var.c;
                        } else {
                            j2 = 0;
                        }
                        gi90Var = new gi90(z3, str2, str10, str, str9, strC6, jH, jH3, imageUri, jU, str4, m4mVar3, zA, 1, str5, usdVar, str3, i3, z2, j2);
                    }
                    ytw0 ytw0Var5 = jfv.b;
                    jU = jfv.u(fdg1.l0(calendar.getTimeInMillis(), ngv.d), ngvVar);
                    if (zA) {
                        long j11 = j;
                        jU2 = jfv.u(j11, ngv.g);
                        iJ = jfv.j(j11);
                        iL = jfv.l(j11);
                        if (jU2 < 1) {
                            str6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                        } else {
                            str6 = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3));
                        }
                        str4 = str6;
                    } else {
                        str4 = null;
                    }
                    String strC7 = i6bVar2.c();
                    ho70Var = (ho70) o7h.s0(list);
                    if (ho70Var != null) {
                        str5 = ho70Var.b;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = str3;
                    }
                    if (z) {
                        usdVar = usd.b;
                    } else {
                        usdVar = usd.a;
                    }
                    if (z) {
                        jU = jU;
                        if (!z) {
                            if (na10.a.a.matcher(str9).find()) {
                                strConcat = str9;
                            } else if (ihc1.i0(str9, '?')) {
                                strConcat = str9.concat("&feature=mvcdp");
                            } else {
                                strConcat = str9.concat("?feature=mvcdp");
                            }
                            str3 = strConcat;
                        }
                    } else {
                        jU = jU;
                        if (!z) {
                            if (na10.a.a.matcher(str9).find()) {
                                strConcat = str9;
                            } else if (ihc1.i0(str9, '?')) {
                                strConcat = str9.concat("&feature=mvcdp");
                            } else {
                                strConcat = str9.concat("?feature=mvcdp");
                            }
                            str3 = strConcat;
                        }
                    }
                    prlVar = gvj1Var.f;
                    if (prlVar != null) {
                        nrlVar = prlVar.c;
                    } else {
                        nrlVar = null;
                    }
                    if (nrlVar instanceof irl) {
                        i3 = 1;
                    } else if (nrlVar instanceof jrl) {
                        i3 = 2;
                    } else {
                        i3 = 3;
                    }
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (zoy0Var != null) {
                        j2 = zoy0Var.c;
                    } else {
                        j2 = 0;
                    }
                    gi90Var = new gi90(z3, str2, str10, str, str9, strC7, jH, jH3, imageUri, jU, str4, m4mVar3, zA, 1, str5, usdVar, str3, i3, z2, j2);
                } else {
                    z = zG;
                    list = list6;
                    str3 = "";
                }
                jU = 0;
                if (zA) {
                    long j12 = j;
                    jU2 = jfv.u(j12, ngv.g);
                    iJ = jfv.j(j12);
                    iL = jfv.l(j12);
                    if (jU2 < 1) {
                        str6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                    } else {
                        str6 = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3));
                    }
                    str4 = str6;
                } else {
                    str4 = null;
                }
                String strC8 = i6bVar2.c();
                ho70Var = (ho70) o7h.s0(list);
                if (ho70Var != null) {
                    str5 = ho70Var.b;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str5 = str3;
                }
                if (z) {
                    usdVar = usd.b;
                } else {
                    usdVar = usd.a;
                }
                if (z) {
                    jU = jU;
                    if (!z) {
                        if (na10.a.a.matcher(str9).find()) {
                            strConcat = str9;
                        } else if (ihc1.i0(str9, '?')) {
                            strConcat = str9.concat("&feature=mvcdp");
                        } else {
                            strConcat = str9.concat("?feature=mvcdp");
                        }
                        str3 = strConcat;
                    }
                } else {
                    jU = jU;
                    if (!z) {
                        if (na10.a.a.matcher(str9).find()) {
                            strConcat = str9;
                        } else if (ihc1.i0(str9, '?')) {
                            strConcat = str9.concat("&feature=mvcdp");
                        } else {
                            strConcat = str9.concat("?feature=mvcdp");
                        }
                        str3 = strConcat;
                    }
                }
                prlVar = gvj1Var.f;
                if (prlVar != null) {
                    nrlVar = prlVar.c;
                } else {
                    nrlVar = null;
                }
                if (nrlVar instanceof irl) {
                    i3 = 1;
                } else if (nrlVar instanceof jrl) {
                    i3 = 2;
                } else {
                    i3 = 3;
                }
                if (z) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (zoy0Var != null) {
                    j2 = zoy0Var.c;
                } else {
                    j2 = 0;
                }
                gi90Var = new gi90(z3, str2, str10, str, str9, strC8, jH, jH3, imageUri, jU, str4, m4mVar3, zA, 1, str5, usdVar, str3, i3, z2, j2);
            }
            if (gi90Var != null) {
                arrayList.add(gi90Var);
            }
            e4p1Var = e4p1Var;
            it = it;
            aa10Var = aa10Var;
            zx9Var = zx9Var;
            str7 = str7;
            str8 = str8;
            gi90Var2 = null;
            i4 = 1;
        }
        return new ouj1(str7, zx9Var, str8, arrayList, e4p1Var);
    }
}
