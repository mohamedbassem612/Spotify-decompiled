package p;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class omm0 implements Comparable {
    public int c;
    public float a = 0.0f;
    public int b = 0;
    public final LinkedHashMap d = new LinkedHashMap();
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 1.0f;
    public float t = 1.0f;
    public float X = Float.NaN;
    public float Y = Float.NaN;
    public float Z = 0.0f;
    public float N0 = 0.0f;
    public float O0 = 0.0f;
    public float P0 = Float.NaN;
    public float Q0 = Float.NaN;

    public static boolean b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap map, int i) {
        for (String str : map.keySet()) {
            cfk1 cfk1Var = (cfk1) map.get(str);
            if (cfk1Var != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        cfk1Var.b(Float.isNaN(this.h) ? 0.0f : this.h, i);
                        break;
                    case 1:
                        cfk1Var.b(Float.isNaN(this.a) ? 0.0f : this.a, i);
                        break;
                    case 2:
                        cfk1Var.b(Float.isNaN(this.Z) ? 0.0f : this.Z, i);
                        break;
                    case 3:
                        cfk1Var.b(Float.isNaN(this.N0) ? 0.0f : this.N0, i);
                        break;
                    case 4:
                        cfk1Var.b(Float.isNaN(this.O0) ? 0.0f : this.O0, i);
                        break;
                    case 5:
                        cfk1Var.b(Float.isNaN(this.Q0) ? 0.0f : this.Q0, i);
                        break;
                    case 6:
                        cfk1Var.b(Float.isNaN(this.i) ? 1.0f : this.i, i);
                        break;
                    case 7:
                        cfk1Var.b(Float.isNaN(this.t) ? 1.0f : this.t, i);
                        break;
                    case 8:
                        cfk1Var.b(Float.isNaN(this.X) ? 0.0f : this.X, i);
                        break;
                    case 9:
                        cfk1Var.b(Float.isNaN(this.Y) ? 0.0f : this.Y, i);
                        break;
                    case 10:
                        cfk1Var.b(Float.isNaN(this.g) ? 0.0f : this.g, i);
                        break;
                    case 11:
                        cfk1Var.b(Float.isNaN(this.f) ? 0.0f : this.f, i);
                        break;
                    case 12:
                        cfk1Var.b(Float.isNaN(this.P0) ? 0.0f : this.P0, i);
                        break;
                    case 13:
                        cfk1Var.b(Float.isNaN(this.e) ? 1.0f : this.e, i);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.d;
                            if (linkedHashMap.containsKey(str2)) {
                                mhl mhlVar = (mhl) linkedHashMap.get(str2);
                                if (cfk1Var instanceof zek1) {
                                    ((zek1) cfk1Var).f.append(i, mhlVar);
                                } else {
                                    mhlVar.b();
                                    cfk1Var.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public final void c(Rect rect, kil kilVar, int i, int i2) {
        rect.width();
        rect.height();
        fil filVarL = kilVar.l(i2);
        iil iilVar = filVarL.c;
        hil hilVar = filVarL.d;
        int i3 = iilVar.c;
        this.b = i3;
        int i4 = iilVar.b;
        this.c = i4;
        this.e = (i4 == 0 || i3 != 0) ? iilVar.d : 0.0f;
        jil jilVar = filVarL.f;
        this.f = jilVar.n;
        this.g = jilVar.b;
        this.h = jilVar.c;
        this.a = jilVar.d;
        this.i = jilVar.e;
        this.t = jilVar.f;
        this.X = jilVar.g;
        this.Y = jilVar.h;
        this.Z = jilVar.j;
        this.N0 = jilVar.k;
        this.O0 = jilVar.l;
        clv.d(hilVar.d);
        this.P0 = hilVar.h;
        this.Q0 = filVarL.c.e;
        for (String str : filVarL.g.keySet()) {
            mhl mhlVar = (mhl) filVarL.g.get(str);
            int iC = l1d.C(mhlVar.c);
            if (iC != 4 && iC != 5 && iC != 7) {
                this.d.put(str, mhlVar);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.g + 90.0f;
            this.g = f;
            if (f > 180.0f) {
                this.g = f - 360.0f;
                return;
            }
            return;
        }
        this.g -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((omm0) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
