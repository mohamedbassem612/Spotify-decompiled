package p;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class og implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ og(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        v161 v161Var;
        hmb0 hmb0Var;
        n511 n511Var;
        ArrayList arrayListN0;
        Object[] objArr;
        Object[] objArr2;
        long jA;
        mfp0 mfp0Var = null;
        g270VarArr = null;
        g270[] g270VarArr = null;
        int i = 0;
        switch (this.a) {
            case 0:
                ((b9d0) this.b).f((AccessibilityManager) this.c);
                return rih1.a;
            case 1:
                return Boolean.valueOf(ha4.g((ha4) this.b, (KeyEvent) this.c));
            case 2:
                return Boolean.valueOf(ha4.j((MotionEvent) this.c, (ha4) this.b));
            case 3:
                yr41 yr41Var = (yr41) this.b;
                pa4 pa4Var = (pa4) this.c;
                pq41 pq41Var = yr41Var.e;
                pq41 pq41Var2 = yr41Var.f;
                Float f = yr41Var.c;
                Float f2 = yr41Var.d;
                float fFloatValue = (pq41Var == null || f == null) ? 0.0f : ((Number) pq41Var.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (pq41Var2 == null || f2 == null) ? 0.0f : ((Number) pq41Var2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iR = pa4Var.r(yr41Var.a);
                    x161 x161Var = (x161) pa4Var.j().b(pa4Var.h);
                    if (x161Var != null) {
                        try {
                            kg kgVar = pa4Var.t;
                            if (kgVar != null) {
                                kgVar.a.setBoundsInScreen(pa4Var.b(x161Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    x161 x161Var2 = (x161) pa4Var.j().b(pa4Var.i);
                    if (x161Var2 != null) {
                        try {
                            kg kgVar2 = pa4Var.X;
                            if (kgVar2 != null) {
                                kgVar2.a.setBoundsInScreen(pa4Var.b(x161Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    pa4Var.a.invalidate();
                    x161 x161Var3 = (x161) pa4Var.j().b(iR);
                    if (x161Var3 != null && (v161Var = x161Var3.a) != null && (hmb0Var = v161Var.c) != null) {
                        if (pq41Var != null) {
                            pa4Var.Z.i(iR, pq41Var);
                        }
                        if (pq41Var2 != null) {
                            pa4Var.N0.i(iR, pq41Var2);
                        }
                        pa4Var.n(hmb0Var);
                    }
                }
                if (pq41Var != null) {
                    yr41Var.c = (Float) pq41Var.a.invoke();
                }
                if (pq41Var2 != null) {
                    yr41Var.d = (Float) pq41Var2.a.invoke();
                }
                return rih1.a;
            case 4:
                ((p811) this.b).a = ((Function0) this.c).invoke();
                return rih1.a;
            case 5:
                ((jfe) this.b).l(this.c);
                return rih1.a;
            case 6:
                return rb5.b((rb5) this.b, (l811) this.c);
            case 7:
                ky9 ky9Var = (ky9) this.b;
                lsl lslVar = (lsl) this.c;
                ky9Var.W0 = ky9Var.R0.a(lslVar.j(), lslVar.getLayoutDirection(), lslVar);
                return rih1.a;
            case 8:
                eaa eaaVar = (eaa) this.b;
                daa daaVar = (daa) this.c;
                til tilVar = eaaVar.a;
                synchronized (tilVar.c) {
                    if (tilVar.d.remove(daaVar) && tilVar.d.isEmpty()) {
                        tilVar.d();
                    }
                    break;
                }
                return rih1.a;
            case 9:
                return Boolean.valueOf(((Boolean) ((tob1) this.c).getValue()).booleanValue() && ((crl1) this.b).b());
            case 10:
                c8e1 c8e1Var = (c8e1) this.b;
                ven0 ven0Var = (ven0) this.c;
                if (!nbe1.c(c8e1Var.b, ((c8e1) ven0Var.getValue()).b) || !u890.j(c8e1Var.c, ((c8e1) ven0Var.getValue()).c)) {
                    ven0Var.setValue(c8e1Var);
                }
                return rih1.a;
            case 11:
                oae1 oae1Var = (oae1) this.b;
                af5 af5Var = (af5) this.c;
                if (oae1Var == null) {
                    return af5Var;
                }
                bw91 bw91Var = oae1Var.c;
                boolean zIsEmpty = bw91Var.isEmpty();
                af5 af5Var2 = oae1Var.b;
                if (!zIsEmpty) {
                    h0e1 h0e1Var = new h0e1(af5Var2);
                    int size = bw91Var.size();
                    while (i < size) {
                        ((iu30) bw91Var.get(i)).invoke(h0e1Var);
                        i++;
                    }
                    af5Var2 = h0e1Var.b;
                }
                oae1Var.b = af5Var2;
                return af5Var2 == null ? af5Var : af5Var2;
            case 12:
                fn31.T((c9n) this.b, null, 0, new kfa((w5f1) this.c, null, (byte) 0), 3);
                return Boolean.TRUE;
            case 13:
                Function0 function0 = (Function0) this.b;
                q5t0 q5t0Var = (ndo0) this.c;
                if (function0 != null && (n511Var = (n511) function0.invoke()) != null) {
                    return n511Var;
                }
                if (!q5t0Var.f1().N0) {
                    q5t0Var = null;
                }
                if (q5t0Var != null) {
                    return anm1.g(0L, o0c.R(q5t0Var.c));
                }
                return null;
            case 14:
                ((cqc) this.b).R0.invoke((eqc) this.c);
                return rih1.a;
            case 15:
                awl1 awl1Var = (awl1) this.b;
                awl1Var.c.r(new an31(new ny2((Object) awl1Var, this.c, (byte) 25), (byte) 0));
                om41.b(awl1Var.b, awl1Var.c, awl1Var.e);
                return rih1.a;
            case 16:
                String str = (String) this.b;
                awl1 awl1Var2 = (awl1) this.c;
                bzn1.s(str, awl1Var2);
                om41.b(awl1Var2.b, awl1Var2.c, awl1Var2.e);
                return rih1.a;
            case 17:
                return Collections.singletonList(new mmr0((k120) this.b, (tka0) this.c));
            case 18:
                y3k y3kVar = (y3k) this.b;
                Object obj = this.c;
                x340 x340Var = y3kVar.a;
                ze91 ze91Var = x340Var.c;
                ye91 ye91VarF = ze91Var.f();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < ze91Var.b) {
                            if (ye91VarF.l(i2)) {
                                Object objN = ye91VarF.n(i2);
                                if (objN != obj) {
                                    b440 b440Var = objN instanceof b440 ? (b440) objN : null;
                                    objArr2 = (b440Var != null ? b440Var.a : null) == obj;
                                }
                                if (objArr2 != false) {
                                    mfp0 mfp0Var2 = new mfp0(null, i2);
                                    ye91VarF.c();
                                    mfp0Var = mfp0Var2;
                                }
                            }
                            int[] iArr = ye91VarF.b;
                            int i3 = i2 + 1;
                            int iD = (i3 < ye91VarF.c ? iArr[(i3 * 5) + 4] : ye91VarF.e) - bf91.d(i2, iArr);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= iD) {
                                    i2 = i3;
                                } else {
                                    Object objH = ye91VarF.h(i2, i4);
                                    if (objH != obj) {
                                        b440 b440Var2 = objH instanceof b440 ? (b440) objH : null;
                                        objArr = (b440Var2 != null ? b440Var2.a : null) == obj;
                                    }
                                    if (objArr == true) {
                                        mfp0Var = new mfp0(Integer.valueOf(i4), i2);
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                        }
                        ye91VarF.c();
                    } catch (Throwable th) {
                        ye91VarF.c();
                        throw th;
                    }
                }
                if (mfp0Var != null) {
                    int i5 = mfp0Var.a;
                    Integer num = mfp0Var.b;
                    ye91 ye91VarF2 = ze91Var.f();
                    try {
                        ArrayList arrayListL = rc2.L(ye91VarF2, i5, num);
                        ye91VarF2.c();
                        arrayListN0 = o7h.N0(x340Var.M(), arrayListL);
                    } catch (Throwable th2) {
                        ye91VarF2.c();
                        throw th2;
                    }
                } else {
                    arrayListN0 = z6x.a;
                }
                return new xyj(arrayListN0, x340Var.C);
            case 19:
                return new qr80(dm5.c0(((g3e1) this.b).l0((elb0) ((Function0) this.c).invoke())));
            case 20:
                ((m3e1) this.b).d.invoke((r3e1) this.c);
                return rih1.a;
            case 21:
                a1z a1zVar = (a1z) this.b;
                String str2 = (String) this.c;
                q0z q0zVar = a1zVar.b;
                if (q0zVar == null) {
                    Enum[] enumArr = a1zVar.a;
                    q0zVar = new q0z(str2, enumArr.length);
                    for (Enum r0 : enumArr) {
                        q0zVar.j(r0.name(), false);
                    }
                }
                return q0zVar;
            case 22:
                ((p811) this.b).a = lcc.z((b030) this.c, i2t0.a);
                return rih1.a;
            case 23:
                ((p811) this.b).a = ((d030) this.c).J1();
                return rih1.a;
            case 24:
                ((p811) this.b).a = lcc.z((l030) this.c, i2t0.a);
                return rih1.a;
            case 25:
                x340 x340Var2 = (x340) this.b;
                znm0 znm0Var = (znm0) this.c;
                x340Var2.J(znm0Var.a, znm0Var.g, znm0Var.b, true);
                return rih1.a;
            case 26:
                ((dk60) this.b).d((pim0) this.c);
                return rih1.a;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                z170 z170Var = (z170) this.b;
                g270 g270Var = (g270) this.c;
                try {
                    z170Var.a.c(g270Var);
                    break;
                } catch (IOException e) {
                    nct0 nct0Var = nct0.a;
                    nct0.a.i(4);
                    try {
                        g270Var.c(2, e);
                        break;
                    } catch (IOException unused3) {
                    }
                }
                return rih1.a;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                y170 y170Var = (y170) this.b;
                im61 im61Var = (im61) this.c;
                p811 p811Var = new p811();
                z170 z170Var2 = (z170) y170Var.c;
                synchronized (z170Var2.X0) {
                    synchronized (z170Var2) {
                        try {
                            im61 im61Var2 = z170Var2.S0;
                            im61 im61Var3 = new im61();
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (((1 << i6) & im61Var2.a) != 0) {
                                    im61Var3.b(i6, im61Var2.b[i6]);
                                }
                            }
                            for (int i7 = 0; i7 < 10; i7++) {
                                if (((1 << i7) & im61Var.a) != 0) {
                                    im61Var3.b(i7, im61Var.b[i7]);
                                }
                            }
                            p811Var.a = im61Var3;
                            jA = ((long) im61Var3.a()) - ((long) im61Var2.a());
                            if (jA != 0 && !z170Var2.b.isEmpty()) {
                                g270VarArr = (g270[]) z170Var2.b.values().toArray(new g270[0]);
                            }
                            z170Var2.S0 = (im61) p811Var.a;
                            hsd1.c(z170Var2.t, z170Var2.c + " onSettings", 0L, new og(z170Var2, p811Var, (byte) 29), 6);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    try {
                        z170Var2.X0.a((im61) p811Var.a);
                    } catch (IOException e2) {
                        z170Var2.a(2, 2, e2);
                    }
                    break;
                }
                if (g270VarArr != null) {
                    int length = g270VarArr.length;
                    while (i < length) {
                        g270 g270Var2 = g270VarArr[i];
                        synchronized (g270Var2) {
                            g270Var2.e += jA;
                            if (jA > 0) {
                                g270Var2.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return rih1.a;
            default:
                ((z170) this.b).a.a((im61) ((p811) this.c).a);
                return rih1.a;
        }
    }
}
