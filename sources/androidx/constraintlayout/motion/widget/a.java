package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p.afk1;
import p.bfk1;
import p.cfk1;
import p.clv;
import p.cnm0;
import p.dxo1;
import p.fdk1;
import p.gyo1;
import p.hdk1;
import p.l1d;
import p.lhk1;
import p.mhk1;
import p.mhl;
import p.nhk1;
import p.o26;
import p.ohk1;
import p.omm0;
import p.ooa0;
import p.p321;
import p.phk1;
import p.yek1;
import p.zek1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a {
    public KeyTrigger[] A;
    public final View b;
    public final int c;
    public dxo1[] j;
    public o26 k;
    public int[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f5p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap x;
    public HashMap y;
    public HashMap z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final cnm0 f = new cnm0();
    public final cnm0 g = new cnm0();
    public final omm0 h = new omm0();
    public final omm0 i = new omm0();
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList u = new ArrayList();
    public final float[] v = new float[1];
    public final ArrayList w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public a(View view) {
        this.b = view;
        this.c = view.getId();
        view.getLayoutParams();
    }

    public static void f(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        clv clvVar = this.f.a;
        float f5 = Float.NaN;
        for (cnm0 cnm0Var : this.u) {
            clv clvVar2 = cnm0Var.a;
            if (clvVar2 != null) {
                float f6 = cnm0Var.c;
                if (f6 < f) {
                    clvVar = clvVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = cnm0Var.c;
                }
            }
        }
        if (clvVar == null) {
            return f;
        }
        float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
        double d = (f - f2) / f7;
        float fB = (((float) clvVar.b(d)) * f7) + f2;
        if (fArr != null) {
            fArr[0] = (float) clvVar.c(d);
        }
        return fB;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final void b(double r24, float[] r26, float[] r27) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.b(double, float[], float[]):void");
    }

    public final float c() {
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float fHypot = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f = i * 0.01010101f;
            double dB = f;
            cnm0 cnm0Var = this.f;
            clv clvVar = cnm0Var.a;
            float f2 = Float.NaN;
            float f3 = 0.0f;
            for (cnm0 cnm0Var2 : this.u) {
                clv clvVar2 = cnm0Var2.a;
                cnm0 cnm0Var3 = cnm0Var;
                if (clvVar2 != null) {
                    float f4 = cnm0Var2.c;
                    if (f4 < f) {
                        f3 = f4;
                        clvVar = clvVar2;
                    } else if (Float.isNaN(f2)) {
                        f2 = cnm0Var2.c;
                    }
                }
                cnm0Var = cnm0Var3;
            }
            cnm0 cnm0Var4 = cnm0Var;
            if (clvVar != null) {
                if (Float.isNaN(f2)) {
                    f2 = 1.0f;
                }
                float f5 = f2 - f3;
                dB = (((float) clvVar.b((f - f3) / f5)) * f5) + f3;
            }
            this.j[0].n(dB, this.f5p);
            cnm0Var4.c(dB, this.o, this.f5p, fArr, 0);
            if (i > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return fHypot;
    }

    public final boolean d(float f, long j, View view, p321 p321Var) {
        boolean zD;
        boolean z;
        float f2;
        boolean z2;
        double d;
        float f3;
        float f4;
        float f5;
        float fSin;
        float f6;
        nhk1 nhk1Var = null;
        float fA = a(f, null);
        int i = this.E;
        if (i != -1) {
            float f7 = 1.0f / i;
            float fFloor = ((float) Math.floor(fA / f7)) * f7;
            float f8 = (fA % f7) / f7;
            if (!Float.isNaN(this.F)) {
                f8 = (f8 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fA = ((interpolator != null ? interpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + fFloor;
        }
        HashMap map = this.y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((cfk1) it.next()).c(view, fA);
            }
        }
        HashMap map2 = this.x;
        if (map2 != null) {
            nhk1 nhk1Var2 = null;
            zD = false;
            for (phk1 phk1Var : map2.values()) {
                if (phk1Var instanceof nhk1) {
                    nhk1Var2 = (nhk1) phk1Var;
                } else {
                    zD |= phk1Var.d(fA, j, view, p321Var);
                }
            }
            nhk1Var = nhk1Var2;
        } else {
            zD = false;
        }
        dxo1[] dxo1VarArr = this.j;
        cnm0 cnm0Var = this.f;
        if (dxo1VarArr != null) {
            double d2 = fA;
            dxo1VarArr[0].n(d2, this.f5p);
            this.j[0].p(d2, this.q);
            o26 o26Var = this.k;
            if (o26Var != null) {
                double[] dArr = this.f5p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    o26Var.n(d2, dArr);
                    this.k.p(d2, this.q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.H) {
                z2 = zD;
                d = d2;
                f3 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.f5p;
                f3 = 2.0f;
                double[] dArr3 = this.q;
                boolean z3 = this.d;
                float f9 = cnm0Var.e;
                float fCos = cnm0Var.f;
                float f10 = cnm0Var.g;
                int i2 = 1;
                float f11 = cnm0Var.h;
                if (iArr.length != 0) {
                    f4 = f10;
                    if (cnm0Var.P0.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        cnm0Var.P0 = new double[i3];
                        cnm0Var.Q0 = new double[i3];
                    }
                } else {
                    f4 = f10;
                }
                Arrays.fill(cnm0Var.P0, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = cnm0Var.P0;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    cnm0Var.Q0[i5] = dArr3[i4];
                }
                float f12 = Float.NaN;
                float f13 = f2;
                float f14 = f13;
                float f15 = f14;
                float f16 = f15;
                int i6 = 0;
                while (true) {
                    double[] dArr5 = cnm0Var.P0;
                    f5 = f11;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f6 = f9;
                    } else {
                        f6 = f9;
                        float f17 = (float) (Double.isNaN(cnm0Var.P0[i6]) ? 0.0d : cnm0Var.P0[i6] + 0.0d);
                        float f18 = (float) cnm0Var.Q0[i6];
                        if (i6 == i2) {
                            f14 = f18;
                            f11 = f5;
                            f9 = f17;
                        } else if (i6 == 2) {
                            f13 = f18;
                            f9 = f6;
                            f11 = f5;
                            fCos = f17;
                        } else if (i6 == 3) {
                            f15 = f18;
                            f9 = f6;
                            f11 = f5;
                            f4 = f17;
                        } else if (i6 == 4) {
                            f16 = f18;
                            f9 = f6;
                            f11 = f17;
                        } else if (i6 == 5) {
                            f9 = f6;
                            f11 = f5;
                            f12 = f17;
                        }
                        i6++;
                        i2 = 1;
                    }
                    f9 = f6;
                    f11 = f5;
                    i6++;
                    i2 = 1;
                }
                float f19 = f9;
                a aVar = cnm0Var.Z;
                if (aVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    aVar.b(d2, fArr, fArr2);
                    float f20 = fArr[0];
                    float f21 = fArr[1];
                    float f22 = fArr2[0];
                    float f23 = fArr2[1];
                    z2 = zD;
                    d = d2;
                    double d3 = f19;
                    double d4 = fCos;
                    fSin = (float) (((Math.sin(d4) * d3) + ((double) f20)) - ((double) (f4 / 2.0f)));
                    fCos = (float) ((((double) f21) - (Math.cos(d4) * d3)) - ((double) (f5 / 2.0f)));
                    double d5 = f14;
                    double d6 = f13;
                    float fCos2 = (float) ((Math.cos(d4) * d3 * d6) + (Math.sin(d4) * d5) + ((double) f22));
                    float fSin2 = (float) ((Math.sin(d4) * d3 * d6) + (((double) f23) - (Math.cos(d4) * d5)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f12)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f12)));
                    }
                } else {
                    fSin = f19;
                    z2 = zD;
                    d = d2;
                    if (!Float.isNaN(f12)) {
                        view.setRotation(f12 + ((float) Math.toDegrees(Math.atan2((f16 / 2.0f) + f13, (f15 / 2.0f) + f14))) + f2);
                    }
                }
                float f24 = fSin + 0.5f;
                int i7 = (int) f24;
                float f25 = fCos + 0.5f;
                int i8 = (int) f25;
                int i9 = (int) (f24 + f4);
                int i10 = (int) (f25 + f5);
                int i11 = i9 - i7;
                int i12 = i10 - i8;
                if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z3) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                }
                view.layout(i7, i8, i9, i10);
                this.d = false;
            }
            if (this.C != -1) {
                View viewFindViewById = this.D;
                if (viewFindViewById == null) {
                    viewFindViewById = ((View) view.getParent()).findViewById(this.C);
                    this.D = viewFindViewById;
                }
                if (viewFindViewById != null) {
                    float bottom = (this.D.getBottom() + viewFindViewById.getTop()) / f3;
                    float right = (this.D.getRight() + this.D.getLeft()) / f3;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view.setPivotX(left);
                        view.setPivotY(top);
                    }
                }
            }
            HashMap map3 = this.y;
            if (map3 != null) {
                for (cfk1 cfk1Var : map3.values()) {
                    if (cfk1Var instanceof afk1) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view.setRotation(((afk1) cfk1Var).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (nhk1Var != 0) {
                double[] dArr7 = this.q;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                nhk1 nhk1Var3 = nhk1Var;
                view.setRotation(nhk1Var3.b(fA, j, view, p321Var) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z = z2 | nhk1Var3.h;
            } else {
                z = z2;
            }
            int i13 = 1;
            while (true) {
                dxo1[] dxo1VarArr2 = this.j;
                if (i13 >= dxo1VarArr2.length) {
                    break;
                }
                dxo1 dxo1Var = dxo1VarArr2[i13];
                float[] fArr3 = this.t;
                dxo1Var.o(d, fArr3);
                gyo1.P((mhl) cnm0Var.N0.get(this.r[i13 - 1]), view, fArr3);
                i13++;
            }
            omm0 omm0Var = this.h;
            if (omm0Var.b == 0) {
                if (fA <= f2) {
                    view.setVisibility(omm0Var.c);
                } else {
                    int i14 = this.i.c;
                    if (fA >= 1065353216) {
                        view.setVisibility(i14);
                    } else if (i14 != omm0Var.c) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i15 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.A;
                    if (i15 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i15].g(view, fA);
                    i15++;
                }
            }
        } else {
            boolean z4 = zD;
            float f26 = cnm0Var.e;
            cnm0 cnm0Var2 = this.g;
            float fE = l1d.e(cnm0Var2.e, f26, fA, f26);
            float f27 = cnm0Var.f;
            float fE2 = l1d.e(cnm0Var2.f, f27, fA, f27);
            float f28 = cnm0Var.g;
            float f29 = cnm0Var2.g;
            float fE3 = l1d.e(f29, f28, fA, f28);
            float f30 = cnm0Var.h;
            float f31 = cnm0Var2.h;
            float f32 = fE + 0.5f;
            int i16 = (int) f32;
            float f33 = fE2 + 0.5f;
            int i17 = (int) f33;
            int i18 = (int) (f32 + fE3);
            int iE = (int) (f33 + l1d.e(f31, f30, fA, f30));
            int i19 = i18 - i16;
            int i20 = iE - i17;
            if (f29 != f28 || f31 != f30 || this.d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                this.d = false;
            }
            view.layout(i16, i17, i18, iE);
            z = z4;
        }
        HashMap map4 = this.z;
        if (map4 != null) {
            for (hdk1 hdk1Var : map4.values()) {
                if (hdk1Var instanceof fdk1) {
                    double[] dArr8 = this.q;
                    view.setRotation(((fdk1) hdk1Var).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    hdk1Var.d(view, fA);
                }
            }
        }
        return z;
    }

    public final void e(cnm0 cnm0Var) {
        View view = this.b;
        cnm0Var.d((int) view.getX(), (int) view.getY(), view.getWidth(), view.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:277:0x0817 A[PHI: r1 r11 r12
      0x0817: PHI (r1v67 java.lang.String) = (r1v64 java.lang.String), (r1v65 java.lang.String), (r1v66 java.lang.String), (r1v69 java.lang.String) binds: [B:276:0x0815, B:272:0x07e8, B:267:0x07b6, B:263:0x07a3] A[DONT_GENERATE, DONT_INLINE]
      0x0817: PHI (r11v29 java.lang.String) = (r11v26 java.lang.String), (r11v27 java.lang.String), (r11v28 java.lang.String), (r11v31 java.lang.String) binds: [B:276:0x0815, B:272:0x07e8, B:267:0x07b6, B:263:0x07a3] A[DONT_GENERATE, DONT_INLINE]
      0x0817: PHI (r12v25 java.lang.String) = (r12v22 java.lang.String), (r12v23 java.lang.String), (r12v24 java.lang.String), (r12v27 java.lang.String) binds: [B:276:0x0815, B:272:0x07e8, B:267:0x07b6, B:263:0x07a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:379:0x0bcf  */
    /* JADX WARN: Code duplicated, block: B:448:0x0cfb  */
    /* JADX WARN: Failed to find 'out' block for switch in B:430:0x0c7d. Please report as an issue. */
    public final void g(int i, long j, int i2) {
        cnm0 cnm0Var;
        ArrayList arrayList;
        omm0 omm0Var;
        HashSet hashSet;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashSet hashSet2;
        HashSet<String> hashSet3;
        Object obj;
        Object obj2;
        String str6;
        cnm0 cnm0Var2;
        cnm0 cnm0Var3;
        ArrayList arrayList2;
        Object obj3;
        String str7;
        int i3;
        String str8;
        mhl mhlVar;
        HashSet hashSet4;
        String str9;
        HashMap map;
        Iterator it;
        String str10;
        Object obj4;
        Object obj5;
        byte b;
        byte b2;
        phk1 lhk1Var;
        mhk1 mhk1Var;
        phk1 phk1Var;
        mhl mhlVar2;
        Integer num;
        HashSet hashSet5;
        String str11;
        String str12;
        String str13;
        String str14;
        HashSet hashSet6;
        String str15;
        ArrayList arrayList3;
        Object obj6;
        Iterator it2;
        String str16;
        HashSet hashSet7;
        Object obj7;
        cnm0 cnm0Var4;
        Object obj8;
        cnm0 cnm0Var5;
        Object obj9;
        byte b3;
        byte b4;
        byte b5;
        Object obj10;
        cfk1 yek1Var;
        mhl mhlVar3;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        float fMin;
        float fE;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap map2 = new HashMap();
        int i4 = this.B;
        cnm0 cnm0Var6 = this.f;
        if (i4 != -1) {
            cnm0Var6.t = i4;
        }
        omm0 omm0Var2 = this.h;
        float f = omm0Var2.e;
        omm0 omm0Var3 = this.i;
        if (omm0.b(f, omm0Var3.e)) {
            hashSet9.add("alpha");
        }
        String str22 = "elevation";
        if (omm0.b(omm0Var2.f, omm0Var3.f)) {
            hashSet9.add("elevation");
        }
        int i5 = omm0Var2.c;
        int i6 = omm0Var3.c;
        if (i5 != i6 && omm0Var2.b == 0 && (i5 == 0 || i6 == 0)) {
            hashSet9.add("alpha");
        }
        String str23 = "rotation";
        if (omm0.b(omm0Var2.g, omm0Var3.g)) {
            hashSet9.add("rotation");
        }
        String str24 = "transitionPathRotate";
        if (!Float.isNaN(omm0Var2.P0) || !Float.isNaN(omm0Var3.P0)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(omm0Var2.Q0) || !Float.isNaN(omm0Var3.Q0)) {
            hashSet9.add("progress");
        }
        if (omm0.b(omm0Var2.h, omm0Var3.h)) {
            hashSet9.add("rotationX");
        }
        if (omm0.b(omm0Var2.a, omm0Var3.a)) {
            hashSet9.add("rotationY");
        }
        Object obj11 = "rotationX";
        if (omm0.b(omm0Var2.X, omm0Var3.X)) {
            hashSet9.add("transformPivotX");
        }
        if (omm0.b(omm0Var2.Y, omm0Var3.Y)) {
            hashSet9.add("transformPivotY");
        }
        String str25 = "scaleX";
        if (omm0.b(omm0Var2.i, omm0Var3.i)) {
            hashSet9.add("scaleX");
        }
        Object obj12 = "rotationY";
        String str26 = "scaleY";
        if (omm0.b(omm0Var2.t, omm0Var3.t)) {
            hashSet9.add("scaleY");
        }
        Object obj13 = "progress";
        if (omm0.b(omm0Var2.Z, omm0Var3.Z)) {
            hashSet9.add("translationX");
        }
        Object obj14 = "translationX";
        String str27 = "translationY";
        if (omm0.b(omm0Var2.N0, omm0Var3.N0)) {
            hashSet9.add("translationY");
        }
        if (omm0.b(omm0Var2.O0, omm0Var3.O0)) {
            hashSet9.add("translationZ");
        }
        ArrayList<ooa0> arrayList4 = this.w;
        Iterator it3 = arrayList4.iterator();
        ArrayList arrayList5 = null;
        while (true) {
            boolean zHasNext = it3.hasNext();
            cnm0Var = this.g;
            Iterator it4 = it3;
            arrayList = this.u;
            omm0Var = omm0Var3;
            if (!zHasNext) {
                break;
            }
            ooa0 ooa0Var = (ooa0) it4.next();
            String str28 = str27;
            if (ooa0Var instanceof KeyPosition) {
                KeyPosition keyPosition = (KeyPosition) ooa0Var;
                cnm0 cnm0Var7 = new cnm0();
                str21 = str25;
                cnm0Var7.b = 0;
                cnm0Var7.i = Float.NaN;
                cnm0Var7.t = -1;
                cnm0Var7.X = -1;
                cnm0Var7.Y = Float.NaN;
                cnm0Var7.Z = null;
                cnm0Var7.N0 = new LinkedHashMap();
                cnm0Var7.O0 = 0;
                str17 = str26;
                cnm0Var7.P0 = new double[18];
                cnm0Var7.Q0 = new double[18];
                if (cnm0Var6.X != -1) {
                    float f2 = keyPosition.a / 100.0f;
                    cnm0Var7.c = f2;
                    cnm0Var7.b = keyPosition.i;
                    cnm0Var7.O0 = keyPosition.f2p;
                    float f3 = Float.isNaN(keyPosition.j) ? f2 : keyPosition.j;
                    str19 = str23;
                    float f4 = Float.isNaN(keyPosition.k) ? f2 : keyPosition.k;
                    str18 = str22;
                    float f5 = cnm0Var.g;
                    float f6 = cnm0Var6.g;
                    float f7 = f5 - f6;
                    float f8 = cnm0Var.h;
                    float f9 = cnm0Var6.h;
                    cnm0Var7.d = cnm0Var7.c;
                    cnm0Var7.g = (int) ((f7 * f3) + f6);
                    cnm0Var7.h = (int) (((f8 - f9) * f4) + f9);
                    int i7 = keyPosition.f2p;
                    str20 = str24;
                    float f10 = keyPosition.l;
                    if (i7 != 2) {
                        float f11 = Float.isNaN(f10) ? f2 : keyPosition.l;
                        float f12 = cnm0Var.e;
                        float f13 = cnm0Var6.e;
                        cnm0Var7.e = l1d.e(f12, f13, f11, f13);
                        if (!Float.isNaN(keyPosition.m)) {
                            f2 = keyPosition.m;
                        }
                        float f14 = cnm0Var.f;
                        float f15 = cnm0Var6.f;
                        cnm0Var7.f = l1d.e(f14, f15, f2, f15);
                    } else {
                        if (Float.isNaN(f10)) {
                            float f16 = cnm0Var.e;
                            float f17 = cnm0Var6.e;
                            fMin = l1d.e(f16, f17, f2, f17);
                        } else {
                            fMin = keyPosition.l * Math.min(f4, f3);
                        }
                        cnm0Var7.e = fMin;
                        if (Float.isNaN(keyPosition.m)) {
                            float f18 = cnm0Var.f;
                            float f19 = cnm0Var6.f;
                            fE = l1d.e(f18, f19, f2, f19);
                        } else {
                            fE = keyPosition.m;
                        }
                        cnm0Var7.f = fE;
                    }
                    cnm0Var7.X = cnm0Var6.X;
                    cnm0Var7.a = clv.d(keyPosition.g);
                    cnm0Var7.t = keyPosition.h;
                } else {
                    str18 = str22;
                    str19 = str23;
                    str20 = str24;
                    int i8 = keyPosition.f2p;
                    int i9 = keyPosition.a;
                    if (i8 == 1) {
                        float f20 = i9 / 100.0f;
                        cnm0Var7.c = f20;
                        cnm0Var7.b = keyPosition.i;
                        float f21 = Float.isNaN(keyPosition.j) ? f20 : keyPosition.j;
                        float f22 = Float.isNaN(keyPosition.k) ? f20 : keyPosition.k;
                        float f23 = cnm0Var.g - cnm0Var6.g;
                        float f24 = f20;
                        float f25 = cnm0Var.h - cnm0Var6.h;
                        cnm0Var7.d = cnm0Var7.c;
                        if (!Float.isNaN(keyPosition.l)) {
                            f24 = keyPosition.l;
                        }
                        float f26 = cnm0Var6.e;
                        float f27 = cnm0Var6.g;
                        float f28 = (f27 / 2.0f) + f26;
                        float f29 = cnm0Var6.f;
                        float f30 = cnm0Var6.h;
                        float f31 = (f30 / 2.0f) + f29;
                        float f32 = ((cnm0Var.g / 2.0f) + cnm0Var.e) - f28;
                        float f33 = ((cnm0Var.h / 2.0f) + cnm0Var.f) - f31;
                        float f34 = f32 * f24;
                        float f35 = f23 * f21;
                        float f36 = f35 / 2.0f;
                        cnm0Var7.e = (int) ((f26 + f34) - f36);
                        float f37 = f24 * f33;
                        float f38 = f25 * f22;
                        float f39 = f38 / 2.0f;
                        cnm0Var7.f = (int) ((f29 + f37) - f39);
                        cnm0Var7.g = (int) (f27 + f35);
                        cnm0Var7.h = (int) (f30 + f38);
                        float f40 = Float.isNaN(keyPosition.m) ? 0.0f : keyPosition.m;
                        cnm0Var7.O0 = 1;
                        float f41 = (int) ((cnm0Var6.e + f34) - f36);
                        float f42 = (int) ((cnm0Var6.f + f37) - f39);
                        cnm0Var7.e = f41 + ((-f33) * f40);
                        cnm0Var7.f = f42 + (f40 * f32);
                        cnm0Var7.X = cnm0Var7.X;
                        cnm0Var7.a = clv.d(keyPosition.g);
                        cnm0Var7.t = keyPosition.h;
                    } else if (i8 == 2) {
                        float f43 = i9 / 100.0f;
                        cnm0Var7.c = f43;
                        cnm0Var7.b = keyPosition.i;
                        float f44 = Float.isNaN(keyPosition.j) ? f43 : keyPosition.j;
                        float f45 = Float.isNaN(keyPosition.k) ? f43 : keyPosition.k;
                        float f46 = cnm0Var.g;
                        float f47 = cnm0Var6.g;
                        float f48 = f46 - f47;
                        float f49 = cnm0Var.h;
                        float f50 = cnm0Var6.h;
                        float f51 = f49 - f50;
                        cnm0Var7.d = cnm0Var7.c;
                        float f52 = cnm0Var6.e;
                        float f53 = (f47 / 2.0f) + f52;
                        float f54 = cnm0Var6.f;
                        float f55 = (f46 / 2.0f) + cnm0Var.e;
                        float f56 = ((f49 / 2.0f) + cnm0Var.f) - ((f50 / 2.0f) + f54);
                        float f57 = f48 * f44;
                        cnm0Var7.e = (int) ((((f55 - f53) * f43) + f52) - (f57 / 2.0f));
                        float f58 = f51 * f45;
                        cnm0Var7.f = (int) (((f56 * f43) + f54) - (f58 / 2.0f));
                        cnm0Var7.g = (int) (f47 + f57);
                        cnm0Var7.h = (int) (f50 + f58);
                        cnm0Var7.O0 = 2;
                        if (!Float.isNaN(keyPosition.l)) {
                            cnm0Var7.e = (int) (keyPosition.l * (i - ((int) cnm0Var7.g)));
                        }
                        if (!Float.isNaN(keyPosition.m)) {
                            cnm0Var7.f = (int) (keyPosition.m * (i2 - ((int) cnm0Var7.h)));
                        }
                        cnm0Var7.X = cnm0Var7.X;
                        cnm0Var7.a = clv.d(keyPosition.g);
                        cnm0Var7.t = keyPosition.h;
                    } else if (i8 != 3) {
                        float f59 = i9 / 100.0f;
                        cnm0Var7.c = f59;
                        cnm0Var7.b = keyPosition.i;
                        float f60 = Float.isNaN(keyPosition.j) ? f59 : keyPosition.j;
                        float f61 = Float.isNaN(keyPosition.k) ? f59 : keyPosition.k;
                        float f62 = cnm0Var.g;
                        float f63 = cnm0Var6.g;
                        float f64 = f62 - f63;
                        float f65 = f59;
                        float f66 = cnm0Var.h;
                        float f67 = cnm0Var6.h;
                        float f68 = f66 - f67;
                        cnm0Var7.d = cnm0Var7.c;
                        float f69 = cnm0Var6.e;
                        float f70 = (f63 / 2.0f) + f69;
                        float f71 = cnm0Var6.f;
                        float f72 = ((f62 / 2.0f) + cnm0Var.e) - f70;
                        float f73 = ((f66 / 2.0f) + cnm0Var.f) - ((f67 / 2.0f) + f71);
                        float f74 = f64 * f60;
                        float f75 = f74 / 2.0f;
                        cnm0Var7.e = (int) (((f72 * f65) + f69) - f75);
                        float f76 = f68 * f61;
                        float f77 = f76 / 2.0f;
                        cnm0Var7.f = (int) (((f73 * f65) + f71) - f77);
                        cnm0Var7.g = (int) (f63 + f74);
                        cnm0Var7.h = (int) (f67 + f76);
                        float f78 = Float.isNaN(keyPosition.l) ? f65 : keyPosition.l;
                        float f79 = Float.isNaN(keyPosition.o) ? 0.0f : keyPosition.o;
                        float f80 = f78;
                        if (!Float.isNaN(keyPosition.m)) {
                            f65 = keyPosition.m;
                        }
                        float f81 = Float.isNaN(keyPosition.n) ? 0.0f : keyPosition.n;
                        cnm0Var7.O0 = 0;
                        cnm0Var7.e = (int) (((f81 * f73) + ((f80 * f72) + cnm0Var6.e)) - f75);
                        cnm0Var7.f = (int) (((f73 * f65) + ((f72 * f79) + cnm0Var6.f)) - f77);
                        cnm0Var7.a = clv.d(keyPosition.g);
                        cnm0Var7.t = keyPosition.h;
                    } else {
                        float f82 = i9 / 100.0f;
                        cnm0Var7.c = f82;
                        cnm0Var7.b = keyPosition.i;
                        float f83 = Float.isNaN(keyPosition.j) ? f82 : keyPosition.j;
                        float f84 = Float.isNaN(keyPosition.k) ? f82 : keyPosition.k;
                        float f85 = cnm0Var.g;
                        float f86 = cnm0Var6.g;
                        float f87 = f85 - f86;
                        float f88 = f82;
                        float f89 = cnm0Var.h;
                        float f90 = cnm0Var6.h;
                        float f91 = f89 - f90;
                        cnm0Var7.d = cnm0Var7.c;
                        float f92 = cnm0Var6.e;
                        float f93 = (f86 / 2.0f) + f92;
                        float f94 = cnm0Var6.f;
                        float f95 = (f90 / 2.0f) + f94;
                        float f96 = (f85 / 2.0f) + cnm0Var.e;
                        float f97 = (f89 / 2.0f) + cnm0Var.f;
                        if (f93 > f96) {
                            f93 = f96;
                            f96 = f93;
                        }
                        if (f95 <= f97) {
                            f95 = f97;
                            f97 = f95;
                        }
                        float f98 = f96 - f93;
                        float f99 = f95 - f97;
                        float f100 = f87 * f83;
                        float f101 = f100 / 2.0f;
                        cnm0Var7.e = (int) (((f98 * f88) + f92) - f101);
                        float f102 = f91 * f84;
                        float f103 = f102 / 2.0f;
                        cnm0Var7.f = (int) (((f99 * f88) + f94) - f103);
                        cnm0Var7.g = (int) (f86 + f100);
                        cnm0Var7.h = (int) (f90 + f102);
                        float f104 = Float.isNaN(keyPosition.l) ? f88 : keyPosition.l;
                        float f105 = Float.isNaN(keyPosition.o) ? 0.0f : keyPosition.o;
                        if (!Float.isNaN(keyPosition.m)) {
                            f88 = keyPosition.m;
                        }
                        float f106 = Float.isNaN(keyPosition.n) ? 0.0f : keyPosition.n;
                        cnm0Var7.O0 = 0;
                        cnm0Var7.e = (int) (((f106 * f99) + ((f104 * f98) + cnm0Var6.e)) - f101);
                        cnm0Var7.f = (int) (((f99 * f88) + ((f98 * f105) + cnm0Var6.f)) - f103);
                        cnm0Var7.a = clv.d(keyPosition.g);
                        cnm0Var7.t = keyPosition.h;
                    }
                }
                arrayList.add((-Collections.binarySearch(arrayList, cnm0Var7)) - 1, cnm0Var7);
                int i10 = keyPosition.f;
                if (i10 != -1) {
                    this.e = i10;
                }
            } else {
                str17 = str26;
                str18 = str22;
                str19 = str23;
                str20 = str24;
                str21 = str25;
                if (ooa0Var instanceof KeyCycle) {
                    ooa0Var.d(hashSet10);
                } else {
                    if (ooa0Var instanceof KeyTimeCycle) {
                        ooa0Var.d(hashSet8);
                    } else if (ooa0Var instanceof KeyTrigger) {
                        ArrayList arrayList6 = arrayList5;
                        ArrayList arrayList7 = arrayList6 == null ? new ArrayList() : arrayList6;
                        arrayList7.add((KeyTrigger) ooa0Var);
                        arrayList5 = arrayList7;
                    } else {
                        ooa0Var.f(map2);
                        ooa0Var.d(hashSet9);
                        arrayList5 = arrayList5;
                    }
                    str27 = str28;
                    str26 = str17;
                    it3 = it4;
                    omm0Var3 = omm0Var;
                    str25 = str21;
                    str23 = str19;
                    str22 = str18;
                    str24 = str20;
                }
            }
            arrayList5 = arrayList5;
            str27 = str28;
            str26 = str17;
            it3 = it4;
            omm0Var3 = omm0Var;
            str25 = str21;
            str23 = str19;
            str22 = str18;
            str24 = str20;
        }
        String str29 = str26;
        String str30 = str22;
        String str31 = str23;
        String str32 = str24;
        String str33 = str27;
        String str34 = str25;
        ArrayList arrayList8 = arrayList5;
        if (arrayList8 != null) {
            this.A = (KeyTrigger[]) arrayList8.toArray(new KeyTrigger[0]);
        }
        String str35 = "CUSTOM,";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            str = str33;
            str2 = str29;
            str3 = str31;
            str4 = str30;
            str5 = str32;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            obj = obj12;
            obj2 = obj14;
            str6 = str34;
            cnm0Var2 = cnm0Var;
            cnm0Var3 = cnm0Var6;
            arrayList2 = arrayList;
            obj3 = obj13;
        } else {
            this.y = new HashMap();
            Iterator it5 = hashSet9.iterator();
            while (it5.hasNext()) {
                String str36 = (String) it5.next();
                if (!str36.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    switch (str36.hashCode()) {
                        case -1249320806:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            cnm0Var4 = cnm0Var6;
                            obj8 = obj12;
                            cnm0Var5 = cnm0Var;
                            obj9 = obj11;
                            b3 = str36.equals(obj9) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            cnm0Var4 = cnm0Var6;
                            obj8 = obj12;
                            if (str36.equals(obj8)) {
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 1;
                            } else {
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -1225497657:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            if (str36.equals(obj7)) {
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 2;
                            } else {
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -1225497656:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            if (str36.equals(str16)) {
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 3;
                            } else {
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -1225497655:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            if (str36.equals("translationZ")) {
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 4;
                            } else {
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -1001078227:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            if (str36.equals(obj6)) {
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 5;
                            } else {
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -908189618:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            if (str36.equals(str15)) {
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 6;
                            } else {
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -908189617:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals(str11)) {
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 7;
                            } else {
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -797520672:
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals("waveVariesBy")) {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 8;
                            } else {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -760884510:
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals("transformPivotX")) {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 9;
                            } else {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case -760884509:
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals("transformPivotY")) {
                                b4 = 10;
                                String str37 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = b4;
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str37;
                            }
                            str11 = str29;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            cnm0Var4 = cnm0Var6;
                            obj8 = obj12;
                            cnm0Var5 = cnm0Var;
                            obj9 = obj11;
                            break;
                        case -40300674:
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals(str12)) {
                                b4 = 11;
                                String str38 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = b4;
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str38;
                            }
                            str11 = str29;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            cnm0Var4 = cnm0Var6;
                            obj8 = obj12;
                            cnm0Var5 = cnm0Var;
                            obj9 = obj11;
                            break;
                        case -4379043:
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals(str13)) {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 12;
                                str12 = str31;
                            } else {
                                str11 = str29;
                                str12 = str31;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case 37232917:
                            str14 = str32;
                            if (str36.equals(str14)) {
                                str11 = str29;
                                str12 = str31;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = 13;
                                str13 = str30;
                            } else {
                                str11 = str29;
                                str12 = str31;
                                str13 = str30;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                            }
                            break;
                        case 92909918:
                            if (str36.equals("alpha")) {
                                b5 = 14;
                                str11 = str29;
                                str12 = str31;
                                str13 = str30;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = b5;
                                str14 = str32;
                            }
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            cnm0Var4 = cnm0Var6;
                            obj8 = obj12;
                            cnm0Var5 = cnm0Var;
                            obj9 = obj11;
                            break;
                        case 156108012:
                            if (str36.equals("waveOffset")) {
                                b5 = 15;
                                str11 = str29;
                                str12 = str31;
                                str13 = str30;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                cnm0Var4 = cnm0Var6;
                                obj8 = obj12;
                                cnm0Var5 = cnm0Var;
                                obj9 = obj11;
                                b3 = b5;
                                str14 = str32;
                            }
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            cnm0Var4 = cnm0Var6;
                            obj8 = obj12;
                            cnm0Var5 = cnm0Var;
                            obj9 = obj11;
                            break;
                        default:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            cnm0Var4 = cnm0Var6;
                            obj8 = obj12;
                            cnm0Var5 = cnm0Var;
                            obj9 = obj11;
                            break;
                    }
                    switch (b3) {
                        case 0:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 5);
                            break;
                        case 1:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 6);
                            break;
                        case 2:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 9);
                            break;
                        case 3:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 10);
                            break;
                        case 4:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 11);
                            break;
                        case 5:
                            obj11 = obj9;
                            obj10 = obj8;
                            bfk1 bfk1Var = new bfk1();
                            bfk1Var.f = false;
                            yek1Var = bfk1Var;
                            break;
                        case 6:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 7);
                            break;
                        case 7:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 8);
                            break;
                        case 8:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 0);
                            break;
                        case 9:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 2);
                            break;
                        case 10:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 3);
                            break;
                        case 11:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 4);
                            break;
                        case 12:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 1);
                            break;
                        case 13:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new afk1();
                            break;
                        case 14:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 0);
                            break;
                        case 15:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = new yek1((byte) 0);
                            break;
                        default:
                            obj11 = obj9;
                            obj10 = obj8;
                            yek1Var = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str39 = str36.split(",")[1];
                    for (ooa0 ooa0Var2 : arrayList4) {
                        HashSet hashSet11 = hashSet8;
                        HashMap map3 = ooa0Var2.e;
                        if (map3 != null && (mhlVar3 = (mhl) map3.get(str39)) != null) {
                            sparseArray.append(ooa0Var2.a, mhlVar3);
                        }
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    zek1 zek1Var = new zek1();
                    String str40 = str36.split(",")[1];
                    zek1Var.f = sparseArray;
                    str11 = str29;
                    str12 = str31;
                    str13 = str30;
                    hashSet6 = hashSet10;
                    obj10 = obj12;
                    str15 = str34;
                    cnm0Var5 = cnm0Var;
                    arrayList3 = arrayList;
                    obj6 = obj13;
                    yek1Var = zek1Var;
                    it2 = it5;
                    str16 = str33;
                    str14 = str32;
                    hashSet7 = hashSet9;
                    obj7 = obj14;
                    cnm0Var4 = cnm0Var6;
                }
                if (yek1Var != null) {
                    yek1Var.e = str36;
                    this.y.put(str36, yek1Var);
                }
                str32 = str14;
                str30 = str13;
                cnm0Var = cnm0Var5;
                cnm0Var6 = cnm0Var4;
                obj12 = obj10;
                hashSet8 = hashSet5;
                obj14 = obj7;
                str31 = str12;
                hashSet9 = hashSet7;
                str33 = str16;
                it5 = it2;
                obj13 = obj6;
                arrayList = arrayList3;
                str34 = str15;
                hashSet10 = hashSet6;
                str29 = str11;
            }
            hashSet = hashSet8;
            str = str33;
            str2 = str29;
            str3 = str31;
            str4 = str30;
            str5 = str32;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            obj = obj12;
            obj2 = obj14;
            str6 = str34;
            cnm0Var2 = cnm0Var;
            cnm0Var3 = cnm0Var6;
            arrayList2 = arrayList;
            obj3 = obj13;
            for (ooa0 ooa0Var3 : arrayList4) {
                if (ooa0Var3 instanceof KeyAttributes) {
                    ooa0Var3.a(this.y);
                }
            }
            omm0Var2.a(this.y, 0);
            omm0Var.a(this.y, 100);
            Iterator it6 = this.y.keySet().iterator();
            while (it6.hasNext()) {
                String str41 = (String) it6.next();
                int iIntValue = (!map2.containsKey(str41) || (num = (Integer) map2.get(str41)) == null) ? 0 : num.intValue();
                Iterator it7 = it6;
                cfk1 cfk1Var = (cfk1) this.y.get(str41);
                if (cfk1Var != null) {
                    cfk1Var.d(iIntValue);
                }
                it6 = it7;
            }
        }
        if (hashSet.isEmpty()) {
            str7 = "CUSTOM,";
        } else {
            if (this.x == null) {
                this.x = new HashMap();
            }
            Iterator it8 = hashSet.iterator();
            while (it8.hasNext()) {
                String str42 = (String) it8.next();
                if (!this.x.containsKey(str42)) {
                    if (str42.startsWith(str35)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it8;
                        String str43 = str42.split(",")[1];
                        for (ooa0 ooa0Var4 : arrayList4) {
                            String str44 = str35;
                            HashMap map4 = map2;
                            HashMap map5 = ooa0Var4.e;
                            if (map5 != null && (mhlVar2 = (mhl) map5.get(str43)) != null) {
                                sparseArray2.append(ooa0Var4.a, mhlVar2);
                            }
                            map2 = map4;
                            str35 = str44;
                        }
                        map = map2;
                        str10 = str35;
                        mhk1 mhk1Var2 = new mhk1();
                        mhk1Var2.m = new SparseArray();
                        mhk1Var2.k = str42.split(",")[1];
                        mhk1Var2.l = sparseArray2;
                        mhk1Var = mhk1Var2;
                        obj4 = obj11;
                        obj5 = obj;
                    } else {
                        map = map2;
                        it = it8;
                        str10 = str35;
                        switch (str42.hashCode()) {
                            case -1249320806:
                                obj4 = obj11;
                                obj5 = obj;
                                b = str42.equals(obj4) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj5 = obj;
                                if (str42.equals(obj5)) {
                                    obj4 = obj11;
                                    b = 1;
                                } else {
                                    obj4 = obj11;
                                }
                                break;
                            case -1225497657:
                                if (str42.equals(obj2)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 2;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -1225497656:
                                if (str42.equals(str)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 3;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -1225497655:
                                if (str42.equals("translationZ")) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 4;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -1001078227:
                                if (str42.equals(obj3)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 5;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -908189618:
                                if (str42.equals(str6)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 6;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -908189617:
                                if (str42.equals(str2)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 7;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -40300674:
                                if (str42.equals(str3)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 8;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -4379043:
                                if (str42.equals(str4)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 9;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case 37232917:
                                if (str42.equals(str5)) {
                                    b2 = 10;
                                    b = b2;
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                obj4 = obj11;
                                obj5 = obj;
                                break;
                            case 92909918:
                                if (str42.equals("alpha")) {
                                    b2 = 11;
                                    b = b2;
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                obj4 = obj11;
                                obj5 = obj;
                                break;
                            default:
                                obj4 = obj11;
                                obj5 = obj;
                                break;
                        }
                        switch (b) {
                            case 0:
                                lhk1Var = new lhk1((byte) 3);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 1:
                                lhk1Var = new lhk1((byte) 4);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 2:
                                lhk1Var = new lhk1((byte) 7);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 3:
                                lhk1Var = new lhk1((byte) 8);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 4:
                                lhk1Var = new lhk1((byte) 9);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 5:
                                ohk1 ohk1Var = new ohk1();
                                ohk1Var.k = false;
                                lhk1Var = ohk1Var;
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 6:
                                lhk1Var = new lhk1((byte) 5);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 7:
                                lhk1Var = new lhk1((byte) 6);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 8:
                                lhk1Var = new lhk1((byte) 2);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 9:
                                lhk1Var = new lhk1((byte) 1);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 10:
                                lhk1Var = new nhk1();
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            case 11:
                                lhk1Var = new lhk1((byte) 0);
                                str5 = str5;
                                obj2 = obj2;
                                lhk1Var.i = j;
                                phk1Var = lhk1Var;
                                break;
                            default:
                                mhk1Var = null;
                                break;
                        }
                        if (phk1Var != null) {
                            phk1Var.f = str42;
                            this.x.put(str42, phk1Var);
                        }
                        obj = obj5;
                        obj11 = obj4;
                        obj2 = obj2;
                        it8 = it;
                        map2 = map;
                        str35 = str10;
                        str5 = str5;
                    }
                    phk1Var = mhk1Var;
                    if (phk1Var != null) {
                        phk1Var.f = str42;
                        this.x.put(str42, phk1Var);
                    }
                    obj = obj5;
                    obj11 = obj4;
                    obj2 = obj2;
                    it8 = it;
                    map2 = map;
                    str35 = str10;
                    str5 = str5;
                }
            }
            HashMap map6 = map2;
            str7 = str35;
            for (ooa0 ooa0Var5 : arrayList4) {
                if (ooa0Var5 instanceof KeyTimeCycle) {
                    ((KeyTimeCycle) ooa0Var5).g(this.x);
                }
            }
            for (String str45 : this.x.keySet()) {
                HashMap map7 = map6;
                ((phk1) this.x.get(str45)).e(map7.containsKey(str45) ? ((Integer) map7.get(str45)).intValue() : 0);
                map6 = map7;
            }
        }
        int size = arrayList2.size();
        int i11 = size + 2;
        cnm0[] cnm0VarArr = new cnm0[i11];
        cnm0VarArr[0] = cnm0Var3;
        cnm0VarArr[size + 1] = cnm0Var2;
        if (arrayList2.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        Iterator it9 = arrayList2.iterator();
        int i12 = 1;
        while (it9.hasNext()) {
            cnm0VarArr[i12] = (cnm0) it9.next();
            i12++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str46 : cnm0Var2.N0.keySet()) {
            cnm0 cnm0Var8 = cnm0Var3;
            if (cnm0Var8.N0.containsKey(str46)) {
                str9 = str7;
                hashSet4 = hashSet2;
                if (!hashSet4.contains(str9 + str46)) {
                    hashSet12.add(str46);
                }
            } else {
                hashSet4 = hashSet2;
                str9 = str7;
            }
            cnm0Var3 = cnm0Var8;
            str7 = str9;
            hashSet2 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.r = strArr;
        this.s = new int[strArr.length];
        int i13 = 0;
        while (true) {
            String[] strArr2 = this.r;
            if (i13 < strArr2.length) {
                String str47 = strArr2[i13];
                this.s[i13] = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (cnm0VarArr[i14].N0.containsKey(str47) && (mhlVar = (mhl) cnm0VarArr[i14].N0.get(str47)) != null) {
                        int[] iArr = this.s;
                        iArr[i13] = mhlVar.d() + iArr[i13];
                        break;
                    }
                }
                i13++;
            } else {
                boolean z = cnm0VarArr[0].t != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i15 = 1; i15 < i11; i15++) {
                    cnm0 cnm0Var9 = cnm0VarArr[i15];
                    cnm0 cnm0Var10 = cnm0VarArr[i15 - 1];
                    boolean zB = cnm0.b(cnm0Var9.e, cnm0Var10.e);
                    boolean zB2 = cnm0.b(cnm0Var9.f, cnm0Var10.f);
                    zArr[0] = zArr[0] | cnm0.b(cnm0Var9.d, cnm0Var10.d);
                    boolean z2 = zB | zB2 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | cnm0.b(cnm0Var9.g, cnm0Var10.g);
                    zArr[4] = cnm0.b(cnm0Var9.h, cnm0Var10.h) | zArr[4];
                }
                int i16 = 0;
                for (int i17 = 1; i17 < length; i17++) {
                    if (zArr[i17]) {
                        i16++;
                    }
                }
                this.o = new int[i16];
                int iMax = Math.max(2, i16);
                this.f5p = new double[iMax];
                this.q = new double[iMax];
                int i18 = 0;
                for (int i19 = 1; i19 < length; i19++) {
                    if (zArr[i19]) {
                        this.o[i18] = i19;
                        i18++;
                    }
                }
                int[] iArr2 = {i11, this.o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i11];
                int i20 = 0;
                while (i20 < i11) {
                    cnm0 cnm0Var11 = cnm0VarArr[i20];
                    double[] dArr3 = dArr[i20];
                    int[] iArr3 = this.o;
                    cnm0[] cnm0VarArr2 = cnm0VarArr;
                    int i21 = 6;
                    float[] fArr = {cnm0Var11.d, cnm0Var11.e, cnm0Var11.f, cnm0Var11.g, cnm0Var11.h, cnm0Var11.i};
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < iArr3.length) {
                        int i24 = iArr3[i22];
                        if (i24 < i21) {
                            dArr3[i23] = fArr[i24];
                            i23++;
                        }
                        i22++;
                        i21 = 6;
                    }
                    dArr2[i20] = cnm0VarArr2[i20].c;
                    i20++;
                    cnm0VarArr = cnm0VarArr2;
                }
                cnm0[] cnm0VarArr3 = cnm0VarArr;
                int i25 = 0;
                while (true) {
                    int[] iArr4 = this.o;
                    if (i25 < iArr4.length) {
                        if (iArr4[i25] < 6) {
                            String strN = l1d.n(cnm0.R0[this.o[i25]], " [", new StringBuilder());
                            for (int i26 = 0; i26 < i11; i26++) {
                                strN = strN + dArr[i26][i25];
                            }
                        }
                        i25++;
                    } else {
                        this.j = new dxo1[this.r.length + 1];
                        int i27 = 0;
                        while (true) {
                            String[] strArr3 = this.r;
                            if (i27 >= strArr3.length) {
                                this.j[0] = dxo1.l(this.e, dArr2, dArr);
                                if (cnm0VarArr3[0].t != -1) {
                                    int[] iArr5 = new int[i11];
                                    double[] dArr4 = new double[i11];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i11, 2);
                                    for (int i28 = 0; i28 < i11; i28++) {
                                        cnm0 cnm0Var12 = cnm0VarArr3[i28];
                                        iArr5[i28] = cnm0Var12.t;
                                        dArr4[i28] = cnm0Var12.c;
                                        double[] dArr6 = dArr5[i28];
                                        dArr6[0] = cnm0Var12.e;
                                        dArr6[1] = cnm0Var12.f;
                                    }
                                    this.k = new o26(iArr5, dArr4, dArr5);
                                }
                                this.z = new HashMap();
                                float fC = Float.NaN;
                                for (String str48 : hashSet3) {
                                    hdk1 hdk1VarB = hdk1.b(str48);
                                    if (hdk1VarB != null) {
                                        if (hdk1VarB.e == 1 && Float.isNaN(fC)) {
                                            fC = c();
                                        }
                                        hdk1VarB.b = str48;
                                        this.z.put(str48, hdk1VarB);
                                    }
                                }
                                for (ooa0 ooa0Var6 : arrayList4) {
                                    if (ooa0Var6 instanceof KeyCycle) {
                                        ((KeyCycle) ooa0Var6).g(this.z);
                                    }
                                }
                                Iterator it10 = this.z.values().iterator();
                                while (it10.hasNext()) {
                                    ((hdk1) it10.next()).e();
                                }
                                return;
                            }
                            String str49 = strArr3[i27];
                            double[][] dArr7 = null;
                            double[] dArr8 = null;
                            int i29 = 0;
                            int i30 = 0;
                            while (i29 < i11) {
                                if (cnm0VarArr3[i29].N0.containsKey(str49)) {
                                    if (dArr7 == null) {
                                        dArr8 = new double[i11];
                                        mhl mhlVar4 = (mhl) cnm0VarArr3[i29].N0.get(str49);
                                        dArr7 = (double[][]) Array.newInstance((Class<?>) cls, i11, mhlVar4 == null ? 0 : mhlVar4.d());
                                    }
                                    cnm0 cnm0Var13 = cnm0VarArr3[i29];
                                    dArr8[i30] = cnm0Var13.c;
                                    double[] dArr9 = dArr7[i30];
                                    mhl mhlVar5 = (mhl) cnm0Var13.N0.get(str49);
                                    if (mhlVar5 != null) {
                                        if (mhlVar5.d() == 1) {
                                            dArr9[0] = mhlVar5.b();
                                        } else {
                                            int iD = mhlVar5.d();
                                            float[] fArr2 = new float[iD];
                                            mhlVar5.c(fArr2);
                                            int i31 = 0;
                                            int i32 = 0;
                                            while (i31 < iD) {
                                                dArr9[i32] = fArr2[i31];
                                                i31++;
                                                str49 = str49;
                                                dArr7 = dArr7;
                                                i32++;
                                                i27 = i27;
                                            }
                                        }
                                    }
                                    i3 = i27;
                                    str8 = str49;
                                    i30++;
                                    dArr7 = dArr7;
                                } else {
                                    i3 = i27;
                                    str8 = str49;
                                }
                                i29++;
                                str49 = str8;
                                i27 = i3;
                            }
                            int i33 = i27 + 1;
                            this.j[i33] = dxo1.l(this.e, Arrays.copyOf(dArr8, i30), (double[][]) Arrays.copyOf(dArr7, i30));
                            i27 = i33;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        cnm0 cnm0Var = this.f;
        sb.append(cnm0Var.e);
        sb.append(" y: ");
        sb.append(cnm0Var.f);
        sb.append(" end: x: ");
        cnm0 cnm0Var2 = this.g;
        sb.append(cnm0Var2.e);
        sb.append(" y: ");
        sb.append(cnm0Var2.f);
        return sb.toString();
    }
}
