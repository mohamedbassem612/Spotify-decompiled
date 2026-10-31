package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kil {
    public static final int[] h = {0, 4, 8};
    public static final SparseIntArray i;
    public static final SparseIntArray j;
    public String a;
    public String b = "";
    public String[] c = new String[0];
    public int d = 0;
    public final HashMap e = new HashMap();
    public boolean f = true;
    public final HashMap g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static fil d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        fil filVar = new fil();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, inz0.c);
        s(filVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return filVar;
    }

    public static int[] j(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Object obj = null;
            try {
                iIntValue = bmz0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.P0;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.P0.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static fil k(Context context, AttributeSet attributeSet, boolean z) {
        fil filVar = new fil();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? inz0.c : inz0.a);
        if (z) {
            s(filVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                gil gilVar = filVar.e;
                if (i2 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    iil iilVar = filVar.c;
                    jil jilVar = filVar.f;
                    hil hilVar = filVar.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        hilVar.a = true;
                        gilVar.b = true;
                        iilVar.a = true;
                        jilVar.a = true;
                    }
                    SparseIntArray sparseIntArray = i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            gilVar.q = p(typedArrayObtainStyledAttributes, index, gilVar.q);
                            break;
                        case 2:
                            gilVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.J);
                            break;
                        case 3:
                            gilVar.p = p(typedArrayObtainStyledAttributes, index, gilVar.p);
                            break;
                        case 4:
                            gilVar.o = p(typedArrayObtainStyledAttributes, index, gilVar.o);
                            break;
                        case 5:
                            gilVar.z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            gilVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, gilVar.D);
                            break;
                        case 7:
                            gilVar.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, gilVar.E);
                            break;
                        case 8:
                            gilVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.K);
                            break;
                        case 9:
                            gilVar.w = p(typedArrayObtainStyledAttributes, index, gilVar.w);
                            break;
                        case 10:
                            gilVar.v = p(typedArrayObtainStyledAttributes, index, gilVar.v);
                            break;
                        case 11:
                            gilVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.Q);
                            break;
                        case 12:
                            gilVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.R);
                            break;
                        case 13:
                            gilVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.N);
                            break;
                        case 14:
                            gilVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.P);
                            break;
                        case 15:
                            gilVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.S);
                            break;
                        case 16:
                            gilVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.O);
                            break;
                        case 17:
                            gilVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, gilVar.e);
                            break;
                        case 18:
                            gilVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, gilVar.f);
                            break;
                        case 19:
                            gilVar.g = typedArrayObtainStyledAttributes.getFloat(index, gilVar.g);
                            break;
                        case 20:
                            gilVar.x = typedArrayObtainStyledAttributes.getFloat(index, gilVar.x);
                            break;
                        case 21:
                            gilVar.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, gilVar.d);
                            break;
                        case 22:
                            int i3 = typedArrayObtainStyledAttributes.getInt(index, iilVar.b);
                            iilVar.b = i3;
                            iilVar.b = h[i3];
                            break;
                        case 23:
                            gilVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, gilVar.c);
                            break;
                        case 24:
                            gilVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.G);
                            break;
                        case 25:
                            gilVar.i = p(typedArrayObtainStyledAttributes, index, gilVar.i);
                            break;
                        case 26:
                            gilVar.j = p(typedArrayObtainStyledAttributes, index, gilVar.j);
                            break;
                        case 27:
                            gilVar.F = typedArrayObtainStyledAttributes.getInt(index, gilVar.F);
                            break;
                        case 28:
                            gilVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.H);
                            break;
                        case 29:
                            gilVar.k = p(typedArrayObtainStyledAttributes, index, gilVar.k);
                            break;
                        case 30:
                            gilVar.l = p(typedArrayObtainStyledAttributes, index, gilVar.l);
                            break;
                        case 31:
                            gilVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.L);
                            break;
                        case 32:
                            gilVar.t = p(typedArrayObtainStyledAttributes, index, gilVar.t);
                            break;
                        case 33:
                            gilVar.u = p(typedArrayObtainStyledAttributes, index, gilVar.u);
                            break;
                        case 34:
                            gilVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.I);
                            break;
                        case 35:
                            gilVar.n = p(typedArrayObtainStyledAttributes, index, gilVar.n);
                            break;
                        case 36:
                            gilVar.m = p(typedArrayObtainStyledAttributes, index, gilVar.m);
                            break;
                        case 37:
                            gilVar.y = typedArrayObtainStyledAttributes.getFloat(index, gilVar.y);
                            break;
                        case 38:
                            filVar.a = typedArrayObtainStyledAttributes.getResourceId(index, filVar.a);
                            break;
                        case 39:
                            gilVar.V = typedArrayObtainStyledAttributes.getFloat(index, gilVar.V);
                            break;
                        case 40:
                            gilVar.U = typedArrayObtainStyledAttributes.getFloat(index, gilVar.U);
                            break;
                        case 41:
                            gilVar.W = typedArrayObtainStyledAttributes.getInt(index, gilVar.W);
                            break;
                        case 42:
                            gilVar.X = typedArrayObtainStyledAttributes.getInt(index, gilVar.X);
                            break;
                        case 43:
                            iilVar.d = typedArrayObtainStyledAttributes.getFloat(index, iilVar.d);
                            break;
                        case 44:
                            jilVar.m = true;
                            jilVar.n = typedArrayObtainStyledAttributes.getDimension(index, jilVar.n);
                            break;
                        case 45:
                            jilVar.c = typedArrayObtainStyledAttributes.getFloat(index, jilVar.c);
                            break;
                        case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                            jilVar.d = typedArrayObtainStyledAttributes.getFloat(index, jilVar.d);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                            jilVar.e = typedArrayObtainStyledAttributes.getFloat(index, jilVar.e);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                            jilVar.f = typedArrayObtainStyledAttributes.getFloat(index, jilVar.f);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                            jilVar.g = typedArrayObtainStyledAttributes.getDimension(index, jilVar.g);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                            jilVar.h = typedArrayObtainStyledAttributes.getDimension(index, jilVar.h);
                            break;
                        case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                            jilVar.j = typedArrayObtainStyledAttributes.getDimension(index, jilVar.j);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                            jilVar.k = typedArrayObtainStyledAttributes.getDimension(index, jilVar.k);
                            break;
                        case 53:
                            jilVar.l = typedArrayObtainStyledAttributes.getDimension(index, jilVar.l);
                            break;
                        case 54:
                            gilVar.Y = typedArrayObtainStyledAttributes.getInt(index, gilVar.Y);
                            break;
                        case 55:
                            gilVar.Z = typedArrayObtainStyledAttributes.getInt(index, gilVar.Z);
                            break;
                        case 56:
                            gilVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.a0);
                            break;
                        case 57:
                            gilVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.b0);
                            break;
                        case 58:
                            gilVar.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.c0);
                            break;
                        case 59:
                            gilVar.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.d0);
                            break;
                        case 60:
                            jilVar.b = typedArrayObtainStyledAttributes.getFloat(index, jilVar.b);
                            break;
                        case 61:
                            gilVar.A = p(typedArrayObtainStyledAttributes, index, gilVar.A);
                            break;
                        case 62:
                            gilVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.B);
                            break;
                        case 63:
                            gilVar.C = typedArrayObtainStyledAttributes.getFloat(index, gilVar.C);
                            break;
                        case 64:
                            hilVar.b = p(typedArrayObtainStyledAttributes, index, hilVar.b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                hilVar.d = clv.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                hilVar.d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            hilVar.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            hilVar.h = typedArrayObtainStyledAttributes.getFloat(index, hilVar.h);
                            break;
                        case 68:
                            iilVar.e = typedArrayObtainStyledAttributes.getFloat(index, iilVar.e);
                            break;
                        case 69:
                            gilVar.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            gilVar.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            break;
                        case 72:
                            gilVar.g0 = typedArrayObtainStyledAttributes.getInt(index, gilVar.g0);
                            break;
                        case 73:
                            gilVar.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.h0);
                            break;
                        case 74:
                            gilVar.k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            gilVar.o0 = typedArrayObtainStyledAttributes.getBoolean(index, gilVar.o0);
                            break;
                        case 76:
                            hilVar.e = typedArrayObtainStyledAttributes.getInt(index, hilVar.e);
                            break;
                        case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                            gilVar.l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            iilVar.c = typedArrayObtainStyledAttributes.getInt(index, iilVar.c);
                            break;
                        case 79:
                            hilVar.g = typedArrayObtainStyledAttributes.getFloat(index, hilVar.g);
                            break;
                        case 80:
                            gilVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index, gilVar.m0);
                            break;
                        case 81:
                            gilVar.n0 = typedArrayObtainStyledAttributes.getBoolean(index, gilVar.n0);
                            break;
                        case 82:
                            hilVar.c = typedArrayObtainStyledAttributes.getInteger(index, hilVar.c);
                            break;
                        case 83:
                            jilVar.i = p(typedArrayObtainStyledAttributes, index, jilVar.i);
                            break;
                        case 84:
                            hilVar.j = typedArrayObtainStyledAttributes.getInteger(index, hilVar.j);
                            break;
                        case 85:
                            hilVar.i = typedArrayObtainStyledAttributes.getFloat(index, hilVar.i);
                            break;
                        case 86:
                            int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i4 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                hilVar.m = resourceId;
                                if (resourceId != -1) {
                                    hilVar.l = -2;
                                }
                            } else if (i4 != 3) {
                                hilVar.l = typedArrayObtainStyledAttributes.getInteger(index, hilVar.m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                hilVar.k = string;
                                if (string.indexOf("/") <= 0) {
                                    hilVar.l = -1;
                                } else {
                                    hilVar.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    hilVar.l = -2;
                                }
                            }
                            break;
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            gilVar.r = p(typedArrayObtainStyledAttributes, index, gilVar.r);
                            break;
                        case 92:
                            gilVar.s = p(typedArrayObtainStyledAttributes, index, gilVar.s);
                            break;
                        case 93:
                            gilVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.M);
                            break;
                        case 94:
                            gilVar.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gilVar.T);
                            break;
                        case 95:
                            q(gilVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            q(gilVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            gilVar.p0 = typedArrayObtainStyledAttributes.getInt(index, gilVar.p0);
                            break;
                    }
                    i2++;
                } else if (gilVar.k0 != null) {
                    gilVar.j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return filVar;
    }

    public static int p(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    public static void q(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        eil eilVar;
        gil gilVar;
        qhl qhlVar;
        int i4 = typedArray.peekValue(i2).type;
        boolean z = true;
        int i5 = 0;
        if (i4 != 3) {
            if (i4 != 5) {
                dimensionPixelSize = typedArray.getInt(i2, 0);
                if (dimensionPixelSize == -4) {
                    i5 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof qhl) {
                    qhlVar = (qhl) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) qhlVar).width = i5;
                        qhlVar.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) qhlVar).height = i5;
                        qhlVar.X = z;
                        return;
                    }
                }
                if (obj instanceof gil) {
                    gilVar = (gil) obj;
                    if (i3 == 0) {
                        gilVar.c = i5;
                        gilVar.m0 = z;
                        return;
                    } else {
                        gilVar.d = i5;
                        gilVar.n0 = z;
                        return;
                    }
                }
                if (obj instanceof eil) {
                    eilVar = (eil) obj;
                    if (i3 == 0) {
                        eilVar.b(23, i5);
                        eilVar.d(80, z);
                        return;
                    } else {
                        eilVar.b(21, i5);
                        eilVar.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
            z = false;
            i5 = dimensionPixelSize;
            if (obj instanceof qhl) {
                qhlVar = (qhl) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) qhlVar).width = i5;
                    qhlVar.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) qhlVar).height = i5;
                    qhlVar.X = z;
                    return;
                }
            }
            if (obj instanceof gil) {
                gilVar = (gil) obj;
                if (i3 == 0) {
                    gilVar.c = i5;
                    gilVar.m0 = z;
                    return;
                } else {
                    gilVar.d = i5;
                    gilVar.n0 = z;
                    return;
                }
            }
            if (obj instanceof eil) {
                eilVar = (eil) obj;
                if (i3 == 0) {
                    eilVar.b(23, i5);
                    eilVar.d(80, z);
                    return;
                } else {
                    eilVar.b(21, i5);
                    eilVar.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i2);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof qhl) {
                    qhl qhlVar2 = (qhl) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) qhlVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) qhlVar2).height = 0;
                    }
                    r(qhlVar2, strTrim2);
                    return;
                }
                if (obj instanceof gil) {
                    ((gil) obj).z = strTrim2;
                    return;
                } else {
                    if (obj instanceof eil) {
                        ((eil) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof qhl) {
                        qhl qhlVar3 = (qhl) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) qhlVar3).width = 0;
                            qhlVar3.H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) qhlVar3).height = 0;
                            qhlVar3.I = f;
                            return;
                        }
                    }
                    if (obj instanceof gil) {
                        gil gilVar2 = (gil) obj;
                        if (i3 == 0) {
                            gilVar2.c = 0;
                            gilVar2.V = f;
                            return;
                        } else {
                            gilVar2.d = 0;
                            gilVar2.U = f;
                            return;
                        }
                    }
                    if (obj instanceof eil) {
                        eil eilVar2 = (eil) obj;
                        if (i3 == 0) {
                            eilVar2.b(23, 0);
                            eilVar2.a(f, 39);
                            return;
                        } else {
                            eilVar2.b(21, 0);
                            eilVar2.a(f, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof qhl) {
                        qhl qhlVar4 = (qhl) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) qhlVar4).width = 0;
                            qhlVar4.R = fMax;
                            qhlVar4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) qhlVar4).height = 0;
                            qhlVar4.S = fMax;
                            qhlVar4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof gil) {
                        gil gilVar3 = (gil) obj;
                        if (i3 == 0) {
                            gilVar3.c = 0;
                            gilVar3.e0 = fMax;
                            gilVar3.Y = 2;
                            return;
                        } else {
                            gilVar3.d = 0;
                            gilVar3.f0 = fMax;
                            gilVar3.Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof eil) {
                        eil eilVar3 = (eil) obj;
                        if (i3 == 0) {
                            eilVar3.b(23, 0);
                            eilVar3.b(54, 2);
                        } else {
                            eilVar3.b(21, 0);
                            eilVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void r(qhl qhlVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i3 = i2;
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i3 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        qhlVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void s(fil filVar, TypedArray typedArray) {
        int i2;
        int indexCount = typedArray.getIndexCount();
        eil eilVar = new eil();
        filVar.h = eilVar;
        hil hilVar = filVar.d;
        int i3 = 0;
        hilVar.a = false;
        gil gilVar = filVar.e;
        gilVar.b = false;
        iil iilVar = filVar.c;
        iilVar.a = false;
        jil jilVar = filVar.f;
        jilVar.a = false;
        int i4 = 0;
        while (i4 < indexCount) {
            int index = typedArray.getIndex(i4);
            int i5 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i5) {
                case 2:
                    i2 = i3;
                    eilVar.b(2, typedArray.getDimensionPixelSize(index, gilVar.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i2 = i3;
                    break;
                case 5:
                    i2 = i3;
                    eilVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    i2 = i3;
                    eilVar.b(6, typedArray.getDimensionPixelOffset(index, gilVar.D));
                    break;
                case 7:
                    i2 = i3;
                    eilVar.b(7, typedArray.getDimensionPixelOffset(index, gilVar.E));
                    break;
                case 8:
                    i2 = i3;
                    eilVar.b(8, typedArray.getDimensionPixelSize(index, gilVar.K));
                    break;
                case 11:
                    i2 = i3;
                    eilVar.b(11, typedArray.getDimensionPixelSize(index, gilVar.Q));
                    break;
                case 12:
                    i2 = i3;
                    eilVar.b(12, typedArray.getDimensionPixelSize(index, gilVar.R));
                    break;
                case 13:
                    i2 = i3;
                    eilVar.b(13, typedArray.getDimensionPixelSize(index, gilVar.N));
                    break;
                case 14:
                    i2 = i3;
                    eilVar.b(14, typedArray.getDimensionPixelSize(index, gilVar.P));
                    break;
                case 15:
                    i2 = i3;
                    eilVar.b(15, typedArray.getDimensionPixelSize(index, gilVar.S));
                    break;
                case 16:
                    i2 = i3;
                    eilVar.b(16, typedArray.getDimensionPixelSize(index, gilVar.O));
                    break;
                case 17:
                    i2 = i3;
                    eilVar.b(17, typedArray.getDimensionPixelOffset(index, gilVar.e));
                    break;
                case 18:
                    i2 = i3;
                    eilVar.b(18, typedArray.getDimensionPixelOffset(index, gilVar.f));
                    break;
                case 19:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, gilVar.g), 19);
                    break;
                case 20:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, gilVar.x), 20);
                    break;
                case 21:
                    i2 = i3;
                    eilVar.b(21, typedArray.getLayoutDimension(index, gilVar.d));
                    break;
                case 22:
                    i2 = i3;
                    eilVar.b(22, h[typedArray.getInt(index, iilVar.b)]);
                    break;
                case 23:
                    i2 = i3;
                    eilVar.b(23, typedArray.getLayoutDimension(index, gilVar.c));
                    break;
                case 24:
                    i2 = i3;
                    eilVar.b(24, typedArray.getDimensionPixelSize(index, gilVar.G));
                    break;
                case 27:
                    i2 = i3;
                    eilVar.b(27, typedArray.getInt(index, gilVar.F));
                    break;
                case 28:
                    i2 = i3;
                    eilVar.b(28, typedArray.getDimensionPixelSize(index, gilVar.H));
                    break;
                case 31:
                    i2 = i3;
                    eilVar.b(31, typedArray.getDimensionPixelSize(index, gilVar.L));
                    break;
                case 34:
                    i2 = i3;
                    eilVar.b(34, typedArray.getDimensionPixelSize(index, gilVar.I));
                    break;
                case 37:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, gilVar.y), 37);
                    break;
                case 38:
                    i2 = i3;
                    int resourceId = typedArray.getResourceId(index, filVar.a);
                    filVar.a = resourceId;
                    eilVar.b(38, resourceId);
                    break;
                case 39:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, gilVar.V), 39);
                    break;
                case 40:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, gilVar.U), 40);
                    break;
                case 41:
                    i2 = i3;
                    eilVar.b(41, typedArray.getInt(index, gilVar.W));
                    break;
                case 42:
                    i2 = i3;
                    eilVar.b(42, typedArray.getInt(index, gilVar.X));
                    break;
                case 43:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, iilVar.d), 43);
                    break;
                case 44:
                    i2 = i3;
                    eilVar.d(44, true);
                    eilVar.a(typedArray.getDimension(index, jilVar.n), 44);
                    break;
                case 45:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, jilVar.c), 45);
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, jilVar.d), 46);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, jilVar.e), 47);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, jilVar.f), 48);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    i2 = i3;
                    eilVar.a(typedArray.getDimension(index, jilVar.g), 49);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    i2 = i3;
                    eilVar.a(typedArray.getDimension(index, jilVar.h), 50);
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    i2 = i3;
                    eilVar.a(typedArray.getDimension(index, jilVar.j), 51);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    i2 = i3;
                    eilVar.a(typedArray.getDimension(index, jilVar.k), 52);
                    break;
                case 53:
                    i2 = i3;
                    eilVar.a(typedArray.getDimension(index, jilVar.l), 53);
                    break;
                case 54:
                    i2 = i3;
                    eilVar.b(54, typedArray.getInt(index, gilVar.Y));
                    break;
                case 55:
                    i2 = i3;
                    eilVar.b(55, typedArray.getInt(index, gilVar.Z));
                    break;
                case 56:
                    i2 = i3;
                    eilVar.b(56, typedArray.getDimensionPixelSize(index, gilVar.a0));
                    break;
                case 57:
                    i2 = i3;
                    eilVar.b(57, typedArray.getDimensionPixelSize(index, gilVar.b0));
                    break;
                case 58:
                    i2 = i3;
                    eilVar.b(58, typedArray.getDimensionPixelSize(index, gilVar.c0));
                    break;
                case 59:
                    i2 = i3;
                    eilVar.b(59, typedArray.getDimensionPixelSize(index, gilVar.d0));
                    break;
                case 60:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, jilVar.b), 60);
                    break;
                case 62:
                    i2 = i3;
                    eilVar.b(62, typedArray.getDimensionPixelSize(index, gilVar.B));
                    break;
                case 63:
                    i2 = i3;
                    eilVar.a(typedArray.getFloat(index, gilVar.C), 63);
                    break;
                case 64:
                    i2 = i3;
                    eilVar.b(64, p(typedArray, index, hilVar.b));
                    break;
                case 65:
                    i2 = i3;
                    if (typedArray.peekValue(index).type != 3) {
                        eilVar.c(65, clv.d[typedArray.getInteger(index, i2)]);
                    } else {
                        eilVar.c(65, typedArray.getString(index));
                    }
                    break;
                case 66:
                    i2 = 0;
                    eilVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    eilVar.a(typedArray.getFloat(index, hilVar.h), 67);
                    i2 = 0;
                    break;
                case 68:
                    eilVar.a(typedArray.getFloat(index, iilVar.e), 68);
                    i2 = 0;
                    break;
                case 69:
                    eilVar.a(typedArray.getFloat(index, 1.0f), 69);
                    i2 = 0;
                    break;
                case 70:
                    eilVar.a(typedArray.getFloat(index, 1.0f), 70);
                    i2 = 0;
                    break;
                case 71:
                    i2 = i3;
                    break;
                case 72:
                    eilVar.b(72, typedArray.getInt(index, gilVar.g0));
                    i2 = 0;
                    break;
                case 73:
                    eilVar.b(73, typedArray.getDimensionPixelSize(index, gilVar.h0));
                    i2 = 0;
                    break;
                case 74:
                    eilVar.c(74, typedArray.getString(index));
                    i2 = 0;
                    break;
                case 75:
                    eilVar.d(75, typedArray.getBoolean(index, gilVar.o0));
                    i2 = 0;
                    break;
                case 76:
                    eilVar.b(76, typedArray.getInt(index, hilVar.e));
                    i2 = 0;
                    break;
                case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                    eilVar.c(77, typedArray.getString(index));
                    i2 = 0;
                    break;
                case 78:
                    eilVar.b(78, typedArray.getInt(index, iilVar.c));
                    i2 = 0;
                    break;
                case 79:
                    eilVar.a(typedArray.getFloat(index, hilVar.g), 79);
                    i2 = 0;
                    break;
                case 80:
                    eilVar.d(80, typedArray.getBoolean(index, gilVar.m0));
                    i2 = 0;
                    break;
                case 81:
                    eilVar.d(81, typedArray.getBoolean(index, gilVar.n0));
                    i2 = 0;
                    break;
                case 82:
                    eilVar.b(82, typedArray.getInteger(index, hilVar.c));
                    i2 = 0;
                    break;
                case 83:
                    eilVar.b(83, p(typedArray, index, jilVar.i));
                    i2 = 0;
                    break;
                case 84:
                    eilVar.b(84, typedArray.getInteger(index, hilVar.j));
                    i2 = 0;
                    break;
                case 85:
                    eilVar.a(typedArray.getFloat(index, hilVar.i), 85);
                    i2 = 0;
                    break;
                case 86:
                    int i6 = typedArray.peekValue(index).type;
                    if (i6 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        hilVar.m = resourceId2;
                        eilVar.b(89, resourceId2);
                        if (hilVar.m != -1) {
                            hilVar.l = -2;
                            eilVar.b(88, -2);
                        }
                    } else if (i6 == 3) {
                        String string = typedArray.getString(index);
                        hilVar.k = string;
                        eilVar.c(90, string);
                        if (hilVar.k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            hilVar.m = resourceId3;
                            eilVar.b(89, resourceId3);
                            hilVar.l = -2;
                            eilVar.b(88, -2);
                        } else {
                            hilVar.l = -1;
                            eilVar.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, hilVar.m);
                        hilVar.l = integer;
                        eilVar.b(88, integer);
                    }
                    i2 = 0;
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i2 = i3;
                    break;
                case 93:
                    eilVar.b(93, typedArray.getDimensionPixelSize(index, gilVar.M));
                    i2 = i3;
                    break;
                case 94:
                    eilVar.b(94, typedArray.getDimensionPixelSize(index, gilVar.T));
                    i2 = i3;
                    break;
                case 95:
                    q(eilVar, typedArray, index, i3);
                    i2 = i3;
                    break;
                case 96:
                    q(eilVar, typedArray, index, 1);
                    i2 = i3;
                    break;
                case 97:
                    eilVar.b(97, typedArray.getInt(index, gilVar.p0));
                    i2 = i3;
                    break;
                case 98:
                    if (MotionLayout.X1) {
                        int resourceId4 = typedArray.getResourceId(index, filVar.a);
                        filVar.a = resourceId4;
                        if (resourceId4 == -1) {
                            filVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        filVar.b = typedArray.getString(index);
                    } else {
                        filVar.a = typedArray.getResourceId(index, filVar.a);
                    }
                    i2 = i3;
                    break;
                case 99:
                    eilVar.d(99, typedArray.getBoolean(index, gilVar.h));
                    i2 = i3;
                    break;
            }
            i4++;
            i3 = i2;
        }
    }

    public static String w(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(MotionLayout motionLayout) {
        fil filVar;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.g;
            if (!map.containsKey(numValueOf)) {
                bmq0.z(childAt);
            } else if (this.f && id == -1) {
                jah.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (map.containsKey(Integer.valueOf(id)) && (filVar = (fil) map.get(Integer.valueOf(id))) != null) {
                mhl.f(childAt, filVar.g);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                bmq0.z(childAt);
            } else {
                if (this.f && id == -1) {
                    jah.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    fil filVar = (fil) map.get(Integer.valueOf(id));
                    if (filVar != null) {
                        iil iilVar = filVar.c;
                        gil gilVar = filVar.e;
                        jil jilVar = filVar.f;
                        if (childAt instanceof Barrier) {
                            gilVar.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(gilVar.g0);
                            barrier.setMargin(gilVar.h0);
                            barrier.setAllowsGoneWidget(gilVar.o0);
                            int[] iArr = gilVar.j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = gilVar.k0;
                                if (str != null) {
                                    int[] iArrJ = j(barrier, str);
                                    gilVar.j0 = iArrJ;
                                    barrier.setReferencedIds(iArrJ);
                                }
                            }
                        }
                        qhl qhlVar = (qhl) childAt.getLayoutParams();
                        qhlVar.a();
                        filVar.b(qhlVar);
                        mhl.f(childAt, filVar.g);
                        childAt.setLayoutParams(qhlVar);
                        if (iilVar.c == 0) {
                            childAt.setVisibility(iilVar.b);
                        }
                        childAt.setAlpha(iilVar.d);
                        childAt.setRotation(jilVar.b);
                        childAt.setRotationX(jilVar.c);
                        childAt.setRotationY(jilVar.d);
                        childAt.setScaleX(jilVar.e);
                        childAt.setScaleY(jilVar.f);
                        if (jilVar.i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(jilVar.i);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(jilVar.g)) {
                                childAt.setPivotX(jilVar.g);
                            }
                            if (!Float.isNaN(jilVar.h)) {
                                childAt.setPivotY(jilVar.h);
                            }
                        }
                        childAt.setTranslationX(jilVar.j);
                        childAt.setTranslationY(jilVar.k);
                        childAt.setTranslationZ(jilVar.l);
                        if (jilVar.m) {
                            childAt.setElevation(jilVar.n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            fil filVar2 = (fil) map.get(num);
            if (filVar2 != null) {
                gil gilVar2 = filVar2.e;
                if (gilVar2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = gilVar2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = gilVar2.k0;
                        if (str2 != null) {
                            int[] iArrJ2 = j(barrier2, str2);
                            gilVar2.j0 = iArrJ2;
                            barrier2.setReferencedIds(iArrJ2);
                        }
                    }
                    barrier2.setType(gilVar2.g0);
                    barrier2.setMargin(gilVar2.h0);
                    qhl qhlVarB = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m();
                    filVar2.b(qhlVarB);
                    constraintLayout.addView(barrier2, qhlVarB);
                }
                if (gilVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    qhl qhlVarB2 = constraintLayout.generateDefaultLayoutParams();
                    filVar2.b(qhlVarB2);
                    constraintLayout.addView(guideline, qhlVarB2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ohl) {
                ((ohl) childAt2).f(constraintLayout);
            }
        }
    }

    public final void e(int i2, int i3) {
        fil filVar;
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf) || (filVar = (fil) map.get(Integer.valueOf(i2))) == null) {
            return;
        }
        gil gilVar = filVar.e;
        switch (i3) {
            case 1:
                gilVar.j = -1;
                gilVar.i = -1;
                gilVar.G = -1;
                gilVar.N = Integer.MIN_VALUE;
                break;
            case 2:
                gilVar.l = -1;
                gilVar.k = -1;
                gilVar.H = -1;
                gilVar.P = Integer.MIN_VALUE;
                break;
            case 3:
                gilVar.n = -1;
                gilVar.m = -1;
                gilVar.I = 0;
                gilVar.O = Integer.MIN_VALUE;
                break;
            case 4:
                gilVar.o = -1;
                gilVar.p = -1;
                gilVar.J = 0;
                gilVar.Q = Integer.MIN_VALUE;
                break;
            case 5:
                gilVar.q = -1;
                gilVar.r = -1;
                gilVar.s = -1;
                gilVar.M = 0;
                gilVar.T = Integer.MIN_VALUE;
                break;
            case 6:
                gilVar.t = -1;
                gilVar.u = -1;
                gilVar.L = 0;
                gilVar.S = Integer.MIN_VALUE;
                break;
            case 7:
                gilVar.v = -1;
                gilVar.w = -1;
                gilVar.K = 0;
                gilVar.R = Integer.MIN_VALUE;
                break;
            case 8:
                gilVar.C = -1.0f;
                gilVar.B = -1;
                gilVar.A = -1;
                break;
            default:
                hhg1.n("unknown constraint");
                break;
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.g;
        map.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            qhl qhlVar = (qhl) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                jah.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new fil());
            }
            fil filVar = (fil) map.get(Integer.valueOf(id));
            if (filVar != null) {
                iil iilVar = filVar.c;
                gil gilVar = filVar.e;
                jil jilVar = filVar.f;
                filVar.g = mhl.a(childAt, this.e);
                fil.a(filVar, id, qhlVar);
                iilVar.b = childAt.getVisibility();
                iilVar.d = childAt.getAlpha();
                jilVar.b = childAt.getRotation();
                jilVar.c = childAt.getRotationX();
                jilVar.d = childAt.getRotationY();
                jilVar.e = childAt.getScaleX();
                jilVar.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    jilVar.g = pivotX;
                    jilVar.h = pivotY;
                }
                jilVar.j = childAt.getTranslationX();
                jilVar.k = childAt.getTranslationY();
                jilVar.l = childAt.getTranslationZ();
                if (jilVar.m) {
                    jilVar.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    gilVar.o0 = barrier.getAllowsGoneWidget();
                    gilVar.j0 = barrier.getReferencedIds();
                    gilVar.g0 = barrier.getType();
                    gilVar.h0 = barrier.getMargin();
                }
            }
        }
    }

    public final void g(int i2, int i3, int i4, int i5) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new fil());
        }
        fil filVar = (fil) map.get(Integer.valueOf(i2));
        if (filVar == null) {
        }
        gil gilVar = filVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    gilVar.i = i4;
                    gilVar.j = -1;
                } else if (i5 != 2) {
                    mna0.e("left to ", w(i5), " undefined");
                } else {
                    gilVar.j = i4;
                    gilVar.i = -1;
                }
                break;
            case 2:
                if (i5 == 1) {
                    gilVar.k = i4;
                    gilVar.l = -1;
                } else if (i5 != 2) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.l = i4;
                    gilVar.k = -1;
                }
                break;
            case 3:
                if (i5 == 3) {
                    gilVar.m = i4;
                    gilVar.n = -1;
                    gilVar.q = -1;
                    gilVar.r = -1;
                    gilVar.s = -1;
                } else if (i5 != 4) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.n = i4;
                    gilVar.m = -1;
                    gilVar.q = -1;
                    gilVar.r = -1;
                    gilVar.s = -1;
                }
                break;
            case 4:
                if (i5 == 4) {
                    gilVar.p = i4;
                    gilVar.o = -1;
                    gilVar.q = -1;
                    gilVar.r = -1;
                    gilVar.s = -1;
                } else if (i5 != 3) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.o = i4;
                    gilVar.p = -1;
                    gilVar.q = -1;
                    gilVar.r = -1;
                    gilVar.s = -1;
                }
                break;
            case 5:
                if (i5 == 5) {
                    gilVar.q = i4;
                    gilVar.p = -1;
                    gilVar.o = -1;
                    gilVar.m = -1;
                    gilVar.n = -1;
                } else if (i5 == 3) {
                    gilVar.r = i4;
                    gilVar.p = -1;
                    gilVar.o = -1;
                    gilVar.m = -1;
                    gilVar.n = -1;
                } else if (i5 != 4) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.s = i4;
                    gilVar.p = -1;
                    gilVar.o = -1;
                    gilVar.m = -1;
                    gilVar.n = -1;
                }
                break;
            case 6:
                if (i5 == 6) {
                    gilVar.u = i4;
                    gilVar.t = -1;
                } else if (i5 != 7) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.t = i4;
                    gilVar.u = -1;
                }
                break;
            case 7:
                if (i5 == 7) {
                    gilVar.w = i4;
                    gilVar.v = -1;
                } else if (i5 != 6) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.v = i4;
                    gilVar.w = -1;
                }
                break;
            default:
                eg.i(w(i3), " to ", w(i5), " unknown");
                break;
        }
    }

    public final void h(int i2, int i3, int i4, int i5, int i6) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new fil());
        }
        fil filVar = (fil) map.get(Integer.valueOf(i2));
        if (filVar == null) {
        }
        gil gilVar = filVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    gilVar.i = i4;
                    gilVar.j = -1;
                } else if (i5 != 2) {
                    mna0.e("Left to ", w(i5), " undefined");
                } else {
                    gilVar.j = i4;
                    gilVar.i = -1;
                }
                gilVar.G = i6;
                break;
            case 2:
                if (i5 == 1) {
                    gilVar.k = i4;
                    gilVar.l = -1;
                } else if (i5 != 2) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.l = i4;
                    gilVar.k = -1;
                }
                gilVar.H = i6;
                break;
            case 3:
                if (i5 == 3) {
                    gilVar.m = i4;
                    gilVar.n = -1;
                    gilVar.q = -1;
                    gilVar.r = -1;
                    gilVar.s = -1;
                } else if (i5 != 4) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.n = i4;
                    gilVar.m = -1;
                    gilVar.q = -1;
                    gilVar.r = -1;
                    gilVar.s = -1;
                }
                gilVar.I = i6;
                break;
            case 4:
                if (i5 == 4) {
                    gilVar.p = i4;
                    gilVar.o = -1;
                    gilVar.q = -1;
                    gilVar.r = -1;
                    gilVar.s = -1;
                } else if (i5 != 3) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.o = i4;
                    gilVar.p = -1;
                    gilVar.q = -1;
                    gilVar.r = -1;
                    gilVar.s = -1;
                }
                gilVar.J = i6;
                break;
            case 5:
                if (i5 == 5) {
                    gilVar.q = i4;
                    gilVar.p = -1;
                    gilVar.o = -1;
                    gilVar.m = -1;
                    gilVar.n = -1;
                } else if (i5 == 3) {
                    gilVar.r = i4;
                    gilVar.p = -1;
                    gilVar.o = -1;
                    gilVar.m = -1;
                    gilVar.n = -1;
                } else if (i5 != 4) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.s = i4;
                    gilVar.p = -1;
                    gilVar.o = -1;
                    gilVar.m = -1;
                    gilVar.n = -1;
                }
                break;
            case 6:
                if (i5 == 6) {
                    gilVar.u = i4;
                    gilVar.t = -1;
                } else if (i5 != 7) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.t = i4;
                    gilVar.u = -1;
                }
                gilVar.L = i6;
                break;
            case 7:
                if (i5 == 7) {
                    gilVar.w = i4;
                    gilVar.v = -1;
                } else if (i5 != 6) {
                    mna0.e("right to ", w(i5), " undefined");
                } else {
                    gilVar.v = i4;
                    gilVar.w = -1;
                }
                gilVar.K = i6;
                break;
            default:
                eg.i(w(i3), " to ", w(i5), " unknown");
                break;
        }
    }

    public final void i(int i2, int i3) {
        l(i2).e.d = i3;
    }

    public final fil l(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new fil());
        }
        return (fil) map.get(Integer.valueOf(i2));
    }

    public final fil m(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (map.containsKey(numValueOf)) {
            return (fil) map.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void n(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    fil filVarK = k(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        filVarK.e.a = true;
                    }
                    this.g.put(Integer.valueOf(filVarK.a), filVarK);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void o(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            fil filVarK = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (filVarK == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                filVarK.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (filVarK == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                filVarK.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                filVarK = k(context, Xml.asAttributeSet(xmlResourceParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (filVarK == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                filVarK.c.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (filVarK == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                filVarK.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                filVarK = k(context, Xml.asAttributeSet(xmlResourceParser), false);
                                gil gilVar = filVarK.e;
                                gilVar.a = true;
                                gilVar.b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                filVarK = k(context, Xml.asAttributeSet(xmlResourceParser), false);
                                filVarK.e.i0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                filVarK = k(context, Xml.asAttributeSet(xmlResourceParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (filVarK == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    mhl.e(context, xmlResourceParser, filVarK.g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.g.put(Integer.valueOf(filVarK.a), filVarK);
                    filVarK = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void t(int i2, int i3) {
        l(i2).e.S = i3;
    }

    public final void u(int i2, int i3, int i4) {
        fil filVarL = l(i2);
        switch (i3) {
            case 1:
                filVarL.e.G = i4;
                break;
            case 2:
                filVarL.e.H = i4;
                break;
            case 3:
                filVarL.e.I = i4;
                break;
            case 4:
                filVarL.e.J = i4;
                break;
            case 5:
                filVarL.e.M = i4;
                break;
            case 6:
                filVarL.e.L = i4;
                break;
            case 7:
                filVarL.e.K = i4;
                break;
            default:
                hhg1.n("unknown constraint");
                break;
        }
    }

    public final void v(int i2, int i3) {
        l(i2).c.b = i3;
    }
}
