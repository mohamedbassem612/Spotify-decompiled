package p;

import android.content.Context;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class upn1 {
    public static final fyd a = new fyd((byte) 6);
    public static b180 b;

    public static final int A(h661 h661Var) {
        String strW = nhc1.W(h661Var.h(), "?", "");
        if (u890.j(h661Var.getKind(), l661.h)) {
            return h661Var.b() ? 21 : 20;
        }
        if (strW.equals("kotlin.Int")) {
            return h661Var.b() ? 2 : 1;
        }
        if (strW.equals("kotlin.Boolean")) {
            return h661Var.b() ? 4 : 3;
        }
        if (strW.equals("kotlin.Double")) {
            return h661Var.b() ? 6 : 5;
        }
        if (strW.equals("kotlin.Double")) {
            return 5;
        }
        if (strW.equals("kotlin.Float")) {
            return h661Var.b() ? 8 : 7;
        }
        if (strW.equals("kotlin.Long")) {
            return h661Var.b() ? 10 : 9;
        }
        if (strW.equals("kotlin.String")) {
            return h661Var.b() ? 12 : 11;
        }
        if (strW.equals("kotlin.IntArray")) {
            return 13;
        }
        if (strW.equals("kotlin.DoubleArray")) {
            return 15;
        }
        if (strW.equals("kotlin.BooleanArray")) {
            return 14;
        }
        if (strW.equals("kotlin.FloatArray")) {
            return 16;
        }
        if (strW.equals("kotlin.LongArray")) {
            return 17;
        }
        if (strW.equals("kotlin.Array")) {
            return 18;
        }
        return nhc1.Y(strW, "kotlin.collections.ArrayList", false) ? 19 : 22;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    public static final hdg0 B(jbg0 jbg0Var, ibg0 ibg0Var) {
        Date date;
        Date date2;
        r7g0 r7g0Var;
        Boolean bool;
        Boolean bool2;
        gjj1 gjj1Var;
        boolean z;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        s7g0 s7g0Var;
        tk tkVar = jbg0Var.h;
        String str = jbg0Var.b;
        cww0 cww0Var = jbg0Var.c;
        String str2 = cww0Var.a;
        String str3 = cww0Var.b;
        Integer num = cww0Var.c;
        int i = jbg0Var.a;
        boolean z2 = jbg0Var.e;
        boolean z3 = jbg0Var.g;
        f6r f6rVar = jbg0Var.d;
        if (f6rVar != null) {
            try {
                date = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(f6rVar.a);
            } catch (ParseException e) {
                n57.g("Failed to parse dateOfBirth", e);
                date = null;
            }
            date2 = date;
        } else {
            date2 = null;
        }
        boolean z4 = f6rVar != null ? f6rVar.b : false;
        i9t0 i9t0Var = jbg0Var.i;
        e850 e850Var = jbg0Var.l;
        int i2 = jbg0Var.m;
        l6t l6tVar = jbg0Var.j;
        int i3 = jbg0Var.k;
        j7g0 j7g0Var = jbg0Var.f;
        if (j7g0Var != null) {
            if (tkVar != null) {
                bool = tkVar.a;
            } else {
                bool = null;
            }
            if (tkVar != null) {
                bool2 = tkVar.b;
            } else {
                bool2 = null;
            }
            if (tkVar != null) {
                gjj1Var = tkVar.c;
            } else {
                gjj1Var = null;
            }
            if (gjj1Var != null) {
                z = true;
            } else {
                z = false;
            }
            r7g0Var = new r7g0(j7g0Var, bool, bool2, z);
        } else {
            if ((tkVar != null ? tkVar.a : null) != null) {
                if (tkVar != null) {
                    bool = tkVar.a;
                } else {
                    bool = null;
                }
                if (tkVar != null) {
                    bool2 = tkVar.b;
                } else {
                    bool2 = null;
                }
                if (tkVar != null) {
                    gjj1Var = tkVar.c;
                } else {
                    gjj1Var = null;
                }
                if (gjj1Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                r7g0Var = new r7g0(j7g0Var, bool, bool2, z);
            } else {
                if ((tkVar != null ? tkVar.b : null) != null) {
                    if (tkVar != null) {
                        bool = tkVar.a;
                    } else {
                        bool = null;
                    }
                    if (tkVar != null) {
                        bool2 = tkVar.b;
                    } else {
                        bool2 = null;
                    }
                    if (tkVar != null) {
                        gjj1Var = tkVar.c;
                    } else {
                        gjj1Var = null;
                    }
                    if (gjj1Var != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    r7g0Var = new r7g0(j7g0Var, bool, bool2, z);
                } else {
                    if ((tkVar != null ? tkVar.c : null) != null) {
                        if (tkVar != null) {
                            bool = tkVar.a;
                        } else {
                            bool = null;
                        }
                        if (tkVar != null) {
                            bool2 = tkVar.b;
                        } else {
                            bool2 = null;
                        }
                        if (tkVar != null) {
                            gjj1Var = tkVar.c;
                        } else {
                            gjj1Var = null;
                        }
                        if (gjj1Var != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        r7g0Var = new r7g0(j7g0Var, bool, bool2, z);
                    } else {
                        r7g0Var = null;
                    }
                }
            }
        }
        if ((tkVar != null ? tkVar.d : null) != null) {
            if (tkVar != null) {
                bool3 = tkVar.d;
            } else {
                bool3 = null;
            }
            if (tkVar != null) {
                bool4 = tkVar.e;
            } else {
                bool4 = null;
            }
            if (tkVar != null) {
                bool5 = tkVar.f;
            } else {
                bool5 = null;
            }
            if (tkVar != null) {
                bool6 = tkVar.g;
            } else {
                bool6 = null;
            }
            s7g0Var = new s7g0(bool3, bool4, bool5, bool6);
        } else {
            if ((tkVar != null ? tkVar.e : null) != null) {
                if (tkVar != null) {
                    bool3 = tkVar.d;
                } else {
                    bool3 = null;
                }
                if (tkVar != null) {
                    bool4 = tkVar.e;
                } else {
                    bool4 = null;
                }
                if (tkVar != null) {
                    bool5 = tkVar.f;
                } else {
                    bool5 = null;
                }
                if (tkVar != null) {
                    bool6 = tkVar.g;
                } else {
                    bool6 = null;
                }
                s7g0Var = new s7g0(bool3, bool4, bool5, bool6);
            } else {
                if ((tkVar != null ? tkVar.f : null) != null) {
                    if (tkVar != null) {
                        bool3 = tkVar.d;
                    } else {
                        bool3 = null;
                    }
                    if (tkVar != null) {
                        bool4 = tkVar.e;
                    } else {
                        bool4 = null;
                    }
                    if (tkVar != null) {
                        bool5 = tkVar.f;
                    } else {
                        bool5 = null;
                    }
                    if (tkVar != null) {
                        bool6 = tkVar.g;
                    } else {
                        bool6 = null;
                    }
                    s7g0Var = new s7g0(bool3, bool4, bool5, bool6);
                } else {
                    if ((tkVar != null ? tkVar.g : null) != null) {
                        if (tkVar != null) {
                            bool3 = tkVar.d;
                        } else {
                            bool3 = null;
                        }
                        if (tkVar != null) {
                            bool4 = tkVar.e;
                        } else {
                            bool4 = null;
                        }
                        if (tkVar != null) {
                            bool5 = tkVar.f;
                        } else {
                            bool5 = null;
                        }
                        if (tkVar != null) {
                            bool6 = tkVar.g;
                        } else {
                            bool6 = null;
                        }
                        s7g0Var = new s7g0(bool3, bool4, bool5, bool6);
                    } else {
                        s7g0Var = null;
                    }
                }
            }
        }
        return new hdg0(str, ibg0Var, str2, str3, num, i, z2, z3, date2, z4, i9t0Var, e850Var, i2, l6tVar, i3, r7g0Var, s7g0Var, jbg0Var.n, jbg0Var.o);
    }

    public static final mox0 C(xnx0 xnx0Var, ga10 ga10Var) {
        if (ga10Var == null) {
            return new mox0(xnx0Var.b, "", new xxe1(""), "", "", "", "", "", "", (String) null, (ykm) null);
        }
        oox0 oox0Var = ga10Var.a;
        String str = oox0Var.d;
        String str2 = oox0Var.f;
        String str3 = oox0Var.a;
        wxe1 wxe1Var = str2 != null ? new wxe1(str2, str3) : new xxe1(str3);
        String str4 = xnx0Var.b;
        String str5 = oox0Var.b;
        String str6 = oox0Var.c;
        String str7 = oox0Var.e;
        String str8 = oox0Var.h;
        String str9 = oox0Var.g;
        String str10 = oox0Var.k;
        if (str10 == null || ihc1.y0(str10)) {
            str10 = null;
        }
        return new mox0(str4, str, wxe1Var, str5, str6, str, str7, str8, str9, str10, ga10Var.b);
    }

    public static final void a(b180 b180Var, qim0 qim0Var, String str, b0k b0kVar, int i, int i2) {
        int i3;
        b180 b180Var2;
        String str2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1526962395);
        int i4 = (x340Var.i(b180Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.i(qim0Var) ? 32 : 16);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var.g(str) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0Var3 = qim0Var;
            if (i6 != 0) {
                str = null;
            }
            String str3 = str;
            b180Var2 = b180Var;
            ol70.c(b180Var2, ((u7h) x340Var.k(ffe0.a)).a, str3, qim0Var3, x340Var, (i3 & 910) | ((i3 << 6) & 7168));
            str2 = str3;
            qim0Var2 = qim0Var3;
        } else {
            b180Var2 = b180Var;
            x340Var.b0();
            str2 = str;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pkm1(b180Var2, qim0Var2, str2, i, i2);
        }
    }

    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        f46.W(0, i, 6, objArr, objArr2);
        f46.Q(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        f46.W(0, i, 6, objArr, objArr2);
        f46.Q(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        f46.W(0, i, 6, objArr, objArr2);
        f46.Q(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] e(Object[] objArr, int i, int i2, jug1 jug1Var) {
        Object[] objArr2 = new Object[objArr.length - 1];
        f46.W(0, i, 6, objArr, objArr2);
        f46.Q(i, i + 2, i2, objArr, objArr2);
        objArr2[i2 - 2] = jug1Var;
        f46.Q(i2 - 1, i2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] f(int i, int i2, Object obj, Object obj2, Object[] objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        f46.Q(i + 2, i + 1, objArr.length, objArrCopyOf, objArrCopyOf);
        f46.Q(i2 + 2, i2, i, objArrCopyOf, objArrCopyOf);
        objArrCopyOf[i2] = obj;
        objArrCopyOf[i2 + 1] = obj2;
        return objArrCopyOf;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(ay8 ay8Var, onm onmVar) throws ItemUnavailableException, AbortFlowException {
        rov rovVar;
        if (onmVar instanceof rov) {
            rovVar = (rov) onmVar;
            int i = rovVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rovVar.b = i - Integer.MIN_VALUE;
            } else {
                rovVar = new rov(onmVar);
            }
        } else {
            rovVar = new rov(onmVar);
        }
        Object objJ = rovVar.a;
        int i2 = rovVar.b;
        if (i2 == 0) {
            hm5.M(objJ);
            afv afvVar = new afv(2, (lnm) null, (byte) 2);
            rovVar.b = 1;
            objJ = b5p1.j(ay8Var, afvVar, rovVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object objG = u890.G((k1r) objJ);
        if (objG != null) {
            return objG;
        }
        throw new ItemUnavailableException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(nla0 nla0Var, Object[] objArr, onm onmVar) {
        ska0 ska0Var;
        if (onmVar instanceof ska0) {
            ska0Var = (ska0) onmVar;
            int i = ska0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ska0Var.d = i - Integer.MIN_VALUE;
            } else {
                ska0Var = new ska0(onmVar);
            }
        } else {
            ska0Var = new ska0(onmVar);
        }
        Object objCall = ska0Var.c;
        int i2 = ska0Var.d;
        if (i2 == 0) {
            hm5.M(objCall);
            if (!nla0Var.isSuspend()) {
                return nla0Var.call(Arrays.copyOf(objArr, objArr.length));
            }
            ska0Var.a = nla0Var;
            ska0Var.b = objArr;
            ska0Var.d = 1;
            c8b1 c8b1Var = new c8b1(2);
            c8b1Var.b(objArr);
            c8b1Var.a(ska0Var);
            ArrayList arrayList = c8b1Var.a;
            objCall = nla0Var.call(arrayList.toArray(new Object[arrayList.size()]));
            d9n d9nVar = d9n.a;
            if (objCall == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nla0Var = ska0Var.a;
            hm5.M(objCall);
        }
        return (!u890.j(nla0Var.getReturnType().k(), rc11.a.b(rih1.class)) || nla0Var.getReturnType().i()) ? objCall : rih1.a;
    }

    public static final avl1 i(uyl uylVar) {
        if (uylVar instanceof fuj) {
            return ((fuj) uylVar).a;
        }
        if (uylVar instanceof aak1) {
            throw null;
        }
        return null;
    }

    public static cn41 j(cn41 cn41Var, cn41 cn41Var2) {
        int i = ama1.a;
        return ((cn41Var instanceof an41) && (cn41Var2 instanceof an41)) ? new an41(new rl21(cn41Var, cn41Var2)) : bn41.a;
    }

    public static final String k(Context context) {
        fhe0 fhe0VarA = yoi1.A(context.getResources().getConfiguration());
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("0.00");
        ArrayList arrayList = new ArrayList(fhe0VarA.c());
        int iC = fhe0VarA.c();
        for (int i = 0; i < iC; i++) {
            double dC = 1.0d - ((((double) i) * 1.0d) / ((double) fhe0VarA.c()));
            Locale localeB = fhe0VarA.b(i);
            localeB.getClass();
            arrayList.add(localeB.toLanguageTag() + ";q=" + decimalFormat.format(dC));
        }
        String strY = gm50.y(o7h.y0(arrayList, ",", (String) null, (String) null, (iu30) null, 62));
        strY.getClass();
        return strY;
    }

    public static final Class l(h661 h661Var) {
        String strW = nhc1.W(h661Var.h(), "?", "");
        try {
            return Class.forName(strW);
        } catch (ClassNotFoundException unused) {
            if (ihc1.h0(strW, ".", false)) {
                return Class.forName(cy30.o("(\\.+)(?!.*\\.)", strW, "\\$"));
            }
            mna0.e("Cannot find class with name \"", h661Var.h(), "\". Ensure that the serialName for this argument is the default fully qualified name");
            return null;
        }
    }

    public static final String m() {
        return w45.a("_", Locale.getDefault());
    }

    public static final String n(Context context) {
        return w45.a("_", yoi1.A(context.getResources().getConfiguration()).b(0));
    }

    public static final String o(Context context, String str) {
        return w45.a(str, yoi1.A(context.getResources().getConfiguration()).b(0));
    }

    public static final String p() {
        return w45.a("-", Locale.getDefault());
    }

    public static final String q() {
        return w45.b(Locale.getDefault());
    }

    public static final String r(Context context) {
        return w45.b(yoi1.A(context.getResources().getConfiguration()).b(0));
    }

    public static final String s() {
        Locale locale = Locale.getDefault();
        return new Locale.Builder().setLanguageTag(w45.a("-", new Locale(locale.getLanguage(), locale.getCountry()))).setScript(locale.getScript()).build().toLanguageTag();
    }

    public static pzc t(nzc nzcVar) {
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = nzcVar.getClass();
        try {
            Object objAttachCompleter = nzcVar.attachCompleter(mzcVar);
            if (objAttachCompleter == null) {
                return pzcVar;
            }
            mzcVar.a = objAttachCompleter;
            return pzcVar;
        } catch (Exception e) {
            pzcVar.a(e);
            return pzcVar;
        }
    }

    public static final ArrayList u(qka0 qka0Var) {
        List parameters = qka0Var.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((hc11) obj).s() == 4) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int v(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static void w(z8d0 z8d0Var) {
        lt50 lt50Var = z8d0Var.a;
        if (!(lt50Var instanceof lt50)) {
            eg.m(xcg1.i(lt50Var.getClass().getCanonicalName(), " does not implement ", lt50.class.getCanonicalName()));
            return;
        }
        lt50 lt50Var2 = lt50Var;
        jgu jguVarF = lt50Var2.f();
        if (jguVarF != null) {
            jguVarF.w(z8d0Var);
            return;
        }
        throw new IllegalStateException((lt50Var2.getClass() + ".androidInjector() returned null").toString());
    }

    public static boolean x(pm4 pm4Var) {
        return pm4Var.d();
    }

    public static final d2i y(Object obj, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.f0(-1260190978, obj);
        ven0 ven0VarS = v8r.s(j2iVar, x340Var);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new d2i(obj, new j2i(2036757600, new xd2(ven0VarS, (byte) 5), true));
            x340Var.s0(objT);
        }
        d2i d2iVar = (d2i) objT;
        x340Var.r(false);
        return d2iVar;
    }

    public static final String z(String str) {
        return cy30.o("_+", str, "-");
    }
}
