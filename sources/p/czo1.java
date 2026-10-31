package p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class czo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(b0k b0kVar, int i) {
        Activity activity;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2120169727);
        if (x340Var.Y(i & 1, i != 0)) {
            Context baseContext = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            do {
                activity = null;
                Activity activity2 = baseContext instanceof Activity ? (Activity) baseContext : null;
                if (activity2 != null) {
                    activity = activity2;
                    break;
                }
                ContextWrapper contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
                if (contextWrapper == null) {
                    break;
                } else {
                    baseContext = contextWrapper.getBaseContext();
                }
            } while (baseContext != null);
            if (activity == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new c1j1(i, (byte) 0);
                    return;
                }
                return;
            }
            boolean zI = x340Var.i(activity);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new nt9(activity, (byte) 3);
                x340Var.s0(objT);
            }
            qxd0.i(activity, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new rvd1(i, (byte) 29);
        }
    }

    public static final void b(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-993719678);
        byte b2 = 4;
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            long jK = f5p1.k(x340Var, 2131101127);
            long jK2 = f5p1.k(x340Var, R.color.transparent);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setColor(z4p1.G(jK));
                float f = i;
                canvas.drawRect(0.0f, 0.0f, f, f, paint);
                paint.setColor(z4p1.G(jK2));
                paint.setAntiAlias(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                float f2 = f / 2.0f;
                canvas.drawCircle(f2, f2, f2, paint);
                x340Var.s0(bitmapCreateBitmap);
                obj = bitmapCreateBitmap;
            }
            obj = objT;
            Bitmap bitmap = (Bitmap) obj;
            qim0Var2 = nim0.a;
            qim0 qim0VarR = i1p1.r(u291.d(anm1.N("circular_overlay", qim0Var2), 1.0f));
            boolean zI = x340Var.i(bitmap);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new syf(bitmap, (byte) 2);
                x340Var.s0(objT2);
            }
            j0o1.b(0, x340Var, (iu30) objT2, qim0VarR);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2(b2, i, i2, qim0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x017e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0180  */
    /* JADX WARN: Code duplicated, block: B:122:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    public static final void c(int i, long j, String str, q10 q10Var, gt40 gt40Var, long j2, boolean z, float f, float f2, int i2, b0k b0kVar, int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        int iC;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        b0k b0kVar2;
        long j3;
        int i9;
        boolean z5;
        h311 h311VarV;
        long j4;
        int i10;
        long j5;
        hn20 hn20Var;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int iC2;
        int i11;
        int i12;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(194182225);
        if ((i3 & 6) == 0) {
            i5 = (b0kVar3.e(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= b0kVar3.g(str) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= b0kVar3.i(q10Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= b0kVar3.i(gt40Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= 65536;
        }
        int i13 = i4 & 64;
        if (i13 == 0) {
            if ((1572864 & i3) == 0) {
                z2 = z;
                i5 |= b0kVar3.h(z2) ? 1048576 : 524288;
            }
            if ((i3 & 12582912) == 0) {
                if (b0kVar3.d(f)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i5 |= i12;
            }
            if ((i3 & 100663296) == 0) {
                if (b0kVar3.d(f2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i5 |= i11;
            }
            i6 = i4 & 512;
            if (i6 != 0) {
                i5 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                if (i2 == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i2);
                }
                if (b0kVar3.e(iC)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i5 |= i7;
            }
            z3 = false;
            i8 = i5;
            if ((306783379 & i5) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i8 & 1, z4)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0 || b0kVar3.E()) {
                    j4 = abh.f;
                    if (i13 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j5 = j4;
                        i10 = 2;
                    } else {
                        i10 = i2;
                        j5 = j4;
                    }
                } else {
                    b0kVar3.b0();
                    j5 = j2;
                    i10 = i2;
                }
                b0kVar3.s();
                if (z2) {
                    hn20Var = new hn20(j5);
                } else {
                    hn20Var = new hn20(z4p1.h((u7h.g(j) * 0.6f) + (u7h.g(j5) * 0.4f), (u7h.f(j) * 0.6f) + (u7h.f(j5) * 0.4f), (u7h.d(j) * 0.6f) + (u7h.d(j5) * 0.4f), 1.0f, 16));
                }
                if (((Context) b0kVar3.k(p4k.b)).getResources().getConfiguration().getLayoutDirection() == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i10 != 2 || i10 == 7 || i10 == 6 || i10 == 3 || ((z6 && i10 == 5) || (!z6 && i10 == 4))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i10 != 2 || i10 == 7) {
                    z8 = true;
                } else {
                    z8 = true;
                    if (i10 != 1 && ((!z6 || i10 != 4) && (z6 || i10 != 5))) {
                        z9 = false;
                    }
                    hn20 hn20Var2 = hn20Var;
                    oma1 oma1Var = new oma1(z7, z9);
                    gt40 gt40VarE0 = dm5.e0(d9y0.l(gt40Var, q10Var), f);
                    iC2 = l1d.C(i10);
                    if (iC2 != 5 && iC2 != 6) {
                        z3 = z8;
                    }
                    b0kVar2 = b0kVar3;
                    jch0.f(gt40VarE0, z3 ? 1 : 0, apo.r(1045110893, new vk70(oma1Var, f, f2, i, hn20Var2, str), b0kVar3), b0kVar2, 3072, 2);
                    i9 = i10;
                    j3 = j5;
                }
                z9 = z8;
                hn20 hn20Var3 = hn20Var;
                oma1 oma1Var2 = new oma1(z7, z9);
                gt40 gt40VarE1 = dm5.e0(d9y0.l(gt40Var, q10Var), f);
                iC2 = l1d.C(i10);
                if (iC2 != 5) {
                    z3 = z8;
                }
                b0kVar2 = b0kVar3;
                jch0.f(gt40VarE1, z3 ? 1 : 0, apo.r(1045110893, new vk70(oma1Var2, f, f2, i, hn20Var3, str), b0kVar3), b0kVar2, 3072, 2);
                i9 = i10;
                j3 = j5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                j3 = j2;
                i9 = i2;
            }
            z5 = z2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wk70(i, j, str, q10Var, gt40Var, j3, z5, f, f2, i9, i3, i4);
            }
        }
        i5 |= 1572864;
        z2 = z;
        if ((i3 & 12582912) == 0) {
            if (b0kVar3.d(f)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        if ((i3 & 100663296) == 0) {
            if (b0kVar3.d(f2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        i6 = i4 & 512;
        if (i6 != 0) {
            i5 |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            if (i2 == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i2);
            }
            if (b0kVar3.e(iC)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i5 |= i7;
        }
        z3 = false;
        i8 = i5;
        if ((306783379 & i5) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i8 & 1, z4)) {
            b0kVar3.d0();
            if ((i3 & 1) != 0) {
                j4 = abh.f;
                if (i13 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j5 = j4;
                    i10 = 2;
                } else {
                    i10 = i2;
                    j5 = j4;
                }
            } else {
                j4 = abh.f;
                if (i13 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j5 = j4;
                    i10 = 2;
                } else {
                    i10 = i2;
                    j5 = j4;
                }
            }
            b0kVar3.s();
            if (z2) {
                hn20Var = new hn20(j5);
            } else {
                hn20Var = new hn20(z4p1.h((u7h.g(j) * 0.6f) + (u7h.g(j5) * 0.4f), (u7h.f(j) * 0.6f) + (u7h.f(j5) * 0.4f), (u7h.d(j) * 0.6f) + (u7h.d(j5) * 0.4f), 1.0f, 16));
            }
            if (((Context) b0kVar3.k(p4k.b)).getResources().getConfiguration().getLayoutDirection() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i10 != 2) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (i10 != 2) {
                z8 = true;
                z9 = z8;
            } else {
                z8 = true;
                z9 = z8;
            }
            hn20 hn20Var4 = hn20Var;
            oma1 oma1Var3 = new oma1(z7, z9);
            gt40 gt40VarE2 = dm5.e0(d9y0.l(gt40Var, q10Var), f);
            iC2 = l1d.C(i10);
            if (iC2 != 5) {
                z3 = z8;
            }
            b0kVar2 = b0kVar3;
            jch0.f(gt40VarE2, z3 ? 1 : 0, apo.r(1045110893, new vk70(oma1Var3, f, f2, i, hn20Var4, str), b0kVar3), b0kVar2, 3072, 2);
            i9 = i10;
            j3 = j5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            j3 = j2;
            i9 = i2;
        }
        z5 = z2;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wk70(i, j, str, q10Var, gt40Var, j3, z5, f, f2, i9, i3, i4);
        }
    }

    public static final void d(boolean z, boolean z2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-253691533);
        int i4 = (x340Var.h(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= x340Var.h(z2) ? 32 : 16;
        }
        int i5 = i4 | (x340Var.i(function0) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
        } else {
            i3 = i5 | (x340Var.i(qim0Var) ? 2048 : 1024);
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (i6 != 0) {
                qim0Var = nim0.a;
            }
            gfx.f(6, apo.r(-1584701859, new g9p0(function0, qim0Var, z2, z), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lft0(z, z2, function0, qim0Var2, i, i2);
        }
    }

    public static final void e(boolean z, x0j1 x0j1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(931113928);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(x0j1Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z && (x0j1Var instanceof v0j1)) {
            x340Var.i0(1916378360);
            a(x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(1916411034);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(z, x0j1Var, i, (byte) 27);
        }
    }

    public static final pux f(b0k b0kVar) {
        return new pux((jmr0) null, hso1.G(box.c, 0L, u7h.j, b0kVar, box.d, 18));
    }

    public static void g(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("k");
                String strOptString2 = jSONObjectOptJSONObject.optString("v");
                if (strOptString.length() != 0) {
                    tmj0.a().add(new tmj0(next, ihc1.Q0(strOptString, new String[]{","}, 0, 6), strOptString2));
                }
            }
        }
    }

    public static HashSet h() {
        return new HashSet(tmj0.a());
    }

    public static final go80 i(klm klmVar, obp0 obp0Var, obp0 obp0Var2, ubp0 ubp0Var, vbp0 vbp0Var, rbp0 rbp0Var, ubp0 ubp0Var2, ubp0 ubp0Var3, ubp0 ubp0Var4, ubp0 ubp0Var5, rbp0 rbp0Var2, ubp0 ubp0Var6) {
        return klmVar.a("ListeningPartyEventCoordinationDaemon", new jcp0(obp0Var, obp0Var2, ubp0Var, vbp0Var, rbp0Var, ubp0Var2, ubp0Var3, ubp0Var4, ubp0Var5, rbp0Var2, ubp0Var6));
    }

    public static boolean j(ag4 ag4Var) {
        return ag4Var.c();
    }

    public static boolean k(ag4 ag4Var) {
        return ag4Var.d();
    }

    public static final smc0 l(Set set) {
        smc0 smc0VarN = k4p1.n();
        if (set.contains(drc0.a)) {
            smc0VarN.add(new ma20());
            smc0VarN.add(new na20());
        } else if (set.contains(crc0.a)) {
            smc0VarN.add(new ma20());
        } else if (set.contains(krc0.a)) {
            smc0VarN.add(new na20());
        }
        if (set.contains(pqc0.a)) {
            smc0VarN.add(new ka20());
        }
        if (set.contains(nrc0.a)) {
            smc0VarN.add(new oa20());
        }
        return k4p1.k(smc0VarN);
    }

    public static final smc0 m(ArrayList arrayList) {
        smc0 smc0VarN = k4p1.n();
        if (arrayList.contains(new ma20())) {
            if (arrayList.contains(new na20())) {
                smc0VarN.add(drc0.a);
            } else {
                smc0VarN.add(crc0.a);
            }
        } else if (arrayList.contains(new na20())) {
            smc0VarN.add(krc0.a);
        }
        if (arrayList.contains(new ka20())) {
            smc0VarN.add(pqc0.a);
        }
        if (arrayList.contains(new oa20())) {
            smc0VarN.add(nrc0.a);
        }
        return k4p1.k(smc0VarN);
    }

    public static final s8d0 n(Single single) {
        s8d0 s8d0Var = new s8d0();
        single.subscribe(s8d0Var.e);
        return s8d0Var;
    }

    public static final sha1 o(g3d0 g3d0Var) {
        if (g3d0Var instanceof m2d0) {
            return sha1.b;
        }
        if (u890.j(g3d0Var, u2d0.a)) {
            return sha1.d;
        }
        if (g3d0Var instanceof c3d0) {
            return sha1.c;
        }
        if (g3d0Var instanceof e3d0) {
            return sha1.a;
        }
        return null;
    }

    public static final int p(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
