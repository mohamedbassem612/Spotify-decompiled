package p;

import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class lcf0 {
    public static final ye90 a = ye90.m(new String[]{"w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers"});
    public static final ye90 b = ye90.m(new String[]{"id", "layers", "w", "h", "p", "u"});
    public static final ye90 c = ye90.m(new String[]{"list"});
    public static final ye90 d = ye90.m(new String[]{"cm", "tm", "dr"});

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0047. Please report as an issue. */
    public static fcf0 a(nha0 nha0Var) throws kga0, meh, EOFException {
        float f;
        int i;
        float f2;
        HashMap map;
        HashMap map2;
        ArrayList arrayList;
        float f3;
        float fC = qpi1.c();
        q5f0 q5f0Var = new q5f0((Object) null);
        ArrayList arrayList2 = new ArrayList();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        ina1 ina1Var = new ina1(0);
        fcf0 fcf0Var = new fcf0();
        nha0Var.c();
        int iJ = 0;
        int iJ2 = 0;
        float fI = 0.0f;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        while (nha0Var.g()) {
            i2 = i2;
            switch (nha0Var.q(a)) {
                case 0:
                    iJ = nha0Var.j();
                    arrayList3 = arrayList3;
                    break;
                case 1:
                    iJ2 = nha0Var.j();
                    arrayList3 = arrayList3;
                    break;
                case 2:
                    arrayList3 = arrayList3;
                    fI2 = (float) nha0Var.i();
                    iJ2 = iJ2;
                    arrayList3 = arrayList3;
                    break;
                case 3:
                    f = fC;
                    arrayList3 = arrayList3;
                    i = iJ2;
                    f2 = fI2;
                    map = map5;
                    fI = ((float) nha0Var.i()) - 0.01f;
                    fI2 = f2;
                    map5 = map;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
                case 4:
                    f = fC;
                    arrayList3 = arrayList3;
                    i = iJ2;
                    fI3 = (float) nha0Var.i();
                    fI2 = fI2;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
                case 5:
                    f = fC;
                    arrayList3 = arrayList3;
                    i = iJ2;
                    f2 = fI2;
                    map = map5;
                    String[] strArrSplit = nha0Var.m().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[i2]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        fcf0Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fI2 = f2;
                    map5 = map;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
                case 6:
                    f = fC;
                    arrayList3 = arrayList3;
                    i = iJ2;
                    f2 = fI2;
                    HashMap map6 = map5;
                    nha0Var.a();
                    int i6 = i2;
                    while (nha0Var.g()) {
                        qkb0 qkb0VarA = skb0.a(nha0Var, fcf0Var);
                        if (qkb0VarA.e == 3) {
                            i6++;
                        }
                        arrayList2.add(qkb0VarA);
                        HashMap map7 = map6;
                        q5f0Var.g(qkb0VarA.d, qkb0VarA);
                        if (i6 > 4) {
                            nue0.c("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        map6 = map7;
                    }
                    map = map6;
                    nha0Var.d();
                    fI2 = f2;
                    map5 = map;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
                case 7:
                    f = fC;
                    i = iJ2;
                    f2 = fI2;
                    nha0Var.a();
                    while (nha0Var.g()) {
                        ArrayList arrayList4 = new ArrayList();
                        q5f0 q5f0Var2 = new q5f0((Object) null);
                        nha0Var.c();
                        String strM = null;
                        String strM2 = null;
                        String strM3 = null;
                        int iJ3 = i2;
                        int iJ4 = iJ3;
                        while (nha0Var.g()) {
                            int iQ = nha0Var.q(b);
                            if (iQ != 0) {
                                if (iQ == 1) {
                                    nha0Var.a();
                                    while (nha0Var.g()) {
                                        qkb0 qkb0VarA2 = skb0.a(nha0Var, fcf0Var);
                                        q5f0Var2.g(qkb0VarA2.d, qkb0VarA2);
                                        arrayList4.add(qkb0VarA2);
                                        map5 = map5;
                                        arrayList3 = arrayList3;
                                    }
                                    map2 = map5;
                                    arrayList = arrayList3;
                                    nha0Var.d();
                                } else if (iQ == 2) {
                                    iJ3 = nha0Var.j();
                                } else if (iQ == 3) {
                                    iJ4 = nha0Var.j();
                                } else if (iQ == 4) {
                                    strM2 = nha0Var.m();
                                } else if (iQ != 5) {
                                    nha0Var.u();
                                    nha0Var.v();
                                    map2 = map5;
                                    arrayList = arrayList3;
                                } else {
                                    strM3 = nha0Var.m();
                                }
                                map5 = map2;
                                arrayList3 = arrayList;
                            } else {
                                strM = nha0Var.m();
                            }
                        }
                        HashMap map8 = map5;
                        ArrayList arrayList5 = arrayList3;
                        nha0Var.e();
                        if (strM2 != null) {
                            hdf0 hdf0Var = new hdf0(iJ3, iJ4, strM, strM2, strM3);
                            map4.put(hdf0Var.d(), hdf0Var);
                        } else {
                            map3.put(strM, arrayList4);
                        }
                        map5 = map8;
                        arrayList3 = arrayList5;
                    }
                    arrayList3 = arrayList3;
                    nha0Var.d();
                    map = map5;
                    fI2 = f2;
                    map5 = map;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
                case 8:
                    f = fC;
                    i = iJ2;
                    f2 = fI2;
                    nha0Var.c();
                    while (nha0Var.g()) {
                        if (nha0Var.q(c) != 0) {
                            nha0Var.u();
                            nha0Var.v();
                        } else {
                            nha0Var.a();
                            while (nha0Var.g()) {
                                z830 z830VarA = l930.a(nha0Var);
                                map5.put(z830VarA.b(), z830VarA);
                            }
                            nha0Var.d();
                        }
                    }
                    nha0Var.e();
                    map = map5;
                    fI2 = f2;
                    map5 = map;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
                case 9:
                    f = fC;
                    i = iJ2;
                    f2 = fI2;
                    nha0Var.a();
                    while (nha0Var.g()) {
                        c930 c930VarA = d930.a(nha0Var, fcf0Var);
                        ina1Var.e(c930VarA.hashCode(), c930VarA);
                    }
                    nha0Var.d();
                    map = map5;
                    fI2 = f2;
                    map5 = map;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
                case 10:
                    nha0Var.a();
                    while (nha0Var.g()) {
                        nha0Var.c();
                        String strM4 = null;
                        float fI4 = 0.0f;
                        float fI5 = 0.0f;
                        while (nha0Var.g()) {
                            int iQ2 = nha0Var.q(d);
                            if (iQ2 != 0) {
                                f3 = fC;
                                if (iQ2 == 1) {
                                    fI2 = fI2;
                                    fI4 = (float) nha0Var.i();
                                } else if (iQ2 != 2) {
                                    nha0Var.u();
                                    nha0Var.v();
                                } else {
                                    fI2 = fI2;
                                    fI5 = (float) nha0Var.i();
                                }
                                iJ2 = iJ2;
                            } else {
                                f3 = fC;
                                strM4 = nha0Var.m();
                            }
                            fC = f3;
                        }
                        nha0Var.e();
                        arrayList3.add(new ntg0(strM4, fI4, fI5));
                        fI2 = fI2;
                        iJ2 = iJ2;
                        fC = fC;
                    }
                    f = fC;
                    i = iJ2;
                    f2 = fI2;
                    nha0Var.d();
                    map = map5;
                    fI2 = f2;
                    map5 = map;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
                default:
                    nha0Var.u();
                    nha0Var.v();
                    f = fC;
                    i = iJ2;
                    f2 = fI2;
                    map = map5;
                    fI2 = f2;
                    map5 = map;
                    i2 = i2;
                    iJ2 = i;
                    arrayList3 = arrayList3;
                    fC = f;
                    break;
            }
        }
        float f4 = fC;
        ArrayList arrayList6 = arrayList3;
        HashMap map9 = map5;
        Rect rect = new Rect(i2, i2, (int) (iJ * f4), (int) (iJ2 * f4));
        float fC2 = qpi1.c();
        fcf0Var.k = rect;
        fcf0Var.l = fI2;
        fcf0Var.m = fI;
        fcf0Var.n = fI3;
        fcf0Var.j = arrayList2;
        fcf0Var.i = q5f0Var;
        fcf0Var.c = map3;
        fcf0Var.d = map4;
        fcf0Var.e = fC2;
        fcf0Var.h = ina1Var;
        fcf0Var.f = map9;
        fcf0Var.g = arrayList6;
        return fcf0Var;
    }
}
