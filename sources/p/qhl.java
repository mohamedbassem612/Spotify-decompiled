package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class qhl extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public final int C;
    public final int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public final boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public float l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public float o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f100p;
    public cjl p0;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final int w;
    public int x;
    public final int y;
    public int z;

    public qhl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.f100p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.a0 = true;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = Integer.MIN_VALUE;
        this.k0 = Integer.MIN_VALUE;
        this.l0 = 0.5f;
        this.p0 = new cjl();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = phl.a.get(index);
            switch (i2) {
                case 1:
                    this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f100p);
                    this.f100p = resourceId;
                    if (resourceId == -1) {
                        this.f100p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                    this.r = f;
                    if (f < 0.0f) {
                        this.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                    break;
                case 6:
                    this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                    break;
                case 7:
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId2;
                    if (resourceId2 == -1) {
                        this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                    this.f = resourceId3;
                    if (resourceId3 == -1) {
                        this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                    this.g = resourceId4;
                    if (resourceId4 == -1) {
                        this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                    this.h = resourceId5;
                    if (resourceId5 == -1) {
                        this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                    this.i = resourceId6;
                    if (resourceId6 == -1) {
                        this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId7;
                    if (resourceId7 == -1) {
                        this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                    this.k = resourceId8;
                    if (resourceId8 == -1) {
                        this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                    this.l = resourceId9;
                    if (resourceId9 == -1) {
                        this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                    this.m = resourceId10;
                    if (resourceId10 == -1) {
                        this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                    this.s = resourceId11;
                    if (resourceId11 == -1) {
                        this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                    this.t = resourceId12;
                    if (resourceId12 == -1) {
                        this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                    this.u = resourceId13;
                    if (resourceId13 == -1) {
                        this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                    this.v = resourceId14;
                    if (resourceId14 == -1) {
                        this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                    break;
                case 22:
                    this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                    break;
                case 23:
                    this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                    break;
                case 24:
                    this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                    break;
                case 25:
                    this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                    break;
                case 26:
                    this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                    break;
                case 27:
                    this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                    break;
                case 28:
                    this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                    break;
                case 29:
                    this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                    break;
                case 30:
                    this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                    break;
                case 31:
                    this.L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    this.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                            this.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                            this.P = -2;
                        }
                    }
                    break;
                case 35:
                    this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                    this.L = 2;
                    break;
                case 36:
                    try {
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                            this.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                            this.Q = -2;
                        }
                    }
                    break;
                case 38:
                    this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                    this.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            kil.r(this, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                            break;
                        case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                            this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                            this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                            this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                            break;
                        case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                            this.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                            this.n = resourceId15;
                            if (resourceId15 == -1) {
                                this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                            this.o = resourceId16;
                            if (resourceId16 == -1) {
                                this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 55:
                            this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    kil.q(this, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    kil.q(this, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 67:
                                    this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.d0 = false;
        this.a0 = true;
        this.b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.X) {
            this.b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.a0 = false;
            if (i == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.b0 = false;
            if (i2 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.d0 = true;
        this.a0 = true;
        this.b0 = true;
        cjl tq50Var = this.p0;
        if (!(tq50Var instanceof tq50)) {
            tq50Var = new tq50();
            this.p0 = tq50Var;
        }
        ((tq50) tq50Var).X(this.V);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.h0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = this.w;
        this.k0 = this.y;
        float f = this.E;
        this.l0 = f;
        int i8 = this.a;
        this.m0 = i8;
        int i9 = this.b;
        this.n0 = i9;
        float f2 = this.c;
        this.o0 = f2;
        int i10 = this.s;
        if (z2) {
            if (i10 != -1) {
                this.h0 = i10;
            } else {
                int i11 = this.t;
                if (i11 != -1) {
                    this.i0 = i11;
                } else {
                    i2 = this.u;
                    if (i2 != -1) {
                        this.g0 = i2;
                        z = true;
                    }
                    i3 = this.v;
                    if (i3 != -1) {
                        this.f0 = i3;
                        z = true;
                    }
                    i4 = this.A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.k0 = i4;
                    }
                    i5 = this.B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.j0 = i5;
                    }
                    if (z) {
                        this.l0 = 1.0f - f;
                    }
                    if (this.d0 && this.V == 1 && this.d) {
                        if (f2 != -1.0f) {
                            this.o0 = 1.0f - f2;
                            this.m0 = -1;
                            this.n0 = -1;
                        } else if (i8 != -1) {
                            this.n0 = i8;
                            this.m0 = -1;
                            this.o0 = -1.0f;
                        } else if (i9 != -1) {
                            this.m0 = i9;
                            this.n0 = -1;
                            this.o0 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.u;
            if (i2 != -1) {
                this.g0 = i2;
                z = true;
            }
            i3 = this.v;
            if (i3 != -1) {
                this.f0 = i3;
                z = true;
            }
            i4 = this.A;
            if (i4 != Integer.MIN_VALUE) {
                this.k0 = i4;
            }
            i5 = this.B;
            if (i5 != Integer.MIN_VALUE) {
                this.j0 = i5;
            }
            if (z) {
                this.l0 = 1.0f - f;
            }
            if (this.d0) {
                if (f2 != -1.0f) {
                    this.o0 = 1.0f - f2;
                    this.m0 = -1;
                    this.n0 = -1;
                } else if (i8 != -1) {
                    this.n0 = i8;
                    this.m0 = -1;
                    this.o0 = -1.0f;
                } else if (i9 != -1) {
                    this.m0 = i9;
                    this.n0 = -1;
                    this.o0 = -1.0f;
                }
            }
        } else {
            if (i10 != -1) {
                this.g0 = i10;
            }
            int i12 = this.t;
            if (i12 != -1) {
                this.f0 = i12;
            }
            i2 = this.u;
            if (i2 != -1) {
                this.h0 = i2;
            }
            i3 = this.v;
            if (i3 != -1) {
                this.i0 = i3;
            }
            int i13 = this.A;
            if (i13 != Integer.MIN_VALUE) {
                this.j0 = i13;
            }
            int i14 = this.B;
            if (i14 != Integer.MIN_VALUE) {
                this.k0 = i14;
            }
        }
        if (i2 == -1 && i3 == -1 && this.t == -1 && i10 == -1) {
            int i15 = this.g;
            if (i15 != -1) {
                this.h0 = i15;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i16 = this.h;
                if (i16 != -1) {
                    this.i0 = i16;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i17 = this.e;
            if (i17 != -1) {
                this.f0 = i17;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i18 = this.f;
            if (i18 != -1) {
                this.g0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }

    public qhl(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.f100p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.a0 = true;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = Integer.MIN_VALUE;
        this.k0 = Integer.MIN_VALUE;
        this.l0 = 0.5f;
        this.p0 = new cjl();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
            setMarginStart(marginLayoutParams.getMarginStart());
            setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (layoutParams instanceof qhl) {
            qhl qhlVar = (qhl) layoutParams;
            this.a = qhlVar.a;
            this.b = qhlVar.b;
            this.c = qhlVar.c;
            this.d = qhlVar.d;
            this.e = qhlVar.e;
            this.f = qhlVar.f;
            this.g = qhlVar.g;
            this.h = qhlVar.h;
            this.i = qhlVar.i;
            this.j = qhlVar.j;
            this.k = qhlVar.k;
            this.l = qhlVar.l;
            this.m = qhlVar.m;
            this.n = qhlVar.n;
            this.o = qhlVar.o;
            this.f100p = qhlVar.f100p;
            this.q = qhlVar.q;
            this.r = qhlVar.r;
            this.s = qhlVar.s;
            this.t = qhlVar.t;
            this.u = qhlVar.u;
            this.v = qhlVar.v;
            this.w = qhlVar.w;
            this.x = qhlVar.x;
            this.y = qhlVar.y;
            this.z = qhlVar.z;
            this.A = qhlVar.A;
            this.B = qhlVar.B;
            this.C = qhlVar.C;
            this.D = qhlVar.D;
            this.E = qhlVar.E;
            this.F = qhlVar.F;
            this.G = qhlVar.G;
            this.H = qhlVar.H;
            this.I = qhlVar.I;
            this.J = qhlVar.J;
            this.K = qhlVar.K;
            this.W = qhlVar.W;
            this.X = qhlVar.X;
            this.L = qhlVar.L;
            this.M = qhlVar.M;
            this.N = qhlVar.N;
            this.P = qhlVar.P;
            this.O = qhlVar.O;
            this.Q = qhlVar.Q;
            this.R = qhlVar.R;
            this.S = qhlVar.S;
            this.T = qhlVar.T;
            this.U = qhlVar.U;
            this.V = qhlVar.V;
            this.a0 = qhlVar.a0;
            this.b0 = qhlVar.b0;
            this.c0 = qhlVar.c0;
            this.d0 = qhlVar.d0;
            this.f0 = qhlVar.f0;
            this.g0 = qhlVar.g0;
            this.h0 = qhlVar.h0;
            this.i0 = qhlVar.i0;
            this.j0 = qhlVar.j0;
            this.k0 = qhlVar.k0;
            this.l0 = qhlVar.l0;
            this.Y = qhlVar.Y;
            this.Z = qhlVar.Z;
            this.p0 = qhlVar.p0;
        }
    }

    public qhl(int i, int i2) {
        super(i, i2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.f100p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.a0 = true;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = Integer.MIN_VALUE;
        this.k0 = Integer.MIN_VALUE;
        this.l0 = 0.5f;
        this.p0 = new cjl();
    }
}
