package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vap1 implements Function, BiPredicate, np80, BiFunction, gvt0, s2i1, Predicate, Init, k1q0, Function4, av30 {
    public final /* synthetic */ byte a;
    public static final vap1 b = new vap1(1);
    public static final vap1 c = new vap1(2);
    public static final vap1 d = new vap1(3);
    public static final vap1 e = new vap1(4);
    public static final vap1 f = new vap1(5);
    public static final vap1 g = new vap1(6);
    public static final vap1 h = new vap1(7);
    public static final vap1 i = new vap1(8);
    public static final vap1 t = new vap1(9);
    public static final vap1 X = new vap1(10);
    public static final vap1 Y = new vap1(11);
    public static final vap1 Z = new vap1(12);
    public static final vap1 N0 = new vap1(13);
    public static final vap1 O0 = new vap1(14);
    public static final vap1 P0 = new vap1(15);
    public static final vap1 Q0 = new vap1(17);
    public static final vap1 R0 = new vap1(18);
    public static final vap1 S0 = new vap1(19);
    public static final vap1 T0 = new vap1(20);
    public static final vap1 U0 = new vap1(21);
    public static final vap1 V0 = new vap1(22);
    public static final vap1 W0 = new vap1(23);
    public static final vap1 X0 = new vap1(24);
    public static final vap1 Y0 = new vap1(26);
    public static final vap1 Z0 = new vap1(27);
    public static final vap1 a1 = new vap1(28);
    public static final vap1 b1 = new vap1(29);

    public /* synthetic */ vap1(byte b2) {
        this.a = b2;
    }

    public static LayerDrawable a(Context context, int i2) {
        Drawable drawable = context.getDrawable(i2);
        Drawable drawable2 = context.getDrawable(2131232428);
        drawable2.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130968791});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawableMutate = drawable2.mutate();
        drawableMutate.setTintList(colorStateList);
        return new LayerDrawable(new Drawable[]{drawable, new x10(new x10(drawableMutate, (byte) 3), 0.375f)});
    }

    public static a1i b(vu30 vu30Var) {
        return new a1i(vu30Var, gsh.Y);
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objInvoke;
        atq0 atq0Var = (atq0) obj;
        m3n m3nVar = new m3n((n6v0) obj2, (Map) obj3, (n131) obj4, (byte) 9);
        if (atq0Var instanceof zsq0) {
            objInvoke = m3nVar.invoke(atq0Var);
        } else {
            if (!(atq0Var instanceof xsq0)) {
                eg.o();
                return null;
            }
            objInvoke = (xsq0) atq0Var;
        }
        return (atq0) objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:207:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[LOOP:3: B:145:0x03ce->B:208:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v11 java.lang.Object, still in use, count: 2, list:
          (r3v11 java.lang.Object) from 0x03c6: PHI (r3 I:??) = (r3v1 java.lang.Object), (r3v11 java.lang.Object) binds: [B:141:0x03c5, B:204:0x03c6] A[DONT_GENERATE, DONT_INLINE]
          (r3v11 java.lang.Object) from 0x03be: CHECK_CAST (p.a5u0) (r3v11 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vap1.apply(java.lang.Object):java.lang.Object");
    }

    public boolean c(m0u0 m0u0Var) {
        return u890.j(m0u0Var.d(), "byom");
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 14:
                return First.b(v1g.a((v1g) obj, (String) null, pe11.b, false, false, 159));
            default:
                return First.c((a5y) obj, Collections.singleton(a4y.a));
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new rab(xkg0Var, str2, str);
    }

    public boolean test(Object obj, Object obj2) {
        return u890.j(((ContextTrack) obj).uri(), ((ContextTrack) obj2).uri());
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        view.setPadding(view.getPaddingLeft(), nk80VarI.b, view.getPaddingRight(), nk80VarI.d);
        return hsl1Var;
    }

    public boolean test(Object obj) {
        return ((Throwable) obj) instanceof NullTransportException;
    }

    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && !((Boolean) obj2).booleanValue());
    }
}
