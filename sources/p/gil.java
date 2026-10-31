package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gil {
    public static final SparseIntArray q0;
    public int A;
    public int B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public boolean b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public float e0;
    public int f;
    public float f0;
    public float g;
    public int g0;
    public boolean h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int[] j0;
    public int k;
    public String k0;
    public int l;
    public String l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public boolean o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f53p;
    public int p0;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public String z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        q0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 41);
        sparseIntArray.append(16, 42);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
        sparseIntArray.append(58, 84);
        sparseIntArray.append(59, 86);
        sparseIntArray.append(58, 83);
        sparseIntArray.append(37, 85);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(34, 88);
        sparseIntArray.append(91, 89);
        sparseIntArray.append(15, 90);
    }

    public final void a(gil gilVar) {
        this.a = gilVar.a;
        this.c = gilVar.c;
        this.b = gilVar.b;
        this.d = gilVar.d;
        this.e = gilVar.e;
        this.f = gilVar.f;
        this.g = gilVar.g;
        this.h = gilVar.h;
        this.i = gilVar.i;
        this.j = gilVar.j;
        this.k = gilVar.k;
        this.l = gilVar.l;
        this.m = gilVar.m;
        this.n = gilVar.n;
        this.o = gilVar.o;
        this.f53p = gilVar.f53p;
        this.q = gilVar.q;
        this.r = gilVar.r;
        this.s = gilVar.s;
        this.t = gilVar.t;
        this.u = gilVar.u;
        this.v = gilVar.v;
        this.w = gilVar.w;
        this.x = gilVar.x;
        this.y = gilVar.y;
        this.z = gilVar.z;
        this.A = gilVar.A;
        this.B = gilVar.B;
        this.C = gilVar.C;
        this.D = gilVar.D;
        this.E = gilVar.E;
        this.F = gilVar.F;
        this.G = gilVar.G;
        this.H = gilVar.H;
        this.I = gilVar.I;
        this.J = gilVar.J;
        this.K = gilVar.K;
        this.L = gilVar.L;
        this.M = gilVar.M;
        this.N = gilVar.N;
        this.O = gilVar.O;
        this.P = gilVar.P;
        this.Q = gilVar.Q;
        this.R = gilVar.R;
        this.S = gilVar.S;
        this.T = gilVar.T;
        this.U = gilVar.U;
        this.V = gilVar.V;
        this.W = gilVar.W;
        this.X = gilVar.X;
        this.Y = gilVar.Y;
        this.Z = gilVar.Z;
        this.a0 = gilVar.a0;
        this.b0 = gilVar.b0;
        this.c0 = gilVar.c0;
        this.d0 = gilVar.d0;
        this.e0 = gilVar.e0;
        this.f0 = gilVar.f0;
        this.g0 = gilVar.g0;
        this.h0 = gilVar.h0;
        this.i0 = gilVar.i0;
        this.l0 = gilVar.l0;
        int[] iArr = gilVar.j0;
        if (iArr == null || gilVar.k0 != null) {
            this.j0 = null;
        } else {
            this.j0 = Arrays.copyOf(iArr, iArr.length);
        }
        this.k0 = gilVar.k0;
        this.m0 = gilVar.m0;
        this.n0 = gilVar.n0;
        this.o0 = gilVar.o0;
        this.p0 = gilVar.p0;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.j);
        this.b = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = q0;
            int i2 = sparseIntArray.get(index);
            switch (i2) {
                case 1:
                    this.q = kil.p(typedArrayObtainStyledAttributes, index, this.q);
                    break;
                case 2:
                    this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 3:
                    this.f53p = kil.p(typedArrayObtainStyledAttributes, index, this.f53p);
                    break;
                case 4:
                    this.o = kil.p(typedArrayObtainStyledAttributes, index, this.o);
                    break;
                case 5:
                    this.z = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 7:
                    this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                    break;
                case 8:
                    this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 9:
                    this.w = kil.p(typedArrayObtainStyledAttributes, index, this.w);
                    break;
                case 10:
                    this.v = kil.p(typedArrayObtainStyledAttributes, index, this.v);
                    break;
                case 11:
                    this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 12:
                    this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 13:
                    this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 14:
                    this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 15:
                    this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                    break;
                case 16:
                    this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 17:
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                    break;
                case 18:
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                    break;
                case 19:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 20:
                    this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                    break;
                case 21:
                    this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                    break;
                case 22:
                    this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                    break;
                case 23:
                    this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 24:
                    this.i = kil.p(typedArrayObtainStyledAttributes, index, this.i);
                    break;
                case 25:
                    this.j = kil.p(typedArrayObtainStyledAttributes, index, this.j);
                    break;
                case 26:
                    this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    this.k = kil.p(typedArrayObtainStyledAttributes, index, this.k);
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    this.l = kil.p(typedArrayObtainStyledAttributes, index, this.l);
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                    break;
                case 31:
                    this.t = kil.p(typedArrayObtainStyledAttributes, index, this.t);
                    break;
                case 32:
                    this.u = kil.p(typedArrayObtainStyledAttributes, index, this.u);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    this.n = kil.p(typedArrayObtainStyledAttributes, index, this.n);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    this.m = kil.p(typedArrayObtainStyledAttributes, index, this.m);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    kil.q(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    kil.q(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case 61:
                            this.A = kil.p(typedArrayObtainStyledAttributes, index, this.A);
                            break;
                        case 62:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                            break;
                        case 63:
                            this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    this.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    this.g0 = typedArrayObtainStyledAttributes.getInt(index, this.g0);
                                    break;
                                case 73:
                                    this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                    break;
                                case 74:
                                    this.k0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                    break;
                                case 76:
                                    this.p0 = typedArrayObtainStyledAttributes.getInt(index, this.p0);
                                    break;
                                case 77:
                                    this.r = kil.p(typedArrayObtainStyledAttributes, index, this.r);
                                    break;
                                case 78:
                                    this.s = kil.p(typedArrayObtainStyledAttributes, index, this.s);
                                    break;
                                case 79:
                                    this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                    break;
                                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                    this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                    break;
                                case 81:
                                    this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 82:
                                    this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 83:
                                    this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                case 84:
                                    this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    break;
                                case 85:
                                    this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                    break;
                                case 86:
                                    this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 87:
                                    this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                    break;
                                case 88:
                                    this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                    break;
                                case 89:
                                    this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.h = typedArrayObtainStyledAttributes.getBoolean(index, this.h);
                                    break;
                                case 91:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
