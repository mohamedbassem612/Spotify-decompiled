package p;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.FacebookException;
import com.spotify.appauthorization.builtinauth.model.FieldValidator;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class nhc implements ehc, yl01, Function, ya, Function3, epi1, c290, m6o0 {
    public final /* synthetic */ byte a;

    public nhc(g4r g4rVar) {
        this.a = (byte) 28;
        g4rVar.l(UseTorchAsFlashQuirk.class);
    }

    public static xkg0 A() {
        return xkg0.N0;
    }

    public static Next B(q051 q051Var) {
        return Next.a(f46.S0(new hd51[]{sc51.b, new tc51(q051Var.a, q051Var.c, qb10.b, true)}));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException */
    public static void C(String str, Object obj, Object obj2) throws FieldValidator.ValidationException {
        if (obj.equals(obj2)) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        StringBuilder sbN = gvg.n("Expected \"", str, "\" to be ", strValueOf, ", but was ");
        sbN.append(strValueOf2);
        throw new FieldValidator.ValidationException(sbN.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException */
    public static void D(String str, String str2) throws FieldValidator.ValidationException {
        if (jhc1.F(str)) {
            throw new FieldValidator.ValidationException(f4i1.f("\"", str2, "\" can not be empty"));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException */
    public static void E(Object obj, String str) throws FieldValidator.ValidationException {
        if (obj == null) {
            throw new FieldValidator.ValidationException(str.concat(" can't be null"));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException */
    public static void F(int i, int i2, int i3, String str) throws FieldValidator.ValidationException {
        if (i3 < i || i3 > i2) {
            StringBuilder sbS = l1d.s(i3, "\"", str, "\" ", " is not within range ");
            sbS.append(i);
            sbS.append(" to ");
            sbS.append(i2);
            throw new FieldValidator.ValidationException(sbS.toString());
        }
    }

    public static final int i(int i) {
        xkg0 xkg0Var = xkg0.N0;
        if (i < 1) {
            i = 1;
        }
        return Integer.highestOneBit(i * 3);
    }

    public static final int j(int i) {
        xkg0 xkg0Var = xkg0.N0;
        return Integer.numberOfLeadingZeros(i) + 1;
    }

    public static cnr k() {
        return vsk.a;
    }

    public static kp00 l() {
        return new kp00((r2p1) new uzq(w3p1.o(new l4r(hvm.c, 1, lcl1.W0, new j4r(lcl1.Y0), lcl1.X0), lcl1.Z0)));
    }

    public static mir0 m(p6r0 p6r0Var) {
        return o(p6r0Var, null);
    }

    public static mir0 o(p6r0 p6r0Var, qir0 qir0Var) {
        return new mir0(kx40.g(p6r0Var, qir0Var, 4));
    }

    public static mir0 p(kir0 kir0Var) {
        return new mir0(kir0Var.a());
    }

    public static mir0 r() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(Observable.just(new eir0(yon1.I5(), (qir0) null, (qir0) null)));
    }

    public static void s(DrawScope drawScope, long j, boolean z) {
        float fE = Size.e(drawScope.j()) * 2.0f;
        float f = z ? 0.0f : -Float.intBitsToFloat((int) (drawScope.j() >> 32));
        DrawScope.v(drawScope, j, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L), 120);
    }

    public static void t(DrawScope drawScope, long j, boolean z) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        DrawScope.v(drawScope, j, (((long) Float.floatToRawIntBits(z ? 0.0f : -Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 120);
    }

    public static byte[] w(b380 b380Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(b380Var.size());
        Iterator it = b380Var.iterator();
        while (it.hasNext()) {
            feo feoVar = (feo) it.next();
            Bundle bundleC = feoVar.c();
            Bitmap bitmap = feoVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                dm5.y(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleC.putByteArray(feo.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleC);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    public static iti1 x(qx81 qx81Var, da daVar, int i, int i2, boolean z, boolean z2) {
        beg begVarK;
        Boolean bool;
        h0h1 h0h1VarT0;
        sw9 sw9Var;
        e1h1 e1h1VarJ;
        ?? r3 = 0;
        boolean z3 = i2 != 3;
        boolean z4 = (z2 && z) ? false : true;
        Object obj = null;
        if (!z3 && qx81Var.r0().isEmpty()) {
            return new iti1(1, (Object) null, false);
        }
        jfg jfgVarS = qx81Var.t0().s();
        if (jfgVarS == null) {
            return new iti1(1, (Object) null, false);
        }
        q8a0 q8a0Var = (q8a0) daVar.invoke(Integer.valueOf(i));
        hg5 hg5Var = p0h1.a;
        if (i2 == 3 || !(jfgVarS instanceof beg)) {
            begVarK = null;
        } else if (q8a0Var.b == rcn0.a && i2 == 1) {
            beg begVar = (beg) jfgVarS;
            String str = j8a0.a;
            lf30 lf30VarF = iht.f(begVar);
            HashMap map = j8a0.j;
            if (map.containsKey(lf30VarF)) {
                kf30 kf30Var = (kf30) map.get(iht.f(begVar));
                if (kf30Var == null) {
                    eg.n("Given class ", begVar, " is not a mutable collection");
                    return null;
                }
                begVarK = kht.e(begVar).k(kf30Var);
            } else if (q8a0Var.b == rcn0.b) {
                begVarK = null;
            } else {
                begVarK = null;
            }
        } else if (q8a0Var.b == rcn0.b || i2 != 2) {
            begVarK = null;
        } else {
            beg begVar2 = (beg) jfgVarS;
            String str2 = j8a0.a;
            if (j8a0.k.containsKey(iht.f(begVar2))) {
                lf30 lf30VarF2 = iht.f(begVar2);
                String str3 = j8a0.a;
                kf30 kf30VarH = j8a0.h(lf30VarF2);
                if (kf30VarH == null) {
                    eg.n("Given class ", begVar2, " is not a read-only collection");
                    return null;
                }
                begVarK = kht.e(begVar2).k(kf30VarH);
            } else {
                begVarK = null;
            }
        }
        if (i2 == 3) {
            bool = null;
        } else {
            iep0 iep0Var = q8a0Var.a;
            int i3 = iep0Var == null ? -1 : o0h1.a[iep0Var.ordinal()];
            if (i3 == 1) {
                bool = Boolean.TRUE;
            } else if (i3 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (begVarK == null || (h0h1VarT0 = begVarK.g()) == null) {
            h0h1VarT0 = qx81Var.t0();
        }
        int i4 = i + 1;
        List listR0 = qx81Var.r0();
        List parameters = h0h1VarT0.getParameters();
        Iterator it = listR0.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q7h.U(listR0, 10), q7h.U(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            y0h1 y0h1Var = (y0h1) it2.next();
            e1h1 e1h1Var = (e1h1) next;
            if (!z4) {
                sw9Var = new sw9(obj, (int) r3, (byte) 16);
            } else if (!e1h1Var.c()) {
                sw9Var = y(e1h1Var.b().w0(), daVar, i4, z2);
            } else if (((q8a0) daVar.invoke(Integer.valueOf(i4))).a == iep0.a) {
                gmh1 gmh1VarW0 = e1h1Var.b().w0();
                sw9Var = new sw9(y3o1.Z(i3p1.C(gmh1VarW0).x0(r3), i3p1.I(gmh1VarW0).x0(true)), 1, (byte) 16);
            } else {
                sw9Var = new sw9((Object) null, 1, (byte) 16);
            }
            i4 += sw9Var.b;
            a8b0 a8b0Var = (a8b0) sw9Var.c;
            if (a8b0Var != null) {
                e1h1VarJ = rzn1.n(a8b0Var, e1h1Var.a(), y0h1Var);
            } else if (begVarK == null || e1h1Var.c()) {
                e1h1VarJ = begVarK != null ? o1h1.j(y0h1Var) : null;
            } else {
                e1h1VarJ = rzn1.n(e1h1Var.b(), e1h1Var.a(), y0h1Var);
            }
            arrayList.add(e1h1VarJ);
            r3 = 0;
            obj = null;
        }
        int i5 = i4 - i;
        if (begVarK == null && bool == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((e1h1) it3.next()) == null);
            }
            return new iti1(i5, (Object) null, false);
        }
        fg5 annotations = qx81Var.getAnnotations();
        hg5 hg5Var2 = p0h1.b;
        if (begVarK == null) {
            hg5Var2 = null;
        }
        hg5 hg5Var3 = p0h1.a;
        if (bool == null) {
            hg5Var3 = null;
        }
        byte b = 1;
        List listI0 = f46.i0(new fg5[]{annotations, hg5Var2, hg5Var3});
        int size = ((ArrayList) listI0).size();
        if (size == 0) {
            eg.m("At least one Annotations object expected");
            return null;
        }
        e0h1 e0h1VarW = prn1.w(size != 1 ? new hg5(o7h.l1(listI0), b) : (fg5) o7h.V0(listI0));
        List listR1 = qx81Var.r0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listR1.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(q7h.U(arrayList, 10), q7h.U(listR1, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            e1h1 e1h1Var2 = (e1h1) it5.next();
            e1h1 e1h1Var3 = (e1h1) next2;
            if (e1h1Var3 != null) {
                e1h1Var2 = e1h1Var3;
            }
            arrayList2.add(e1h1Var2);
        }
        qx81 qx81VarI0 = y3o1.i0(arrayList2, e0h1VarW, h0h1VarT0, bool != null ? bool.booleanValue() : qx81Var.u0());
        if (q8a0Var.c) {
            qx81VarI0 = new zgo0(qx81VarI0);
        }
        return new iti1(i5, qx81VarI0, bool != null && q8a0Var.d);
    }

    public static sw9 y(gmh1 gmh1Var, da daVar, int i, boolean z) {
        gmh1 gmh1VarZ;
        qx81 qx81Var;
        Object objQ = null;
        if (d4o1.i(gmh1Var)) {
            return new sw9((Object) null, 1, (byte) 16);
        }
        if (!(gmh1Var instanceof dq20)) {
            if (!(gmh1Var instanceof qx81)) {
                eg.o();
                return null;
            }
            iti1 iti1VarX = x((qx81) gmh1Var, daVar, i, 3, false, z);
            boolean z2 = iti1VarX.a;
            a8b0 a8b0VarQ = (qx81) iti1VarX.c;
            if (z2) {
                a8b0VarQ = vzn1.q(gmh1Var, a8b0VarQ);
            }
            return new sw9(a8b0VarQ, iti1VarX.b, (byte) 16);
        }
        boolean z3 = gmh1Var instanceof nwz0;
        dq20 dq20Var = (dq20) gmh1Var;
        qx81 qx81Var2 = dq20Var.c;
        qx81 qx81Var3 = dq20Var.b;
        iti1 iti1VarX2 = x(qx81Var3, daVar, i, 1, z3, z);
        iti1 iti1VarX3 = x(dq20Var.c, daVar, i, 2, z3, z);
        qx81 qx81Var4 = (qx81) iti1VarX3.c;
        qx81 qx81Var5 = (qx81) iti1VarX2.c;
        if (qx81Var5 != null || qx81Var4 != null) {
            if (iti1VarX2.a || iti1VarX3.a) {
                if (qx81Var4 != null) {
                    if (qx81Var5 == null) {
                        qx81Var5 = qx81Var4;
                    }
                    gmh1VarZ = y3o1.Z(qx81Var5, qx81Var4);
                } else {
                    qx81Var5.getClass();
                    gmh1VarZ = qx81Var5;
                }
                objQ = vzn1.q(gmh1Var, gmh1VarZ);
            } else if (z3) {
                qx81 qx81Var6 = qx81Var5;
                if (qx81Var5 == null) {
                }
                if (qx81Var4 != null) {
                    qx81Var6 = qx81Var3;
                    qx81Var2 = qx81Var4;
                }
                qx81Var6 = qx81Var3;
                objQ = new nwz0(qx81Var6, qx81Var2, 0);
            } else {
                if (qx81Var5 == null) {
                }
                if (qx81Var4 != null) {
                    qx81Var = qx81Var3;
                    qx81Var2 = qx81Var4;
                }
                qx81Var = qx81Var3;
                objQ = y3o1.Z(qx81Var, qx81Var2);
            }
        }
        return new sw9(objQ, iti1VarX2.b, (byte) 16);
    }

    public static String z() {
        return UUID.randomUUID().toString();
    }

    @Override // p.ehc
    public byte[] a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.b;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    public Object apply(Object obj) {
        boolean z;
        String str;
        boolean z2 = false;
        switch (this.a) {
            case 8:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof spq0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((spq0) obj3).c()) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2.isEmpty() ? j5.a : (spq0) arrayList2.get(0);
            case 11:
                nnr nnrVar = (nnr) ((spq0) obj).h();
                if (nnrVar != null) {
                    sce0 sce0Var = nnrVar.B;
                    kx7 kx7Var = sce0Var.a;
                    luq0 luq0Var = kx7Var.d;
                    luq0 luq0Var2 = luq0.e;
                    if (luq0Var == luq0Var2) {
                        up7 up7Var = kx7Var.e;
                        if (up7Var == null || up7Var.c.length() == 0 || up7Var.b.length() == 0 || up7Var.a == 7) {
                            String strN = hqq0.N(nnrVar);
                            String strV = hqq0.V(nnrVar);
                            kx7 kx7Var2 = sce0Var.a;
                            if (kx7Var2.d == luq0Var2) {
                                up7 up7Var2 = kx7Var2.e;
                                if ((up7Var2 != null ? up7Var2.a : 0) == 3) {
                                    z2 = true;
                                }
                            }
                            return new ek40(strN, strV, z2);
                        }
                        String strN2 = hqq0.N(nnrVar);
                        String strV2 = hqq0.V(nnrVar);
                        String strR = hqq0.R(nnrVar);
                        String strU = hqq0.U(nnrVar);
                        kx7 kx7Var3 = sce0Var.a;
                        if (kx7Var3.d != luq0Var2) {
                            z = false;
                        } else {
                            up7 up7Var3 = kx7Var3.e;
                            if ((up7Var3 != null ? up7Var3.a : 0) == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        String str2 = "Unknown";
                        if (kx7Var.b()) {
                            String str3 = nnrVar.b;
                            if (str3.length() <= 0) {
                                str3 = null;
                            }
                            if (str3 != null) {
                                str = str3;
                            }
                            return new dk40(strN2, strV2, strR, strU, z, str);
                        }
                        up7 up7Var4 = kx7Var.e;
                        if (up7Var4 != null) {
                            str2 = up7Var4.f;
                        }
                        str = str2;
                        return new dk40(strN2, strV2, strR, strU, z, str);
                    }
                }
                return fk40.a;
            case 17:
                return pzm.g("key_on_demand_enabled", ((Boolean) obj).booleanValue());
            default:
                ContextTrack contextTrack = (ContextTrack) obj;
                String strF0 = l4o1.f0(contextTrack);
                if (strF0 == null) {
                    strF0 = "";
                }
                return new lof1(120, strF0, new lj11(contextTrack, (byte) 0), ydh.b(ln91.a(contextTrack)));
        }
    }

    public void b(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
        if (strOptString == null) {
            return;
        }
        String strOptString2 = jSONObject.optString("link");
        String strOptString3 = jSONObject.optString("profile_picture", null);
        uo5.Y.o().M(new hww0(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null), true);
    }

    public Object convert(int i) {
        kn71 kn71VarA = kn71.a(i);
        return kn71VarA == null ? kn71.UNRECOGNIZED : kn71VarA;
    }

    public void d(FacebookException facebookException) {
        Objects.toString(facebookException);
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    public void e(int i, float f, long j, long j2, td10 td10Var, b0k b0kVar, int i2) {
        x340 x340Var;
        boolean z;
        Uri uri;
        String str;
        x340 x340Var2 = (x340) b0kVar;
        int i3 = i2 | (kk0.t(1694331068, i, x340Var2) ? 4 : 2) | (x340Var2.d(f) ? 32 : 16) | (x340Var2.f(j) ? 256 : 128) | (x340Var2.f(j2) ? 2048 : 1024) | (x340Var2.i(td10Var) ? 16384 : 8192) | (x340Var2.g(this) ? 131072 : 65536);
        if (x340Var2.Y(i3 & 1, (74899 & i3) != 74898)) {
            float f2 = (i == 1 || i == 3 || i == 4 || i == 6) ? f / 2.0f : f;
            float f3 = (i == 1 || i == 2 || i == 3) ? f / 2.0f : f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = i1p1.r(u291.s(nim0Var, f2, f3));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarR);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 14) == 4) | ((458752 & i3) == 131072) | ((i3 & 896) == 256);
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                zw60 zw60Var = new zw60(i, this, j, j2);
                x340Var2.s0(zw60Var);
                objT = zw60Var;
            }
            j0o1.b(0, x340Var2, (iu30) objT, qim0VarD);
            int iC = l1d.C(i);
            if (iC == 6) {
                x340Var = x340Var2;
                z = true;
                x340Var.i0(-1761683009);
                tnx tnxVar = tnx.c;
                uwr uwrVar = cbx.a;
                w0h1.a(tnxVar, isl.a, u291.r(nim0Var, f / 2.0f), cbx.a(x340Var).a.c, 0L, false, x340Var, tnx.d | 48, 48);
                x340Var.r(false);
            } else if (iC != 7) {
                x340Var2.i0(-888091846);
                x340Var2.r(false);
                x340Var = x340Var2;
                z = true;
            } else {
                x340Var2.i0(-1761404474);
                if (td10Var == null || (str = td10Var.a) == null) {
                    uri = Uri.EMPTY;
                } else {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str == null || (uri = Uri.parse(str)) == null) {
                        uri = Uri.EMPTY;
                    }
                }
                uri.getClass();
                String str2 = td10Var != null ? td10Var.b : null;
                String str3 = str2 == null ? "" : str2;
                String str4 = td10Var != null ? td10Var.c : null;
                String str5 = str4 != null ? str4 : "";
                uwr uwrVar2 = cbx.a;
                z = true;
                bmq0.a(uri, i1p1.q(u291.d(nim0Var, 1.0f), er31.a), (hcx) null, str3, str5, ((vex) zex.a.b).d, 0L, false, x340Var2, 0, 196);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ax60(this, i, f, j, j2, td10Var, i2);
        }
    }

    public void f(td10 td10Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-893463644);
        int i2 = (x340Var.i(td10Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w2g0.c(qim0Var, (tl3) null, apo.r(1741150202, new cex(this, td10Var, (byte) 24), x340Var), x340Var, ((i2 >> 3) & 14) | 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50(this, td10Var, qim0Var, i, (byte) 12);
        }
    }

    public void g(boolean z, boolean z2, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1465382416);
        int i2 = (b0kVar3.h(z) ? 4 : 2) | i | (b0kVar3.h(z2) ? 32 : 16) | (b0kVar3.g(this) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, z ? 2131962678 : 2131962677);
            String strN0 = cwl1.n0(2131962679, new Object[]{"[devices-icon]"}, b0kVar3);
            String str = z2 ? "\n\n" : " ";
            String strO1 = cwl1.o0(b0kVar3, 2131962664);
            ye5 ye5Var = new ye5();
            ye5Var.g(strO0);
            ye5Var.g(str);
            int iW0 = ihc1.w0(strN0, "[devices-icon]", 0, false, 6);
            if (iW0 < 0) {
                ye5Var.g(strN0);
            } else {
                ye5Var.g(strN0.substring(0, iW0));
                z6p1.r(ye5Var, "devices", strO1);
                ye5Var.g(strN0.substring(14 + iW0));
            }
            af5 af5VarP = ye5Var.p();
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, cbx.a(b0kVar3).b.b, u291.f(nim0.a, 1.0f), cbx.d(b0kVar3).j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, mqo1.t(new mmr0[]{new mmr0("devices", new gh80(new d6t0(7, fc11.Y(12.0f, 4294967296L), fc11.Y(12.0f, 4294967296L)), ksi.b))}), b0kVar2, 0, 0, 2016);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new st8(this, z, z2, i);
        }
    }

    public a8b0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    public void h(td10 td10Var, boolean z, Function0 function0, qim0 qim0Var, es41 es41Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        es41 es41Var2;
        es41 es41VarC;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1684691488);
        int i2 = i | (x340Var.i(td10Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 11264 | (x340Var.g(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                es41VarC = l6o1.C(0, 0, 1, x340Var);
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                es41VarC = es41Var;
            }
            x340Var.s();
            uwr uwrVar = cbx.a;
            w2g0.c(u291.d(qim0Var3, 1.0f), (tl3) null, apo.r(-767730762, new kh2(this, td10Var, ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 1, es41VarC, cbx.b(x340Var).b, function0, z), x340Var), x340Var, 3072, 6);
            es41Var2 = es41VarC;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            es41Var2 = es41Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(this, td10Var, z, function0, qim0Var2, es41Var2, i, (byte) 10);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        ibk0 ibk0Var = (ibk0) obj3;
        kby kbyVar = ((cxc0) obj).f;
        List list = ((m7e0) obj2).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof j7e0) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((j7e0) it.next()).b);
        }
        Set setP1 = o7h.p1(arrayList2);
        return new h300(ibk0Var.b() && z6k0.b(kbyVar.q), kbyVar.a, kbyVar.b, setP1);
    }

    public void u() {
        Object obj = Boolean.FALSE;
        vsk.a.a(Boolean.valueOf(!obj.equals(obj)), "location group", "user location collection enabled");
    }

    public void v() {
        vsk.a.a(Boolean.valueOf(Boolean.FALSE.equals(Boolean.TRUE)), "device id sharing group", "device id sharing enabled");
    }

    public /* synthetic */ nhc(byte b) {
        this.a = b;
    }

    public void c() {
    }
}
