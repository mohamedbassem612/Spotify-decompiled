package p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItem;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ij81 implements myc, Function, o5d0, k1q0, usi1, Init, e2j0 {
    public static final ij81 A1;
    public static final ij81 B1;
    public static final ij81 C1;
    public static final ij81 D1;
    public static final ij81 E1;
    public static final ij81 F1;
    public static final ij81 G1;
    public static final ij81 H1;
    public static final ij81 I1;
    public static final ij81 J1;
    public static final ij81 K1;
    public static final ij81 L1;
    public static final ij81 M1;
    public static final ij81 N0;
    public static final ij81 N1;
    public static final ij81 O0;
    public static final ij81 O1;
    public static final ij81 P0;
    public static final ij81 P1;
    public static final ij81 Q0;
    public static final ij81 Q1;
    public static final ij81 R0;
    public static final ij81 R1;
    public static final ij81 S0;
    public static final ij81 S1;
    public static final ij81 T0;
    public static final ij81 T1;
    public static final ij81 U0;
    public static final ij81 U1;
    public static final ij81 V0;
    public static final ij81 V1;
    public static final ij81 W0;
    public static final ij81 W1;
    public static final ij81 X;
    public static final ij81 X0;
    public static final ij81 X1;
    public static final ij81 Y;
    public static final ij81 Y0;
    public static final ij81 Y1;
    public static final ij81 Z;
    public static final ij81 Z0;
    public static final ij81 Z1;
    public static final ij81 a1;
    public static final ij81 a2;
    public static final ij81 b1;
    public static final ij81 b2;
    public static final ij81 c1;
    public static final ij81 c2;
    public static final ij81 d;
    public static final ij81 d1;
    public static final ij81 e;
    public static final ij81 e1;
    public static final ij81 f;
    public static final ij81 f1;
    public static final ij81 g;
    public static final ij81 g1;
    public static final ij81 h;
    public static final ij81 h1;
    public static final ij81 i;
    public static final ij81 i1;
    public static final ij81 j1;
    public static final ij81 k1;
    public static final ij81 l1;
    public static final ij81 m1;
    public static final ij81 n1;
    public static final ij81 o1;
    public static final ij81 p1;
    public static final ij81 q1;
    public static final ij81 r1;
    public static final ij81 s1;
    public static final ij81 t;
    public static final ij81 t1;
    public static final ij81 u1;
    public static final ij81 v1;
    public static final ij81 w1;
    public static final ij81 x1;
    public static final ij81 y1;
    public static final ij81 z1;
    public final /* synthetic */ byte a;
    public int b;
    public static final String[] c = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    public static final ij81 d2 = new ij81(143, (byte) 1);

    static {
        byte b = 1;
        d = new ij81(0, b);
        e = new ij81(8, b);
        f = new ij81(9, b);
        g = new ij81(11, b);
        h = new ij81(12, b);
        i = new ij81(13, b);
        t = new ij81(14, b);
        X = new ij81(15, b);
        Y = new ij81(17, b);
        Z = new ij81(20, b);
        N0 = new ij81(42, b);
        O0 = new ij81(43, b);
        P0 = new ij81(45, b);
        Q0 = new ij81(47, b);
        R0 = new ij81(48, b);
        S0 = new ij81(54, b);
        T0 = new ij81(61, b);
        U0 = new ij81(67, b);
        V0 = new ij81(64, b);
        W0 = new ij81(66, b);
        X0 = new ij81(68, b);
        Y0 = new ij81(74, b);
        Z0 = new ij81(75, b);
        a1 = new ij81(79, b);
        b1 = new ij81(81, b);
        c1 = new ij81(82, b);
        d1 = new ij81(83, b);
        e1 = new ij81(84, b);
        f1 = new ij81(85, b);
        int i2 = 142;
        g1 = new ij81(i2, (byte) 1);
        byte b3 = 1;
        h1 = new ij81(87, b3);
        i1 = new ij81(88, b3);
        j1 = new ij81(89, b3);
        k1 = new ij81(90, b3);
        l1 = new ij81(91, b3);
        m1 = new ij81(93, b3);
        n1 = new ij81(95, b3);
        o1 = new ij81(96, b3);
        p1 = new ij81(97, b3);
        q1 = new ij81(98, b3);
        r1 = new ij81(99, b3);
        s1 = new ij81(100, b3);
        t1 = new ij81(EnergyProfile.EVCONNECTOR_TYPE_OTHER, b3);
        u1 = new ij81(102, b3);
        v1 = new ij81(103, b3);
        w1 = new ij81(104, b3);
        x1 = new ij81(105, b3);
        y1 = new ij81(106, b3);
        z1 = new ij81(107, b3);
        A1 = new ij81(108, b3);
        B1 = new ij81(109, b3);
        C1 = new ij81(110, b3);
        D1 = new ij81(ContentType.SHORT_FORM_ON_DEMAND, b3);
        E1 = new ij81(ContentType.LONG_FORM_ON_DEMAND, b3);
        F1 = new ij81(ContentType.LIVE, b3);
        G1 = new ij81(114, b3);
        H1 = new ij81(115, b3);
        I1 = new ij81(116, b3);
        J1 = new ij81(117, b3);
        K1 = new ij81(118, b3);
        L1 = new ij81(119, b3);
        M1 = new ij81(120, b3);
        N1 = new ij81(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, b3);
        O1 = new ij81(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, b3);
        P1 = new ij81(ContentType.USER_GENERATED_LIVE, b3);
        Q1 = new ij81(126, b3);
        R1 = new ij81(127, b3);
        S1 = new ij81(SemanticState.Focused, b3);
        T1 = new ij81(132, b3);
        U1 = new ij81(133, b3);
        V1 = new ij81(134, b3);
        W1 = new ij81(135, b3);
        X1 = new ij81(136, b3);
        Y1 = new ij81(137, b3);
        Z1 = new ij81(138, b3);
        a2 = new ij81(139, b3);
        b2 = new ij81(140, b3);
        c2 = new ij81(i2, (byte) 1);
    }

    public ij81(Context context) {
        this.a = (byte) 7;
        this.b = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
    }

    public static b2e0 l(a2e0 a2e0Var, sw9 sw9Var) {
        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (IOException) sw9Var.c;
        if (!(invalidResponseCodeException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return null;
        }
        int i2 = invalidResponseCodeException.d;
        if (i2 != 403 && i2 != 404 && i2 != 410 && i2 != 416 && i2 != 500 && i2 != 503) {
            return null;
        }
        if (a2e0Var.e) {
            if (a2e0Var.a(2)) {
                return new b2e0(2, 60000L);
            }
            if (a2e0Var.a(1)) {
                return new b2e0(1, 300000L);
            }
            return null;
        }
        if (a2e0Var.a(1)) {
            return new b2e0(1, 300000L);
        }
        if (a2e0Var.a(2)) {
            return new b2e0(2, 60000L);
        }
        return null;
    }

    public static long n(sw9 sw9Var) {
        for (DataSourceException cause = (IOException) sw9Var.c; cause != null; cause = cause.getCause()) {
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof DataSourceException) && cause.a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((sw9Var.b - 1) * 1000, 5000);
    }

    public int a() {
        return 0;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                f2d0 f2d0Var = (f2d0) obj;
                int i2 = this.b;
                s04 s04Var = s04.f;
                if (f2d0Var.c) {
                    return s04Var;
                }
                if (f2d0Var.b) {
                    return s04.c;
                }
                int i3 = f2d0Var.a;
                if (i3 <= (-i2)) {
                    return s04Var;
                }
                return i3 >= i2 ? s04.d : s04.e;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                int i4 = this.b;
                if (iIntValue == -1) {
                    iIntValue = i4;
                }
                return Integer.valueOf(iIntValue);
            case 11:
                int i5 = this.b;
                return new wb10(i5, i5);
            case 15:
                return new yre1(this.b, (Throwable) obj);
            case 16:
                List itemsList = ((CollectionPlatformContextItemsResponse) obj).getItemsList();
                int i6 = this.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : itemsList) {
                    if (u890.j(((CollectionPlatformContextItem) obj2).n(), kx40.d(i6))) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CollectionPlatformContextItem) it.next()).getUri());
                }
                return o7h.p1(arrayList2);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                beh behVar = (feh) obj;
                return behVar instanceof beh ? new r8z0(behVar.a) : new s8z0(this.b);
            default:
                return new h231(this.b, (Throwable) obj);
        }
    }

    public void b(int i2, int i3) {
        this.b++;
    }

    public void c(int i2, int i3) {
        this.b++;
    }

    public void e(int i2, int i3) {
        this.b++;
    }

    public First e0(Object obj) {
        rwd0 rwd0Var = (rwd0) obj;
        zzd0 zzd0Var = rwd0Var.a;
        int i2 = this.b;
        int i3 = i2 == 0 ? -1 : tzd0.a[l1d.C(i2)];
        HashSet hashSetA = w7x.a;
        HashSet hashSetA2 = i3 == 1 ? Effects.a(new bxd0[]{new bxd0(zzd0Var.a.c, (tv80) null)}) : hashSetA;
        if (rwd0Var.c && zzd0Var.k.a == 3) {
            hashSetA = Effects.a(new xwd0[]{xwd0.a});
        }
        return First.c(rwd0Var, dm61.y0(hashSetA2, hashSetA));
    }

    public int f() {
        return this.b;
    }

    public boolean g() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    public Object h(eha0 eha0Var, float f2) {
        int i2;
        int iArgb;
        float f3;
        int iArgb2;
        float f4;
        float fE;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        boolean z = eha0Var.o() == 1;
        if (z) {
            eha0Var.a();
        }
        while (eha0Var.g()) {
            arrayList.add(Float.valueOf((float) eha0Var.i()));
        }
        int i5 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.b = 2;
        }
        if (z) {
            eha0Var.d();
        }
        int size = this.b;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.b = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = this.b * 4;
            if (i6 >= i2) {
                break;
            }
            int i9 = i6 / 4;
            double dFloatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i4;
            int i11 = i6 % 4;
            if (i11 != 0) {
                if (i11 == i3) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 2) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 3) {
                    iArr[i9] = Color.argb(255, i7, i8, (int) (dFloatValue * 255.0d));
                }
            } else if (i9 > 0) {
                float f5 = (float) dFloatValue;
                if (fArr[i9 - 1] >= f5) {
                    fArr[i9] = f5 + 0.01f;
                } else {
                    fArr[i9] = (float) dFloatValue;
                }
            } else {
                fArr[i9] = (float) dFloatValue;
            }
            i6++;
            i4 = i10;
            i3 = 1;
        }
        int i12 = i4;
        o650 o650Var = new o650(fArr, iArr);
        if (arrayList.size() <= i2) {
            return o650Var;
        }
        int size2 = (arrayList.size() - i2) / 2;
        float[] fArr2 = new float[size2];
        float[] fArr3 = new float[size2];
        int i13 = i12;
        while (i2 < arrayList.size()) {
            if (i2 % 2 == 0) {
                fArr2[i13] = ((Float) arrayList.get(i2)).floatValue();
            } else {
                fArr3[i13] = ((Float) arrayList.get(i2)).floatValue();
                i13++;
            }
            i2++;
        }
        float[] fArrCopyOf = o650Var.a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size2 != 0) {
            int length = fArrCopyOf.length + size2;
            float[] fArr4 = new float[length];
            int i14 = i12;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            while (i14 < length) {
                float f6 = i16 < fArrCopyOf.length ? fArrCopyOf[i16] : Float.NaN;
                float f7 = i17 < size2 ? fArr2[i17] : Float.NaN;
                if (Float.isNaN(f7) || f6 < f7) {
                    fArr4[i14] = f6;
                    i16++;
                } else if (Float.isNaN(f6) || f7 < f6) {
                    fArr4[i14] = f7;
                    i17++;
                } else {
                    fArr4[i14] = f6;
                    i16++;
                    i17++;
                    i15++;
                }
                i14++;
            }
            fArrCopyOf = i15 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i15);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i18 = i12;
        while (i18 < length2) {
            float f8 = fArrCopyOf[i18];
            int iBinarySearch = Arrays.binarySearch(fArr, f8);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f9 = fArr3[iBinarySearch2];
                if (size < i5 || f8 == fArr[i12]) {
                    iArgb = iArr[i12];
                } else {
                    int i19 = 1;
                    while (true) {
                        if (i19 >= size) {
                            hhg1.n("Unreachable code.");
                            return null;
                        }
                        f3 = fArr[i19];
                        if (f3 >= f8 || i19 == size - 1) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 != size - 1 || f8 < f3) {
                        int i20 = i19 - 1;
                        float f10 = fArr[i20];
                        int iT = cxm.t(iArr[i20], iArr[i19], (f8 - f10) / (f3 - f10));
                        iArgb = Color.argb((int) (f9 * 255.0f), Color.red(iT), Color.green(iT), Color.blue(iT));
                    } else {
                        iArgb = Color.argb((int) (f9 * 255.0f), Color.red(iArr[i19]), Color.green(iArr[i19]), Color.blue(iArr[i19]));
                    }
                }
                iArr2[i18] = iArgb;
            } else {
                int i21 = iArr[iBinarySearch];
                if (size2 < i5 || f8 <= fArr2[i12]) {
                    iArgb2 = Color.argb((int) (fArr3[i12] * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                } else {
                    int i22 = 1;
                    while (true) {
                        if (i22 >= size2) {
                            hhg1.n("Unreachable code.");
                            return null;
                        }
                        f4 = fArr2[i22];
                        if (f4 >= f8 || i22 == size2 - 1) {
                            break;
                        }
                        i22++;
                    }
                    if (f4 <= f8) {
                        fE = fArr3[i22];
                    } else {
                        int i23 = i22 - 1;
                        float f11 = fArr2[i23];
                        fE = itj0.e(fArr3[i23], fArr3[i22], (f8 - f11) / (f4 - f11));
                    }
                    iArgb2 = Color.argb((int) (fE * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                }
                iArr2[i18] = iArgb2;
            }
            i18++;
            i5 = 2;
        }
        return new o650(fArrCopyOf, iArr2);
    }

    public ij81 i() {
        return new ij81(this);
    }

    public void j(omg1 omg1Var) {
        View view = omg1Var.b;
        HashMap map = omg1Var.a;
        Integer numValueOf = (Integer) map.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        map.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + iRound;
        int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = iRound2;
        iArr[1] = (view.getHeight() / 2) + iRound2;
        map.put("android:visibilityPropagation:center", iArr);
    }

    public Integer k(RecyclerView recyclerView) {
        View viewH;
        a layoutManager = recyclerView.getLayoutManager();
        int I = layoutManager != null ? layoutManager.I() : 0;
        for (int i2 = 0; i2 < I; i2++) {
            if (layoutManager != null && (viewH = layoutManager.H(i2)) != null) {
                int iV = a.V(viewH);
                if (r(viewH, recyclerView)) {
                    return Integer.valueOf(iV);
                }
            }
        }
        return null;
    }

    public int m(int i2) {
        int i3 = this.b;
        if (i3 == -1) {
            return i2 == 7 ? 6 : 3;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    public long o(ViewGroup viewGroup, jhg1 jhg1Var, omg1 omg1Var, omg1 omg1Var2) {
        int i2;
        int iCenterY;
        int iCenterX;
        int iAbs;
        int[] iArr;
        int[] iArr2;
        Integer num;
        Rect rect;
        omg1 omg1Var3 = omg1Var;
        if (omg1Var3 == null && omg1Var2 == null) {
            return 0L;
        }
        fj30 fj30Var = jhg1Var.W0;
        Rect rect2 = null;
        if (fj30Var != null) {
            switch (fj30Var.a) {
                case 0:
                    rect = fj30Var.b;
                    rect2 = rect;
                    break;
                default:
                    rect = fj30Var.b;
                    if (!rect.isEmpty()) {
                        rect2 = rect;
                    }
                    break;
            }
        }
        int i3 = -1;
        if (omg1Var2 != null) {
            int iIntValue = 8;
            if (omg1Var3 != null && (num = (Integer) omg1Var3.a.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i2 = -1;
            } else {
                omg1Var3 = omg1Var2;
                i2 = 1;
            }
        } else {
            i2 = -1;
        }
        int i4 = (omg1Var3 == null || (iArr2 = (int[]) omg1Var3.a.get("android:visibilityPropagation:center")) == null) ? -1 : iArr2[0];
        if (omg1Var3 != null && (iArr = (int[]) omg1Var3.a.get("android:visibilityPropagation:center")) != null) {
            i3 = iArr[1];
        }
        int[] iArr3 = new int[2];
        viewGroup.getLocationOnScreen(iArr3);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr3[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr3[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rect2 != null) {
            iCenterX = rect2.centerX();
            iCenterY = rect2.centerY();
        } else {
            iCenterY = (iRound2 + height) / 2;
            iCenterX = (iRound + width) / 2;
        }
        int i5 = this.b;
        if (i5 == 8388611) {
            if (viewGroup.getLayoutDirection() == 1) {
                i5 = 5;
            } else {
                i5 = 3;
            }
        } else if (i5 == 8388613) {
            if (viewGroup.getLayoutDirection() == 1) {
                i5 = 3;
            } else {
                i5 = 5;
            }
        }
        if (i5 == 3) {
            iAbs = Math.abs(iCenterY - i3) + (width - i4);
        } else if (i5 == 5) {
            iAbs = Math.abs(iCenterY - i3) + (i4 - iRound);
        } else if (i5 != 48) {
            iAbs = i5 != 80 ? 0 : Math.abs(iCenterX - i4) + (i3 - iRound2);
        } else {
            iAbs = Math.abs(iCenterX - i4) + (height - i3);
        }
        float f2 = iAbs;
        int i6 = this.b;
        float width2 = f2 / ((i6 == 3 || i6 == 5 || i6 == 8388611 || i6 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j = jhg1Var.c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i2)) / 3.0f) * width2);
    }

    public Object p(Object obj, mma0 mma0Var) {
        return ((e0h1) obj).a.get(this.b);
    }

    public ArrayList q(RecyclerView recyclerView) {
        View viewH;
        a layoutManager = recyclerView.getLayoutManager();
        int I = layoutManager != null ? layoutManager.I() : 0;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < I; i2++) {
            if (layoutManager != null && (viewH = layoutManager.H(i2)) != null) {
                int iV = a.V(viewH);
                if (r(viewH, recyclerView)) {
                    arrayList.add(Integer.valueOf(iV));
                }
            }
        }
        return arrayList;
    }

    public boolean r(View view, RecyclerView recyclerView) {
        return view != null && yap1.l(view, recyclerView) >= this.b;
    }

    public void s(int i2) {
        this.b = i2;
    }

    public void t(View view, float f2) {
        float measuredWidth = 1.0f - (((this.b * 2) / view.getMeasuredWidth()) * f2);
        view.setScaleX(measuredWidth);
        view.setScaleY(measuredWidth);
        float fMax = Math.max(0.6f, 1.0f - (f2 * 0.4f));
        xwd xwdVar = (xwd) view.getTag(2131430297);
        if (xwdVar == null) {
            view.setAlpha(fMax);
        } else {
            xwdVar.a = fMax;
        }
    }

    public void u(dxc dxcVar, Throwable th) {
        String str;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder("Failed to dismiss ");
        if (i2 != 1) {
            str = i2 != 2 ? "null" : "PODCAST_ONBOARDING";
        } else {
            str = "AUDIOBOOKS_ONBOARDING";
        }
        sb.append(str);
        sb.append(" - ");
        sb.append(th);
        Logger.d(sb.toString(), new Object[0]);
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        view.setMinimumHeight(this.b + hsl1Var.a.i(1).b);
        return hsl1Var;
    }

    public /* synthetic */ ij81(int i2, byte b) {
        this.a = b;
        this.b = i2;
    }

    public ij81(k9r k9rVar, int i2) {
        this.a = (byte) 10;
        this.b = i2;
    }

    public ij81(ij81 ij81Var) {
        this.a = (byte) 27;
        this.b = ij81Var.b;
    }

    public ij81(Activity activity) {
        this.a = (byte) 13;
        this.b = ago1.o(activity, 2130968769, activity.getColor(2131102448));
    }

    public ij81() {
        this.a = (byte) 0;
        this.b = 80;
    }

    public void z(dxc dxcVar, sy21 sy21Var) {
    }

    public void d(int i2, int i3, Object obj) {
    }
}
